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

import java.io.File;
import java.util.List;

import org.eclipse.app4mc.multicore.execution.logic.btf.BtfException;
import org.eclipse.app4mc.multicore.execution.logic.btf.BtfTraceParser;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfEntityType;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfEvent;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfTrace;
import org.junit.Test;

public class BtfStatePraserTest {
	
	private final static String TESTFILE= 
			"C:/Users/Tobi/Dropbox/AMALTHEA/APP4MC_Simulator/workspace_amalthea/org.eclipse.app4mc.amalthea.traceeditor/res/example1_task_only_short.btf";
	
	private BtfTraceParser parser;

	@Test
	public void test() throws BtfException {
		System.out.println("Start test");
		
		parser = new BtfTraceParser(new File(TESTFILE));
		parser.parseTrace();
		
		BtfTrace t = parser.getTrace();
		List<BtfEvent> events=t.getEvents();
		assertEquals(15,events.size());
		
		for(BtfEvent ev:events){
			assertEquals(ev.getTargetType(), BtfEntityType.TASK);
			assertTrue(ev.getSource().contains("Core")||ev.getSource().contains("Task"));
			assertTrue(ev.getTarget().contains("Task"));
		}
		
		assertEquals(4, t.getEntityTypeTable().size());
		BtfEntityType type= t.getEntityTypeTable().get("Core_1");
		assertNotEquals(null, type);
		assertEquals(BtfEntityType.CORE, type);
		
		type= t.getEntityTypeTable().get("Core_2");
		assertNotEquals(null, type);
		assertEquals(BtfEntityType.CORE, type);
		
		type= t.getEntityTypeTable().get("Task_A");
		assertNotEquals(null, type);
		assertEquals(BtfEntityType.TASK, type);
		
		type= t.getEntityTypeTable().get("Task_B");
		assertNotEquals(null, type);
		assertEquals(BtfEntityType.TASK, type);
	}

}
