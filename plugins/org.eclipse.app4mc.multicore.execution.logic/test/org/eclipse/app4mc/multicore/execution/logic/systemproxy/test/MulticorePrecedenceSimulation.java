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
package org.eclipse.app4mc.multicore.execution.logic.systemproxy.test;

import static org.junit.Assert.assertEquals;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.ISystemProxy;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.SimException;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.SystemProxyFactory;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.SchedulerAlgorithmRegister;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.tracing.ConsoleSchedulerTracer;
import org.junit.Test;

public class MulticorePrecedenceSimulation {
	
	int[][] example4_edf_3_core_c1t1_30 = { { 4, 6 }, { 8, 9 }, { 17, 18 }, { 20, 22 } };
	int[][] example4_edf_3_core_c1t2_30 = { { 0, 2 }, { 6, 8 }, { 12, 14 }, { 18, 20 }, { 24, 26 } };
	int[][] example4_edf_3_core_c1t3_30 = { { 2, 4 }, { 15, 17 } };

	int[][] example4_edf_3_core_c2t1_30 = { { 0, 2 }, { 5, 7 }, { 10, 12 }, { 15, 17 }, { 20, 22 }, { 25, 27 } };
	int[][] example4_edf_3_core_c2t2_30 = { { 9, 10 }, { 12, 15 }, { 22, 25 }, { 27, 28 } };

	@Test
	public void test() throws SimException {
		ExecutionModel m = new ExecutionModel();
		ISystemProxy sim = SystemProxyFactory.createEMSystemProxy(1, SchedulerAlgorithmRegister::createPreemptiveEDF, m);
		/*Setup tasks*/
		sim.addCoreScheduler("C1");
		sim.addTask("C1", "C1T1", 3, 15);
		sim.addTask("C1", "C1T2", 2,  6);
		sim.addTask("C1", "C1T3", 2, 15);
		
		sim.addCoreScheduler("C2");
		sim.addTask("C2","C2T1", 2, 5);
		sim.addTask("C2","C2T2", 4,15);
		
		/*Setup precedence*/
		sim.addTaskPrecedence("C1","C1T3", "C1", "C1T1"); //C1T3 have to be executed before C1T1
		sim.addTaskPrecedence("C1","C1T1", "C2", "C2T2"); //C1T1 have to be executed before C2T2 (other core/scheduler)
		
		sim.addListener("C1", new ConsoleSchedulerTracer("C1"));
		sim.addListener("C2", new ConsoleSchedulerTracer("C2"));
		sim.compute(30);
		
		assertEquals(m.getCores().size(),2);
	}
	
	class XX{
		public XX(String x){
			
		}
	}
	
	
//	public void wasget(){
//		Supplier<ISchedulerAlgorithm> c;
//		c= ()-> new PreemptiveEDFAlgo();
//		c= new Supplier<ISchedulerAlgorithm>() {
//			@Override
//			public ISchedulerAlgorithm get() {
//				return null;
//			}
//		};
//		
//		Function<String,XX> func;
//		func=XX::new;
//		
//		func.apply("~Aloha~");
//		
//		Consumer<String> test= MulticorePrecedenceSimulation::getData;
//		
//		test.accept("HI");
//	}
//	
//	public static String getData(String d){
//		//do something
//		return "go";
//	}

}
