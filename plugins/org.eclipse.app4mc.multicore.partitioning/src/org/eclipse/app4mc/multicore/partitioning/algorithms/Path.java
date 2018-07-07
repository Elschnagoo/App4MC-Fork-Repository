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

import java.util.HashSet;

import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.multicore.partitioning.utils.Helper;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

public class Path {
	private HashSet<Runnable> runnables;
	public long runtime;

	public Path() {
		setRuntime(0);
		this.runnables = new HashSet<Runnable>();
	}

	public Path(final HashSet<Runnable> rl) {
		setRunnables(rl);
		updateRunTime();
		this.runnables = new HashSet<Runnable>();
	}

	public String getRunStr() {
		final StringBuffer sb = new StringBuffer();
		for (final Runnable r : getRunnables()) {
			sb.append(r.getName() + " ");
		}
		return sb.toString();
	}

	public void updateRunTime() {
		long i = 0;
		for (final Runnable r : getRunnables()) {
			i += new Helper().getInstructions(r);
		}
		this.runtime = i;
	}

	public HashSet<Runnable> getRunnables() {
		return this.runnables;
	}

	public EList<Runnable> getRunnablesL() {
		final EList<Runnable> rl = new BasicEList<Runnable>();
		for (final Runnable r : this.runnables) {
			rl.add(r);
		}
		return rl;
	}

	public void setRunnables(final HashSet<Runnable> runnables) {
		this.runnables = runnables;
		updateRunTime();
	}

	@SuppressWarnings("unchecked")
	public void setRunnables(final EList<Runnable> runnables) {
		this.runnables = (HashSet<Runnable>) runnables;
		updateRunTime();
	}

	public long getRuntime() {
		return this.runtime;
	}

	public void setRuntime(final long runtime) {
		this.runtime = runtime;
	}
}
