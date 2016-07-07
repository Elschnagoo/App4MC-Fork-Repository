/**
 * *******************************************************************************
 *  Copyright (c) 2013 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.sphinx.ui.editors.search;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.messages.Messages;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.ISearchResult;
import org.eclipse.ui.IEditorInput;

public class ModelHitCollector implements ISearchQuery {

	private final ModelSearchResult searchResult;

	private final IEditorInput editorInput;

	private final String query;

	private final EObject model;

	@SuppressWarnings("javadoc")
	public ModelHitCollector(final String query, final EObject model, final IEditorInput input) {
		this.searchResult = new ModelSearchResult(this);
		this.query = query;
		this.model = model;
		this.editorInput = input;
	}

	/**
	 * Performs the search. Current implementation checks all elements with a name attribute of type {@link String} if
	 * the given query matches.
	 *
	 * @see org.eclipse.search.ui.ISearchQuery#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public IStatus run(final IProgressMonitor monitor) throws OperationCanceledException {
		this.searchResult.removeAll();
		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(this.model, true);
		while (iterator.hasNext()) {
			final EObject element = iterator.next();
			final EStructuralFeature feature = element.eClass().getEStructuralFeature("name"); //$NON-NLS-1$
			if (null != feature) {
				final String name = (String) element.eGet(feature);
				if (null != name && name.toLowerCase().indexOf(this.query.toLowerCase()) >= 0) {
					this.searchResult.addMatch(new SearchMatch(element, 0, 0, this.editorInput));
				}
			}
		}
		return Status.OK_STATUS;
	}


	/**
	 * @see org.eclipse.search.ui.ISearchQuery#getLabel()
	 */
	@Override
	public String getLabel() {
		return Messages.ModelHitCollector_label;
	}

	/**
	 * @see org.eclipse.search.ui.ISearchQuery#canRerun()
	 */
	@Override
	public boolean canRerun() {
		return true;
	}

	/**
	 * @see org.eclipse.search.ui.ISearchQuery#canRunInBackground()
	 */
	@Override
	public boolean canRunInBackground() {
		return true;
	}

	/**
	 * @see org.eclipse.search.ui.ISearchQuery#getSearchResult()
	 */
	@Override
	public ISearchResult getSearchResult() {
		return this.searchResult;
	}

}
