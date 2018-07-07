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

package org.eclipse.app4mc.multicore.partitioning.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.partitioning.algorithms.CriticalPath.tf;
import org.eclipse.app4mc.multicore.partitioning.utils.Helper;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.jgrapht.DirectedGraph;

/**
 * The critical path partitioning approach assigns runnables to ProcessPrototypes with respect to their
 * execution cycles and dependencies. The first ProcessPrototype will contain the critical path and other
 * ProcessPrototypes will contain graph branches next to the critical path. The mechanism is thereby able to
 * provide maximal parallelism and minimal runtime. The boolean globalCPForAll defines whether a critical path
 * is created (for a separate ProcessPrototype) for each existing ProcessPrototype (e.g. created by the
 * previous independent graph partitioning)
 */
public class CPP {
	public SWModel swm;
	public ConstraintsModel cm;
	int ctcp = 0;
	public boolean bglobalCP = true;
	EList<ProcessPrototype> result = new BasicEList<ProcessPrototype>();
	private final Map<Runnable, CriticalPath.tf> cache = new HashMap<Runnable, CriticalPath.tf>();
	private CriticalPath globalCP = null;
	private final EList<Runnable> assignedNodes = new BasicEList<Runnable>();
	private DirectedGraph<Runnable, RunnableSequencingConstraint> graph;

	public CPP(final SWModel swm, final ConstraintsModel cm) {
		this.swm = swm;
		this.cm = cm;
	}


