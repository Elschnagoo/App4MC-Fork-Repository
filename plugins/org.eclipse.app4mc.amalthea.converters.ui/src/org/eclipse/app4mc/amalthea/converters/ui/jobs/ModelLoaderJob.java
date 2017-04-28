/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters.ui.jobs;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationInputFile;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationSettings;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;

public class ModelLoaderJob extends Job {

	private final MigrationSettings migrationSettings;
	private final List<File> inputModels;
	private final AbstractHelper helper;
	private final Logger logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");

	public ModelLoaderJob(final String name, final MigrationSettings migrationSettings, final List<File> inputModels,
			final AbstractHelper helper) {
		super(name);
		this.migrationSettings = migrationSettings;
		this.inputModels = inputModels;
		this.helper = helper;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {


		final int size = this.inputModels.size();

		final SubMonitor subMonitor = SubMonitor.convert(monitor, size);

		final Map<File, MigrationInputFile> modelFilesMap = new HashMap<File, MigrationInputFile>();

		subMonitor.setTaskName("Loading selected model files ...");

		try {
			populateModels(modelFilesMap, this.inputModels, subMonitor);
		}
		catch (final Exception e1) {

			this.logger.error(e1.getMessage(), e1);

			return new Status(IStatus.CANCEL, "unknown", 1, e1.getMessage(), e1);
		}


		/*
		 * for (final File file : this.inputModels) {
		 *
		 * subMonitor.setTaskName("Loading file :  " + file.getAbsolutePath());
		 *
		 * try { populateModels(modelFilesMap, file, false);
		 *
		 * }
		 *
		 * catch (final Exception e) {
		 *
		 * return new Status(IStatus.CANCEL, "unknown", 1, e.getMessage(), e); }
		 *
		 * subMonitor.worked(1); }
		 */


		this.migrationSettings.getMigModelFiles().addAll(modelFilesMap.values());

		return Status.OK_STATUS;

	}


	private void populateModels(final Map<File, MigrationInputFile> modelFilesMap, final List<File> inputModelFiles,
			final SubMonitor subMonitor) throws Exception {

		final Map<File, Document> loaded_documents_map = new HashMap<File, Document>();

		for (final File file : inputModelFiles) {

			this.helper.buildXMLDocumentsMap(file, loaded_documents_map);

			subMonitor.worked(1);
		}

		final Set<File> filesForMigration = loaded_documents_map.keySet();

		for (final File inputFile : filesForMigration) {

			final Document xmlDocument = loaded_documents_map.get(inputFile);

			final MigrationInputFile migModelFile = new MigrationInputFile(this.migrationSettings);

			migModelFile.setFile(inputFile);

			/*- below line of code is used to identify if the model file is selected  by the user */
			migModelFile.setSelectedFile(inputModelFiles.contains(inputFile));

			migModelFile.setDocument(xmlDocument);

			setModelFileVersion(migModelFile, xmlDocument);

			modelFilesMap.put(inputFile, migModelFile);
		}

	}

	@Deprecated
	void populateModels(final Map<File, MigrationInputFile> modelFilesMap, final File inputFile,
			final boolean isRefFileAndNotSelected) throws Exception {


		if (!modelFilesMap.containsKey(inputFile)) {

			final MigrationInputFile migModelFile = new MigrationInputFile(this.migrationSettings);

			migModelFile.setFile(inputFile);

			migModelFile.setSelectedFile(!isRefFileAndNotSelected);

			final Document xmlDocument = this.helper.loadFile(inputFile.getAbsolutePath());

			migModelFile.setDocument(xmlDocument);

			setModelFileVersion(migModelFile, xmlDocument);

			modelFilesMap.put(inputFile, migModelFile);

			final List<Attribute> hrefs = this.helper.getXpathResult(migModelFile.getDocument().getRootElement(),
					".//@href", Attribute.class);

			final Set<String> referredFilePaths = new HashSet<String>();

			for (final Attribute attribute : hrefs) {

				final String value = attribute.getValue();

				final int index = value.lastIndexOf("#");

				if (index != -1) {

					final String fileName = value.substring(0, index);

					referredFilePaths.add(fileName);

				}
			}

			for (final String relativePath : referredFilePaths) {

				if (relativePath != null && relativePath.length() > 0) {

					final File referredFile = new File(
							migModelFile.getFile().getParent() + File.separator + relativePath);

					if (!referredFile.exists()) {
						// TODO: log an error message
					}
					else {
						// canonical file is used to resolve
						final File canonicalFile = referredFile.getCanonicalFile();
						final boolean isRefFileSelected = this.inputModels.contains(canonicalFile);
						populateModels(modelFilesMap, canonicalFile, !isRefFileSelected);

					}
				}


			}
		}
	}

	private void setModelFileVersion(final MigrationInputFile migModelFile, final Document document) {
		final Element rootElement = document.getRootElement();
		final Namespace namespace = rootElement.getNamespace();

		if (this.helper.isNS_AvailableIn_103(namespace)) {
			migModelFile.setModelVersion("itea.103");
		}
		else if (this.helper.isNS_AvailableIn_110(namespace)) {
			migModelFile.setModelVersion("itea.110");
		}
		else if (this.helper.isNS_AvailableIn_111(namespace)) {
			migModelFile.setModelVersion("itea.111");
		}
		else if (this.helper.isNS_AvailableIn_070(namespace)) {
			migModelFile.setModelVersion("0.7.0");
		}
		else if (this.helper.isNS_AvailableIn_071(namespace)) {
			migModelFile.setModelVersion("0.7.1");
		}
		else if (this.helper.isNS_AvailableIn_072(namespace)) {
			migModelFile.setModelVersion("0.7.2");
		}
		else {
			migModelFile.setModelVersion("invalid");
		}
	}

	@Override
	public boolean belongsTo(final Object family) {

		if (family != null && family.equals(IMigrationJobConstants.FAMILY)) {
			return true;
		}

		return super.belongsTo(family);
	}
}
