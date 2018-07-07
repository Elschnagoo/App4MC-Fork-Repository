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

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class LogView extends ViewPart {
	/**
	 * Problem icon.
	 */
	private static final Image PROBLEM_ICON = PlatformUI.getWorkbench().getSharedImages()
			.getImage(ISharedImages.IMG_DEF_VIEW);
	/**
	 * Tree view control.
	 */
	private TreeViewerLog treeViewer;

	/**
	 * Constructor.
	 */
	public LogView() {
		super();

		setTitleImage(PROBLEM_ICON);
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(final Composite parent) {
		this.treeViewer = new TreeViewerLog(parent);
	}

	/**
	 * Flush the view's log
	 */
	public void flush() {
		this.treeViewer.flush();
	}

	/**
	 * Set the log
	 */
	public void setLog(final ArrayList<LoggerEntry> log) {
		this.treeViewer.setLog(log);
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// Do nothing.
	}

}
