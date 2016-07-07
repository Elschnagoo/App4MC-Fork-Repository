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
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractGABasedMappingAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.algorithms.SimpleListBuilder;
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
	private static List<OMTask> taskList = new ArrayList<OMTask>();
	private static List<OMCore> coreList = new ArrayList<OMCore>();
	private static long[][] utilMatrix;
	private final ConsoleOutputHandler con = new ConsoleOutputHandler("OpenMapping Console");

	private Boolean parseConstraints() {
		// Work in progress
		return true;
	}

	@Override
	public void calculateMapping() {
		final long timeStart, timeStep1, timeStep2, timeStep3, timeStep4;

		this.con.appendln("Performing GA based Load Balancing");
		// Create lists of Cores and Tasks

		// Get list of tasks and calculate their execution time
		timeStart = java.lang.System.nanoTime();
		this.con.appendln("Step 1: Building Task-List...");
		if (null == (GABasedLoadBalancing.taskList = SimpleListBuilder.taskList(getSwModel()))) {
			this.con.append("Error during Task generation, exiting.");
			return;
		}
		timeStep1 = java.lang.System.nanoTime();
		this.con.appendln(" Success! (" + (timeStep1 - timeStart) / 1000000 + "ms)");

		// Get list of cores and calculate their performance
		this.con.appendln("Step 2: Building Core-List...");
		if (null == (GABasedLoadBalancing.coreList = SimpleListBuilder.coreList(getHwModel()))) {
			this.con.appendln("Error during Core generation, exiting.");
			return;
		}
		timeStep2 = java.lang.System.nanoTime();
		this.con.appendln(" Success! (" + (timeStep2 - timeStep1) / 1000000 + "ms)");

		this.con.appendln("Step 3: Determining Constraints and narrowing down the solution space... ");
		// Any Constraints set?
		if (!hasConstraints()) {
			this.con.appendln(" There are no propertyConstraints set, skipping this step.");
			timeStep3 = java.lang.System.nanoTime();
		}
		else {
			if (!parseConstraints()) {
				this.con.appendln("Error during constrain analysis, exiting.");
				return;
			}
			timeStep3 = java.lang.System.nanoTime();
			this.con.appendln(" Success! (" + (timeStep3 - timeStep2) / 1000000 + "ms)");
		}

		// Perform the actual Mapping
		this.con.appendln("Step 4: Creating Mapping...");
		if (!performMappingAlgorithm()) {
			this.con.appendln("Error during performMappingAlgorithm, exiting.");
			return;
		}
		timeStep4 = java.lang.System.nanoTime();
		this.con.appendln("Success after " + (timeStep4 - timeStep3) / 1000000 + "ms.");
		this.con.appendln("Leaving mapping algorithm.");
	}


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
		// The Chromosome contains count(noTasks) integer Values ranging from 0 till count(noCores)-1
		final Factory<Genotype<IntegerGene>> gtf = Genotype.of(IntegerChromosome.of(0, noCores - 1, noTasks));

		// It appears the typecast is required on some Eclipse versions, which may throw an "java.lang.Error: Unresolved
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
		setOsModel(builder.getAmaltheaModel().getOsModel());
		setMappingModel(builder.getAmaltheaModel().getMappingModel());

		final OMVisualizer vis = new OMVisualizer(mapping);
		this.con.appendln("\n" + vis.getASCIIChart());

		return true;
	}

	private OMMapping generateOMMapping(final Genotype<IntegerGene> mappingResult) {
		final OMMapping mapping = new OMMapping();
		final Iterator<Chromosome<IntegerGene>> itChromosomes = mappingResult.iterator();
		// After the algorithm passes, we should have only one solution.
		if (mappingResult.length() != 1) {
			// Error & Exit
			this.con.appendln("Invalid number of Genes");
			return null;
		}

		final Chromosome<IntegerGene> intGenes = itChromosomes.next();
		final Iterator<IntegerGene> intGene = intGenes.iterator();

		// Parse the integer Genes. Each gene represents one core allocation.
		int taskIndex = 0;
		while (intGene.hasNext()) {
			final IntegerGene allele = intGene.next();
			final int coreIndex = allele.getAllele();
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

	public static Long evaluate(final Genotype<IntegerGene> gt) {
		long max = 0;
		final long[] tmpCoreLoad = new long[GABasedLoadBalancing.coreList.size()];
		final Iterator<Chromosome<IntegerGene>> itChromosomes = gt.iterator();
		int taskIndex = 0;
		while (itChromosomes.hasNext()) {
			final Chromosome<IntegerGene> chromosome = itChromosomes.next();
			final Iterator<IntegerGene> itGenes = chromosome.iterator();
			while (itGenes.hasNext()) {
				final IntegerGene gene = itGenes.next();
				final int coreIndex = gene.getAllele();
				tmpCoreLoad[gene.getAllele()] = tmpCoreLoad[gene.getAllele()] + utilMatrix[coreIndex][taskIndex];
				taskIndex++;
			}
		}
		for (int i = 0; i < GABasedLoadBalancing.coreList.size(); i++) {
			if (tmpCoreLoad[i] > max) {
				max = tmpCoreLoad[i];
			}
		}
		return max;
	}

}
