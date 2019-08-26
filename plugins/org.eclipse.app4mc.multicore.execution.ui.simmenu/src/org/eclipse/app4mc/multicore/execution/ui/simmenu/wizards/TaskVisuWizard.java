/**
 ********************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.ui.simmenu.wizards;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.misc.EMTimeType;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.*;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.ISystemProxy;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.SimException;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.SystemProxyFactory;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.SchedulerAlgorithmRegister;
import org.eclipse.app4mc.multicore.execution.model.XContainer;
import org.eclipse.app4mc.multicore.execution.ui.traceview.TraceViewUtil;
import org.eclipse.app4mc.multicore.execution.ui.widget.emtracewidget.IEMTraceWidget;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Iterator;

//import org.eclipse.app4mc.multicore.execution.ui.traceview.TraceViewUtil;
//import org.eclipse.core.runtime.SubMonitor;

public class TaskVisuWizard extends Wizard {

	protected TaskVisuOverviewPage page1;
	protected TaskVisuDependencyPage page2;
	protected TaskVisuSchedulingPage page3;

	protected IEMTraceWidget tw;
	protected OMMapping omModel;
	protected ConstraintsModel cm;
	
	private ISystemProxy systemProxy;
	XContainer con;


	/**
	 * Create task visualization wizard
	 *
	 * @param omModel
	 * @param tw
 *            TraceView have to be opened before
	 * @param path
	 */
	private String pa;
	public TaskVisuWizard(IEMTraceWidget tw, OMMapping model, ConstraintsModel cm, String path) {
		this.tw = tw;
		this.omModel = model;
		this.cm = cm;
		this.pa=path;
		con=XContainer.newInstance();


		//vievModel(this.omModel);
	}


	public void vievModel (OMMapping omM)
		{
			System.out.println("###############Start Inspection########################");
			Iterator <OMAllocation> it=omM.getAllocationList().iterator();
			OMAllocation tmp;
			while (it.hasNext())
				{
					tmp=it.next();
					OMTask ttp =tmp.getTask();
                    Iterator <OMRunnable> list=ttp.getRunnableCallSequence().iterator();
                    System.out.println(tmp.getCore() +" "+ ttp  );
                    while(list.hasNext()){
                        System.out.println("### -> "+list.next().getRunnableRef().toString().split(" ")[2]);
                    }
				}

			System.out.println("###############Start Inspection########################");


		}

	@Override
	public String getWindowTitle() {
		return "Task Visualization Wizard";
	}

	@Override
	public void addPages() {
		page1 = new TaskVisuOverviewPage(omModel);
		page2 = new TaskVisuDependencyPage(omModel,cm);
		page3 = new TaskVisuSchedulingPage(tw, omModel,con);
		
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
					System.out.println(TaskVisuWizard.this.pa);
					execResult.setPath(TaskVisuWizard.this.pa);
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
					System.out.println("Finish");

					tw.setFinish();
					if(con.isDataFlow()&&!con.isMergingArrow())
					{
						JOptionPane.showMessageDialog(null,"Report:\n"+con.getReport());
					}
					if (con.isMergingArrow()&&con.isDataFlow()){
						renderBetterReport(con);
					}


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
				tw.setFinish();
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

	private void renderBetterReport(XContainer con) {
		int ROWS = 4;

		Object[][] data;
		try {
				data = con.generateReport();
		}
		catch (NullPointerException e){

			JOptionPane.showMessageDialog(null,"The data flow report could not be generated due to the missed goals","Error",JOptionPane.ERROR_MESSAGE);
			return;
		}




				;

		Object[] columnNames = { "Name", "Total Execution", "Oversampling Exe.","Undersampling Exe." };

		JDialog  dialog=new JDialog();
		JPanel contentPanel = new JPanel();
		dialog.setAlwaysOnTop(true);
		dialog.setResizable(false);
		dialog.setBounds(100, 100, 700, 400);
		dialog.getContentPane().setLayout(new BorderLayout());
//############################################################################################################################
		Panel panel_2 = new Panel();
		dialog.getContentPane().add(panel_2, BorderLayout.NORTH);

		Box verticalBox_1 = Box.createVerticalBox();
		panel_2.add(verticalBox_1);

		Panel header = new Panel();
		verticalBox_1.add(header);
		header.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("Report");
		header.add(lblNewLabel);

		Panel infoSpace = new Panel();
		verticalBox_1.add(infoSpace);

		JLabel core = new JLabel("Cores:");
		infoSpace.add(core);

		JLabel coreCounter = new JLabel(""+con.getCores().size());
		coreCounter.setForeground(Color.RED);
		infoSpace.add(coreCounter);

		JLabel runnable = new JLabel("Runnables:");
		infoSpace.add(runnable);

		JLabel runnableCounter = new JLabel(""+con.getRunnables().size());
		runnableCounter.setForeground(Color.RED);
		infoSpace.add(runnableCounter);

		JLabel labels = new JLabel("Labels:");
		infoSpace.add(labels);

		JLabel label = new JLabel(""+con.getLabels().size());
		label.setForeground(Color.RED);
		infoSpace.add(label);

		Panel panel = new Panel();
		verticalBox_1.add(panel);

		JLabel globalChain = new JLabel("Global Eventchain:");
		panel.add(globalChain);

		JLabel lblNewLabel_1 = new JLabel(""+con.isHaveglobal());
		lblNewLabel_1.setForeground(Color.RED);
		panel.add(lblNewLabel_1);



		final JTable table = new JTable(data, columnNames) {
			@Override
			public Dimension getPreferredScrollableViewportSize() {
				Dimension d = getPreferredSize();
				int n = getRowHeight();
				return new Dimension(d.width*2, (n * con.getCores().size()));
			}
		};
		JScrollPane sp = new JScrollPane(table);
		verticalBox_1.add(contentPanel);

		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.add(sp);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			dialog.getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dialog.setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				dialog.getRootPane().setDefaultButton(okButton);
			}
		}

//############################################################################################################################

//
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
	}

	public static Display getDisplay() {
	      Display display = Display.getCurrent();
	      //may be null if outside the UI thread
	      if (display == null)
	         display = Display.getDefault();
	      return display;		
	   }


}
