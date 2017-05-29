/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.sharelibs.modelchecker.specs;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecModelType;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;

public class ModelSpecHasModelType extends ModelSpec {
	/**
	 * Object type to count.
	 */
	private final ModelSpecModelType type;
	/**
	 * Flag the existance of a model type.
	 */
	private boolean hasModel;
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
	public ModelSpecHasModelType(final ModelSpecModelType type) {
		this.type = type;
		this.severity = EntrySeverityLevel.ERROR;
		this.specType = "Has model type";
	}

	/**
	 * Parse elements needed from the model
	 *
	 * @param model
	 *            model
	 * @return true of everything was Ok and false otherwise
	 */
	private boolean parseElements(final Amalthea model) {

		switch (this.type) {
			case HW_MODEL:
				this.objectName = "Hardware Model";
				this.hasModel = model.getHwModel() != null;
				break;
			case SW_MODEL:
				this.objectName = "Software Model";
				this.hasModel = model.getSwModel() != null;
				break;
			case CONSTRAINTS_MODEL:
				this.objectName = "Constraints Model";
				this.hasModel = model.getConstraintsModel() != null;
				break;
			case STIMULI_MODEL:
				this.objectName = "Stimuli Model";
				this.hasModel = model.getStimuliModel() != null;
				break;
			case COMMON_ELEMENTS:
				this.objectName = "Common Elements";
				this.hasModel = model.getCommonElements() != null;
				break;
			case MAPPING_MODEL:
				this.objectName = "Mapping Model";
				this.hasModel = model.getMappingModel() != null;
				break;
			case OS_MODEL:
				this.objectName = "Common Elements";
				this.hasModel = model.getOsModel() != null;
				break;
			case PROPERTY_CONTRAINTS_MODEL:
				this.objectName = "Common Elements";
				this.hasModel = model.getPropertyConstraintsModel() != null;
				break;
			default:
				this.objectName = "(Wrong Model Type)";
				return false;

		}

		return true;

	}

	/**
	 * Check that the specification is fullfilled.
	 *
	 * @param logger
	 *            logger to log possible error/warnings.
	 * @return true if model fullfills the specification and false otherwise
	 */
	@Override
	protected boolean checkSpec(final Amalthea model) throws Exception {

		parseElements(model);

		if (!this.hasModel) {
			log("Missing " + this.objectName);
		}

		return this.hasModel;

	}

	/**
	 * Set the logging severity
	 *
	 * @param severity
	 *            logging severity
	 * @return the same spec object
	 */
	public ModelSpecHasModelType setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
