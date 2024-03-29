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

package org.eclipse.app4mc.amalthea.converters110.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters.common.utils.Tags;
import org.eclipse.app4mc.amalthea.converters110.utils.HelperUtils_103_110;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;


public class OsConverter implements IConverter {

	private final HelperUtils_103_110 helper;
	private final Logger logger;

	public OsConverter() {
		this.helper = HelperUtils_103_110.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	public OsConverter(final HelperUtils_103_110 helper) {
		this.helper = helper;
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from itea.103 to itea.110 : Executing Mapping converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		// final String elementName = rootElement.getQualifiedName();

		this.helper.updateNameSpaces_to_110(rootElement);


		createOperatingSystem(root);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}

	/**
	 * This method is used to create element operatingSystems and associate the scheduler objects present inside
	 * .//os:OSModel/scheduler ( per 1.0.3) as taskSchedulers (per 1.1.0)
	 *
	 * @param root
	 */
	private void createOperatingSystem(final Document root) {

		List<Element> schedulers = this.helper.getXpathResult(root, ".//os:OSModel/scheduler", Element.class,
				this.helper.getNS_110("os"));

		if (schedulers.size() == 0) {
			schedulers = this.helper.getXpathResult(root, ".//osModel/scheduler", Element.class,
					this.helper.getNS_110("os"));
		}

		if (schedulers != null && schedulers.size() > 0) {

			final Element parentElement = schedulers.get(0).getParentElement();

			/*- Fetching location of element, so that new element can be added at the same location*/

			final int indexOfFirstScheduler = parentElement.indexOf(schedulers.get(0));

			final Element operatingSystem = new Element(Tags.operatingSystems.getValue());

			final Attribute osNameAttrib = new Attribute("name", "OperatingSystem");

			operatingSystem.setAttribute(osNameAttrib);

			/*-Adding Scheduler objects (from 1.0.3) as TaskScheduler's inside OperatingSystem*/

			parentElement.addContent(indexOfFirstScheduler, operatingSystem);


			for (final Element scheduler : schedulers) {

				scheduler.detach();

				scheduler.setName("taskSchedulers");

				operatingSystem.addContent(scheduler);

				updateAttribute_DeadlineMonotonic(scheduler);
			}
		}
	}

	/**
	 * This method is used to update the value of schedulingAlgorithm tags containing attribute as :
	 * os:DeadlineMonotinic to os:DeadlineMonotonic
	 *
	 * @param schedulerElement
	 *            Element of Scheduler.
	 */
	private void updateAttribute_DeadlineMonotonic(final Element schedulerElement) {

		final List<Attribute> osTypeList = this.helper.getXpathResult(schedulerElement,
				"./schedulingAlgorithm/@xsi:type[.=\"os:DeadlineMonotinic\"]", Attribute.class,
				this.helper.getGenericNS("xsi"));

		for (final Attribute attribute : osTypeList) {

			attribute.setValue("os:DeadlineMonotonic");
		}


	}
}
