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
import org.eclipse.emf.common.util.EList;

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
	 * If Runnables refer a Tag, ProcessPrototypes (named 'Tag_Tagname') are created and TaskRunnableCalls are
	 * assigned to those ProcessPrototypes for each Runnable that refers this Tag
	 *
	 * @return List of ProcessPrototypes
	 */
	public void createPPsFromTags() {
		if (null == this.cem || null == this.cem.getTags()) {
			PartLog.getInstance().log("Either no Tags or no CommonElements model existing", null);
			return;
		}
		if (null == this.swm || null == this.swm.getRunnables()) {
			PartLog.getInstance().log("Either no Runnables or no software model existing", null);
			return;
		}

		// if there are no PPs, create one with all runnables calls
		if (this.swm.getProcessPrototypes().size() < 1 || null == swm.getProcessPrototypes()) {
			final ProcessPrototype pp = AmaltheaFactory.eINSTANCE.createProcessPrototype();
			pp.setName("allRunnables");
			for (final Runnable r : this.swm.getRunnables()) {
				final TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
				trc.setRunnable(r);
				pp.getRunnableCalls().add(trc);
			}
			swm.getProcessPrototypes().add(pp);
		}


		final ListIterator<ProcessPrototype> it = this.swm.getProcessPrototypes().listIterator();
		while (it.hasNext()) {
			final ProcessPrototype pp = it.next();
			final HashMap<Tag, Integer> TagPPIndexMap = new HashMap<Tag, Integer>();
			int currentNoTagIndex = -1;
			final ListIterator<TaskRunnableCall> it2 = pp.getRunnableCalls().listIterator();
			while (it2.hasNext()) {
				final TaskRunnableCall trc = it2.next();
				if (null == trc.getRunnable().getTags() || 0 == trc.getRunnable().getTags().size()) {
					if (currentNoTagIndex == -1) {
						currentNoTagIndex = this.swm.getProcessPrototypes().indexOf(pp);
						break;
					}
					final TaskRunnableCall trc2 = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
					trc2.setRunnable(trc.getRunnable());
					this.swm.getProcessPrototypes().get(currentNoTagIndex).getRunnableCalls().add(trc2);
					it2.remove();
				}
				else {
					if (TagPPIndexMap.containsKey(trc.getRunnable().getTags().get(0))) {
						final TaskRunnableCall trc2 = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
						trc2.setRunnable(trc.getRunnable());
						this.swm.getProcessPrototypes().get(TagPPIndexMap.get(trc.getRunnable().getTags().get(0)))
								.getRunnableCalls().add(trc2);
						it2.remove();
					}
					else {
						final ProcessPrototype pp2 = AmaltheaFactory.eINSTANCE.createProcessPrototype();
						pp2.setName(pp.getName() + trc.getRunnable().getTags().get(0).getName());
						if (null != trc.getRunnable().getFirstActivation()) {		//TODO: handle multiple activations
							pp2.setActivation(trc.getRunnable().getFirstActivation());
						}
						final TaskRunnableCall trc2 = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
						trc2.setRunnable(trc.getRunnable());
						pp2.getRunnableCalls().add(trc2);
						it2.remove();
						it.add(pp2);
						TagPPIndexMap.put(trc.getRunnable().getTags().get(0),
								this.swm.getProcessPrototypes().indexOf(pp2));
					}
				}
			}
		}
		removeEmptyPPs(this.swm.getProcessPrototypes());
	}

	private void removeEmptyPPs(final EList<ProcessPrototype> processPrototypes) {
		final Iterator<ProcessPrototype> it = processPrototypes.iterator();
		while (it.hasNext()) {
			final ProcessPrototype pp = it.next();
			if (pp.getRunnableCalls().size() < 1) {
				it.remove();
			}
		}
	}
}
