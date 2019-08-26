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

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskState;

public class TestUtil {
	public static void testTaskHistoryRunningStates(int[][] runstates,List<EMTaskHistState> hist){
		
		//filter all running states with duration greater zero
		//and known past and known future
		hist = hist.stream().filter(x->{
			return x.getState()==EMTaskState.RUNNING &&
					x.isCompleted() &&
					(x.getEnd()-x.getStart())>0;
		}).collect(Collectors.toList());
		
		assertEquals(runstates.length, hist.size());
		
		for(int i = 0; i < hist.size();i++){
			assertEquals(runstates[i][0], hist.get(i).getStart());
			assertEquals(runstates[i][1], hist.get(i).getEnd());
		}
	}
}
