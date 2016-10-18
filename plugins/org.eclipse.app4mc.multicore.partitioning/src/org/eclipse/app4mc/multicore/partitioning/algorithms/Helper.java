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
package org.eclipse.app4mc.multicore.partitioning.algorithms;

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
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;
import org.eclipse.app4mc.multicore.partitioning.PartitioningPlugin;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;

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
		try {
			rt = 0;
			for (final RunnableItem ra : r.getRunnableItems()) {
				if (ra instanceof InstructionsDeviation) {
					rt = (((InstructionsDeviation) ra).getDeviation().getUpperBound().getValue()
							+ ((InstructionsDeviation) ra).getDeviation().getLowerBound().getValue()) / 2;
				}
				else if (ra instanceof InstructionsConstant) {
					rt = ((InstructionsConstant) ra).getValue();
				}
			}
			if (rt == 0) {
				PartLog.getInstance().log("No instructions constant / deviation found at Runnable " + r.getName(),
						null);
			}
		}
		catch (final Exception e) {
			PartLog.getInstance().log("getDeviation problem at Runnable " + r.getName(), e);
			e.printStackTrace();
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
	 * (dependent) runnables recusivly. Function is able to handle cyclic
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
				final long temp = getPreceedingRunTimeCycle(cm,
						rsc.getRunnableGroups().get(0).getRunnables().get(0));
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
				final long temp = getSucceedingRunTimeCycle(cm,
						rsc.getRunnableGroups().get(1).getRunnables().get(0));
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
	public void writeModelFile(final IFile file, final String name, final ArrayList<EObject> models) {
		final IPreferenceStore store = PartitioningPlugin.getDefault().getPreferenceStore();
		String path = file.getProject().getFullPath().toString() + "/" + store.getString("loc") + "/";
		path += file.getName().replace(".amxmi", name + ".amxmi");
		PartLog.getInstance().log("Writing " + path + "\n");
		UniversalHandler.getInstance().writeModel(URI.createPlatformResourceURI(path, true), models);
	}

	public void writeModelFile(final IFile file, final String name, final Amalthea models) {
		final IPreferenceStore store = PartitioningPlugin.getDefault().getPreferenceStore();
		String path = file.getProject().getFullPath().toString() + "/" + store.getString("loc") + "/";
		path += file.getName().replace(".amxmi", name + ".amxmi");
		PartLog.getInstance().log("Writing " + path + "\n");
		UniversalHandler.getInstance().writeModel(URI.createPlatformResourceURI(path, true), models);
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

	public ConstraintsModel updateRSCs(final Amalthea amodels) {
		for (final RunnableSequencingConstraint rsc : amodels.getConstraintsModel()
				.getRunnableSequencingConstraints()) {
			final Runnable source = rsc.getRunnableGroups().get(0).getRunnables().get(0);
			final Runnable target = rsc.getRunnableGroups().get(1).getRunnables().get(0);
			for (final ProcessPrototype pp : amodels.getSwModel().getProcessPrototypes()) {
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
		return amodels.getConstraintsModel();
	}

	public String writePPs(final EList<ProcessPrototype> processPrototypes) {
		final StringBuffer sb = new StringBuffer();
		for (final ProcessPrototype pp : processPrototypes) {
			sb.append("ProcessPrototype " + pp.getName() + "(" + getPPInstructions(pp) + ") : ");
			for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
				sb.append(trc.getRunnable().getName() + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public long getPPInstructions(final ProcessPrototype pp) {
		long instrSum = 0;
		for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
			instrSum += new Helper().getInstructions(trc.getRunnable());
		}
		return instrSum;
	}
}
