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

package org.eclipse.app4mc.amalthea.converters.ui.jobs;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.FileAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationInputFile;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationSettings;
import org.eclipse.app4mc.amalthea.converters.ui.utils.ModelMigrationDelegator;
import org.eclipse.app4mc.amalthea.converters.ui.utils.ModelVersions;

import com.google.common.io.Files;

public class SimpleModelMigrationJob {

	private MigrationSettings migrationSettings;
	private Logger logger;
	private FileAppender fileAppender;

	public SimpleModelMigrationJob(final MigrationSettings migrationSettings) {
		this.migrationSettings = migrationSettings;
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	public void run() {

		// set the latest Amalthea version as the target version for migration		
		List<String> modelVersions = ModelVersions.get();
		Collections.reverse(modelVersions);
		migrationSettings.setMigrationModelVersion(modelVersions.get(0));
		
		// set the file parent folder as output location to convert the file at source
		MigrationInputFile migrationInputFile = migrationSettings.getMigModelFiles().get(0);
		File origFile = migrationInputFile.getFile();
		this.migrationSettings.setOutputDirectoryLocation(origFile.getParent());
		
		ModelMigrationDelegator migrationJob = new ModelMigrationDelegator(migrationSettings, logger);
		// Rename or copy the original file to filename_currentversion.amxmi
		boolean sourceFileBackup = false;
		String newFileName = getBackupFileName(migrationInputFile);
		try {
			String filebackupName = migrationInputFile.getFile().getParent() + File.separator + newFileName;
			Files.copy(origFile, new File(filebackupName));
			migrationJob.getLogger().info( "Original model file backedup as " + filebackupName
					+ System.getProperty("line.separator"));
			if (new File(filebackupName).exists()) {
				sourceFileBackup = true;
			}
		} catch (IOException e) {
			migrationJob.getLogger().error(e.getMessage(), e);
		} finally {
			// set the file parent folder as output location to convert the file at source
			migrationSettings.setOutputDirectoryLocation(origFile.getParent());
		}

		if (!sourceFileBackup) {
			// return as we couldnot backup source and this can data loss to user if he
			// doesnot intend to loose his original model file
			migrationJob.getLogger()
					.error( "Migration Stopped : Source file could not be backed up before migration"
							+ System.getProperty("line.separator"));
			return;
		}
		//now call migration job to migrate the file to latest Amlathea version
		migrationJob.execute();

	}

	public MigrationSettings getMigrationSettings() {
		return this.migrationSettings;
	}

	public FileAppender getFileAppender() {
		return this.fileAppender;
	}

	public void setFileAppender(final FileAppender fileAppender) {
		this.fileAppender = fileAppender;
	}

	private String getBackupFileName(MigrationInputFile migrationInputFile) {
		/*
		 * here we try to construct file name for the source file which should be backed
		 * up before migration. Intension is not to migrated the source file without
		 * making a copy of it. Source file name is
		 * <origfilename_withoutextension>_<input_amlatheaversion>.amxmi e.g.,
		 * model.axmi(orig) -> model_0.9.4.amxmi (new) if file name exists then append
		 * model version before extension e.g., model_0.9.4_0.9.4.amxi
		 */
		String fileName = migrationInputFile.getFile().getName();
		String newFileName = fileName.substring(0, fileName.lastIndexOf("."));
		String suffixString = "_" + migrationInputFile.getModelVersion();
		String fileExtension = ".amxmi";

		newFileName = newFileName + suffixString + fileExtension;
		// check if file with newly constructed name already exists then append model
		// version at end of name
		if (new File(migrationInputFile.getFile().getParent() + File.separator + newFileName).exists()) {
			newFileName.replace(suffixString + fileExtension, suffixString + suffixString + fileExtension);
		}

		return newFileName;
	}
}
