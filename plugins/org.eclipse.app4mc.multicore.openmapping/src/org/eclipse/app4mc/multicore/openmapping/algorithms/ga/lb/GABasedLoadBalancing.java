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
package org.eclipse.app4mc.multicore.openmapping.algorithms.ga.lb;

import java.util.ArrayList;
import java.util.List;
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

public class GABasedLoadBalancing extends AbstractGABasedMappingAlgorithm {
	/**
	 * List of tasks
	 */
	private static List<OMTask> taskList = new ArrayList<OMTask>();
	/**
	 * List of Cores
	 */
	private static List<OMCore> coreList = new ArrayList<OMCore>();
	/**
	 * Execution Costs Matrix
	 */
	private static long[][] utilMatrix;
	/**
	 * Console Output
	 */
	private final ConsoleOutputHandler con = new ConsoleOutputHandler("OpenMapping Console");

	/* (non-Javadoc)
	 * @see org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractMappingAlgorithm#calculateMapping()
	 */
	@Override
	public void calculateMapping() {
		final TimeStep timeStep = new TimeStep();

		this.con.appendln("Performing GA based Load Balancing");
		// Create lists of Cores and Tasks
		// TODO Workaround
//		final Amalthea cen = AmaltheaFactory.eINSTANCE.createAmalthea();
//		cen.setSwModel(this.getSwModel());
//		cen.setHwModel(this.getHwModel());
		this.con.appendln("Preparing Models...");
		if (!this.initModels()) {
			this.con.appendln("Error during Model initialization, exiting.");
			return;
		}
		
		// Get list of tasks and calculate their execution time
		timeStep.update();
		this.con.appendln("Generating ProblemGraph...");
		ProblemGraph pg = new ProblemGraph(this.getMergedModel());
		if (!pg.initialize()) {
			this.con.appendln("Error during ProblemGraph initialization, exiting.");
			return;
		}
		GABasedLoadBalancing.taskList = pg.getTaskList();
		GABasedLoadBalancing.coreList = pg.getCoreList();
			
		this.con.appendln(" Success! (" + (timeStep.getTimeStep()) / 1000000 + "ms)");

		// Perform the actual Mapping
		this.con.appendln("Step 4: Creating Mapping...");
		if (!performMappingAlgorithm()) {
			this.con.appendln("Error during performMappingAlgorithm, exiting.");
			return;
		}
		this.con.appendln("Success after " + (timeStep.getTimeStep()) / 1000000 + "ms.");
		this.con.appendln("Leaving mapping algorithm.");
	}

	/**
	 * Perform the Mapping algorithm
	 * @return true if no errors occur
	 */
	private boolean performMappingAlgorithm() {
		final int noCores = GABasedLoadBalancing.coreList.size();
		final int noTasks = GABasedLoadBalancing.taskList.size();
		utilMatrix = new long[noCores][noTasks];

		// Estimate execution time of each task on each core
		for (final OMCore core : GABasedLoadBalancing.coreList) {
			final int indexCore = GABasedLoadBalancing.coreList.indexOf(core);

			// Process tasks
			for (final OMTask task : GABasedLoadBalancing.taskList) {
				final int indexTask = GABasedLoadBalancing.taskList.indexOf(task);
				// Time to process 'task' on 'core' in our smallest Unit (ps)
				utilMatrix[indexCore][indexTask] = new OMAllocation(task, core).calculateProcessingTime();
			}
		}

		// The actual GA based Load Balancing Approach
		// The Chromosome contains count(noTasks) integer Values ranging from 0
		// till count(noCores)-1
		final Factory<Genotype<IntegerGene>> gtf = Genotype.of(IntegerChromosome.of(0, noCores - 1, noTasks));

		// It appears the typecast is required on some Eclipse versions, which
		// may throw an "java.lang.Error: Unresolved
		// compilation problems" otherwise.
		final Engine<IntegerGene, Long> engine = Engine
				.builder((Function<Genotype<IntegerGene>, Long>) GABasedLoadBalancing::evaluate, gtf)
				.optimize(Optimize.MINIMUM).populationSize(noTasks).build();
		final EvolutionStream<IntegerGene, Long> stream = engine.stream();
		final EvolutionStatistics<Long, DoubleMomentStatistics> statistics = EvolutionStatistics.ofNumber();
		final Stream<EvolutionResult<IntegerGene, Long>> stream2 = stream.limit(1000).peek(statistics);
		final Genotype<IntegerGene> result = stream2.collect(EvolutionResult.toBestGenotype());
		// 4.) Start the execution (evolution) and
		// collect the result.
		this.con.appendln(statistics.toString());
		this.con.appendln(result.toString());

		final OMMapping mapping = generateOMMapping(result);
		final AmaltheaModelBuilder builder = new AmaltheaModelBuilder(mapping);
		this.getMergedModel().setOsModel(builder.getAmaltheaModel().getOsModel());
		this.getMergedModel().setMappingModel(builder.getAmaltheaModel().getMappingModel());
		this.setAmaltheaOutputModel(this.getMergedModel());

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
		// Since our encoding has only one Chromosome
		Chromosome<IntegerGene> chromosome = mappingResult.getChromosome(0);

		// After the algorithm passes, we should have only one solution.
		if (mappingResult.length() != 1) {
			// Error & Exit
			this.con.appendln("Invalid number of Genes");
			return null;
		}

		// Parse the integer Genes. Each gene represents one core allocation.
		int taskIndex = 0;
		
		for (IntegerGene gene: chromosome) {
			final int coreIndex = gene.getAllele();
			// Fetch task and core
			final OMCore core = coreList.get(coreIndex);
			final OMTask task = taskList.get(taskIndex);
			// Create Allocation and store it in the allocation List
			final OMAllocation alloc = new OMAllocation(task, core);
			mapping.addAllocation(alloc);
			++taskIndex;
		}
		
		return mapping;
	}

	/**
	 * Fitness function that adds all violations together
	 * @param gt a given genotype
	 * @return sum of all violations with different penalty for different constraints types
	 */
	public static Long evaluate(final Genotype<IntegerGene> gt) {
		long max = 0;
		final long[] tmpCoreLoad = new long[GABasedLoadBalancing.coreList.size()];
		int taskIndex = 0;
		// Since our encoding has only one Chromosome
		Chromosome<IntegerGene> chromosome = gt.getChromosome(0);

		for (IntegerGene gene: chromosome) {
			final int coreIndex = gene.getAllele();
			tmpCoreLoad[gene.getAllele()] = tmpCoreLoad[gene.getAllele()] + utilMatrix[coreIndex][taskIndex];
			taskIndex++;
		}

		for (int i = 0; i < GABasedLoadBalancing.coreList.size(); i++) {
			if (tmpCoreLoad[i] > max) {
				max = tmpCoreLoad[i];
			}
		}
		return max;
	}

}
