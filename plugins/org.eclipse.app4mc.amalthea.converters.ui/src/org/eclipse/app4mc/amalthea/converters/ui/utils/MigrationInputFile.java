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
