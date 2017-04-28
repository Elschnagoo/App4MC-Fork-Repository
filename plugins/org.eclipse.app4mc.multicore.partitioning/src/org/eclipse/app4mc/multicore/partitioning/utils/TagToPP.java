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
package org.eclipse.app4mc.multicore.partitioning.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;

public class TagToPP {

	private final SWModel swm;

	public SWModel getSwm() {
		return this.swm;
	}

	private final CommonElements cem;

	public TagToPP(final SWModel sw, final CommonElements ce) {
		this.swm = sw;
		this.cem = ce;
	}

	/**
	 * If Runnables refer a Tag, ProcessPrototypes (named 'Tag_Tagname') are
	 * created and TaskRunnableCalls are assigned to those ProcessPrototypes for
	 * each Runnable that refers this Tag
	 *
	 * @return List of ProcessPrototypes
	 */
	public void createPPsFromTags() {
		// final EList<ProcessPrototype> ppl = new
		// BasicEList<ProcessPrototype>();
		if (null == this.cem.getTags() || null == this.cem) {
			PartLog.getInstance().log("Either no Tags or no CommonElements model existing");
			return;
		}
		if (null == this.swm || null == this.swm.getRunnables()) {
			PartLog.getInstance().log("Either no Runnables or no CommonElements model existing");
			return;
		}
		final HashMap<Tag, Integer> TagPPIndexMap = new HashMap<Tag, Integer>();
		int noTagIndex = -1;
		if (null == this.swm.getProcessPrototypes() || this.swm.getProcessPrototypes().size() < 1) {
			for (final Runnable r : this.swm.getRunnables()) {
				if (null == r.getTags() || 0 == r.getTags().size()) {
					final TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
					trc.setRunnable(r);
					if (noTagIndex == -1) {
						final ProcessPrototype pp = AmaltheaFactory.eINSTANCE.createProcessPrototype();
						if (r.getActivation() != null) {
							pp.setActivation(r.getActivation());
						}
						pp.setName("NoTag");
						pp.getRunnableCalls().add(trc);
						noTagIndex = this.swm.getProcessPrototypes().size();
						this.swm.getProcessPrototypes().add(pp);
					}
					else {
						if (!r.getActivation()
								.equals(this.swm.getProcessPrototypes().get(noTagIndex).getActivation())) {
							// TODO check activation
						}
						else {
							this.swm.getProcessPrototypes().get(noTagIndex).getRunnableCalls().add(trc);
						}
					}
				}
				if (1 == r.getTags().size()) {
					// TODO more than one Tag not supported yet
					final Tag rt = r.getTags().get(0);
					final TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
					trc.setRunnable(r);
					if (!TagPPIndexMap.containsKey(rt)) {
						final ProcessPrototype pp = AmaltheaFactory.eINSTANCE.createProcessPrototype();
						pp.setName("Tag_" + rt.getName());
						pp.getTags().add(rt);
						pp.getRunnableCalls().add(trc);
						TagPPIndexMap.put(rt, this.swm.getProcessPrototypes().size());
						this.swm.getProcessPrototypes().add(pp);
					}
					else {
						this.swm.getProcessPrototypes().get(TagPPIndexMap.get(rt)).getRunnableCalls().add(trc);
					}
				}
			}
		}
		// when processprototypes are already existing e.g. from actiation
		// anylsis
		else {
			final ListIterator<ProcessPrototype> ppIt = this.swm.getProcessPrototypes().listIterator();
			while (ppIt.hasNext()) {
				final ProcessPrototype pp = ppIt.next();
				Tag t = null;
				final HashMap<Tag, Integer> indexMap = new HashMap<>();

				final Iterator<TaskRunnableCall> trcIt = pp.getRunnableCalls().iterator();
				while (trcIt.hasNext()) {
					final TaskRunnableCall trc = trcIt.next();
					if (null != trc.getRunnable().getTags() && 1 == trc.getRunnable().getTags().size()) {
						final Tag currentTag = trc.getRunnable().getTags().get(0);
						if (null == t) {
							t = currentTag;
						}

						if (currentTag != t) {
							PartLog.getInstance().log("Different Tag within one ProcessPrototye " + pp.getName() + "("
									+ t.getName() + "," + currentTag.getName() + ") - Splitting into separate PPs");
							if (indexMap.containsKey(currentTag)) {
								trcIt.remove();
								this.swm.getProcessPrototypes().get(indexMap.get(currentTag)).getRunnableCalls()
										.add(trc);
							}
							else {
								final ProcessPrototype pps = AmaltheaFactory.eINSTANCE.createProcessPrototype();
								pps.setName(pp.getName() + "_Tag" + currentTag.getName());
								trcIt.remove();
								pps.getRunnableCalls().add(trc);
								pps.getTags().add(t);
								indexMap.put(currentTag, this.swm.getProcessPrototypes().size());
								ppIt.add(pps);
							}
						}
					}
				}
			}
		}
	}

}
