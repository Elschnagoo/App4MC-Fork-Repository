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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.misc.EMTimeType;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.MalformedModelException;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMCore;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMEdge;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMMapping;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMUtil;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.ISystemProxy;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.SimException;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.SystemProxyFactory;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.SchedulerAlgorithmRegister;
import org.eclipse.app4mc.multicore.execution.ui.traceview.TraceViewUtil;
//import org.eclipse.app4mc.multicore.execution.ui.traceview.TraceViewUtil;
import org.eclipse.app4mc.multicore.execution.ui.widget.emtracewidget.IEMTraceWidget;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
//import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;

public class TaskVisuWizard extends Wizard {

	protected TaskVisuOverviewPage page1;
	protected TaskVisuDependencyPage page2;
	protected TaskVisuSchedulingPage page3;

	protected IEMTraceWidget tw;
	protected OMMapping omModel;
	protected ConstraintsModel cm;
	
	private ISystemProxy systemProxy;


	/**
	 * Create task visualization wizard
	 * 
	 * @param tw
	 *            TraceView have to be opened before
	 * @param omModel
	 */
	public TaskVisuWizard(IEMTraceWidget tw, OMMapping model, ConstraintsModel cm) {
		this.tw = tw;
		this.omModel = model;
		this.cm = cm;
	}

	@Override
	public String getWindowTitle() {
		return "Task Visualization Wizard";
	}

	@Override
	public void addPages() {
		page1 = new TaskVisuOverviewPage(omModel);
		page2 = new TaskVisuDependencyPage(omModel,cm);
		page3 = new TaskVisuSchedulingPage(tw, omModel);
		
		addPage(page1);
		addPage(page2);
		addPage(page3);
	}
	
	

	@Override
	public boolean performFinish() {
		final String sched = page3.getScheduling();
		final long schedtime = page3.getSimuntil();
		final EMTimeType timeScale = page3.getTimeScale();
		
		final Collection<OMEdge> taskPrecedence= page2.getTaskPrecedences();
		boolean considerPrecedence= page2.considerTaskPrecedence();
			
		final Job job = new Job("Task Visualisation Job") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				try {
					ExecutionModel execResult = new ExecutionModel();
					execResult.setTimeScale(timeScale);
					systemProxy = SystemProxyFactory.createEMSystemProxyFromOMMapping(timeScale.picos(), SchedulerAlgorithmRegister.schedulerFactoryByName(sched), omModel,execResult);
					if(considerPrecedence){
						for(OMEdge edge: taskPrecedence){
							OMCore preCore = OMUtil.getCoreForTask(omModel, edge.getPre());
							OMCore postCore = OMUtil.getCoreForTask(omModel, edge.getPost());
							long releaseTime=OMUtil.getProcessingTime(preCore, edge.getReleaseInstruction());
							
							systemProxy.addTaskPrecedence(preCore.getCoreRef().getName(), edge.getPre().getTaskRef().getName(), releaseTime
									, postCore.getCoreRef().getName(),edge.getPost().getTaskRef().getName());
						}
					}
					
					
					tw.addExecutionModel(execResult);
					System.err.println("STARTING SIM");

//					SubMonitor subMonitor = SubMonitor.convert(monitor, 100*systemProxy.getSchedulers().size());

//					for(IScheduler sched: systemProxy.getSchedulers().values() ){
//						sched.addProgressListener(new Consumer<Integer>() {
//							int prev=0;
//							@Override
//							public void accept(Integer t) {
//								if(subMonitor.isCanceled()){
//									getThread().interrupt();
//								}
//								subMonitor.newChild(t-prev);
//								prev=t;
//							}
//						});
//					}
					
					
					long cur = System.currentTimeMillis();
//					monitor.beginTask("", totalWork);
					systemProxy.compute(schedtime);
					monitor.done();
					System.err.println("READY duration:" + (System.currentTimeMillis()-cur));
				} catch (SimException | MalformedModelException e) {
					e.printStackTrace();
					getDisplay().asyncExec(new Runnable() {
						@Override
						public void run() {
							MessageDialog.openInformation(TraceViewUtil.getTraceViewPart().getSite().getShell(), 
									"Task Visualization", e.getMessage());
						}
					});					
				}

				// If you want to update the UI
				// Display.asyncExec(new Runnable() {
				// @Override
				// public void run() {
				// // do something in the user interface
				// // e.g. set a text field
				// }
				// });
				return Status.OK_STATUS;
			}
			
			@Override
			protected void canceling() {
				super.canceling();
				System.err.println("Canceling task visualization");
				if(systemProxy!=null){
					systemProxy.interruptComputation();
				}
			}
		};

		// Start the Job
		job.schedule();

		return true;
	}
	
	public static Display getDisplay() {
	      Display display = Display.getCurrent();
	      //may be null if outside the UI thread
	      if (display == null)
	         display = Display.getDefault();
	      return display;		
	   }

}
