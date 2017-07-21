/*******************************************************************************
 * Copyright (c) 2016 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.InstructionsConstant;
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableInstructions;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * Provides several calculations / generally needed methods
 */
public class Helper {


	/**
	 * Calculation of a runnable's instructions (arithmetic average in case of
	 * deviations)
	 *
	 * @param r
	 *            Runnable
	 * @return long mean instructions
	 */
	public long getInstructions(final Runnable r) {
		long rt = 0;
		for (final RunnableItem ra : r.getRunnableItems()) {
			if (ra instanceof RunnableInstructions) {
				final RunnableInstructions ri = (RunnableInstructions) ra;
				rt += ri.getDefault() instanceof InstructionsConstant
						? ((InstructionsConstant) ri.getDefault()).getValue()
						: ri.getDefault() instanceof InstructionsDeviation ? (((InstructionsDeviation) ri.getDefault())
								.getDeviation().getLowerBound().getValue()
								+ ((InstructionsDeviation) ri.getDefault()).getDeviation().getUpperBound().getValue())
								/ 2 : 0;
			}
		}
		if (rt == 0) {
			PartLog.getInstance().log(
					"No instructions constant / deviation found at Runnable " + r.getName() + ". Assuming 1.", null);
			final InstructionsConstant ic = AmaltheaFactory.eINSTANCE.createInstructionsConstant();
			ic.setValue(1);
			final RunnableInstructions ri = AmaltheaFactory.eINSTANCE.createRunnableInstructions();
			ri.setDefault(ic);
			r.getRunnableItems().add(ri);
			rt = 1;
		}
		return rt;
	}

	List<Runnable> visited = new BasicEList<Runnable>();

