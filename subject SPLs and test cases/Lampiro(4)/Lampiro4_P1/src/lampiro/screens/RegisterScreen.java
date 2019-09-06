/* Copyright (c) 2008 Bluendo S.r.L.
 * See about.html for details about license.
 *
 * $Id: RegisterScreen.java 1598 2009-06-19 12:59:47Z luca $
 */

package lampiro.screens;

import it.yup.ui.UIButton;
import it.yup.ui.UICanvas;
import it.yup.ui.UICheckbox;
import it.yup.ui.UICombobox;
import it.yup.ui.UIConfig;
import it.yup.ui.UIGauge;
import it.yup.ui.UIHLayout;
import it.yup.ui.UIItem;
import it.yup.ui.UILabel;
import it.yup.ui.UILayout;
import it.yup.ui.UIMenu;
import it.yup.ui.UIScreen;
import it.yup.ui.UISeparator;
import it.yup.ui.UITextField;
import it.yup.ui.UIUtils;
import it.yup.util.Logger;
import it.yup.util.ResourceIDs;
import it.yup.util.ResourceManager;
import it.yup.util.Utils;
import it.yup.xml.Element;
import it.yup.xmlstream.BasicXmlStream;
import it.yup.xmlstream.EventQuery;
import it.yup.xmlstream.EventQueryRegistration;
import it.yup.xmlstream.StreamEventListener;

// #ifdef BLUENDO_REG



// #endif

import it.yup.xmpp.Config;
import it.yup.xmpp.XMPPClient;

import java.io.IOException;
import java.io.InputStream;

import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Gauge;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;

import lampiro.LampiroMidlet;

public class RegisterScreen extends UIScreen implements StreamEventListener {

	private UILabel logoLabel;

	private UIHLayout logoLayout;

	private static ResourceManager rm = ResourceManager.getManager("common",
			"en");

	/* 
	 * The login info label
	 */
	private UILabel ul = new UILabel(rm.getString(ResourceIDs.STR_LOGGING_IN));

	private UILabel tf_jid_label = new UILabel(rm
			.getString(ResourceIDs.STR_JABBER_ID)
			+ " (?)");

	private UILabel key_configuration = new UILabel(rm
			.getString(ResourceIDs.STR_KEY_CONFIGURATION));

	private UIHLayout confLayout = new UIHLayout(2);

	private UITextField tf_jid_name = new UITextField("", null, 128,
			TextField.ANY | TextField.NON_PREDICTIVE);

	private UITextField tf_pwd = new UITextField(rm
			.getString(ResourceIDs.STR_PASSWORD), null, 32, TextField.ANY
			| TextField.PASSWORD);

	private UITextField tf_pwd_confirm = new UITextField(rm
			.getString(ResourceIDs.STR_CONFIRM)
			+ " " + rm.getString(ResourceIDs.STR_PASSWORD).toLowerCase(), null,
			32, TextField.ANY | TextField.PASSWORD);

	private UIButton but_cancel = new UIButton(rm
			.getString(ResourceIDs.STR_STOP_LOGIN));

	private UITextField tf_email = new UITextField(rm
			.getString(ResourceIDs.STR_EMAIL_ADDRESS), null, 128,
			TextField.EMAILADDR);

	private UITextField tf_server = new UITextField(rm
			.getString(ResourceIDs.STR_SERVER_NAME), null, 50, TextField.ANY
			| TextField.NON_PREDICTIVE);

	private UICheckbox grp_new_account = new UICheckbox(rm
			.getString(ResourceIDs.STR_NEW_USER));

	private UICheckbox grp_advanced = new UICheckbox(rm
			.getString(ResourceIDs.STR_ADVANCED_OPTIONS));

	private UICheckbox reset_config = new UICheckbox(rm
			.getString(ResourceIDs.STR_RESET_CONFIG));

	private UICheckbox reset_all_data = new UICheckbox(rm
			.getString(ResourceIDs.STR_RESET_DATA));

