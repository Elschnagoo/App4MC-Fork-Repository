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

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTask;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.IStepScheduler;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.SchedulerAlgorithmRegister;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.SchedulerException;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core.StepScheduler;
import org.junit.Test;

public class PreemptiveRMSTest {
	
	int[][] example2_rms_1_core_t1_38 = 
		{ { 2, 5 }, { 15, 18 }, { 32, 35 }};
	
	int[][] example2_rms_1_core_t2_38 = 
		{ { 0, 2 }, { 6, 8 }, { 12, 14 }, { 18, 20 }, { 24, 26 } , { 30, 32 }, { 36, 38 } };

	int[][] example2_rms_1_core_t3_38 = 
		{ { 5, 6 }, { 8, 12 }, { 14, 15 }, { 20, 21 }, { 22, 24 }, { 26, 30 }, { 35, 36 } };

//	@Test
//	public void test_example2_rms_1_core() throws SchedulerException {
//		
//		StepScheduler s = SchedulerAlgorithmFactory.createPreemptiveRMSScheduler();
//		SimpleEMTaskTracer tracer = new SimpleEMTaskTracer("TestCore");
//		s.addOSHookListener(tracer);
////		s.addListener(new ConsoleSchedulerTracer());
//		
//		SchedulerTask t = new SchedulerTask("T1", 3, 15);
//		s.addTask(t);
//		t = new SchedulerTask("T2", 2, 6);
//		s.addTask(t);
//		t = new SchedulerTask("T3", 7, 22);
//		s.addTask(t);
//
//		s.init();
//		s.scheduleUntil(38);
//		
//		Map<String, EMTask> result = tracer.getEMTasks();
//
//		List<EMTaskHistState> t1 = result.get("T1").getHistory();
//		TestUtil.testTaskHistoryRunningStates(example2_rms_1_core_t1_38, t1);
//		
//		List<EMTaskHistState> t2 = result.get("T2").getHistory();
//		TestUtil.testTaskHistoryRunningStates(example2_rms_1_core_t2_38, t2);
//		
//		List<EMTaskHistState> t3 = result.get("T3").getHistory();
//		TestUtil.testTaskHistoryRunningStates(example2_rms_1_core_t3_38, t3);
//	}
	
	@Test
	public void test_example2_rms_1_core_single_steps() throws SchedulerException {

		IStepScheduler s = new StepScheduler(SchedulerAlgorithmRegister.createPreemptiveRMS());
		
		SimpleEMTaskTracer tracer = new SimpleEMTaskTracer("TestCore");
		s.addSchedulerEventListener(tracer);
//		s.addSchedulerEventListener(new ConsoleSchedulerTracer("TestCore"));
		
		s.addTask("T1", 3, 15);
		s.addTask("T2", 2, 6);
		s.addTask("T3", 7, 22);

		s.init();
		for(int i =0; i<38;i++){
			s.runTaskOrIdleStep();
			s.updateTaskSynchronisation();
			s.updateTaskSet();
		}
		assertEquals(38, s.getSimTime());
		
		Map<String, EMTask> result = tracer.getEMTasks();

		List<EMTaskHistState> t1 = result.get("T1").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example2_rms_1_core_t1_38, t1);
		
		List<EMTaskHistState> t2 = result.get("T2").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example2_rms_1_core_t2_38, t2);
		
		List<EMTaskHistState> t3 = result.get("T3").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example2_rms_1_core_t3_38, t3);
	}
	
//	@Test
//	public void test_example5_rms_1_core_single_steps(){
//		StepScheduler s = new StepScheduler(SchedulerAlgorithmRegister.createPreemptiveRMS());
//		
//		SimpleEMTaskTracer tracer = new SimpleEMTaskTracer("TestCore");
//		s.addSchedulerEventListener(tracer);
//		s.addSchedulerEventListener(new ConsoleSchedulerTracer("TestCore"));
//		
//		SchedulerTask t = new SchedulerTask("T1", 3, 15);
//		s.addTask(t);
//		t = new SchedulerTask("T2", 2, 6);
//		s.addTask(t);
//		t = new SchedulerTask("T3", 9, 22);
//		s.addTask(t);
//
//		s.init();
//		for(int i =0; i<38;i++){
//			s.runTaskOrIdleStep();
//			s.updateTaskSynchronisation();
////			s.updateTaskSet();
//		}
//	}
}
