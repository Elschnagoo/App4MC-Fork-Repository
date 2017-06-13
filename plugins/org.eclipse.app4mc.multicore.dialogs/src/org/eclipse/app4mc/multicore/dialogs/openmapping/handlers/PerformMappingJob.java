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
package org.eclipse.app4mc.multicore.dialogs.openmapping.handlers;

import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractMappingAlgorithm;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;

public class PerformMappingJob extends Job {
	/**
	 * Mapping algorithm
	 */
	final private AbstractMappingAlgorithm mappingAlgorithm;
	/**
	 * Path to the Software model
	 */
	final private URI pathSwModel;
	/**
	 * Path to the Hardware model
	 */
	final private URI pathHwModel;
	/**
	 * Output path
	 */
	final private URI path;


	/**
	 * @param mappingAlgorithm
	 *            mapping algorithm
	 * @param pathSwModel
	 *            path to the Software model
	 * @param pathPcModel
	 *            path to Property Constraints Model (reserved for future usage)
	 * @param pathHwModel
	 *            path to the Hardware model
	 * @param path
	 *            path to the OS model
	 */
	public PerformMappingJob(final AbstractMappingAlgorithm mappingAlgorithm, final URI pathSwModel,
			final URI pathPcModel, final URI pathHwModel, final URI path) {
		super("Mapping Job");
		this.mappingAlgorithm = mappingAlgorithm;
		this.pathSwModel = pathSwModel;
		this.pathHwModel = pathHwModel;
		this.path = path;
	}

	/**
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		// Clear model checker view
		monitor.beginTask("Performing mapping...", 3);
		monitor.subTask("Reading models");
		if (!readModels()) {
			return Status.CANCEL_STATUS;
		}
		monitor.worked(1);
		monitor.subTask("Solving ILP model");
		if (!solve()) {
			return Status.CANCEL_STATUS;
		}
		monitor.worked(1);
		monitor.subTask("Writing models");
		if (!writeModels()) {
			return Status.CANCEL_STATUS;
		}
		monitor.worked(1);
		monitor.done();
		return Status.OK_STATUS;
	}

	/**
	 * Read all the models
	 *
	 * @return true when no errors occur and false otherwise
	 */
	private boolean readModels() {
		// Read models
		UniversalHandler.getInstance().readModels(this.pathSwModel, true);
		if (UniversalHandler.getInstance().getSwModel() == null) {
			UniversalHandler.getInstance()
					.logCon("There seems to be no software model in the specified file.\nExiting...");
			return false;
		}
		if (UniversalHandler.getInstance().getConstraintsModel() == null) {
			UniversalHandler.getInstance()
					.logCon("There seems to be no software model in the specified file.\nExiting...");
			return false;
		}
		if (UniversalHandler.getInstance().getStimuliModel() == null) {
			UniversalHandler.getInstance()
					.logCon("There seems to be no stimulation model in the specified file.\nExiting...");
			return false;
		}
		// Non-mandatory Models, note that this check is against NOT null!
		if (UniversalHandler.getInstance().getCommonElements() != null) {
			UniversalHandler.getInstance().logCon("CommonElements Model set.");
		}
		if (UniversalHandler.getInstance().getPropertyConstraintsModel() != null) {
			UniversalHandler.getInstance().logCon("PropertyConstraints Model set.");
		}
		this.mappingAlgorithm.setAmaltheaSwModel(UniversalHandler.getInstance().getCentralModel());

		UniversalHandler.getInstance().dropCache();
		UniversalHandler.getInstance().readModels(this.pathHwModel, true);
		if (UniversalHandler.getInstance().getHwModel() == null) {
			UniversalHandler.getInstance()
					.logCon("There seems to be no hardware model in the specified file.\nExiting...");
			return false;
		}
		this.mappingAlgorithm.setAmaltheaHwModel(UniversalHandler.getInstance().getCentralModel());

		return true;
	}

	/**
	 * Perform the actual mapping algorithm
	 *
	 * @return true when no errors occur and false otherwise
	 */
	private boolean solve() {
		this.mappingAlgorithm.calculateMapping();
		return true;
	}

	/**
	 * Write models to a file
	 *
	 * @return true when no errors occur and false otherwise
	 */
	private boolean writeModels() {
		if (this.mappingAlgorithm.getAmaltheaOutputModel().getOsModel() == null) {
			UniversalHandler.getInstance().logCon("An error occured during the OSModel creation process");
			UniversalHandler.getInstance().logCon("Check the error logs for further details");
			return false;
		}

		if (this.mappingAlgorithm.getAmaltheaOutputModel().getMappingModel() == null) {
			UniversalHandler.getInstance().logCon("An error occured during the mapping creation process");
			UniversalHandler.getInstance().logCon("Check the error logs for further details");
			return false;
		}

		UniversalHandler.getInstance().logCon(this.path.toString());
		UniversalHandler.getInstance().writeModel(this.path, this.mappingAlgorithm.getAmaltheaOutputModel());
		return true;
	}
}
