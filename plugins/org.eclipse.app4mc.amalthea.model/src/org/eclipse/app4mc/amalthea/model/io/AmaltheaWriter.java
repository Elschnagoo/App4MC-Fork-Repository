/**
 ********************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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
	 * @param model		source model
	 * @param pathname	String
	 * @return
	 * 		boolean - true if file is written successfully
	 */
	public static boolean writeToFileNamed(Amalthea model, String pathname) {
		if(model!=null && pathname!=null) {
			final File file = new File(pathname);
			return writeToFile(model, file);
		}
		return false;
	}

	/**
	 * Static method to save an AMALTHEA model to a file.
	 * 
	 * @param model		source model
	 * @param file		standard Java file
	 * @return
	 * 		boolean - true if file is written successfully
	 */
	public static boolean writeToFile(Amalthea model, File file) {
		if(model!=null && file!=null) {
			final URI uri = URI.createFileURI(file.getAbsolutePath());
			return writeToURI(model, uri);
		}
		return false;
	}

	/**
	 * Static method to save an AMALTHEA model to a file URI.
	 * 
	 * @param model		source model
	 * @param uri		org.eclipse.emf.common.util.URI
	 * @return
	 * 		boolean - true if file is written successfully
	 */
	public static boolean writeToURI(Amalthea model, URI uri) {
		if(model !=null && uri!=null) {
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
		return false;
	}

	private static ResourceSet initializeResourceSet() {
		AmaltheaPackage.eINSTANCE.eClass(); // register the package
		final ExtendedResourceSet resSet = new ExtendedResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("amxmi", new AmaltheaResourceFactory());

		return resSet;
	}

}
