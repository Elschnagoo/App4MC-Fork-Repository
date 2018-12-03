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

package org.eclipse.app4mc.amalthea.converters070.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.eclipse.app4mc.amalthea.converters070.utils.HelperUtils_111_070;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class ContentConverter implements IConverter {
	private final HelperUtils_111_070 helper;
	private final Map<String, String> old_new_mappingTypes;
	private final Logger logger;

	public ContentConverter() {
		this.helper = HelperUtils_111_070.getInstance();
		this.old_new_mappingTypes = new HashMap<String, String>();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from itea.111 to 0.7.0 : Executing Content converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}

		buildMappingTypesMap();

		updateNameSpaces(root.getRootElement());

		updateTypes(root.getRootElement());

		updateReferences(root.getRootElement());

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	/**
	 * This method should contain the mapping of old and new types
	 */
	private void buildMappingTypesMap() {

		this.old_new_mappingTypes.put("sw.OSEvent", "OsEvent");
		this.old_new_mappingTypes.put("sw:OSEvent", "am:OsEvent");

		this.old_new_mappingTypes.put("sw.Periodic", "PeriodicActivation");
		this.old_new_mappingTypes.put("sw:Periodic", "am:PeriodicActivation");

		this.old_new_mappingTypes.put("hw.MemType", "MemoryType");
		this.old_new_mappingTypes.put("hw:MemType", "am:MemoryType");

		this.old_new_mappingTypes.put("hw.MemoryType", "MemoryTypeEnum");
		this.old_new_mappingTypes.put("hw:MemoryTypeEnum", "am:MemoryTypeEnum");

		/*---*/
		this.old_new_mappingTypes.put("hw.System", "HwSystem");
		this.old_new_mappingTypes.put("hw:System", "am:HwSystem");

		this.old_new_mappingTypes.put("hw.Component", "HwComponent");
		this.old_new_mappingTypes.put("hw:Component", "am:HwComponent");

		this.old_new_mappingTypes.put("hw.Port", "HwPort");
		this.old_new_mappingTypes.put("hw:Port", "am:HwPort");

		this.old_new_mappingTypes.put("hw.AbstractionType", "AbstractionTypeDescription");
		this.old_new_mappingTypes.put("hw:AbstractionType", "am:AbstractionTypeDescription");


	}

	/**
	 * This method is used to update the root element name and the corresponding namespaces
	 */
	private void updateNameSpaces(final Element rootElement) {

		this.helper.updateRootElement_NameSpaces_to_070(rootElement);
	}


	/**
	 * - This method is used to update xsi:type attributes value, so that Types with new newspace are present
	 *
	 * example:
	 *
	 * Input model file content:
	 *
	 * <calls xsi:type="sw:TaskRunnableCall" runnable="//@swModel/@runnables.1072"/>
	 *
	 * Expect output after conversion:
	 *
	 * <calls xsi:type="am:TaskRunnableCall" runnable="//@swModel/@runnables.1072" />
	 *
	 * xsi:type should be converted from sw:TaskRunnableCall to am:TaskRunnableCall
	 *
	 * Note: This conversion is performed only for the AMALTHEA namespaces (available in 1.1.1).
	 *
	 * ## -- Types from Franca is not converted to have model namespace
	 *
	 * @param rootElement
	 */
	private void updateTypes(final Element rootElement) {

		final Map<String, List<Attribute>> typeAttributesMap = new HashMap<String, List<Attribute>>();

		final List<Attribute> types = this.helper.getXpathResult(rootElement, ".//@xsi:type", Attribute.class,
				this.helper.getGenericNS("xsi"));


		/*- Group attributes having same value */
		for (final Attribute typeAttribute : types) {
			final String typeValue = (typeAttribute.getValue());

			if (!typeAttributesMap.containsKey(typeValue)) {
				typeAttributesMap.put(typeValue, new ArrayList<Attribute>());
			}
			typeAttributesMap.get(typeValue).add(typeAttribute);
		}


		/*- loop through the xsi:type's and update the attributes */
		for (final String typeValue : typeAttributesMap.keySet()) {

			/*-Example  "sw:LabelAccess"-*/


			if (typeValue.contains(":")) {

				/* =============check if the mapping is not configured and then execute the below code ============= */
				if (!this.old_new_mappingTypes.containsKey(typeValue)) {

					final int indexOfColon = typeValue.indexOf(":");

					/*- sw */
					final String nameSpacePrefix = typeValue.substring(0, indexOfColon);

					/*-check if sw namespace prefix is valid as per 1.1.1*/
					if (this.helper.enumTypeContainsIn111(nameSpacePrefix)) {

						/*-get the part on the right side of ":" */

						/*-LabelAccess*/
						final String substring = (typeValue.length() > indexOfColon + 1)
								? typeValue.substring(indexOfColon + 1) : "";

						/*-am:LabelAccess*/
						final String type = "am:" + substring;

						final List<Attribute> attribsList = typeAttributesMap.get(typeValue);

						for (final Attribute attribute : attribsList) {
							attribute.setValue(type);
						}

					}

				}
				else {
					/* =========Mapping is configured =============== */

					final String updatedValue = this.old_new_mappingTypes.get(typeValue);

					final List<Attribute> attribsList = typeAttributesMap.get(typeValue);

					for (final Attribute attribute : attribsList) {
						attribute.setValue(updatedValue);
					}


				}
			}
		}
	}

	/**
	 * - This method is used to update the references inside the model and cross document references, so that references
	 * are present as per the new concept introduced in 0.7.0
	 *
	 * example:
	 *
	 * Input model file content:
	 *
	 * <runnableItems xsi:type="sw:LabelAccess" data="ABSMode?type=sw.Label" access="write" isBuffered="inherited"/>
	 *
	 * Expect output after conversion:
	 *
	 * <runnableItems xsi:type="am:LabelAccess" data="ABSMode?type=Label" access="write" isBuffered="inherited" />
	 *
	 * references should be updated without having namespace prefix of the packages for all the Types
	 *
	 * In the above example, data attribute is to be updated from value "ABSMode?type=sw.Label" to "ABSMode?type=Label"
	 *
	 *
	 * @param rootElement
	 */
	private void updateReferences(final Element rootElement) {

		final Map<String, List<Attribute>> typeAttributesMap = new HashMap<String, List<Attribute>>();

		final List<Attribute> types = this.helper.getXpathResult(rootElement, ".//@*", Attribute.class,
				this.helper.getGenericNS("xsi"));


		/*- Group attributes having same value */
		for (final Attribute typeAttribute : types) {
			final String typeValue = (typeAttribute.getValue());

			/*- As per 1.1.1, references will be in the following format : "<element name>?type=<namespace prefix>.<Element Type>"
			 * example: "BrakePedalPosition?type=sw.Label"
			 */
			if (typeValue.contains("?type=")) {

				if (!typeAttributesMap.containsKey(typeValue)) {
					typeAttributesMap.put(typeValue, new ArrayList<Attribute>());
				}
				typeAttributesMap.get(typeValue).add(typeAttribute);

			}

		}


		/*- loop through the attributes containing references in 1.1.1 format */

		for (final String refString : typeAttributesMap.keySet()) {

			/*- It is also possible to have references to multiple elements (delimited with space)
			 * Eample: <eventMask events="OS_Event_1?type=sw.OSEvent OS_Event_2?type=sw.OSEvent"/>
			 *
			 */

			final StringTokenizer tokenizer = new StringTokenizer(refString);

			final StringBuffer convertedReferencesBuffer = new StringBuffer();

			while (tokenizer.hasMoreTokens()) {

				final String typeValue = tokenizer.nextToken();

				/*- Example: "BrakePedalPosition?type=sw.Label" */

				final int indexOfColon = typeValue.indexOf("=");

				/*- BrakePedalPosition?type */
				final String ref_part_1 = typeValue.substring(0, indexOfColon);

				/*-sw.Label*/
				final String ref_part_2 = (typeValue.length() > (indexOfColon + 1))
						? typeValue.substring(indexOfColon + 1) : "";


				String convertedRefString = "";

				if (!this.old_new_mappingTypes.containsKey(ref_part_2)) {

					/*-sw.Label*/
					if (ref_part_2.contains(".")) {

						final int indexOfDot = ref_part_2.indexOf(".");

						/* sw */
						// final String nameSpacePrefix = ref_part_2.substring(0, indexOfDot);

						/*-Label*/
						final String type = (ref_part_2.length() > (indexOfDot + 1))
								? ref_part_2.substring(indexOfDot + 1) : "";

						/*- BrakePedalPosition?type=Label */
						convertedRefString = ref_part_1 + "=" + type;

					}

				}
				else {
					/*- BrakePedalPosition?type=Label */
					convertedRefString = ref_part_1 + "=" + this.old_new_mappingTypes.get(ref_part_2);
				}
				convertedReferencesBuffer.append(convertedRefString + " ");
			}

			final List<Attribute> attribsList = typeAttributesMap.get(refString);

			for (final Attribute attribute : attribsList) {
				/* updating of convertedRefString */
				attribute.setValue(convertedReferencesBuffer.toString().trim());
			}


		}

	}

	@SuppressWarnings("unused")
	private HelperUtils_111_070 getHelper(final AbstractHelper helper) {
		if (!(helper instanceof HelperUtils_111_070)) {

			return HelperUtils_111_070.getInstance();
		}
		return (HelperUtils_111_070) helper;
	}


}

