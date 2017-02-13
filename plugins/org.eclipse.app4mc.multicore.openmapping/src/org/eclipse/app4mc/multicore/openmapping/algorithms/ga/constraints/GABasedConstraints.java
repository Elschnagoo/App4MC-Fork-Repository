/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.algorithms.ga.constraints;

import java.util.function.Function;
import java.util.stream.Stream;

import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractGABasedMappingAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.algorithms.helper.ProblemGraph;
import org.eclipse.app4mc.multicore.openmapping.algorithms.helper.TimeStep;
import org.eclipse.app4mc.multicore.openmapping.model.AmaltheaModelBuilder;
import org.eclipse.app4mc.multicore.openmapping.model.OMAllocation;
import org.eclipse.app4mc.multicore.openmapping.model.OMCore;
import org.eclipse.app4mc.multicore.openmapping.model.OMMapping;
import org.eclipse.app4mc.multicore.openmapping.model.OMTask;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.ConsoleOutputHandler;
import org.eclipse.app4mc.multicore.openmapping.visualizer.OMVisualizer;
import org.jenetics.Chromosome;
import org.jenetics.Genotype;
import org.jenetics.IntegerChromosome;
import org.jenetics.IntegerGene;
import org.jenetics.Optimize;
import org.jenetics.engine.Engine;
import org.jenetics.engine.EvolutionResult;
import org.jenetics.engine.EvolutionStatistics;
import org.jenetics.engine.EvolutionStream;
import org.jenetics.stat.DoubleMomentStatistics;
import org.jenetics.util.Factory;

public class GABasedConstraints extends AbstractGABasedMappingAlgorithm {
	/**
	 * Console Output
	 */
	private final ConsoleOutputHandler con = new ConsoleOutputHandler("OpenMapping Console");
	/**
	 * Problem Graph
	 */
	private static ProblemGraph problemGraph;
	/**
	 * Execution Costs Matrix
	 */
	private static long[][] utilMatrix;
	

	/* (non-Javadoc)
	 * @see org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractMappingAlgorithm#calculateMapping()
	 */
	@Override
	public void calculateMapping() {
		final TimeStep timeStep;
		
		this.con.appendln("Performing GA based Hard/Soft Constraint violation optimization");
		
		// Prepare models
		this.con.appendln("Preparing Models...");
		if (!this.initModels()) {
			this.con.appendln("Error during Model initialization, exiting.");
			return;
		}
		
		// Get list of tasks and calculate their execution time
		timeStep = new TimeStep();
		this.con.appendln("Generating ProblemGraph...");
		problemGraph = new ProblemGraph(this.getMergedModel());
		if (!problemGraph.initialize()) {
			this.con.appendln("Error during ProblemGraph initialization, exiting.");
			return;
		}
		this.con.appendln("Success after " + (timeStep.getTimeStep()) / 1000000 + "ms.");

		// Perform the actual Mapping
		this.con.appendln("Creating Mapping...");
		if (!performMappingAlgorithm()) {
			this.con.appendln("Error during performMappingAlgorithm, exiting.");
			return;
		}
		this.con.appendln("Success after " + (timeStep.getTimeStep()) / 1000000 + "ms.");
		this.con.appendln("Leaving mapping algorithm.");
		
	}
	
	/**
	 * Check if a task can be mapped to a given Core
	 * @param task task to be mapped
	 * @param core core to check
	 * @return true if it can be mapped false otherwise
	 */
	private static boolean checkValidCores(OMTask task, OMCore core) {
		// FIXME: Uncomment this once the method implementation is merged
//		return problemGraph.getValidAlocationTargets(task).contains(core);
		return false;
	}
	
	/**
	 * Print the mapping warnings into the console
	 * @param mappingResult
	 */
	private void printWarnings(final Genotype<IntegerGene> mappingResult) {
		int taskIndex = 0;
		String output;
		// Since our encoding has only one Chromosome
		Chromosome<IntegerGene> chromosome = mappingResult.getChromosome(0);
		
		if (GABasedConstraints.evaluate(mappingResult) == 0) {
			return;
		}
		
		output =  "+--------------------------------------------------------+\n";
		output += "|             WARNING! Constraints Violated              |\n";
		output += "+------------------+------------------+------------------+\n";
		output += "| Type             | Task             | Core             |\n";
		output += "+------------------+------------------+------------------+\n";
		
		// Iterate over all genes. Note that genes are indexed by taskindex
		for (IntegerGene gene: chromosome) {
			// Get the core index
			final int coreIndex = gene.getAllele();

			// Fetch task and core
			final OMCore core = problemGraph.getCoreList().get(coreIndex);
			final OMTask task = problemGraph.getTaskList().get(taskIndex++);
	
			// Check for every Hard Constraints
			if (!checkValidCores(task, core)) {
				
				output += String.format("| %-16s | %-16s | %-16s |\n", "Tag", task.getTaskRef().getName(), core.getCoreRef().getName());
				output += "+------------------+------------------+------------------+\n";
			}

		}
		
		this.con.appendln("\n" + output);
		
	}

