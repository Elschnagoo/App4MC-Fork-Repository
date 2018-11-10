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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeNodeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class SearchResultTreeContentProvider extends TreeNodeContentProvider {

	private final Object[] NO_OBJECTS = {};
	private final TreeNode[] NO_NODES = {};

	private ModelSearchResult searchResult;
	private Object[] elements = NO_OBJECTS;
	private TreeNode[] types = NO_NODES;

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
		this.types = NO_NODES;
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer,
	 *      java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		clear();
		if (newInput instanceof ModelSearchResult) {
			this.searchResult = (ModelSearchResult) newInput;

			this.elements = this.searchResult.getElements();
			Arrays.parallelSort(this.elements, new ObjectComparator());
		} else {
			this.searchResult = null;
		}
	}

	public void addElements(final Object[] newElements) {
		if (newElements.length == 0) {
			return; // nothing to add
		}

		// update and sort elements array
		this.elements = concatenate(this.elements, newElements);
		Arrays.parallelSort(this.elements, new ObjectComparator());
		// reset nodes array
		this.types = NO_NODES;
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
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(final Object inputElement) {
		if (inputElement != this.searchResult || elements.length == 0) {
			return NO_OBJECTS;
		}

		if (this.types.length == 0) {
			// create nodes and group by element type
			HashMap<String, List<TreeNode>> tmpMap = new HashMap<String, List<TreeNode>>();
			for (Object element : this.elements) {
				String className = element.getClass().getName();
				TreeNode node = new TreeNode(element);
				List<TreeNode> tmpList;
				if (tmpMap.containsKey(className)) {
					tmpList = tmpMap.get(className);
				} else {
					tmpList = new ArrayList<TreeNode>();
					tmpMap.put(className, tmpList);
				}
				tmpList.add(node);
			}
			// populate type nodes
			String[] classNames = tmpMap.keySet().toArray(new String[0]);
			Arrays.sort(classNames);
			List<TreeNode> typeList = new ArrayList<TreeNode>();
			for (String name : classNames) {
				List<TreeNode> nodeList = tmpMap.get(name);
				EClass eClass = ((EObject) nodeList.get(0).getValue()).eClass();
				TreeNode typeNode = new TreeNode(eClass);
				typeNode.setChildren(nodeList.toArray(new TreeNode[nodeList.size()]));
				typeList.add(typeNode);
			}
			this.types = typeList.toArray(new TreeNode[typeList.size()]);
		}
		return this.types;
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(final Object parentElement) {
		final Object[] tmp = super.getChildren(parentElement);
		return (tmp != null) ? tmp : NO_OBJECTS;
	}

	private class ObjectComparator implements Comparator<Object> {

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
