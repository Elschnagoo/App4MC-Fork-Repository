/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.workflow.component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaMerger;
import org.eclipse.app4mc.amalthea.sphinx.AmaltheaResourceFactory;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.amalthea.workflow.core.exception.ConfigurationException;
import org.eclipse.app4mc.amalthea.workflow.core.exception.WorkflowException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSet;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSetImpl;

/**
 * Basic workflow component to read a model file and set it to a given context.
 * The model can also be split to several files, each file containing an {@link Amalthea} model.
 * Several file locations can be added using the {@link #addFileName(String)} method.
 * The given files are read, the content is copied and at the end resolved.
 * At the end the loaded model is available in the configured model slot.
 */
public class ModelReader2 extends WorkflowComponent {

	private final List<String> fileNames = new ArrayList<String>();

	public ModelReader2() {
		super();
	}

	/**
	 * 
	 * @see org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent#runInternal(org.eclipse.app4mc.amalthea.workflow.core.Context)
	 */
	@Override
	protected void runInternal(final Context ctx) throws WorkflowException {
		final ExtendedResourceSet resSet = new ExtendedResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("amxmi", new AmaltheaResourceFactory());
		final Collection<Amalthea> models = new ArrayList<Amalthea>();
		for (final String filename : getFileNames()) {
			try {
				this.log.info("Reading file: " + filename);
				final Resource res = resSet.createResource(URI.createURI(filename));
				res.load(null);
				for (final EObject content : res.getContents()) {
					if (content instanceof Amalthea) {
						models.add( (Amalthea) content);
					}
				}
			}
			catch (final IOException e) {
				throw new WorkflowException("Error at loading files!", e);
			}
		}
		 
		AmaltheaMerger.addElements(getAmaltheaModel(ctx), models);
	}

	/**
	 * Checks for given file locations to load.
	 * 
	 * @throws ConfigurationException
	 *             in case no file location is configured.
	 */
	@Override
	protected void checkInternal() throws ConfigurationException {
		if (this.fileNames.isEmpty()) {
			throw new ConfigurationException("No filenames configured to read!");
		}
	}

	/**
	 * @return the fileNames as {@link List} of {@link String}
	 */
	public List<String> getFileNames() {
		return this.fileNames;
	}

	/**
	 * Adds a file location holding an {@link Amalthea} model. Eclipse URIs like <code> platform:/resource/... </code> can
	 * be used to specify the location if running inside of an Eclipse environment.
	 * 
	 * @param fileName
	 *            the fileName to set
	 */
	public void addFileName(final String fileName) {
		this.fileNames.add(fileName);
	}

}
