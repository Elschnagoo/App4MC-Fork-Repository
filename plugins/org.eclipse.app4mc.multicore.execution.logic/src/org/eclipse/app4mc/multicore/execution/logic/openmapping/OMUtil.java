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
 *******************************************************************************/

package org.eclipse.app4mc.multicore.execution.logic.openmapping;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;

public class OMUtil {
	
	/**
	 * Create OMMapping from an AMALTHEA MappingModel object.
	 * @param model
	 * @return
	 */
	public static OMMapping createOMMapping(final MappingModel model){
		List<TaskAllocation> allocations = model.getTaskAllocation();
		List<SchedulerAllocation> schedAllocs = model.getSchedulerAllocation();
		
		final Map<ProcessingUnit,OMCore> cores = new HashMap<>();
		final Map<Scheduler,ProcessingUnit> schedToCore = new HashMap<>();


		for(SchedulerAllocation sa:schedAllocs) {
			ProcessingUnit c = sa.getResponsibility().get(0);
			Scheduler s = sa.getScheduler();
			schedToCore.put(s, c);
		}
		
		OMMapping m = new OMMapping();
		for(TaskAllocation ta:allocations){
			Task t = ta.getTask();
			Scheduler s = ta.getScheduler();
			ProcessingUnit c = schedToCore.get(s);
			if(!cores.containsKey(c)){
				cores.put(c, new OMCore(c));
			}
			OMAllocation alloc = new OMAllocation(new OMTask(t), cores.get(c));
			m.addAllocation(alloc);
		}
		
		return m;
	}
	
	/**
	 * Creates a graph out of the ConstraintsModel and a list of OMTasks.
	 * OMTask has a list of runnables. The contained OMRunnables will get interconnected through its pre and post lists.
	 * The OMTask pre and post lists containing OMTasks will get interconnected on the level of tasks as well. Therefore
	 * this function checks if an RunnableSequencingConstraint of the ConstraintsModel referencing runnables regarding to different tasks.
	 * @param omtask
	 * @param cm
	 * @throws MalformedModelException
	 */
	public static void createOMTaskGraph(final List<OMTask> omtask,final ConstraintsModel cm) throws MalformedModelException{
//		Map<OMTask,List<OMRunnable>> resultMap =new HashMap<>();
		
		Map<String,OMRunnable> runnableMap = new HashMap<>();
		Map<OMRunnable,OMTask> runnableTaskMap = new HashMap<>();
		
		for(OMTask task:omtask){
			List<OMRunnable> omlist  = task.getRunnableCallSequence();
//			resultMap.put(task, omlist);
			
			for(OMRunnable r: omlist){
				//to check the task of an runnable
				runnableTaskMap.put(r, task); 
				runnableMap.put(r.getRunnableRef().getUniqueName(), r);
			}
		}
		
		// with runnableMap we can now get all runnable instances by its name
		// with runnableTaskMap we can get the corresponding task for a runnable
		
		for(RunnableSequencingConstraint c : cm.getRunnableSequencingConstraints()){
			try{
				Runnable pre = c.getRunnableGroups().get(0).getRunnables().get(0);
				Runnable post = c.getRunnableGroups().get(1).getRunnables().get(0);
				
				OMRunnable ompre= runnableMap.get(pre.getUniqueName());
				OMRunnable ompost= runnableMap.get(post.getUniqueName());
				if(ompre == null){
					throw new MalformedModelException("RunnableSequencingContraint for runnable " +pre.getName() + ", but is not present in tasks!");
				}else if ( ompost == null){
					throw new MalformedModelException("RunnableSequencingContraint for runnable " + post.getName() + ", but is not present in tasks!");
				}
				ompre.getPost().add(ompost);
//				ompost.getPre().add(ompre);
				
				OMTask taskOfPre= runnableTaskMap.get(ompre);
				OMTask taskOfPost = runnableTaskMap.get(ompost);
				if(taskOfPost!=taskOfPre){
					//runnables are in different tasks
					// => add pre post relation on task layer
					long release= getReleaseInstructions(taskOfPre,ompre);
					long waitUntilRelease= getReleaseInstructions(taskOfPost, ompost)-ompost.getInstructionCount();
					OMEdge t = new OMEdge(taskOfPre,taskOfPost, release,waitUntilRelease);
					taskOfPre.getPosts().add(t);
				}

			}catch(Exception e){
				throw new MalformedModelException(e.getMessage());
			}
		}
	}
	
	
	
	/**
	 * Restructure the privieded OMAllocation to a Java-Map with cores as keys and task-list as values.
	 * @param list
	 * @return
	 */
	public static Map<OMCore,List<OMTask>> getCoreTaskMap(final List<OMAllocation> list){
		Map<OMCore, List<OMTask>> result =
                list.stream().collect(
                        Collectors.groupingBy(OMAllocation::getCore, 
                                Collectors.mapping(OMAllocation::getTask, Collectors.toList())
                        )
                );
		return result;
	}
	
	
	/**
	 * Get the utilization of the core if the provided task-list runs on it. 
	 * @param c
	 * @param tasks
	 * @return utilization (1 is 100% utilization)
	 */
	public static double getUtilization(final OMCore c, final List<OMTask> tasks)throws MalformedModelException{
		DoubleAdder d = new DoubleAdder();
		for(OMTask t: tasks){
			if(t.getInstructionCount()<=0){
				throw new MalformedModelException("Task " + t.getTaskRef().getName() + " instruction-count is lesser equal zero!");
			}
			d.add(((double)getProcessingTime(c,t.getInstructionCount()))/t.getPeriod());
		}
		return d.doubleValue();
	}
	
