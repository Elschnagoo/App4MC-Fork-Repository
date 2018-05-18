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
package org.eclipse.app4mc.amalthea.workflow.mwe2.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
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
import org.eclipse.app4mc.amalthea.workflow.mwe2.AmaltheaWorkflow;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

/**
 * Reads a list of configured files and loads them into the {@link WorkflowContext} as {@link Amalthea} model. The model
 * content available is a copy, so modifications to it does not affect the original file.
 * 
 */
public class AmaltheaReader extends AmaltheaWorkflow {

	private final List<String> fileNames = new ArrayList<String>();

	public AmaltheaReader() {
		super();
		this.log = Logger.getLogger("AmaltheaReader");
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#invokeInternal(org.eclipse.emf.mwe.core.WorkflowContext,
	 *      org.eclipse.emf.mwe.core.monitor.ProgressMonitor, org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	protected void invokeInternal(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
		this.log.info("Starting reading files...");
		final ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("amxmi", new AmaltheaResourceFactory());
		final Copier copier = new Copier(true, true);
		for (final String filename : getFileNames()) {
			try {
				this.log.info("Reading file: " + filename);
				final Resource res = resSet.createResource(URI.createURI(filename));
				res.load(null);
				final Collection<EObject> tmp = copier.copyAll(res.getContents());
				for (final EObject content : tmp) {
					if (content instanceof Amalthea) {
						// setAmaltheaModel(ctx, (Amalthea) content);
						final Amalthea tmpContent = (Amalthea) content;

						if (tmpContent.getCustomProperties() != null && tmpContent.getCustomProperties().size() > 0) {
							/*- Merging of CustomPropeties at the root level (central:Amalthea) from various models can lead to overwriting the contents (if same key's are defined)*/
							getAmaltheaModel(ctx).getCustomProperties().addAll(tmpContent.getCustomProperties());
						}
						if (tmpContent.getCommonElements() != null) {
							getAmaltheaModel(ctx).setCommonElements(tmpContent.getCommonElements());
						}
						if (tmpContent.getComponentsModel() != null) {
							getAmaltheaModel(ctx).setComponentsModel(tmpContent.getComponentsModel());
						}
						if (tmpContent.getConfigModel() != null) {
							getAmaltheaModel(ctx).setConfigModel(tmpContent.getConfigModel());
						}
						if (tmpContent.getConstraintsModel() != null) {
							getAmaltheaModel(ctx).setConstraintsModel(tmpContent.getConstraintsModel());
						}
						if (tmpContent.getEventModel() != null) {
							getAmaltheaModel(ctx).setEventModel(tmpContent.getEventModel());
						}
						if (tmpContent.getHwModel() != null) {
							getAmaltheaModel(ctx).setHwModel(tmpContent.getHwModel());
						}
						if (tmpContent.getMappingModel() != null) {
							getAmaltheaModel(ctx).setMappingModel(tmpContent.getMappingModel());
						}
						if (tmpContent.getOsModel() != null) {
							getAmaltheaModel(ctx).setOsModel(tmpContent.getOsModel());
						}
						if (tmpContent.getPropertyConstraintsModel() != null) {
							getAmaltheaModel(ctx).setPropertyConstraintsModel(tmpContent.getPropertyConstraintsModel());
						}
						if (tmpContent.getStimuliModel() != null) {
							getAmaltheaModel(ctx).setStimuliModel(tmpContent.getStimuliModel());
						}
						if (tmpContent.getSwModel() != null) {
							getAmaltheaModel(ctx).setSwModel(tmpContent.getSwModel());
						}
					}
					else if (content instanceof CommonElements) {
						getAmaltheaModel(ctx).setCommonElements((CommonElements) content);
					}
					else if (content instanceof ComponentsModel) {
						getAmaltheaModel(ctx).setComponentsModel((ComponentsModel) content);
					}
					else if (content instanceof ConfigModel) {
						getAmaltheaModel(ctx).setConfigModel((ConfigModel) content);
					}
					else if (content instanceof ConstraintsModel) {
						getAmaltheaModel(ctx).setConstraintsModel((ConstraintsModel) content);
					}
					else if (content instanceof EventModel) {
						getAmaltheaModel(ctx).setEventModel((EventModel) content);
					}
					else if (content instanceof HWModel) {
						getAmaltheaModel(ctx).setHwModel((HWModel) content);
					}
					else if (content instanceof MappingModel) {
						getAmaltheaModel(ctx).setMappingModel((MappingModel) content);
					}
					else if (content instanceof OSModel) {
						getAmaltheaModel(ctx).setOsModel((OSModel) content);
					}
					else if (content instanceof PropertyConstraintsModel) {
						getAmaltheaModel(ctx).setPropertyConstraintsModel((PropertyConstraintsModel) content);
					}
					else if (content instanceof StimuliModel) {
						getAmaltheaModel(ctx).setStimuliModel((StimuliModel) content);
					}
					else if (content instanceof SWModel) {
						getAmaltheaModel(ctx).setSwModel((SWModel) content);
					}
				}
			}
			catch (final IOException e) {
				issues.addError(this, "Error at loading files!", null, e, null);
			}
		}
		copier.copyReferences();
		this.log.info("Finished.");
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot#checkConfiguration(org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	public void checkConfiguration(final Issues issues) {
		if (this.fileNames.isEmpty()) {
			issues.addError(this, "No filenames configured to read!");
		}
		super.checkConfiguration(issues);
	}

	/**
	 * @return the fileNames
	 */
	public List<String> getFileNames() {
		return this.fileNames;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void addFileName(final String fileName) {
		this.fileNames.add(fileName);
	}

}
