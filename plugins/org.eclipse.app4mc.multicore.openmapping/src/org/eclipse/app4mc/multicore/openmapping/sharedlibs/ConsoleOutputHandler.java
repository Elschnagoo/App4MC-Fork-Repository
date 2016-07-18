/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.sharedlibs;

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
	private final String name;
	private final MessageConsole console;
	private MessageConsoleStream outStream;
	private final Logger log = Logger.getLogger("org.eclipse.app4mc.multicore.openmapping");

	@SuppressWarnings("javadoc")
	public ConsoleOutputHandler(final String name) {
		this.name = name;
		this.console = fetchConsole();
		if (null != this.console) {
			this.outStream = this.console.newMessageStream();
		}
	}

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
		}
		catch (final NullPointerException e) {
			this.log.info("No Eclipse console available, using default output!");
		}
		return null;
	}

	public void append(final String text) {
		if (null != this.outStream) {
			this.outStream.print(text);
		}
		else {
			this.log.info(text);
		}
	}

	public void appendln(final String text) {
		if (null != this.outStream) {
			this.outStream.println(text);
		}
		else {
			this.log.info(text);
		}
	}

	public void clear() {
		if (null != this.console) {
			this.console.clearConsole();
		}
	}

	public void focus() {
		try {
			final IWorkbench workbench = PlatformUI.getWorkbench();
			final IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
			if (window == null) {
				return; // Skip! //TODO: There should be a better solution for
				// this.
			}
			final IWorkbenchPage page = window.getActivePage();
			final String id = IConsoleConstants.ID_CONSOLE_VIEW;
			IConsoleView view;
			try {
				view = (IConsoleView) page.showView(id);
				view.display(this.console);
				view.setScrollLock(false);
			}
			catch (final PartInitException e) {
				e.printStackTrace();
			}
		}
		catch (final NullPointerException e) {
			this.log.debug("focus: No Eclipse workbench available, nothing to do!");
		}
		catch (final NoClassDefFoundError e) {
			this.log.debug("focus: No Eclipse workbench available, nothing to do!");
		}
	}
}
