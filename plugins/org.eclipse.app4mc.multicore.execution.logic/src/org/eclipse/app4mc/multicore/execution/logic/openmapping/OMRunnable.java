/**
 ********************************************************************************
 * Copyright (c) 2015, 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.execution.logic.openmapping;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;

public class OMRunnable {
	private final Runnable runnableRef;
	private long instructions = -1;
	
//	private final List<OMRunnable> pre = new LinkedList<>();
	private final List<OMRunnable> post = new LinkedList<>();

	public OMRunnable(final Runnable ref) {
		this.runnableRef = ref;
	}

	public Runnable getRunnableRef() {
		return this.runnableRef;
	}

	public long getInstructionCount() {
		// Is the reference set, or do we have a dummy runnable (runtime 0)?
		if (this.runnableRef == null) {
			return 0;
		}

		// Has the number of instructions already been calculated?
		if (this.instructions >= 0) {
			return this.instructions;
		}

		// Check if list of RunnableItems is empty
		if (this.runnableRef.getRunnableItems().size() <= 0) {
			UniversalHandler.getInstance().log(
					"Invalid Software Model, Runnable '" + this.runnableRef.getName() + "' contains no RunnableItems.",
					null);
			return 0;
		}
		
		List<Ticks> totalTicks = SoftwareUtil.getTicks(getRunnableRef(), null);
		
		return (this.instructions = totalTicks.stream().mapToLong(t -> t.getDefault().getUpperBound()).sum());
	}

//	public List<OMRunnable> getPre() {
//		return pre;
//	}

	/**
	 * Get the Runnables that should run after the current one concerning to the ConstraintsModel-RunnableSequencingConstraints.
	 * @return
	 */
	public List<OMRunnable> getPost() {
		return post;
	}
	
	
}
