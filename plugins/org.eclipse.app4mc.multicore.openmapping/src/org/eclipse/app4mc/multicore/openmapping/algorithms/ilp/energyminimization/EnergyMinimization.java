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
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.energyminimization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.DoubleObject;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.app4mc.amalthea.model.util.ConstraintsUtil;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractILPBasedMappingAlgorithm;
import org.eclipse.app4mc.multicore.sharelibs.ConsoleOutputHandler;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.jgrapht.DirectedGraph;
import org.jgrapht.experimental.dag.DirectedAcyclicGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.TopologicalOrderIterator;
import org.ojalgo.OjAlgoUtils;
import org.ojalgo.optimisation.Expression;
import org.ojalgo.optimisation.ExpressionsBasedModel;
import org.ojalgo.optimisation.Optimisation;
import org.ojalgo.optimisation.Variable;
import org.ojalgo.type.context.NumberContext;

public class EnergyMinimization extends AbstractILPBasedMappingAlgorithm {
	private long tCon; // Overall deadline of the software
	private long psPerInstruction;
	// private double switchingCapacity = 0;

	private final AmaltheaFactory osInstance = AmaltheaFactory.eINSTANCE;
	private final ConsoleOutputHandler con = new ConsoleOutputHandler("OpenMapping Console");
	private final MappingBuilder mappingHandle = new MappingBuilder();
	private final ExpressionsBasedModel ebm = new ExpressionsBasedModel();
	private final Map<ProcessingUnit, AdvancedCore> mCoreMap = new HashMap<ProcessingUnit, AdvancedCore>();
	private final Map<Runnable, AdvancedRunnable> mRunnableMap = new HashMap<Runnable, AdvancedRunnable>();
	private final List<AdvancedRunnable> lUnscheduledRunnables = new ArrayList<AdvancedRunnable>();
	private final List<VoltageLevel> lVoltageLevels = new LinkedList<VoltageLevel>();

	public EnergyMinimization() {
		// Nothing to do here
	}

	private final DirectedGraph<AdvancedRunnable, DefaultEdge> dag = new DirectedAcyclicGraph<AdvancedRunnable, DefaultEdge>(
			DefaultEdge.class);

	@Override
	public void calculateMapping() {
		final long timeStart, timeStep1, timeStep2, timeStep3, timeStep4, timeStep5;
		final String sVersion = "Using: " + OjAlgoUtils.getTitle() + " " + OjAlgoUtils.getVersion() + " ("
				+ OjAlgoUtils.getDate() + ")";


		UniversalHandler.getInstance().logCon("Entering ILP mapping algorithm");
		UniversalHandler.getInstance().logCon(sVersion);
		this.con.appendln("Performing ILP Mapping");
		this.con.appendln(sVersion);

		initModels();

		// Prepare Model and handlers for model interactions
		final OperatingSystem operatingSystem = this.osInstance.createOperatingSystem();
		operatingSystem.setName("OS");
		getMergedModel().setOsModel(this.osInstance.createOSModel());
		getMergedModel().getOsModel().getOperatingSystems().add(operatingSystem);


		// Fetch the max. amount of time for a single iteration
		timeStart = Util.nanoTime();
		this.con.appendln("Step 1: Determining the lowest iteration time... ");
		if (!prepareMaxExecutionTime()) {
			this.con.appendln("Error during Activation analysis, exiting.");
			return;
		}
		timeStep1 = Util.nanoTime();
		this.con.appendln("Success! (" + (timeStep1 - timeStart) / 1000000 + "ms)\n");

		// Get list of cores and calculate their performance
		this.con.appendln("Step 2: Determining Cores and calculating performance... ");
		if (!createAdvancedCores()) {
			this.con.appendln("Error during ExtendedCore generation, exiting.");
			return;
		}

		// If just one core is available theres no need to run the algorithm
		if (this.mCoreMap.size() == 1) {
			mapToFirstCore();
			return;
		}

		timeStep2 = Util.nanoTime();
		this.con.appendln("Success! (" + (timeStep2 - timeStep1) / 1000000 + "ms)\n");

		// Get list of runnables and calculate their execution time
		this.con.appendln("Step 3: Determining Runnables and calculating their resp. execution cycles... ");
		if (!createAdvancedRunnables()) {
			this.con.append("Error during AdvRunnables generation, exiting.");
			return;
		}
		timeStep3 = Util.nanoTime();
		this.con.appendln("Success! (" + (timeStep3 - timeStep2) / 1000000 + "ms)\n");

		// Perform scheduling
		this.con.appendln("Step 4: Creating task ordering and assignment... ");
		if (!scheduleAndAllocateTasks()) {
			this.con.append("Error during task ordering and assignment, exiting.");
			return;
		}
		timeStep4 = Util.nanoTime();
		this.con.appendln("Success! (" + (timeStep4 - timeStep3) / 1000000 + "ms)\n");

		// Voltage selection
		this.con.appendln("Step 5: Performing ILP based Voltage Selection... ");
		if (!performVoltageSelection()) {
			this.con.append("Error during voltage selection, exiting.");
			return;
		}
		timeStep5 = Util.nanoTime();
		this.con.appendln("Success! (" + (timeStep5 - timeStep4) / 1000000 + "ms)\n");

	}

