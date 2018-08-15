/**
 ********************************************************************************
 * Copyright (c) 2013 Robert Bosch GmbH and others.
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
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.ISearchResult;
import org.eclipse.sphinx.emf.ui.util.EcoreUIUtil;
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
		
		if (query != null) {
			if(query.startsWith("i:")) {
				// New (experimental) search based on Amalthea index (activate with i: as prefix)
				
				String modQuery = query.substring(2);
				
				// ***** Search with Amalthea index
				
				// TODO open customized search dialog
				// case sensitive, regular expression, file scope vs. folder scope, restrict types, ...
				
				Pattern pattern = Pattern.compile("(?i).*" + Pattern.quote(modQuery) + ".*");
				
				Set<? extends INamed> resultSet = AmaltheaIndex.getElements(model, pattern, INamed.class);
				
				// Intermediate solution: filter potential results (folder scope)
				URI folderUri = model.eResource().getURI().trimSegments(1);
				for (INamed element : resultSet) {
					// same folder
					if (element.eResource().getURI().trimSegments(1).equals(folderUri)) {
						IEditorInput input = this.editorInput;
						// different file
						if (model.eResource() != element.eResource()) {
							input = EcoreUIUtil.createURIEditorInput(element.eResource());							
						}
						this.searchResult.addMatch(new SearchMatch(element, 0, 0, input));						
					}
				}
			} else {
				// ***** Previously used element search mechanism (default)
				
				final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(this.model, true);
				while (iterator.hasNext()) {
					final EObject element = iterator.next();
					final EStructuralFeature feature = element.eClass().getEStructuralFeature("name"); //$NON-NLS-1$
					if (null != feature) {
						final String name = (String) element.eGet(feature);
						if (null != name && name.toLowerCase().indexOf( query.toLowerCase()) >= 0) {
							this.searchResult.addMatch(new SearchMatch(element, 0, 0, this.editorInput));
						}
					}
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
