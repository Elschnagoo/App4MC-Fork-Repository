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
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.partitioning.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.ASILType;
import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

/**
 * This class creates ProcessPrototypes if ASIL levels are assigend to runnables
 * and adds runnable calls correspondingly
 */
public class AsilToPP {

	public AsilToPP(final SWModel Swm) {
		this.swm = Swm;
	}

	private final SWModel swm;

	/**
	 * Creates ProcessPrototypes for each referenced ASIL level and assigns
	 * runnables correspondingly. May result in multiple RunnablesCalls for the
	 * same runnable if other ProcessPrototypes are already existing.
	 */
	public void createPPsFromASILs() {
		for (final ASILType at : ASILType.values()) {
			if (RunnableRefsASIL(at)) {
				final ProcessPrototype pp = AmaltheaFactory.eINSTANCE.createProcessPrototype();
				pp.setName(at.getName());
				for (final Runnable r : getAsilRunnables(at)) {
					final TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
					trc.setRunnable(r);
					pp.getRunnableCalls().add(trc);
				}
				if (pp.getRunnableCalls().size() > 0) {
					this.swm.getProcessPrototypes().add(pp);
				}
			}
		}
		if (!new Helper().tRCsAreConsist(this.swm)) {
			PartLog.getInstance().log("There are runnables called more than once", null);
			// performMerge();
		}
	}

	/**
	 * Creates ProcessPrototypes (max 4) for each referenced ASIL level and
	 * assigns runnables correspondingly. Considers existing ProcessPrototypes,
	 * such that TaskRunnableCalls are removed from existing ProcessPrototypes
	 * if corresponding runnables reference ASIL levels.
	 */
	public void createPPsFromASILsSplit() {
		final EList<ProcessPrototype> newPPs = new BasicEList<ProcessPrototype>();
		for (final ProcessPrototype pp : this.swm.getProcessPrototypes()) {
			ASILType at = null;

			final Iterator<TaskRunnableCall> it = pp.getRunnableCalls().iterator();
			while (it.hasNext()) {
				final TaskRunnableCall trc = it.next();
				// for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
				final Runnable r = trc.getRunnable();
				if (null == at && null != r.getAsilLevel()) {
					at = r.getAsilLevel();
				}
				else if (null != at && null != r.getAsilLevel() && !at.equals(r.getAsilLevel())) {
					final TaskRunnableCall trcnew = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
					trcnew.setRunnable(trc.getRunnable());
					if (!newPPsContains(newPPs, r.getAsilLevel(), r.getFirstActivation())) {
						final ProcessPrototype ppNew = AmaltheaFactory.eINSTANCE.createProcessPrototype();
						ppNew.setName("ASIL-" + r.getAsilLevel().toString());
						if (null != r.getFirstActivation()) {
							ppNew.setName(ppNew.getName() + "_" + r.getFirstActivation().getName());
						}
						ppNew.getRunnableCalls().add(trcnew);
						newPPs.add(ppNew);
						it.remove();
					}
					else {
						addTrcToNewAsilPP(newPPs, trcnew);
						it.remove();
					}
				}
			}
		}
		this.swm.getProcessPrototypes().addAll(newPPs);
	}

	/**
	 * Splits existing ProcessPrototypes for each referenced ASIL level and
	 * assigens runnables correspondingly. Potentially may result in max #PPs*5
	 */
	public void createPPsFromASILsSplitEach() {
		final EList<ProcessPrototype> newPPs = new BasicEList<ProcessPrototype>();
		final Iterator<ProcessPrototype> ppit = this.swm.getProcessPrototypes().iterator();
		while (ppit.hasNext()) {
			final ProcessPrototype pp = ppit.next();
			final List<ASILType> asils = new ArrayList<ASILType>();
			final List<TaskRunnableCall> asiltrcs = pp.getRunnableCalls().stream().distinct()
					.filter(trc -> (null != trc.getRunnable().getAsilLevel()
							&& trc.getRunnable().getAsilLevel().toString() != "_undefined_"))
					.collect(Collectors.toList());
			asiltrcs.stream().forEach(trc -> asils.add(trc.getRunnable().getAsilLevel()));
			final List<ASILType> asilsd = asils.stream().distinct().collect(Collectors.toList());
			for (final ASILType at : asilsd) {
				final ProcessPrototype ppa = AmaltheaFactory.eINSTANCE.createProcessPrototype();
				ppa.setName(pp.getName() + "_" + at.getName());
				ppa.setActivation(pp.getActivation());
				ppa.getRunnableCalls().addAll(asiltrcs.stream()
						.filter(trc -> trc.getRunnable().getAsilLevel().equals(at)).collect(Collectors.toList()));
				pp.getRunnableCalls().removeAll(ppa.getRunnableCalls());
				if (pp.getRunnableCalls().size() < 1) {
					ppit.remove();
					// this.swm.getProcessPrototypes().remove(pp);
				}
				newPPs.add(ppa);
			}
		}
		this.swm.getProcessPrototypes().addAll(newPPs);
	}


	private void addTrcToNewAsilPP(final EList<ProcessPrototype> newPPs, final TaskRunnableCall trcnew) {
		for (final ProcessPrototype pp : newPPs) {
			if (null != pp.getRunnableCalls().get(0)) {
				final Runnable r = pp.getRunnableCalls().get(0).getRunnable();
				if (r.getAsilLevel().equals(trcnew.getRunnable().getAsilLevel())) {
					pp.getRunnableCalls().add(trcnew);
					break;
				}
			}
		}
	}

	private boolean newPPsContains(final EList<ProcessPrototype> newPPs, final ASILType asilLevel,
			final Activation activation) {
		for (final ProcessPrototype pp : newPPs) {
			if (pp.getRunnableCalls().size() > 0) {
				final TaskRunnableCall trc = pp.getRunnableCalls().get(0);
				if (trc.getRunnable().getAsilLevel().equals(asilLevel)
						&& trc.getRunnable().getFirstActivation().equals(activation)) {
					return true;
				}
			}
		}
		return false;
	}

	private EList<Runnable> getAsilRunnables(final ASILType at) {
		final EList<Runnable> asilruns = new BasicEList<Runnable>();
		for (final Runnable r : this.swm.getRunnables()) {
			if (r.getAsilLevel().equals(at)) {
				asilruns.add(r);
			}
		}
		return asilruns;
	}

	private boolean RunnableRefsASIL(final ASILType at) {
		for (final Runnable r : this.swm.getRunnables()) {
			if (null != r.getAsilLevel() && "_undefined_" != r.getAsilLevel().getName()) {
				if (r.getAsilLevel().equals(at)) {
					return true;
				}
			}
		}
		return false;
	}
}