	/**
	 * Fetches the highest recurrence from all activation elements, i.e. the
	 * smallest offset of an Activation element.
	 *
	 * @return true on success, false otherwise
	 */
	private boolean prepareMaxExecutionTime() {
		if (getMergedModel().getSwModel().getActivations().size() == 0) {
			UniversalHandler.getInstance()
					.log("Error: Invalid SWModel.\nThere are no activation elements present in this model.", null);
			return false;
		}

		long minOffset = Long.MAX_VALUE;
		final Iterator<Activation> itAct = getMergedModel().getSwModel().getActivations().iterator();
		while (itAct.hasNext()) {
			final Activation a = itAct.next();
			if (a instanceof PeriodicActivation) {
				// Periodic activation element
				final PeriodicActivation entry = (PeriodicActivation) a;

				if (entry.getOffset() != null) {
					final long offset = Util.convertTime2ps(entry.getOffset());
					if (offset < minOffset) {
						minOffset = offset;
					}
				}
				else {
					UniversalHandler.getInstance().log("Invalid Activation element.\nOffset NULL!\nSkipping...", null);
				}
			}
			else {
				UniversalHandler.getInstance().log("Unhandled Activation element.\nSkipping...", null);
			}
		}

		if (minOffset == Long.MAX_VALUE) {
			return false;
		}

		this.tCon = minOffset;
		this.con.appendln(" Lowest iteration time:  " + this.tCon);
		return true;
	}

	/**
	 * Prepares the list of Cores from the Hardware Model an calculates the data
	 * for this algorithm.
	 *
	 * @return true on success, false otherwise
	 */
	private Boolean createAdvancedCores() {
		
// TODO implement

	//		final HwSystem system;
	//		if ((system = getMergedModel().getHwModel().getSystem()) == null) {
	//			UniversalHandler.getInstance().log("Invalid HWModel.\nThere is no System element in this model.", null);
	//			return false;
	//		}
	//
	//		// Get list of ECUs, Microcontrollers and finally Cores
	//		// Check if the system has ECUs
	//		if (system.getEcus().size() <= 0) {
	//			UniversalHandler.getInstance().log("Invalid HWModel.\nThere are no ECUs in the System.", null);
	//			return false;
	//		}
	//
	//		final Iterator<ECU> itEcus = system.getEcus().iterator();
	//		while (itEcus.hasNext()) {
	//			final ECU ecu = itEcus.next();
	//			UniversalHandler.getInstance().logCon("Parsing ECU '" + ecu.getName() + "'");
	//
	//			if (ecu.getMicrocontrollers().size() <= 0) {
	//				UniversalHandler.getInstance().log("Invalid HWModel.\nThere are no Microcontrollers in the System.",
	//						null);
	//				return false;
	//			}
	//			final Iterator<Microcontroller> mcs = ecu.getMicrocontrollers().iterator();
	//			while (mcs.hasNext()) {
	//				final Microcontroller mc = mcs.next();
	//				UniversalHandler.getInstance().logCon(" Parsing Microcontroller '" + mc.getName() + "'");
	//				final Iterator<ProcessingUnit> cores = mc.getCores().iterator();
	//				if (cores == null) {
	//					UniversalHandler.getInstance().logCon(" Warning: Microcontroller contains no Cores, skipping...");
	//				}
	//				else {
	//					ProcessingUnitDefinition ct = null;
	//					while (cores.hasNext()) {
	//						final ProcessingUnit core = cores.next();
	//						final String sn = core.getName() + "_SCHED";
	//
	//
	//						UniversalHandler.getInstance().logCon("  Adding Core '" + core.getName() + "'");
	//
	//						// Remember/Check the ProcessingUnitDefinition
	//						if (ct == null) {
	//							ct = core.getDefinition();
	//							determineVoltageLevels(ct);
	//						}
	//						else {
	//							// Check if there are equal ProcessingUnitDefinitions
	//							if (ct != core.getDefinition()) {
	//								this.con.appendln(
	//										"Heterogeneous ProcessingUnitDefinitions detected. This algorithm only supports homogeneous cores.");
	//								return false;
	//							}
	//						}
	//
	//						final AdvancedCore ac = new AdvancedCore(core, true);
	//						this.mCoreMap.put(core, ac);
	//
	//						UniversalHandler.getInstance().logCon("  Creating Scheduler: " + sn);
	//						final TaskScheduler s = this.osInstance.createTaskScheduler();
	//						s.setName(sn);
	//						ac.setScheduler(s);
	//						getMergedModel().getOsModel().getOperatingSystems().get(0).getTaskSchedulers().add(s);
	//						this.mappingHandle.addCoreToSchedulder(ac, s);
	//
	//						this.con.appendln(" Core " + ac.getCore().getName() + ": " + ac.getPsPerInstruction());
	//
	//						if (this.psPerInstruction == 0) {
	//							this.psPerInstruction = ac.getPsPerInstruction();
	//						}
	//						else {
	//							if (this.psPerInstruction != ac.getPsPerInstruction()) {
	//								this.con.appendln(
	//										"Heterogeneous ProcessingUnitDefinitions detected. This algorithm only supports homogeneous cores.");
	//								return false;
	//							}
	//						}
	//					}
	//				}
	//			}
	//		}
	//
	//		if (this.mCoreMap.size() <= 0) {
	//			UniversalHandler.getInstance()
	//					.logCon(" Error: It seems there have been no (correct?) core definitions this model.");
	//			return false;
	//		}

		return true;
	}