	/**
	 * Perform mapping algorithm
	 * @return return true if performed correctly or false otherwise
	 */
	private boolean performMappingAlgorithm() {
		final int noCores = problemGraph.getCoreList().size();
		final int noTasks = problemGraph.getTaskList().size();
		utilMatrix = new long[noCores][noTasks];
		
		// Estimate execution time of each task on each core
		for (int coreIndex = 0; coreIndex < noCores; coreIndex++) {
			// Process tasks
			for (int taskIndex = 0; taskIndex < noTasks; taskIndex++) {
				final OMAllocation allocation = new OMAllocation(problemGraph.getTaskList().get(taskIndex), 
						problemGraph.getCoreList().get(coreIndex));
				
				// Time to process 'task' on 'core' in our smallest Unit (ps)
				utilMatrix[coreIndex][taskIndex] = allocation.calculateProcessingTime();
			}
		}

		// The Chromosome contains count(noTasks) integer Values ranging from 0
		// till count(noCores)-1
		final Factory<Genotype<IntegerGene>> gtf = Genotype.of(IntegerChromosome.of(0, noCores - 1, noTasks));

		// It appears the typecast is required on some Eclipse versions, which
		// may throw an "java.lang.Error: Unresolved
		// compilation problems" otherwise.
		final Engine<IntegerGene, Double> engine = Engine
				.builder((Function<Genotype<IntegerGene>, Double>) GABasedConstraints::evaluate, gtf)
				.optimize(Optimize.MINIMUM).populationSize(noTasks).build();
		final EvolutionStream<IntegerGene, Double> stream = engine.stream();
		final EvolutionStatistics<Double, DoubleMomentStatistics> statistics = EvolutionStatistics.ofNumber();
		final Stream<EvolutionResult<IntegerGene, Double>> stream2 = stream.limit(1000).peek(statistics);
		final Genotype<IntegerGene> result = stream2.collect(EvolutionResult.toBestGenotype());
		// 4.) Start the execution (evolution) and
		// collect the result.
		this.con.appendln(statistics.toString());
		this.con.appendln(result.toString() + " -> " + GABasedConstraints.evaluate(result));

		final OMMapping mapping = generateOMMapping(result);
		final AmaltheaModelBuilder builder = new AmaltheaModelBuilder(mapping);
		this.getMergedModel().setOsModel(builder.getAmaltheaModel().getOsModel());
		this.getMergedModel().setMappingModel(builder.getAmaltheaModel().getMappingModel());
		this.setAmaltheaOutputModel(this.getMergedModel());
		
		printWarnings(result);
		
		final OMVisualizer vis = new OMVisualizer(mapping);
		this.con.appendln("\n" + vis.getASCIIChart());

		return true;
	}

	/**
	 * Generate Mapping Model result out of result genotype
	 * @param mappingResult  result genotype
	 * @return Mapping Model
	 */
	private OMMapping generateOMMapping(final Genotype<IntegerGene> mappingResult) {
		final OMMapping mapping = new OMMapping();		
		int taskIndex = 0;
		// Since our encoding has only one Chromosome
		Chromosome<IntegerGene> chromosome = mappingResult.getChromosome(0);
		
		// After the algorithm passes, we should have only one solution.
		if (mappingResult.length() != 1) {
			// Error & Exit
			this.con.appendln("Invalid number of Genes");
			return null;
		}
		
		
		System.out.println("+--------------------------------------------------------+");
		System.out.println("|                   Mapping Summary                      |");
		System.out.println("+----------------------------+---------------------------+");
		System.out.println("|            Task            |             Core          |");
		System.out.println("+----------------------------+---------------------------+");
		
		// Iterate over all genes. Note that genes are indexed by taskindex
		for (IntegerGene gene: chromosome) {
			// Get the core index
			final int coreIndex = gene.getAllele();
			
			// Fetch task and core
			final OMCore core = problemGraph.getCoreList().get(coreIndex);
			final OMTask task = problemGraph.getTaskList().get(taskIndex++);
			
			System.out.printf("| %-26s | %-25s |\n", task.getTaskRef().getName(), core.getCoreRef().getName());
			System.out.println("+----------------------------+---------------------------+\n");
			
			// Create Allocation and store it in the allocation List
			final OMAllocation alloc = new OMAllocation(task, core);
			mapping.addAllocation(alloc);
			
		}
		
		System.out.println("+----------------------------+---------------------------+\n");
		
		return mapping;
	}
	
		
	/**
	 * Count all the Hard constraints violations for task mapped to a give core
	 * @param task task
	 * @param core core
	 * @return number of violations
	 */
	private static int countHardConstraintsViolations(OMTask task, OMCore core){
		int violationCount = 0;
		
		// Check Whitelist of valid targets
		if (!checkValidCores(task, core)) {
			violationCount++;
		}
		
		// Check any other hardconstraints
		
		return violationCount;
	}
	
