/**
 * *******************************************************************************
 *  Copyright (c) 2013 itemis AG and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     itemis AG - initial API and implementation
 *     Robert Bosch GmbH: Added Listener for refreshing the editor on resource Change
 *
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.sphinx.ui.editors.editor;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.SphinxSupportPlugin;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor;
import org.eclipse.sphinx.emf.metamodel.IMetaModelDescriptor;
import org.eclipse.sphinx.emf.metamodel.MetaModelDescriptorRegistry;
import org.eclipse.sphinx.emf.model.IModelDescriptor;
import org.eclipse.sphinx.emf.model.ModelDescriptorRegistry;
import org.eclipse.sphinx.emf.ui.util.EcoreUIUtil;
import org.eclipse.sphinx.emf.util.EcorePlatformUtil;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;


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
		if (!(getSite().getPage().getActiveEditor() instanceof ExtendedBasicTransactionalFormEditor)) {
			return;
		}

		final ExtendedBasicTransactionalFormEditor activeEditor = (ExtendedBasicTransactionalFormEditor) getSite()
				.getPage().getActiveEditor();

		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				activeEditor.getViewer().refresh();
			}
		});
	}

	@Override
	protected void createPages() {

		boolean isModelFileValid = isFileContainingValidModelNameSpace();
		
		if(!isModelFileValid){
			return;
		}
		
		super.createPages();
	}

	/**
	 * This method is used to check if the file contains valid AMALTHEA model namespace (which is compatible to the current MetaModel)
	 * <br>
	 * In case if the version of model (associated to the input file) and Meta-Model are different -> ERROR message is thrown and Editor is not opened
	 *  
	 */
	private boolean isFileContainingValidModelNameSpace() {
		
		Object editorInputObject = getEditorInputObject();
		
		if (editorInputObject == null) {
			
			IEditorInput editorInput = getEditorInput();
			
			/*- get the IFile object editorInput */
			
			IFile iFileObject = EcoreUIUtil.getFileFromEditorInput(editorInput);
			
			/*- verify if the Model descriptor can be fetched from the File */
			IModelDescriptor modelDescriptorContent = ModelDescriptorRegistry.INSTANCE.getModel(iFileObject);
			
			if (modelDescriptorContent == null) {

				/*- Get the Meta-Model descriptor belonging to the current version of AMALTHEA meta model plugin */

				IMetaModelDescriptor metaModelDescriptor = MetaModelDescriptorRegistry.INSTANCE.getDescriptor(AMALTHEA_MODEL_ID);

				if(metaModelDescriptor!=null){

					/*- Extracting namespace from MetaModel */
					String nsURIFromMetaModel = metaModelDescriptor.getRootEPackage().getNsURI();

					/*- Extracting namespace from Model file */
					String nsURIFromModel = EcorePlatformUtil.readModelNamespace(iFileObject);

					String versionFromMetaModel="";

					String versionFromModel="";

					String legacyAMALTHEANameSpacePrefix_1 = "http://www.amalthea.itea2.org/model/";

					String legacyAMALTHEANameSpacePrefix_2 = "http://amalthea.itea2.org/model/";

					/*- If one of the URI version is unable to be extracted, it is better to delegate the check behaviour to Sphinx */
					
					if((nsURIFromMetaModel!=null) && (nsURIFromModel!=null)){
						
						/*- Extracting AMALTHEA metamodel version */
						if( nsURIFromMetaModel.startsWith(legacyAMALTHEANameSpacePrefix_1)){

							String subString = nsURIFromMetaModel.replace(legacyAMALTHEANameSpacePrefix_1, "");
							int indexOfSlash = subString.indexOf("/");

							versionFromMetaModel=indexOfSlash!=-1?subString.substring(0,indexOfSlash):nsURIFromMetaModel;
							
							versionFromMetaModel="itea."+versionFromMetaModel;
							
						}else if( nsURIFromMetaModel.startsWith(legacyAMALTHEANameSpacePrefix_2)){

							String subString = nsURIFromMetaModel.replace(legacyAMALTHEANameSpacePrefix_2, "");
							int indexOfSlash = subString.indexOf("/");

							versionFromMetaModel=indexOfSlash!=-1?subString.substring(0,indexOfSlash):nsURIFromMetaModel;
							
							versionFromMetaModel="itea."+versionFromMetaModel;
						}
						
						else  {
							versionFromMetaModel=nsURIFromMetaModel.lastIndexOf("/")!=-1?nsURIFromMetaModel.substring(nsURIFromMetaModel.lastIndexOf("/")+1):nsURIFromMetaModel;
						} 
						
						
						/*- Extracting AMALTHEA model version */
						if( nsURIFromModel.startsWith(legacyAMALTHEANameSpacePrefix_1)){

							String subString = nsURIFromModel.replace(legacyAMALTHEANameSpacePrefix_1, "");
							
							int indexOfSlash = subString.indexOf("/");

							versionFromModel=indexOfSlash!=-1?subString.substring(0,indexOfSlash):nsURIFromModel;
							
							versionFromModel="itea."+versionFromModel;
							
						}else if( nsURIFromModel.startsWith(legacyAMALTHEANameSpacePrefix_2)){

							String subString = nsURIFromModel.replace(legacyAMALTHEANameSpacePrefix_2, "");
							
							int indexOfSlash = subString.indexOf("/");

							versionFromModel=indexOfSlash!=-1?subString.substring(0,indexOfSlash):nsURIFromModel;
							
							versionFromModel="itea."+versionFromModel;
						}else  {
							versionFromModel=nsURIFromModel.lastIndexOf("/")!=-1?nsURIFromModel.substring(nsURIFromModel.lastIndexOf("/")+1):nsURIFromModel;
						} 
						
						
						/*- comparing the versions obtained from MetaModel and Model */
						if(!versionFromMetaModel.equals(versionFromModel)){

							MessageDialog.openError(getSite().getShell(), "Editor Initialization Error", NLS
									.bind( "Editor could not be opened because of outdated model file \r\rFound AMALTHEA model version : {0}\rCurrent editor supports only AMALTHEA model version :  {1}\r\r** Use AMALTHEA Model Migration utility to convert the model to latest version "  ,new Object[]{ versionFromModel, versionFromMetaModel}));

							close(false);
							return false;

						}
					
					}
					
				} 

			}
		}
		
		return true;
	}
}