	private UITextField resource = null;

	private UILabel loginLabel;

	private UIMenu loginMenu;

	//private UIMenu scaryGmail;

	private UIMenu wrongPwd;

	private UICombobox grp_server = new UICombobox("Server type", false);

	/** Progress bar during login */
	private UIGauge progress_gauge = new UIGauge(rm
			.getString(ResourceIDs.STR_WAIT), false, Gauge.INDEFINITE,
			Gauge.CONTINUOUS_RUNNING);

	private UIButton btn_login = new UIButton(rm
			.getString(ResourceIDs.STR_LOGIN));

	private UIHLayout logLayout;

	private UILabel cmd_exit = new UILabel(rm.getString(ResourceIDs.STR_EXIT)
			.toUpperCase());

	private UILabel cmd_state = new UILabel(rm.getString(
			ResourceIDs.STR_CHANGE_STATUS).toUpperCase());

	private UITextField last_status = null;

	private UIButton buttonYes;
	private UIButton buttonNo;
	private UIHLayout buttonLayout;
	private UITextField wizardText;
	private UITextField wizardTextGateways;

	private UIMenu instructionsSubMenu;

	// #ifdef BLUENDO_REG

	

	// #endif 

	/*
	 * The subMenu deputed to open the status screen
	 */
	private UIMenu setStatus = new UIMenu("");

	// #mdebug
		private UIButton cmd_debug = new UIButton("debug");
	// #enddebug

	/** true if we must register a new account */
	private boolean register = false;

	private EventQueryRegistration reg;

	private Config cfg = Config.getInstance();

	/** local copy of the jid server (for detecting changes) */
	private String jid_server = "";

	private UITextField hint = new UITextField(rm
			.getString(ResourceIDs.STR_NOTE), rm
			.getString(ResourceIDs.STR_LOGIN_HINT), 5000, TextField.UNEDITABLE);

	private static RegisterScreen _registerScreen = null;

	private UILabel instructionLabel = new UILabel(rm.getString(
			ResourceIDs.STR_INSTRUCTIONS).toUpperCase());

	private static boolean wizardShown = false;

	private String exUsername = "<username>";
	private String exServer = "<example.org>";

	public boolean keyPressed(int key) {
		// trick to remove the "exUsername" in the username textField
		int ka = UICanvas.getInstance().getGameAction(key);
		int selIndex = this.getSelectedIndex();
		UIItem selItem = (UIItem) (selIndex >= 0 ? this.getItemList()
				.elementAt(selIndex) : null);
		if (ka == UICanvas.FIRE && selItem == this.tf_jid_name) {
			if (tf_jid_name.getText().indexOf(exUsername) == 0) {
				String tfText = tf_jid_name.getText();
				tf_jid_name.setText(tfText.substring(exUsername.length(),
						tfText.length()));
			}
			if (tf_jid_name.getText().indexOf(exServer) > 0) {
				String tfText = tf_jid_name.getText();
				tf_jid_name.setText(tfText.substring(0, tfText
						.indexOf(exServer)));
			}
		}
		return super.keyPressed(key);
	}

