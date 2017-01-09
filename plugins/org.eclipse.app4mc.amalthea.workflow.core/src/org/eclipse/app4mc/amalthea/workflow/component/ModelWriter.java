/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.sphinx.AmaltheaResourceFactory;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.amalthea.workflow.core.exception.ConfigurationException;
import org.eclipse.app4mc.amalthea.workflow.core.exception.WorkflowException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSet;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSetImpl;

/**
 * Basic workflow component implementation to write an available {@link Amalthea} model to a file. <br>
 * The following configurations are available:
 * <ul>
 * <li>singleFile: if set to <code>false</code>, for every submodel an own file is created, defaults to
 * <code>true</code></li>
 * <li>outputDir: The location of the folder to write the file</li>
 * <li>fileName: The name of the file / model to write</li>
 * </ul>
 * In addition the basic configurations of the {@link WorkflowComponent} are also available.
 */
public class ModelWriter extends WorkflowComponent {

	private boolean singleFile = true;
	private String outputDir;
	private String fileName;
	private final String fileType = "amxmi";
	private final Map<String, EObject> IntrinsicIDToEObjectCache = new HashMap<String, EObject>();
	private final Map<URI, Resource> uRIResourceCache = new HashMap<URI, Resource>();

	/**
	 *
	 */
	public ModelWriter() {
	}

	/**
	 * @param log
	 */
	public ModelWriter(final Logger log) {
		super(log);
	}

	/**
	 * @see org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent#runInternal(org.eclipse.app4mc.amalthea.workflow.core.Context)
	 */
	@Override
	protected void runInternal(final Context ctx) throws WorkflowException {
		try {
			if (isSingleFile()) {
				final List<EObject> tmp = new ArrayList<EObject>();
				tmp.add(getAmaltheaModelCopy(ctx));
				saveModelFile(null, tmp);
			}
			else {
				final List<EObject> tmp = new ArrayList<EObject>();
				final Amalthea model = getAmaltheaModelCopy(ctx);
				if (null != model.getCommonElements()) {
					tmp.add(model.getCommonElements());
					saveModelFile("-common", tmp); //$NON-NLS-1$
				}
				if (null != model.getHwModel()) {
					tmp.clear();
					tmp.add(model.getHwModel());
					saveModelFile("-hw", tmp); //$NON-NLS-1$
				}
				if (null != model.getOsModel()) {
					tmp.clear();
					tmp.add(model.getOsModel());
					saveModelFile("-os", tmp); //$NON-NLS-1$
				}
				if (null != model.getStimuliModel()) {
					tmp.clear();
					tmp.add(model.getStimuliModel());
					saveModelFile("-stimuli", tmp); //$NON-NLS-1$
				}
				if (null != model.getSwModel()) {
					tmp.clear();
					tmp.add(model.getSwModel());
					saveModelFile("-sw", tmp); //$NON-NLS-1$
				}
				if (null != model.getEventModel()) {
					tmp.clear();
					tmp.add(model.getEventModel());
					saveModelFile("-events", tmp); //$NON-NLS-1$
				}
				if (null != model.getPropertyConstraintsModel()) {
					tmp.clear();
					tmp.add(model.getPropertyConstraintsModel());
					saveModelFile("-pc", tmp); //$NON-NLS-1$
				}
				if (null != model.getConstraintsModel()) {
					tmp.clear();
					tmp.add(model.getConstraintsModel());
					saveModelFile("-constraints", tmp); //$NON-NLS-1$
				}
				if (null != model.getMappingModel()) {
					tmp.clear();
					tmp.add(model.getMappingModel());
					saveModelFile("-mapping", tmp); //$NON-NLS-1$
				}
				tmp.clear();
			}
		}
		catch (final IOException e) {
			throw new WorkflowException("An error occured by writing the model!", e);
		}
	}

	/**
	 * Checks for outputDir and filename to be set.
	 */
	@Override
	protected void checkInternal() throws ConfigurationException {
		if (null == getOutputDir() || getOutputDir().isEmpty()) {
			throw new ConfigurationException("No output directory defined!");
		}
		if (null == getFileName() || getFileName().isEmpty()) {
			throw new ConfigurationException("No filename defined!");
		}
	}

	/**
	 *
	 * @param filenameType
	 *            Concatenated after filename and before filetype in the whole filepath
	 * @param content
	 *            {@link EObject} to save as resource
	 * @throws IOException
	 */
	private void saveModelFile(final String filenameType, final List<EObject> content) throws IOException {
		if (null != content && !content.isEmpty()) {
			String outputFilePath = getOutputDir();
			if (!outputFilePath.endsWith("/")) { //$NON-NLS-1$
				outputFilePath = outputFilePath.concat("/"); //$NON-NLS-1$
			}
			if (null == filenameType) {
				outputFilePath = outputFilePath.concat(getFileName()).concat(".").concat(getFileType()); //$NON-NLS-1$
			}
			else {
				outputFilePath = outputFilePath.concat(getFileName()).concat(filenameType).concat(".") //$NON-NLS-1$
						.concat(getFileType());
			}
			this.log.info("Writing file " + outputFilePath);
			final URI tmpUri = URI.createURI(outputFilePath);
			final ExtendedResourceSet resourceSet = new ExtendedResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("amxmi",
					new AmaltheaResourceFactory());
			((ExtendedResourceSetImpl) resourceSet).setURIResourceMap(this.uRIResourceCache);
			final Resource outResource = resourceSet.createResource(tmpUri);
			((ResourceImpl) outResource).setIntrinsicIDToEObjectMap(this.IntrinsicIDToEObjectCache);
			outResource.getContents().addAll(content);
			outResource.save(null);
		}
	}

	/**
	 * @return the singleFile
	 */
	public boolean isSingleFile() {
		return this.singleFile;
	}

	/**
	 * @param singleFile
	 *            the singleFile to set
	 */
	public void setSingleFile(final boolean singleFile) {
		this.singleFile = singleFile;
	}

	/**
	 * @return the outputDir
	 */
	public String getOutputDir() {
		return this.outputDir;
	}

	/**
	 * Eclipse URIs like <code> platform:/resource/... </code> can be used to specify the location if running inside of
	 * an Eclipse environment.
	 * 
	 * @param outputDir
	 *            the outputDir to set
	 */
	public void setOutputDir(final String outputDir) {
		this.outputDir = outputDir;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return this.fileName;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(final String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the fileType
	 */
	public String getFileType() {
		return this.fileType;
	}

}
