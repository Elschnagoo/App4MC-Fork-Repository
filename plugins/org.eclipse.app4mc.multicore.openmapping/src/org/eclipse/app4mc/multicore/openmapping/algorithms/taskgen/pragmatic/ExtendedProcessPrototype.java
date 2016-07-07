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
package org.eclipse.app4mc.multicore.openmapping.algorithms.taskgen.pragmatic;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.model.Runnable;

public class ExtendedProcessPrototype {
	private final List<Runnable> lRunnables = new LinkedList<Runnable>();
	private final List<Runnable> lOrphanRunnables = new LinkedList<Runnable>();
	private final List<SimpleEntry<Runnable, Runnable>> lEdges = new LinkedList<SimpleEntry<Runnable, Runnable>>();
	private final Runnable last;
	private final String name;

	public ExtendedProcessPrototype(final String name, final Runnable first, final Runnable last) {
		this.name = name;
		this.last = last;
	}

	public void createRunnableList() {
		tSort();
		// System.out.println(this.toString());
	}

	public void addEdge(final Runnable source, final Runnable target) {
		this.lEdges.add(new SimpleEntry<Runnable, Runnable>(source, target));
	}

	public void addOrphanRunnable(final Runnable r) {
		this.lOrphanRunnables.add(r);
	}

	public String getName() {
		return this.name;
	}

	public List<Runnable> getRunnableList() {
		return this.lRunnables;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String out = "";
		out += "Information about " + this.name + "\n";
		out += "No Runnables: " + this.lRunnables.size() + "\n";
		out += "No Orphans: " + this.lOrphanRunnables.size() + "\n";
		out += "No Edges: " + this.lEdges.size() + "\n";
		out += "Final Runnable List\n";
		for (final Runnable run : this.lRunnables) {
			out += run.getName() + "\n";
		}
		out += "List of orphan Runnables\n";
		for (final Runnable run : this.lOrphanRunnables) {
			out += run.getName() + "\n";
		}
		out += "List of Edges\n";
		for (final SimpleEntry<Runnable, Runnable> run : this.lEdges) {
			out += run.getKey().getName() + "<=>" + run.getValue().getName() + "\n";
		}

		return out;
	}

	private void tSort() {
		// Number of incoming edges per Runnable
		final Map<Runnable, Integer> mIncEdgesNo = new HashMap<Runnable, Integer>();
		// List of followers for each Runnable
		final Map<Runnable, List<Runnable>> mFollowerList = new HashMap<Runnable, List<Runnable>>();
		// Sorted list of Runnables (output)
		// final List<Runnable> lSortedRunnables = new LinkedList<Runnable>();

		final Iterator<SimpleEntry<Runnable, Runnable>> graphEdges = this.lEdges.iterator();

		// step one: calculate incoming edges and store followers
		while (graphEdges.hasNext()) {
			List<Runnable> tmp = new ArrayList<Runnable>();
			final SimpleEntry<Runnable, Runnable> edge = graphEdges.next();
			final Runnable origin = edge.getKey();
			final Runnable target = edge.getValue();

			// store followers in list, create new list of followers if list not
			// yet present
			if (mFollowerList.containsKey(origin)) {
				tmp = mFollowerList.get(origin);
			}
			tmp.add(target);
			mFollowerList.put(origin, tmp);

			// calculate predecessors
			if (!mIncEdgesNo.containsKey(origin)) {
				mIncEdgesNo.put(origin, 0);
			}

			if (!mIncEdgesNo.containsKey(target)) {
				mIncEdgesNo.put(target, 1);
			}
			else {
				mIncEdgesNo.put(target, mIncEdgesNo.get(target) + 1);
			}
		}

		// Step two: Insert remaining keys which have no more dependencies
		// left,
		// decrement predecessors value
		while (!mIncEdgesNo.isEmpty()) {
			final Iterator<Map.Entry<Runnable, Integer>> it = mIncEdgesNo.entrySet().iterator();
			// Insert the keys with no dependencies
			while (it.hasNext()) {
				final Map.Entry<Runnable, Integer> runFollowers = it.next();
				// Check if runnable has no predecessors
				if (runFollowers.getValue() == 0) {
					// first, add this runnable to the list
					this.lRunnables.add(runFollowers.getKey());
					// now decrement the followers predecessor-value
					// get list of followers (if any)
					if (mFollowerList.containsKey(runFollowers.getKey())) {
						final Iterator<Runnable> followers = mFollowerList.get(runFollowers.getKey()).iterator();
						// decrement value of each follower
						while (followers.hasNext()) {
							final Runnable cRun = followers.next();
							mIncEdgesNo.put(cRun, mIncEdgesNo.get(cRun) - 1);
						}
						mFollowerList.remove(runFollowers.getKey());
					}
					// remove runnable from lists

					it.remove();
				}
			}
		}

		// Check and fill remaining Runnables
		final Iterator<Runnable> orphans = this.lOrphanRunnables.iterator();
		while (orphans.hasNext()) {
			final Runnable orphanNode = orphans.next();
			if (!this.lRunnables.contains(orphanNode)) {
				this.lRunnables.add(orphanNode);
			}
		}

		if (this.last != null) {
			// Check if its present
			if (!this.lRunnables.contains(this.last) && !this.lOrphanRunnables.contains(this.last)) {
				this.lRunnables.add(this.last);
			}
		}

		return;
	}
}
