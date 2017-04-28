/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.execution.ui.simmenu.wizards;

import java.text.DecimalFormat;
import java.util.stream.Collectors;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.misc.EMTimeType;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMAllocation;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMMapping;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMUtil;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.SchedulerAlgorithmRegister;
import org.eclipse.app4mc.multicore.execution.ui.widget.emtracewidget.IEMTraceWidget;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class TaskVisuSchedulingPage extends WizardPage {

	private static final String[] SIM_TIME_INCREMENT = {"ms","us","ns","ps"};
	private static final EMTimeType[] SIM_TIME_SCALE = {EMTimeType.MS,EMTimeType.US,EMTimeType.NS,EMTimeType.PS};
	
//	private static final long[] SIM_TIME_INC_PS_PER = {1000L*1000L*1000L,1000L*1000L,1000L,1};
	
	private Composite container;
	private Text txt_simuntil;
	private Combo cb_schedulerSelection;

//	final private IEMTraceWidget tw;
	final private OMMapping model;
//	final private Map<OMCore, List<OMTask>> coreTaskMap;
	
	private long majorCycle=0;
	private long simuntil=0;
	
	private String scheduling ="";
	private EMTimeType timescale;
	private Combo cb_precessionSelection; 

	protected TaskVisuSchedulingPage(IEMTraceWidget tw, OMMapping model) {
		super("Task Visualisation: Scheduling");
//		this.tw = tw;
		this.model = model;
//		coreTaskMap = OMUtil.getCoreTaskMap(omModel.getAllocationList());
		setTitle("Task Visualisation: Scheduling");
		setDescription("Setup the scheduling used for the visualisation.");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;

		majorCycle = OMUtil.getMajorCycle(model.getAllocationList().stream().map(OMAllocation::getTask).collect(Collectors.toList()));
		Label lbl_majorCycle = new Label(container, SWT.NONE);
		lbl_majorCycle.setText("Major-Cycle / Hyperperiod (ps)");
		
		DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		String numberAsString = decimalFormat.format(majorCycle);
		Label lbl_majorCycleVal = new Label(container, SWT.NONE);
		lbl_majorCycleVal.setText(numberAsString);
		lbl_majorCycleVal.addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
			}
			@Override
			public void mouseDown(MouseEvent e) {
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				if(txt_simuntil!=null){
					txt_simuntil.setText(majorCycle+"");
				}
			}
		});

		Label lbl_seconds = new Label(container, SWT.NONE);
		lbl_seconds.setText(" ");

		Label lbl_majorCycleVal2 = new Label(container, SWT.NONE);
		lbl_majorCycleVal2.setText(psToString(majorCycle));

		Label label1 = new Label(container, SWT.NONE);
		label1.setText("Algorithm");

		cb_schedulerSelection = new Combo(container, SWT.READ_ONLY);
		cb_schedulerSelection.setItems(SchedulerAlgorithmRegister.schedulerList());
		cb_schedulerSelection.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				int i  = cb_schedulerSelection.getSelectionIndex();
				if(i!=-1){
					scheduling = SchedulerAlgorithmRegister.schedulerList()[i];
					setPageComplete(isReadyToSim());
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		Label labeltimeinc = new Label(container, SWT.NONE);
		labeltimeinc.setText("Scale to");
		
		cb_precessionSelection = new Combo(container, SWT.READ_ONLY);
		cb_precessionSelection.setItems(SIM_TIME_INCREMENT);
		cb_precessionSelection.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				int i = cb_precessionSelection.getSelectionIndex();
				if(i!=-1){
					timescale = SIM_TIME_SCALE[i];
					setPageComplete(isReadyToSim());
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		

		Label labelCheck = new Label(container, SWT.NONE);
		labelCheck.setText("Simulation-Time (ps)");
		txt_simuntil = new Text(container, SWT.NONE);
		simuntil = majorCycle;
		txt_simuntil.setText("" + majorCycle);

		txt_simuntil.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent ev) {
				String text = ((Text)ev.getSource()).getText();
				try{
					simuntil = Long.parseLong(text);
				}catch (NumberFormatException ex){
					simuntil = 0;
				}
				setPageComplete(isReadyToSim());
			}
		});

		//
		// Button check = new Button(container, SWT.CHECK);
		// check.setSelection(true);

		setControl(container);
		setPageComplete(isReadyToSim());
	}
	
	
	private boolean isReadyToSim(){
		return simuntil != 0 && //valid simulation time
				cb_schedulerSelection!= null && // combobox is instantiated
				cb_schedulerSelection.getSelectionIndex() != -1 && // combobox item selected
				cb_precessionSelection!= null &&
				cb_precessionSelection.getSelectionIndex() != -1;
	}


	
	private String psToString(long ps){
		if((ps%1000)!=0){
			return ps + " ps";
		}else if((ps % 1000000)!=0){
			return ps/1000 +" ns";
		}else if((ps % 1000000000)!=0){
			return ps/1000000+" us";
		}else{
			return ps/1000000000+ " ms";
		}
	}

	/**
	 * Get the time until the simulation should run.
	 * @return
	 */
	public long getSimuntil() {
		return simuntil;
	}

	/**
	 * Get the key-name of the scheduling.
	 * @return
	 */
	public String getScheduling() {
		return scheduling;
	}
	
	public EMTimeType getTimeScale(){
		return timescale;
	}
	
	

}
