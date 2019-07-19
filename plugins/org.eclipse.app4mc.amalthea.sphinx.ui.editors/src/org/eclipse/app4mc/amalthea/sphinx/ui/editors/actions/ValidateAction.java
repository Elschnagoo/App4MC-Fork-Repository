/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.actions;

import java.util.List;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.editor.ExtendedBasicTransactionalFormEditor;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.ui.ProfileDialog;
import org.eclipse.app4mc.validation.ui.ProfileDialogSettings;
import org.eclipse.app4mc.validation.ui.ValidationUIPlugin;
import org.eclipse.app4mc.validation.ui.util.ValidationMarkerHelper;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.MarkerHelper;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ValidateAction extends Action {

	private final ExtendedBasicTransactionalFormEditor editor;

	public ValidateAction(final StructuredViewer viewer, final ExtendedBasicTransactionalFormEditor editor) {
		super("Validate", AS_PUSH_BUTTON);
		this.editor = editor;
		// image taken from platform:/plugin/org.eclipse.wb.core/icons/test.png
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(ValidationUIPlugin.getPluginId(),
				"/icons/full/obj16/test.png")); //$NON-NLS-1$
		setToolTipText("Validate model");
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		final ProfileDialogSettings settings = new ProfileDialogSettings();
		
		// initialize root nodes based on registered profile classes
		settings.addAllRegisteredProfileClasses();
		
		// retrieve stored settings (last selection)
		final IDialogSettings store = ValidationUIPlugin.getDefault().getDialogSettings();
		settings.loadFrom(store);
		
		// open profile selection dialog
		final ProfileDialog dialog = new ProfileDialog(window.getShell(), settings);
		int returnCode = dialog.open();
		
		if (returnCode == Window.OK) {
			final List<Class<? extends IProfile>> selectedProfiles = settings.dialogResults;
			if (selectedProfiles == null || selectedProfiles.isEmpty()) return;
			
			// store settings (last selection)
			settings.saveTo(store);
			
			// debugging
			System.out.println("Selected profiles:");
			for (Class<? extends IProfile> sc : selectedProfiles) {
				System.out.println("  - " + sc.getName());
			}
			System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
			
			// try to get current open model
			final Object input = this.editor.getEditorInputObject();
			if (input == null) return;
			
			EObject tmpModel = null;
			if (input instanceof EObject) {
				tmpModel = (EObject) input;
			}
			else if (input instanceof Resource) {
				if (((Resource) input).getContents().size() > 0) {
					tmpModel = ((Resource) input).getContents().get(0);
				}
			}
			if (tmpModel == null) return;
			
			
			// Run the check validation operation in a workspace job
			final ValidationExecutor executor = new ValidationExecutor(selectedProfiles);
			final EObject model = tmpModel;
			
			final Job job = new Job("Model Validation") {
				protected IStatus run(IProgressMonitor monitor) {
					return executor.validate(model, monitor);
				}
			};
			job.addJobChangeListener(new JobChangeAdapter() {
				public void done(IJobChangeEvent event) {
					if (event.getResult().isOK()) {
						// Update problems view
						
						if (EMFPlugin.IS_RESOURCES_BUNDLE_AVAILABLE) {
							// debugging
							executor.dumpResultMap(null);
							
							// convert results
							BasicDiagnostic diagnostics = new BasicDiagnostic();
							for (ValidationDiagnostic diag : executor.getResults()) {
								diagnostics.add((Diagnostic) diag);				
							}
							
							// update problem markers
							MarkerHelper markerHelper = new ValidationMarkerHelper();
							
							markerHelper.deleteMarkers(model.eResource());

							try {
								markerHelper.createMarkers(diagnostics);
							} catch (CoreException e) {
								// TODO: ignore or log
							}
						}
					}
				}
			});
			job.schedule(); // start as soon as possible

		}
	}

}
