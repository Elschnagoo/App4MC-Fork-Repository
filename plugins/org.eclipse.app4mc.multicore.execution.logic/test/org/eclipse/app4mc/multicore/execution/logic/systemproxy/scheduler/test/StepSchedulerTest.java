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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTask;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerTask;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.IStepScheduler;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.SchedulerAlgorithmRegister;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core.Barrier;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core.StepScheduler;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.tracing.ConsoleSchedulerTracer;
import org.junit.Test;

public class StepSchedulerTest {
	int[][] example2_rms_1_core_t1_38 = { { 2, 5 }, { 15, 18 }, { 32, 35 } };

	int[][] example2_rms_1_core_t2_38 = { { 0, 2 }, { 6, 8 }, { 12, 14 }, { 18, 20 }, { 24, 26 }, { 30, 32 },
			{ 36, 38 } };

	int[][] example2_rms_1_core_t3_38 = { { 5, 6 }, { 8, 12 }, { 14, 15 }, { 20, 21 }, { 22, 24 }, { 26, 30 },
			{ 35, 36 } };

	// @Test
	// public void testNormale() throws SchedulerException{
	//
	//
	// StepScheduler sched= new StepScheduler(new PreemptiveRMSAlgo());
	//
	// SimpleEMTaskTracer tracer = new SimpleEMTaskTracer("TestCore");
	// sched.addOSHookListener(tracer);
	//// sched.addOSHookListener(new ConsoleSchedulerTracer("TestCore"));
	//
	//
	// SchedulerTask t = new SchedulerTask("T1", 3, 15);
	// sched.addTask(t);
	// t = new SchedulerTask("T2", 2, 6);
	// sched.addTask(t);
	// t = new SchedulerTask("T3", 7, 22);
	// sched.addTask(t);
	//
	// for(int i = 0; i<=38;i++){
	// sched.update();
	// sched.timeStep();
	// }
	// sched.update();
	//
	//
	// Map<String, EMTask> result = tracer.getEMTasks();
	//
	// List<EMTaskHistState> t1 = result.get("T1").getHistory();
	// TestUtil.testTaskHistoryRunningStates(example2_rms_1_core_t1_38, t1);
	//
	// List<EMTaskHistState> t2 = result.get("T2").getHistory();
	// TestUtil.testTaskHistoryRunningStates(example2_rms_1_core_t2_38, t2);
	//
	// List<EMTaskHistState> t3 = result.get("T3").getHistory();
	// TestUtil.testTaskHistoryRunningStates(example2_rms_1_core_t3_38, t3);
	//
	// }

	int[][] example4_edf_3_core_c1t1_30 = { { 4, 6 }, { 8, 9 }, { 17, 18 }, { 20, 22 } };
	int[][] example4_edf_3_core_c1t2_30 = { { 0, 2 }, { 6, 8 }, { 12, 14 }, { 18, 20 }, { 24, 26 } };
	int[][] example4_edf_3_core_c1t3_30 = { { 2, 4 }, { 15, 17 } };

	int[][] example4_edf_3_core_c2t1_30 = { { 0, 2 }, { 5, 7 }, { 10, 12 }, { 15, 17 }, { 20, 22 }, { 25, 27 } };
	int[][] example4_edf_3_core_c2t2_30 = { { 9, 10 }, { 12, 15 }, { 22, 25 }, { 27, 28 } };

