/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.workflow.core;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.workflow.core.exception.ConfigurationException;
import org.eclipse.app4mc.amalthea.workflow.core.exception.WorkflowException;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Base abstract class to implement a workflow component.
 * In general a workflow consists of several workflow component
 * implementations, which are called one after another.
 * <br>
 * A basic sample workflow with the available components can be like the following:
 * <br><br>
 * <code>
 * Context ctx = new DefaultContext(); <br>
 * ModelReader reader = new ModelReader(); <br>
 * reader.addFileName("path to file"); <br>
 * reader.run(ctx); <br>
 * AddSchedulePoints addSchedulePoints = new AddSchedulePoints(); <br>
 * addSchedulePoints.run(ctx); <br>
 * ModelWriter writer = new ModelWriter(); <br>
 * writer.setOutputDir("path to dir"); <br>
 * writer.setFileName("output.amxmi"); <br>
 * writer.run(ctx); <br>
 * </code>
 *
 * As default the model slot is configured to {@value #AMALTHEA_SLOT}, which can be changed using
 * {@link #setModelSlot(String)}.
 *
 */
public abstract class WorkflowComponent {

	/**
	 * Default slot for the AMALTHEA model in the {@link WorkflowContext}
	 */
	final static protected String AMALTHEA_SLOT = "amalthea";

	/**
	 * Basic {@link Logger}
	 */
	protected Logger log;

	private String modelSlot = AMALTHEA_SLOT;

	/**
	 * Default constructor which initializes the {@link Logger}
	 */
	public WorkflowComponent() {
		this.log = Logger.getLogger(getClass());
	}

	/**
	 * 
	 * @param log
	 *            The {@link Logger} to be used.
	 */
	public WorkflowComponent(final Logger log) {
		this.log = log;
	}

	/**
	 * Base start of a workflow component. First call {@link #checkInternal()} to perform general configuration checks.
	 * Afterwards the {@link #runInternal(Context)} is called to perform the intended implementation.
	 * 
	 * @param ctx
	 *            The {@link Context} data to be shared between the {@link WorkflowComponent}s.
	 * @throws WorkflowException
	 *             in case of an error or not successful finish.
	 */
	public void run(final Context ctx) throws WorkflowException {
		this.log.info("Starting...");
		checkInternal();
		runInternal(ctx);
		this.log.info("Finished!");
	}

	/**
	 * Dedicated configuration checks can be implemented here, like if all needed parameters are set.
	 * 
	 * @throws ConfigurationException
	 *             in case of an error or wrong configuration.
	 */
	protected void checkInternal() throws ConfigurationException {
		this.log.info("checkInternal not implemented yet!");
	}

	/**
	 * Base method to add the logic of the component to either read, add, modify data from a given {@link Context}.
	 * 
	 * @param ctx
	 *            The {@link Context} data to be shared between the {@link WorkflowComponent}s.
	 * @throws WorkflowException
	 *             in case of an error or not successful finish.
	 */
	abstract protected void runInternal(Context ctx) throws WorkflowException;

	/**
	 * Convenient method to access a {@link Amalthea} model in the configured model slot. At first access, an empty
	 * {@link AMALTHEA} model is initialized.
	 * 
	 * @param ctx
	 *            The current {@link WorkflowContext}
	 * @return {@link AMALTHEA} model in current configured model slot.
	 */
	protected Amalthea getAmaltheaModel(final Context ctx) {
		if (null == ctx.get(getModelSlot())) {
			this.log.debug("Empty model initialized for slot " + getModelSlot());
			ctx.set(getModelSlot(), AmaltheaFactory.eINSTANCE.createAmalthea());
		}
		return (Amalthea) ctx.get(getModelSlot());
	}

	/**
	 * Returns a copy of the current available {@link Amalthea} model using {@link #getAmaltheaModel(Context)}.
	 * Uses {@link EcoreUtil#copy(org.eclipse.emf.ecore.EObject)} to create a copy of the given model.
	 * 
	 * @param ctx
	 *            The current {@link WorkflowContext}
	 * @return A copy of the current {@link Amalthea} model in the configured model slot. At first access, an empty
	 *         {@link Amalthea} model is initialized.
	 */
	protected Amalthea getAmaltheaModelCopy(final Context ctx) {
		return EcoreUtil.copy(getAmaltheaModel(ctx));
	}

	/**
	 * Sets the given {@link Amalthea} model to the pre-defined model slot in the given {@link Context}. 
	 * Note that this is just a convenient method for the same as
	 * <code>
	 * ctx.set(getModelSlot(), model);
	 * </code>
	 * 
	 * @param ctx
	 *            The current {@link WorkflowContext}
	 * @param model
	 *            {@link Amalthea} model to set
	 */
	protected void setAmaltheaModel(final Context ctx, final Amalthea model) {
		ctx.set(getModelSlot(), model);
	}

	/**
	 * 
	 * @param log The {@link Logger} to be used.
	 */
	public void setLog(final Logger log) {
		this.log = log;
	}

	/**
	 * 
	 * @return Current slot name as {@link String}
	 */
	public String getModelSlot() {
		return this.modelSlot;
	}

	/**
	 * 
	 * @param modelSlot Name of the model slot as {@link String}
	 */
	public void setModelSlot(final String modelSlot) {
		this.modelSlot = modelSlot;
	}


}
