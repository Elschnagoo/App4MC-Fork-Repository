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
package org.eclipse.app4mc.amalthea.converters111.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters111.utils.HelperUtils_110_111;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class ConstraintsConverter implements IConverter {

	private final HelperUtils_110_111 helper;
	private final Logger logger;

	public ConstraintsConverter() {
		this.helper = HelperUtils_110_111.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from itea.110 to itea.111 : Executing Constraints converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_111(rootElement);

		update_DataAgeCycle(rootElement);

		updateEnum_RunnableOrderType(rootElement);

		updateEnum_RunnableGroupingType(rootElement);


		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}


	private void update_DataAgeCycle(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("(.//dataAge/@maximumCyle)");


		final List<Attribute> constraints = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Attribute.class, this.helper.getNS_111("propertyconstraints"), this.helper.getGenericNS("xsi"));


		for (final Attribute attribute : constraints) {

			attribute.setName("maximumCycle");
		}

	}

	private void updateEnum_RunnableOrderType(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("(.//constraintsModel/runnableSequencingConstraints[not(@orderType)])");

		xpathBuffer.append("|");

		xpathBuffer.append("(./constraints:ConstraintsModel/runnableSequencingConstraints[not(@orderType)])");


		final List<Element> constraints = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_111("constraints"), this.helper.getGenericNS("xsi"));


		for (final Element constraint : constraints) {

			constraint.setAttribute("orderType", "successor");
		}

	}


	private void updateEnum_RunnableGroupingType(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("(.//constraintsModel/runnableSequencingConstraints/runnableGroups[not(@groupingType)])");

		xpathBuffer.append("|");

		xpathBuffer.append(
				"(./constraints:ConstraintsModel/runnableSequencingConstraints/runnableGroups[not(@groupingType)])");


		final List<Element> constraints = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_111("constraints"), this.helper.getGenericNS("xsi"));


		for (final Element constraint : constraints) {

			constraint.setAttribute("groupingType", "allOfThem");
		}

	}

}
