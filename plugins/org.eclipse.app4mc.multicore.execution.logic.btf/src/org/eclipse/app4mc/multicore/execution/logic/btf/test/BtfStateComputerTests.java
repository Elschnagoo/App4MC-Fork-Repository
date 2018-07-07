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

package org.eclipse.app4mc.multicore.execution.logic.btf.test;


import static org.junit.Assert.*;

import java.util.Iterator;

import org.eclipse.app4mc.multicore.execution.logic.btf.BtfComputer;
import org.eclipse.app4mc.multicore.execution.logic.btf.BtfException;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfEntityType;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfEvent;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfTrace;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.misc.EMTimeType;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTask;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskState;
import org.junit.Test;

public class BtfStateComputerTests {
	
//	0,Task_A,0,T,Task_A,0,activate
//	100,Core_1,0,T,Task_A,0,start
//	100,Task_A,0,R,Runnable_A_1,0,start
//	6766,Task_A,0,R,Runnable_A_1,0,terminate
//	6766,Task_A,0,R,Runnable_A_2,0,start
//	10000,Task_B,0,T,Task_B,0,activate
//	10100,Task_A,0,R,Runnable_A_2,0,suspend
//	10100,Core_1,0,T,Task_A,0,preempt
//	10100,Core_1,0,T,Task_B,0,start
//	10100,Task_B,0,R,Runnable_B_1,0,start
//	16766,Task_B,0,R,Runnable_B_1,0,terminate
//	16766,Core_1,0,T,Task_B,0,terminate
//	16866,Core_1,0,T,Task_A,0,resume
//	16866,Task_A,0,R,Runnable_A_2,0,resume
//	20199,Task_A,0,R,Runnable_A_2,0,terminate
//	20199,Core_1,0,T,Task_A,0,terminate
//	public void testBtfComputionWith16Entrys()
//	TODO Add testcase with testtrace above

	@Test
	public void testBtfStateComputer() throws BtfException {
		BtfTrace t = new BtfTrace();
		
		
		t.setName("BTF-Test");
		t.setTimeScale(EMTimeType.MS);
		
//		0,Task_A,0,T,Task_A,0,activate
//		100,Core_1,0,T,Task_A,0,start
//		100,Task_A,0,R,Runnable_A_1,0,start
		BtfEvent e = new BtfEvent();
		e.setEvent("activate");
		e.setSource("Task1");
		e.setTarget("Task1");
		e.setTargetType(BtfEntityType.TASK);
		e.setTargetInstance(0);
		e.setSourceInstance(0);
		e.setTime(10);
		t.getEvents().add(e);
		
		e = new BtfEvent();
		e.setEvent("start");
		e.setSource("Core1");
		e.setTarget("Task1");
		e.setTargetType(BtfEntityType.TASK);
		e.setTargetInstance(0);
		e.setSourceInstance(0);
		e.setTime(12);
		t.getEvents().add(e);
		
		t.getEntityTypeTable().put("Core1", BtfEntityType.CORE);
		t.getEntityTypeTable().put("Task1",BtfEntityType.TASK);
		
		ExecutionModel m = new ExecutionModel();
		BtfComputer tc= new BtfComputer(t,m);
		
		tc.compute();
		assertEquals(1,m.getTasks().size());
		assertEquals(1,m.getCores().size()); 
		
		EMTask hist = m.getTasks().get("Task1");
		assertNotEquals(null, hist);
		assertEquals(3, hist.getStateHistory().size());
		
		assertEquals(m.getCores().size(),1);
		assertEquals(m.getCores().get("Core1").getName(),"Core1");
		
		Iterator<EMTaskHistState> it = hist.getStateHistory().iterator();
		
		EMTaskHistState histEnt = it.next();
		assertNotEquals(null,histEnt);
		assertEquals(EMTaskHistState.UNKNOWN_PAST,histEnt.getStart() );
		assertEquals(10,histEnt.getEnd());
		
		histEnt = it.next();
		assertNotEquals(histEnt,null);		
		assertEquals(10,histEnt.getStart());
//		assertEquals(EMTaskState.ACTIVE,histEnt.getState());
		assertEquals(12,histEnt.getEnd());
		
		histEnt = it.next();
		assertNotEquals(histEnt,null);
		assertEquals(EMTaskState.RUNNING,histEnt.getState());
		assertEquals(12,histEnt.getStart());
		assertEquals(EMTaskHistState.UNKNOWN_FUTURE,histEnt.getEnd());
	}


}
