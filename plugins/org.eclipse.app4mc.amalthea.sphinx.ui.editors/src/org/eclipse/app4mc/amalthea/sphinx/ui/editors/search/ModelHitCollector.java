/**
 ********************************************************************************
 * Copyright (c) 2013-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.search;

import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.sphinx.ui.editors.messages.Messages;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.ISearchResult;
import org.eclipse.sphinx.emf.ui.util.EcoreUIUtil;
import org.eclipse.ui.IEditorInput;

public class ModelHitCollector implements ISearchQuery {

	private final ModelSearchResult searchResult;
	private final Pattern namePattern;
	private final Class<INamed> filterClass;
	private final boolean fileScope;
	private final EObject model;
	private final IEditorInput editorInput;

	public ModelHitCollector(final Pattern pattern, final Class<INamed> filter, final boolean isFileScope, final EObject model, final IEditorInput input) {
		this.searchResult = new ModelSearchResult(this);
		this.namePattern = pattern;
		this.filterClass = filter;
		this.fileScope = isFileScope;
		this.model = model;
		this.editorInput = input;
	}

	/**
	 * Performs the search. Current implementation checks all elements with a name attribute of type {@link String} if
	 * the given namePattern matches.
	 *
	 * @see org.eclipse.search.ui.ISearchQuery#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public IStatus run(final IProgressMonitor monitor) throws OperationCanceledException {
		this.searchResult.removeAll();

		// search the index
		Set<? extends INamed> resultSet = AmaltheaIndex.getElements(model, namePattern, filterClass);

		for (INamed element : resultSet) {
			if (model.eResource() == element.eResource()) {
				// element is opened in current editor
				this.searchResult.addMatch(new SearchMatch(element, 0, 0, editorInput));
			} else {
				// element is in a different file
				if (fileScope == false) {
					IEditorInput input = EcoreUIUtil.createURIEditorInput(element.eResource());
					this.searchResult.addMatch(new SearchMatch(element, 0, 0, input));
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
