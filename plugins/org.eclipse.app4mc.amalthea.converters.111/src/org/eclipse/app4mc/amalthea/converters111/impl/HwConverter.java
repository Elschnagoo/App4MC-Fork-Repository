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

public class HwConverter implements IConverter {

	private final HelperUtils_110_111 helper;
	private final Logger logger;

	public HwConverter() {
		this.helper = HelperUtils_110_111.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from itea.110 to itea.111 : Executing HW converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_111(rootElement);

		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("os"));

		updateEnum_QType(rootElement);

		updateEnum_MemoryType(rootElement);

		updateEnum_BusType(rootElement);

		updateEnum_RWType(rootElement);

		updateEnum_SchedType(rootElement);

		updateEnum_PinType(rootElement);

		updateEnum_FeatureType(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}

	private void updateEnum_QType(final Element rootElement) {

		/*- QType enum is contained inside Quartz. Quartz is contained inside ComplexNode class, using variable name as quartzes*/

		/*--
		 * Migraiton step to 111 from 110: Grep the references of "quartzes" and "hw:Quartz" tag which do not contain "type" attribute
		 */

		final List<Element> quartzElements = this.helper.getXpathResult(rootElement,
				".//quartzes[not(@type)]|/hw:Quartz[not(@type)]", Element.class, this.helper.getNS_111("hw"));


		for (final Element quartzElement : quartzElements) {

			quartzElement.setAttribute("type", "DYNAMIC");
		}

	}

	private void updateEnum_MemoryType(final Element rootElement) {

		/*- MemoryType enum is contained inside MemType. MemType is contained inside "HWModel class using variable memoryTypes "and inside "PropertyConstraintsModel class using variable name as memTypeDefinitions" */

		/*--
		 * Migraiton step to 111 from 110: Grep the references of "memoryTypes" , "memTypeDefinitions"  and "hw:MemType" tag which do not contain "type" attribute
		 */

		final List<Element> quartzElements = this.helper.getXpathResult(rootElement,
				".//memoryTypes[not(@type)]|.//memTypeDefinitions[not(@type)]|/hw:MemType[not(@type)]", Element.class,
				this.helper.getNS_111("hw"));


		for (final Element quartzElement : quartzElements) {

			quartzElement.setAttribute("type", "RAM");
		}

	}

	private void updateEnum_BusType(final Element rootElement) {

		/*- BusType enum is contained inside Bus. Bus is contained inside "HWModel class using variable networkTypes " */

		/*--
		 * Migraiton step to 111 from 110: Grep the references of "memoryTypes" , "memTypeDefinitions"  and "hw:Bus" tag which do not contain "busType" attribute
		 */

		final List<Element> quartzElements = this.helper.getXpathResult(rootElement,
				".//networkTypes[(@xsi:type=\"hw:Bus\") and not(@busType)]|/hw:Bus[not(@busType)]", Element.class,
				this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));


		for (final Element quartzElement : quartzElements) {

			quartzElement.setAttribute("busType", "CAN");
		}

	}

	private void updateEnum_RWType(final Element rootElement) {

		/*- RWType enum is contained inside ComplexPort, ComplexPin
		 *
		 * ComplexPort is extending Port
		 * ComplexPin is extending Pin
		 *
		 *
		 *
		 * Pin is contained inside "Port class using variable pins "
		 *
		 * Port is contained inside "ComplexNode class using varibale ports"
		 *
		 *  */

		/*--
		 * Migraiton step to 111 from 110: Grep the references of "ports" , "pins"  , "hw:ComplexPort" and "hw:ComplexPin" tag which do not contain "direction" attribute
		 */

		final List<Element> quartzElements = this.helper.getXpathResult(rootElement,
				".//ports[(@xsi:type=\"hw:ComplexPort\") and not(@direction)]|.//pins[(@xsi:type=\"hw:ComplexPin\") and not(@direction)]|/hw:ComplexPort[not(@direction)]|/hw:ComplexPin[not(@direction)]",
				Element.class, this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));


		for (final Element quartzElement : quartzElements) {

			quartzElement.setAttribute("direction", "R");
		}

	}

	private void updateEnum_SchedType(final Element rootElement) {

		/*- SchedType enum is contained inside NetworkType with variable schedPolicy
		 *
		 *
		 * NetworkType is contained inside "HWModel class using variable networkTypes "
		 *
		 *
		 *  */

		/*--
		 * Migraiton step to 111 from 110: Grep the references of "networkTypes" and "hw:NetworkType" tag which do not contain "schedPolicy" attribute
		 */

		final List<Element> quartzElements = this.helper.getXpathResult(rootElement,
				".//networkTypes[not(@schedPolicy)]|/hw:NetworkType[not(@schedPolicy)]", Element.class,
				this.helper.getNS_111("hw"));


		for (final Element quartzElement : quartzElements) {

			quartzElement.setAttribute("schedPolicy", "RROBIN");
		}

	}

	private void updateEnum_PinType(final Element rootElement) {

		/*- PinType enum is contained inside ComplexPin with variable type
		 *
		 * ComplexPin is contained inside "Port class using variable pins "
		 */

		/*--
		 * Migraiton step to 111 from 110: Grep the references of "pins" and "hw:ComplexPin" tag which do not contain "type" attribute
		 */

		final List<Element> quartzElements = this.helper.getXpathResult(rootElement,
				".//pins[(@xsi:type=\"hw:ComplexPin\") and not(@type)]|/hw:ComplexPin[not(@type)]", Element.class,
				this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));


		for (final Element quartzElement : quartzElements) {

			quartzElement.setAttribute("type", "ANALOG");
		}

	}

	private void updateEnum_FeatureType(final Element rootElement) {

		/*- FeatureType enum is contained inside FeatureTypes with variable value
		 *
		 * FeatureTypes is contained inside "ComplexNode class using variable features "
		 */

		/*--
		 * Migraiton step to 111 from 110: Grep the references of "features" and "hw:FeatureTypes" tag which do not contain "value" attribute
		 */

		final List<Element> quartzElements = this.helper.getXpathResult(rootElement,
				".//features[(@xsi:type=\"hw:FeatureTypes\") and  not(@value)]|/hw:FeatureTypes[not(@value)]",
				Element.class, this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));


		for (final Element quartzElement : quartzElements) {

			quartzElement.setAttribute("value", "floatingPointUnit");
		}

	}


}