	private boolean determineVoltageLevels(final ProcessingUnitDefinition ct) {
		if (ct.getCustomProperties().size() <= 0) {
			this.con.appendln("Error: ProcessingUnitDefinition contains no voltage levels.");
			return false;
		}
		// Local map for lookups
		final Map<String, VoltageLevel> mVL = new HashMap<String, VoltageLevel>();
		final Iterator<Entry<String, Value>> itAttributes = ct.getCustomProperties().iterator();
		while (itAttributes.hasNext()) {
			final Entry<String, Value> at = itAttributes.next();
			// Check if attribute is a possible voltage level
			if (at.getKey().startsWith("EnEf-") && at.getValue() instanceof DoubleObject) {
				final DoubleObject d = (DoubleObject) at.getValue();
				final byte type; // 0: Voltage, 1: Scale
				final String name;
				if (at.getKey().startsWith("EnEf-Volt_")) {
					name = at.getKey().substring(10);
					type = 0;
				}
				else if (at.getKey().startsWith("EnEf-Scale_")) {
					name = at.getKey().substring(11);
					type = 1;
				}
				else {
					UniversalHandler.getInstance().logCon("Warning: Unsupported attribute with EnEf prefix!");
					continue;
				}

				// Check if voltage level is already known, create new if not
				final VoltageLevel vl;
				if (mVL.containsKey(name)) {
					vl = mVL.get(name);
				}
				else {
					vl = new VoltageLevel(name);
					mVL.put(name, vl);
				}

				switch (type) {
					case 0:
						vl.setVolt(d.getValue());
						break;
					case 1:
						vl.setScale(d.getValue());
						break;
					default:
						break;
				}
			}
		}

		final Iterator<VoltageLevel> itVl = mVL.values().iterator();
		while (itVl.hasNext()) {
			final VoltageLevel vl = itVl.next();
			if (vl.getScale() > 0 && vl.getVolt() > 0) {
				this.lVoltageLevels.add(vl);
			}
			else {
				UniversalHandler.getInstance()
						.logCon("Warning: VoltageLevel '" + vl.getName() + "' is not correctly specified!");
			}
		}

		if (this.lVoltageLevels.size() > 0) {
			Collections.sort(this.lVoltageLevels);
			return true;
		}

		return false;
	}

	/**
	 * Prepares the list of Runnables from the Software Model an calculates the
	 * data for this algorithm.
	 *
	 * @return true on success, false otherwise
	 */
	private boolean createAdvancedRunnables() {
		// Check for Runnables in SWModel
		if (getMergedModel().getSwModel().getRunnables().size() <= 0) {
			UniversalHandler.getInstance().log("Error: Invalid SWModel.\nThere are no runnables in this model.", null);
			return false;
		}

		// Fetch Runnables, create AdvancedRunnables with additional information
		UniversalHandler.getInstance()
				.logCon("Found " + getMergedModel().getSwModel().getRunnables().size() + " Runnable(s).");
		final Iterator<Runnable> itRunnables = getMergedModel().getSwModel().getRunnables().iterator();
		while (itRunnables.hasNext()) {
			final Runnable r = itRunnables.next();
			final AdvancedRunnable ar = new AdvancedRunnable(r);
			ar.setExecTime(this.psPerInstruction);
			this.lUnscheduledRunnables.add(ar);
			this.mRunnableMap.put(r, ar);
			this.dag.addVertex(ar);
			this.con.appendln(" Runnable " + ar.getRunnableRef().getName() + ": " + ar.getNumberOfInstructions()
					+ " Ins / " + ar.getExecTime() + " ps");
		}

		if (this.mRunnableMap.size() <= 0) {
			UniversalHandler.getInstance()
					.logCon(" Error: It seems there have been no (correct?) Runnable definitions this model.");
			return false;
		}
		return true;
	}

