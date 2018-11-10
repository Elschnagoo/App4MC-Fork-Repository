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

import java.util.Arrays;
import java.util.Comparator;

import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class SearchResultContentProvider implements IStructuredContentProvider {

	private final Object[] NO_OBJECTS = {};
	
	private ModelSearchResult searchResult;
	private Object[] elements = NO_OBJECTS;

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
		this.elements = NO_OBJECTS;
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object,
	 *      java.lang.Object)
	 */
	@Override
	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		clear();
		if (newInput instanceof ModelSearchResult) {
			this.searchResult = (ModelSearchResult) newInput;
			
			this.elements = this.searchResult.getElements();
			Arrays.parallelSort(this.elements, new ObjectComparator());
		}
		else {
			this.searchResult = null;
		}
	}

	public void addElements(final Object[] newElements) {
		if (newElements.length == 0) {
			return;	// nothing to add
		}
		
		this.elements = concatenate(this.elements, newElements);
		Arrays.parallelSort(this.elements, new ObjectComparator());
	}
	
	private Object[] concatenate(Object[] a, Object[] b) {
	    int aLen = a.length;
	    int bLen = b.length;

	    Object[] c = new Object[aLen + bLen];
	    System.arraycopy(a, 0, c, 0, aLen);
	    System.arraycopy(b, 0, c, aLen, bLen);

	    return c;
	}

	/**
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(final Object inputElement) {
		if (inputElement != this.searchResult) {
			return NO_OBJECTS;			
		}

		return this.elements;
	}

	private class ObjectComparator implements Comparator<Object> {

		public ObjectComparator() {
		}

		/**
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		@Override
		public int compare(final Object o1, final Object o2) {
			final INamed n1 = (INamed) o1;
			final INamed n2 = (INamed) o2;
			
			if (n1.getName() != null && n2.getName() != null) {
				return n1.getName().compareTo(n2.getName());
			}
			return 0;
		}

	}

}
