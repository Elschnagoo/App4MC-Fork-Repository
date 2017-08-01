/*********************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.editors.sirius.command;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.app4mc.amalthea.editors.sirius.Activator;
import org.eclipse.app4mc.amalthea.editors.sirius.helper.RepresentationQuery;
import org.eclipse.app4mc.amalthea.editors.sirius.helper.ViewPointSelector;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sphinx.emf.util.EcorePlatformUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import com.google.common.base.Preconditions;

/**
 * This action is called for any events that want to open graphical Sirius based editor for an AMALTHEA element.
 */
public class OpenGraphicalEditorAction<S extends IReferable> {

	
	private ILog logger = Activator.getDefault().getLog();
	protected final S sphinxElement;
	protected S element;
	protected Session session;
	protected Class<S> clazz;

	/**
	 * @param clazz
	 *            The {@link Class} of the target element
	 * @param adaptable
	 *            the target element, subclass of {@link IReferable}
	 */
	public OpenGraphicalEditorAction(Class<S> clazz, final S adaptable) {
		this.sphinxElement = adaptable;
		this.clazz = clazz;
		initSession();
	}

	private void initSession() {
		this.session = SessionManager.INSTANCE.getSession(this.sphinxElement);
		if (this.session == null) {
			boolean result = false;
			for (final Session sessionTmp : SessionManager.INSTANCE.getSessions()) {
				result = checkSession(sessionTmp);
			}
			if (!result) {
				IFile iFile = EcorePlatformUtil.getFile(this.sphinxElement);
				IContainer directory = iFile.getParent();
				for (final File file : directory.getLocation().toFile().listFiles()) {
					// lookup for corresponding Sirius file
					if (file.getName().endsWith(".aird")) {
						IFile tmp = EcorePlatformUtil.getFile(URI.createFileURI(file.getPath().toString()));
						URI uri = URI.createPlatformResourceURI(tmp.getFullPath().toString(), true);
						Session session = SessionManager.INSTANCE.getSession(uri, new NullProgressMonitor());
						session.open(new NullProgressMonitor());
						this.session = session;
						if (!checkSession(session)) {
							// handle error case
						}
					}
				}
			}
		}
		else {
			this.element = this.sphinxElement;
		}
	}


	@SuppressWarnings("unchecked")
	private boolean checkSession(Session checkSession) {
		for (final Resource resource : checkSession.getSemanticResources()) {
			if (resource.getURI().equals(this.sphinxElement.eResource().getURI())) {
				this.session = checkSession;
				SessionManager.INSTANCE.add(this.session);
				SessionUIManager.INSTANCE.getOrCreateUISession(this.session);
				// getting the corresponding element from Sirius to proceed
				EObject object = resource.getEObject(this.sphinxElement.eResource().getURIFragment(this.sphinxElement));
				if (object instanceof IReferable
						&& object.getClass().getName().equals(this.sphinxElement.getClass().getName()))
					this.element = (S) object;
				return true;
			}
		}
		return false;
	}

	/**
	 * Execute an action that opens representation. If the representation is not existing, create one.
	 */
	public void execute() {
		Preconditions.checkNotNull(this.session);
		createAndStorePresentation();
		openRepresentation(getRepresentation());
	}

	private void createAndStorePresentation() {
		if (this.session.getSelectedViewpoints(false).isEmpty()) {
			ViewPointSelector.selectViewPoint(this.session);
		}
		if (getRepresentation() == null) {
			createRepresentation();
		}
	}

	/**
	 * Execute the opening action to open graphical editor with the UI Thread.
	 */
	public void executeWithUIThread() {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				execute();
			}
		});
	}

	private DRepresentation getRepresentation() {
		final RepresentationQuery query = new RepresentationQuery(this.element, this.session,
				this.element.getName() + " " + this.clazz.getSimpleName());
		return query.execute();
	}

	private void createRepresentation() {
		final TransactionalEditingDomain transactionalEditingDomain = this.session.getTransactionalEditingDomain();
		transactionalEditingDomain.getCommandStack()
				.execute(new CreateDiagramCommand<S>(this.session, this.element, this.clazz));
	}

	private void openRepresentation(final DRepresentation representation) {
		final IRunnableWithProgress runnable = new IRunnableWithProgress() {
			@Override
			public void run(final IProgressMonitor monitor) {
				try {
					monitor.beginTask("Open Representation", 1);
					DialectUIManager.INSTANCE.openEditor(OpenGraphicalEditorAction.this.session, representation,
							monitor);
				}
				finally {
					monitor.done();
				}
			}
		};
		final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		final IRunnableContext context = new ProgressMonitorDialog(shell);
		try {
			PlatformUI.getWorkbench().getProgressService().runInUI(context, runnable, null);
		}
		catch (InvocationTargetException | InterruptedException e) {
			this.logger.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error at open representation for element ", e));
		}
	}

}
