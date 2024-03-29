/**
 ********************************************************************************
 * Copyright (c) 2013 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.workflow.mwe2;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;

/**
 * 
 *
 */
public abstract class AmaltheaWorkflow extends WorkflowComponentWithModelSlot {

	/**
	 * Default log for workflow components
	 */
	protected Logger log = Logger.getLogger(getClass());

	/**
	 * Default slot for the AMALTHEA model in the {@link WorkflowContext}
	 */
	final static protected String AMALTHEA_SLOT = "amalthea";

	/**
	 * Default constructor which sets the default slot for the amalthea model. The slot can be overwitten by setting
	 * {@link AmaltheaWorkflow#setModelSlot(String)}.
	 */
	public AmaltheaWorkflow() {
		setModelSlot(AMALTHEA_SLOT);
	}

	/**
	 *
	 * @param ctx
	 *            The current {@link WorkflowContext}
	 * @return {@link AMALTHEA} model in current configured model slot. At first access, an empty {@link AMALTHEA} model
	 *         is initialized.
	 */
	protected Amalthea getAmaltheaModel(final WorkflowContext ctx) {
		if (null == ctx.get(getModelSlot())) {
			ctx.set(getModelSlot(), AmaltheaFactory.eINSTANCE.createAmalthea());
		}
		return (Amalthea) ctx.get(getModelSlot());
	}

	/**
	 *
	 * @param ctx
	 *            The current {@link WorkflowContext}
	 * @return A copy of the current {@link Amalthea} model in the configured model slot. At first access, an empty
	 *         {@link Amalthea} model is initialized.
	 */
	protected Amalthea getAmaltheaModelCopy(final WorkflowContext ctx) {
		return EcoreUtil.copy(getAmaltheaModel(ctx));
	}

	/**
	 *
	 * @param ctx
	 *            The current {@link WorkflowContext}
	 * @param model
	 *            {@link Amalthea} model to set
	 */
	protected void setAmaltheaModel(final WorkflowContext ctx, final Amalthea model) {
		ctx.set(getModelSlot(), model);
	}
}