	@Test
	public void testTaskPrecedenceScheduling() {

		Map<String, IStepScheduler> schedulers = new HashMap<>();

		/* setup cores */
		schedulers.put("C1", new StepScheduler(SchedulerAlgorithmRegister.createPreemptiveEDF()));
		schedulers.put("C2", new StepScheduler(SchedulerAlgorithmRegister.createPreemptiveEDF()));

		/* add listener */
		SimpleEMTaskTracer c1tracer = new SimpleEMTaskTracer("C1");
		schedulers.get("C1").addSchedulerEventListener(c1tracer);
		schedulers.get("C1").addSchedulerEventListener(new ConsoleSchedulerTracer("C1"));
		SimpleEMTaskTracer c2tracer = new SimpleEMTaskTracer("C2");
		schedulers.get("C2").addSchedulerEventListener(c2tracer);
		schedulers.get("C2").addSchedulerEventListener(new ConsoleSchedulerTracer("C2"));

		/* Setup tasks */
		schedulers.get("C1").addTask("C1T1", 3, 15);
		schedulers.get("C1").addTask("C1T2", 2, 6);
		schedulers.get("C1").addTask("C1T3", 2, 15);

		schedulers.get("C2").addTask("C2T1", 2, 5);
		schedulers.get("C2").addTask("C2T2", 4, 15);

		/* Setup precedence */
		// C1T3 have to be executed before C1T1
		Barrier m1 = new Barrier();
		ISchedulerTask s = schedulers.get("C1").getTask("C1T3");
		s.addOwnedBarrier(m1, ISchedulerTask.BARRIER_UNLOCK_AT_SUSPENSION);
		s = schedulers.get("C1").getTask("C1T1");
		s.addDependentBarrier(m1);
		// C1T1 have to be executed before C2T2 (other core/scheduler)
		Barrier m2 = new Barrier();
		s = schedulers.get("C1").getTask("C1T1");
		s.addOwnedBarrier(m2, ISchedulerTask.BARRIER_UNLOCK_AT_SUSPENSION);
		s = schedulers.get("C2").getTask("C2T2");
		s.addDependentBarrier(m2);

		schedulers.values().forEach(IStepScheduler::init);
		for (int i = 0; i <= 30; i++) {
			schedulers.values().forEach(IStepScheduler::runTaskOrIdleStep);
			schedulers.values().forEach(IStepScheduler::updateTaskSynchronisation);
			schedulers.values().forEach(IStepScheduler::updateTaskSet);
		}

		Map<String, EMTask> result = c1tracer.getEMTasks();

		List<EMTaskHistState> c1t1 = result.get("C1T1").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example4_edf_3_core_c1t1_30, c1t1);