	/**
	 * Count all the Soft constraints violations for task mapped to a give core
	 * @param task task
	 * @param core core
	 * @return number of violations
	 */
	private static int countSoftConstraintsViolations(OMTask task, OMCore core ){
		// TODO Add soft constraints checking here
		return 0;
	}
	
	/**
	 * Calculate Load Imbalance of a given mapping solution. Load imbalance is calculated
	 * as the standard deviation of the execution time of all cores.
	 * @param chromosome chromosome representation of the mapping solution
	 * @return load imbalance of mapping solution
	 */
	private static Double calculateLoadImbalance(final Chromosome<IntegerGene> chromosome){
		double loadImbalance = 0;
		double coreExecutionTime[] = new double[problemGraph.getCoreList().size()];
		double meanExecutionTime = 0;
		double maxExecutionTime = 0;
		int taskIndex = 0;
		
		// Sum all execution times corresponding to a given core
		for (IntegerGene gene: chromosome) {
			final int coreIndex = gene.getAllele();
			coreExecutionTime[coreIndex] += utilMatrix[coreIndex][taskIndex++];
		}
		
		// Get maximum execution time
		for (double coreExcTime : coreExecutionTime) {
			maxExecutionTime = (coreExcTime > maxExecutionTime)? coreExcTime : maxExecutionTime;
		}
		
		// Normalize all execution times dividing by maximum
		for (int coreIndex = 0; coreIndex < coreExecutionTime.length; coreIndex++) {
			coreExecutionTime[coreIndex] = coreExecutionTime[coreIndex]/maxExecutionTime;
		}
		
		// Calculate mean
		for (double coreExcTime : coreExecutionTime) {
			meanExecutionTime += coreExcTime;
		}
		meanExecutionTime = meanExecutionTime/((double)coreExecutionTime.length);
		
		// Calculate sum = (coreExcTime(i) - meanExecutionTime)^2
	    for (double coreExcTime: coreExecutionTime) {
	    	loadImbalance += Math.pow(coreExcTime - meanExecutionTime, 2);
	    }

	    // Multiply the sum with 1/(N - 1)
	    loadImbalance = loadImbalance / ((double)(coreExecutionTime.length - 1));

	    // Take the square root
	    loadImbalance = Math.sqrt(loadImbalance);
	    
		return loadImbalance;
	}

	/**
	 * Fitness function that adds all violations together
	 * @param gt a given genotype
	 * @return sum of all violations with different penalty for different constraints types
	 */
	public static Double evaluate(final Genotype<IntegerGene> gt) {
		final int HARDCONSTRAINT_PENALTY = 100;
		final int SOFTCONSTRAINT_PENALTY = 1;
		Double penaltySum = new Double(0);
		int taskIndex = 0;
		// Since our encoding has only one Chromosome
		Chromosome<IntegerGene> chromosome = gt.getChromosome(0);
		
		// Consider load imbalance as hard penalty		
		penaltySum += HARDCONSTRAINT_PENALTY * calculateLoadImbalance(chromosome);
		
		// Iterate over all genes. Note that genes are indexed by taskindex
		for (IntegerGene gene: chromosome) {
			// Get the core index
			final int coreIndex = gene.getAllele();
			
			// Fetch task and core
			final OMCore core = problemGraph.getCoreList().get(coreIndex);
			final OMTask task = problemGraph.getTaskList().get(taskIndex++);
			
			// Check Hard constraints
			penaltySum += HARDCONSTRAINT_PENALTY * countHardConstraintsViolations(task, core);
			
			// Check Soft constraints
			penaltySum += SOFTCONSTRAINT_PENALTY * countSoftConstraintsViolations(task, core);
			
		}

		return penaltySum;
	}

}
