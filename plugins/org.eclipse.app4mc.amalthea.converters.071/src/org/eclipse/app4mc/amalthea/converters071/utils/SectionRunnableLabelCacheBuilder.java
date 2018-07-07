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

package org.eclipse.app4mc.amalthea.converters071.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class SectionRunnableLabelCacheBuilder implements ICache {

	private final Map<File, Map<String, Object>> map = new HashMap<File, Map<String, Object>>();
	private final HelperUtils_070_071 helper;

	public SectionRunnableLabelCacheBuilder() {
		this.helper = HelperUtils_070_071.getInstance();
	}


	@Override
	public void buildCache(final Map<File, Document> fileName_documentsMap) {

		for (final File targetFile : fileName_documentsMap.keySet()) {

			final Document document1 = fileName_documentsMap.get(targetFile);

			if (document1 == null) {
				// log error message
				continue;
			}

			final Element rootElement = document1.getRootElement();

			/*- Start : Cache initialization */

			getCacheMap().put(targetFile, new HashMap<String, Object>());

			final Map<String, List<String>> label_Sections_Map = new HashMap<String, List<String>>();

			getCacheMap().get(targetFile).put(SectionRunnableLabelCacheEnum.Label_Sections.name(), label_Sections_Map);

			final Map<String, List<String>> runnable_Sections_Map = new HashMap<String, List<String>>();

			getCacheMap().get(targetFile).put(SectionRunnableLabelCacheEnum.Runnable_Sections.name(),
					runnable_Sections_Map);

			final List<String> section_Names = new ArrayList<String>();

			getCacheMap().get(targetFile).put(SectionRunnableLabelCacheEnum.Section_Names.name(), section_Names);


			/*-
			 * Note: Below two cache elements are used to support the models which are migrated from version 1.0.3/1.1.0 to the higher versions
			 */

			final Map<String, List<String>> labelUUID_Sections = new HashMap<String, List<String>>();

			getCacheMap().get(targetFile).put(SectionRunnableLabelCacheEnum.Label_UUID_Sections.name(),
					labelUUID_Sections);

			final Map<String, List<String>> runnableUUID_Sections = new HashMap<String, List<String>>();

			getCacheMap().get(targetFile).put(SectionRunnableLabelCacheEnum.Runnable_UUID_Sections.name(),
					runnableUUID_Sections);

			/*- End : Cache initialization */


			final List<Element> sectionElements = this.helper.getXpathResult(rootElement, "./swModel/sections",
					Element.class, this.helper.getNS_070("am"));


			for (final Element sectionElement : sectionElements) {

				final String sectionName = sectionElement.getAttributeValue("name");
				/*-adding section name in the cache */
				section_Names.add(sectionName);


				final Attribute labelsAttribute = sectionElement.getAttribute("labels");

				if (labelsAttribute != null) {
					extract_MemoryElement_Section_Info(label_Sections_Map, sectionName, labelsAttribute,
							labelUUID_Sections);
				}

				final Attribute runEntitiesAttribute = sectionElement.getAttribute("runEntities");

				if (runEntitiesAttribute != null) {
					extract_MemoryElement_Section_Info(runnable_Sections_Map, sectionName, runEntitiesAttribute,
							runnableUUID_Sections);
				}


				final List<Element> labelElements = sectionElement.getChildren("labels");

				for (final Element element : labelElements) {
					extract_MemoryElement_Section_Info(label_Sections_Map, sectionName, element, labelUUID_Sections);
				}

				final List<Element> runnableElements = sectionElement.getChildren("runEntities");

				for (final Element element : runnableElements) {
					extract_MemoryElement_Section_Info(runnable_Sections_Map, sectionName, element,
							runnableUUID_Sections);

				}
			}
		}

	}

	/**
	 * This method is used to populate the Label/Runnable name (i.e. MemoryElement name) and the corresponding Section
	 * names to which they are associated to
	 *
	 * @param memoryElement_Sections_Map
	 *            this map is part of the cache. Depending on type of the MemoryElement i.e. either Label or Runnable,
	 *            corresponding map is supplied to this method
	 * @param sectionName
	 *            Name of the section to which MemorElement (i.e. Label/Runnable) is associated to
	 * @param memoryElementAttribute
	 *            This the attribute of sections node (in amxmi). This can be either runEntities or labels attribute
	 *            <b>Note:</b> In case MemoryElements (Label/Runnable) which are defined in the same amxmi as the
	 *            section, then the corresponding references of label/runnable are generated inside labels/runEntities
	 *            attribute<br>
	 *            Example: <sections name="section6" labels="label6?type=Label" runEntities="Runnable7?type=Runnable"/>
	 * @param memMElementUUID_Sections
	 */
	private void extract_MemoryElement_Section_Info(final Map<String, List<String>> memoryElement_Sections_Map,
			final String sectionName, final Attribute memoryElementAttribute,
			final Map<String, List<String>> memMElementUUID_Sections) {
		final String memoryElementAttributeValue = memoryElementAttribute.getValue();

		final StringTokenizer stk = new StringTokenizer(memoryElementAttributeValue);

		while (stk.hasMoreTokens()) {
			final String memoryElementReferenceString = stk.nextToken();

			final int lastIndexOf = memoryElementReferenceString.lastIndexOf("?");
			if (lastIndexOf != -1) {
				final String memoryElementName = memoryElementReferenceString.substring(0, lastIndexOf);

				addEntry(memoryElement_Sections_Map, memoryElementName, sectionName);
			}
			else {
				/*-
				 *  This is a case of UUID instead of AMALTHEA references
				 *  Example:
				 *  labels="_o_iL8JnJEeaK1-VgfUoZ4A _qHmnQJnJEeaK1-VgfUoZ4A"
				 */

				List<String> list = memMElementUUID_Sections.get(memoryElementReferenceString);

				if (list == null) {
					list = new ArrayList<String>();
					memMElementUUID_Sections.put(memoryElementReferenceString, list);
				}
				list.add(sectionName);
			}
		}
	}

	/**
	 * This method is used to populate the Label/Runnable name (i.e. MemoryElement name) and the corresponding Section
	 * names to which they are associated to
	 *
	 * @param memoryElement_Sections_Map
	 *            this map is part of the cache. Depending on type of the MemoryElement i.e. either Label or Runnable,
	 *            corresponding map is supplied to this method
	 * @param sectionName
	 *            Name of the section to which MemorElement (i.e. Label/Runnable) is associated to
	 * @param memoryElement
	 *            This the Element of MemoryElement i.e either Label/Runnable. In amxmi this can be either runEntities
	 *            or labels element <b>Note:</b> In case MemoryElements (Label/Runnable) which are defined in the
	 *            different amxmi than the section, then the corresponding references of label/runnable are generated
	 *            inside labels/runEntities elements<br>
	 *            Example:<br>
	 *            <sections name="Section1"><br>
	 *            <labels href="amlt:/#label1?type=Label"/><br>
	 *            <labels href="amlt:/#label2?type=Label"/><br>
	 *            <labels href="amlt:/#label3?type=Label"/><br>
	 *            <runEntities href="amlt:/#Runnable1?type=Runnable"/><br>
	 *            <runEntities href="amlt:/#Runnable2?type=Runnable"/><br>
	 *            <runEntities href="amlt:/#Runnable3?type=Runnable"/><br>
	 *            </sections><br>
	 * @param memMElementUUID_Sections
	 */
	private void extract_MemoryElement_Section_Info(final Map<String, List<String>> memoryElement_Sections_Map,
			final String sectionName, final Element memoryElement,
			final Map<String, List<String>> memElementUUID_Sections) {

		final String memoryElementAttributeValue = memoryElement.getAttributeValue("href");

		if (memoryElementAttributeValue != null) {

			final int indexOfHash = memoryElementAttributeValue.lastIndexOf("#");

			final int indexOfQuestionmark = memoryElementAttributeValue.lastIndexOf("?");

			if ((indexOfHash != -1) && (indexOfQuestionmark != -1)) {
				final String memroyElementName = memoryElementAttributeValue.substring(indexOfHash + 1,
						indexOfQuestionmark);

				addEntry(memoryElement_Sections_Map, memroyElementName, sectionName);
			}
			else if (indexOfHash != -1) {
				/*-
				 *  This is a case of UUID instead of AMALTHEA references
				 *  Example:
				 *  <sections xmi:id="_rcL0kJnJEeaK1-VgfUoZ4A" name="s1" >
				 *		<labels href="#_o_iL8JnJEeaK1-VgfUoZ4A"/>
				 *		<labels href="#_qHmnQJnJEeaK1-VgfUoZ4A"/>
				 *		<labels href="default1.amxmi#_fjEtAJnTEeaK1-VgfUoZ4A "/>
				 *	</sections>
				 */

				final String memoryElementID = memoryElementAttributeValue.substring(indexOfHash + 1);

				List<String> list = memElementUUID_Sections.get(memoryElementID);

				if (list == null) {
					list = new ArrayList<String>();
					memElementUUID_Sections.put(memoryElementID, list);
				}

				list.add(sectionName);
			}
		}

	}

	/*- Add a entry  */

	private void addEntry(final Map<String, List<String>> memoryElement_Sections_Map, final String memoryElementName,
			final String sectionName) {

		if (!memoryElement_Sections_Map.containsKey(memoryElementName)) {

			memoryElement_Sections_Map.put(memoryElementName, new ArrayList<String>());
		}
		memoryElement_Sections_Map.get(memoryElementName).add(sectionName);

	}

	@Override
	public Map<File, Map<String, Object>> getCacheMap() {
		return this.map;
	}

	@Override
	public void clearCacheMap() {

		this.map.clear();
	}


}
