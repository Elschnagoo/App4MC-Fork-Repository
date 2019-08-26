/**
 ********************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.ui.simmenu.handlers;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMMapping;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMUtil;
import org.eclipse.app4mc.multicore.execution.ui.simmenu.wizards.TaskVisuWizard;
import org.eclipse.app4mc.multicore.execution.ui.traceview.TraceViewUtil;
import org.eclipse.app4mc.multicore.execution.ui.widget.emtracewidget.IEMTraceWidget;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import javax.swing.*;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SimMenuHandler extends AbstractHandler {

	IEMTraceWidget tw;
	OMMapping ommodel;
	private ConstraintsModel cmmodel;

	/**
	 * The constructor.
	 */
	public SimMenuHandler() {
	}

	/**
	 * start task visualization setup for selected model
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		final UniversalHandler uh = UniversalHandler.getInstance();
		final IFile file = uh.getSelectedFile(event);
		if (!readModels(file)) {
			MessageDialog.openInformation(window.getShell(), "Task Exec Visualization", "No Mapping- or Constraints-Model available! Select file with Mapping-Model.");
			return null;
		}
		tw= TraceViewUtil.showEMTraceView();
		if (tw==null) {
			MessageDialog.openInformation(window.getShell(), "Task Exec Visualization", "Can't display TraceView!");
			return null;
		}

		showWizard(window.getShell(),file.getLocation().toOSString());
		return null;
	}

	private void showWizard(Shell shell,String path) {
		if(tw.getFinish()){
			JOptionPane.showMessageDialog(null,"Please close the TraceView Tab before you start a new run","Error",JOptionPane.ERROR_MESSAGE);

			return;
		}
		WizardDialog wizardDialog = new WizardDialog(shell, new TaskVisuWizard(tw,ommodel,cmmodel,path));
		
		if (wizardDialog.open() == Window.OK) {
			System.out.println("Ok pressed");
		} else {
			System.out.println("Cancel pressed");
		}
	}


	private boolean readModels(IFile file) {
		if(file == null){
			return false;
		}
		
		UniversalHandler uh = UniversalHandler.getInstance();
		URI uri =URI.createPlatformResourceURI(file.getFullPath().toString(), true);

		uh.dropCache();
		
		if(uri==null){
			return false;
		}
		uh.readModels(uri, true);
		
		cmmodel = uh.getConstraintsModel();
		
		final MappingModel m = uh.getMappingModel();
		if (m == null) {
			return false;
		}
		ommodel = OMUtil.createOMMapping(m)	;
		
		
		return true;
	}
}
