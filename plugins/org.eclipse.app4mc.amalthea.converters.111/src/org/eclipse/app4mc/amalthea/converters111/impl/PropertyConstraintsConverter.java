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
import org.jdom2.Document;
import org.jdom2.Element;

public class PropertyConstraintsConverter implements IConverter {

	private final HelperUtils_110_111 helper;
	private final Logger logger;

	public PropertyConstraintsConverter() {
		this.helper = HelperUtils_110_111.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger
				.info("Migration from itea.110 to itea.111 : Executing PropertyConstraints converter for model file : "
						+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_111(rootElement);

		updateEnum_ComparatorType(rootElement);

		updateEnum_ConjunctionType(rootElement);


		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}

	/*-
	 *
	 *Below is the structure of 1.1.0 and 1.1.1	 for PropertyConstraintsModel
	 *
	 *
	 *  AllocationConstraint
	 *	    - HwCoreConstraint
	 *
	 *	HwCoreConstraint (Abstract class)
	 *		- HwCoreProperty
	 *			- ComparatorType comparator
	 *
	 *		 - HwCoreConjunction
	 *			- ConjunctionType conjunction
	 *			- contains resolving HwCoreConstraint firstConstraint
	 *			- contains resolving HwCoreConstraint secondConstraint
	 *
	 *
	 *
	 *	 =====================================
	 *	 MappingConstraint
	 *	  - HwMemoryConstraint
	 *
	 *
	 *	 HwMemoryConstraint
	 *			 - HwMemoryProperty
	 *					- ComparatorType comparator
	 *			 - HwMemoryConjunction
	 *					- ConjunctionType conjunction
	 *					- contains resolving HwCoreConstraint firstConstraint
	 *					- contains resolving HwCoreConstraint secondConstraint
	 *
	 */

	private void updateEnum_ComparatorType(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(
				"(.//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreProperty\")  and not(@comparator)])");

		xpathBuffer.append("|");

		xpathBuffer.append(
				"(.//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")]//firstConstraint[(@xsi:type=\"propertyconstraints:HwCoreProperty\") and not(@comparator)])");


		xpathBuffer.append("|");

		xpathBuffer.append(
				"(.//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")]//secondConstraint[(@xsi:type=\"propertyconstraints:HwCoreProperty\")  and not(@comparator)])");

		xpathBuffer.append("|");

		xpathBuffer.append(
				"(.//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryProperty\")  and not(@comparator)])");

		xpathBuffer.append("|");

		xpathBuffer.append(
				"(.//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")]//firstConstraint[(@xsi:type=\"propertyconstraints:HwMemoryProperty\")  and not(@comparator)])");


		xpathBuffer.append("|");

		xpathBuffer.append(
				"(.//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")]//secondConstraint[(@xsi:type=\"propertyconstraints:HwMemoryProperty\")  and not(@comparator)])");


		final List<Element> constraints = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_111("propertyconstraints"), this.helper.getGenericNS("xsi"));


		for (final Element constraint : constraints) {

			constraint.setAttribute("comparator", "equal");
		}

	}

	private void updateEnum_ConjunctionType(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(
				".//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")  and not(@conjunction)]");

		xpathBuffer.append("|");

		xpathBuffer.append(
				".//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")]// firstConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")  and not(@conjunction)]");


		xpathBuffer.append("|");

		xpathBuffer.append(
				".//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")]// secondConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")  and not(@conjunction)] ");

		xpathBuffer.append("|");

		xpathBuffer.append(
				".//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")  and not(@conjunction)]");

		xpathBuffer.append("|");

		xpathBuffer.append(
				".//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")]// firstConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")  and not(@conjunction)] ");


		xpathBuffer.append("|");

		xpathBuffer.append(
				".//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")]// secondConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")  and not(@conjunction)] ");


		final List<Element> constraints = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_111("propertyconstraints"), this.helper.getGenericNS("xsi"));


		for (final Element constraint : constraints) {

			constraint.setAttribute("conjunction", "and");
		}

	}


}
