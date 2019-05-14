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
import org.eclipse.app4mc.validation.core.Result;
import org.eclipse.app4mc.validation.ui.ProfileDialog;
import org.eclipse.app4mc.validation.ui.ProfileDialogSettings;
import org.eclipse.app4mc.validation.ui.ValidationUIPlugin;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
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
			
			// try to get current open model
			final Object input = this.editor.getEditorInputObject();
			if (input == null) return;
			
			EObject model = null;
			if (input instanceof EObject) {
				model = (EObject) input;
			}
			else if (input instanceof Resource) {
				if (((Resource) input).getContents().size() > 0) {
					model = ((Resource) input).getContents().get(0);
				}
			}
			if (model == null) return;
			
			// validate
			ValidationExecutor executor = new ValidationExecutor(selectedProfiles);
			List<Result> results = executor.validate(model);
			
			// show results
			
			System.out.println("Selected profiles:");
			for (Class<? extends IProfile> sc : selectedProfiles) {
				System.out.println("  - " + sc.getName());
			}
			System.out.println("Result:");
			for (Result result : results) {
				System.out.println("    " + result.getMessageId() + " -- " + result.getSeverityLevel());
				System.out.println("    " + result.getMessage());
				System.out.println("    --------------------------------");
			}
		}
	}

}
