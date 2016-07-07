/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter.atdb;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import org.eclipse.app4mc.tracing.converter.atdb.model.EntityType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;


public class ATDBConvertHandler extends AbstractHandler implements IRunnableWithProgress {

	private IFile iFile;
	private IFile atdbFile;

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection.isEmpty()) {
			return null;
		}
		if (!(currentSelection instanceof IStructuredSelection)) {
			return null;
		}
		final IStructuredSelection ssel = (IStructuredSelection) currentSelection;
		final Object[] array = ssel.toArray();
		if (array.length != 1) {
			return null;
		}

		final Object obj = array[0];
		if (!(obj instanceof IFile)) {
			return null;
		}
		try {
			this.iFile = (IFile) obj;
			convert(event);
		}
		catch (final InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void convert(final ExecutionEvent event) throws InterruptedException {
		final Shell activeShell = HandlerUtil.getActiveShell(event);

		final String name = this.iFile.getName();

		final IPath atdbFilePath = new Path(name).removeFileExtension().addFileExtension("atdb");
		this.atdbFile = this.iFile.getParent().getFile(atdbFilePath);
		if (this.atdbFile.getLocation().toFile().exists()) {
			final boolean openConfirm = MessageDialog.openConfirm(activeShell, "AMALTHEA Trace DB already exists.",
					"There exists already an AMALTHEA Trace DB at location: " + atdbFilePath.toOSString()
							+ "\n\nDo you want to replace that file?");
			if (!openConfirm) {
				return;
			}
			final File file = this.atdbFile.getLocation().toFile();
			if (!file.delete()) {
				MessageDialog.openError(activeShell, "Deletion failed", "Couldn't delete existing Trace Database: "
						+ file.getAbsolutePath());
				return;
			}
		}

		final ProgressMonitorDialog pmd = new ProgressMonitorDialog(activeShell);
		try {
			pmd.run(false, false, this);
		}
		catch (final InvocationTargetException e) {
			e.printStackTrace();
			ErrorDialog.openError(activeShell, "Error", "Something went wrong during conversion", new Status(
					IStatus.ERROR, "org.eclipse.app4mc.tracing.converter.atdb", e.getMessage(), e.getTargetException()));
		}
	}

	@Override
	public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		try {
			monitor.beginTask("Converting OT1 to AMALTHEA Trace Database (ATDB) format.", 100);

			monitor.subTask("Loading OT1-Model");
			final OT1Type1 loadOT1Model = OT1Loader.loadOT1Model(this.iFile);
			monitor.worked(20);

			monitor.subTask("Creating initial ATDB structure");
			final ATDBWriter atdbWriter = new ATDBWriter();
			try {
				atdbWriter.createATDB(this.atdbFile);
				monitor.worked(5);

				final EList<SchedulingEntityType> schedulingEntities = loadOT1Model.getSchedulingEntity();
				for (final SchedulingEntityType schedEntityType : schedulingEntities) {
					try {
						final EList<SchedulingEntityElementType> element = schedEntityType.getElement();

						monitor.subTask("Insert entities for " + schedEntityType.getName());
						atdbWriter.insertEntities(schedEntityType, element);
						monitor.worked(5);

						monitor.subTask("Insert event-types for " + schedEntityType.getName());
						atdbWriter.insertEventTypes(schedEntityType);
						monitor.worked(5);
					}
					catch (final Exception ex) {
						ex.printStackTrace();
					}
				}

				for (final SchedulingEntityType schedEntityType : schedulingEntities) {
					try {

						final Long insertEntity = atdbWriter.insertEntity(schedEntityType, EntityType.CORE);
						monitor.subTask("Insert trace-entries for " + schedEntityType.getName());
						if (insertEntity != null) {
							atdbWriter.insertTraceEntries(schedEntityType, insertEntity);
							monitor.worked(50);
						}
					}
					catch (final Exception ex) {
						ex.printStackTrace();
					}
				}
				try {
					monitor.subTask("Insert EntitySource entries.");
					atdbWriter.fillEntitySource();
					monitor.worked(10);
				}
				catch (final SQLException e) {
					e.printStackTrace();
				}

				monitor.subTask("Set meta-information.");
				atdbWriter.fillMetaInformation(this.iFile.getLocation().toFile().getAbsolutePath());
				monitor.worked(1);
			}
			finally {
				atdbWriter.close();
			}
			monitor.subTask("Finished.");
			this.atdbFile.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		}
		catch (final CoreException e) {
			throw new InvocationTargetException(e);
		}
	}
}
