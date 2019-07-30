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

package org.eclipse.app4mc.amalthea.converters.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.eclipse.app4mc.amalthea.converters.common.utils.BaseHelperUtils;
import org.eclipse.app4mc.amalthea.converters.ui.dialog.MigrationErrorDialog;
import org.eclipse.app4mc.amalthea.converters.ui.dialog.ModelMigrationDialog;
import org.eclipse.app4mc.amalthea.converters.ui.jobs.ModelLoaderJob;
import org.eclipse.app4mc.amalthea.converters.ui.jobs.SimpleModelMigrationJob;
import org.eclipse.app4mc.amalthea.converters.ui.log.utils.CustomEclipseLogAppender;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationInputFile;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationSettings;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class AmaltheaModelMigrationHandler extends AbstractModelConverterHandler {

	private MigrationSettings migrationSettings;

	private final String LATEST_MODEL_VERSION = "0.9.5";
	
	private final String SIMPLE_MIGRATION = "simplemigration";

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");

		this.logger.removeAllAppenders();

		final CustomEclipseLogAppender customEclipseLogAppender = new CustomEclipseLogAppender();

		customEclipseLogAppender.addFilter(new Filter() {

			@Override
			public int decide(final LoggingEvent event) {

				final Level level = event.getLevel();

				if (level == Level.INFO || level == Level.TRACE) {
					return Filter.DENY;
				}
				return Filter.ACCEPT;
			}
		});

		this.logger.addAppender(customEclipseLogAppender);

		this.logger.setAdditivity(false);

		this.logger.setLevel(Level.ALL);

		this.migrationSettings = new MigrationSettings();


		final Shell activeShell = HandlerUtil.getActiveShell(event);

		final ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);

		this.helper = BaseHelperUtils.getInstance();

		String projectSegment = null;

		if (selection instanceof TreeSelection) {

			final TreePath[] paths = ((TreeSelection) selection).getPaths();

			final List<File> inputModels = new ArrayList<File>();


			for (final TreePath treePath : paths) {

				final Object firstSegment = treePath.getFirstSegment();

				if (projectSegment == null) {
					projectSegment = firstSegment.toString();

					final IProject iProject = ((IAdaptable) firstSegment).getAdapter(IProject.class);

					if (iProject != null) {

						final String path = iProject.getLocation().toOSString();

						final File file = new File(path);
						
						this.migrationSettings.setProject(file); //,isSimpleMigration(event));											

						this.migrationSettings.setiProject(iProject);


					}

				}
				else if (!projectSegment.equals(firstSegment.toString())) {
					MessageDialog.openError(activeShell, "AMALTHEA Model Migration",
							"Model files across the projects should not be selected for migration");
					return null;
				}

				final Object lastSegment = treePath.getLastSegment();

				if (lastSegment instanceof IAdaptable) {
					final IFile iFile = ((IAdaptable) lastSegment).getAdapter(IFile.class);

					if (iFile != null) {

						final String path = iFile.getRawLocation().toOSString();

						final File file = new File(path);

						try {
							inputModels.add(file.getCanonicalFile());
						}
						catch (final IOException e) {
							this.logger.error("Error fetching the file : " + iFile.toString(), e);

						}

					}
				}
			}


			final Job job = new ModelLoaderJob(
					"Parsing selected files to obtain referred AMALTHEA models and corresponding Model versions",
					this.migrationSettings, inputModels, this.helper);
			job.setUser(true);

			job.schedule();


			job.addJobChangeListener(new JobChangeAdapter() {

				@Override
				public void done(final IJobChangeEvent jobEvent) {
					super.done(jobEvent);

					if (jobEvent.getResult().equals(Status.OK_STATUS)) {

						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {


								final List<MigrationInputFile> modelsWithLegacyVersionInfo = getInputModelsOfLegacyVersions(
										getMigrationSettings());


								final List<MigrationInputFile> modelsWithInvalidVersionInfo = getModelsWithInvalidVersionInfo(
										getMigrationSettings());

								if (modelsWithLegacyVersionInfo.size() > 0) {

									final StringBuffer stringBuffer = new StringBuffer();

									stringBuffer.append(
											"Can not migrate legacy Amalthea models of versions : itea.103 or itea.110 or itea.111");

									stringBuffer.append(System.getProperty("line.separator"));
									stringBuffer.append(System.getProperty("line.separator"));

									stringBuffer.append(
											"From APP4MC 0.9.3, support for migrating legacy model versions (itea.103, itea.110, itea.111) is removed");

									stringBuffer.append(System.getProperty("line.separator"));
									stringBuffer.append(System.getProperty("line.separator"));

									stringBuffer.append("** Legacy model versions found for the below files ->");

									stringBuffer.append(System.getProperty("line.separator"));
									stringBuffer.append(System.getProperty("line.separator"));

									for (final MigrationInputFile migrationFile : modelsWithInvalidVersionInfo) {

										stringBuffer.append(migrationFile.getFile().getAbsolutePath() + " Version: "
												+ migrationFile.getModelVersion());

										stringBuffer.append(System.getProperty("line.separator"));
										stringBuffer.append(" -------- > Version: " + migrationFile.getModelVersion());
									}
									stringBuffer.append(System.getProperty("line.separator"));
									stringBuffer.append(System.getProperty("line.separator"));

									stringBuffer.append(
											"Use one of the previous version of APP4MC (till 0.9.2) for migrating these legacy Amalthea models to regular versions (0.7.0 and above)");

									// stringBuffer.append(System.getProperty("line.separator"));
									// stringBuffer.append(System.getProperty("line.separator"));


									final Shell shell = new Shell(Display.getDefault());

									MessageDialog.openError(shell, "AMALTHEA Model Migration", stringBuffer.toString());


								}
								else if (modelsWithInvalidVersionInfo.size() > 0) {

									final StringBuffer stringBuffer = new StringBuffer();

									stringBuffer.append("Invalid model versions found for the below files ->");

									stringBuffer.append(System.getProperty("line.separator"));
									stringBuffer.append(System.getProperty("line.separator"));

									for (final MigrationInputFile migrationFile : modelsWithInvalidVersionInfo) {

										stringBuffer.append(migrationFile.getFile().getAbsolutePath());

										stringBuffer.append(System.getProperty("line.separator"));
									}
									final Shell shell = new Shell(Display.getDefault());

									MessageDialog.openError(shell, "AMALTHEA Model Migration", stringBuffer.toString());

								}
								else {

									final boolean status = setInputModelVersion(getMigrationSettings());

									final Shell shell = new Shell(Display.getDefault());

									if (!status) {

										// MessageDialog.openError(shell, "AMALTHEA Model Migration",
										// "Files belonging to different model versions are selected. \nThis is not
										// supported by Model Migration utility");

										final MigrationErrorDialog errorDialog = new MigrationErrorDialog(shell,
												getMigrationSettings());
										errorDialog.open();

									}
									else {

										if (getMigrationSettings().getInputModelVersion() != null
												&& getMigrationSettings().getInputModelVersion().equals(
														AmaltheaModelMigrationHandler.this.LATEST_MODEL_VERSION)) {

											MessageDialog.openInformation(shell, "AMALTHEA Model Migration",
													"Selected models are compatible to latest AMALTHEA meta-model version ("
															+ AmaltheaModelMigrationHandler.this.LATEST_MODEL_VERSION
															+ ")\nIt is not required to migrate these models !!");
										}
										else {
											//if simple migration then simple call ModelMigrationJob.
											if(isSimpleMigration(event) && migrationSettings.getMigModelFiles().size() == 1) {
												SimpleModelMigrationJob migrate = new SimpleModelMigrationJob(migrationSettings);
												migrate.run();
												
											} else {
												final ModelMigrationDialog dialog = new ModelMigrationDialog(shell,
														getMigrationSettings());
												dialog.open();
											}
											

										}


									}

								}


							}

							private boolean setInputModelVersion(final MigrationSettings migrationSettings) {

								boolean status = true;

								String inputModelVersion = null;

								for (final MigrationInputFile migModelFile : migrationSettings.getMigModelFiles()) {

									if (inputModelVersion == null) {
										inputModelVersion = migModelFile.getModelVersion();
									}
									else if (!inputModelVersion.equals(migModelFile.getModelVersion())) {

										migModelFile.setVersionDifferent(true);

										status = false;
									}
								}

								if (status == false) {
									return status;
								}

								migrationSettings.setInputModelVersion(inputModelVersion);

								return true;
							}

							/**
							 * This method is used to get all the input model files which are belonging to ITEA versions
							 * of AMALTHEA (e.g: itea.103, itea.110, itea.111)
							 *
							 * @param migrationSettings
							 * @return
							 */

							private List<MigrationInputFile> getInputModelsOfLegacyVersions(
									final MigrationSettings migrationSettings) {

								final List<MigrationInputFile> list = new ArrayList<MigrationInputFile>();

								for (final MigrationInputFile migModelFile : migrationSettings.getMigModelFiles()) {

									final String inputModelVersion = migModelFile.getModelVersion();

									if (((inputModelVersion != null) && (inputModelVersion.equals("itea.103")
											|| inputModelVersion.equals("itea.110")
											|| inputModelVersion.equals("itea.111")

									))) {

										list.add(migModelFile);
									}
								}

								return list;
							}


							/**
							 * This method is used to build list of model files for which version is invalid
							 *
							 * @param migrationSettings
							 * @return
							 */

							private List<MigrationInputFile> getModelsWithInvalidVersionInfo(
									final MigrationSettings migrationSettings) {

								final List<MigrationInputFile> list = new ArrayList<MigrationInputFile>();

								for (final MigrationInputFile migModelFile : migrationSettings.getMigModelFiles()) {

									final String inputModelVersion = migModelFile.getModelVersion();

									/*- if version is not among  0.7.0/0.7.1/0.7.2*/
									if (!((inputModelVersion != null) && (inputModelVersion.equals("0.7.0")
											|| inputModelVersion.equals("0.7.1") || inputModelVersion.equals("0.7.2")
											|| inputModelVersion.equals("0.8.0") || inputModelVersion.equals("0.8.1")
											|| inputModelVersion.equals("0.8.2") || inputModelVersion.equals("0.8.3")
											|| inputModelVersion.equals("0.9.0") || inputModelVersion.equals("0.9.1")
											|| inputModelVersion.equals("0.9.2") || inputModelVersion.equals("0.9.3")
											|| inputModelVersion.equals("0.9.4")|| inputModelVersion.equals("0.9.5")

									))) {

										list.add(migModelFile);
									}
								}

								return list;
							}
						});


					}
					else if (jobEvent.getResult().getCode() == Status.CANCEL_STATUS.getCode()) {

						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {


								final Shell shell = new Shell(Display.getDefault());

								MessageDialog.openError(shell, "AMALTHEA Model Migration",
										jobEvent.getResult().getMessage());

							}
						});


					}
				}
			});


		}


		return null;
	}


	public MigrationSettings getMigrationSettings() {
		return this.migrationSettings;
	}

	private boolean isSimpleMigration(ExecutionEvent event) {
		String context = event.getParameter("executioncontext");
		return (context != null && context.equals(SIMPLE_MIGRATION)) ? true : false;
	}

}

