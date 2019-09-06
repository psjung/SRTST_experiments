import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SPLTestSelectionSystem_Lampiro {	
	private File outFile, conformanceSource;
	public static BufferedWriter writer, containmentWriter;

	HashMap<HashSet<String>, HashSet<String>> codePartitionTable;
	HashMap<HashSet<String>, HashSet<String>> testCasesPartitionTable;
	HashSet<String> impactedClassList;
	HashSet<HashSet<String>> impactedTestSuiteId;
	HashSet<String> affectedProducts;

	public SPLTestSelectionSystem_Lampiro(){
		outFile = new File("result.txt");
		conformanceSource = new File("C:/Users/soo/Desktop/eclipse-java-mars-2-win32-x86_64/ContainmentChecker/source.txt");
		try {
			writer = new BufferedWriter(new FileWriter(outFile));
			containmentWriter = new BufferedWriter(new FileWriter(conformanceSource));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		affectedProducts = new HashSet<String>();
	}

	public static void main(String args[]) throws IOException{
		SPLTestSelectionSystem_Lampiro system = new SPLTestSelectionSystem_Lampiro();
		system.start(args);	
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public void start(String args[]) throws IOException{
		long st = System.currentTimeMillis();

		//code partitioning
		codePartitionTable = CodePartitioner.start(args[Constants.PRODUCT_CODE_FILE_INDEX]);


		//TCs partitioning
		testCasesPartitionTable = TestCasesPartitioner.start(args[Constants.TESTCASE_FILE_INDEX]);

		long et1 = System.currentTimeMillis();
		System.out.println("Partition: " + (et1 - st)+" ms");
		st = System.currentTimeMillis();
		
		//set impacted classes
		impactedClassList = ImpactedClasses.getImpactedClasses(args[Constants.IMPACTED_CLASSES_FILE_INDEX]);

		//print details
		CodePartitioner.printTable();
		TestCasesPartitioner.printTable();
		ImpactedClasses.printImpactedClassList();		

		//get impacted test suite id
		impactedTestSuiteId = this.getImpactedTestSuite();


		HashMap<String, HashSet<String>> testCases = TestCasesPartitioner.getTestCases();
		int sizeOfTCs_naive = 0;
		HashSet<String> affectedTCs = new HashSet<String>();

		//		affectedProducts.clear();
		//		affectedProducts.add("Prop4J-P1");
		//		affectedProducts.add("Prop4J-P2");

		for(String p : affectedProducts){
			sizeOfTCs_naive += testCases.get(p).size();		//the number of TCs of naive approach
			affectedTCs.addAll(testCases.get(p));			//execution count of naive approach	
		}
		System.out.println("==== "+affectedTCs.size()/64.0);

		HashSet<String> result = new HashSet<String>();

		try{
			//Test case selection
			writer.write("\r\n--\r\n");
			writer.write("<Impacted Test Suite>\r\n");

			int executionNumber = 0;
			for(HashSet<String> space : impactedTestSuiteId){
				HashSet<String> impactedTCs = testCasesPartitionTable.get(space);
				if(impactedTCs != null){
					result.addAll(impactedTCs);

					String spaceOnSetFormat = space.toString().replace("[", "{").replace("]", "}");
					writer.write("TS(" + spaceOnSetFormat + ") "+ impactedTCs.size() +"= " + impactedTCs + "\r\n");
					executionNumber = executionNumber + (impactedTCs.size() * space.size());
				}
			}


			writer.write("\r\n--\r\n");
			writer.write("<Selection Result>" + result.size() +"\r\n" + result.toString() + "\r\n");

			System.out.println("result.txt is created");
			System.out.println("--");
			System.out.println("The number of selected TCs: "+ result.size() + "(" + affectedTCs.size() + ")");
			System.out.println("The number of executions: "+ executionNumber + "(" + sizeOfTCs_naive + ")");


			//			containmentWriter.write(result.toString().replace("[", "").replace("]", ""));

			writer.close();
			//			containmentWriter.close();

			ArrayList<String[]> listString = new ArrayList<String[]>(); 
			File f1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\Lampiro4_P1 CoverageInfo_c.txt");
			File f2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\Lampiro4_P2 CoverageInfo_c.txt");
			File f3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\Lampiro4_P3 CoverageInfo_c.txt");
			File f4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\Lampiro4_P4 CoverageInfo_c.txt");
			//File f5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\Lampiro_P5 CoverageInfo_c.txt");
			//File f6 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\Lampiro_P6 CoverageInfo_c.txt");
			

			List<List<String>> data = new ArrayList<List<String>>();
			try {
				data.add(Files.readAllLines(Paths.get(f1.getAbsolutePath())));	//Lampiro_P1 CoverageInfo_c.txt
				data.add(Files.readAllLines(Paths.get(f2.getAbsolutePath())));	//Lampiro_P2 CoverageInfo_c.txt
				data.add(Files.readAllLines(Paths.get(f3.getAbsolutePath())));	//Lampiro_P3 CoverageInfo_c.txt
				data.add(Files.readAllLines(Paths.get(f4.getAbsolutePath())));	//Lampiro_P4 CoverageInfo_c.txt
				//data.add(Files.readAllLines(Paths.get(f5.getAbsolutePath())));	//Lampiro_P5 CoverageInfo_c.txt
				//data.add(Files.readAllLines(Paths.get(f6.getAbsolutePath())));	//Lampiro_P6 CoverageInfo_c.txt
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/* Lampiro all mutations */
			listString.add(new String[]{"InfTree", "JZlib", "StaticTree", "Tree", "ZInputStream", "BaseChannel", "SocketChannel", "BasicXmlStream", "CompressionInitializer", "SocketStream", "XMPPClient"});
//			listString.add(new String[]{"ResourceManager", "RMSIndex", "StderrConsumer", "Utils", "XMPPConsumer", "BSerializer", "xml.Element", "UIButton", "XMPPTestClient", "BaseChannel", "BaseChannel", "SocketChannel"});
//			listString.add(new String[]{"BluendoXMLRPC", "FTReceiver", "FTSender", "Group", "InfBlocks", "InfCodes", "Inflate", "InfTree", "BaseChannel", "SocketChannel", "ResourceManager", "CommandExecutor", "SimpleDataFormExecutor"});
//			listString.add(new String[]{"RMSIndex", "StderrConsumer", "Utils", "FTSender", "Group", "IqManager", "Adler32", "Deflate"});
//			listString.add(new String[]{"lampiro.screens.ChatScreen", "lampiro.screens.CommandListScreen", "it.yup.screens.ContactInfoScreen", "InfBlocks", "InfCodes", "Inflate", "InfTree", "BasicXmlStream"});
//			listString.add(new String[]{"Adler32", "Deflate", "UITextField", "lampiro.screens.StatusScreen", "SubscriptionConfirmAlert", "BaseChannel", "SocketChannel", "BasicXmlStream", "CompressionInitializer", "SocketStream", "TLSInitializer", "XMPPClient"});
//			listString.add(new String[]{"UIItem", "UILabel", "UILayout", "UIMenu", "UIPanel", "CommandExecutor", "SimpleDataFormExecutor"});
//			listString.add(new String[]{"UIPanel", "CommandExecutor", "Config", "RMSIndex", "StderrConsumer", "BaseChannel", "SocketChannel"});
//			listString.add(new String[]{"InfCodes", "Inflate", "MUCComposer", "MUCScreen", "SendMMScreen", "BaseChannel, SocketChannel, ResourceManager"});
//			listString.add(new String[]{"RMSIndex", "StderrConsumer", "Utils", "XMPPConsumer", "Bprocessor", "BaseChannel, SocketChannel, ResourceManager"});
//			listString.add(new String[]{"Inflate", "MUCComposer", "MUCScreen", "SendMMScreen", "InfTree", "Jzlib", "CommandExecutor", "SimpleDataFormExecutor", "BasicXmlStream"});
//			listString.add(new String[]{"ZOutputStream", "ZStream", "ZStreamException", "BaseChannel", "SocketChannel", "ResourceManager", "CommandExecutor", "SimpleDataFormExecutor"});
//			listString.add(new String[]{"MetaVector", "NetworkConsumer", "ResourceIDs", "BasicXmlStream", "BaseChannel", "SocketChannel", "BasicXmlStream", "SocketStream", "TLSInitializer", "XMPPClient"});
//			listString.add(new String[]{"CommandExecutor", "Config", "Contact", "DataFormListener", "BaseChannel", "SocketChannel", "BasicXmlStream", "SocketStream", "TLSInitializer", "XMPPClient", "SimpleDataFormExecutor"});
//			listString.add(new String[]{"AlbumScreen", "FTScreen", "GatewayRegisterScreen", "MUC", "CommandExecutor", "SimpleDataFormExecutor", "BasicXmlStream"});
//			listString.add(new String[]{"JZlib", "StaticTree", "Tree", "ZInputStream", "xmlstream.KXmlSerializer", "AccountRegistration", "BasicXmlStream", "Stanza", "Roster", "XMPPClient"});
//			listString.add(new String[]{"BasicXmlStream", "EventQuery", "Task", "XMPPClient", "XMLTestMidlet", "UIConfig", "XMPPClient"});
//			listString.add(new String[]{"Logger", "ResourceManager", "BSerializer", "xml.Element", "SocketStream", "StreamEventListener", "JZlib", "Config", "Contact", "BaseChannel", "SocketChannel", "BasicXmlStream", "CompressionInitializer", "SocketStream", "XMPPClient", "CommandExecutor", "SimpleDataFormExecutor"});
//			listString.add(new String[]{"Semaphore", "UIAccordion", "UIButton", "BaseChannel", "SocketChannel", "ResourceManager"});
//			listString.add(new String[]{"ScreenSaver", "lampiro.screens.SimpleComposerScreen", "lampiro.screens.TaskListScreen", "Tree","ZInputStream", "ZOutputStream", "Group", "IqManager", "IQResultListener", "CommandExecutor", "SimpleDataFormExecutor", "BasicXmlStream"});
//			listString.add(new String[]{"TestMidlet", "UITestMidlet", "XMLTestMidlet", "FTSender", "Group", "IqManager", "IQResultListener", "MUC", "DataForm", "Iq", "BaseChannel", "ResourceManager", "CommandExecutor"});
//			listString.add(new String[]{"lampiro.screens.DebugScreen", "DeleteContactAlert", "XMPPTestClient", "BaseChannel", "UIUtils", "UIVLayout", "GoogleToken", "LogConsumer", "Logger", "MemoryLogConsumer", "MetaVector", "BaseChannel", "SocketChannel", "BasicXmlStream"});
//			listString.add(new String[]{"PacketListener", "SASLAuthenticator", "SocketStream", "StreamEventListener", "SocketChannel", "ResourceManager", "XMPPClient"});
//			listString.add(new String[]{"UICanvas", "UIRadioButtons", "UIScreen"});
//			listString.add(new String[]{"FilterInputStream", "InfBlocks", "InfCodes", "Inflate", "InfTree", "JZlib", "StaticTree", "Tree", "ZInputStream", "ZOutputStream", "Zstream", "SimpleDataFormExecutor", "Task", "XMPPClient", "SimpleDataFormExecutor"});
//			listString.add(new String[]{"MUC", "DataForm", "Iq", "Task", "XMPPClient", "GroupsScreen", "BaseChannel", "BasicXmlStream"});
//			listString.add(new String[]{"RMSIndex", "StderrConsumer", "Utils", "XMPPConsumer", "Bprocessor", "UIAccordion", "UIButton", "UICanvas", "UICheckbox", "PacketListener", "BaseChannel", "BasicXmlStream"});
//			listString.add(new String[]{"UICheckbox", "UICombobox", "UIConfig", "UIEmoLabel", "ResourceManager", "TLSInitializer", "CommandExecutor"});
//			listString.add(new String[]{"ScreenSaver", "lampiro.screens.SimpleComposerScreen","Utils", "XMPPConsumer", "Bprocessor"});
//			listString.add(new String[]{"FilterInputStream", "InfBlocks", "InfCodes", "Inflate", "BaseChannel", "XMPPClient"});
//			listString.add(new String[]{"UIPanel", "CommandExecutor", "LogConsumer", "xmlstream.KXmlParser", "NetworkConsumer", "BaseChannel", "SocketChannel"});
//			listString.add(new String[]{"it.yup.screens.TaskListScreen", "it.yup.screens.RosterScreen", "XMLTestMidlet", "Stanza", "Roster", "SimpleDataFormExecutor", "BasicXmlStream"});
//			listString.add(new String[]{"BasicXmlStream", "EventQuery", "EventQueryRegistration", "XMPPClient", "BasicXmlStream"});
//			listString.add(new String[]{"xml.KXmlSerializer", "AccountRegistration", "Initializer", "BaseChannel", "ResourceManager", "BasicXmlStream", "XMPPClient"});
//			listString.add(new String[]{"Message", "Presence", "Stanza", "Roster", "SimpleDataFormExecutor"});
//			listString.add(new String[]{"Logger", "ResourceManager", "UILabel", "UILayout", "UIConfig", "Initializer", "SocketChannel", "TLSInitializer"});
//			listString.add(new String[]{"ZStreamException", "ScreenSaver", "RMSTestMidlet", "AccountRegistration", "BasicXmlStream", "EventQuery", "ResourceIDs", "InfBlocks", "InfCodes", "Inflate", "InfTree", "BaseChannel", "SocketChannel", "BasicXmlStream"});
//			listString.add(new String[]{"LogConsumer", "xml.KXmlParser", "KXmlProcessor", "BasicXmlStream", "EventQuery", "EventQueryRegistration",  "FTReceiver", "FTSender", "Adler32", "Deflate", "FilterInputStream", "CompressionInitializer", "BasicXmlStream"});
//			listString.add(new String[]{"DeleteContactAlert", "XMPPTestClient", "Deflate", "UITextField", "BaseChannel", "SocketChannel", "SocketStream"});
//			listString.add(new String[]{"MemoryLogConsumer", "MetaVector", "NetworkConsumer", "ResourceIDs", "XMPPClient"});
//			listString.add(new String[]{"UIMenu", "UIPanel", "CommandExecutor", "BaseChannel", "Adler32", "CommandExecutor", "BasicXmlStream"});
//			listString.add(new String[]{"RMSTestMidlet", "TestMidlet", "UITestMidlet", "BaseChannel", "BasicXmlStream"});
//			listString.add(new String[]{"SimpleDataFormExecutor", "MemoryLogConsumer", "MetaVector", "SubscriptionConfirmAlert", "RMSIndex", "BaseChannel", "SocketChannel"});
//			listString.add(new String[]{"lampiro.screens.RosterScreen", "XMLTestMidlet", "SocketChannel", "TransportListener", "UISeparator", "ResourceManager", "XMPPClient", "SimpleDataFormExecutor"});
//			listString.add(new String[]{"UITextPanel", "UIUtils", "UIVLayout", "GoogleToken", "SocketChannel"});
//			listString.add(new String[]{"IqManager", "KeyScreen", "MMScreen", "SocketChannel", "CompressionInitializer"});
//			listString.add(new String[]{"GrpMessageComposerScreen", "InnerMMScreen", "ZOutputStream", "Zstream", "it.yup.screens.TaskListScreen", "BaseChannel", "SocketStream", "XMPPClient", "CommandExecutor"});
//			listString.add(new String[]{"Semaphore", "Utils", "GoogleToken", "UIRadioButtons", "Iq", "Message", "BasicXmlStream", "ResourceManager", "TLSInitializer"});
//			listString.add(new String[]{"Semaphore", "it.yup.screens.CommandListScreen", "IqManager", "xmlstream.Element", "it.yup.screens.ChatScreen", "it.yup.screens.SimpleComposerScreen", "BaseChannel", "SocketChannel", "XMPPClient", "SimpleDataFormExecutor"});
//			listString.add(new String[]{"UIGauge", "UIHLayout", "UIIContainer", "SimpleDataFormExecutor"});

			
			/* Lampiro only common mutations */
//			listString.add(new String[]{"InfTree", "JZlib", "StaticTree", "Tree", "ZInputStream"});
//			listString.add(new String[]{"ResourceManager", "RMSIndex", "StderrConsumer", "Utils", "XMPPConsumer", "BSerializer", "xml.Element", "UIButton", "XMPPTestClient", "BaseChannel"});
//			listString.add(new String[]{"BluendoXMLRPC", "FTReceiver", "FTSender", "Group", "InfBlocks", "InfCodes", "Inflate", "InfTree"});
//			listString.add(new String[]{"RMSIndex", "StderrConsumer", "Utils", "FTSender", "Group", "IqManager", "Adler32", "Deflate"});
//			listString.add(new String[]{"lampiro.screens.ChatScreen", "lampiro.screens.CommandListScreen", "it.yup.screens.ContactInfoScreen", "InfBlocks", "InfCodes", "Inflate", "InfTree"});
//			listString.add(new String[]{"Adler32", "Deflate", "UITextField", "lampiro.screens.StatusScreen", "SubscriptionConfirmAlert"});
//			listString.add(new String[]{"UIItem", "UILabel", "UILayout", "UIMenu", "UIPanel"});
//			listString.add(new String[]{"UIPanel", "CommandExecutor", "Config", "RMSIndex", "StderrConsumer"});
//			listString.add(new String[]{"InfCodes", "Inflate", "MUCComposer", "MUCScreen", "SendMMScreen"});
//			listString.add(new String[]{"RMSIndex", "StderrConsumer", "Utils", "XMPPConsumer", "Bprocessor"});
//			listString.add(new String[]{"Inflate", "MUCComposer", "MUCScreen", "SendMMScreen", "InfTree", "Jzlib"});
//			listString.add(new String[]{"ZOutputStream", "ZStream", "ZStreamException"});
//			listString.add(new String[]{"MetaVector", "NetworkConsumer", "ResourceIDs", "BasicXmlStream"});
//			listString.add(new String[]{"CommandExecutor", "Config", "Contact", "DataFormListener"});
//			listString.add(new String[]{"AlbumScreen", "FTScreen", "GatewayRegisterScreen", "MUC"});
//			listString.add(new String[]{"JZlib", "StaticTree", "Tree", "ZInputStream", "xmlstream.KXmlSerializer", "AccountRegistration", "BasicXmlStream", "Stanza", "Roster"});
//			listString.add(new String[]{"BasicXmlStream", "EventQuery", "Task", "XMPPClient", "XMLTestMidlet", "UIConfig"});
//			listString.add(new String[]{"Logger", "ResourceManager", "BSerializer", "xml.Element", "SocketStream", "StreamEventListener", "JZlib", "Config", "Contact"});
//			listString.add(new String[]{"Semaphore", "UIAccordion", "UIButton"});
//			listString.add(new String[]{"ScreenSaver", "lampiro.screens.SimpleComposerScreen", "lampiro.screens.TaskListScreen", "Tree","ZInputStream", "ZOutputStream", "Group", "IqManager", "IQResultListener"});
//			listString.add(new String[]{"TestMidlet", "UITestMidlet", "XMLTestMidlet", "FTSender", "Group", "IqManager", "IQResultListener", "MUC", "DataForm", "Iq"});
//			listString.add(new String[]{"lampiro.screens.DebugScreen", "DeleteContactAlert", "XMPPTestClient", "BaseChannel", "UIUtils", "UIVLayout", "GoogleToken", "LogConsumer", "Logger", "MemoryLogConsumer", "MetaVector"});
//			listString.add(new String[]{"PacketListener", "SASLAuthenticator", "SocketStream", "StreamEventListener"});
//			listString.add(new String[]{"UICanvas", "UIRadioButtons", "UIScreen"});
//			listString.add(new String[]{"FilterInputStream", "InfBlocks", "InfCodes", "Inflate", "InfTree", "JZlib", "StaticTree", "Tree", "ZInputStream", "ZOutputStream", "Zstream", "SimpleDataFormExecutor", "Task", "XMPPClient"});
//			listString.add(new String[]{"MUC", "DataForm", "Iq", "Task", "XMPPClient", "GroupsScreen"});
//			listString.add(new String[]{"RMSIndex", "StderrConsumer", "Utils", "XMPPConsumer", "Bprocessor", "UIAccordion", "UIButton", "UICanvas", "UICheckbox", "PacketListener"});
//			listString.add(new String[]{"UICheckbox", "UICombobox", "UIConfig", "UIEmoLabel"});
//			listString.add(new String[]{"ScreenSaver", "lampiro.screens.SimpleComposerScreen","Utils", "XMPPConsumer", "Bprocessor"});
//			listString.add(new String[]{"FilterInputStream", "InfBlocks", "InfCodes", "Inflate"});
//			listString.add(new String[]{"UIPanel", "CommandExecutor", "LogConsumer", "xmlstream.KXmlParser", "NetworkConsumer"});
//			listString.add(new String[]{"it.yup.screens.TaskListScreen", "it.yup.screens.RosterScreen", "XMLTestMidlet", "Stanza", "Roster"});
//			listString.add(new String[]{"BasicXmlStream", "EventQuery", "EventQueryRegistration"});
//			listString.add(new String[]{"xml.KXmlSerializer", "AccountRegistration", "Initializer"});
//			listString.add(new String[]{"Message", "Presence", "Stanza", "Roster", "SimpleDataFormExecutor"});
//			listString.add(new String[]{"Logger", "ResourceManager", "UILabel", "UILayout", "UIConfig", "Initializer"});
//			listString.add(new String[]{"ZStreamException", "ScreenSaver", "RMSTestMidlet", "AccountRegistration", "BasicXmlStream", "EventQuery", "ResourceIDs", "InfBlocks", "InfCodes", "Inflate", "InfTree"});
//			listString.add(new String[]{"LogConsumer", "xml.KXmlParser", "KXmlProcessor", "BasicXmlStream", "EventQuery", "EventQueryRegistration",  "FTReceiver", "FTSender", "Adler32", "Deflate", "FilterInputStream"});
//			listString.add(new String[]{"DeleteContactAlert", "XMPPTestClient", "Deflate", "UITextField"});
//			listString.add(new String[]{"MemoryLogConsumer", "MetaVector", "NetworkConsumer", "ResourceIDs"});
//			listString.add(new String[]{"UIMenu", "UIPanel", "CommandExecutor", "BaseChannel", "Adler32"});
//			listString.add(new String[]{"RMSTestMidlet", "TestMidlet", "UITestMidlet"});
//			listString.add(new String[]{"SimpleDataFormExecutor", "MemoryLogConsumer", "MetaVector", "SubscriptionConfirmAlert", "RMSIndex"});
//			listString.add(new String[]{"lampiro.screens.RosterScreen", "XMLTestMidlet", "SocketChannel", "TransportListener", "UISeparator"});
//			listString.add(new String[]{"UITextPanel", "UIUtils", "UIVLayout", "GoogleToken"});
//			listString.add(new String[]{"IqManager", "KeyScreen", "MMScreen"});
//			listString.add(new String[]{"GrpMessageComposerScreen", "InnerMMScreen", "ZOutputStream", "Zstream", "it.yup.screens.TaskListScreen"});
//			listString.add(new String[]{"Semaphore", "Utils", "GoogleToken", "UIRadioButtons", "Iq", "Message"});
//			listString.add(new String[]{"Semaphore", "it.yup.screens.CommandListScreen", "IqManager", "xmlstream.Element", "it.yup.screens.ChatScreen", "it.yup.screens.SimpleComposerScreen"});
//			listString.add(new String[]{"UIGauge", "UIHLayout", "UIIContainer"});


			String TC = null;
			HashSet<String> allTestMethods = new HashSet<String>();
			
			for(HashSet<String> key : testCasesPartitionTable.keySet()){
				allTestMethods.addAll(testCasesPartitionTable.get(key));
			}
			
			HashSet<String> selTestClasses = new HashSet<String>(); 
			for(String[] changedMethods : listString){
				for(List<String> d : data){
					for(String s : d){
						if(s.contains("_ESTest")){
							TC = s;
						}else{
							for(String str : changedMethods){
								if(str.contains("Element") || str.contains("KXmlParser") || str.contains("KxmlSerializer") || str.contains("IQResultListener") || str.contains("AboutScreen") || 
										str.contains("AddContactScreen") || str.contains("ChatScreen") || str.contains("CommandListScreen") || str.contains("ContactInfoScreen") || str.contains("DataFormScreen") || 
										str.contains("DataResultScreen") || str.contains("DebugScreen") || str.contains("MessageComposerScreen") || str.contains("OptionsScreen") || str.contains("RegisterScreen") || 
										str.contains("RosterScreen") || str.contains("SimpleComposerScreen") || str.contains("SplashScreen") || str.contains("StatusScreen") || str.contains("TaskListScreen")){
									
									if(s.equals(str)){			//class path check
										selTestClasses.add(TC);	//class path add
									}
								}else{
									String className = s.substring(s.lastIndexOf(".")+1);
									if(className.equals(str)){	//class name check
										selTestClasses.add(TC);	//class path add
									}
								}
							}
						}
					}
				}
				for(String tcMethod : allTestMethods){
					for(String selClass : selTestClasses){
						if(tcMethod.contains(selClass)){		//contain 이라도 Tree, Tree , StaticTree 구분 가능. 문제 없음.
							result.add(tcMethod);
						}
					}
				}
				System.out.println("Final: " + result.size());
				//			System.out.println("fianl execution umber: " + executionNumber);
				
				/* find products to be instrumented */
			/*	HashSet<HashSet<String>> spaceToBeInstantiation = new HashSet<HashSet<String>>(); 
				for(String str : result){
					for(HashSet<String> key : testCasesPartitionTable.keySet()){
						if(testCasesPartitionTable.get(key).contains(str)){
							spaceToBeInstantiation.add(key);
							break;
						}
					}
				}
				
				HashSet<HashSet<String>> hshs = Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1","Lampiro_P2","Lampiro_P3","Lampiro_P4")));
				for(HashSet<String> hs : hshs){
					HashSet<HashSet<String>> clone = (HashSet<HashSet<String>>) spaceToBeInstantiation.clone();
					HashSet<HashSet<String>> cloneRemove = new HashSet<HashSet<String>>();
					for(String t : hs){
						for(HashSet<String> clonet: clone){
							if(clonet.contains(t)){
								cloneRemove.add(clonet);
							}
						}
						clone.removeAll(cloneRemove);
						cloneRemove.clear();
						if(clone.size() == 0){
							System.out.println(hs.toString() + ": " + hs.size());
							break;
						}
					}
				}*/
				selTestClasses.clear();
				result.clear();
			}

			

		}catch(Exception e){
			e.printStackTrace();
		}
		long et2 = System.currentTimeMillis();
		System.out.println("Selection: " + (et2 - st)+" ms");
	}

	public HashSet<HashSet<String>> getImpactedTestSuite(){
		HashSet<HashSet<String>> impactedTestSuiteId = new HashSet<HashSet<String>>(); 

		try{
			writer.write("\r\n--\r\n");
			writer.write("<Affected Space>\r\n");

			for(String s : impactedClassList){
				if(s.equals("")){
					continue;
				}
				Iterator<HashSet<String>> iterator = codePartitionTable.keySet().iterator();

				while (iterator.hasNext()) { 
					HashSet<String> key = (HashSet<String>)iterator.next();

					if(codePartitionTable.get(key).contains(s)){
						affectedProducts.addAll(key);



						/* 6 products */
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,5,8,9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,2,4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,6,8,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(11,16))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,15,16))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,7,11,12))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(11,12,14,16))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4,16))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(6))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,4,11,12))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(12,14,15))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,4,8,10,11))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,3,4,7))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,8,10,16))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8,12,14,15))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(9,12))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4,5,9,12,14,16))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,6,12,16))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,8,10,12,15))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4,6,8,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,4,5,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,4,6,8,9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(11))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(14))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4,7))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,15,16))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,6,7,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,7,9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,2,3,5))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(10,15,16))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,3,6,7,9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(6,7,11))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4,6,8,15))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,15))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,4,7))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(14,15,16))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,5,15))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(6,7,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,6,7,8,10,11,12))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4,5))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4,5,9,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,5,6,7))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4,7,9,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(10))));

				
						/* 4 products */
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,3,5))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,5,7))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,4,3,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,9,8,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8,10,2))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,7,8,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(10,2,4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,7,3,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,1,7,9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(9,3,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,10,2,4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,1,5,10,2))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,4,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,3,8,10,4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,4,3,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,7,1,3))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,7,4,3,5))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,4,9,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,9,5))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,5,1))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8,4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(9,5))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,1,4,9,5))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4,9,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,4,3))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,7,9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,4))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(4,9,3))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,4,9,3,8,8,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,1))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,1,5,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,4,9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,9,5,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8))));
						
						//POWERSET !!
						//						impactedTestSuiteId.addAll(Util.powerSet(key));

						String spaceOnSetFormat = key.toString().replace("[", "{").replace("]", "}");
						writer.write("Space(" + spaceOnSetFormat + ") - by " + s + "\r\n");
						break;
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return impactedTestSuiteId;
	}

	public HashSet<HashSet<String>> func(ArrayList<Integer> list){
		HashSet<HashSet<String>> ret = new HashSet<HashSet<String>>();

		for(Integer i: list){
			if(i == 1){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P2", "Lampiro_P3", "Lampiro_P4", "Lampiro_P5"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P3", "Lampiro_P4"))));
			}
			else if(i == 2){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1", "Lampiro_P3", "Lampiro_P4", "Lampiro_P6"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P2", "Lampiro_P4", "Lampiro_P3"))));
			}
			else if(i == 3){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P3", "Lampiro_P4", "Lampiro_P5", "Lampiro_P6"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P2", "Lampiro_P4", "Lampiro_P1"))));
			}
			else if(i == 4){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1", "Lampiro_P4", "Lampiro_P6"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P2", "Lampiro_P1"))));
			}
			else if(i == 5){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P3", "Lampiro_P4", "Lampiro_P5"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1", "Lampiro_P4", "Lampiro_P3"))));
			}
			else if(i == 6){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1", "Lampiro_P2", "Lampiro_P6"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P2", "Lampiro_P4", "Lampiro_P3", "Lampiro_P1"))));
			}
			else if(i == 7){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P2", "Lampiro_P3", "Lampiro_P5"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1", "Lampiro_P4"))));
			}
			else if(i == 8){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1", "Lampiro_P2", "Lampiro_P4"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1"))));
			}
			else if(i == 9){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1", "Lampiro_P3", "Lampiro_P4"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P2", "Lampiro_P3"))));
			}
			else if(i == 10){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P2"))));
			}
			else if(i == 11){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1", "Lampiro_P6"))));
			}
			else if(i == 12){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P2", "Lampiro_P5"))));
			}
			else if(i == 13){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1", "Lampiro_P2", "Lampiro_P3", "Lampiro_P4", "Lampiro_P5", "Lampiro_P6"))));
			}
			else if(i == 14){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P2", "Lampiro_P3", "Lampiro_P4", "Lampiro_P5", "Lampiro_P6"))));
			}
			else if(i == 15){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1", "Lampiro_P2"))));
			}
			else if(i == 16){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Lampiro_P1", "Lampiro_P2", "Lampiro_P3", "Lampiro_P4"))));
			}
		}

		return ret;
	}

}