	private RegisterScreen() {
		resource = new UITextField(rm.getString(ResourceIDs.STR_RESOURCE), cfg
				.getProperty(Config.YUP_RESOURCE, "Lampiro"), 50, TextField.ANY);
		instructionsSubMenu = UIUtils.easyMenu("", 20, 20, UICanvas
				.getInstance().getWidth(), instructionLabel);
		tf_jid_label.setSubmenu(instructionsSubMenu);
		Font xFont = UIConfig.font_body;
		Font lFont = Font.getFont(xFont.getFace(), Font.STYLE_BOLD, xFont
				.getSize());
		tf_jid_label.setFont(lFont);
		tf_jid_label.setFocusable(true);

		Font confFont = Font.getFont(xFont.getFace(), Font.STYLE_BOLD
				| Font.STYLE_ITALIC | Font.STYLE_UNDERLINED, Font.SIZE_SMALL);
		key_configuration.setFont(confFont);
		key_configuration.setAnchorPoint(Graphics.RIGHT);
		key_configuration.setFocusable(true);
		int confWidth = confFont.stringWidth(rm
				.getString(ResourceIDs.STR_KEY_CONFIGURATION)) + 10;
		confLayout.insert(new UISeparator(0), 0, 100,
				UILayout.CONSTRAINT_PERCENTUAL);
		confLayout.insert(key_configuration, 1, confWidth,
				UILayout.CONSTRAINT_PIXELS);
		confLayout.setGroup(false);

		loginLabel = new UILabel(rm.getString(ResourceIDs.STR_LOGIN)
				.toUpperCase());
		loginMenu = UIUtils.easyMenu("", -1, -1, -1, loginLabel);

		UIMenu mainMenu = new UIMenu("");
		this.setMenu(mainMenu);
		mainMenu.append(this.cmd_exit);
		_registerScreen = this;

		tf_jid_name.setFocusable(true);
		tf_pwd.setFocusable(true);
		tf_pwd_confirm.setFocusable(true);
		tf_server.setFocusable(true);
		tf_email.setFocusable(true);

		// Add options to the connecting group
		grp_server.append("automatic");
		grp_server.append("manual");

		// set the values from config
		if (cfg.getProperty(Config.USER) != null) {
			String tempUser = cfg.getProperty(Config.USER, "") + "@"
					+ cfg.getProperty(Config.SERVER, "");
			if (tempUser.compareTo("@") == 0) {
				tempUser = exUsername + "@" + Config.BLUENDO_SERVER;
			} else
				grp_server.setSelectedIndex(1);
			tf_jid_name.setText(tempUser);
			jid_server = getServer(tf_jid_name.getText());
			tf_pwd.setText(cfg.getProperty(Config.PASSWORD, ""));
			String savedServer = cfg.getProperty(Config.CONNECTING_SERVER, "");
			tf_server.setText(savedServer);
			if (savedServer.length() == 0) grp_server.setSelectedIndex(0);
		}
		logLayout = UIUtils.easyCenterLayout(btn_login, 100);
		setStatus.append(cmd_state);
		UICanvas.getInstance().setQwerty(
				Config.getInstance().getProperty(Config.QWERTY, Config.FALSE)
						.equals(Config.TRUE));
		Image logo = null;
		try {
// #ifndef GLIDER
			setTitle(rm.getString(ResourceIDs.STR_TITLE));
			logo = Image.createImage("/icons/lampiro_icon.png");
			// #endif
			logoLabel = new UILabel(logo);
			logoLabel.setFocusable(false);
		} catch (Exception e) {
			// #mdebug
						e.printStackTrace();
			// #enddebug
		}
		logoLayout = UIUtils.easyCenterLayout(logoLabel, logo.getWidth());

		// #debug
				this.append(cmd_debug);
	}

	private void placeWizard() {
		removeAll();

		this.setFreezed(true);

		this.append(logoLayout);
		this.wizardText = new UITextField("", rm
				.getString(ResourceIDs.STR_WIZARD_TEXT), 1000,
				TextField.UNEDITABLE);
		wizardText.setWrappable(true);
		this.append(wizardText);

		buttonLayout = new UIHLayout(2);
		buttonLayout.setGroup(false);
		buttonYes = new UIButton(rm.getString(ResourceIDs.STR_YES));
		buttonYes.setAnchorPoint(Graphics.HCENTER);
		buttonNo = new UIButton(rm.getString(ResourceIDs.STR_NO));
		buttonNo.setAnchorPoint(Graphics.HCENTER);
		buttonLayout.insert(buttonYes, 0, 50, UILayout.CONSTRAINT_PERCENTUAL);
		buttonLayout.insert(buttonNo, 1, 50, UILayout.CONSTRAINT_PERCENTUAL);
		append(buttonLayout);

		this.wizardTextGateways = new UITextField("", rm
				.getString(ResourceIDs.STR_WIZARD_GATEWAYS)
				+ " " + rm.getString(ResourceIDs.STR_SCARY_GMAIL), 1000,
				TextField.UNEDITABLE);
		wizardTextGateways.setWrappable(true);
		this.append(wizardTextGateways);

		this.setFreezed(false);
		this.askRepaint();
	}

