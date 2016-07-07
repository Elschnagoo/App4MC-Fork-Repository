package org.eclipse.app4mc.amalthea.export.osek.handlers;

import java.io.File;
import java.io.IOException;

import org.eclipse.app4mc.amalthea.export.osek.OsekMainWriter;
import org.eclipse.app4mc.amalthea.export.osek.OsekOilWriter;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
//import org.eclipse.osgi.framework.internal.core.UniversalUniqueIdentifier;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;


public class OsekGenerationHandler extends AbstractHandler {

	private boolean fileNotFoundCheckerOil = false;
	private boolean fileNotFoundCheckerMaster = false;
	private boolean fileNotFoundCheckerSlave = false;
	// private final boolean uiHandlerDebug = false;
	// private final String mappingModelName = "";
	private URI selectedSWModel;
	private URI workingFolder;

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final UniversalHandler uh = UniversalHandler.getInstance();

		// final UIHandler ui = new UIHandler(this.uiHandlerDebug);
		String pathMappingModel = "";

		// final UIHandler uiHandlerUI = new UIHandler(this.uiHandlerDebug);
		// final URI projectDir = uiHandlerUI.getProjectDir(event);
		final URI projectDir = uh.getProjectDir(event);
		final IFile selectedFile = uh.getSelectedFile(event);
		final URI selectedFilePath = URI.createURI(selectedFile.getLocationURI().toString());

		// System.out.println("Pfad 2 OIL: " + projectDir.toString());

		// final MappingModelHandler mappingModelHandler = new
		// MappingModelHandler();
		// MappingModel mappingmodel = null;
		// final SWModelHandler swModelHandler = new SWModelHandler();
		// final SWModel swmodel =
		// swModelHandler.readModel(uiHandlerUI.getSelectedFile(event));

		// uh.readModels(uiHandlerUI.getSelectedFile(event), true);
		uh.readModels(selectedFilePath, true);
		final SWModel swmodel = uh.getSwModel();

		// this.selectedSWModel = ui.getSelectedFile(event);
		// this.workingFolder = ui.getProjectDir(event);
		this.selectedSWModel = selectedFilePath;
		this.workingFolder = uh.getProjectDir(event);

		IWorkbenchWindow window;
		try {
			window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			final OsekGenerationGUI dialog = new OsekGenerationGUI(window.getShell());
			final String f = new File(this.selectedSWModel.devicePath()).getName();
			dialog.setProjectName(f.substring(0, f.lastIndexOf('.')));
			dialog.setWorkingDirectory(this.workingFolder.devicePath());
			dialog.create();
			if (dialog.open() == Window.OK) {
				pathMappingModel = dialog.getPathToMappingModel();
				System.out.println("PathMappingModel: " + pathMappingModel);
				// mappingmodel =
				// mappingModelHandler.readModel(URI.createFileURI(pathMappingModel));
				final MappingModel mappingmodel;
				uh.readModels(URI.createFileURI(pathMappingModel), true);
				mappingmodel = uh.getMappingModel();

				final SchedulerToCoreMap coreAlloc = new SchedulerToCoreMap(mappingmodel.getCoreAllocation());
				final EList<TaskAllocation> exeAlloc = mappingmodel.getTaskAllocation();
				final EList<Task> tasksList = swmodel.getTasks();

				System.out.println("\nStarting generation!\n");

				final OsekOilWriter oil = new OsekOilWriter();
				final OsekMainWriter master = new OsekMainWriter();
				final OsekMainWriter slave = new OsekMainWriter();

				try {
					this.fileNotFoundCheckerOil = oil.generateOutputOil(tasksList, exeAlloc, coreAlloc, projectDir);
					this.fileNotFoundCheckerMaster = master.generateOutputMain("master", tasksList, exeAlloc, coreAlloc,
							projectDir);
					this.fileNotFoundCheckerSlave = slave.generateOutputMain("slave", tasksList, exeAlloc, coreAlloc,
							projectDir);
				}
				catch (final IOException e) {
					e.printStackTrace();
					final IWorkbenchWindow windowFinalStatus = HandlerUtil.getActiveWorkbenchWindowChecked(event);
					MessageDialog.openInformation(windowFinalStatus.getShell(), "ERROR", "Something is going wrong!");
				}
				finally {
					if (this.fileNotFoundCheckerOil || this.fileNotFoundCheckerMaster
							|| this.fileNotFoundCheckerSlave) {
						final IWorkbenchWindow windowFinalStatus = HandlerUtil.getActiveWorkbenchWindowChecked(event);

						String outputInfo = "";

						if (this.fileNotFoundCheckerOil) {
							outputInfo = outputInfo.concat("  - confTemplate.oil\n ");
						}
						if (this.fileNotFoundCheckerMaster || this.fileNotFoundCheckerSlave) {
							outputInfo = outputInfo.concat("  - template.c");
						}
						MessageDialog.openInformation(windowFinalStatus.getShell(), "ERROR",
								"The following files were not found:\n" + outputInfo
										+ "\n\nPlease copy the required files into the template folder.");
					}
					else {
						final IWorkbenchWindow windowFinalStatus = HandlerUtil.getActiveWorkbenchWindowChecked(event);
						MessageDialog.openInformation(windowFinalStatus.getShell(), "Status Information",
								"The OSEK file generation have been successfully completed!");
					}
				}
			}
			else {
				System.out.println("User caused abort!");
			}
		}
		catch (final ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return null;
	}
}
