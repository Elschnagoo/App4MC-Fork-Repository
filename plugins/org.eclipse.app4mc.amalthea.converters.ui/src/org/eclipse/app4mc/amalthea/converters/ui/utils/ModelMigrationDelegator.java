/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.eclipse.app4mc.amalthea.converters.ui.jobs.ModelMigrationJob;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ModelMigrationDelegator {

	private MigrationSettings migrationSettings;
	private Logger logger;
	private FileAppender fileAppender;
	
	public ModelMigrationDelegator(MigrationSettings migrationSettings,Logger logger) {
		this.migrationSettings = migrationSettings;
		this.logger = logger;
		initializeFileAppender();
	}
	
	public ModelMigrationDelegator(MigrationSettings migrationSettings,Logger logger,FileAppender fileAppender) {
		this.migrationSettings = migrationSettings;
		this.logger = logger;
		this.fileAppender = fileAppender;
	}
	public void execute() {
		
		/*
		 * Performs the model migration and listens to the job completion to inform if model migratin status to user
		 */
				
		ModelMigrationJob migrationJob = new ModelMigrationJob("AMALTHEA Model Migration", this.migrationSettings);
		
		migrationJob.setUser(true);

		migrationJob.schedule();

		migrationJob.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				super.done(event);
				final IStatus result = event.getResult();

				if (result.getCode() == IMigrationStatus.UNSUPPORTED_MODEL_VERSIONS) {

					Display.getDefault().asyncExec(new Runnable() {

						@Override
						public void run() {

							final Shell shell = new Shell(Display.getDefault());

							MessageDialog.openError(shell, "AMALTHEA Model Migration", event.getResult().getMessage());

						}
					});

				} else if (result.getCode() == IMigrationStatus.ERROR) {

					Display.getDefault().asyncExec(new Runnable() {

						@Override
						public void run() {
							final Shell shell = new Shell(Display.getDefault());

							ErrorDialog.openError(shell, "AMALTHEA Model Migration", event.getResult().getMessage(),
									event.getResult());
						}
					});

				} else if (result.equals(Status.OK_STATUS)) {

					Display.getDefault().asyncExec(new Runnable() {

						@Override
						public void run() {
							final Shell shell = new Shell(Display.getDefault());

							MessageDialog.openInformation(shell, "AMALTHEA Model Migration",
									"Model Migration successful !!");

							try {
								getMigrationSettings().getiProject().refreshLocal(IResource.DEPTH_INFINITE,
										new NullProgressMonitor());
							} catch (final CoreException e) {
								getLogger().error(e.getMessage(), e);
							}

						}
					});

				}

				if (getFileAppender() != null) {
					getFileAppender().close();
					getLogger().removeAppender(getFileAppender());
				}

			}

		});
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
	
	public Logger getLogger() {
		return this.logger;
	}
	
	private void initializeFileAppender() {
		if(this.fileAppender == null) {
			final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
			final String dateToStr = format.format(new Date());

			final File modelMigrationLogFile = new File(
					this.getMigrationSettings().getOutputDirectoryLocation(),
					"ModelMigration__" + dateToStr + ".log");
			try {
				setFileAppender(new FileAppender(new PatternLayout("%d{yyyy-MM-dd_HH_mm_ss} - %-5p:  %m%n"),
						modelMigrationLogFile.getAbsolutePath(), false));

				getFileAppender().addFilter(new Filter() {

					@Override
					public int decide(final LoggingEvent event) {

						if (event.getLevel() == Level.TRACE) {
							/*-For developers: By changing the return value to Filter.ACCEPT -> TRACE log entries  will also be generated into the Log file*/

							return Filter.DENY;
						}
						return Filter.ACCEPT;
					}
				});
				this.logger.addAppender(getFileAppender());

			}
			catch (final IOException e1) {
				this.logger.error("Unable to add FileAppender for model migration logger"
						+ modelMigrationLogFile.getAbsolutePath(), e1);
			}
		}
	}
}