		List<EMTaskHistState> c1t2 = result.get("C1T2").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example4_edf_3_core_c1t2_30, c1t2);

		List<EMTaskHistState> c1t3 = result.get("C1T3").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example4_edf_3_core_c1t3_30, c1t3);

		result = c2tracer.getEMTasks();

		List<EMTaskHistState> c2t1 = result.get("C2T1").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example4_edf_3_core_c2t1_30, c2t1);

		List<EMTaskHistState> c2t2 = result.get("C2T2").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example4_edf_3_core_c2t2_30, c2t2);
	}

	@Test
	public void testSchedulerChaining() {

		IStepScheduler c1 = new StepScheduler(SchedulerAlgorithmRegister.createPreemptiveEDF());
		IStepScheduler c2 = new StepScheduler(SchedulerAlgorithmRegister.createPreemptiveEDF());
		/* setup cores */

		/* add listener */
		SimpleEMTaskTracer c1tracer = new SimpleEMTaskTracer("C1");
		c1.addSchedulerEventListener(c1tracer);
		c1.addSchedulerEventListener(new ConsoleSchedulerTracer("C1"));
		SimpleEMTaskTracer c2tracer = new SimpleEMTaskTracer("C2");
		c2.addSchedulerEventListener(c2tracer);
		c2.addSchedulerEventListener(new ConsoleSchedulerTracer("C2"));

		/* Setup tasks */
		c1.addTask("C1T1", 3, 15);
		c1.addTask("C1T2", 2, 6);
		c1.addTask("C1T3", 2, 15);

		c2.addTask("C2T1", 2, 5);
		c2.addTask("C2T2", 4, 15);

		/* Setup precedence */
		// C1T3 have to be executed before C1T1
		Barrier m1 = new Barrier();
		ISchedulerTask s = c1.getTask("C1T3");
		s.addOwnedBarrier(m1, ISchedulerTask.BARRIER_UNLOCK_AT_SUSPENSION);
		s = c1.getTask("C1T1");
		s.addDependentBarrier(m1);
		// C1T1 have to be executed before C2T2 (other core/scheduler)
		Barrier m2 = new Barrier();
		s = c1.getTask("C1T1");
		s.addOwnedBarrier(m2, ISchedulerTask.BARRIER_UNLOCK_AT_SUSPENSION);
		s = c2.getTask("C2T2");
		s.addDependentBarrier(m2);

		c1.init();
		c2.init();
		for (int i = 0; i <= 30; i++) {
			c2.runTaskOrIdleStep();
			c1.runTaskOrIdleStep();
			
			c1.updateTaskSynchronisation();
			c2.updateTaskSynchronisation();
			

			c2.updateTaskSet();
			c1.updateTaskSet();

		}

		Map<String, EMTask> result = c1tracer.getEMTasks();

		List<EMTaskHistState> c1t1 = result.get("C1T1").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example4_edf_3_core_c1t1_30, c1t1);

		List<EMTaskHistState> c1t2 = result.get("C1T2").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example4_edf_3_core_c1t2_30, c1t2);

		List<EMTaskHistState> c1t3 = result.get("C1T3").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example4_edf_3_core_c1t3_30, c1t3);

		result = c2tracer.getEMTasks();

		List<EMTaskHistState> c2t1 = result.get("C2T1").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example4_edf_3_core_c2t1_30, c2t1);

		List<EMTaskHistState> c2t2 = result.get("C2T2").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example4_edf_3_core_c2t2_30, c2t2);
	}

	int[][] example5_edf_3_core_c1t1_30 = { { 4, 6 }, { 8, 9 }, { 17, 18 }, { 20, 22 } };
	int[][] example5_edf_3_core_c1t2_30 = { { 0, 2 }, { 6, 8 }, { 12, 14 }, { 18, 20 }, { 24, 26 } };
	int[][] example5_edf_3_core_c1t3_30 = { { 2, 4 }, { 15, 17 } };

	int[][] example5_edf_3_core_c2t1_30 = { { 0, 2 }, { 5, 7 }, { 10, 12 }, { 15, 17 }, { 20, 22 }, { 25, 27 } };
	int[][] example5_edf_3_core_c2t2_30 = { { 7, 10 }, { 12, 13 }, { 18, 20 }, { 22, 24 } };

	@Test
	public void testTaskPrecedenceSchedulingExtended() {
//		Map<String, IStepScheduler> schedulers = new HashMap<>();
//
//		/* setup cores */
//		schedulers.put("C1", new StepScheduler(SchedulerAlgorithmRegister.createPreemptiveEDF()));
//		schedulers.put("C2", new StepScheduler(SchedulerAlgorithmRegister.createPreemptiveEDF()));
//
//		/* add listener */
//		SimpleEMTaskTracer c1tracer = new SimpleEMTaskTracer("C1");
//		schedulers.get("C1").addSchedulerEventListener(c1tracer);
//		schedulers.get("C1").addSchedulerEventListener(new ConsoleSchedulerTracer("C1"));
//		SimpleEMTaskTracer c2tracer = new SimpleEMTaskTracer("C2");
//		schedulers.get("C2").addSchedulerEventListener(c2tracer);
//		schedulers.get("C2").addSchedulerEventListener(new ConsoleSchedulerTracer("C2"));
//
//		/* Setup tasks */
//		schedulers.get("C1").addTask("C1T1", 3, 15);
//		schedulers.get("C1").addTask("C1T2", 2, 6);
//		schedulers.get("C1").addTask("C1T3", 2, 15);
//
//		schedulers.get("C2").addTask("C2T1", 2, 5);
//		schedulers.get("C2").addTask("C2T2", 4, 15);
//
//		/* Setup precedence */
//		// C1T3 have to be executed before C1T1
//		Barrier m1 = new Barrier();
//		ISchedulerTask s = schedulers.get("C1").getTask("C1T3");
//		s.addOwnedBarrier(m1, ISchedulerTask.BARRIER_UNLOCK_AT_SUSPENSION);
//		s = schedulers.get("C1").getTask("C1T1");
//		s.addDependentBarrier(m1);
//		// C1T1 have to be executed before C2T2 (other core/scheduler)
//		Barrier m2 = new Barrier();
//		s = schedulers.get("C1").getTask("C1T1");
//		s.addOwnedBarrier(m2, 1); //difference
//		s = schedulers.get("C2").getTask("C2T2");
//		s.addDependentBarrier(m2);
//
//		schedulers.values().forEach(IStepScheduler::init);
//		for (int i = 0; i <= 30; i++) {
//			schedulers.values().forEach(IStepScheduler::runTaskOrIdleStep);
//			schedulers.values().forEach(IStepScheduler::updateTaskSynchronisation);
//			schedulers.values().forEach(IStepScheduler::updateTaskSet);
//		}
//
//		Map<String, EMTask> result = c1tracer.getEMTasks();
//
//		List<EMTaskHistState> c1t1 = result.get("C1T1").getStateHistory();
//		TestUtil.testTaskHistoryRunningStates(example5_edf_3_core_c1t1_30, c1t1);
//
//		List<EMTaskHistState> c1t2 = result.get("C1T2").getStateHistory();
//		TestUtil.testTaskHistoryRunningStates(example5_edf_3_core_c1t2_30, c1t2);
//
//		List<EMTaskHistState> c1t3 = result.get("C1T3").getStateHistory();
//		TestUtil.testTaskHistoryRunningStates(example5_edf_3_core_c1t3_30, c1t3);
//
//		result = c2tracer.getEMTasks();
//
//		List<EMTaskHistState> c2t1 = result.get("C2T1").getStateHistory();
//		TestUtil.testTaskHistoryRunningStates(example5_edf_3_core_c2t1_30, c2t1);
//
//		List<EMTaskHistState> c2t2 = result.get("C2T2").getStateHistory();
//		TestUtil.testTaskHistoryRunningStates(example5_edf_3_core_c2t2_30, c2t2);
	}
}