	/**
	 * First step of the actual mapping algorithm. Creates a scheduling of the
	 * runnables, i.e. the ordering and the allocation to the resp. cores.
	 */
	private boolean scheduleAndAllocateTasks() {
		// Check if its a single or multicoreplatform and use appropriate
		// scheduling
		if (this.mCoreMap.size() == 1) {
			return EDF();
		}
		return PrioScheduling();
	}

	/**
	 * EDF-Scheduling, used on single-core systems
	 *
	 * @return
	 */
	private boolean EDF() {
		this.con.appendln("This algorithm only supports Multi-Core systems.");
		return false;
	}

	/**
	 * Priority-Based scheduling, used on multi-core systems.
	 *
	 * @return true on success, false otherwise
	 */
	private boolean PrioScheduling() {
		/*
		 * ************************************************************* Create
		 * and sort a task graph to allow an recursive processing
		 */

		// Step1: Process RunnableSequencingConstraints and create DAG
		if (getMergedModel().getConstraintsModel().getRunnableSequencingConstraints().size() <= 0) {
			UniversalHandler.getInstance().log(
					"Invalid SWModel.\nThere are no RunnableSequencingConstraints in this model.\nLeaving Algorithm...",
					null);
			return false;
		}
		UniversalHandler.getInstance().logCon("Runnable dependencies (Source->Target)");
		final Iterator<RunnableSequencingConstraint> itRsc = getMergedModel().getConstraintsModel()
				.getRunnableSequencingConstraints().iterator();
		while (itRsc.hasNext()) {
			final RunnableSequencingConstraint rsc = itRsc.next();
			proccessRSC(rsc);
		}

		// Step 2: Get least finish time for each vertex
		final Iterator<AdvancedRunnable> nodes = this.dag.vertexSet().iterator();
		while (nodes.hasNext()) {
			final AdvancedRunnable node = nodes.next();
			node.setLft(calculateLft(node));
		}

		// Step 3: Actual Scheduling, iterative process after each allocation
		// has been specified!
		while (this.lUnscheduledRunnables.size() > 0) {
			// Update the ready-time values for all runnables
			updateReadyTimes();
			// Sort the list and fetch element with highest priority and remove
			// it from the list
			Collections.sort(this.lUnscheduledRunnables);
			final AdvancedRunnable ar = this.lUnscheduledRunnables.get(0);

			// TODO DEBUG
			// Print list with values
			// java.lang.System.out.println("--- NEW IT ---");
			// final Iterator<AdvancedRunnable> itDbg =
			// this.lUnscheduledRunnables.iterator();
			// while (itDbg.hasNext()) {
			// final AdvancedRunnable dbgAr = itDbg.next();
			// java.lang.System.out.println("P: " + dbgAr.getPriority() + " " +
			// dbgAr.getRunnableRef().getName() + "");
			// }

			// Find best-fit target core/processor
			final Iterator<Entry<ProcessingUnit, AdvancedCore>> itCores = this.mCoreMap.entrySet().iterator();

			// Minimal available time of all cores
			// Storages for the best fit processors in each stage
			AdvancedCore targetStage1 = null;
			AdvancedCore targetStage2 = null;
			AdvancedCore targetStage3 = null;
			while (itCores.hasNext()) {
				// Section optimizes, reduces iterations by ~factor 4
				final AdvancedCore ac = itCores.next().getValue();

				if (ac.getAvailTime() == ar.getReadyTime()) {
					targetStage1 = ac;
					break;
				}

				if (ac.getAvailTime() < ar.getReadyTime() && ac.getAvailTime() >= AdvancedCore.getMaxAvailTime()) {
					// Remember best value for Stage 2, do not assign anything
					// final yet
					targetStage2 = ac;
				}

				if (ac.getAvailTime() <= AdvancedCore.getMinAvailTime()) {
					// remember core with lowest value
					targetStage3 = ac;
				}

			}

			// Select best fit core
			final AdvancedCore bestFitCore;
			final long startTime;
			if (targetStage1 != null) {
				bestFitCore = targetStage1;
				startTime = ar.getReadyTime();
			}
			else if (targetStage2 != null) {
				bestFitCore = targetStage2;
				startTime = ar.getReadyTime();
			}
			else if (targetStage3 != null) {
				bestFitCore = targetStage3;
				startTime = bestFitCore.getAvailTime();
			}
			else {
				// Error
				this.con.appendln("ERR!!!");
				return false;
			}

			// Update available time, add runnable to cores list
			bestFitCore.setAvailTime(startTime + ar.getExecTime());
			bestFitCore.addRunnable(ar);
			ar.setStartTime(startTime);
			// TODO DEBUG
			// this.con.appendln(ar.getRunnableRef().getName() + " -> " +
			// bestFitCore.getCore().getName());
			this.lUnscheduledRunnables.remove(ar);
			// Update the min available time over all cores
			updateMinAvailTime();
		}

		createInterCoreDependencies();

		// final Iterator<AdvancedRunnable> itAr =
		// this.mRunnableMap.values().iterator();
		// while(itAr.hasNext()) {
		// final AdvancedRunnable ar = itAr.next();
		// this.con.appendln("S:"+ar.getStartTime() + " ET:" + ar.getExecTime()
		// + " -> " + ar.getRunnableRef().getName() + "@?");
		// }

		return true;
	}

