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
package org.eclipse.app4mc.multicore.execution.logic.executionmodel.test;

import static org.junit.Assert.*;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskEvent;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskFSM;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskState;
import org.junit.Test;

public class TaskFSMTest {

	@Test
	public void test() {
		EMTaskFSM fsm = new EMTaskFSM(EMTaskState.READY);
		assertEquals(fsm.getState(), EMTaskState.READY);
		assertFalse(fsm.dispatchEvent(EMTaskEvent.WAIT));
		assertEquals(fsm.getState(), EMTaskState.READY);
		assertTrue(fsm.dispatchEvent(EMTaskEvent.START));
		assertEquals(fsm.getState(), EMTaskState.RUNNING);
		
		fsm.dispatchEvent(EMTaskEvent.TERMINATE);
		fsm.dispatchEvent(EMTaskEvent.ACTIVATE);
		fsm.dispatchEvent(EMTaskEvent.START);
		fsm.dispatchEvent(EMTaskEvent.WAIT);
		fsm.dispatchEvent(EMTaskEvent.RELEASE);
		fsm.dispatchEvent(EMTaskEvent.START);
		assertEquals(fsm.getState(), EMTaskState.RUNNING);
	}

}