	/** Called to notify that the {@link UIScreen} has become visible */
	public void showNotify() {
		setStatusLabel();
		String user = cfg.getProperty(Config.USER);
		// the wizard is shown when the configuration is empty for the user
		// or if the wizard has already been shown
		if ((user == null || user.length() == 0) && wizardShown == false) placeWizard();
		else
			placeItems();
	}

	public void setStatusLabel() {
		String show = cfg.getProperty(Config.LAST_PRESENCE_SHOW, "");
		String msg = cfg.getProperty(Config.LAST_STATUS_MESSAGE, "");
		String statusText = "";
		statusText += (show.length() > 0 ? show + "\n" : "");
		statusText += (msg.length() > 0 ? msg : "");
		if (statusText.length() > 0) {
			this.last_status = new UITextField(rm
					.getString(ResourceIDs.STR_DISPLAYED_STATUS), statusText,
					1000, TextField.UNEDITABLE);
			this.last_status.setWrappable(true);
			this.last_status.setSubmenu(setStatus);
		} else {
			this.last_status = null;
		}
	}

	public static RegisterScreen getInstance() {
		// first delete all the references to the old instance
		if (_registerScreen == null) {
			_registerScreen = new RegisterScreen();
		} else {
			// recreate a new registerscreen unless registerscreen
			// is open or doing setup
			UIScreen cs = UICanvas.getInstance().getCurrentScreen();
			if (cs != _registerScreen && cs instanceof KeyScreen == false) {
				UICanvas.getInstance().close(_registerScreen);
				_registerScreen = new RegisterScreen();
			}
		}
		return _registerScreen;
	}

	/*
	 * Chooses which controls should be placed on screen 
	 * depending on user choices, system settings, stream error event
	 * or compile flags.
	 * It should be synch because it is called in many places by different threads.  
	 */
	synchronized private void placeItems() {
		UIItem oldSelectedItem = this.getSelectedIndex() > 0 ? (UIItem) this
				.getItemList().elementAt(this.getSelectedIndex()) : null;
		this.setFreezed(true);
		removeAll();

		// reset the progress element when logging
		ul.setText(rm.getString(ResourceIDs.STR_LOGGING_IN));
		progress_gauge.setOffset(0);

		append(logoLayout);
		append(confLayout);
		append(tf_jid_label);
		append(tf_jid_name);
		append(tf_pwd);
		if (grp_new_account.isChecked()) {
			append(tf_pwd_confirm);
			append(tf_email);
		}
		append(grp_advanced);
		checkLogin();

		if (grp_advanced.isChecked()) {
			append(resource);
			if (this.last_status != null) append(this.last_status);

			append(grp_server);
			if (grp_server.getSelectedIndex() == 1) {
				append(tf_server);
			}
			append(grp_new_account);
			append(reset_config);
			append(reset_all_data);
		}
		// #debug
				this.append(cmd_debug);
		this.setFreezed(false);
		if (oldSelectedItem != null) this.setSelectedItem(oldSelectedItem);
		this.askRepaint();
	}

