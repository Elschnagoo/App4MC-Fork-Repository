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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeNodeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class SearchResultTreeContentProvider extends TreeNodeContentProvider {

	private ModelSearchResult searchResult;
	private final Set<TreeNode> elements = new LinkedHashSet<TreeNode>();
	private final Map<String, TreeNode> types = new HashMap<String, TreeNode>();
	private boolean groupByTypes = false;

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
		this.types.clear();
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

	@SuppressWarnings("javadoc")
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
				this.elements.add(new TreeNode(element));
				final String name = ((EObject) element).eClass().getName();
				if (!this.types.containsKey(name)) {
					this.types.put(name, new TreeNode(((EObject) element).eClass()));
				}
				final TreeNode node = this.types.get(name);
				List<TreeNode> children = null;
				if (node.hasChildren()) {
					children = new ArrayList<>(Arrays.asList(node.getChildren()));
				}
				else {
					children = new ArrayList<TreeNode>();
				}
				children.add(new TreeNode(element));
				node.setChildren(children.toArray(new TreeNode[children.size()]));
			}
			else {
				this.elements.remove(new TreeNode(element));
				final String name = ((EObject) element).eClass().getName();
				if (this.types.containsKey(name)) {
					final TreeNode node = this.types.get(name);
					List<TreeNode> children = null;
					if (node.hasChildren()) {
						children = new ArrayList<>(Arrays.asList(node.getChildren()));
						children.remove(new TreeNode(element));
						if (children.size() > 0) {
							node.setChildren(children.toArray(new TreeNode[children.size()]));
						}
						else {
							this.types.remove(name);
						}
					}
				}
			}
		}
		// sorting general list
		final List<TreeNode> tmp = new ArrayList<>(this.elements);
		Collections.sort(tmp, new ObjectComparator());
		this.elements.clear();
		this.elements.addAll(tmp);
		// sorting cilds of types
		for (final TreeNode node : this.types.values()) {
			if (node.hasChildren()) {
				final List<TreeNode> childs = new ArrayList<>(Arrays.asList(node.getChildren()));
				Collections.sort(childs, new ObjectComparator());
				node.setChildren(childs.toArray(new TreeNode[childs.size()]));
			}
		}
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(final Object inputElement) {
		if (inputElement == this.searchResult) {
			if (!this.groupByTypes) {
				return this.elements.toArray();
			}
			final List<TreeNode> tmp = new ArrayList<>(this.types.values());
			Collections.sort(tmp, new ObjectComparator());
			return tmp.toArray(new TreeNode[tmp.size()]);
		}
		return new Object[0];
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(final Object parentElement) {
		final Object[] tmp = super.getChildren(parentElement);
		if (null != tmp) {
			return tmp;
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
			final EObject eo1 = (EObject) ((TreeNode) o1).getValue();
			final EObject eo2 = (EObject) ((TreeNode) o2).getValue();
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

	/**
	 * @return the groupByTypes
	 */
	public boolean isGroupByTypes() {
		return this.groupByTypes;
	}

	/**
	 * @param groupByTypes
	 *            the groupByTypes to set
	 */
	public void setGroupByTypes(final boolean groupByTypes) {
		this.groupByTypes = groupByTypes;
	}

}