	/**
	 * Get ProcessPrototype from a Runnable (the ProcessPrototype, that contains
	 * the given runnable)
	 *
	 * @param runnable
	 * @param swm
	 * @return ProcessPrototype, that contains the parameter runnable
	 */
	public ProcessPrototype getPPfromR(final Runnable runnable, final SWModel swm) {
		for (final ProcessPrototype pp : swm.getProcessPrototypes()) {
			for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
				if (trc.getRunnable().equals(runnable)) {
					return pp;
				}
			}
		}
		PartLog.getInstance().log("getPPFromR did not find PP for Runnable " + runnable.getName(), null);
		return null;
	}

	/**
	 * calculates the longest runtime of a runnable according to all succeeding
	 * (dependent) runnables recursively. Function is able to handle cyclic
	 * graphs.
	 *
	 * @param cm
	 *            constraints model represents dependencies
	 * @param r
	 *            the given runnable thats runtime shall be calculated
	 * @return runtime of succeeding runnables and the runnable's runtime
	 */
	public long getPreceedingRunTimeCycle(final ConstraintsModel cm, final Runnable r) {
		if (r == null) {
			return Long.MAX_VALUE;
		}
		long rt = 0;
		this.visited.add(r);
		for (final RunnableSequencingConstraint rsc : cm.getRunnableSequencingConstraints()) {
			if (rsc.getRunnableGroups().get(1).getRunnables().get(0).equals(r)
					&& !this.visited.contains(rsc.getRunnableGroups().get(0).getRunnables().get(0))) {
				final long temp = getPreceedingRunTimeCycle(cm, rsc.getRunnableGroups().get(0).getRunnables().get(0));
				if (temp > rt) {
					rt = temp;
				}
			}
		}
		return rt + getInstructions(r);
	}


	/**
	 * calculates the longest runtime of a runnable according to all succeeding
	 * (dependent) runnables recursivly. Function is able to handle cyclic
	 * graphs
	 *
	 * @param cm
	 *            constraints model represents dependencies
	 * @param r
	 *            the given runnable thats runtime shall be calculated
	 * @return runtime of succeeding runnables and the runnable's runtime
	 */
	public long getSucceedingRunTimeCycle(final ConstraintsModel cm, final Runnable r) {
		if (r == null) {
			return Long.MAX_VALUE;
		}
		long rt = 0;
		this.visited.add(r);
		for (final RunnableSequencingConstraint rsc : cm.getRunnableSequencingConstraints()) {
			if (rsc.getRunnableGroups().get(0).getRunnables().get(0).equals(r)
					&& !this.visited.contains(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
				final long temp = getSucceedingRunTimeCycle(cm, rsc.getRunnableGroups().get(1).getRunnables().get(0));
				if (temp > rt) {
					rt = temp;
				}
			}
		}
		return rt + getInstructions(r);
	}

	/**
	 * determination of a common label that two runnables access
	 *
	 * @param runnable
	 * @param runnable2
	 * @return label common
	 */
	public Label getCommonLabel(final Runnable runnable, final Runnable runnable2) {
		for (final RunnableItem ri1 : runnable.getRunnableItems()) {
			if (ri1 instanceof LabelAccess) {
				final LabelAccess la1 = (LabelAccess) ri1;
				for (final RunnableItem ri2 : runnable2.getRunnableItems()) {
					if (ri2 instanceof LabelAccess) {
						final LabelAccess la2 = (LabelAccess) ri2;
						if (la1.getData().equals(la2.getData()) && ((la1.getAccess().equals(LabelAccessEnum.READ)
								&& la2.getAccess().equals(LabelAccessEnum.WRITE))
								|| (la1.getAccess().equals(LabelAccessEnum.WRITE)
										&& la2.getAccess().equals(LabelAccessEnum.READ)))) {
							return la1.getData();
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * calls UniversalHandler() and writes the @param models into the original
	 * file, thats filename is extended by @param name
	 *
	 * @param event
	 *            ExecutionEvent for File information
	 */
	public static void writeModelFile(final IFile file, final URI path, final ArrayList<EObject> models) {
		PartLog.getInstance().log("Writing " + path.toString() + "\n");
		UniversalHandler.getInstance().writeModel(path, models);
	}

	public static void writeModelFile(final IFile file, final URI path, final Amalthea models) {
		PartLog.getInstance().log("Writing " + path.toString() + "\n");
		UniversalHandler.getInstance().writeModel(path, models);
	}

	/**
	 * Get all runnables from a ProcessPrototype in form of an EList
	 *
	 * @param pp
	 * @return Elist<Runnable> all runnables contained in pp
	 */
	public EList<Runnable> getRunnables(final ProcessPrototype pp) {
		final EList<Runnable> rl = new BasicEList<Runnable>();
		for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
			rl.add(trc.getRunnable());
		}
		return rl;
	}

	/**
	 * Set all model received from @param UniversalHandler to @return & @param
	 * Amalthea model
	 */
	public Amalthea setAllModels(final Amalthea amodels, final UniversalHandler uh) {
		amodels.setCommonElements(uh.getCommonElements());
		amodels.setConstraintsModel(uh.getConstraintsModel());
		amodels.setHwModel(uh.getHwModel());
		amodels.setMappingModel(uh.getMappingModel());
		amodels.setOsModel(uh.getOsModel());
		amodels.setPropertyConstraintsModel(uh.getPropertyConstraintsModel());
		amodels.setStimuliModel(uh.getStimuliModel());
		amodels.setSwModel(uh.getSwModel());
		amodels.setEventModel(uh.getEvModel());
		amodels.setComponentsModel(uh.getComModel());
		amodels.setConfigModel(uh.getConfModel());
		return amodels;
	}

	public void assignAPs(final Set<AccessPrecedenceSpec> aps) {
		for (final AccessPrecedenceSpec ap : aps) {
			final Runnable r = ap.getOrigin();
			final EList<TaskRunnableCall> trcs = r.getTaskRunnableCalls();
			for (final TaskRunnableCall trc : trcs) {
				ProcessPrototype pp = AmaltheaFactory.eINSTANCE.createProcessPrototype();
				if (trc.eContainer() instanceof ProcessPrototype) {
					pp = (ProcessPrototype) trc.eContainer();
				}
				if (null != pp.getName() && !pp.getAccessPrecedenceSpec().contains(ap)) {
					pp.getAccessPrecedenceSpec().add(ap);
				}
			}
		}
	}

	/**
	 * Updates ProcessScope wrt ProcessPrototypes of all RSCs
	 *
	 * @param amodels
	 * @return
	 */
	public ConstraintsModel updateRSCs(final ConstraintsModel cm, final SWModel swm) {
		for (final RunnableSequencingConstraint rsc : cm.getRunnableSequencingConstraints()) {
			final Runnable source = rsc.getRunnableGroups().get(0).getRunnables().get(0);
			final Runnable target = rsc.getRunnableGroups().get(1).getRunnables().get(0);
			for (final ProcessPrototype pp : swm.getProcessPrototypes()) {
				for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
					if (trc.getRunnable().equals(source)) {
						rsc.getProcessScope().clear();
						rsc.getProcessScope().add(pp);
					}
					else if (trc.getRunnable().equals(target)) {
						rsc.getProcessScope().clear();
						rsc.getProcessScope().add(pp);
					}
				}
			}
		}
		return cm;
	}

	/**
	 * Adds ProcessPrototypes' FirstRunnable, LastRunnable, and Activation
	 * properties
	 *
	 * @param swm
	 * @return
	 */
	public SWModel updatePPsFirstLastActParams(final SWModel swm) {
		for (final ProcessPrototype pp : swm.getProcessPrototypes()) {
			if (pp.getRunnableCalls().size() > 0) {
				if (pp.getFirstRunnable() == null
						|| pp.getFirstRunnable() != pp.getRunnableCalls().get(0).getRunnable()) {
					pp.setFirstRunnable(pp.getRunnableCalls().get(0).getRunnable());
				}
				if (pp.getLastRunnable() == null || pp.getLastRunnable() != pp.getRunnableCalls()
						.get(pp.getRunnableCalls().size() - 1).getRunnable()) {
					pp.setLastRunnable(pp.getRunnableCalls().get(pp.getRunnableCalls().size() - 1).getRunnable());
				}
			}
			if (pp.getActivation() == null && pp.getRunnableCalls().get(0).getRunnable().getFirstActivation() != null) {
				pp.setActivation(pp.getRunnableCalls().get(0).getRunnable().getFirstActivation());
				// TODO: handle multiple activations
			}
			else if (pp.getRunnableCalls().get(0).getRunnable().getFirstActivation() == null) {
				PartLog.getInstance().log("Runnable " + pp.getRunnableCalls().get(0).getRunnable().getName()
						+ " has no activation, this might be a problem for the mapping process.");
			}
		}
		return swm;
	}

	/**
	 *
	 * @param processPrototypes
	 * @return String with PP.name(sum(instructions)):Runnable1 Runnable2 ...
	 */
	public String writePPs(final EList<ProcessPrototype> processPrototypes) {
		final StringBuffer sb = new StringBuffer();
		short i = 0;
		sb.append("******************************************************\n");
		sb.append(String.format("%2S%10S%16S%6S", " #", "PP", "Instructionssum", "#TRCs") + " TRCs\n");
		sb.append("******************************************************\n");
		for (final ProcessPrototype pp : processPrototypes) {
			sb.append(String.format("%2s%10s%16s%6s", i++, pp.getName(), getPPInstructions(pp),
					pp.getRunnableCalls().size()) + " ");
			// sb.append("ProcessPrototype " + pp.getName() + "(" +
			// getPPInstructions(pp) + ") : ");
			for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
				sb.append(String.format("%30s",
						trc.getRunnable().getName().substring(0,
								trc.getRunnable().getName().length() > 29 ? 29 : trc.getRunnable().getName().length())
								+ " "));
			}
			sb.append("\n");
		}
		sb.append("******************************************************");
		return sb.toString();
	}

	/**
	 *
	 * @param pp
	 * @return long the sum of the PP's Runnable Instructions
	 */
	public long getPPInstructions(final ProcessPrototype pp) {
		long instrSum = 0;
		for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
			instrSum += getInstructions(trc.getRunnable());
		}

		return instrSum;
	}

	public double getPPIntrSumActRel(final ProcessPrototype pp) {
		long instrSum = 0;
		for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
			instrSum += getInstructions(trc.getRunnable());
		}
		// mpis = multiplier in seconds
		double mpis = 0;
		if (pp.getActivation() instanceof PeriodicActivation) {
			final PeriodicActivation pact = (PeriodicActivation) pp.getActivation();
			if (null != pact.getMax().getValue() && null != pact.getMin().getValue() && null != pact.getMax().getUnit()
					&& null != pact.getMin().getUnit()) {
				mpis = (pact.getMax().getValue().doubleValue() + pact.getMin().getValue().doubleValue()) / 2;
			}
			mpis *= getTimeUnit(pact);
		}
		instrSum *= mpis;
		return instrSum;
	}

	public double getTimeUnit(final PeriodicActivation pact) {
		switch (pact.getMax().getUnit()) {
			case MS:
				return 0.001;
			case US:
				return 0.000001;
			case NS:
				return 0.000000001;
			case PS:
				return 0.000000000001;
			case S:
				return 1;
			default:
				break;
		}
		return 0;
	}

}
