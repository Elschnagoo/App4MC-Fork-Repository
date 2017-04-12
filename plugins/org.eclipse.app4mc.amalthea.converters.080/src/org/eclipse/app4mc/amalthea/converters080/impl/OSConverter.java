/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters080.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters080.utils.HelperUtils_072_080;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the OS Model elements from 0.7.2 to 0.8.0 version format of AMALTHEA model
 *
 * @author mez2rng
 *
 */
public class OSConverter extends AbstractConverter {


	public OSConverter() {
		this.helper = HelperUtils_072_080.getInstance();
		this.logger = LogManager.getLogger(this.getClass());
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.2 to 0.8.0 : Starting OS converter");


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		move_OsDataConsistency_Element(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	/**
	 * Below migration is for the metamodel change w.r.t. OS model (For further details, check : Bug 515090 )
	 *
	 * OsDataConsistency is shifted from OSModel element to OperatingSystem element in APP4MC 0.8.0
	 *
	 * @param rootElement
	 */
	private void move_OsDataConsistency_Element(final Element rootElement) {


		final List<Element> osDataConsistencyElements = this.helper.getXpathResult(rootElement,
				"./osModel/osDataConsistency", Element.class, this.helper.getGenericNS("xsi"));


		final List<Element> operatingSystemElements = this.helper.getXpathResult(rootElement,
				"./osModel/operatingSystems", Element.class, this.helper.getGenericNS("xsi"));


		if (osDataConsistencyElements.size() > 0) {

			/*- As per the metamodel (0.7.2) there is a possiblitiy to have only one OsDataConsistency inside OsModel*/

			final Element osDataConsistencyElement = osDataConsistencyElements.get(0);

			for (final Element operatingSystemElement : operatingSystemElements) {

				final Element clone_osDataConsistencyElement = osDataConsistencyElement.clone();

				/*-As per change in 0.8.0 : OsDataConsistency element is added as a part of OperatingSystem element */

				operatingSystemElement.addContent(clone_osDataConsistencyElement);

			}

			/*-As per change in 0.8.0 : OsDataConsistency element is removed from OsModel */
			osDataConsistencyElement.getParentElement().removeContent(osDataConsistencyElement);


		}

	}


}
