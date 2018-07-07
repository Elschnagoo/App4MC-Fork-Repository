/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters.ui.utils;

import java.io.File;

import org.jdom2.Document;

public class MigrationInputFile {

	private boolean isSelectedFile;

	private String modelVersion = "";

	private Document document;

	private final MigrationSettings migrationSettings;


	public MigrationInputFile(final MigrationSettings migrationSettings) {
		this.migrationSettings = migrationSettings;
	}

	public MigrationSettings getMigrationSettings() {
		return this.migrationSettings;
	}


	/*- this field is used to mark ModelFiles, if they have different versions than other files */
	private boolean isVersionDifferent;

	public boolean isVersionDifferent() {
		return this.isVersionDifferent;
	}

	public void setVersionDifferent(final boolean isVersionDifferent) {
		this.isVersionDifferent = isVersionDifferent;
	}

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setModelVersion(final String modelVersion) {
		this.modelVersion = modelVersion;
	}

	private File file;

	public boolean isSelectedFile() {
		return this.isSelectedFile;
	}

	public void setSelectedFile(final boolean isSelectedFile) {
		this.isSelectedFile = isSelectedFile;
	}

	public File getFile() {
		return this.file;
	}

	public void setFile(final File file) {
		this.file = file;
	}

	public Document getDocument() {
		return this.document;
	}

	public void setDocument(final Document document) {
		this.document = document;
	}


}
