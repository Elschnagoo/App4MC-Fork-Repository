/**
 * *******************************************************************************
 *  Copyright (c) 2018 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.io;

import java.io.File;
import java.io.IOException;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.sphinx.AmaltheaResourceFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSet;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSetImpl;

public class AmaltheaWriter {

	/**
	 * Static method to save an AMALTHEA model to a file with a given pathname string.
	 * <p>
	 * Possible path names:
	 * <ul>
	 * <li>absolute (example: "d:/temp/model_new.amxmi")</li>
	 * <li>relative to project folder (example: "output/model_new.amxmi")</li>
	 * </ul>
	 * 
	 * @param model
	 * @param pathname
	 * @return boolean - true if file is written successfully
	 */
	public static boolean writeToFileNamed(Amalthea model, String pathname) {
		final File file = new File(pathname);
		return writeToFile(model, file);
	}

	/**
	 * Static method to save an AMALTHEA model to a file.
	 * 
	 * @param model
	 * @param file
	 * @return boolean - true if file is written successfully
	 */
	public static boolean writeToFile(Amalthea model, File file) {
		final URI uri = URI.createFileURI(file.getAbsolutePath());
		return writeToURI(model, uri);
	}

	/**
	 * Static method to save an AMALTHEA model to a file URI.
	 * 
	 * @param model
	 * @param uri
	 * @return boolean - true if file is written successfully
	 */
	public static boolean writeToURI(Amalthea model, URI uri) {
		final ResourceSet resSet = initializeResourceSet();
		
		java.lang.System.out.println("Writing file: " + uri.toString());
		
		final Resource res = resSet.createResource(uri);
		res.getContents().add(EcoreUtil.copy(model));
		try {
			res.save(null);
		} catch (IOException e) {
			return false;
		}
		
		return true;
	}

	private static ResourceSet initializeResourceSet() {
		AmaltheaPackage.eINSTANCE.eClass(); // register the package
		final ExtendedResourceSet resSet = new ExtendedResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("amxmi", new AmaltheaResourceFactory());

		return resSet;
	}

}