	public void menuAction(UIMenu menu, UIItem c) {
		if (c == cmd_exit) {
			LampiroMidlet.exit();
		} else if (c == instructionLabel) {
			int labelWidth = UICanvas.getInstance().getWidth() - 20;
			UILabel hint = new UILabel(rm.getString(ResourceIDs.STR_HINT));
			UIMenu instructionsMenu = UIUtils.easyMenu(rm
					.getString(ResourceIDs.STR_INSTRUCTIONS), 10, 30,
					labelWidth, hint);
			instructionsMenu.cancelMenuString = "";
			instructionsMenu.selectMenuString = rm.getString(
					ResourceIDs.STR_CONTINUE).toUpperCase();
			hint.setWrappable(true, labelWidth);
			this.addPopup(instructionsMenu);
		} else if (c == cmd_state) {
			StatusScreen ssc = new StatusScreen();
			UICanvas.getInstance().open(ssc, true);
		} else if (c == loginLabel) {
			this.itemAction(this.btn_login);
		}

	}

	private void login() {
		// first do all the "clean" operation
		if (this.reset_config.isChecked()) {
			this.cfg.resetStorage(true);
		}

		if (this.reset_all_data.isChecked()) {
			String[] rss = RecordStore.listRecordStores();
			for (int i = 0; i < rss.length; i++) {
				String rs = rss[i];
				try {
					RecordStore.deleteRecordStore(rs);
				} catch (Exception e) {
					// #mdebug
										System.out.println("Error in cleaning recordstores");
										e.printStackTrace();
					// #enddebug
				}
			}
			this.cfg.resetStorage(true);
		}

		// if registering check the pwds coherency
		if (grp_new_account.isChecked()) {
			if (wrongPwd != null) {
				this.removePopup(wrongPwd);
			}
			if (tf_pwd.getText().equals(tf_pwd_confirm.getText()) == false) {
				UILabel gatewayHint = new UILabel(rm
						.getString(ResourceIDs.STR_WRONG_PWD));
				int canvasWidth = UICanvas.getInstance().getWidth() - 20;
				wrongPwd = UIUtils.easyMenu(rm
						.getString(ResourceIDs.STR_INSTRUCTIONS), 10, 30,
						canvasWidth, gatewayHint, "", rm.getString(
								ResourceIDs.STR_CONTINUE).toUpperCase());
				gatewayHint.setWrappable(true, canvasWidth);
				this.addPopup(wrongPwd);
				return;
			}
		}

		removeAll();
		ul.setAnchorPoint(Graphics.HCENTER | Graphics.TOP);
		append(ul);
		append(progress_gauge);
		progress_gauge.cancel();
		progress_gauge.start();
		// if compression is enabled even TLS is
		hint.setWrappable(true);
		append(hint);
		UIHLayout uhl = UIUtils.easyCenterLayout(this.but_cancel, 100);
		append(uhl);

		new Thread() {
			public void run() {
				String server = getServer(tf_jid_name.getText());
				// #endif
// #ifndef BLUENDO_REG
								 xmppLogin(register);
				// #endif
			}
		}.start();
	}

	// #ifdef BLUENDO_REG

	

	// #endif

