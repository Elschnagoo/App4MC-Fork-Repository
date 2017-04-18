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
package org.eclipse.app4mc.amalthea.converters110.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters110.utils.HelperUtils_103_110;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class SwConverter implements IConverter {

	private final HelperUtils_103_110 helper;
	private final Logger logger;

	public SwConverter() {
		this.helper = HelperUtils_103_110.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");

	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from itea.103 to itea.110 : Starting SW converter for model file : " + targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_110(rootElement);

		/*-
		 * For migration of model from 1.0.3 to 1.1.0, one Class is to be considred :
		 *
		 *  - LabelAccessStatistic
		 *
		 */

		updateLabelAccessStatistic(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}

	private void updateLabelAccessStatistic(final Element rootElement) {

		/*- get all LabelAccess elements .
		 *
		 * Note: sw:LabelAccess (RunnableItem) is referred inside several elements either as  runnableItems or runnableItem
		 *
		 * Due to this reason, two different Xpath's are applied
		 *
		 *  */

		List<Element> labelAccessElements = this.helper.getXpathResult(rootElement,
				".//runnableItems[@xsi:type=\"sw:LabelAccess\"]", Element.class, this.helper.getNS_110("sw"),
				this.helper.getGenericNS("xsi"));

		updateLabelAccessElements(labelAccessElements);


		labelAccessElements = this.helper.getXpathResult(rootElement, ".//runnableItem[@xsi:type=\"sw:LabelAccess\"]",
				Element.class, this.helper.getNS_110("sw"), this.helper.getGenericNS("xsi"));

		updateLabelAccessElements(labelAccessElements);

	}

	private void updateLabelAccessElements(final List<Element> labelAccessElements) {
		for (final Element labelAccessElement : labelAccessElements) {


			final Attribute labelAccessEnumAttribute = labelAccessElement.getAttribute("access");

			/*- As per 1.0.3, default value of LabelAccessEnum is "read". In case user doesn't specify value
			 * explicitly, then "access" attribute will not be available in the model file.
			 *
			 * Case 1: when LabelAccessEnum is explicitly set by the user
			 *
			 * <runnableItems xsi:type="sw:LabelAccess" xmi:id="_Z7ArEJNVEeWQC6k3Y09j_A" access="write">
			 *
			 * Case 2: when LabelAccessEnum is not set by the user
			 *
			 *  <runnableItems xsi:type="sw:LabelAccess" xmi:id="_K853kJNWEeWQC6k3Y09j_A" data="_9SS-MJNUEeWQC6k3Y09j_A">
			 */

			String labelAccessTypeValue = "read";

			if (labelAccessEnumAttribute != null) {
				labelAccessTypeValue = labelAccessEnumAttribute.getValue();
			}

			final Element labelAccessStatisticElement = labelAccessElement.getChild("statistic");

			if (labelAccessStatisticElement != null) {

				/*-As per 1.1.0, LabelAccessStatisitc should have a field "value" instead of read & write.
				 *
				 * Contents of value should be based on LabelAccessEnum value.
				 *
				 * During the migration, following steps are considred:
				 *
				 * 1.If LabelAccessEnum value is default / read:
				 *   - read tag inside statistic tag, is renamed to value
				 *   - write tag inside statistic tag is removed
				 *
				 * 2.If LabelAccessEnum value is write:
				 *   - read tag inside statistic tag, is removed
				 *   - write tag inside statistic tag is renamed to value
				 *
				 *
				 *  */

				final Element readElement = labelAccessStatisticElement.getChild("read");
				final Element writeElement = labelAccessStatisticElement.getChild("write");
				final Element cacheMissesElement = labelAccessStatisticElement.getChild("readCacheMisses");


				if (labelAccessTypeValue.equals("read") && (readElement != null)) {
					/*- removing write element */
					if (writeElement != null) {
						writeElement.detach();
					}
					readElement.setName("value");

				}
				else if (labelAccessTypeValue.equals("write") && (writeElement != null)) {
					/*- removing read element */
					if (readElement != null) {

						readElement.detach();
					}
					writeElement.setName("value");
				}

				/*- readCacheMisses (1.0.3) is renamed to cacheMisses (1.1.0) */
				if (cacheMissesElement != null) {
					cacheMissesElement.setName("cacheMisses");
				}

			}

		}
	}

}
