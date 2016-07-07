/**
 * *******************************************************************************
 *  Copyright (c) 2013 C-LAB (University of Paderborn) and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     C-LAB (University of Paderborn) - initial API and implementation
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This is a handler for saving trace data read from HTF file to the OT1 format
 * (OT1 format is provided by Gliwa GmbH).
 */
public class ConverterHandler extends AbstractHandler {

	/**
	 * This method returns the path including filename of the selected file
	 * relative to the Eclipse Workspace
	 * 
	 * @param event
	 *            An event containing all the information about the current
	 *            state of the application; must not be <code>null</code>.
	 * @return Filename of the selected file including path relative to
	 *         workspace
	 */
	private IFile getSelectedPath(final ExecutionEvent event) {
		IFile file = null;
		// get selected filename
		try {
			final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			// get selection service
			final ISelectionService service = window.getSelectionService();
			// get selection
			final IStructuredSelection structured = (IStructuredSelection) service.getSelection();
			// get selected file
			file = (IFile) structured.getFirstElement();
		}
		catch (final ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}

	/**
	 * This method saves the model given by paramter
	 * <code>DocumentRoot model</code> to a file named according to paramter
	 * <code>String path</code>. Serialization is done by means of EMF.
	 * 
	 * @param model
	 *            Model that shall be stored in xml format
	 * @param path
	 *            Filename including full path of the file where model data are
	 *            stored
	 */
	private void saveModel(final DocumentRoot model, final String path) {
		// Obtain a new resource set
		final ResourceSet resSet = new ResourceSetImpl();

		// Create a resource
		final Resource resource = resSet.createResource(URI.createFileURI(path));
		// Add content that shall be stored to the resource (Resources that have
		// a "contains relationship" are automtically added)
		resource.getContents().add(model);

		// Define options for saving
		final Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		options.put(XMLResource.OPTION_DECLARE_XML, true);
		options.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, true);

		// Save the content
		try {
			resource.save(options);
		}
		catch (final IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		// create instance of htf-to-ot1-converter
		final Htf2Ot1Converter converter = new Htf2Ot1Converter();
		final IFile inputFile = getSelectedPath(event);
		// get path of selected file
		IPath path = inputFile.getLocation();

		path = path.makeAbsolute();

		// convert trace from htf file to a OT1 model
		final DocumentRoot ot1Model = converter.convertHtf2Ot1(path.toOSString());

		// OT1 model is stored to a file whose path equals the htf file except
		// of the file extension
		path = inputFile.getFullPath();
		path = path.removeFileExtension();
		path = path.addFileExtension("xml");

		saveModel(ot1Model, path.toOSString());

		return null;
	}
}
