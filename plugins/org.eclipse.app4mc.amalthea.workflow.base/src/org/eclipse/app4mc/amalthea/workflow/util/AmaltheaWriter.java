/**
 * *******************************************************************************
 *  Copyright (c) 2013 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.workflow.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.ConfigModel;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.sphinx.AmaltheaResourceFactory;
import org.eclipse.app4mc.amalthea.workflow.base.AmaltheaWorkflow;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

/**
 * Writes the current {@link Amalthea} model in the {@link WorkflowContext} to amxmi files. With the option
 * {@link AmaltheaWriter#singleFile} <code>true</code> the content is written in a single file with {@link Amalthea} as
 * root, otherwise it is split up into several files. The content of one file is representing one of the following model
 * parts:
 * <ul>
 * <li>{@link SWModel} -> [{@link AmaltheaWriter#fileName}]-sw. [ {@link AmaltheaWriter#fileType}]</li>
 * <li>{@link HWModel} -> [{@link AmaltheaWriter#fileName}]-hw. [ {@link AmaltheaWriter#fileType}]</li>
 * <li>{@link ConfigModel} -> [{@link AmaltheaWriter#fileName}]-config. [ {@link AmaltheaWriter#fileType}]</li>
 * <li>{@link ConstraintsModel} -> [{@link AmaltheaWriter#fileName} ]-constraints. [ {@link AmaltheaWriter#fileType}]
 * </li>
 * <li>{@link EventModel} -> [{@link AmaltheaWriter#fileName}]-events. [ {@link AmaltheaWriter#fileType}]</li>
 * <li>{@link MappingModel} -> [{@link AmaltheaWriter#fileName}]-mapping. [ {@link AmaltheaWriter#fileType}]</li>
 * <li>{@link OSModel} -> [{@link AmaltheaWriter#fileName}]-os. [ {@link AmaltheaWriter#fileType}]</li>
 * <li>{@link PropertyConstraintsModel} -> [{@link AmaltheaWriter#fileName}]-pc. [ {@link AmaltheaWriter#fileType}]</li>
 * <li>{@link StimuliModel} -> [{@link AmaltheaWriter#fileName}]-stimuli. [ {@link AmaltheaWriter#fileType}]</li>
 * </ul>
 *
 *
 */
@SuppressWarnings("javadoc")
public class AmaltheaWriter extends AmaltheaWorkflow {

	private boolean singleFile = true;
	private String outputDir;
	private String fileName;
	private final String fileType = "amxmi";
	private final Map<String, EObject> cache = new HashMap<String, EObject>();
	private final Map<URI, Resource> cache2 = new HashMap<URI, Resource>();

	@SuppressWarnings("javadoc")
	public AmaltheaWriter() {
		super();
		this.log = Logger.getLogger("AmaltheaWriter");
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#invokeInternal(org.eclipse.emf.mwe.core.WorkflowContext,
	 *      org.eclipse.emf.mwe.core.monitor.ProgressMonitor, org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	protected void invokeInternal(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
		this.log.info("Starting...");
		try {
			if (isSingleFile()) {
				final List<EObject> tmp = new ArrayList<EObject>();
				tmp.add(getAmaltheaModelCopy(ctx));
				saveModelFile(null, tmp);
			}
			else {
				final List<EObject> tmp = new ArrayList<EObject>();
				final Amalthea model = getAmaltheaModelCopy(ctx);
				if (null != model.getHwModel()) {
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
			this.log.error("An error occured by writing the model!", e);
		}
		this.log.info("Finished");
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot#checkConfiguration(org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	public void checkConfiguration(final Issues issues) {
		if (null == getOutputDir() || getOutputDir().isEmpty()) {
			issues.addError(this, "No output directory defined!");
		}
		if (null == getFileName() || getFileName().isEmpty()) {
			issues.addError(this, "No filename defined!");
		}
		super.checkConfiguration(issues);
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
			final ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("amxmi",
					new AmaltheaResourceFactory());
			((ResourceSetImpl) resourceSet).setURIResourceMap(this.cache2);
			final Resource outResource = resourceSet.createResource(tmpUri);
			((ResourceImpl) outResource).setIntrinsicIDToEObjectMap(this.cache);
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