	private void xmppLogin(boolean newUser) {
		String user = getUser(tf_jid_name.getText());
		String server = getServer(tf_jid_name.getText());

		String cfg_user = cfg.getProperty(Config.USER);
		String cfg_server = cfg.getProperty(Config.SERVER);
		boolean clientInitialized = true;
		if ((cfg_user == null || !cfg_user.equals(user))
				|| (cfg_server == null || !cfg_server.equals(server))
				|| Config.FALSE.equals(cfg.getProperty(
						Config.CLIENT_INITIALIZED, Config.FALSE))) {
			cfg.setProperty(Config.CLIENT_INITIALIZED, Config.FALSE);
			clientInitialized = false;
		}
		cfg.setProperty(Config.USER, user);
		cfg.setProperty(Config.SERVER, server);
		cfg.setProperty(Config.PASSWORD, tf_pwd.getText());
		cfg.setProperty(Config.EMAIL, tf_email.getText());
		if (grp_server.getSelectedIndex() == 0) {
			if (clientInitialized == false) {
				String serverQuery = srvQuery();
				cfg.setProperty(Config.CONNECTING_SERVER, serverQuery);
				tf_server.setText(serverQuery);
			}
		} else {
			cfg.setProperty(Config.CONNECTING_SERVER, tf_server.getText());
		}

		// #mdebug
				//		Logger.log("user:" + cfg.getProperty(Config.USER) + " server:"
				//				+ cfg.getProperty(Config.SERVER) + " password:"
				//				+ cfg.getProperty(Config.PASSWORD) + " email:"
				//				+ cfg.getProperty(Config.EMAIL) + " connecting-server:"
				//				+ cfg.getProperty(Config.CONNECTING_SERVER));
		// #enddebug

		cfg.saveToStorage();

		// Get the XMPP client
		XMPPClient xmpp = XMPPClient.getInstance();
		// this rosterListener must be set before the Roster starts 
		// calling its methods
		RosterScreen rs = RosterScreen.getInstance();
		xmpp.setXmppListener(rs);

		Config cfg = Config.getInstance();
		boolean newCredentials = Config.FALSE.equals(cfg
				.getProperty(Config.CLIENT_INITIALIZED));
		xmpp.createStream(newUser, newCredentials);

		EventQuery qAuth = new EventQuery(EventQuery.ANY_EVENT, null, null);
		reg = BasicXmlStream.addEventListener(qAuth, RegisterScreen.this);
		xmpp.openStream();
	}

	public void gotStreamEvent(String event, Object source) {
		XMPPClient client = XMPPClient.getInstance();
		if (BasicXmlStream.STREAM_CONNECTED.equals(event)) {
			ul.setText(rm.getString(ResourceIDs.STR_CONNECTED));
			progress_gauge.setOffset(30);
			this.askRepaint();
			return;
		} else if (BasicXmlStream.TLS_INITIALIZED.equals(event)) {
			ul.setText(rm.getString(ResourceIDs.STR_TLS_INITIALIZED));
			progress_gauge.setOffset(50);
			this.askRepaint();
			return;
		} else if (BasicXmlStream.COMPRESSION_INITIALIZED.equals(event)) {
			ul.setText(rm.getString(ResourceIDs.STR_COMPRESSION_INITIALIZED));
			progress_gauge.setOffset(60);
			this.askRepaint();
			return;
		} else if (BasicXmlStream.STREAM_AUTHENTICATED.equals(event)) {
			ul.setText(rm.getString(ResourceIDs.STR_AUTHENTICATED));
			progress_gauge.setOffset(70);
			this.askRepaint();
			return;
		} else if (BasicXmlStream.STREAM_INITIALIZED.equals(event)) {
			ul.setText(rm.getString(ResourceIDs.STR_INITIALIZED));
			progress_gauge.setOffset(90);
			this.askRepaint();
		}

		if (BasicXmlStream.STREAM_ERROR.equals(event)
				|| BasicXmlStream.CONNECTION_FAILED.equals(event)
				|| BasicXmlStream.REGISTRATION_FAILED.equals(event)
				|| BasicXmlStream.NOT_AUTHORIZED.equals(event)
				|| BasicXmlStream.CONNECTION_LOST.equals(event)) {

			reg.remove();
			try {
				client.closeStream();
			} catch (Exception e) {
				// #mdebug
								System.out.println(e);
				// #enddebug
			}

			String description = null;
			if (BasicXmlStream.CONNECTION_FAILED.equals(event)) {
				description = rm.getString(ResourceIDs.STR_CONNECTION_FAILED);
			} else if (BasicXmlStream.CONNECTION_LOST.equals(event)) {
				description = rm.getString(ResourceIDs.STR_CONNECTION_LOST);
			} else if (BasicXmlStream.REGISTRATION_FAILED.equals(event)) {
				description = rm.getString(ResourceIDs.STR_REG_UNALLOWED);
			} else if (BasicXmlStream.NOT_AUTHORIZED.equals(event)) {
				description = rm.getString(ResourceIDs.STR_WRONG_USERNAME);
			} else {
				description = (String) source;
			}
			if (source != null && source.equals("conflict")) {
				description = rm.getString(ResourceIDs.STR_ALREADY_EXIST);
			}

			//UITextField error = new UITextField()

			UICanvas.showAlert(AlertType.ERROR, register ? rm
					.getString(ResourceIDs.STR_REGFAIL_TITLE) : rm
					.getString(ResourceIDs.STR_LOGFAIL_TITLE), (register ? (rm
					.getString(ResourceIDs.STR_REGFAIL_DESC)) : (rm
					.getString(ResourceIDs.STR_LOGFAIL_DESC)))
					+ description);
			this.progress_gauge.cancel();
			placeItems();

		} else if (BasicXmlStream.STREAM_INITIALIZED.equals(event)) {
			this.progress_gauge.cancel();
			reg.remove();

			// to clean the screen before the roster paint
			this.removeAll();

			RosterScreen rs = RosterScreen.getInstance();
// #ifndef GLIDER
			UIScreen nextScreen = rs;
			// #endif
			UICanvas.getInstance().open(nextScreen, true);
			RegisterScreen._registerScreen = null;
			UICanvas.getInstance().close(this);
		}
	}

