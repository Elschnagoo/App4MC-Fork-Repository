/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.labelproviders.DescriptionLabelProvider;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.labelproviders.ResourceLabelProvider;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.labelproviders.TypeLabelProvider;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeNodeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class TreeViewerLog extends TreeViewer {
	/**
	 * Warning icon.
	 */
	private static final Image WRN_ICON = PlatformUI.getWorkbench().getSharedImages()
			.getImage(ISharedImages.IMG_OBJS_WARN_TSK);
	/**
	 * Error icon.
	 */
	private static final Image ERROR_ICON = PlatformUI.getWorkbench().getSharedImages()
			.getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
	/**
	 * Error tree node.
	 */
	private final TreeNode errorNode = new TreeNode(new CategoryTreeNodeInfo("Errors", ERROR_ICON));
	/**
	 * Warning tree node.
	 */
	private final TreeNode warningNode = new TreeNode(new CategoryTreeNodeInfo("Warnings", WRN_ICON));

	/**
	 * Constructor.
	 */
	public TreeViewerLog(final Composite parent) {
		super(parent);


		TreeViewerColumn viewerColumn;

		// Add columns
		viewerColumn = new TreeViewerColumn(this, SWT.MULTI | SWT.V_SCROLL | SWT.NONE | SWT.ICON_WARNING);
		viewerColumn.getColumn().setWidth(500);
		viewerColumn.getColumn().setText("Description");
		viewerColumn.getColumn().setResizable(true);
		viewerColumn.getColumn().setMoveable(true);
		viewerColumn.setLabelProvider(new DescriptionLabelProvider());

		viewerColumn = new TreeViewerColumn(this, SWT.MULTI | SWT.V_SCROLL);
		viewerColumn.getColumn().setWidth(300);
		viewerColumn.getColumn().setText("Resource");
		viewerColumn.getColumn().setResizable(true);
		viewerColumn.getColumn().setMoveable(true);
		viewerColumn.setLabelProvider(new ResourceLabelProvider());

		viewerColumn = new TreeViewerColumn(this, SWT.MULTI | SWT.V_SCROLL);
		viewerColumn.getColumn().setWidth(200);
		viewerColumn.getColumn().setText("Type");
		viewerColumn.getColumn().setResizable(true);
		viewerColumn.getColumn().setMoveable(true);
		viewerColumn.setLabelProvider(new TypeLabelProvider());

		getTree().setHeaderVisible(true);
		getTree().setLinesVisible(true);
		getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		setContentProvider(new TreeNodeContentProvider());

		final ArrayList<TreeNode> categories = new ArrayList<TreeNode>();

		// Add nodes to the tree
		categories.add(this.errorNode);
		categories.add(this.warningNode);
		setInput(categories.toArray(new TreeNode[categories.size()]));

	}

	public void setLog(final ArrayList<LoggerEntry> log) {
		for (final LoggerEntry entry : log) {
			addEntry(entry);
		}
	}

	/**
	 * Add log entry to the view.
	 *
	 * @param entry
	 *            logger entry to add to the view
	 */
	private void addEntry(final LoggerEntry entry) {

		TreeNode category;

		// Select the parent
		switch (entry.getSeverity().getSeverityLevel()) {
			case ERROR:
				category = this.errorNode;
				break;
			case WARNING:
				category = this.warningNode;
				break;
			default:
				category = this.warningNode;
				break;

		}

		final CategoryTreeNodeInfo info = (CategoryTreeNodeInfo) category.getValue();

		// Create already existing children list
		final ArrayList<TreeNode> children;
		if (category.getChildren() != null) {
			children = new ArrayList<TreeNode>(Arrays.asList(category.getChildren()));
		}
		else {
			children = new ArrayList<TreeNode>();
		}


		final TreeNode newNode = new TreeNode(entry);
		newNode.setParent(category);

		// Add new node
		children.add(newNode);

		// Update Category's children
		category.setChildren(children.toArray(new TreeNode[children.size()]));
		info.setCount(children.size());

		// Refresh the tree viewer
		this.refresh(category, true);

	}

	/**
	 * Flush the treeviewer's log
	 */
	public void flush() {

		// Set children to null
		this.errorNode.setChildren(null);
		this.warningNode.setChildren(null);

		// Clear counters of the categories
		((CategoryTreeNodeInfo) this.errorNode.getValue()).setCount(0);
		((CategoryTreeNodeInfo) this.warningNode.getValue()).setCount(0);

		// Refresh the tree viewer
		this.refresh(this.errorNode, true);
		this.refresh(this.warningNode, true);
	}
}
