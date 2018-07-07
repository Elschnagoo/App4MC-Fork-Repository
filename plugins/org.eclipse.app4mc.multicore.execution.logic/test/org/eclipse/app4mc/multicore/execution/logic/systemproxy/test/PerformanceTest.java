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

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.test;

import java.lang.reflect.Field;

import org.eclipse.app4mc.multicore.execution.logic.systemproxy.ISystemProxy;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.SimException;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.SystemProxyFactory;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.multicoresystem.MultiCoreSystem;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.SchedulerAlgorithmRegister;
import org.junit.Test;

public class PerformanceTest {

	private static final long PS_PER_MS = 1000L*1000L*1000L;

	private static final String[] CORES = {"cog 0", "cog 1","cog 3", "cog 7"};

	private static final int RUNS_FOR_AVARAGE = 5;

//	@Test
//	public void testCooperativeTaskVisualization() throws SimException {
//		System.err.println("START testCooperativeTaskVisualization");
//		ISystemProxy s = SystemProxyFactory.createSystemProxy(1000,SchedulerAlgorithmFactory::createCooperativeEDF);
//		addCores(s);
//		addTasks(s);
//		long start = System.currentTimeMillis();
//		s.compute(100*PS_PER_MS);//100 ms 
//		System.err.println("Time: "+ (System.currentTimeMillis()-start) +" ms");
//	}
	
//	@Test
//	public void testPreemptiveTaskVisualizationPS() throws SimException {
//		System.err.println("START testPreemptiveTaskVisualizationPS");
//		ISystemProxy s = SystemProxyFactory.createSystemProxy(ISystemProxy.TIME_SCALE_PS,
//				SchedulerAlgorithmRegister::createPreemptiveEDF);
//		addCores(s);
//		addTasks(s);
//		long start = System.currentTimeMillis();
//		s.compute(500*PS_PER_MS); //0.5 s 
//		long duration = System.currentTimeMillis()-start; //(02.12.16: took 100s)
//		System.err.println("Time: "+ duration +" ms");
//	}
	
	/*1 ms*/
	
