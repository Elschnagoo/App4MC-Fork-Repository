/**
 ********************************************************************************
 * Copyright (c) 2015-2019 itemis AG and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 *  Contributors:
 *     itemis AG - initial API and implementation
 *     Robert Bosch GmbH
 *       - added listener for refreshing the editor on resource change
 *       - added workaround for CSS styling bug
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.editor;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.SphinxSupportPlugin;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.util.Util;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.osgi.util.NLS;
import org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor;
import org.eclipse.sphinx.emf.metamodel.IMetaModelDescriptor;
import org.eclipse.sphinx.emf.metamodel.MetaModelDescriptorRegistry;
import org.eclipse.sphinx.emf.model.IModelDescriptor;
import org.eclipse.sphinx.emf.model.ModelDescriptorRegistry;
import org.eclipse.sphinx.emf.ui.util.EcoreUIUtil;
import org.eclipse.sphinx.emf.util.EcorePlatformUtil;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;


@SuppressWarnings("restriction")
public class ExtendedBasicTransactionalFormEditor extends BasicTransactionalFormEditor implements
		IResourceChangeListener {

	private static final String AMALTHEA_MODEL_ID = "org.eclipse.app4mc.amalthea.model";
	
	private static final String SHOW_TYPES_OF_ELEMENTS = "show_types_of_elements"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor#getCustomAdapterFactory()
	 */
	@Override
	protected AdapterFactory getCustomAdapterFactory() {
		return ExtendedItemProviderAdapterFactory.INSTANCE;
	}

	/**
	 * @see org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor#getEditorInputName()
	 */
	@Override
	protected String getEditorInputName() {
		final IEditorInput editorInput = getEditorInput();
		final URI editorURI = EcoreUIUtil.getURIFromEditorInput(editorInput);
		if (null != editorURI) {
			final String fileName = editorURI.lastSegment();
			return fileName;
		}
		return super.getEditorInputName();
	}

	/**
	 * @see org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor#addPages()
	 */
	@Override
	protected void addPages() {
		// super.addPages();
		try {
			addPage(new ExtendedContentsTreePage(this));
		}
		catch (final PartInitException e) {
			PlatformLogUtil.logAsError(SphinxSupportPlugin.getDefault(), e);
		}
		addResourceChangeListener();
	}

	/**
	 * @param showTypes
	 *            true shows the type names after the element names, false is standard behavior
	 */
	public void setShowTypesOfElements(final boolean showTypes) {
		SphinxSupportPlugin.getDefault().getDialogSettings().put(SHOW_TYPES_OF_ELEMENTS, showTypes);
	}

	/**
	 * @return true shows the type names after the element names, false is standard behavior
	 */
	public boolean isShowTypesOfElements() {
		return SphinxSupportPlugin.getDefault().getDialogSettings().getBoolean(SHOW_TYPES_OF_ELEMENTS);
	}

	/*
	 * Register listener for Resource change: here the context is marker deletion
	 */
	public void addResourceChangeListener() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}

	@Override
	public void resourceChanged(final IResourceChangeEvent event) {
		final IWorkbenchPartSite site = getSite();
		if (site == null) return;
		
		final IWorkbenchPage page = site.getPage();
		if (page == null) return;
		
		IEditorPart editorPart = page.getActiveEditor();
		if (!(editorPart instanceof ExtendedBasicTransactionalFormEditor)) return;

		final ExtendedBasicTransactionalFormEditor activeEditor = (ExtendedBasicTransactionalFormEditor) editorPart;

		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				Viewer viewer = activeEditor.getViewer();
				if (viewer != null) {
					viewer.refresh();
				}
			}
		});
	}

	/*
	 *  Workaround for empty viewer after click on already selected item
	 *  
	 *  On Windows some SWT bug avoids repainting of non selected elements.
	 *  Since the related SWT issue has been discussed for years and
	 *  no real fix was found, we try to limit the negative effects.
	 *  See Bugzilla entries: 491737, 458015, 433858.
	 *  
	 *  If (1) OS is Windows and (2) theming is enabled then
	 *  an additional redraw is called explicitly.
	 *  Users may notice a minor flickering on selection. However, that is
	 *  surely preferable to not seeing unselected elements at all.
	 */
	@Override
	public void setSelection(ISelection selection) {
		super.setSelection(selection);
				
		if (Util.isWindows() == false) return; // No Windows OS -> no workaround required
		
		MApplication application = PlatformUI.getWorkbench().getService(MApplication.class);
		if (application == null) return;
		
		IEclipseContext context = application.getContext();
		if (context == null) return;
		
		IThemeEngine engine = context.get(IThemeEngine.class);
		if (engine == null) return; // Theming is not enabled -> no workaround required
		
		// System.out.println("Theme is " + engine.getActiveTheme().getLabel());
		
		// *** Workaround: additional redraw ***
		Viewer viewer = getViewer();
		if (viewer != null) {
			Control control = viewer.getControl();
			if (control != null) {
				control.redraw();
			}
		}
	}

	@Override
	protected void createPages() {
		// check model version
		if(!isFileContainingValidModelNameSpace()) return;
		
		super.createPages();
	}

	/**
	 * This method is used to check if the file contains valid AMALTHEA model namespace
	 * (which is compatible to the current MetaModel)
	 * <br>
	 * In case if the version of model (associated to the input file) and Meta-Model are different
	 * -> Message is shown and Editor is not opened
	 *  
	 */
	private boolean isFileContainingValidModelNameSpace() {

		if (getEditorInputObject() != null)
			return true; // valid Amalthea resource found

		// Get the IFile object editorInput
		IEditorInput editorInput = getEditorInput();
		IFile iFileObject = EcoreUIUtil.getFileFromEditorInput(editorInput);

		// Verify if the Model descriptor can be fetched from the File
		IModelDescriptor modelDescriptorContent = ModelDescriptorRegistry.INSTANCE.getModel(iFileObject);

		if (modelDescriptorContent != null)
			return true; // valid model descriptor found

		// Get the Meta-Model descriptor belonging to the current version of AMALTHEA meta model plugin
		IMetaModelDescriptor metaModelDescriptor = MetaModelDescriptorRegistry.INSTANCE.getDescriptor(AMALTHEA_MODEL_ID);

		if (metaModelDescriptor == null)
			return true; // undecidable -> delegate the check behaviour to Sphinx

		// Extracting namespace from MetaModel
		String nsURIFromMetaModel = metaModelDescriptor.getRootEPackage().getNsURI();

		// Extracting namespace from Model file
		String nsURIFromModel = EcorePlatformUtil.readModelNamespace(iFileObject);

		if ((nsURIFromMetaModel == null) || (nsURIFromModel == null))
			return true; // undecidable -> delegate the check behaviour to Sphinx
		
		
		// *** Check for unsupported itea versions (legacy) ***
		
		final String legacyAMALTHEANameSpacePrefix_1 = "http://www.amalthea.itea2.org/model/";
		final String legacyAMALTHEANameSpacePrefix_2 = "http://amalthea.itea2.org/model/";
		
		if (nsURIFromModel.startsWith(legacyAMALTHEANameSpacePrefix_1)
			|| nsURIFromModel.startsWith(legacyAMALTHEANameSpacePrefix_2)) {
			// legacy version detected -> do not open and show error
			MessageDialog.openWarning(
				getSite().getShell(),
				"AMALTHEA Model Editor",
				"Unsupported File ! \r\rEditor could not be opened because of a legacy model file that is no longer supported."
			);
			
			close(false);
			return false;
		}
		
		// Extracting AMALTHEA model version
		String versionFromModel = nsURIFromModel.lastIndexOf("/") != -1
					? nsURIFromModel.substring(nsURIFromModel.lastIndexOf("/") + 1)
					: nsURIFromModel;
		
		// Extracting AMALTHEA metamodel version
		String versionFromMetaModel = nsURIFromMetaModel.lastIndexOf("/") != -1
				? nsURIFromMetaModel.substring(nsURIFromMetaModel.lastIndexOf("/") + 1)
				: nsURIFromMetaModel;
		
		
		// *** Compare the versions obtained from MetaModel and Model ***
				
		if (versionFromMetaModel.equals(versionFromModel)) {
			// current version detected
			return true;
		} else {
			// old APP4MC version detected -> do not open and show migration hint
			MessageDialog dialog = new MessageDialog(getSite().getShell(), "AMALTHEA Model Editor", null, NLS.bind(
					"Unsupported File ! \r\rEditor could not be opened because of an outdated model file. \r\rFound AMALTHEA model version : {0}\rCurrent editor supports only AMALTHEA model version :  {1}\r\r** Use AMALTHEA Model Migration utility to convert the model to latest version ",
					new Object[] { versionFromModel, versionFromMetaModel }), MessageDialog.QUESTION_WITH_CANCEL, 0, "Start Simple Migration","Show Migration Dialog","No");
				int open = dialog.open();
				//If user chose Migrate option then the Model Migration command is executed to show the migration dialog
				//IF Start Simple Migration is selected then return value is 0 & for Show Migration Dialog it is 1
				if(open == MessageDialog.OK || open == MessageDialog.CANCEL) {
				  	ICommandService cmdService = getSite().getService(ICommandService.class);
				    Command sampleCommand = cmdService.getCommand("org.itea2.amalthea.model.converter.models.command.modelmigration.dialog.cmd");
				    
				    Map<String, String> params = new HashMap<>();
				    if(open == MessageDialog.OK) 
				    	params.put("executioncontext", "simplemigration");
				    try {
				      sampleCommand.executeWithChecks(new ExecutionEvent(sampleCommand, params, null, null));
				    }
				    catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
				      e.printStackTrace();
				    }
				}
			
			close(false);
			return false;
		}	
	}
	
}
