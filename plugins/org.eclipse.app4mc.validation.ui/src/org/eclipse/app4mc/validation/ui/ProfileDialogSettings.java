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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.validation.annotation.ProfileGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.util.ProfileManager;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.TreeNode;

public class ProfileDialogSettings {

	private final String KEY_SELECTED_PROFILE_CLASSES = "Validation_SelectedProfileClasses";
	
	// dialog input
	private Map<Class<? extends IProfile>, TreeNode> rootProfiles = new HashMap<>();;
	private Set<String> selectedProfileClassNames = new HashSet<>();

	// dialog result
	boolean dialogSuccess = false;
	public List<Class<? extends IProfile>>dialogResults = null;
	
	// dialog setup
	
	public void addAllRegisteredProfileClasses() {
		Map<String, Class<? extends IProfile>> profileMap = ProfileManager.getRegisteredProfileClasses();
		for (Class<? extends IProfile> profileClass : profileMap.values()) {
			addRootProfile(profileClass);
		}
	}
	
	public void addRootProfile(final Class<? extends IProfile> profileClass) {
		TreeNode node = new TreeNode(profileClass);
		addSubNodes(node);
		
		rootProfiles.put(profileClass, node);
	}

	public void removeRootProfile(final Class<? extends IProfile> profileClass) {
		rootProfiles.remove(profileClass);
	}

	public void setSelectedProfileClassNames(List<String> classNames) {
		selectedProfileClassNames.clear();
		selectedProfileClassNames.addAll(classNames);
	}

	// methods required by tree view
	
	public TreeNode[] getRootNodes() {
		return rootProfiles.values().stream().toArray(TreeNode[]::new);
	}

	public TreeNode[] getSelectedNodes() {
		List<TreeNode> allNodes = new ArrayList<>();
		
		for (TreeNode rootNode : rootProfiles.values()) {
			allNodes.add(rootNode);
			collectSubNodes(rootNode, allNodes);
		}
		
		return allNodes.stream()
				.filter( e -> selectedProfileClassNames.contains(((Class<?>) e.getValue()).getName()) )
				.toArray(TreeNode[]::new);
	}

	// dialog settings store
	
	public void loadFrom(IDialogSettings store) {
		if (store == null) return;
		
		// KEY_SELECTED_PROFILE_CLASSES
		String[] classNames = store.getArray(KEY_SELECTED_PROFILE_CLASSES);
		if (classNames != null) {
			setSelectedProfileClassNames(Arrays.asList(classNames));			
		}
	}

	public void saveTo(IDialogSettings store) {
		if (store == null) return;
		if (!dialogSuccess || dialogResults == null) return;
		
		// KEY_SELECTED_PROFILE_CLASSES
		String[] classNames = dialogResults.stream().map(cls -> cls.getName()).toArray(String[]::new);
		store.put(KEY_SELECTED_PROFILE_CLASSES, classNames);
	}

	// some helper methods
	
	private void collectSubNodes(TreeNode node, List<TreeNode> list) {
		if (node.hasChildren()) {
			for (TreeNode subNode : node.getChildren()) {
				list.add(subNode);
				collectSubNodes(subNode, list);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void addSubNodes(TreeNode node) {
		List<Class<? extends IProfile>> forbiddenClasses = forbiddenSubProfiles(node);
		Class<? extends IProfile> profileClass = (Class<? extends IProfile>) node.getValue();
		ArrayList<TreeNode> subnodeList = new ArrayList<TreeNode>();
		
		ProfileGroup[] profileGroupList = profileClass.getAnnotationsByType(ProfileGroup.class);
		for (ProfileGroup pGroup : profileGroupList) {
			for (Class<? extends IProfile> pClass : pGroup.profiles()) {
				if (pClass != null && !forbiddenClasses.contains(pClass)) {
					TreeNode newNode = new TreeNode(pClass);
					newNode.setParent(node);
					subnodeList.add(newNode);
					
					addSubNodes(newNode);
				}
			}
		}
		
		node.setChildren(subnodeList.stream().toArray(TreeNode[]::new));
	}

	@SuppressWarnings("unchecked")
	private List<Class<? extends IProfile>> forbiddenSubProfiles(TreeNode node) {
		List<Class<? extends IProfile>> classes = new ArrayList<>();
		
		for (TreeNode n = node; n != null; n = n.getParent()) {
			Class<? extends IProfile> pc = (Class<? extends IProfile>) n.getValue();
			if (pc != null) classes.add(pc);
		}
		return classes;	
	}

}