	@Test
	public void testPreemptiveTaskVisualization_1ms_ps() throws SimException {
		System.err.println("Performance-Test: 1ms, scale ps");
		long duration = simulateAsynch(1*PS_PER_MS,ISystemProxy.TIME_SCALE_PS);
		System.err.println("Time: "+ duration +" ms");
	}
//	@Test
	public void testPreemptiveTaskVisualization_1ms_ps_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 1ms, scale ps, intetercore");
		long duration = simulateInterCore(1*PS_PER_MS,ISystemProxy.TIME_SCALE_PS);
		System.err.println("Time: "+ duration +" ms");
	}
	
	@Test
	public void testPreemptiveTaskVisualization_1ms_ns() throws SimException {
		System.err.println("Performance-Test: 1ms, scale ns");
		long duration = simulateAsynch(1*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
	@Test
	public void testPreemptiveTaskVisualization_1ms_ns_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 1ms, scale ns, intetercore");
		long duration = simulateInterCore(1*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
	
	@Test
	public void testPreemptiveTaskVisualization_1ms_us() throws SimException {
		System.err.println("Performance-Test: 1ms, scale us");
		long duration = simulateAsynch(1*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}
	@Test
	public void testPreemptiveTaskVisualization_1ms_us_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 1ms, scale us, intetercore");
		long duration = simulateInterCore(1*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}
	
	
	/*10 ms*/
//	@Test
	public void testPreemptiveTaskVisualization_10ms_ps() throws SimException {
		System.err.println("Performance-Test: 10ms, scale ps");
		long duration = simulateAsynch(10*PS_PER_MS,ISystemProxy.TIME_SCALE_PS);
		System.err.println("Time: "+ duration +" ms");
	}
//	@Test
	public void testPreemptiveTaskVisualization_10ms_ps_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 10ms, scale ps, intetercore");
		long duration = simulateInterCore(10*PS_PER_MS,ISystemProxy.TIME_SCALE_PS);
		System.err.println("Time: "+ duration +" ms");
	}
	
	@Test
	public void testPreemptiveTaskVisualization_10ms_ns() throws SimException {
		System.err.println("Performance-Test: 10ms, scale ns");
		long duration = simulateAsynch(10*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
	@Test
	public void testPreemptiveTaskVisualization_10ms_ns_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 10ms, scale ns, intetercore");
		long duration = simulateInterCore(10*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
	
	@Test
	public void testPreemptiveTaskVisualization_10ms_us() throws SimException {
		System.err.println("Performance-Test: 10ms, scale us");
		long duration = simulateAsynch(10*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}
	@Test
	public void testPreemptiveTaskVisualization_10ms_us_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 10ms, scale us, intetercore");
		long duration = simulateInterCore(10*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}
	
	/*100 ms*/
// not managabele: approx. core i5 4x2.5 GHz: 80.000 s => 22,2 h per run
//	@Test
//	public void testPreemptiveTaskVisualization_100ms_ps() throws SimulatorException {
//		System.err.println("Performance-Test: 100ms, scale ps");
//		long duration = simulateAsynch(100*PS_PER_MS,ISystemProxy.TIME_SCALE_PS);
//		System.err.println("Time: "+ duration +" ms");
//	}
//	@Test
//	public void testPreemptiveTaskVisualization_100ms_ps_intercore() throws SimulatorException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
//		System.err.println("Performance-Test: 10ms, scale ps, intetercore");
//		long duration = simulateInterCore(100*PS_PER_MS,ISystemProxy.TIME_SCALE_PS);
//		System.err.println("Time: "+ duration +" ms");
//	}
	
	@Test
	public void testPreemptiveTaskVisualization_100ms_ns() throws SimException {
		System.err.println("Performance-Test: 100ms, scale ns");
		long duration = simulateAsynch(100*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
	@Test
	public void testPreemptiveTaskVisualization_100ms_ns_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 100ms, scale ns, intetercore");
		long duration = simulateInterCore(100*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
	
	@Test
	public void testPreemptiveTaskVisualization_100ms_us() throws SimException {
		System.err.println("Performance-Test: 100ms, scale us");
		long duration = simulateAsynch(100*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}
	@Test
	public void testPreemptiveTaskVisualization_100ms_us_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 100ms, scale us, intetercore");
		long duration = simulateInterCore(100*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}
	
	/*500 ms*/
	
	@Test
	public void testPreemptiveTaskVisualization_05s_ns() throws SimException {
		System.err.println("Performance-Test: 0.5s, scale ns");
		long duration = simulateAsynch(500*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
//	@Test
	public void testPreemptiveTaskVisualization_05s_ns_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 0.5s, scale ns, intetercore");
		long duration = simulateInterCore(500*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
	
	@Test
	public void testPreemptiveTaskVisualization_05s_us() throws SimException {
		System.err.println("Performance-Test: 0,5s, scale us");
		long duration = simulateAsynch(500*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}
	@Test
	public void testPreemptiveTaskVisualization_05s_us_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 0,5s, scale us, intetercore");
		long duration = simulateInterCore(500*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}
	
	/*1000ms*/
	
//	@Test
	public void testPreemptiveTaskVisualization_1s_ns() throws SimException {
		System.err.println("Performance-Test: 1s, scale ns");
		long duration = simulateAsynch(1000*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
//	@Test
	public void testPreemptiveTaskVisualization_1s_ns_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 1s, scale ns, intetercore");
		long duration = simulateInterCore(1000*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
	
	@Test
	public void testPreemptiveTaskVisualization_1s_us() throws SimException {
		System.err.println("Performance-Test: 1s, scale us");
		long duration = simulateAsynch(1000*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}
	@Test
	public void testPreemptiveTaskVisualization_1s_us_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 1s, scale us, intetercore");
		long duration = simulateInterCore(1000*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}
	
	/*2000ms*/
//	@Test
	public void testPreemptiveTaskVisualization_2s_ns() throws SimException {
		System.err.println("Performance-Test: 2s, scale ns");
		long duration = simulateAsynch(2000*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
	@Test
	public void testPreemptiveTaskVisualization_2s_ns_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 2s, scale ns, intetercore");
		long duration = simulateInterCore(2000*PS_PER_MS,ISystemProxy.TIME_SCALE_NS);
		System.err.println("Time: "+ duration +" ms");
	}
	
	@Test
	public void testPreemptiveTaskVisualization_2s_us() throws SimException {
		System.err.println("Performance-Test: 2s, scale us");
		long duration = simulateAsynch(2000*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}
	@Test
	public void testPreemptiveTaskVisualization_2s_us_intercore() throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.err.println("Performance-Test: 2s, scale us, intetercore");
		long duration = simulateInterCore(2000*PS_PER_MS,ISystemProxy.TIME_SCALE_US);
		System.err.println("Time: "+ duration +" ms");
	}

	
	
	private long simulateAsynch(long time, long scale) throws SimException{
		long simtime=0;
		
		for(int i=0;i<RUNS_FOR_AVARAGE;i++){
			ISystemProxy s = SystemProxyFactory.createSystemProxy(scale,
					SchedulerAlgorithmRegister::createPreemptiveEDF);
			simtime+=sim(s,time,scale);
		}
		return simtime/RUNS_FOR_AVARAGE;
	}
	
	private long simulateInterCore(long time, long scale) throws SimException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		
		long simtime=0;
		
		for(int i=0;i<RUNS_FOR_AVARAGE;i++){
			MultiCoreSystem s =(MultiCoreSystem)SystemProxyFactory.createSystemProxy(scale,
					SchedulerAlgorithmRegister::createPreemptiveEDF);
			Field f = MultiCoreSystem.class.getDeclaredField("interCoreSynch");
			f.setAccessible(true);
			f.set(s,true);
			simtime+=sim(s,time,scale);
		}
		
		return simtime/RUNS_FOR_AVARAGE;
	}
	
	private long sim(ISystemProxy s, long time, long scale) throws SimException{
		addCores(s);
		addTasks(s);
		long start = System.currentTimeMillis();
		s.compute(time); //0,5s
		return System.currentTimeMillis()-start;
	}
	
	
	private static void addCores(ISystemProxy s) {
		for(String core: CORES){
			s.addCoreScheduler(core);
//			s.addListener(core, new ConsoleSchedulerTracer("ConTrace "+core));
//			FileSchedulerTracer t = new FileSchedulerTracer(SIMNAME, "scheduling_trace_core_"+core+".txt");

		}
	}
	private static void addTasks(ISystemProxy s) {
		s.addTask(CORES[0], "Task_ESSP0", 400003500000L, 402000000000L);
		s.addTask(CORES[1], "Task_ESSP4", 10129333333L,   12000000000L);
		s.addTask(CORES[2], "Task_ESSP3", 132279083333L, 220000000000L);
		s.addTask(CORES[2], "Task_ESSP2", 20000833333L,  201000000000L);
		s.addTask(CORES[3], "Task_ESSP5", 133334333333L, 201000000000L);
		s.addTask(CORES[3], "Task_ESSP1", 40071583333L,  125000000000L);
	}


	
//	public void test(){
//		Supplier<ISchedulerAlgorithm> c;
//		
//		//Point to constructor of concrete class
//		c= PreemptiveEDFAlgo::new;
//		ISchedulerAlgorithm a1= c.get();
//		//Point to static method
//		c=SimulatorTest::createStatic;
//		ISchedulerAlgorithm a2 = c.get();
//		//Point to object member method
//		c=this::createMember;
//		ISchedulerAlgorithm a3 = c.get();
//		
//		c = ()->new PreemptiveEDFAlgo();
//		//<=>
//		c = new Supplier<ISchedulerAlgorithm>(){
//			@Override
//			public ISchedulerAlgorithm get() {
//				return new PreemptiveEDFAlgo();
//			}
//		};
//	}
//	
//	
//	private ISchedulerAlgorithm createMember(){
//		return new PreemptiveEDFAlgo();
//	}
//	
//	private static ISchedulerAlgorithm createStatic(){
//		return new PreemptiveEDFAlgo();
//	}
	

}
