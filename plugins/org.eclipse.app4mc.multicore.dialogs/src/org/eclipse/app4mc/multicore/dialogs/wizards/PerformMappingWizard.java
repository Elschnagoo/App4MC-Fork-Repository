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
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.dialogs.wizards;

import org.eclipse.app4mc.multicore.dialogs.DialogsPlugin;
import org.eclipse.app4mc.multicore.dialogs.IDialogsConstants;
import org.eclipse.app4mc.multicore.dialogs.openmapping.handlers.PerformMappingJobHandler;
import org.eclipse.app4mc.multicore.dialogs.wizards.page.PerformMappingPage;
import org.eclipse.app4mc.multicore.openmapping.OpenMappingPlugin;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class PerformMappingWizard extends Wizard implements INewWizard {
	/**
	 * OpenMapping Page
	 */
	private PerformMappingPage OMpage;
	/**
	 * Preference store to use
	 */
	private final IPreferenceStore store;
	/**
	 * Selected file
	 */
	private IFile selectedFile;

	private final ExecutionEvent event;

	/**
	 * Constructor for MulticoreWizard.
	 */
	public PerformMappingWizard(final ExecutionEvent event) {
		super();

		setNeedsProgressMonitor(true);

		this.store = DialogsPlugin.getDefaultPreferenceStore();
		this.event = event;

	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {

		this.OMpage = new PerformMappingPage(this.store);

		addPage(this.OMpage);

	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		PerformMappingJobHandler jobLauncher;

		// Clean the view
		UniversalHandler.getInstance().clearModelCheckerView();

		// Use OpenMapping preferences
		jobLauncher = new PerformMappingJobHandler(OpenMappingPlugin.getDefault().getPreferenceStore());

		return jobLauncher.scheduleJob(this.event);

	}

	/**
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(final IWorkbench workbench, final IStructuredSelection selection) {

		if (selection.getFirstElement() instanceof IFile) {
			this.selectedFile = (IFile) selection.getFirstElement();
		}

		// Set this value to the store
		this.store.setValue(IDialogsConstants.PRE_SW_MODEL_LOCATION, this.selectedFile.getLocation().toString());

	}
}