	private void createInterCoreDependencies() {
		UniversalHandler.getInstance().logCon("Creating Inter-Core dependencies...");
		final Iterator<AdvancedCore> coreList = this.mCoreMap.values().iterator();
		while (coreList.hasNext()) {
			final AdvancedCore c = coreList.next();
			AdvancedRunnable prev = null;
			UniversalHandler.getInstance().logCon("Processing: " + c.getCore().getName());
			final Iterator<AdvancedRunnable> runnableList = c.getRunnables().iterator();
			while (runnableList.hasNext()) {
				final AdvancedRunnable ar = runnableList.next();
				UniversalHandler.getInstance().logCon(" Processing: " + ar.getRunnableRef().getName());
				// Start at the 2nd iteration
				if (prev != null) {
					// Add another edge if it doesnt exist yet
					if (!this.dag.containsEdge(prev, ar)) {
						this.dag.addEdge(prev, ar);
					}
				}
				prev = ar;
			}
		}
	}

	/**
	 * Processes a RunnableSequencingConstraint a DAG of the Runnables
	 *
	 * @param rsc
	 *            A single RunnableSequencingConstraint which may or may not
	 *            represent an Edge between two Runnables in a DAG
	 */
	private void proccessRSC(final RunnableSequencingConstraint rsc) {
		// Check if there are any runnable groups in the runnable sequencing
		// constraint
		// In our case this algorithm will only support the models based on the
		// partitioning plugin hence there must be 2 entries (origin/target)
		if (rsc.getRunnableGroups().size() != 2) {
			UniversalHandler.getInstance().log(
					"Invalid RunnableSequencingConstraint.\nRunnableSequencingConstraints must contain 2 RunnableGroups.\nSkipping...",
					null);
			return;
		}

		final RunnableEntityGroup originGroup = rsc.getRunnableGroups().get(0);
		final RunnableEntityGroup targetGroup = rsc.getRunnableGroups().get(1);

		// Is there one ProcessRunnableGroupEntry per group?
		if (originGroup.getRunnables().size() != 1 || targetGroup.getRunnables().size() != 1) {
			UniversalHandler.getInstance().log(
					"Invalid ProcessRunnableGroup.\nProcessRunnableGroup must contain one ProcessRunnableGroupEntry.\nSkipping...",
					null);
			return;
		}

		final Runnable originRunnable = originGroup.getRunnables().get(0);
		final Runnable targetRunnable = targetGroup.getRunnables().get(0);

		// Now, check if both Entries have the Runnable reference set
		if (originRunnable == null || targetRunnable == null) {
			UniversalHandler.getInstance().log(
					"Invalid ProcessRunnableGroupEntry.\nProcessRunnableGroupEntry must reference one Runnable.\nSkipping...",
					null);
			return;
		}

		// Check if the Runnable is pointing itself (error criteria!)
		if (originRunnable == targetRunnable) {
			UniversalHandler.getInstance().logCon("Same Runnable - No Edge!");
			return;
		}

		// lookup runnables and check if they have been added to the graph
		final AdvancedRunnable origin = this.mRunnableMap.get(originRunnable);
		final AdvancedRunnable target = this.mRunnableMap.get(targetRunnable);

		// Add Edge (if not already present --> Error otherwise!)
		if (this.dag.getEdge(origin, target) != null) {
			UniversalHandler.getInstance().logCon("ERR: Edge already Present: " + origin.getRunnableRef().getName()
					+ " -> " + target.getRunnableRef().getName());
			return;
		}
		UniversalHandler.getInstance()
				.logCon(origin.getRunnableRef().getName() + " -> " + target.getRunnableRef().getName());
		this.dag.addEdge(origin, target);
	}

