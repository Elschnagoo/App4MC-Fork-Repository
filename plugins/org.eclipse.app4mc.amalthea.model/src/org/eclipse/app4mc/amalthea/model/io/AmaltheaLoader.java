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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSet;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSetImpl;

public class AmaltheaLoader {

	/**
	 * Static method to load an AMALTHEA model from a file with a given pathname
	 * string.
	 * <p>
	 * Possible path names:
	 * <ul>
	 * <li>absolute (example: "d:/temp/model.amxmi")</li>
	 * <li>relative to project folder (example: "input/model.amxmi")</li>
	 * </ul>
	 * 
	 * @param pathname	String
	 * @return
	 * 		AMALTHEA model - null if load failed
	 */
	public static Amalthea loadFromFileNamed(String pathname) {
		if (pathname != null) {
			final File file = new File(pathname);
			return loadFromFile(file);
		}
		return null;
	}

	/**
	 * Static method to load an AMALTHEA model from a file.
	 * 
	 * @param file	standard Java file
	 * @return
	 * 		AMALTHEA model - null if load failed
	 */
	public static Amalthea loadFromFile(File file) {
		if (file != null) {
			final URI uri = URI.createFileURI(file.getAbsolutePath());
			return loadFromURI(uri);
		}
		return null;
	}

	/**
	 * Static method to load an AMALTHEA model from a file URI.
	 * 
	 * @param uri	org.eclipse.emf.common.util.URI
	 * @return
	 * 		AMALTHEA model - null if load failed
	 */
	public static Amalthea loadFromURI(URI uri) {
		if (uri != null) {
			final ResourceSet resSet = initializeResourceSet();

			java.lang.System.out.println("Reading file: " + uri.toString());

			final Resource res = resSet.createResource(uri);

			if (res != null) {

				try {
					res.load(null);
				} catch (IOException e) {
					// ignore
				}
				for (final EObject content : res.getContents()) {
					if (content instanceof Amalthea) {
						return (Amalthea) content;
					}
				}
			}
		}

		return null;
	}

	private static ResourceSet initializeResourceSet() {
		AmaltheaPackage.eINSTANCE.eClass(); // register the package
		final ExtendedResourceSet resSet = new ExtendedResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("amxmi", new AmaltheaResourceFactory());

		return resSet;
	}

}
