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
package org.eclipse.app4mc.amalthea.converters.ui.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.jdom2.Document;

public class MigrationSettings {

	private List<MigrationInputFile> migModelFiles = new ArrayList<MigrationInputFile>();

	private String inputModelVersion;

	/*- default value should be the latest version */
	private String migrationModelVersion;

	private String outputDirectoryLocation;

	private File project;

	private IProject iProject;

	public File getProject() {
		return this.project;
	}

	public void setProject(final File project) {
		this.project = project;
		if (this.project != null) {
			setOutputDirectoryLocation(this.project.getAbsolutePath() + File.separator + "_migration");
		}
	}

	public String getOutputDirectoryLocation() {
		return this.outputDirectoryLocation;
	}

	public void setOutputDirectoryLocation(final String outputDirectoryLocation) {
		this.outputDirectoryLocation = outputDirectoryLocation;
	}

	public List<MigrationInputFile> getMigModelFiles() {
		return this.migModelFiles;
	}

	public void setMigModelFiles(final List<MigrationInputFile> migModelFiles) {
		this.migModelFiles = migModelFiles;
	}

	public String getInputModelVersion() {
		return this.inputModelVersion;
	}

	public void setInputModelVersion(final String inputModelVersion) {
		this.inputModelVersion = inputModelVersion;
	}

	public String getMigrationModelVersion() {
		return this.migrationModelVersion;
	}

	public void setMigrationModelVersion(final String migrationModelVersion) {
		this.migrationModelVersion = migrationModelVersion;
	}

	public Map<File, Document> getMigModelFilesMap() {

		final Map<File, Document> migModelsMap = new HashMap<File, Document>();

		for (final MigrationInputFile migModelFile : this.migModelFiles) {
			migModelsMap.put(migModelFile.getFile(), migModelFile.getDocument());
		}
		return migModelsMap;
	}

	public IProject getiProject() {
		return this.iProject;
	}

	public void setiProject(final IProject iProject) {
		this.iProject = iProject;
	}


}