	/**
	 * Recursive algorithm used to determine the least finish time (lft) of a
	 * Runnable/Node
	 *
	 * @param node
	 *            A runnable the lft will be calculated for
	 * @return Least finish time of the Runnable
	 */
	private long calculateLft(final AdvancedRunnable node) {
		// has the node already been processed?
		if (node.getLft() != -1) {
			return node.getLft();
		}

		Runnable nodeRunnable = node.getRunnableRef();
		Time nodeDeadline = ConstraintsUtil.getDeadline(nodeRunnable);

		// Has the node no successors?
		if (this.dag.outDegreeOf(node) == 0) {
			// A leaf nodes lft is its deadlne OR tCon
			if (nodeDeadline != null) {
				final long deadline = AmaltheaServices.convertToPicoSeconds(nodeDeadline).longValue();
				if (deadline < this.tCon) {
					return deadline;
				}
			}
			return this.tCon;
		}

		// Else: Fetch successors, and compute them first!
		long least = Long.MAX_VALUE;
		final Iterator<DefaultEdge> itEr = this.dag.outgoingEdgesOf(node).iterator();
		while (itEr.hasNext()) {
			final DefaultEdge e = itEr.next();
			final AdvancedRunnable succesor = this.dag.getEdgeTarget(e);
			final long lft_s = calculateLft(succesor) - succesor.getExecTime();
			if (lft_s < least) {
				least = lft_s;
			}
		}

		// Now, get the min(deadline, least)
		if (nodeDeadline != null) {
			final long deadline = AmaltheaServices.convertToPicoSeconds(nodeDeadline).longValue();
			if (deadline < least) {
				return deadline;
			}
		}
		return least;
	}

	/**
	 * Updates the times on all Runnables after a Runnable has been allocated
	 * and removed from the Unscheduled-List
	 */
	private void updateReadyTimes() {
		final Iterator<AdvancedRunnable> itSortedAdvRunnables = new TopologicalOrderIterator<AdvancedRunnable, DefaultEdge>(
				this.dag);
		while (itSortedAdvRunnables.hasNext()) {
			final AdvancedRunnable ar = itSortedAdvRunnables.next();
			// Has the Vertex any Predecessors?
			if (this.dag.inDegreeOf(ar) == 0) {
				// No predecessors
				ar.setReadyTime(0);
			}
			else {
				// get max r_u + T_u from predecessors
				final Iterator<DefaultEdge> itIncoming = this.dag.incomingEdgesOf(ar).iterator();
				// Latest latestFinishTime of all predecessors
				long newLatestFinishTime = -1;
				while (itIncoming.hasNext()) {
					final DefaultEdge edge = itIncoming.next();
					final AdvancedRunnable arPredecessor = this.dag.getEdgeSource(edge);

					// Has the predecessor been scheduled yet?
					if (newLatestFinishTime < arPredecessor.getEarliestStartTime() + arPredecessor.getExecTime()) {
						newLatestFinishTime = arPredecessor.getEarliestStartTime() + arPredecessor.getExecTime();
					}
				}
				ar.setReadyTime(newLatestFinishTime);
			}
		}
	}

	private void updateMinAvailTime() {
		final Iterator<Entry<ProcessingUnit, AdvancedCore>> itCores = this.mCoreMap.entrySet().iterator();
		long localMin = Long.MAX_VALUE;
		while (itCores.hasNext()) {
			final AdvancedCore ac = itCores.next().getValue();
			if (localMin > ac.getAvailTime()) {
				localMin = ac.getAvailTime();
			}
		}
		AdvancedCore.setMinAvailTime(localMin);
	}

