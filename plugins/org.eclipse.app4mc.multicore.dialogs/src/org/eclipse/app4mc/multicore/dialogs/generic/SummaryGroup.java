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
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.dialogs.generic;

import java.util.ArrayList;

import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.dialogs.IDialogsConstants;
import org.eclipse.app4mc.multicore.openmapping.IOMConstants;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractMappingAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.workflow.GenerateMapping;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.app4mc.multicore.partitioning.algorithms.PerformPartitioning;
import org.eclipse.app4mc.multicore.sharelibs.OutputPathParser;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeNodeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class SummaryGroup extends AbstractGroup {
	/**
	 * Tree view control
	 */
	TreeViewer treeViewer;

	/**
	 * Tree node provide that prints the TreeNode string value
	 */
	public class TreeNodeLabelProvider extends CellLabelProvider {
		@Override
		public void update(final ViewerCell arg0) {
			arg0.setText(((TreeNode) arg0.getElement()).getValue().toString());
		}
	}

	/**
	 * Constructor
	 *
	 * @param parent
	 *            parent composite
	 * @param store
	 *            preferences store
	 */
	public SummaryGroup(final Composite parent, final IPreferenceStore store) {
		super(parent, store);

		final GridLayout layout = new GridLayout(1, false);
		final GridData gridData = new GridData(GridData.FILL_BOTH);

		// Configure Group
		this.group.setText("Summary");
		this.group.setLayoutData(gridData);
		this.group.setLayout(layout);

		this.treeViewer = new TreeViewer(this.group);
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(this.treeViewer, SWT.MULTI | SWT.V_SCROLL);
		viewerColumn.getColumn().setWidth(300);
		viewerColumn.getColumn().setText("Names");
		viewerColumn.setLabelProvider(new TreeNodeLabelProvider());

		this.treeViewer.getTree().setHeaderVisible(true);
		this.treeViewer.getTree().setLinesVisible(true);
		this.treeViewer.getTree().setLayout(layout);
		this.treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		this.treeViewer.setContentProvider(new TreeNodeContentProvider());

		update();

	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.AbstractGroup#update()
	 */
	@Override
	public boolean update() {

		final ArrayList<TreeNode> steps = new ArrayList<TreeNode>();
		TreeNode[] array = null;

		TreeNode general;

		final OutputPathParser outputParser = new OutputPathParser(IDialogsConstants.PRE_OUTPUT_PATH_RADIO,
				IDialogsConstants.PRE_OUTPUT_PATH, this.store);

		steps.add(general = new TreeNode("General"));
		final TreeNode[] children2 = new TreeNode[2];
		children2[0] = new TreeNode(
				"Logging: " + (this.store.getBoolean(IDialogsConstants.PRE_GLOBAL_LOGGING) ? "Yes" : "No"));
		children2[1] = new TreeNode("Output Path: " + outputParser.parseOutputDirectoryGeneric());

		general.setChildren(children2);

		// Partitioning Summary
		if (this.store.getBoolean(IDialogsConstants.PRE_CHECK_PARTITIONING)) {
			TreeNode partNode;
			steps.add(partNode = new TreeNode("Partitioning"));

			final ArrayList<TreeNode> partitioning = new ArrayList<TreeNode>();

			final ArrayList<TreeNode> prepartitioning = new ArrayList<TreeNode>();
			final ArrayList<TreeNode> partitioningAlg = new ArrayList<TreeNode>();
			String tmpString = "";
			TreeNode tmpNode;

			// Prepartitioning
			partitioning.add(tmpNode = new TreeNode("PrePartitioning"));

			tmpString = "Activation: ";
			tmpString += this.store.getBoolean(IParConstants.PRE_ACTIVATION) ? "Yes" : "No";
			prepartitioning.add(new TreeNode(tmpString));

			tmpString = "Global Graph Partitioning: ";
			tmpString += this.store.getBoolean(IParConstants.PRE_GGP) ? "Yes" : "No";
			prepartitioning.add(new TreeNode(tmpString));

			tmpString = "Global Critical Path: ";
			tmpString += this.store.getBoolean(IParConstants.PRE_GCP) ? "Yes" : "No";
			prepartitioning.add(new TreeNode(tmpString));

			tmpString = "Minimal Dependency Decomposition: ";
			tmpString += this.store.getBoolean(IParConstants.PRE_MIN_EDGES) ? "Yes" : "No";
			prepartitioning.add(new TreeNode(tmpString));

			tmpString = "Increase parallelization potential for cycle elimination result: ";
			tmpString += this.store.getBoolean(IParConstants.PRE_EFF_EDGE) ? "Yes" : "No";
			prepartitioning.add(new TreeNode(tmpString));

			array = new TreeNode[prepartitioning.size()];
			array = prepartitioning.toArray(array);
			tmpNode.setChildren(array);

			partitioning.add(tmpNode = new TreeNode("Partitioning Algorithm"));

			partitioningAlg.add(new TreeNode("Algorithm: " + getPartitioningAlg()));

			if (getPartitioningAlg().equals("ESSP")) {
				partitioningAlg.add(new TreeNode("Partitions: " + this.store.getInt(IParConstants.PRE_INT)));
			}

			array = new TreeNode[partitioningAlg.size()];
			array = partitioningAlg.toArray(array);
			tmpNode.setChildren(array);

			array = new TreeNode[partitioning.size()];
			array = partitioning.toArray(array);
			partNode.setChildren(array);

		}

		// Task Creation Summary
		if (this.store.getBoolean(IDialogsConstants.PRE_CHECK_CREATE_TASKS)) {
			final TreeNode mainNode = new TreeNode("Task Creation");

			steps.add(mainNode);

			final TreeNode[] children = new TreeNode[1];

			children[0] = new TreeNode("Algorithm: Pragmatic");

			mainNode.setChildren(children);

		}

		if (this.store.getBoolean(IDialogsConstants.PRE_CHECK_MAPPING)) {
			final TreeNode mainNode = new TreeNode("Mapping");
			steps.add(mainNode);
			String tmpString = "";

			final TreeNode[] children = new TreeNode[2];
			children[0] = new TreeNode("Mapping Algorithm");
			children[1] = new TreeNode(
					"Hardware Model Path: " + this.store.getString(IDialogsConstants.PRE_HW_MODEL_LOCATION));

			final ArrayList<TreeNode> mappingAlg = new ArrayList<TreeNode>();
			mappingAlg.add(new TreeNode("Algorithm: "
					+ GenerateMapping.mapAlgPreferenceToWorkflow(this.store.getString(IOMConstants.PRE_MAPPING_ALG))));

			switch (this.store.getString(IOMConstants.PRE_MAPPING_ALG)) {
				case AbstractMappingAlgorithm.LOAD_BALANCE_ILP:
				case AbstractMappingAlgorithm.ENERGY_MIN_ILP:

					tmpString = "Maximum Gap: " + this.store.getString(IOMConstants.PRE_MAX_GAP);
					mappingAlg.add(new TreeNode(tmpString));

					tmpString = "Maximum Iterations Abort: " + this.store.getString(IOMConstants.PRE_MAX_IT_ABORT);
					mappingAlg.add(new TreeNode(tmpString));

					tmpString = "Maximum Iterations Suffice: " + this.store.getString(IOMConstants.PRE_MAX_IT_SUFFICE);
					mappingAlg.add(new TreeNode(tmpString));

					tmpString = "Maximum Time Abort: " + this.store.getString(IOMConstants.PRE_MAX_TIME_ABORT);
					mappingAlg.add(new TreeNode(tmpString));

					tmpString = "Maximum Time Suffice: " + this.store.getString(IOMConstants.PRE_MAX_TIME_SUFFICE);
					mappingAlg.add(new TreeNode(tmpString));

					break;
				default:
					break;
			}

			array = new TreeNode[mappingAlg.size()];
			array = mappingAlg.toArray(array);
			children[0].setChildren(array);

			mainNode.setChildren(children);

		}

		array = new TreeNode[steps.size()];
		array = steps.toArray(array);

		this.treeViewer.setInput(array);

		return true;

	}


	/**
	 * Get partitioning algorithm
	 *
	 * @return partitioning algorithm
	 */
	public String getPartitioningAlg() {

		switch (this.store.getString(IParConstants.PRE_PARTITIONING_ALG)) {
			case PerformPartitioning.PART_ESSP:
				return "ESSP";
			case PerformPartitioning.PART_CPP:
				return "CPP";
			default:
				break;
		}

		if (this.store.getBoolean(IParConstants.PRE_TA)) {
			return "TA Input";
		}

		return "None";
	}
}
