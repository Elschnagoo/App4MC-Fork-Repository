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

package org.eclipse.app4mc.multicore.execution.ui.simmenu.wizards;

import java.awt.Frame;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.MalformedModelException;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMAllocation;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMCore;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMEdge;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMMapping;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMTask;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;

public class TaskVisuDependencyPage extends WizardPage {

	private Composite container;

	
	private mxGraph graph;
	private mxGraphComponent graph_view;

	private Button cbConsiderPrecedence;

	private ConstraintsModel cm;

	private OMMapping model;

	private Set<Object> consideredGraphEdges = new HashSet<>();
	
	private List<OMAllocation> allocationList;
	private List<OMTask> tasklist;

	private Collection<OMEdge> consideredEdges;

	protected TaskVisuDependencyPage(String pageName) {
		super(pageName);
	}

	public TaskVisuDependencyPage(OMMapping model, ConstraintsModel cm) {
		super("Task Visualisation: Task Dependencies");
		setTitle("Task Visualisation: Task Dependencies");
		this.model = model;
		this.cm = cm;
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);

		try {
			allocationList = model.getAllocationList();
			tasklist=allocationList.stream().map(OMAllocation::getTask).collect(Collectors.toList());
			OMUtil.createOMTaskGraph(tasklist, cm); //TODO async task
			
			createGraph();
			Composite embeddedComposite = new Composite(container, SWT.EMBEDDED | SWT.NO_BACKGROUND );
			GridData embedGraphData=new GridData(SWT.FILL, SWT.FILL, true, true);
			embedGraphData.verticalSpan = 2;
			embeddedComposite.setLayoutData(embedGraphData);
			Frame frame = SWT_AWT.new_Frame(embeddedComposite);
			frame.add(graph_view);
			frame.setVisible(true);

			cbConsiderPrecedence = new Button(container, SWT.CHECK );
			cbConsiderPrecedence.setText("Consider task precedence!\n");
			Label filterinfo= new Label(container, SWT.WRAP | SWT.BORDER | SWT.LEFT);
			filterinfo.setText(
					"Relations filter: "
					+ "\n- No edges with unequal periods of pre- and post-task."
					+ "\n- No edges with same pre- and post-task (selftransition)."
					+ "\n- If there are multiple edges between two tasks the edge "
					+ "\n  with the highest release time is chosen.");
			
			cbConsiderPrecedence.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					
					if(!OMUtil.isDAG(consideredEdges)){
						MessageDialog.openInformation(getShell(), 
								"Task Visualization", "Directed cylic Graphs are not supported!");
						cbConsiderPrecedence.setSelection(false);
						return;
					}
					
					if(cbConsiderPrecedence.getSelection()){
						graph.setCellStyles(mxConstants.STYLE_STROKECOLOR, "red", consideredGraphEdges.toArray());
					}else{
						graph.setCellStyles(mxConstants.STYLE_STROKECOLOR, "blue", consideredGraphEdges.toArray());
					}
				}
			});
			
		} catch (MalformedModelException e) {
			e.printStackTrace();
		}

		setControl(container);
		setPageComplete(true);
	}

	private void createGraph()  {
		graph = new mxGraph();
		
		 graph.setCellsEditable(false);
		// graph.setCellsDeletable(false);
//		graph.setConnectableEdges(false);

		// addExampleDataToGraph();
		addModelDataToGraph();

		layoutGraph();
		graph_view = new mxGraphComponent(graph);
		graph_view.setConnectable(false);
	}
	
	private void addModelDataToGraph() {

		Object parent = graph.getDefaultParent();
		Map<OMTask, Object> celllist = new HashMap<>();
		
		for(OMAllocation alloc: allocationList){
			OMTask task = alloc.getTask();
			Object x = graph.insertVertex(parent, null, task.getTaskRef().getName(), 0, 0, 80, 30);
			celllist.put(task, x);
		}
		
		Map<OMEdge,Object> edgemap=new HashMap<>();

		for (OMAllocation alloc : allocationList) {
			OMTask pre = alloc.getTask();
			OMCore core= alloc.getCore();
	
			for (OMEdge postEdge : pre.getPosts()) {
				
				OMTask post=postEdge.getPost();
				long instruction = postEdge.getReleaseInstruction();
				
				long time;
				try {
					time = OMUtil.getProcessingTime(core, instruction);
					Object edge = graph.insertEdge(parent, null, ""+time + " ps", celllist.get(pre), celllist.get(post));
					edgemap.put(postEdge,edge);
				} catch (MalformedModelException e) {
					e.printStackTrace();
				}
				
			}
		}
		consideredEdges= Util.getConsideredEdges(tasklist);
		
		for(OMEdge edge:consideredEdges){
			consideredGraphEdges.add(edgemap.get(edge));
		}

	}

	public boolean considerTaskPrecedence() {
		if (cbConsiderPrecedence != null) {
			return cbConsiderPrecedence.getSelection();
		}
		return false;
	}

	public Collection<OMEdge> getTaskPrecedences() {
		return consideredEdges;
	}

//	private void addExampleDataToGraph() {
//		Object parent = graph.getDefaultParent();
//		graph.getModel().beginUpdate();
//		Object v1 = graph.insertVertex(parent, null, "SpeedSensor", 0, 0, 80, 30);
//		Object v2 = graph.insertVertex(parent, null, "Checker", 0, 0, 80, 30);
//		Object v3 = graph.insertVertex(parent, null, "SpeedSensor2", 0, 0, 80, 30);
//		Object v4 = graph.insertVertex(parent, null, "MotorActuator", 0, 0, 80, 30);
//
//		Object edge1 = graph.insertEdge(parent, null, "a", v1, v2);
//
//		graph.setCellStyles(mxConstants.STYLE_STROKECOLOR, "red", new Object[] { edge1 });
//		// graph.setCellSt
//		graph.insertEdge(parent, null, "b", v3, v2);
//		graph.insertEdge(parent, null, "c", v2, v4);
//		graph.getModel().endUpdate();
//	}

	private void layoutGraph() {

		new mxHierarchicalLayout(graph).execute(graph.getDefaultParent());
		// new mxParallelEdgeLayout(graph).execute(graph.getDefaultParent());
	}

}
