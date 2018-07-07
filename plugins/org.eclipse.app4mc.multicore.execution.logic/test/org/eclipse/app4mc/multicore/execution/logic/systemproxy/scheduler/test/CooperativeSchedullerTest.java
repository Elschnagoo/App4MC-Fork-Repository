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

import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTask;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.SchedulerException;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.algo.CooperativeEDFAlgo;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core.StepScheduler;
import org.junit.Test;

public class CooperativeSchedullerTest {

	int[][] example1_edf_1_core_t1_42 = { { 2, 5 }, { 15, 18 }, { 32, 35 } };
	int[][] example1_edf_1_core_t2_42 = 
		{ { 0, 2 }, { 7, 9 }, { 12, 14 }, { 18, 20 }, { 24, 26 }, { 30, 32 },{ 36, 38 } };
	int[][] example1_edf_1_core_t3_42 = { { 5, 7 }, { 22, 24 } };

	@Test
	public void test_example1_edf_1_core() throws SchedulerException {
		StepScheduler s = new StepScheduler(new CooperativeEDFAlgo());

		SimpleEMTaskTracer tracer = new SimpleEMTaskTracer("TestCore");
		s.addSchedulerEventListener(tracer);
//		s.addOSHookListener(new ConsoleSchedulerTracer("TestCore"));

		s.addTask("T1", 3, 15);
		s.addTask("T2", 2, 6);
		s.addTask("T3", 2, 22);

		s.init();
		for(int i = 0;i<=42;i++){
			s.runTaskOrIdleStep();
			s.updateTaskSynchronisation();
			s.updateTaskSet();
		}

		Map<String, EMTask> result = tracer.getEMTasks();

		List<EMTaskHistState> t1 = result.get("T1").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example1_edf_1_core_t1_42, t1);
		
		List<EMTaskHistState> t2 = result.get("T2").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example1_edf_1_core_t2_42, t2);
		
		List<EMTaskHistState> t3 = result.get("T3").getStateHistory();
		TestUtil.testTaskHistoryRunningStates(example1_edf_1_core_t3_42, t3);
	}

}
