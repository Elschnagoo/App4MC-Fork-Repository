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
package org.eclipse.app4mc.multicore.openmapping.handlers;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractMappingAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;

public class PerformMappingJob extends Job {
	final private AbstractMappingAlgorithm mappingAlgorithm;
	final private URI pathSwModel;
	final private URI pathHwModel;
	// final private URI pathPcModel;
	// final private URI pathOsModel;
	// final private URI pathMmModel;
	final private URI path;
	private SWModel swModel;
	private PropertyConstraintsModel pcModel;
	private HWModel hwModel;
	private OSModel osModel;
	private MappingModel mmModel;
	private ConstraintsModel conModel;


	/**
	 *
	 * @param mappingAlgorithm
	 * @param pathSwModel
	 * @param pathPcModel
	 *            Path to Property Constraints Model (reserved for future usage)
	 * @param pathHwModel
	 * @param pathOsModel
	 * @param pathMmModel
	 */
	// public PerformMappingJob(final AbstractMappingAlgorithm mappingAlgorithm, final URI pathSwModel,
	// final URI pathPcModel, final URI pathHwModel, final URI pathOsModel, final URI pathMmModel) {
	public PerformMappingJob(final AbstractMappingAlgorithm mappingAlgorithm, final URI pathSwModel,
			final URI pathPcModel, final URI pathHwModel, final URI path) {
		super("ILP Job");
		this.mappingAlgorithm = mappingAlgorithm;
		this.pathSwModel = pathSwModel;
		// this.pathPcModel = pathPcModel;
		this.pathHwModel = pathHwModel;
		// this.pathOsModel = pathOsModel;
		// this.pathMmModel = pathMmModel;
		this.path = path;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
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

	private boolean readModels() {
		// Read models
		UniversalHandler.getInstance().readModels(this.pathSwModel, true);
		if ((this.swModel = UniversalHandler.getInstance().getSwModel()) == null) {
			UniversalHandler.getInstance()
					.logCon("There seems to be no software model in the specified file.\nExiting...");
			return false;
		}
		if ((this.conModel = UniversalHandler.getInstance().getConstraintsModel()) == null) {
			UniversalHandler.getInstance()
					.logCon("There seems to be no software model in the specified file.\nExiting...");
			return false;
		}
		// Check for the PC model after the Sw model, note that this check is
		// against NOT null!
		if ((this.pcModel = UniversalHandler.getInstance().getPropertyConstraintsModel()) != null) {
			this.mappingAlgorithm.setPropertyConstraintsModel(this.pcModel);
			UniversalHandler.getInstance().logCon("PropertyConstraints Model set.");
		}
		UniversalHandler.getInstance().readModels(this.pathHwModel, true);
		if ((this.hwModel = UniversalHandler.getInstance().getHwModel()) == null) {
			UniversalHandler.getInstance()
					.logCon("There seems to be no hardware model in the specified file.\nExiting...");
			return false;
		}

		// Prepare mapping algorithm and start the calculation
		this.mappingAlgorithm.setSwModel(this.swModel);
		this.mappingAlgorithm.setHwModel(this.hwModel);
		this.mappingAlgorithm.setConnstraintsModel(this.conModel);
		return true;
	}

	private boolean solve() {
		this.mappingAlgorithm.calculateMapping();
		return true;
	}

	private boolean writeModels() {
		if ((this.osModel = this.mappingAlgorithm.getOsModel()) == null) {
			UniversalHandler.getInstance().logCon("An error occured during the OSModel creation process");
			UniversalHandler.getInstance().logCon("Check the error logs for further details");
			return false;
		}

		if ((this.mmModel = this.mappingAlgorithm.getMappingModel()) == null) {
			UniversalHandler.getInstance().logCon("An error occured during the mapping creation process");
			UniversalHandler.getInstance().logCon("Check the error logs for further details");
			return false;
		}

		final Amalthea cen = AmaltheaFactory.eINSTANCE.createAmalthea();
		cen.setCommonElements(UniversalHandler.getInstance().getCommonElements());
		cen.setSwModel(UniversalHandler.getInstance().getSwModel());
		cen.setHwModel(UniversalHandler.getInstance().getHwModel());
		cen.setConstraintsModel(UniversalHandler.getInstance().getConstraintsModel());
		cen.setStimuliModel(UniversalHandler.getInstance().getStimuliModel());
		
		cen.setMappingModel(this.mmModel);
		cen.setOsModel(this.osModel);

		UniversalHandler.getInstance().writeModel(this.path, cen);
		// UniversalHandler.getInstance().writeModel(this.pathMmModel, this.mmModel);
		return true;
	}
}