	@SuppressWarnings("deprecation")
	private boolean performVoltageSelection() {
		// Add an output node to the graph, connecting the exit nodes of each
		// core
		final AdvancedRunnable in = new AdvancedRunnable(null);
		final AdvancedRunnable out = new AdvancedRunnable(null);
		this.dag.addVertex(in);
		this.dag.addVertex(out);

		final Iterator<Entry<ProcessingUnit, AdvancedCore>> itCores = this.mCoreMap.entrySet().iterator();
		while (itCores.hasNext()) {
			final AdvancedCore ac = itCores.next().getValue();
			// Fetch first and last runnable on the resp. core and add an edge
			// to the first/last-node
			final AdvancedRunnable first = ac.getRunnables().get(0);
			final AdvancedRunnable last = ac.getRunnables().get(ac.getRunnables().size() - 1);
			this.dag.addEdge(in, first);
			this.dag.addEdge(last, out);
		}

		/**
		 * Create the ILP model
		 */
		// highest voltage and scale are required several times during this
		// process
		// Store the list before it gets modified
		this.mappingHandle.setVoltageLevels(this.lVoltageLevels);
		final double scaleHigh = this.lVoltageLevels.get(0).getScale();
		final double voltHigh = this.lVoltageLevels.get(0).getVolt();
		this.lVoltageLevels.remove(0);

		// Create the variables D_u and N_ui for each task u on voltage i
		// (Optimized: While we are iterating over all elements, ensure
		// following:)
		// du >= Tu, after substitution Sum Nui(...) >= 0
		final Iterator<AdvancedRunnable> itRun = this.dag.vertexSet().iterator();
		while (itRun.hasNext()) {
			final AdvancedRunnable ar = itRun.next();
			// Variable D_u (Start time of Task u)
			final String idD = "D_" + ar.getIndex();
			final Variable D = Variable.make(idD).lower(0).integer(true);
			this.ebm.addVariable(D);
			ar.setVarDu(D);
			// Constant N_u (Execution Cycles of Task u at highest voltage)
			final String idNu = "N_" + ar.getIndex();
			final Variable Nu = Variable.make(idNu).level(ar.getNumberOfInstructions());
			this.ebm.addVariable(Nu);
			ar.setVarNu(Nu);

			final Iterator<VoltageLevel> itVl = this.lVoltageLevels.iterator();
			final Expression eDelay = this.ebm.addExpression("posDelay-N_" + ar.getIndex());
			final Expression eConN = this.ebm.addExpression("ConN_" + ar.getIndex());
			while (itVl.hasNext()) {
				final VoltageLevel vl = itVl.next();
				final String idNui = "N_" + ar.getIndex() + "_" + this.lVoltageLevels.indexOf(vl);
				final Variable Nui = Variable.make(idNui).lower(0).integer(true);
				this.ebm.addVariable(Nui);
				ar.addVarNui(vl, Nui);

				// Ensure du >= Tu, after substitution Sum N_ui(...) >= 0
				final long ct = (long) (this.psPerInstruction / vl.getScale() - this.psPerInstruction / scaleHigh);
				eDelay.setLinearFactor(Nui, ct);

				// Ensure Sum N_ui <= N_u
				eConN.setLinearFactor(Nui, 1);
			}
			eDelay.lower(0);

			eConN.setLinearFactor(Nu, -1);
			eConN.upper(0);
		}

		// Add constraint for latest finish time
		final Expression eRuntime = this.ebm.addExpression("Runtime");
		eRuntime.setLinearFactor(out.getVarDu(), 1);
		eRuntime.setLinearFactor(in.getVarDu(), -1);
		eRuntime.upper(this.tCon);

		// TODO DEBUG
		// this.con.appendln("Runtime: " + out.getVarDu().getName() + " * 1 + "
		// + in.getVarDu().getName() + " * -1 <= "
		// + this.tCon);

		// Define constraints per edge
		final Iterator<DefaultEdge> itEdges = this.dag.edgeSet().iterator();
		while (itEdges.hasNext()) {
			final DefaultEdge edge = itEdges.next();
			final AdvancedRunnable source = this.dag.getEdgeSource(edge);
			final AdvancedRunnable target = this.dag.getEdgeTarget(edge);
			final Expression eSequencing = this.ebm
					.addExpression("Seq_" + source.getIndex() + "->" + target.getIndex());
			eSequencing.setLinearFactor(target.getVarDu(), 1);
			eSequencing.setLinearFactor(source.getVarDu(), -1);

			// this.con.append("Seq_" + source.getIndex() + "->" +
			// target.getIndex());
			// this.con.append(" + " + target.getVarDu().getName() + " * 1");
			// this.con.append(" + " + source.getVarDu().getName() + " * -1");
			// Sum up the cycles at each available cycle time
			final Iterator<VoltageLevel> itVl = this.lVoltageLevels.iterator();
			while (itVl.hasNext()) {
				final VoltageLevel vl = itVl.next();
				final Variable nui = source.getVarNui(vl);
				final long ct = (long) (-1
						* (this.psPerInstruction / vl.getScale() - this.psPerInstruction / scaleHigh));
				eSequencing.setLinearFactor(nui, ct);
				// this.con.append(" - " + nui.getName() + " * " + ct + "(" +
				// this.psPerInstruction + "/" + vl.getScale()
				// + " - " + this.psPerInstruction + " / " + scaleHigh + ")");
			}
			eSequencing.lower(source.getExecTime());
			// this.con.appendln(" >= " + source.getExecTime());
		}

		// TODO: Handle Deadline

		final Iterator<AdvancedRunnable> itRunObj = this.mRunnableMap.values().iterator();
		while (itRunObj.hasNext()) {
			final AdvancedRunnable ar = itRunObj.next();
			final Expression obj = this.ebm.addExpression("Obj_" + ar.getIndex());
			// TODO: Consider a custom weight of each task (C_u)
			obj.weight(1);

			// First run of Voltages...
			final Iterator<VoltageLevel> itVl1 = this.lVoltageLevels.iterator();
			while (itVl1.hasNext()) {
				final VoltageLevel vl = itVl1.next();
				obj.setLinearFactor(ar.getVarNui(vl), vl.getVolt() * vl.getVolt() - voltHigh * voltHigh);
			}

			obj.setLinearFactor(ar.getVarNu(), voltHigh * voltHigh);
		}

		// Print some of the predefined settings
		this.con.appendln("ILP solver settings");
		this.con.appendln(" Max gap: " + this.ebm.options.mip_gap);
		this.con.appendln(" Max iterations (abort): " + this.ebm.options.iterations_abort);
		this.con.appendln(" Max iterations (suffice): " + this.ebm.options.iterations_suffice);
		this.con.appendln(" Max time (abort): " + this.ebm.options.time_abort);
		this.con.appendln(" Max time (suffice): " + this.ebm.options.time_suffice);
		this.con.appendln("Working...");
		this.ebm.options.validate = true;

		// Set the precision and scale
		// TODO It might be nice to change this options in the preferences page.
		// Wrong settings might (more likely: will) break the solver though...
		// this.ebm.options.problem = NumberContext.getGeneral(128, 128);
		// this.ebm.options.debug(LinearSolver.class);
		boolean success = false;
		// Perform the optimization and output results
		this.con.appendln("MathContext (Precision/Scale) set to ...");
		for (int prec = 8; prec < 256 && !success; prec += 8) {
			for (int scale = 8; scale < 256 && !success; scale += 8) {
				if (scale % 128 == 0) {
					this.con.appendln("");
				}
				this.ebm.options.problem = NumberContext.getGeneral(prec, scale);
				final Optimisation.Result res = this.ebm.minimise();
				this.con.append(" " + prec + "/" + scale + "...");

				if (res.getState().isFailure()) {
					// this.con.appendln("Objective Minimization failed!
					// Resetting MathContext and Retrying.");
				}
				else {
					success = true;
					this.con.appendln(" success!");
					this.con.appendln("Objective Minimization successful!");
					this.con.appendln(" Objective value: " + res.getValue());
					this.con.appendln(" Solution state: " + res.getState().toString() + "\n");
				}
			}
		}
		if (!success) {
			return false;
		}

		final Iterator<AdvancedCore> itCores2 = this.mCoreMap.values().iterator();
		while (itCores2.hasNext()) {
			final AdvancedCore ac = itCores2.next();
			final Iterator<AdvancedRunnable> itCoreAr = ac.getRunnables().iterator();
			while (itCoreAr.hasNext()) {
				final AdvancedRunnable ar = itCoreAr.next();
				this.mappingHandle.addRunnableToCore(ac, ar);
			}
		}

		this.mappingHandle.generateMapping();
		getMergedModel().setMappingModel(this.mappingHandle.getMappingModel());

		// Print Allocation table to output console and focus view
		this.con.appendln("Allocations:");
		this.con.appendln(this.mappingHandle.getAllocation());
		this.con.appendln("Core Utilization:");
		this.con.appendln(this.mappingHandle.getBarChart());
		// this.con.appendln("Program Start at: \t" + in.getVarDu().getValue());
		// this.con.appendln("Program Ending at: \t" +
		// out.getVarDu().getValue());
		final String exTime = String.format("%-,18.5f ms", out.getVarDu().getValue().doubleValue() / Math.pow(10, 9));
		this.con.appendln("Total Execution time:\t" + exTime);
		this.con.appendln(this.mappingHandle.getSlowDownText());
		this.con.focus();

		return true;
	}

	private static class Util {
		static long convertTime2ps(final Time t) {
			long mul = 1;
			final TimeUnit tu = t.getUnit();
			switch (tu.getLiteral()) {
				case "s": // 1.0
					mul = mul * 1000;
					//$FALL-THROUGH$
				case "ms":// 1.0E-3
					mul = mul * 1000;
					//$FALL-THROUGH$
				case "us":// 1.0E-6
					mul = mul * 1000;
					//$FALL-THROUGH$
				case "ns":// 1.0E-9
					mul = mul * 1000;
					//$FALL-THROUGH$
				case "ps":// 1.0E-12
					//$FALL-THROUGH$
				default:
					break;
			}
			return mul * t.getValue().longValue();
		}

		static long nanoTime() {
			return java.lang.System.nanoTime();
		}
	}
}
