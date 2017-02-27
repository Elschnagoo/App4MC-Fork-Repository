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
package org.eclipse.app4mc.multicore.dialogs.wizards;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.workflow.core.DefaultContext;
import org.eclipse.app4mc.multicore.dialogs.DialogsPlugin;
import org.eclipse.app4mc.multicore.dialogs.IDialogsConstants;
import org.eclipse.app4mc.multicore.dialogs.wizards.page.FlowPage;
import org.eclipse.app4mc.multicore.dialogs.wizards.page.MappingPage;
import org.eclipse.app4mc.multicore.dialogs.wizards.page.PartitioningPage;
import org.eclipse.app4mc.multicore.dialogs.wizards.page.SummaryPage;
import org.eclipse.app4mc.multicore.dialogs.wizards.page.TaskCreationPage;
import org.eclipse.app4mc.multicore.openmapping.IOMConstants;
import org.eclipse.app4mc.multicore.openmapping.workflow.CreateTasks;
import org.eclipse.app4mc.multicore.openmapping.workflow.GenerateMapping;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.app4mc.multicore.partitioning.algorithms.PerformPartitioning;
import org.eclipse.app4mc.multicore.partitioning.workflow.GeneratePartitioning;
import org.eclipse.app4mc.multicore.partitioning.workflow.PrePartitioningWrkflw;
import org.eclipse.app4mc.multicore.sharelibs.OutputPathParser;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class MulticoreWizard extends AbstractWizard implements INewWizard {
	/**
	 * Preference store to use
	 */
	private final IPreferenceStore store;
	/**
	 * Selected file
	 */
	private IFile selectedFile;
	/**
	 * Input result slot for amalthea model
	 */
	final static protected String AMALTHEA_SLOT = "amalthea";

	/**
	 * Constructor for MulticoreWizard.
	 */
	public MulticoreWizard() {
		super();

		this.store = DialogsPlugin.getDefaultPreferenceStore();

		setForcePreviousAndNextButtons(true);
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {

		// Add just flow page
		addPage(new FlowPage(this.store));
		addPage(new PartitioningPage(this.store));
		addPage(new TaskCreationPage(this.store));
		addPage(new MappingPage(this.store));
		addPage(new SummaryPage(this.store));

		setForcePreviousAndNextButtons(true);
	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizard#performFinish()
	 */
	@Override
	public boolean performFinish() {

		final DefaultContext ctx = new DefaultContext();
		boolean success = true;

		success &= store();

		UniversalHandler.getInstance()
				.readModels(URI.createPlatformResourceURI(this.selectedFile.getFullPath().toString(), true), true);

		ctx.set(AMALTHEA_SLOT, UniversalHandler.getInstance().getCentralModel());

		if (this.store.getBoolean(IDialogsConstants.PRE_CHECK_PARTITIONING)) {

			final PrePartitioningWrkflw prePartWF = new PrePartitioningWrkflw();
			final GeneratePartitioning PartWF = new GeneratePartitioning();

			// Configure the prepartitioning
			prePartWF.setAa(this.store.getBoolean(IParConstants.PRE_ACTIVATION));
			prePartWF.setEffEdge(this.store.getBoolean(IParConstants.PRE_EFF_EDGE));
			prePartWF.setGgp(this.store.getBoolean(IParConstants.PRE_GGP));
			prePartWF.setMinimEdge(this.store.getBoolean(IParConstants.PRE_MIN_EDGES));

			// Run prepartitioning
			prePartWF.run(ctx);

			// Configure the partitioning
			PartWF.setModelLoc(this.selectedFile.getFullPath().toString());
			PartWF.setNumberOfPartitions((new Integer(this.store.getInt(IParConstants.PRE_INT))).toString());

			switch (this.store.getString(IParConstants.PRE_PARTITIONING_ALG)) {
				case PerformPartitioning.PART_ESSP:
					PartWF.setPartitioningAlg(GeneratePartitioning.PARTITIONING_ESSP);
					break;
				case PerformPartitioning.PART_CPP:
					PartWF.setPartitioningAlg(GeneratePartitioning.PARTITIONING_CPP);
					break;
				default:
					break;
			}

			// Run Partitioning
			PartWF.run(ctx);

			// Update context with newer model
			ctx.set(AMALTHEA_SLOT, ctx.get(PartWF.getResultSlot()));
		}

		if (this.store.getBoolean(IDialogsConstants.PRE_CHECK_CREATE_TASKS)) {
			final CreateTasks createTask = new CreateTasks();

			createTask.setEnableLog(this.store.getBoolean(IOMConstants.PRE_CHECK_LOGCON));

			createTask.run(ctx);

			// Update context with newer model
			ctx.set(AMALTHEA_SLOT, ctx.get(createTask.getResultSlot()));

		}

		if (this.store.getBoolean(IDialogsConstants.PRE_CHECK_MAPPING)) {
			final Amalthea model = (Amalthea) ctx.get(AMALTHEA_SLOT);
			final GenerateMapping mapping = new GenerateMapping();
			final String hwModelPath = this.store.getString(IDialogsConstants.PRE_HW_MODEL_LOCATION);

			UniversalHandler.getInstance().readModels(URI.createFileURI(hwModelPath), true);

			// Set HW Model
			model.setHwModel(UniversalHandler.getInstance().getHwModel());

			// Update model
			ctx.set(AMALTHEA_SLOT, model);

			// Configure Mapping
			mapping.setStore(this.store);

			// Run Mapping
			mapping.run(ctx);

			// Update context with newer model
			ctx.set(AMALTHEA_SLOT, ctx.get(mapping.getResultSlot()));

		}

		// Now write the model
		final OutputPathParser outputParser = new OutputPathParser(IDialogsConstants.PRE_OUTPUT_PATH_RADIO,
				IDialogsConstants.PRE_OUTPUT_PATH, this.store);

		final URI path = outputParser.parseOutputFileURI(this.selectedFile, "_wizard");

		UniversalHandler.getInstance().logCon("Writing model to: " + path.toString());

		// Try because if tasks were not created it might fail
		try {
			// Finally Write the model
			UniversalHandler.getInstance().writeModel(path, (Amalthea) ctx.get(AMALTHEA_SLOT));
		}
		catch (final IllegalArgumentException e) {
			e.printStackTrace();
		}

		return success;
	}

	/**
	 * Get append of partitioning algorithm to the original file
	 *
	 * @return append of partitioning algorithm
	 */
	public String getPartitioningAppend() {

		switch (this.store.getString(IParConstants.PRE_PARTITIONING_ALG)) {
			case PerformPartitioning.PART_ESSP:
				return "_ESSP";
			case PerformPartitioning.PART_CPP:
				return "_CPP";
			default:
				break;
		}

		if (this.store.getBoolean(IParConstants.PRE_TA)) {
			return "_TAInput";
		}

		return null;
	}

	/**
	 * Get output file path
	 *
	 * @param outputDir
	 *            output directory
	 * @param append
	 *            custom append to file
	 * @return URI of the output file
	 */
	public String getOutputFileName(final String append) {
		return this.selectedFile.getName().toString().replace("." + IOMConstants.EXTENSION,
				append + "." + IOMConstants.EXTENSION);
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(final IWorkbench workbench, final IStructuredSelection selection) {

		if (selection.getFirstElement() instanceof IFile) {
			this.selectedFile = (IFile) selection.getFirstElement();
		}

		// If selected model includes hardware model set the value
		UniversalHandler.getInstance().readModels(URI.createFileURI(this.selectedFile.getLocation().toString()), true);

		if (UniversalHandler.getInstance().getHwModel() != null) {
			this.store.setValue(IDialogsConstants.PRE_HW_MODEL_LOCATION, this.selectedFile.getLocation().toString());
		}

	}
}