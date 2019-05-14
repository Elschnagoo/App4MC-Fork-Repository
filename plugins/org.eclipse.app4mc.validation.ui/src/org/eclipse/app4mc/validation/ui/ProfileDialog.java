/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.validation.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.ui.provider.ProfileContentProvider;
import org.eclipse.app4mc.validation.ui.provider.ProfileLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;

public class ProfileDialog extends CheckedTreeSelectionDialog {

	private ProfileDialogSettings settings;
	
	public ProfileDialog(Shell parentShell, ProfileDialogSettings set) {
		this(parentShell, new ProfileLabelProvider(), new ProfileContentProvider(), set);
	}
	
	public ProfileDialog(Shell parentShell, ILabelProvider labelProvider, ITreeContentProvider contentProvider, ProfileDialogSettings set) {
		super(parentShell, labelProvider, contentProvider);
		
		if (set != null)
			settings = set;
		else
			settings = new ProfileDialogSettings();
		
		initializeDialog();
	}

	@Override
	protected void setReturnCode(int code) {
		// handle settings - save UI content
		if (code == Window.OK) {
			settings.dialogSuccess = true;
			saveDialogResults();
		}
		
		super.setReturnCode(code);
	}

	@Override
	protected Label createMessageArea(Composite composite) {
		Label label = new Label(composite, SWT.WRAP);
		if (getMessage() != null) {
			label.setText(getMessage());
		}
		label.setFont(composite.getFont());
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, false);
		gd.widthHint = 300;
		label.setLayoutData(gd);
		return label;
	}

	private void initializeDialog() {
		this.setContainerMode(true);
		this.setMessage("Choose profiles");
		this.setTitle("Validations");
		this.setInput(settings);
		
		// set initial selection
		TreeNode[] initialSelections = settings.getSelectedNodes();
		this.setInitialSelections(initialSelections);

		// expand tree
		Set<TreeNode> set = new HashSet<>();
		for (TreeNode treeNode : initialSelections) {
			collectParents(treeNode, set);
		}
		this.setExpandedElements(set.stream().toArray());
	}

	private void saveDialogResults() {
		Object[] dialogResults = getResult();
		if (dialogResults == null) return;
		
		List<TreeNode> filteredNodes = filterResult(dialogResults);
		
		List<Class<? extends IProfile>> selectedProfiles = new ArrayList<>();
		
		for (TreeNode node : filteredNodes) {
			Object value = node.getValue();
			if (value != null && value instanceof Class<?>) {
				Class<?> cls = (Class<?>) value;
				if (IProfile.class.isAssignableFrom(cls)) {
					Class<? extends IProfile> profileClass = cls.asSubclass(IProfile.class);
					selectedProfiles.add(profileClass);
				}
			}
		}
		
		// save current selection
		settings.dialogResults = selectedProfiles;
	}

	// some helper methods

	private static List<TreeNode> filterResult(Object[] dialogResults) {
		List<TreeNode> initialNodes = new ArrayList<>();
		Set<TreeNode> nodesToRemove = new HashSet<>();
		
		// 1. initialize list
		for (Object obj : dialogResults) {
			if (obj instanceof TreeNode) {
				initialNodes.add((TreeNode) obj);
			}
		}
		
		// 2. bottom up: parents with partially selected children must be removed
		for (TreeNode node : initialNodes) {
			if (node.hasChildren() && !nodesToRemove.contains(node)) {
				if (Arrays.stream(node.getChildren()).anyMatch(c -> !initialNodes.contains(c))) {
					nodesToRemove.add(node);
					nodesToRemove.addAll(getParents(node));
				}
			}
		}
		
		// 3. top down: if node is selected then all sub nodes can be removed
		for (TreeNode node : initialNodes) {
			if (node.hasChildren() && !nodesToRemove.contains(node)) {
				nodesToRemove.addAll(getChildren(node));
			}
		}
		
		// finally remove the nodes
		initialNodes.removeAll(nodesToRemove);
		
		return initialNodes;
	}

	private static List<TreeNode> getParents(TreeNode node) {
		List<TreeNode> list = new ArrayList<>();
		collectParents(node, list);
		return list;
	}
	
	private static void collectParents(TreeNode node, Collection<TreeNode> collection) {
		for (TreeNode parent = node.getParent(); parent != null; parent = parent.getParent()) {
			collection.add(parent);
		}
	}

	private static List<TreeNode> getChildren(TreeNode node) {
		List<TreeNode> list = new ArrayList<>();
		collectChildren(node, list);
		return list;
	}
	
	private static void collectChildren(TreeNode node, Collection<TreeNode> collection) {
		if (node.hasChildren()) {
			for (TreeNode child : node.getChildren()) {
				collection.add(child);
				collectChildren(child, collection);
			}
		}
	}

}
