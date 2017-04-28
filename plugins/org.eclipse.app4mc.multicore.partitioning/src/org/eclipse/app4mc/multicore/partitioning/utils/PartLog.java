/*******************************************************************************
 * Copyright (c) 2016 FH-Dortmund and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     FH-Dortmund - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.utils;

import org.apache.log4j.Logger;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class PartLog {

	protected Logger partlog;
	private boolean enableTargetConsoleLog;
	private boolean enableSourceConsoleLog;
	private MessageConsole console;
	private MessageConsoleStream outStream;

	public static PartLog getInstance() {
		return PartLogHandler.PL_INSTANCE;
	}

	private static class PartLogHandler {
		public static final PartLog PL_INSTANCE = new PartLog();
	}

	public void setLogName(final String name) {
		this.partlog = Logger.getLogger(name);
	}

	public void log(final String message) {
		if (isEnableSourceConsoleLog()) {
			this.partlog.info(message);
		}
		if (isEnableTargetConsoleLog()) {
			this.console = fetchConsole();
			if (null != this.console) {
				try {
					this.outStream.println(message);
				}
				catch (final Exception e) {
					this.outStream = this.console.newMessageStream();
					this.outStream.println(message);
				}
			}
			else {
				System.out.println("NO CONSOLE");
			}
		}
	}

	private MessageConsole fetchConsole() {
		try {
			final ConsolePlugin plugin = ConsolePlugin.getDefault();
			final IConsoleManager conMan = plugin.getConsoleManager();
			final IConsole[] allConsoles = conMan.getConsoles();
			for (int i = 0; i < allConsoles.length; i++) {
				if (allConsoles[i].getName().equals("Partitioning")) {
					return (MessageConsole) allConsoles[i];
				}
			}
			// if it didn't exist, create a new one
			final MessageConsole newConsole = new MessageConsole("Partitioning", null);
			conMan.addConsoles(new IConsole[] { newConsole });
			return newConsole;
		}
		catch (final NullPointerException e) {
			System.out.println("No Eclipse console available, using default output!");
		}
		return null;
	}

	public void logSimple(final String message) {
		System.out.println(message);
		// if (!isEnableTargetConsoleLog()) {
		this.console = fetchConsole();
		if (null != this.console) {
			try {
				this.outStream.println(message);
			}
			catch (final Exception e) {
				this.outStream = this.console.newMessageStream();
				this.outStream.println(message);
			}
		}
		// }
	}

	public void log(final String message, final Exception e) {
		if (isEnableSourceConsoleLog()) {
			if (e != null) {
				this.partlog.error(message + " " + e.getClass().getName(), e.getCause());
			}
			else {
				this.partlog.error("Error: " + message);
			}
		}
		if (isEnableTargetConsoleLog()) {
			this.console = fetchConsole();
			if (null != this.console) {
				try {
					if (null != e) {
						this.outStream.println(message + " " + e.getCause().toString());
					}
					else {
						this.outStream.println("Error: " + message);
					}
				}
				catch (final Exception e1) {
					this.outStream = this.console.newMessageStream();
					this.outStream.println(message + " " + e1.toString());
				}
			}
			else {
				log("NO CONSOLE");
			}
		}
	}

	public boolean isEnableTargetConsoleLog() {
		return this.enableTargetConsoleLog;
	}

	public void setEnableTargetConsoleLog(final boolean enableTargetConsoleLog) {
		this.enableTargetConsoleLog = enableTargetConsoleLog;
	}

	public boolean isEnableSourceConsoleLog() {
		return this.enableSourceConsoleLog;
	}

	public void setEnableSourceConsoleLog(final boolean enableSourceConsoleLog) {
		this.enableSourceConsoleLog = enableSourceConsoleLog;
	}
}