	public void itemAction(UIItem item) {
		if (item == key_configuration) {
			KeyScreen ks = new KeyScreen();
			UICanvas.getInstance().open(ks, true);
			ks.checkKeys();
			UICanvas.getInstance().close(this);
		} else if (item == buttonYes) {
			wizardShown = true;
			this.tf_jid_name.setText(exUsername + "@" + exServer);
			grp_new_account.setChecked(false);
			placeItems();
		} else if (item == buttonNo) {
			wizardShown = true;
			grp_new_account.setChecked(true);
			placeItems();
			remove(tf_email);
			this.itemAction(this.grp_new_account);
		} else if (item == grp_new_account) {
			register = grp_new_account.isChecked();
			placeItems();
			// #mdebug
					} else if (item == cmd_debug) {
						DebugScreen debugScreen = new DebugScreen();
						UICanvas.getInstance().open(debugScreen, true);
			// #enddebug
		} else if (item == but_cancel) {
			progress_gauge.cancel();
			try {
				XMPPClient.getInstance().closeStream();
			} catch (Exception e) {
				// during closing connection
				// exceptions from the transport can be generated
				//#mdebug
								System.out.println(e);
				// #enddebug     
			}
			// #endif
			placeItems();
		} else if (item == grp_server) {
			if (grp_server.getSelectedIndex() == 1) {
				if (tf_server.getText().length() == 0) {
					String serString = tf_jid_name.getText();
					tf_server.setText(getServer(serString) + ":5222");
				}
				if (this.getItemList().contains(tf_server) == false) {
					append(tf_server);
				}
			} else {
				remove(tf_server);
			}
			return;
		} else if (item == grp_advanced) {
			placeItems();
			return;
		} else if (item == tf_jid_name || item == tf_pwd
				|| item == this.tf_pwd_confirm) {
			if (grp_server.getSelectedIndex() == 1) {
				String jsvr = getServer(tf_jid_name.getText());
				if (!jid_server.equals(jsvr)) {
					jid_server = jsvr;
					grp_server.setSelectedIndex(0);
					remove(tf_server);
				}
			}
			//			if (item == tf_jid_name) {
			//				if (scaryGmail != null) {
			//					this.removePopup(scaryGmail);
			//				}
			//				if (tf_jid_name.getText().indexOf("gmail.com") >= 0) {
			//					UILabel gatewayHint = new UILabel(rm
			//							.getString(ResourceIDs.STR_SCARY_GMAIL));
			//					int canvasWidth = UICanvas.getInstance().getWidth() - 20;
			//					scaryGmail = UIUtils.easyMenu(rm
			//							.getString(ResourceIDs.STR_INSTRUCTIONS), 10, 30,
			//							canvasWidth, gatewayHint, "", rm.getString(
			//									ResourceIDs.STR_CONTINUE).toUpperCase());
			//					gatewayHint.setWrappable(true, canvasWidth);
			//					this.addPopup(scaryGmail);
			//				}
			//			}

			placeItems();
		} else if (item == btn_login) {
			String resourceString = this.resource.getText();
			cfg.setProperty(Config.YUP_RESOURCE, resourceString);
			cfg.saveToStorage();
			login();
			return;
		} else if (item == this.last_status) {
			menuAction(setStatus, cmd_state);
		} else if (item == this.hint) { return; }

		// check if we must enable / disable
		checkLogin();
	}

