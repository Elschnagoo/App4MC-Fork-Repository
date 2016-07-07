/*******************************************************************************
 * Copyright (c) 2015 Timing-Architects Embedded Systems GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.app4mc.amalthea._import.atdb.wizard;

import java.util.List;

import org.eclipse.app4mc.amalthea._import.atdb.ImportTransformation;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.IDE;

public class ImportWizard extends Wizard implements IImportWizard {

	private ImportPage mainPage;
	private IStructuredSelection selection;


	public ImportWizard() {

	}

	@Override
	public void addPages() {
		super.addPages();
		this.mainPage = new ImportPage(this.selection);
		addPage(this.mainPage);
	}

	@Override
	public void init(final IWorkbench workbench, final IStructuredSelection selection) {
		this.selection = selection;

		final List<?> selectedResources = IDE.computeSelectedResources(selection);
		if (!selectedResources.isEmpty()) {
			this.selection = new StructuredSelection(selectedResources);
		}

		setWindowTitle("Import AMALTHEA Model From AMALTHEA Trace Database");
		setNeedsProgressMonitor(true);
	}


	@Override
	public boolean performFinish() {
		final String source = this.mainPage.getSource();
		final IContainer target = this.mainPage.getTargetContainer();

		try {
			final WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {

				@Override
				protected void execute(final IProgressMonitor progressMonitor) {
					try {
						final ImportTransformation transformer = new ImportTransformation(source, target);
						transformer.run(progressMonitor);
						// refresh workspace
						target.refreshLocal(1, progressMonitor);
					}
					catch (final Exception exception) {
						exception.printStackTrace();
					}
					finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(true, true, operation);

		}
		catch (final Exception exception) {
			exception.printStackTrace();
			return false;
		}

		// open new create file in editor
		final IProject project = target.getProject();
		// get the file name of the db
		final int from = Math.max(source.lastIndexOf("/"), source.lastIndexOf("\\"));
		final int to = source.lastIndexOf(".atdb");
		final String name = source.substring(from + 1, to) + ".amxmi";
		final IFile file = project.getFile(name);
		final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			IDE.openEditor(page, file);
		}
		catch (final PartInitException e) {
			e.printStackTrace();
		}

		return true;
	}

}
