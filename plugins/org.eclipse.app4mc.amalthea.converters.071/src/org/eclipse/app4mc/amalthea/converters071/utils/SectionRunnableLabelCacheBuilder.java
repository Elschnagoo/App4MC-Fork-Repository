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

			/*- End : Cache initialization */


			final List<Element> sectionElements = this.helper.getXpathResult(rootElement, "./swModel/sections",
					Element.class, this.helper.getNS_070("am"));


			for (final Element sectionElement : sectionElements) {

				final String sectionName = sectionElement.getAttributeValue("name");
				/*-adding section name in the cache */
				section_Names.add(sectionName);


				final Attribute labelsAttribute = sectionElement.getAttribute("labels");

				if (labelsAttribute != null) {
					extract_MemoryElement_Section_Info(label_Sections_Map, sectionName, labelsAttribute);
				}

				final Attribute runEntitiesAttribute = sectionElement.getAttribute("runEntities");

				if (runEntitiesAttribute != null) {
					extract_MemoryElement_Section_Info(runnable_Sections_Map, sectionName, runEntitiesAttribute);
				}


				final List<Element> labelElements = sectionElement.getChildren("labels");

				for (final Element element : labelElements) {
					extract_MemoryElement_Section_Info(label_Sections_Map, sectionName, element);
				}

				final List<Element> runnableElements = sectionElement.getChildren("runEntities");

				for (final Element element : runnableElements) {
					extract_MemoryElement_Section_Info(runnable_Sections_Map, sectionName, element);

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
	 */
	private void extract_MemoryElement_Section_Info(final Map<String, List<String>> memoryElement_Sections_Map,
			final String sectionName, final Attribute memoryElementAttribute) {
		final String memoryElementAttributeValue = memoryElementAttribute.getValue();

		final StringTokenizer stk = new StringTokenizer(memoryElementAttributeValue);

		while (stk.hasMoreTokens()) {
			final String memoryElementReferenceString = stk.nextToken();

			final int lastIndexOf = memoryElementReferenceString.lastIndexOf("?");
			if (lastIndexOf != -1) {
				final String memoryElementName = memoryElementReferenceString.substring(0, lastIndexOf);

				addEntry(memoryElement_Sections_Map, memoryElementName, sectionName);
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
	 */
	private void extract_MemoryElement_Section_Info(final Map<String, List<String>> memoryElement_Sections_Map,
			final String sectionName, final Element memoryElement) {

		final String memoryElementAttributeValue = memoryElement.getAttributeValue("href");

		if (memoryElementAttributeValue != null) {

			final int firstIndexOf = memoryElementAttributeValue.lastIndexOf("#");

			final int lastIndexOf = memoryElementAttributeValue.lastIndexOf("?");

			if ((firstIndexOf != -1) && (lastIndexOf != -1)) {
				final String memroyElementName = memoryElementAttributeValue.substring(firstIndexOf + 1, lastIndexOf);

				addEntry(memoryElement_Sections_Map, memroyElementName, sectionName);
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
