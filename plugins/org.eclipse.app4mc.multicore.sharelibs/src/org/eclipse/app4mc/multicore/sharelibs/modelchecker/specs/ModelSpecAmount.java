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
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.sharelibs.modelchecker.specs;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecAmountOperation;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecAmountType;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;

public class ModelSpecAmount extends ModelSpec {
	/**
	 * Object type to count.
	 */
	private final ModelSpecAmountType type;
	/**
	 * Object type to count.
	 */
	private ModelSpecAmountOperation op;
	/**
	 * Count of objects in model.
	 */
	private int amount;
	/**
	 * Value to wich the amount will be compared.
	 */
	private int compareTo;
	/**
	 * Name of the object's type to be counted.
	 */
	private String objectName;

	/**
	 * Constructor.
	 *
	 * @param type
	 *            object type to count
	 */
	public ModelSpecAmount(final ModelSpecAmountType type) {
		this.type = type;
		this.severity = EntrySeverityLevel.ERROR;
		this.specType = "Amount missmatch";
		this.name = "amount missmatch of " + type.toString().toLowerCase() + "s";
	}

	/**
	 * Parse elements needed from the model
	 *
	 * @param model
	 *            model
	 * @return true of everything was Ok and false otherwise
	 */
	private boolean parseElements(final Amalthea model) {

		// If there's an exception fail
		switch (this.type) {
			case CORE:
				this.objectName = "cores";

				this.amount = 0;

				// Add up all cores of all ECU

// TODO implement
				
//				for (final ECU ecu : model.getHwModel().getSystem().getEcus()) {
//					for (final Microcontroller mc : ecu.getMicrocontrollers()) {
//						this.amount += mc.getCores().size();
//					}
//				}

				break;
			case PROCESS_PROTOTYPE:
				this.objectName = "process prototypes";
				this.amount = model.getSwModel().getProcessPrototypes().size();
				break;
			case RUNNABLE:
				this.objectName = "runnables";
				this.amount = model.getSwModel().getRunnables().size();
				break;
			case TASK:
				this.objectName = "tasks";
				this.amount = model.getSwModel().getTasks().size();
				break;
			case ACTIVATION:
				this.objectName = "activations";
				this.amount = model.getSwModel().getActivations().size();
				break;
			default:
				log("Unknown object to parse from model");
				return false;

		}

		return true;

	}

	/**
	 * @see org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec#checkSpec(org.eclipse.app4mc.amalthea.model.Amalthea)
	 */
	@Override
	protected boolean checkSpec(final Amalthea model) throws Exception {
		boolean cond = parseElements(model);

		// If parsing fails return false only if severity is error
		if (!cond) {
			return false;
		}

		String loggingMessage = "Amount of " + this.objectName + " missmatch. ";

		switch (this.op) {
			case EQUAL:
				cond = this.amount == this.compareTo;
				loggingMessage += "Actual: " + this.amount + " Expected: " + this.compareTo;
				break;
			case GREATER:
				cond = this.amount > this.compareTo;
				loggingMessage += "Actual: " + this.amount + " Expected: > " + this.compareTo;
				break;
			case GREATER_EQUAL:
				cond = this.amount >= this.compareTo;
				loggingMessage += "Actual: " + this.amount + " Expected: >= " + this.compareTo;
				break;
			case LESS:
				cond = this.amount < this.compareTo;
				loggingMessage += "Actual: " + this.amount + " Expected: < " + this.compareTo;
				break;
			case LESS_EQUAL:
				cond = this.amount <= this.compareTo;
				loggingMessage += "Actual: " + this.amount + " Expected: <= " + this.compareTo;
				break;
			case NOT_EQUAL:
				cond = this.amount != this.compareTo;
				loggingMessage += "Actual: " + this.amount + " Expected: != " + this.compareTo;
				break;
			default:
				return false;
		}

		if (!cond) {
			log(loggingMessage);
		}

		return cond;

	}

	/**
	 * Set comparison operation and value for the spec
	 *
	 * @param op
	 *            comparison operation
	 * @param compareTo
	 *            comparison value
	 * @return the same spec object
	 */
	public ModelSpecAmount compareWith(final ModelSpecAmountOperation op, final int compareTo) {
		this.op = op;
		this.compareTo = compareTo;

		return this;
	}

	/**
	 * Set the logging severity
	 *
	 * @param severity
	 *            logging severity
	 * @return the same spec object
	 */
	public ModelSpecAmount setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
