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
package org.eclipse.app4mc.multicore.execution.logic.systemproxy.multicoresystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

import org.eclipse.app4mc.multicore.execution.logic.systemproxy.ISystemProxy;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.SimException;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerAlgorithm;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerEventListener;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerTask;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.IStepScheduler;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core.Barrier;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core.StepScheduler;

public class MultiCoreSystem implements ISystemProxy{
	
	private boolean run = false;

	/** Factory to create instances of scheduler algorithms */
	private final Supplier<ISchedulerAlgorithm> schedulerAlgoFactory;

	/** One scheduler for each core */
	private Map<String, IStepScheduler> schedulers = new HashMap<>();

	private final long timeScale;

	/**
	 * Indicates if synchronization through multiple cores is setup. Depending
	 * on this {@link #compute(long time)}uses different scheduling computation.
	 */
	private boolean interCoreSynch=false;
	
	private boolean interrupted=false;
	
//	private int computationPercent=0;

	public MultiCoreSystem(long timeScale, Supplier<ISchedulerAlgorithm> schedulerFactory) {
		this.timeScale = timeScale;
		this.schedulerAlgoFactory = schedulerFactory;
	}

	/**
	 * Compute the simulation. This is only permitted once for every instance.
	 * Time is passed in pico-seconds. Time is scaled  by
	 * <code>timeScale</code> (rounding up) provided at creation.
	 * 
	 * @param time Time to scedule until
	 * @throws SimException If already run.
	 */
	public void compute(long time) throws SimException {
		if (!run) {
			run = true;
			time = SimUtil.scaleRoundUp(time, timeScale);
			
			getSchedulers().values().forEach(IStepScheduler::init);
			
			if (interCoreSynch) {
				simulateSynchronous(time);
			} else {
				simulateAsynchronous(time);
			}
		} else {
			throw new SimException("Cant run sim more than once!");
		}
	}


	
	public void interruptComputation(){
		interrupted = true;
	}
	
