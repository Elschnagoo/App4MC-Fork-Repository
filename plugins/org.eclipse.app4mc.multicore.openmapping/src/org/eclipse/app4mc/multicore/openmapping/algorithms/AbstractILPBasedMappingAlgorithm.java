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
package org.eclipse.app4mc.multicore.openmapping.algorithms;

import org.ojalgo.optimisation.ExpressionsBasedModel;

public abstract class AbstractILPBasedMappingAlgorithm extends AbstractMappingAlgorithm {
	private final ExpressionsBasedModel ebm = new ExpressionsBasedModel();

	/**
	 * Sets the max gap in relation to the LP relaxation, before the solve quits.
	 *
	 * @param gap
	 *            The maximum gap between the found solution and the LP Relaxation solution before the solver quits
	 * @see org.ojalgo.optimisation.Optimisation.Options#mip_gap
	 */
	public void setMaxGap(final double gap) {
		getEbm().options.mip_gap = gap;
	}

	/**
	 * Sets the maximum number of iterations that will be performed in order to improve a feasible solution. Once this
	 * number is reached, the solver will quit.
	 *
	 * @param iterations
	 *            The maximum number of iterations before the solver quits.
	 * @see org.ojalgo.optimisation.Optimisation.Options#mip_gap
	 */
	public void setMaxIterationsSuffice(final int iterations) {
		getEbm().options.iterations_suffice = iterations;
	}

	/**
	 * Sets the maximum total number of iterations before the solver quits.
	 *
	 * @param iterations
	 *            The maximum number of iterations before the solver quits.
	 * @see org.ojalgo.optimisation.Optimisation.Options#iterations_abort
	 */
	public void setMaxIterationsAbort(final int iterations) {
		getEbm().options.iterations_abort = iterations;
	}

	/**
	 * Sets the maximum time the solver will spend on improving a previously found feasible solution. Once this time has
	 * been reached, the solver quits.
	 *
	 * @param time
	 *            The maximum time the solver will spend on improving each of the feasible solutions before it quits.
	 *
	 * @see org.ojalgo.optimisation.Optimisation.Options#time_suffice
	 */
	public void setMaxTimeSuffice(final long time) {
		getEbm().options.time_suffice = time;
	}

	/**
	 * Sets the maximum total time the solver will be executed.
	 *
	 * @param time
	 *            The maximum total time the solver will spend on optimizing the solution.
	 *
	 * @see org.ojalgo.optimisation.Optimisation.Options#time_abort
	 */
	public void setMaxTimeAbort(final long time) {
		getEbm().options.time_abort = time;
	}

	/**
	 * Gets the mathematical Model
	 *
	 * @return ExpressionBasedModel
	 */
	public ExpressionsBasedModel getEbm() {
		return this.ebm;
	}
}
