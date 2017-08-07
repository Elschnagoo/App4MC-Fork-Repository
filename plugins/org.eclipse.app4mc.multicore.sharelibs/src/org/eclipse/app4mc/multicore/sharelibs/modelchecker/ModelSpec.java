/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/
package org.eclipse.app4mc.multicore.sharelibs.modelchecker;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverity;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.LoggerEntry;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.ModelSpecLogger;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.specs.ModelSpecAmount;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.specs.ModelSpecHasModelType;

public abstract class ModelSpec {
	/**
	 * Logging level of the spec.
	 */
	protected EntrySeverityLevel severity;
	/**
	 * Logger.
	 */
	private ModelSpecLogger logger;
	/**
	 * Spec type.
	 */
	protected String specType;
	/**
	 * currResource.
	 */
	protected String currResource;
	/**
	 * Spec's name.
	 */
	protected String name;

	/**
	 * Amount spec creator.
	 *
	 * @return amount spec
	 */
	public static ModelSpecAmount ofAmount(final ModelSpecAmountType type) {
		return new ModelSpecAmount(type);
	}

	/**
	 * Amount spec creator.
	 *
	 * @return amount spec
	 */
	public static ModelSpecHasModelType ofHasModel(final ModelSpecModelType type) {
		return new ModelSpecHasModelType(type);
	}

	/**
	 * Check the model.
	 *
	 * @param resourceName
	 *            resouce name to be displayed in the resource row
	 * @param model
	 *            model
	 * @return true if model fulfills all specs, false otherwise
	 * @throws Exception
	 */
	public EntrySeverity checkSpec(final String resourceName, final Amalthea model) throws Exception {
		// Set the resource temporarly
		this.currResource = resourceName;

		final boolean modelOk = checkSpec(model);

		EntrySeverity ret;

		if (modelOk) {
			ret = EntrySeverity.of(EntrySeverityLevel.OK);
		}
		else {
			ret = EntrySeverity.of(this.severity);
		}

		this.currResource = "";

		return ret;

	}


	/**
	 * Check the model.
	 *
	 * @param model
	 *            model
	 * @return true if model fulfills all specs, false otherwise
	 * @throws Exception
	 */
	protected abstract boolean checkSpec(final Amalthea model) throws Exception;

	/**
	 * Get the logger.
	 *
	 * @return logger
	 */
	protected ModelSpecLogger getLogger() {
		return this.logger;
	}

	/**
	 * Set the logger.
	 *
	 * @param logger
	 *            logger
	 */
	protected void setLogger(final ModelSpecLogger logger) {
		this.logger = logger;
	}

	/**
	 * @param message
	 */
	protected void log(final String message) {
		assert this.logger != null : "ERROR: Spec without error logger";

		if (this.severity.ordinal() <= EntrySeverityLevel.OK.ordinal()) {
			return;
		}

		this.logger.addEntry(LoggerEntry.builder()
				// Logging severity
				.setSeverity(EntrySeverity.of(this.severity))
				// Message
				.setMessage(message)
				// Resource
				.setResource(this.currResource)
				// Type
				.setType(this.specType));

	}

	/**
	 * Get spec's name.
	 *
	 * @return spec's name.
	 */
	protected String getName() {
		return this.name;
	}

	/**
	 * Get spec's severity
	 *
	 * @return spec's severity
	 */
	protected EntrySeverityLevel getSeverityLevel() {
		return this.severity;
	}

}