	/**
	 * Compute the scheduling for each core-scheduler. As long there is no inter-core-synchronization
	 * run absolute independently. Therefore this mehtod parallelize the computation with up to 10 threads.
	 * @param simulationTime
	 * @throws SimException
	 */
	private void simulateAsynchronous(final long simulationTime) throws SimException{
		int num = getSchedulers().size();
		
//		final int eachSchedulerPercentage= 100/num;
		
		List<Callable<Boolean>> cl=new LinkedList<>();
		for (final Map.Entry<String, IStepScheduler> entry : getSchedulers().entrySet()) {
			cl.add(new Callable<Boolean>() {
				@Override
				public Boolean call() throws Exception {
					long timecount = 0;
					while (timecount <= simulationTime) {
						entry.getValue().runTaskOrIdleStep();
						entry.getValue().updateTaskSynchronisation();
						entry.getValue().updateTaskSet();
						
						if(interrupted){
							return false;
						}
						timecount= Math.addExact(timecount, 1);
					}
					return true;
				}
			});
		}
		ExecutorService taskExecutor = Executors.newFixedThreadPool(num>10?10:num);
		try {
			List<Future<Boolean>> results=taskExecutor.invokeAll(cl);
			//invokeAll: Blocks until all callables have finished execution or throw exception
			taskExecutor= null;
			for(Future<Boolean> result:results){
				if(!result.get()){
					throw new SimException("Interrupted scheduling!");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			throw new SimException(e.getMessage());
		} catch (ExecutionException e) {
			e.printStackTrace();
			//an error occurred while execution (e.g. scheduler Exception from scheduleUntil)
			throw new SimException(e.getMessage());
		}
		
//		Java 8 via streams... 
//		try{
//		getSchedulers().entrySet().parallelStream().forEach(
//				x->{
//					try {
//						x.getValue().runTaskOrIdleStep();
//						x.getValue().updateTaskSynchronisation();
//						x.getValue().updateTaskSet();
//						if (Thread.currentThread().isInterrupted()) {
//							return;
//						}
//					} catch (SchedulerException e) {
//						throw new RuntimeException("Scheduling at core: " + x.getKey() + e.getMessage());
//					}
//				}
//		);
//		}catch(RuntimeException e){
//			throw new SimException(e.getMessage());
//		}
	}

	/**
	 * This method provides step by step computation of the scheduling. 
	 * This is necessary if there is inter-core-synchronization.	
	 * @param simulationTime
	 * @throws SimException
	 */
	private void simulateSynchronous(final long simulationTime) throws SimException {
		long timecount = 0;
		while (timecount <= simulationTime) {
			getSchedulers().values().forEach(IStepScheduler::runTaskOrIdleStep);
			getSchedulers().values().forEach(IStepScheduler::updateTaskSynchronisation);
			getSchedulers().values().forEach(IStepScheduler::updateTaskSet);
			
			if(interrupted){
				throw new SimException("Interrupted scheduling!");
			}
			try{
				timecount= Math.addExact(timecount, 1);
			}catch(ArithmeticException e){
				throw new SimException(e.getMessage());
			}
			
		}
		
	}
	

	protected Map<String, IStepScheduler> getSchedulers() {
		return schedulers;
	}

	

	/**
	 * Add a core to the simulation. Every core has a scheduler which will be
	 * created from the scheduler factory passed at creation.
	 * 
	 * @param corename
	 */
	public void addCoreScheduler(String corename) {
		if (!getSchedulers().containsKey(corename)) {
			StepScheduler s = new StepScheduler(schedulerAlgoFactory.get());
			getSchedulers().put(corename, s);
		}
	}

	/**
	 * Add a SchedulerEventListener to a core. 
	 * Each core has a independent scheduler.
	 * @param coreName Name of the core.
	 * @param l Listener-instance.
	 */
	public void addListener(String coreName, ISchedulerEventListener l) {
		getSchedulers().get(coreName).addSchedulerEventListener(l);
	}

	/**
	 * Add task to simulation. If provided core does not exist it will be created.
	 * @param core
	 * @param name
	 * @param wcet
	 * @param period
	 */
	public void addTask(String core, String name, long wcet, long period) {
		IStepScheduler s = getSchedulers().get(core);
		if (s == null) {
			addCoreScheduler(core);
			s = getSchedulers().get(core);
		}
		wcet = SimUtil.scaleRoundUp(wcet, timeScale);
		period = SimUtil.scaleRoundUp(period, timeScale);

		s.addTask(name, wcet, period);
	}
	
	public void addTaskPrecedence(String preCore,String preTask,String postCore,String postTask) throws SimException{
		addTaskPrecedence(preCore, preTask, ISchedulerTask.BARRIER_UNLOCK_AT_SUSPENSION, postCore,postTask);
	}

	public void addTaskPrecedence(String preCore, String preTask, long releaseTime, String postCore, String postTask) throws SimException{
		
		if(preTask.equals(postTask)){
			throw new SimException("Precedence on Task " + preTask + ": Self-Transition is not possible!");
		}
		
		IStepScheduler preCoreScheduler = getSchedulers().get(preCore);
		IStepScheduler postCoreScheduler = getSchedulers().get(postCore);
		
		if(preCoreScheduler==null){
			throw new SimException("No scheduler available for core: "+ preCore);
		}else if(postCoreScheduler==null){
			throw new SimException("No scheduler available for core: "+ postCore);
		}
		
		ISchedulerTask pre =preCoreScheduler.getTask(preTask);
		ISchedulerTask post = postCoreScheduler.getTask(postTask);
		
		if(pre==null){
			throw new SimException("Task "+preTask + " not available!");
		}else if(post==null){
			throw new SimException("Task "+postTask + " not available!");
		}
		
		if(pre.getPeriod()!=post.getPeriod()){
			throw new SimException("Task " + preTask +" and "+postTask+" do not have an equivalent period! Only equal periods are permitted for task precedence!");
		}
		
		Barrier m = new Barrier();
		m.setName("bar_task_precedence_"+preTask+"->"+postTask);
		
		if(releaseTime!=ISchedulerTask.BARRIER_UNLOCK_AT_SUSPENSION){
			releaseTime = SimUtil.scaleRoundUp(releaseTime,timeScale);
		}
		
		pre.addOwnedBarrier(m,releaseTime);
		post.addDependentBarrier(m);
		
		
		if(!preCore.equals(postCore)){
			interCoreSynch=true;
		}
	}

}
