/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class ErrorMessageDialog extends MessageDialog {
	/**
	 * Tree view control.
	 */
	private TreeViewerLog treeViewer;
	/**
	 * Log of entries.
	 */
	private ArrayList<LoggerEntry> log;
	/**
	 * Severity.
	 */
	private EntrySeverityLevel severity;
	/**
	 * Button String
	 */
	private final static String[] buttonString = { "OK" };


	public ErrorMessageDialog(final String dialogTitle, final String dialogMessage, final int dialogImageType) {

		super(Display.getCurrent().getActiveShell(), dialogTitle, null, dialogMessage, dialogImageType, buttonString,
				0);

		this.severity = EntrySeverityLevel.OK;
	}

	/**
	 * Set the log.
	 *
	 * @param log
	 *            to to set.
	 */
	public void setLog(final ArrayList<LoggerEntry> log) {
		this.log = log;
	}

	/**
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createCustomArea(final Composite parent) {

		switch (this.severity) {

			case INFO:
			case OK:
				return null;
			case ERROR:
			case WARNING:
				this.treeViewer = new TreeViewerLog(parent);
				this.treeViewer.setLog(this.log);

				return parent;
			default:
				return null;
		}

	}

	/**
	 * Set the severity.
	 *
	 * @param severity
	 *            severity.
	 */
	public void setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;

	}

	/**
	 * @see org.eclipse.jface.dialogs.Dialog#getInitialSize()
	 */
	@Override
	protected Point getInitialSize() {
		switch (this.severity) {
			case ERROR:
			case WARNING:
				return new Point(600, 450);
			default:
				return new Point(600, 200);
		}
	}

}
