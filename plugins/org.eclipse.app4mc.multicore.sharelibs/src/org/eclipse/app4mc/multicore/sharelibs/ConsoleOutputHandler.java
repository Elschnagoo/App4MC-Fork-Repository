/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.sharelibs;

import org.apache.log4j.Logger;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ConsoleOutputHandler {
	/**
	 * Console's name
	 */
	private final String name;
	/**
	 * Console
	 */
	private final MessageConsole console;
	/**
	 * Console's stream
	 */
	private MessageConsoleStream outStream;
	/**
	 * Logger
	 */
	private final Logger log = Logger.getLogger("org.eclipse.app4mc.multicore.openmapping");

	/**
	 * Constructor
	 * 
	 * @param name
	 *            name of the console
	 */
	public ConsoleOutputHandler(final String name) {
		this.name = name;
		this.console = fetchConsole();
		if (null != this.console && PlatformUI.isWorkbenchRunning()) {
			this.outStream = this.console.newMessageStream();
		} else {
			this.outStream = null;
		}
	}

	/**
	 * Get the console
	 * 
	 * @return console
	 */
	private MessageConsole fetchConsole() {
		try {
			final ConsolePlugin plugin = ConsolePlugin.getDefault();
			final IConsoleManager conMan = plugin.getConsoleManager();
			final IConsole[] allConsoles = conMan.getConsoles();
			for (int i = 0; i < allConsoles.length; i++) {
				if (this.name.equals(allConsoles[i].getName())) {
					return (MessageConsole) allConsoles[i];
				}
			}
			// if it didn't exist, create a new one
			final MessageConsole newConsole = new MessageConsole(this.name, null);
			conMan.addConsoles(new IConsole[] { newConsole });
			return newConsole;
		} catch (final NullPointerException e) {
			this.log.info("No Eclipse console available, using default output!");
		}
		return null;
	}

	/**
	 * Append to the console
	 * 
	 * @param text
	 *            text to append
	 */
	public void append(final String text) {
		if (null != this.outStream) {
			this.outStream.print(text);
		} else {
			this.log.info(text);
		}
	}

	/**
	 * Append to the console with new line at the end
	 * 
	 * @param text
	 *            text to be appended
	 */
	public void appendln(final String text) {
		if (null != this.outStream) {
			this.outStream.println(text);
		} else {
			this.log.info(text);
		}
	}

	/**
	 * Clear the console
	 */
	public void clear() {
		if (null != this.console) {
			this.console.clearConsole();
		}
	}

	/**
	 * Focus the console
	 */
	public void focus() {
		try {
			if (PlatformUI.isWorkbenchRunning()) {
				final IWorkbench workbench = PlatformUI.getWorkbench();
				final IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
				if (window == null) {
					return;
				}
				final IWorkbenchPage page = window.getActivePage();
				final String id = IConsoleConstants.ID_CONSOLE_VIEW;
				IConsoleView view;
				try {
					view = (IConsoleView) page.showView(id);
					view.display(this.console);
					view.setScrollLock(false);
				} catch (final PartInitException e) {
					e.printStackTrace();
				}
			}
		} catch (final NullPointerException e) {
			this.log.debug("focus: No Eclipse workbench available, nothing to do!");
		} catch (final NoClassDefFoundError e) {
			this.log.debug("focus: No Eclipse workbench available, nothing to do!");
		}
	}
}
