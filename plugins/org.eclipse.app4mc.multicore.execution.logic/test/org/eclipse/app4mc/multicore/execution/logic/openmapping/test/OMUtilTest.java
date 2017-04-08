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
package org.eclipse.app4mc.multicore.execution.logic.openmapping.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMAllocation;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMCore;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMEdge;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMTask;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMUtil;
import org.junit.Test;

public class OMUtilTest {

	@Test
	public void testGetCoreTaskMap() {
		Core c1= AmaltheaFactory.eINSTANCE.createCore();
		c1.setName("Core1");
		OMCore omc1 = new OMCore(c1);
		
		Core c2= AmaltheaFactory.eINSTANCE.createCore();
		c2.setName("Core2");
		OMCore omc2 = new OMCore(c2);
		
		Task t1_c1= createTask("T1_CORE1");
		Task t2_c1= createTask("T2_CORE1");
		Task t3_c1= createTask("T3_CORE1");
		
		Task t1_c2= createTask("T1_CORE2");
		Task t2_c2= createTask("T2_CORE2");
		
		List<OMAllocation> allocs= new LinkedList<>();
		allocs.add(new OMAllocation(new OMTask(t1_c1), omc1));
		allocs.add(new OMAllocation(new OMTask(t2_c1), omc1));
		allocs.add(new OMAllocation(new OMTask(t3_c1), omc1));
		allocs.add(new OMAllocation(new OMTask(t1_c2), omc2));
		allocs.add(new OMAllocation(new OMTask(t2_c2), omc2));
		
		assertEquals(new OMCore(c1), new OMCore(c1));
		
		
		Map<OMCore,List<OMTask>> map = OMUtil.getCoreTaskMap(allocs);
		
		assertEquals(map.keySet().size(),2);
		
		
		
		boolean checkedC1=false;
		boolean checkedC2=false;
		
		
		
		for(OMCore c: map.keySet()){
			if(c.getCoreRef()==c1){
				List<OMTask> tasks = map.get(c);
				assertEquals(3, tasks.size());
				assertEquals("T1_CORE1",tasks.get(0).getTaskRef().getName());
				assertEquals("T2_CORE1",tasks.get(1).getTaskRef().getName());
				assertEquals("T3_CORE1",tasks.get(2).getTaskRef().getName());
				checkedC1=true;
			}else if (c.getCoreRef().getName().equals("Core2")){
				List<OMTask> tasks = map.get(c);
				assertEquals(2, tasks.size());
				assertEquals("T1_CORE2",tasks.get(0).getTaskRef().getName());
				assertEquals("T2_CORE2",tasks.get(1).getTaskRef().getName());
				checkedC2=true;
			}else{
				assertTrue(false);
			}
		}
		
		assertTrue(checkedC1);
		assertTrue(checkedC2);
		
		
		
	}
	private static Task createTask(String name){
		Task t = AmaltheaFactory.eINSTANCE.createTask();
		t.setName(name);
		return t;
	}
	
	
	@Test
	public void testIsDAG(){
		List<OMEdge> list =new LinkedList<>();
		
		OMTask a= new OMTask(null);
		OMTask b=new OMTask(null);
		OMTask c=new OMTask(null);
		
		list.add(new OMEdge(a,b, 0,0));
		list.add(new OMEdge(a, c, 0,0));
		list.add(new OMEdge(b, c, 0,0));
		
		assertTrue(OMUtil.isDAG(list));
		
		OMTask d=new OMTask(null);
		
		list.add(new OMEdge(d, a, 0,0));
		assertTrue(OMUtil.isDAG(list));
		
		list.add(new OMEdge(c, d, 0,0));
		
		assertFalse(OMUtil.isDAG(list));
		
	}
	
	

}