	/**
	 * INPUT: SWModel and ConstraintsModel featuring runnables and dependencies (graph structure, constructor)
	 *
	 * @return OUTPUT: Set of ProcessPrototypes with taskRunnableCalls
	 */
	public void build(final IProgressMonitor monitor) {
		PartLog.getInstance().setLogName("CP Partitioning");
		// In case AA has been performed globalCP must be set true
		if (this.swm == null) {
			PartLog.getInstance().log("No SWmodel for CP partitioning. Stopping.", null);
			return;
		}
		final Set<AccessPrecedenceSpec> aps = new HashSet<AccessPrecedenceSpec>();
		aps.addAll(this.swm.getProcessPrototypes().get(0).getAccessPrecedenceSpec());
		// calculate global critical path
		final CriticalPath gcp = new CriticalPath(this.swm, this.cm);
		monitor.beginTask("Find ciritcal path", 1);
		final EList<Runnable> gcpr = gcp.getCP();
		monitor.worked(1);
		// graph is needed for easier assigneable runnable search
		this.graph = gcp.getGraph();

		int gcpl = 0;
		for (final Runnable r : gcpr) {
			gcpl += new Helper().getInstructions(r);
		}
		PartLog.getInstance().log("CP contains " + gcpr.size() + " Runnables and consumes " + gcpl + " instructions.");
		for (final Runnable r : this.swm.getRunnables()) {
			this.cache.put(r, gcp.getTF(r));
			if (gcp.getTF(r).lit < 0) {
				PartLog.getInstance().log("Negative LIT value", null);
				break;
			}
			else if (gcp.getTF(r).lit < gcp.getTF(r).eit) {
				PartLog.getInstance().log("LIT < EIT", null);
				break;
			}
		}

		if (this.swm.getProcessPrototypes().size() > 1) {
			PartLog.getInstance().log("GGP/AA performed. Partitioning starts for each ProcessPrototype!");
		}
		final AmaltheaFactory cf = AmaltheaFactory.eINSTANCE;
		final AmaltheaFactory swf = AmaltheaFactory.eINSTANCE;

		if (this.bglobalCP) {
			final ProcessPrototype pp0 = swf.createProcessPrototype();
			pp0.setName("GCP00");
			for (final Runnable r : gcpr) {
				this.assignedNodes.add(r);
				final TaskRunnableCall trc = swf.createTaskRunnableCall();
				trc.setRunnable(r);
				pp0.getRunnableCalls().add(trc);
			}
			this.result.add(pp0);
		}

		this.globalCP = gcp;
		long cpl = this.globalCP.getPathLength(gcpr);
		PartLog.getInstance().log("GCP00: " + this.globalCP.getPathString(gcpr));

		final SWModel swm2 = swf.createSWModel();
		final ConstraintsModel cm2 = cf.createConstraintsModel();
		for (final ProcessPrototype pp : this.swm.getProcessPrototypes()) {
			// create subset models for each previous PP (independent graph / activation graph)
			if (cm2.getRunnableSequencingConstraints().size() > 0) {
				final EList<RunnableSequencingConstraint> rscl = new BasicEList<RunnableSequencingConstraint>();
				for (final RunnableSequencingConstraint rsc : cm2.getRunnableSequencingConstraints()) {
					rscl.add(rsc);
				}
				for (final RunnableSequencingConstraint rsc : rscl) {
					this.cm.getRunnableSequencingConstraints().add(rsc);
				}
			}
			cm2.getRunnableSequencingConstraints().clear();
			swm2.getRunnables().clear();
			swm2.getProcessPrototypes().clear();
			EList<Runnable> llr = new BasicEList<Runnable>();
			llr = new Helper().getRunnables(pp);
			for (final Runnable ru : llr) {
				if (!this.assignedNodes.contains(ru)) {
					swm2.getRunnables().add(ru);
				}
			}

			// List has to be created in order to avoid concurrent modification exception
			final EList<RunnableSequencingConstraint> rscl = new BasicEList<RunnableSequencingConstraint>();
			for (final RunnableSequencingConstraint rsc : this.cm.getRunnableSequencingConstraints()) {
				rscl.add(rsc);
			}
			for (final RunnableSequencingConstraint rsc : rscl) {
				if (llr.contains(rsc.getRunnableGroups().get(0).getRunnables().get(0))
						&& llr.contains(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
					cm2.getRunnableSequencingConstraints().add(rsc);
				}
			}

			swm2.getActivations().addAll(this.swm.getActivations());

			// calculate local critical path for ProcesspPrototype
			int ct = 0;
			if (!this.bglobalCP) {
				if (swm2.getRunnables().size() > 0) {
					final CriticalPath lcp = new CriticalPath(swm2, cm2);
					final EList<Runnable> lcpr = lcp.getCP();
					final ProcessPrototype pp1 = swf.createProcessPrototype();
					pp1.setName("LCP" + ++this.ctcp + ct);
					for (final Runnable r : lcpr) {
						final TaskRunnableCall trc = swf.createTaskRunnableCall();
						trc.setRunnable(r);
						pp1.getRunnableCalls().add(trc);
					}
					this.result.add(pp1);
					cpl = lcp.getPathLength(lcpr);
					for (final Runnable r : lcpr) {
						this.assignedNodes.add(r);
					}
				}
			}
			if (this.result.size() == 1) {
				ct++;
			}
			final int temp = swm2.getRunnables().size() - this.assignedNodes.size();
			monitor.beginTask("Assigning Runnables next to the ciritcal path to further ProcessProrotypes", temp);
			while (!this.assignedNodes.containsAll(swm2.getRunnables())) {
				monitor.worked(1);
				final ProcessPrototype ppt = swf.createProcessPrototype();
				ppt.setName("PP" + this.ctcp + ct++);
				long ttime = 0;

				// check cpl: there may be a runnable with greater lit
				for (final Runnable r : swm2.getRunnables()) {
					if (this.cache.get(r).lit > cpl) {
						cpl = this.cache.get(r).lit + new Helper().getInstructions(r);
					}
				}

				while (ttime < cpl) {
					final EList<Runnable> an = getAssignableNodes(ttime, swm2, cm2);
					switch (an.size()) {
						case 0:
							final long nextTime = getNextAssignableRunnablesRT(ttime, swm2);
							if (nextTime != ttime) {
								ttime = nextTime;
							}
							else {
								ttime++;
							}
							if (ttime == 0) {
								ttime = cpl;
							}
							break;
						case 1:
							final TaskRunnableCall trc = swf.createTaskRunnableCall();
							trc.setRunnable(an.get(0));
							ppt.getRunnableCalls().add(trc);
							ttime += (new Helper().getInstructions(an.get(0)));
							this.assignedNodes.add(an.get(0));
							updateTFs(an.get(0), ttime);
							break;
						default:
							final Runnable men = getMostEffectiveNode(an);
							if (men == null) {
								PartLog.getInstance().log("No most effective Runnable found - aborting", null);
								return;
							}
							final TaskRunnableCall trc2 = swf.createTaskRunnableCall();
							trc2.setRunnable(men);
							ppt.getRunnableCalls().add(trc2);
							ttime += (new Helper().getInstructions(men));
							this.assignedNodes.add(an.get(an.indexOf(men)));
							updateTFs(men, ttime);
							break;
					}
				}
				if (ppt.getRunnableCalls().size() == 0) {
					PartLog.getInstance().log("No Runnable found! Unassigned Nodes: ", null);
					final StringBuffer sb = new StringBuffer();
					for (final Runnable r : swm2.getRunnables()) {
						if (!this.assignedNodes.contains(r)) {
							sb.append(r.getName() + "(" + this.cache.get(r).eit + " " + this.cache.get(r).lit + "), ");
						}
					}
					PartLog.getInstance().log(sb.toString());
				}
				this.result.add(ppt);
			}
			if (this.bglobalCP) {
				this.ctcp++;
				ct--;
			}
		}

		// Write result into console
		PartLog.getInstance()
				.log("Critical Path Partitioning finished. Created ProcessPrototypes: " + this.result.size());

		// The following outout can be used to also illustrate each runnable's eit / lit values
		/*
		 * for (final ProcessPrototype pp : this.result) { final StringBuffer sb = new StringBuffer();
		 * sb.append( "ProcessPrototype " + pp.getName() + ": "); for (final TaskRunnableCall trc :
		 * pp.getRunnableCalls()) { sb.append(trc.getRunnable().getName() + " (" +
		 * this.cache.get(trc.getRunnable()).eit + "," + this.cache.get(trc.getRunnable()).lit + ") "); }
		 * PartLog.getInstance().log(sb.toString()); }
		 */

		// Retain AccessPrecedences
		new Helper().assignAPs(aps);

		// write result into swm
		this.swm.getProcessPrototypes().clear();
		for (final ProcessPrototype pp : this.result) {
			this.swm.getRunnables().addAll(new Helper().getRunnables(pp));
			this.swm.getProcessPrototypes().add(pp);
		}
		// retain RSCs
		this.cm.getRunnableSequencingConstraints().addAll(cm2.getRunnableSequencingConstraints());
		final Amalthea amodels = AmaltheaFactory.eINSTANCE.createAmalthea();
		amodels.setConstraintsModel(this.cm);
		amodels.setSwModel(this.swm);
		this.cm = new Helper().updateRSCs(amodels.getConstraintsModel(), amodels.getSwModel());
		for (final Runnable r : this.swm.getRunnables()) {
			if (null != r.getFirstActivation() && !this.swm.getActivations().contains(r.getFirstActivation())) {
				this.swm.getActivations().add(r.getFirstActivation()); 		//TODO: handle multiple activations
			}
		}
	}

	/**
	 * any assignment influences eit & lit values of unassigned nodes, this method corrects them
	 *
	 * @param r
	 *            the assigned runnable in order to determine suceeding and preceeding unassigned runnables
	 * @param ttime
	 *            the assigned time of assigend @param r, to determine a distance, that has to be added to eit
	 *            or subtracted from lit values
	 * @throws Exception
	 */
	private void updateTFs(final Runnable r, final long ttime) {
		final long assignedTime = ttime - new Helper().getInstructions(r);
		final long eitDistance = assignedTime - this.cache.get(r).eit;
		final long litDistance = this.cache.get(r).lit - assignedTime;
		if (eitDistance > 0) {
			final Set<Runnable> srl = getSuceedingUnassignedRunnables(r);
			for (final Runnable run : srl) {
				long temp = 0;
				final tf ntf = this.cache.get(run);
				temp = ntf.eit + eitDistance;
				if (temp < ntf.lit) {
					ntf.eit = temp;
					this.cache.put(run, ntf);
				}
			}
		}
		if (litDistance > 0) {
			final Set<Runnable> prl = getPreceedingUnassignedRunnables(r);
			for (final Runnable run : prl) {
				long temp = 0;
				final tf ntf = this.cache.get(run);
				temp = ntf.lit - litDistance;
				if (temp > ntf.eit && temp > 0) {
					ntf.lit = temp;
					this.cache.put(run, ntf);
				}
			}
		}
	}

	private Set<Runnable> getPreceedingUnassignedRunnables(final Runnable r) {
		final Set<RunnableSequencingConstraint> originsrsc = this.graph.incomingEdgesOf(r);
		final Set<Runnable> origins = new HashSet<Runnable>();
		for (final RunnableSequencingConstraint rsc : originsrsc) {
			if (!this.assignedNodes.contains(this.graph.getEdgeSource(rsc))) {
				origins.addAll(getPreceedingUnassignedRunnables(this.graph.getEdgeSource(rsc)));
			}
		}
		if (!this.assignedNodes.contains(r)) {
			origins.add(r);
		}
		return origins;
	}

	private Set<Runnable> getSuceedingUnassignedRunnables(final Runnable r) {
		final Set<RunnableSequencingConstraint> targetsrsc = this.graph.outgoingEdgesOf(r);
		final Set<Runnable> targets = new HashSet<Runnable>();
		for (final RunnableSequencingConstraint rsc : targetsrsc) {
			if (!this.assignedNodes.contains(this.graph.getEdgeTarget(rsc))) {
				targets.addAll(getSuceedingUnassignedRunnables(this.graph.getEdgeTarget(rsc)));
			}
		}
		if (!this.assignedNodes.contains(r)) {
			targets.add(r);
		}
		return targets;
	}

	private long getNextAssignableRunnablesRT(final long time, final SWModel swm2) {
		long RunnablesCurrentStartTime = Long.MAX_VALUE;
		for (final Runnable r : swm2.getRunnables()) {
			if (!this.assignedNodes.contains(r)) {
				final long st = this.cache.get(r).eit;
				if (st >= time && st < RunnablesCurrentStartTime) {
					RunnablesCurrentStartTime = st;
				}
			}
		}
		if (RunnablesCurrentStartTime == Long.MAX_VALUE) {
			return 0;
		}
		return RunnablesCurrentStartTime;
	}

	/**
	 * 1st half: determines earliest assignable node; 2nd half: determines a node within the given set of
	 * nodes @param an, that features the most restricted time frame and lowest communication overhead
	 *
	 * @return most effective node
	 */
	private Runnable getMostEffectiveNode(final EList<Runnable> an) {
		// from all assignable runnables, check preceding unassigned runnable instruction sums
		final HashMap<Runnable, Long> hm = new HashMap<Runnable, Long>();
		final long cpl = this.globalCP.getPathLength();
		for (final Runnable r : an) {
			long prio = 1;
			prio += getCommunicationOverhead(r);
			final tf TF = this.cache.get(r);
			// lit-eit --> the smaller the value the higher their prio
			// e.g. cpl=20, lit-eit=5; prio is multiplied by shift factor 15
			prio *= cpl - (TF.lit - TF.eit > 0 ? TF.lit - TF.eit : 1);
			// Todo consider runnable size
			hm.put(r, prio);
		}

		float temp = 0;
		Runnable ret = null;
		for (final Runnable r : hm.keySet()) {
			if (hm.get(r) > temp) {
				ret = r;
				temp = hm.get(r);
			}
		}
		return ret;
	}

	/**
	 * computes the runnable's @param r communication overhead that is defined by the sum of accessed label
	 * size(s) in bits, shared with runnables of other processprototypes
	 *
	 * @return communication overhead = size of shared labels in bits (with other processprototypes)
	 */
	private long getCommunicationOverhead(final Runnable r) {
		int co = 0;
		// Runnable is called by one processprototype
		// TODO the following line should use getTaskRunnableCalls() !!
		if (r.getRunnableCalls().size() > 1) {
			PartLog.getInstance().log("Runnable is called multiple times", null);
			return 0;
		}
		final TaskRunnableCall trc = r.getTaskRunnableCalls().get(0);
		if (trc == null) {
			PartLog.getInstance().log("Runnable " + r.getName() + " is never called");
			return 0;
		}
		ProcessPrototype pp = null;
		Task t = null;
		if (trc.eContainer() instanceof ProcessPrototype) {
			pp = (ProcessPrototype) trc.eContainer();
		}
		else if (trc.eContainer() instanceof CallSequence) {
			t = (Task) trc.eContainer().eContainer().eContainer();
		}
		if (t == null && pp == null) {
			PartLog.getInstance().log("TRC neither task nor parocessPrototye", null);
			return 0;
		}
		for (final RunnableItem ri : r.getRunnableItems()) {
			if (ri instanceof LabelAccess) {
				final LabelAccess laSource = (LabelAccess) ri;
				if (laSource.getData() != null) {
					final EList<LabelAccess> las = laSource.getData().getLabelAccesses();
					// check the other runnables that access same label
					for (final LabelAccess laOther : las) {
						if (!laOther.equals(laSource)) {
							if (laOther.eContainer() instanceof Runnable) {
								final Runnable or = (Runnable) laOther.eContainer();
								if (!r.equals(or)) {
									final TaskRunnableCall trc2 = or.getTaskRunnableCalls().get(0);
									if (trc2.eContainer() instanceof ProcessPrototype) {
										final ProcessPrototype opp = (ProcessPrototype) trc2.eContainer();
										// only add databits if shared ressource is shared with another
										// processprototype
										if (!opp.equals(pp) && opp.getName() != ("allRunnables")) {
											if (laSource.getData().getSize() != null) {
												co += laSource.getData().getSize().getNumberBits();
											}
											else {
												// no label data available--> add 1
												co += 1;
											}
										}
									}
									else if (trc2.eContainer() instanceof CallSequence) {
										final Task ot = (Task) trc2.eContainer().eContainer().eContainer();
										if (!ot.equals(t)) {
											if (laSource.getData().getSize() != null) {
												co += laSource.getData().getSize().getNumberBits();
											}
											else {
												// no label data available --> add 1
												co += 1;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return co;
	}

	/**
	 * computes all assignable nodes according to a specific starttime and no order constraint violation with
	 * any assigned runnable
	 *
	 * @param tt
	 *            tasktime
	 * @param cm2
	 * @param swm2
	 * @return all nodes, that can be computed at the given starttime tt
	 */
	private EList<Runnable> getAssignableNodes(final long tt, final SWModel swm2, final ConstraintsModel cm2) {
		final EList<Runnable> an = new BasicEList<Runnable>();
		for (final Runnable r : swm2.getRunnables()) {
			if (this.cache.get(r).eit <= tt && !this.assignedNodes.contains(r) && tt <= this.cache.get(r).lit) {
				an.add(r);
			}
		}

		return an;
	}
}
