/*
 * FormHandler.java
 *
 * Copyright (C) 2007 Irving Bunton
 * http://code.google.com/p/jlogmicro/source
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
// Expand to define CLDC define
//#define DCLDCV10
// Expand to define logging define
//#define DLOGGING
//#ifdef DLOGGING
package net.sf.jlogmicro.util.logging;

import java.util.Date;
import java.util.Vector;
import java.util.Hashtable;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

import net.sf.jlogmicro.util.logging.Handler;
import net.sf.jlogmicro.util.logging.LogRecord;

public class FormHandler extends BufferedHandler {

	private Form form;

	public FormHandler() {
	}

	public void publish(LogRecord record) {
		synchronized (this) {
			int fsize = form.size();
			if ((maxEntries != 0) && (fsize >= maxEntries)) {
				form.delete(fsize - 1);
			}
			form.insert(0, new StringItem(null, formatter.format(record)));
		}
	}

    public void setForm(Form form) {
        this.form = form;
    }

    public Form getForm() {
        return (form);
    }

}
//#endif
