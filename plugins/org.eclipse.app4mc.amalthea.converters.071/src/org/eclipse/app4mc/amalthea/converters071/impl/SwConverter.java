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
package org.eclipse.app4mc.amalthea.converters071.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters071.utils.HelperUtils_070_071;
import org.eclipse.app4mc.amalthea.converters071.utils.SectionRunnableLabelCacheBuilder;
import org.eclipse.app4mc.amalthea.converters071.utils.SectionRunnableLabelCacheEnum;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

import com.google.common.base.Joiner;

public class SwConverter implements IConverter {

	private final HelperUtils_070_071 helper;

	private final Logger logger;

	private List<ICache> caches;


	private Map<File, Document> fileName_documentsMap;

	public SwConverter() {
		this.helper = HelperUtils_070_071.getInstance();
		this.logger = LogManager.getLogger(this.getClass());
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.0 to 0.7.1 : Starting Sw converter");

		this.caches = caches;

		this.fileName_documentsMap = fileName_documentsMap;

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		/*- Migration of DataSize attributes */
		update_DataSize(rootElement);

		/*- association of MemoryElements (i.e Label/Runnable elements) with the corresponding Section as per 0.7.1 changes*/
		update_MemoryElements_With_Section_Info(rootElement);

		/*-updation of Section as per 0.7.1 i.e. labels, runEntities, size will be removed */
		update_Section(rootElement);

		/*- Removing SectionMapping and SectionMappingConstraint elements */
		remove_SectionMapping_and_SectionMappingConstraint(rootElement);

		/* Update ModeSwitch */

		update_ModeSwitch(rootElement);


		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	/**
	 * Based on model changes of 0.7.1 :
	 *
	 *
	 * @param rootElement
	 */

	private void update_ModeSwitch(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();


		// xpathBuffer.append(".swModel/tasks/callGraph/graphEntries[@xsi:type=\"am:ModeSwitch\"]/entries");
		xpathBuffer.append("./swModel/tasks/callGraph//graphEntries");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/isrs/callGraph//graphEntries");
		// xpathBuffer.append("|");
		// xpathBuffer.append(".swModel/isrs/callGraph/graphEntries[@xsi:type=\"am:ModeSwitch\"]/entries");

		final List<Element> graphEntryBaseElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

		/*-
		 *    <callGraph>
					<graphEntries xsi:type="am:CallSequence"/>
					<graphEntries xsi:type="am:ModeSwitch"/>
					<graphEntries xsi:type="am:ProbabiltitySwitch"/>
			 </callGraph>
		 */
		for (final Element graphEntryBaseElement : graphEntryBaseElements) {


			/*-
			 * Elements whicha are part of : "graphEntries" are to be verified if the parent is "CallGraph".
			 * For the elements whose parent is other than "CallGraph" should be renamed to "items"
			 */

			if (!graphEntryBaseElement.getParentElement().getName().equals("callGraph")) {
				graphEntryBaseElement.setName("items");
			}

			final String graphEntryBaseObjectType = graphEntryBaseElement.getAttributeValue("type",
					this.helper.getGenericNS("xsi"));

			if (graphEntryBaseObjectType != null && graphEntryBaseObjectType.equals("am:ModeSwitch")) {

				final List<Element> entriesElements = graphEntryBaseElement.getChildren("entries");

				/*-
				 *       <callGraph>
							<graphEntries xsi:type="am:ModeSwitch">
								<entries value="md12/a?type=ModeLiteral" default="true">
										<graphEntries xsi:type="am:CallSequence" name="cs2"/>
								</entries>
							</graphEntries>
						 </callGraph>
				 */

				/*-
				 * As per change in 0.7.1: Inside a ModeSwitch -> only one ModeSwitchEntry can be default.
				 * 			In previous versions of APP4MC -> it was possible to have several ModeSwitchEntry objects as default (which can not happen practically)
				 *
				 * Based on the change in 0.7.1 :
				 * 				- first encountered ModeSwitchEntry with default property as "true" is transformed as "defaultEntry"
				 * 				- the other ModeSwitchEntry objects are transformed as "non default" -> eventough they have default as "true"
				 */
				boolean isDefaultFound = false;

				for (final Element entriesElement : entriesElements) {


					final Attribute defaultAttribute = entriesElement.getAttribute("default");

					if (defaultAttribute != null) {

						if (isDefaultFound == false) {
							isDefaultFound = true;

							/*- First ModeSwitchEntry with default value as "true" -> should have a tag name as "defaultEntry" */
							entriesElement.setName("defaultEntry");

							entriesElement.removeAttribute("value");

							entriesElement.removeChild("value");
						}
						/*- "default" attribute is removed from ModeSwitchEntry object */

						entriesElement.removeAttribute("default");

					}


					/*- renaming "value" attribute to "values" */

					final Attribute valueAttribute = entriesElement.getAttribute("value");

					if (valueAttribute != null) {
						valueAttribute.setName("values");
					}
					else {
						final Element valueElement = entriesElement.getChild("value");

						if (valueElement != null) {
							valueElement.setName("values");
						}
					}
				}

			}


		}


	}

	/**
	 * Based on Bug 500856 : It is no longer required to have SectionMapping and SectionMappingConstraint definitions in
	 * AMALTHEA model.
	 *
	 * Based on this change, corresponding elements of SectionMappingConstraint and SectionMapping are removed from the
	 * AMALTHEA model
	 *
	 * @param rootElement
	 */
	private void remove_SectionMapping_and_SectionMappingConstraint(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();


		xpathBuffer.append("./mappingModel/mapping[@xsi:type=\"am:SectionMapping\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./propertyConstraintsModel/mappingConstraints[@xsi:type=\"am:SectionMappingConstraint\"]");

		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

		final Iterator<Element> iterator = elements.iterator();

		while (iterator.hasNext()) {
			final Element sectionMappingElement = iterator.next();
			sectionMappingElement.getParent().removeContent(sectionMappingElement);
		}


	}

	/**
	 * This method is used to update the content of the Section element as per the changes introduced in 0.7.1 (Bug
	 * 500856 )<br>
	 *
	 * Section element will not directly contain dataSize, lists of Labels, Runnables <br>
	 *
	 * &nbsp;&nbsp;&nbsp;- Instead of the above relation, Section reference is directly available at the MemoryElements
	 *
	 * @param rootElement
	 */
	private void update_Section(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();


		xpathBuffer.append("./swModel/sections");

		final List<Element> sectionElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getNS_071("am"));

		for (final Element element : sectionElements) {

			element.removeChildren("size");
			element.removeChildren("labels");
			element.removeChildren("runEntities");

			element.removeAttribute("labels");
			element.removeAttribute("runEntities");
		}

	}

