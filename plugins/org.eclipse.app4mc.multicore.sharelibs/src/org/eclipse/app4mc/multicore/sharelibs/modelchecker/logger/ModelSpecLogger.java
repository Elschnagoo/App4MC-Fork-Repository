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

package org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger;

import java.util.ArrayList;

import org.eclipse.app4mc.multicore.sharelibs.ConsoleOutputHandler;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class ModelSpecLogger {
	/**
	 * Entries log.
	 */
	private final ArrayList<LoggerEntry> log = new ArrayList<LoggerEntry>();


	/**
	 * Static builder
	 *
	 * @return a newly created Logger
	 */
	public static ModelSpecLogger of() {
		return new ModelSpecLogger();
	}

	/**
	 * Add entry to the logger.
	 *
	 * @param entry
	 *            entry to add.
	 */
	public void addEntry(final LoggerEntry entry) {
		this.log.add(entry);
	}

	/**
	 * Print the log to the standard output.
	 */
	public void printLog() {
		System.out.print(this);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String log = "";

		for (final LoggerEntry entry : this.log) {
			log += " | +- " + entry + "\n";
		}

		return log;
	}

	/**
	 * Print the log to the standard output.
	 *
	 * @param con
	 *            console to be logged to
	 */
	public void logToConsole(final ConsoleOutputHandler con) {
		con.append(toString());
	}

	/**
	 * Flush the log.
	 */
	public void flushLog() {
		this.log.clear();

		final LogView checkerView = (LogView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.findView("org.eclipse.app4mc.multicore.sharelibs.modelchecker.views.ModelCheckerView");

		if (checkerView != null) {
			checkerView.flush();
		}

	}

	/**
	 * Log to the view.
	 */
	public void logToView() {
		try {
			final LogView checkerView = (LogView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.showView("org.eclipse.app4mc.multicore.sharelibs.modelchecker.views.ModelCheckerView");

			checkerView.setLog(this.log);

		}
		catch (final PartInitException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open message box.
	 */
	public void openMessageBox() {
		final ErrorMessageDialog dialogBox;

		switch (getHighestLoggedSeverityLevel()) {
			case ERROR:
				dialogBox = new ErrorMessageDialog("Error", // Title
						"Model Checker found error(s) in the model. Please review them. If you want to review them later, all the issues are also stored in the Model Checker View's log.", // Message
						MessageDialog.ERROR); // Message type
				dialogBox.setLog(this.log);
				dialogBox.setSeverity(EntrySeverityLevel.ERROR);
				dialogBox.open();
				break;
			case WARNING:
				dialogBox = new ErrorMessageDialog("Warning", // Title
						"Model Checker found warning(s) in the model. Please review them. If you want to review them later, all the issues are also stored in the Model Checker View's log.", // Message
						MessageDialog.WARNING);// Message type
				dialogBox.setLog(this.log);
				dialogBox.setSeverity(EntrySeverityLevel.WARNING);
				dialogBox.open();
				break;
			default:
				dialogBox = new ErrorMessageDialog("Successful", // Title
						"Process finished successfully!", // Message
						MessageDialog.INFORMATION); // Message type
				dialogBox.setLog(this.log);
				dialogBox.setSeverity(EntrySeverityLevel.INFO);
				dialogBox.open();
				break;
		}
	}

	/**
	 * Get the highest severity level within the log.
	 *
	 * @return highest severity
	 */
	private EntrySeverityLevel getHighestLoggedSeverityLevel() {
		EntrySeverity severity = EntrySeverity.of(EntrySeverityLevel.OK);

		for (final LoggerEntry entry : this.log) {
			if (entry.getSeverity().compareTo(severity) > 0) {
				severity = entry.getSeverity();
			}
		}

		return severity.getSeverityLevel();
	}

	/**
	 * Get the amount of entries in the log
	 *
	 * @return amount of entries in the log
	 */
	public int getLogSize() {
		return this.log.size();
	}

}
