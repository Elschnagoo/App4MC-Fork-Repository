/**
 * *******************************************************************************
 *  Copyright (c) 2013 itemis AG and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     itemis AG - initial API and implementation
 *     Robert Bosch GmbH: Added Listener for refreshing the editor on resource Change
 *
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.sphinx.ui.editors.editor;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.SphinxSupportPlugin;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor;
import org.eclipse.sphinx.emf.ui.util.EcoreUIUtil;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;


public class ExtendedBasicTransactionalFormEditor extends BasicTransactionalFormEditor implements
		IResourceChangeListener {

	private static final String SHOW_TYPES_OF_ELEMENTS = "show_types_of_elements"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor#getCustomAdapterFactory()
	 */
	@Override
	protected AdapterFactory getCustomAdapterFactory() {
		return ExtendedItemProviderAdapterFactory.INSTANCE;
	}

	/**
	 * @see org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor#getEditorInputName()
	 */
	@Override
	protected String getEditorInputName() {
		final IEditorInput editorInput = getEditorInput();
		final URI editorURI = EcoreUIUtil.getURIFromEditorInput(editorInput);
		if (null != editorURI) {
			final String fileName = editorURI.lastSegment();
			return fileName;
		}
		return super.getEditorInputName();
	}

	/**
	 * @see org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor#addPages()
	 */
	@Override
	protected void addPages() {
		// super.addPages();
		try {
			addPage(new ExtendedContentsTreePage(this));
		}
		catch (final PartInitException e) {
			PlatformLogUtil.logAsError(SphinxSupportPlugin.getDefault(), e);
		}
		addResourceChangeListener();
	}

	/**
	 * @param showTypes
	 *            true shows the type names after the element names, false is standard behavior
	 */
	public void setShowTypesOfElements(final boolean showTypes) {
		SphinxSupportPlugin.getDefault().getDialogSettings().put(SHOW_TYPES_OF_ELEMENTS, showTypes);
	}

	/**
	 * @return true shows the type names after the element names, false is standard behavior
	 */
	public boolean isShowTypesOfElements() {
		return SphinxSupportPlugin.getDefault().getDialogSettings().getBoolean(SHOW_TYPES_OF_ELEMENTS);
	}

	/*
	 * Register listener for Resource change: here the context is marker deletion
	 */
	public void addResourceChangeListener() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}

	@Override
	public void resourceChanged(final IResourceChangeEvent event) {
		if (!(getSite().getPage().getActiveEditor() instanceof ExtendedBasicTransactionalFormEditor)) {
			return;
		}

		final ExtendedBasicTransactionalFormEditor activeEditor = (ExtendedBasicTransactionalFormEditor) getSite()
				.getPage().getActiveEditor();

		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				activeEditor.getViewer().refresh();
			}
		});
	}

}