	/**
	 * This method is used to associate the Section reference directly at the Memory Element (i.e. Label/Runnable) based
	 * on the changes introduced in 0.7.1 (Bug 500856 )
	 *
	 * @param rootElement
	 *            Xml Element of amalthea model file
	 */

	@SuppressWarnings("null")
	private void update_MemoryElements_With_Section_Info(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/runnables");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/labels");

		final List<Element> memoryElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getNS_071("am"));


		for (final Element memoryElement : memoryElements) {

			final String memoryElementName = memoryElement.getAttributeValue("name");

			final String memoryElementID = memoryElement.getAttributeValue("id", this.helper.getGenericNS("xmi"));


			List<String> sections = new ArrayList<String>();

			if (memoryElement.getName().equals("labels")) {

				sections = getAssociatedSection_FromCache(SectionRunnableLabelCacheEnum.Label_Sections,
						memoryElementName);

				/*- fetching the elements based on the UUID */

				sections.addAll(getAssociatedSection_FromCache(SectionRunnableLabelCacheEnum.Label_UUID_Sections,
						memoryElementID));
			}
			else if (memoryElement.getName().equals("runnables")) {
				sections = getAssociatedSection_FromCache(SectionRunnableLabelCacheEnum.Runnable_Sections,
						memoryElementName);

				/*- fetching the elements based on the UUID */

				sections.addAll(getAssociatedSection_FromCache(SectionRunnableLabelCacheEnum.Runnable_UUID_Sections,
						memoryElementID));

			}

			/*- Associating section to a memoryelement */

			if (sections != null && sections.size() > 0) {

				final Element sectionRef = new Element("section");
				sectionRef.setAttribute("href", "amlt:/#" + sections.get(0) + "?type=Section");

				memoryElement.addContent(sectionRef);

				if (sections.size() > 1) {
					this.logger.warn("MemoryElement :" + memoryElementName + " is associated to multiple sections: "
							+ Joiner.on(",").join(sections.toArray())
							+ ". \nAs per AMALTHEA 0.7.1 it is allowed to be part of one Section only.");
				}

			}

		}
	}

	/**
	 * This method is used to associate Section to the corresponding MemoryElemnt. <br>
	 *
	 * Required input data across the models is fetched from the ICache(SectionRunnableLabelCacheBuilder)<br>
	 *
	 * <b>Note</b>: In SectionRunnableLabelCacheBuilder Cache is stored in the below format:<br>
	 * <ul>
	 * <li>Map<File, Map<String, Object>> : CacheMap having key as File (amalthea model file) and value as Map<String,
	 * Object><br>
	 * </li>
	 * <li>In Map<String, Object> : Key is the "SectionRunnableLabelCacheEnum type" and value is the <b> Map<String,
	 * List<String>> </b></li>
	 * <li>In Map Map<String, List<String>> : Key is the "Runnable/Label name" and value is the list of Section names to
	 * which MemoryElement (Label/Runnable) is associated to</li>
	 *
	 * </ul>
	 *
	 * @param type
	 *            SectionRunnableLabelCacheEnum name. This parameter is supplied to identify the MemoryElement type i.e.
	 *            Runnable/Label and accordingly fetch the cached content
	 * @param memoryElementName_or_UUID
	 *            String. This parameter is the name/UUID of the MemoryElement for which accordingly the corresponding
	 *            Sections are fetched
	 *
	 * @return
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private List<String> getAssociatedSection_FromCache(final SectionRunnableLabelCacheEnum type,
			final String memoryElementName_or_UUID) {

		final SectionRunnableLabelCacheBuilder iCache = getSectionRunnableLabelCacheBuilder();

		if (iCache == null) {

			throw new RuntimeException(
					"SectionRunnableLabelCache is not buit and Object of it is not available in Converters");
		}

		final Map<File, Map<String, Object>> cacheMap = iCache.getCacheMap();

		final Set<File> fileSet = this.fileName_documentsMap.keySet();

		for (final File file : fileSet) {

			final Map<String, Object> map = cacheMap.get(file);

			final Object object = map.get(type.name());

			if (object instanceof Map) {
				if (((Map) object).containsKey(memoryElementName_or_UUID)) {
					return (List<String>) ((Map) object).get(memoryElementName_or_UUID);
				}

			}

		}


		return new ArrayList<String>();
	}

	/**
	 * This method is used to get the corresponding SectionRunnableLabelCacheBuilder object from various ICache objects
	 *
	 * @return SectionRunnableLabelCacheBuilder Object of ICache defined using extension point :
	 *         org.eclipse.app4mc.amalthea.model.converters.cachebuilders
	 */
	private SectionRunnableLabelCacheBuilder getSectionRunnableLabelCacheBuilder() {

		for (final ICache cache : this.caches) {

			if (cache instanceof SectionRunnableLabelCacheBuilder) {
				return (SectionRunnableLabelCacheBuilder) cache;
			}
		}
		return null;
	}

	/**
	 * This method is used to migrate the contents of "DataSize" element which can be contained inside following
	 * AMALTHEA elements: <br>
	 * BaseTypeDefinition <br>
	 * Section <br>
	 * Task <br>
	 * ISR <br>
	 * ProcessPrototype <br>
	 * ModeLabel <br>
	 * Label <br>
	 * Runnable<br>
	 * CustomEntity<br>
	 *
	 * Change : in previous version of model (0.7.0) -> DataSize element was consisting of "numberBits". In model
	 * (0.7.1) it is changed to "value" and an additional attribute "unit" is introduced [As a part of migration value
	 * set for "unit" is "bit"]
	 *
	 * @param rootElement
	 *            root XML Element
	 */
	private void update_DataSize(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		/*-
		 * As per the change in 0.7.1, Section will not have labels, runEntities, size elements
		 *
		 * xpathBuffer.append("./swModel/sections/size");
		 * xpathBuffer.append("|");
		 */


		xpathBuffer.append("./swModel/typeDefinitions/size");
		xpathBuffer.append("|");

		xpathBuffer.append("./swModel/tasks/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/isrs/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/processPrototypes/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/modeLabels/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/labels/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/runnables/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/customEntities/size");


		final List<Element> dataSizes = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_071("am"));


		for (final Element dataSizeElement : dataSizes) {

			final Attribute numberBits = dataSizeElement.getAttribute("numberBits");

			if (numberBits != null) {

				numberBits.setName("value");

				final Attribute unit = new Attribute("unit", "bit");

				dataSizeElement.setAttribute(unit);


			}
		}

	}


}
