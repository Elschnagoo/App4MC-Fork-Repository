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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters111.utils.CacheEnum;
import org.eclipse.app4mc.amalthea.converters111.utils.HelperUtils_110_111;
import org.eclipse.app4mc.amalthea.converters111.utils.LabelValueProviderRefsCacheBuilder;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Parent;

public class StimuliConverter implements IConverter {

	private final HelperUtils_110_111 helper;

	private List<ICache> caches;

	private String workingDirectoryLocation;

	private File targetFile;

	private final Logger logger;

	public StimuliConverter() {
		this.helper = HelperUtils_110_111.getInstance();
		this.logger = LogManager.getLogger(this.getClass());
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.caches = caches;

		this.targetFile = targetFile;

		this.workingDirectoryLocation = targetFile.getParentFile().getCanonicalPath();

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_111(rootElement);

		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("stimuli"));

		// updateEnum_InterfaceKind(rootElement);

		update_VariableRefs_inside_Stimulus(rootElement);

		update_ModeLiteral_References(rootElement);

		update_ModeLabel_References(rootElement);

		/*- once the references are created newly, update the cache to establish mapping between old URIFragments and the new ones */

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}

	/**
	 * This method is responsible to create ModeLabel objects and assign them to the corresponding references inside
	 * stimuli model
	 *
	 * @param rootElement
	 * @throws Exception
	 */
	private void update_ModeLabel_References(final Element rootElement) throws Exception {

		final StringBuffer xpathBuffer = new StringBuffer();

		/*-
		 * **************************************
		 *Fetching all valueProvider elements
		 * **************************************
		 */
		xpathBuffer.append("(.//entries/@valueProvider)");

		/*- This map contains key as ModeLabel name and value as ModeLabel id */
		final Map<String, String> localModeLabelsMap = new HashMap<String, String>();


		final List<Attribute> valueLabelProvidersRefs = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Attribute.class, this.helper.getNS_111("stimuli"), this.helper.getGenericNS("xsi"));

		for (final Attribute attribute : valueLabelProvidersRefs) {

			final String value = attribute.getValue();

			String modeLabelID = "";

			if (!localModeLabelsMap.containsKey(value)) {

				if (value.contains("//")) {
					final Element label = getLabel(value, true);
					// TODO: log warning when label is null

					if (label == null) {
						continue;
					}
					modeLabelID = createModeLabel(label);
					localModeLabelsMap.put(value, modeLabelID);
				}
				else {
					final Element label = getLabel(value, false);
					// TODO: log warning
					if (label == null) {
						continue;
					}
					modeLabelID = createModeLabel(label);
					localModeLabelsMap.put(value, modeLabelID);
				}
			}
			else {
				modeLabelID = localModeLabelsMap.get(value);
			}

			if (modeLabelID != null && modeLabelID.length() > 0) {

				/*-
				 * **************************************
				 * Linking ModeLabel as valueProvider
				 * **************************************
				 */
				attribute.setValue(modeLabelID);

				// // TODO: add documentation for removing attribute value as it is not possible to convert value to
				// // ModeLiteral
				// attribute.getParent().removeAttribute("value");
			}


		}

		/*-
		 ** **************************************
		 * Fetching data from HREF
		 * **************************************
		 *
		 */

		final StringBuffer xpathHREFBuffer = new StringBuffer();
		xpathHREFBuffer.append("(.//entries/valueProvider/@href)");


		final List<Attribute> hRefs = this.helper.getXpathResult(rootElement, xpathHREFBuffer.toString(),
				Attribute.class, this.helper.getNS_111("stimuli"), this.helper.getGenericNS("xsi"));

		for (final Attribute attribute : hRefs) {

			final String value = attribute.getValue();

			String modeLabelID = "";

			if (!localModeLabelsMap.containsKey(value)) {

				final Element label = getLabelFromHRef(value);

				if (label == null) {
					continue;
				}

				modeLabelID = value.split("#")[0] + "#" + createModeLabel(label);

				localModeLabelsMap.put(value, modeLabelID);
			}
			else {
				modeLabelID = localModeLabelsMap.get(value);
			}

			if (modeLabelID != null && modeLabelID.length() > 0) {

				/*-
				 * **************************************
				 * Linking ModeLabel as valueProvider
				 * **************************************
				 */
				attribute.setValue(modeLabelID);

				// TODO: add documentation for removing attribute value as it is not possible to convert value to
				// ModeLiteral
				final Element parent = attribute.getParent();

				parent.removeAttribute("type", this.helper.getGenericNS("xsi"));

				parent.setAttribute("type", "sw:ModeLabel", this.helper.getGenericNS("xsi"));

				// /*- As the attribute "value" is at the entry (ModeValueListEntry) level*/
				// parent.getParentElement().removeAttribute("value");
			}

		}

	}


	private void update_VariableRefs_inside_Stimulus(final Element rootElement) {

		/*-
		 *
		 * Change:
		 * In 1.1.0:
		 *
		 * abstract class Stimulus
				{
					String name
					contains resolving Deviation<SignedTime> stimulusDeviation
					contains resolving LabelValueList setLabelsList
					contains resolving LabelValueList enablingLabelsList
					contains resolving LabelValueList disablingLabelsList
				}
		 *
		
		 *
		 * But in 1.1.1,
		 *
		 * abstract class Stimulus extends ReferableBaseObject
				{
					contains resolving Deviation<SignedTime> stimulusDeviation
					contains resolving ModeValueList setModeValueList
					contains resolving ModeValueList enablingModeValueList
					contains resolving ModeValueList disablingModeValueList
				}
		
		 *Following variable references are changed to :
		 *
		 *setLabelsList ->setModeValueList
		 *enablingLabelsList->enablingModeValueList
		 *disablingLabelsList->disablingModeValueList
		 */


		final StringBuffer enablingLabelsList_xpathBuffer = new StringBuffer();

		/*- Xpath Buffer to store "disablingLabelsList" */

		final StringBuffer disablingLabelsList_xpathBuffer = new StringBuffer();


		disablingLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:Periodic\")]/disablingLabelsList)");
		disablingLabelsList_xpathBuffer.append("|");
		disablingLabelsList_xpathBuffer
				.append("(.//stimuli[(@xsi:type=\"stimuli:ArrivalCurve\")]/disablingLabelsList)");
		disablingLabelsList_xpathBuffer.append("|");
		disablingLabelsList_xpathBuffer
				.append("(.//stimuli[(@xsi:type=\"stimuli:CustomStimulus\")]/disablingLabelsList)");
		disablingLabelsList_xpathBuffer.append("|");
		disablingLabelsList_xpathBuffer
				.append("(.//stimuli[(@xsi:type=\"stimuli:InterProcess\")]/disablingLabelsList)");
		disablingLabelsList_xpathBuffer.append("|");
		disablingLabelsList_xpathBuffer
				.append("(.//stimuli[(@xsi:type=\"stimuli:PeriodicEvent\")]/disablingLabelsList)");
		disablingLabelsList_xpathBuffer.append("|");
		disablingLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:Single\")]/disablingLabelsList)");
		disablingLabelsList_xpathBuffer.append("|");

		disablingLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:Sporadic\")]/disablingLabelsList)");


		/*- Xpath Buffer to store "enablingLabelsList" */

		enablingLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:Periodic\")]/enablingLabelsList)");
		enablingLabelsList_xpathBuffer.append("|");

		enablingLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:ArrivalCurve\")]/enablingLabelsList)");
		enablingLabelsList_xpathBuffer.append("|");

		enablingLabelsList_xpathBuffer
				.append("(.//stimuli[(@xsi:type=\"stimuli:CustomStimulus\")]/enablingLabelsList)");
		enablingLabelsList_xpathBuffer.append("|");

		enablingLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:InterProcess\")]/enablingLabelsList)");
		enablingLabelsList_xpathBuffer.append("|");

		enablingLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:PeriodicEvent\")]/enablingLabelsList)");
		enablingLabelsList_xpathBuffer.append("|");

		enablingLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:Single\")]/enablingLabelsList)");
		enablingLabelsList_xpathBuffer.append("|");

		enablingLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:Sporadic\")]/enablingLabelsList)");


		/*- Xpath Buffer to store "setLabelsList" */

		final StringBuffer setLabelsList_xpathBuffer = new StringBuffer();

		setLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:Periodic\")]/setLabelsList)");
		setLabelsList_xpathBuffer.append("|");

		setLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:ArrivalCurve\")]/setLabelsList)");
		setLabelsList_xpathBuffer.append("|");


		setLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:CustomStimulus\")]/setLabelsList)");
		setLabelsList_xpathBuffer.append("|");


		setLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:InterProcess\")]/setLabelsList)");
		setLabelsList_xpathBuffer.append("|");


		setLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:PeriodicEvent\")]/setLabelsList)");
		setLabelsList_xpathBuffer.append("|");


		setLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:Single\")]/setLabelsList)");
		setLabelsList_xpathBuffer.append("|");


		setLabelsList_xpathBuffer.append("(.//stimuli[(@xsi:type=\"stimuli:Sporadic\")]/setLabelsList)");


		final List<Element> setLabelsList = this.helper.getXpathResult(rootElement,
				setLabelsList_xpathBuffer.toString(), Element.class, this.helper.getNS_111("stimuli"),
				this.helper.getGenericNS("xsi"));

		for (final Element element : setLabelsList) {

			element.setName("setModeValueList");

		}

		final List<Element> enablingLabelsList = this.helper.getXpathResult(rootElement,
				enablingLabelsList_xpathBuffer.toString(), Element.class, this.helper.getNS_111("stimuli"),
				this.helper.getGenericNS("xsi"));

		for (final Element element : enablingLabelsList) {

			element.setName("enablingModeValueList");

		}


		final List<Element> disablingLabelsList = this.helper.getXpathResult(rootElement,
				disablingLabelsList_xpathBuffer.toString(), Element.class, this.helper.getNS_111("stimuli"),
				this.helper.getGenericNS("xsi"));

		for (final Element element : disablingLabelsList) {

			element.setName("disablingModeValueList");

		}


	}

	private Element getLabel(final String labelReference, final boolean iURIFragment) {

		for (final ICache iCache : this.caches) {

			if (iCache instanceof LabelValueProviderRefsCacheBuilder) {

				final Set<File> fileSet = iCache.getCacheMap().keySet();

				for (final File file : fileSet) {


					final Map<String, Object> cacheMap = iCache.getCacheMap().get(file);

					/*-
					 * Following elements should be collected:
					 *
					 * 1.Collect all label references (using xmi)
					 * 	a.simple
					 *  b.href
					 * 2.Collect all label references (using URL fragments)
					 * 	a.simple
					 *  b.href
					 */

					final Object URIFRAGMENT_ELEMENT_Map = cacheMap.get(CacheEnum.URIFRAGMENT_ELEMENT.name());

					// final Object object2 = cacheMap.get(CacheEnum.HREF_URIFRAGMENT_ELEMENT.name());

					final Object UUID_ELEMENT_Map = cacheMap.get(CacheEnum.UUID_ELEMENT.name());


					if (iURIFragment) {

						@SuppressWarnings("unchecked")
						final Element element = ((Map<String, Element>) URIFRAGMENT_ELEMENT_Map).get(labelReference);

						if (element != null && this.targetFile == file) {
							return element;
						}
						continue;
					}
					@SuppressWarnings("unchecked")
					final Element element = ((Map<String, Element>) UUID_ELEMENT_Map).get(labelReference);
					if (element != null) {
						return element;
					}
					continue;


				}


			}
		}
		return null;
	}

	private Element getLabelFromHRef(final String labelReference_with_fileName) throws Exception {

		boolean iURIFragment = false;

		final String[] split = labelReference_with_fileName.split("#");

		if (split.length != 2) {
			return null;
		}
		final String refFileName = split[0];

		final String labelReference = split[1];

		if (labelReference.contains("//")) {
			iURIFragment = true;
		}

		if (iURIFragment) {

			for (final ICache iCache : this.caches) {

				if (iCache instanceof LabelValueProviderRefsCacheBuilder) {

					final Set<File> fileSet = iCache.getCacheMap().keySet();

					for (final File file : fileSet) {

						final Map<String, Object> cacheMap = iCache.getCacheMap().get(file);

						final Object HREF_URIFRAGMENT_ELEMENT_Map = cacheMap
								.get(CacheEnum.HREF_URIFRAGMENT_ELEMENT.name());

						@SuppressWarnings("unchecked")
						final Element element = ((Map<String, Element>) HREF_URIFRAGMENT_ELEMENT_Map)
								.get(labelReference_with_fileName);

						if (element != null) {
							return element;
						}
						continue;

					}

				}

			}

		}
		else {

			final String referencedFilePath = this.workingDirectoryLocation + File.separator + refFileName;

			final File referenceFile = new File(referencedFilePath).getCanonicalFile();


			@SuppressWarnings("unchecked")
			final List<LabelValueProviderRefsCacheBuilder> filteredCaches = getFilteredCaches(this.caches,
					LabelValueProviderRefsCacheBuilder.class);

			for (final LabelValueProviderRefsCacheBuilder labelValueProviderRefsCacheBuilder : filteredCaches) {

				if (iURIFragment == false) {
					final Map<String, Object> cacheMap = labelValueProviderRefsCacheBuilder.getCacheMap()
							.get(referenceFile);

					if (cacheMap != null) {
						final Object UUID_ELEMENT_Map = cacheMap.get(CacheEnum.UUID_ELEMENT.name());

						@SuppressWarnings("unchecked")
						final Element element = ((Map<String, Element>) UUID_ELEMENT_Map).get(labelReference);

						if (element != null) {
							return element;
						}
						continue;
					}

				}
			}
		}

		return null;
	}

	private String createModeLabel(final Element labelElement) {

		final Parent parent = labelElement.getParent();

		final Element element = new Element("modeLabels");

		element.setAttribute("name", labelElement.getAttributeValue("name"));

		final String uuid = EcoreUtil.generateUUID();

		element.setAttribute("id", uuid, this.helper.getGenericNS("xmi"));

		parent.addContent(element);

		return uuid;
	}


	private int modeCount = 1;

	/**
	 * This method is used to create Mode, ModeLiteral objects and associate them to the corresponding ModeSwitch<br>
	 * <br>
	 *
	 * Below are the steps performed by this method:<br>
	 * From all the ModeValueList->ModeValueListEntry object values -> ModeLiteral objects are created and associated to
	 * the Mode object (generated as a part of migration)<br>
	 *
	 * Created ModeLiteral's are associated to the entry objects (inside LabelSwitch -> which will be converted to
	 * ModeSwitch as a part of migration)
	 *
	 * @param rootElement
	 */
	private void update_ModeLiteral_References(final Element rootElement) {


		final Map<String, Element> element_LiteralMap = new HashMap<String, Element>();

		final String xpathString = ".//swModel|/sw:SWModel";

		final List<Element> swModels = this.helper.getXpathResult(rootElement, xpathString, Element.class,
				this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		if (swModels.size() == 0) {
			System.err.println("sw-model not present, so can't associate individual ModeLiteral values");
			this.logger.error(
					"Model Migration (1.1.0 to 1.1.1) -> sw-model not present, so can't associate individual ModeLiteral values which are part of ModeValueList");
			return;
		}


		final String xpathString_entries = ".//stimuliModel/stimuli//entries|/stimuli:StimuliModel/stimuli//entries";

		final List<Element> entryElements = this.helper.getXpathResult(rootElement, xpathString_entries, Element.class,
				this.helper.getNS_111("stimuli"), this.helper.getGenericNS("xsi"));


		// As there are various sw:ModeSwitch entries, corresponding modeliteral elements part of modes should be
		// associated to them accordingly
		Element mode_migElement = null;

		if (entryElements.size() > 0) {

			mode_migElement = new Element("modes");

			// TODO: finalize the name of this element
			mode_migElement.setAttribute("name", "mode_stimuli_" + this.modeCount++ + "_migration_generated");

			mode_migElement.setAttribute("id", EcoreUtil.generateUUID(), this.helper.getGenericNS("xmi"));

			swModels.get(0).addContent(mode_migElement);

			for (final Element entryElement : entryElements) {

				Attribute modeSwitchEntry_value_attribute = entryElement.getAttribute("value");

				if (modeSwitchEntry_value_attribute == null) {
					/*- This is the case where default value "0" is set for the "LabelSwitchEntry" and due to this reason attribute "value" will not be generated in the xmi */
					modeSwitchEntry_value_attribute = new Attribute("value", "0");

					entryElement.setAttribute(modeSwitchEntry_value_attribute);
				}


				final String value = modeSwitchEntry_value_attribute.getValue();


				final boolean literalElementExists = element_LiteralMap.containsKey(value);

				if (literalElementExists) {
					/*- As the MapLiteral element is created as a part of the migration from 1.1.0 to 1.1.1, attribute xmi:id is added by default. And due to this below code is considering it*/
					final Element literalElement = element_LiteralMap.get(value);

					final String literal_uuid = literalElement.getAttributeValue("id", this.helper.getGenericNS("xmi"));

					modeSwitchEntry_value_attribute.setValue(literal_uuid);

					continue;
				}

				// else case

				/*-
				 * Below the representation of ModeLiteral
				 * <modes name="MV">
				 *		<literals name="20"/>
				 * </modes>
				 */

				final Element literals = new Element("literals");

				literals.setAttribute("name", value);

				final String literalID = EcoreUtil.generateUUID();

				literals.setAttribute("id", literalID, this.helper.getGenericNS("xmi"));

				mode_migElement.addContent(literals);

				modeSwitchEntry_value_attribute.setValue(literalID);

				element_LiteralMap.put(value, literals);


			}
		}


	}

}