	/**
	 * check if we must enable the login
	 */
	private void checkLogin() {
		String items[] = new String[3];
		boolean checkmail[] = new boolean[] { true, false, false };

		items[0] = tf_jid_name.getText();
		items[1] = tf_pwd.getText();

		if (grp_server.getSelectedIndex() == 1) {
			items[2] = tf_server.getText();
		}

		boolean complete = true;
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				continue;
			}
			String s = items[i];
			if (s.length() == 0) {
				complete = false;
				break;
			} else if (checkmail[i] && !Utils.is_email(s)) {
				complete = false;
				break;
			}
		}

		int idx = indexOf(this.logLayout);
		if (complete && idx == -1) {
			insert(indexOf(grp_advanced), logLayout);
		} else if (!complete && idx != -1) {
			remove(idx);
		}
		UIMenu tempSubmenu = (complete == true ? loginMenu : null);
		tf_jid_name.setSubmenu(tempSubmenu);
		grp_new_account.setSubmenu(tempSubmenu);
		tf_pwd.setSubmenu(tempSubmenu);
		tf_pwd_confirm.setSubmenu(tempSubmenu);
		btn_login.setSubmenu(tempSubmenu);
		grp_advanced.setSubmenu(tempSubmenu);
		resource.setSubmenu(tempSubmenu);
		tf_server.setSubmenu(tempSubmenu);
		grp_server.setSubmenu(tempSubmenu);
		reset_config.setSubmenu(tempSubmenu);
		reset_all_data.setSubmenu(tempSubmenu);
		//logoLabel.setSubmenu(tempSubmenu);
		String loginString = rm.getString(ResourceIDs.STR_LOGIN);
		if (grp_new_account.isChecked() == false) {
			this.btn_login.setText(loginString);
		} else {
			// #endif
// #ifndef BLUENDO_REG
												this.btn_login.setText(rm.getString(ResourceIDs.STR_REGISTER));
			// #endif
		}
	}

	private String srvQuery() {

		String host = getServer(RegisterScreen.this.tf_jid_name.getText());
		try {
			String domain = host;
			HttpConnection conn = (HttpConnection) Connector
					.open(Config.SRV_QUERY_PATH + domain);
			InputStream is = conn.openInputStream();
			int b = -1;
			StringBuffer buffer = new StringBuffer();
			while ((b = is.read()) != -1) {
				buffer.append((char) b);
			}
			String result = buffer.toString();
			if ("_:-1".equals(result)) {
				result = host + ":5222";
			}
			return result;
		} catch (SecurityException e) {
			return host + ":5222";
		} catch (IOException e) {
			return host + ":5222";
		}

	}

	private String getServer(String jid) {
		int server_idx = jid.indexOf("@");
		if (server_idx >= 0) {
			return jid.substring(server_idx + 1);
		} else {
			return "";
		}
	}

	private String getUser(String jid) {
		int server_idx = jid.indexOf("@");
		if (server_idx >= 0) {
			return jid.substring(0, server_idx);
		} else {
			return "";
		}
	}
}