	/**
	 * Get the major cycle of the provided task-list. Also known as hyper-period.
	 * @param tasks
	 * @return
	 */
	public static long getMajorCycle(final List<OMTask> tasks){
		return lcm(tasks.parallelStream().map(OMTask::getPeriod).collect(Collectors.toList()));
	}
	
	
	/**
	 * Get least common multiple of all passed values.
	 * @param values
	 * @return
	 */
	private static long lcm(List<Long> values){
		assert values !=null;
		assert 1 >= values.size();
		long result = values.get(0);
		
		long[] longArr = new long[values.size()];
		int i=0;
		for(Long v:values){
			longArr[i] = v;
			i++;
		}
		
		lcm(longArr);
		
		return result;
	}
	
	private static long lcm(long a, long b)
	{
	    return a * (b / gcd(a, b));
	}

	private static long lcm(long[] input)
	{
	    long result = input[0];
	    for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
	    return result;
	}
	
	private static long gcd(long a, long b)
	{
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}
	


	/**
	 * Adds the instructions of the runnable call sequence from the provided task up to the last 
	 * occurrence of the passed runnable.
	 * @param taskOfPre
	 * @param ompre
	 * @return
	 */
	private static long getReleaseInstructions(final OMTask taskOfPre, final OMRunnable ompre) {
		
		long overallInstructions=0;
		long releaseInstructions = 0;
		for(OMRunnable r: taskOfPre.getRunnableCallSequence()){
			overallInstructions+=r.getInstructionCount();
			if(r==ompre){
				releaseInstructions=overallInstructions;
			}
		}
		return releaseInstructions;
	}
	
	/**
	 * Get the time how long the provided core need to process the passed instruction-count.
	 * @param core
	 * @param instuctionCount
	 * @return time in pico-seconds.
	 * @throws MalformedModelException 
	 */
	public static long getProcessingTime(final OMCore core, final long instuctionCount) throws MalformedModelException{
		final BigInteger ips = BigInteger.valueOf(core.getInstructionsPerSecond());
		// Number of Instructions
		final BigInteger ins = BigInteger.valueOf(instuctionCount);
		// Piko-Seconds per Second
		final BigInteger psps = BigInteger.valueOf(1000L * 1000L * 1000L * 1000L);
		final BigInteger computationTime = psps.multiply(ins).divide(ips);
		return computationTime.longValueExact();
	}
	
	

	/**
	 * Check if the provided graph is acyclic. Therefore the graph gets topologically sorted. If it can't be
	 * sorted its cyclic.
	 * @param edges
	 * @return
	 */
	public static boolean isDAG(final Collection<OMEdge> edges){
		return getTopologicallySoretedTasks(edges)!=null;
	}
	
	/**
	 * Create a list of tasks from the provided task-graph by topologically sort it.
	 * @param edges
	 * @return sorted series of tasks or null if the graph is cyclic and can't be sorted.
	 */
	public static List<OMTask> getTopologicallySoretedTasks(final Collection<OMEdge> edges){
		
		List<OMTask> resultList= new LinkedList<>();
		Map<OMTask, Set<OMTask>> predecessorMap = new HashMap<>(); //get all predecessor from successor
		
		for(OMEdge e:edges){
			/*put all task to map at first occurrence*/
			if(!predecessorMap.containsKey(e.getPost())){
				//nachfolger nicht in map
				predecessorMap.put(e.getPost(), new HashSet<>());
			}
			if(!predecessorMap.containsKey(e.getPre())){
				predecessorMap.put(e.getPre(), new HashSet<>()); 
			}
			/*add predecessor task to predecessor list of successor (post task)*/
			predecessorMap.get(e.getPost()).add(e.getPre());
		}

		while(predecessorMap.size()>0){

			OMTask curTask=null;
			for(Map.Entry<OMTask, Set<OMTask>>t: predecessorMap.entrySet()){
				if(t.getValue().size()==0){
					curTask = t.getKey();
					break;
				}
			}
			if(curTask==null){
				//all remaining tasks have predecessors => cyclic graph
				return null;
			}else{
				resultList.add(curTask);
				predecessorMap.remove(curTask);
				//remove it as predecessor
				for(Set<OMTask> list:predecessorMap.values()){
					list.remove(curTask);
				}
			}
		}
		
		return resultList;
		
	}
	
	/**
	 * Search the corresponding core for the provided task in the mapping.
	 * @param mapping
	 * @param t
	 * @return core where the task runs on or null if not found.
	 */
	public static OMCore getCoreForTask(OMMapping mapping, OMTask t){
		for(OMAllocation alloc:mapping.getAllocationList()){
			if(alloc.getTask()==t){
				return alloc.getCore();
			}
		}
		return null;
	}
}
