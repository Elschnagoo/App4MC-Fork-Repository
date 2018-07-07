/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.workflow.component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaMerger;
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
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.amalthea.workflow.core.exception.ConfigurationException;
import org.eclipse.app4mc.amalthea.workflow.core.exception.WorkflowException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSet;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSetImpl;

/**
 * Basic workflow component to read a model file and set it to a given context.
 * The model can also be split to several files, each file containing one
 * submodel of the central {@link Amalthea} model. Several file locations can be
 * added using the {@link #addFileName(String)} method. The given files are
 * read, the content is copied and at the end resolved. At the end the loaded
 * model is available in the configured model slot.
 */
public class ModelReader extends WorkflowComponent {

	private final List<String> fileNames = new ArrayList<String>();

	public ModelReader() {
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
		final Copier copier = new Copier(true, true);
		for (final String filename : getFileNames()) {
			try {
				this.log.info("Reading file: " + filename);
				final Resource res = resSet.createResource(URI.createURI(filename));
				res.load(null);
				final Collection<EObject> tmp = copier.copyAll(res.getContents());
				for (final EObject content : tmp) {
					addModelContent(content, ctx);
				}
			}
			catch (final IOException e) {
				throw new WorkflowException("Error at loading files!", e);
			}
		}
		copier.copyReferences();
	}

	private void addModelContent(final EObject content, final Context ctx) {
		if (content instanceof Amalthea) {
			final Amalthea tmpContent = (Amalthea) content;

			if (tmpContent.getCustomProperties() != null && tmpContent.getCustomProperties().size() > 0) {
				/*- Merging of CustomPropeties at the root level (central:Amalthea) from various models can lead to overwriting the contents (if same key's are defined)*/
				getAmaltheaModel(ctx).getCustomProperties().addAll(tmpContent.getCustomProperties());
			}

			if (tmpContent.getCommonElements() != null) {
				final Amalthea tmpModel = AmaltheaFactory.eINSTANCE.createAmalthea();
				tmpModel.setCommonElements(tmpContent.getCommonElements());
				AmaltheaMerger.addElements(getAmaltheaModel(ctx), Collections.singletonList(tmpModel));
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
	 * Adds a file location holding an {@link Amalthea} model. Eclipse URIs like
	 * <code> platform:/resource/... </code> can be used to specify the location
	 * if running inside of an Eclipse environment.
	 *
	 * @param fileName
	 *            the fileName to set
	 */
	public void addFileName(final String fileName) {
		this.fileNames.add(fileName);
	}

}
