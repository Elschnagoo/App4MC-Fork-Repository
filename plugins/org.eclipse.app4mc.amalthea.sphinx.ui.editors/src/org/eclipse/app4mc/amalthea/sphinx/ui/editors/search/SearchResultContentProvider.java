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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class SearchResultContentProvider implements IStructuredContentProvider {

	private ModelSearchResult searchResult;

	private final Set<Object> elements = new LinkedHashSet<Object>();

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		// nothing to do
	}

	/**
	 * Clears the current search result
	 */
	public void clear() {
		this.elements.clear();
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object,
	 *      java.lang.Object)
	 */
	@Override
	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		if (newInput instanceof ModelSearchResult) {
			this.searchResult = (ModelSearchResult) newInput;
			this.elements.clear();
			updateElements(this.searchResult.getElements());
		}
		else {
			this.searchResult = null;
			this.elements.clear();
		}
	}

	public void updateElements(final Object[] newElements) {
		for (final Object element : newElements) {
			boolean toAdd = false;
			for (final Object elem : this.searchResult.getElements()) {
				if (elem.equals(element)) {
					toAdd = true;
					break;
				}
			}
			if (toAdd) {
				this.elements.add(element);
			}
			else {
				this.elements.remove(element);
			}
		}
		final List<Object> tmp = new ArrayList<>(this.elements);
		Collections.sort(tmp, new ObjectComparator());
		this.elements.clear();
		this.elements.addAll(tmp);
	}

	/**
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(final Object inputElement) {
		if (inputElement == this.searchResult) {
			return this.elements.toArray();
		}
		return new Object[0];
	}

	private class ObjectComparator implements Comparator<Object> {

		public ObjectComparator() {
		}

		/**
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		@Override
		public int compare(final Object o1, final Object o2) {
			final EObject eo1 = (EObject) o1;
			final EObject eo2 = (EObject) o2;
			final EStructuralFeature feature1 = eo1.eClass().getEStructuralFeature("name"); //$NON-NLS-1$
			final EStructuralFeature feature2 = eo2.eClass().getEStructuralFeature("name"); //$NON-NLS-1$
			String name1 = null;
			String name2 = null;
			if (null != feature1 && null != feature2) {
				name1 = (String) eo1.eGet(feature1);
				name2 = (String) eo2.eGet(feature2);
			}
			if (null != name1 && null != name2) {
				return name1.compareTo(name2);
			}
			return 0;
		}

	}

}
