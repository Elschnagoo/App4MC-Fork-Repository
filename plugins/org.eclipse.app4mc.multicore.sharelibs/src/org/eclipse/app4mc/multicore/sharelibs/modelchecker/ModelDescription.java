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

package org.eclipse.app4mc.multicore.sharelibs.modelchecker;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.sharelibs.ConsoleOutputHandler;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverity;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.ModelSpecLogger;
import org.eclipse.emf.common.util.URI;

public class ModelDescription {
	/**
	 * Logger.
	 */
	protected ModelSpecLogger logger = new ModelSpecLogger();
	/**
	 * Specs to be checked.
	 */
	protected final List<ModelSpec> specs = new ArrayList<ModelSpec>();
	/**
	 * Model name.
	 */
	protected String name;
	/**
	 * Fail severity for the model desciption
	 */
	private EntrySeverity failSeverity = EntrySeverity.of(EntrySeverityLevel.ERROR);

	/**
	 * Model description builder.
	 *
	 * @return created model description
	 */
	public static ModelDescription builder() {
		return new ModelDescription();
	}

	/**
	 * Model description builder.
	 *
	 * @param logger
	 *            logger
	 * @return created model description
	 */
	public static ModelDescription builder(final ModelSpecLogger logger) {
		return builder(logger, null);
	}


	/**
	 * Model description builder.
	 *
	 * @param name
	 *            of the description
	 * @return created model description
	 */
	public static ModelDescription builder(final String name) {
		return builder(null, name);
	}

	/**
	 * Model description builder.
	 *
	 * @param logger
	 *            logger
	 * @param name
	 *            of the description
	 * @return created model description
	 */
	public static ModelDescription builder(final ModelSpecLogger logger, final String name) {
		final ModelDescription modelDesc = new ModelDescription();

		if (logger != null) {
			modelDesc.logger = logger;
		}

		if (name != null) {
			modelDesc.name = name;
		}

		return modelDesc;
	}

	/**
	 * Check the model.
	 *
	 * @param uri
	 *            model resource uri
	 * @return true if model fulfills all specs, false otherwise
	 */
	public boolean checkModel(final URI uri) {
		UniversalHandler.getInstance().dropCache();
		UniversalHandler.getInstance().readModels(uri, true);

		return checkModel(uri.toPlatformString(true), UniversalHandler.getInstance().getCentralModel());
	}

	/**
	 * Check the model.
	 *
	 * @param uri
	 *            model resource uri
	 * @return true if model fulfills all specs, false otherwise
	 */
	public boolean checkModel(final String resource, final Amalthea model) {
		boolean checkOk = true;
		EntrySeverity severtiy;

		// For every spec
		for (final ModelSpec spec : this.specs) {
			// Check the spec
			try {
				severtiy = spec.checkSpec(resource, model);

				// Compare the severity of the spec with the failing
				checkOk &= severtiy.compareTo(this.failSeverity) < 0;
			}
			catch (final Exception e) {
				spec.log("Unable to check spec \"" + spec.getName() + "\" because a " + e.toString()
						+ " was encountered.");

				severtiy = EntrySeverity.of(spec.getSeverityLevel());

				// Compare the severity of the spec with the failing
				checkOk &= severtiy.compareTo(this.failSeverity) < 0;


			}
		}

		return checkOk;
	}


	/**
	 * Check the model.
	 *
	 * @param model
	 *            model to be checked
	 * @return true if model fulfills all specs, false otherwise
	 */
	public boolean checkModel(final Amalthea model) {
		return checkModel("", model);
	}

	/**
	 * Log to view
	 */
	public void logToView() {
		this.logger.logToView();
	}

	/**
	 * Open Message box
	 */
	public void openMessageBox() {
		this.logger.openMessageBox();
	}

	/**
	 * Add spec to the model checker.
	 *
	 * @param spec
	 *            spec to be added.
	 * @return model checker instance.
	 */
	public ModelDescription addSpec(final ModelSpec spec) {
		this.specs.add(spec);

		spec.setLogger(this.logger);

		return this;
	}

	/**
	 * Log errors to console.
	 *
	 * @param con
	 *            console to log to
	 */
	public void logToConsole(final ConsoleOutputHandler con) {

		if (this.name == null) {
			con.appendln(" +- Model Checker Error/Warning log.");
		}
		else {
			con.appendln(" +- Model Checker (" + this.name + ") Error/Warning log.");
		}

		this.logger.logToConsole(con);
		con.appendln(" +- Log Finish");
	}

	/**
	 * Print log
	 */
	public void printLog() {
		if (this.name == null) {
			System.out.println(" +- Model Checker Error/Warning log.");
		}
		else {
			System.out.println(" +- Model Checker (" + this.name + ") Error/Warning log.");
		}
		this.logger.printLog();
		System.out.println(" +- Log Finish");
	}

	/**
	 * Set fail severity level
	 *
	 * @param severity
	 *            maximum sevel severity allowed for the specs to have without
	 *            failing the model check
	 *
	 * @return model checker instance.
	 */
	public ModelDescription setFailSeverityLevel(final EntrySeverityLevel severity) {
		this.failSeverity = EntrySeverity.of(severity);

		return this;
	}

	/**
	 * Set the model description's logger
	 *
	 * @param logger
	 * @return
	 */
	public ModelDescription setLogger(final ModelSpecLogger logger) {
		this.logger = logger;

		for (final ModelSpec spec : this.specs) {
			spec.setLogger(logger);
		}

		return this;
	}

	/**
	 * Concat the log of the current model description to an already existing
	 * model description
	 *
	 * @param modelDesc
	 *            already existing model description
	 * @return model description object
	 */
	public ModelDescription concatLog(final ModelDescription modelDesc) {
		setLogger(modelDesc.logger);
		return this;
	}


}
