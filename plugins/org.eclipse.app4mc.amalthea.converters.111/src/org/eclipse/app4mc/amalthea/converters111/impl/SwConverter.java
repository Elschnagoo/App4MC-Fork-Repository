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
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters111.utils.CacheEnum;
import org.eclipse.app4mc.amalthea.converters111.utils.HelperUtils_110_111;
import org.eclipse.app4mc.amalthea.converters111.utils.LabelValueProviderRefsCacheBuilder;
import org.eclipse.app4mc.amalthea.converters111.utils.ModeLabelsCacheBuilder;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Parent;

public class SwConverter implements IConverter {

	private final HelperUtils_110_111 helper;

	private List<ICache> caches;

	private String workingDirectoryLocation;

	boolean isModeLabelCacheUpdated;

	File targetFile;

	public SwConverter() {
		this.helper = HelperUtils_110_111.getInstance();
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.targetFile = targetFile;

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		this.caches = caches;

		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_111(rootElement);

		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("sw"));

		this.workingDirectoryLocation = targetFile.getParentFile().getCanonicalPath();

		updateModeLabel_cache(fileName_documentsMap);

		updateEnum_WaitEventType(rootElement);

		updateEnum_WaitingBehaviour(rootElement);

		updateEnum_AccessPrecedenceType(rootElement);

		updateEnum_OrderType(rootElement);

		updateEnum_LabelAccessEnum(rootElement);

		updateEnum_SemaphoreAccessEnum(rootElement);

		updateEnum_Preemption(rootElement);

		update_SchedulingSWUnit_namespace(rootElement);

		update_ModeLabel_References(rootElement);


		update_ModeLiteral_References(rootElement);

		remove_deadline_attribute(rootElement);

		remove_initialValue_Attribute(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}

	/**
	 * As there is a dependency between Stimuli and SW converter w.r.t. creation of ModeLabel elements. It is beneficial
	 * to upate the ModeLabel cache, so that no duplicate ModeLabel elements are created
	 *
	 * @param fileName_documentsMap
	 */
	private void updateModeLabel_cache(final Map<File, Document> fileName_documentsMap) {

		if (!this.isModeLabelCacheUpdated) {

			for (final ICache iCache : this.caches) {

				if (iCache instanceof ModeLabelsCacheBuilder) {

					((ModeLabelsCacheBuilder) iCache).buildCache(fileName_documentsMap);

					this.isModeLabelCacheUpdated = true;

				}

			}
		}

	}

	/**
	 * This method is used to get a ModeLabel object from a specified model file
	 *
	 * @param targetFile
	 * @param modeLabelName
	 * @return
	 */
	private Element getModeLabel(final File targetFile, final String modeLabelName) {

		for (final ICache iCache : this.caches) {

			if (iCache instanceof ModeLabelsCacheBuilder) {


				final Map<String, Object> cacheMap = iCache.getCacheMap().get(targetFile);

				if (cacheMap != null) {

					final Object NAME_ELEMENT_Map = cacheMap.get(CacheEnum.ELEMENT_NAME.name());

					if (NAME_ELEMENT_Map != null) {

						@SuppressWarnings("unchecked")
						final Element element = ((Map<String, Element>) NAME_ELEMENT_Map).get(modeLabelName);

						if (element != null) {
							return element;
						}
					}
				}
				continue;
			}
		}

		return null;

	}

	private void remove_initialValue_Attribute(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//labels[@initialValue]");


		final List<Element> initialValue_Attribs = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		for (final Element label : initialValue_Attribs) {
			label.removeAttribute("initialValue");
		}
	}


	private void remove_deadline_attribute(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//isrs[./deadline]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//tasks[./deadline]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//processPrototypes[./deadline]");

		final List<Element> absProcessElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));

		if (absProcessElements.size() == 0) {

			return;
		}

		/*-
		 * Here DeadLine is removed from AbstractProcess element and it should be associated to ProcessRequirement (link AbstractProcess element) -> TimeRequirementLimit -> SignedTime
		 */
		// TODO: search for constraintsModel

		Element constraintsModelElement = rootElement.getChild("constraintsModel");

		if (constraintsModelElement == null) {


			final String name = rootElement.getName();

			// /central:AMALTHEA

			if (name.equals("AMALTHEA")) {

				constraintsModelElement = new Element("constraintsModel");

				rootElement.addContent(constraintsModelElement);

				this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("constraints"));
			}
			else {

				System.err.println(
						"constraints model not present, so can't associate deadline to AbstractProcess elements");
				return;
			}
		}


		/*-
		 *
		 * updating process elements
		 *
		 */

		for (final Element absProcessElement : absProcessElements) {

			final Attribute nameAttribute = absProcessElement.getAttribute("name");

			final Element deadLineElement = absProcessElement.getChild("deadline");

			if (deadLineElement == null) {
				continue;
			}


			String deadline_unit = deadLineElement.getAttributeValue("unit");

			if (deadline_unit == null) {
				deadline_unit = "ps";
			}

			String deadline_value = deadLineElement.getAttributeValue("value");

			if (deadline_value == null) {
				deadline_value = "0";
			}

			String absProcess_xmiID = absProcessElement.getAttributeValue("id", this.helper.getGenericNS("xmi"));


			final Element processRequirementElment = new Element("requirements");

			processRequirementElment.setAttribute("type", "constraints:ProcessRequirement",
					this.helper.getGenericNS("xsi"));

			if (nameAttribute != null) {
				processRequirementElment.setAttribute("name", nameAttribute.getValue());
			}

			processRequirementElment.setAttribute("severity", "Cosmetic");


			// id of AbstractProcess

			if (absProcess_xmiID == null) {
				absProcess_xmiID = EcoreUtil.generateUUID();

				absProcessElement.setAttribute("id", absProcess_xmiID, this.helper.getGenericNS("xmi"));
			}

			processRequirementElment.setAttribute("process", absProcess_xmiID);


			final Element limitElement = new Element("limit");

			limitElement.setAttribute("type", "constraints:TimeRequirementLimit", this.helper.getGenericNS("xsi"));

			limitElement.setAttribute("limitType", "UpperLimit");

			limitElement.setAttribute("metric", "ResponseTime");


			final Element limitValueElement = new Element("limitValue");

			limitValueElement.setAttribute("value", deadline_value);

			limitValueElement.setAttribute("unit", deadline_unit);

			// adding limitvalue to parent (i.e. limit)
			limitElement.addContent(limitValueElement);

			// adding limitElement to parent (i.e. processRequirementElment)
			processRequirementElment.addContent(limitElement);


			// adding processRequirementElment to parent (i.e. ConstraintsModel)
			constraintsModelElement.addContent(processRequirementElment);


			// removing deadline from abstract process
			absProcessElement.removeContent(deadLineElement);
		}


	}

	private int modeCount;

	/**
	 * This method is used to create Mode, ModeLiteral objects and associate them to the corresponding ModeSwitch<br>
	 * <br>
	 *
	 * Below are the steps performed by this method:<br>
	 * From all the LabelSwitch->entry object values -> ModeLiteral objects are created and associated to the Mode
	 * object (generated as a part of migration)<br>
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
			return;
		}


		final String xpathString_entries = ".//graphEntries[(@xsi:type=\"sw:ModeSwitch\")]/entries";

		final List<Element> entryElements = this.helper.getXpathResult(rootElement, xpathString_entries, Element.class,
				this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		// As there are various sw:ModeSwitch entries, corresponding modeliteral elements part of modes should be
		// associated to them accordingly
		Element mode_migElement = null;

		if (entryElements.size() > 0) {

			mode_migElement = new Element("modes");

			// TODO: finalize the name of this element
			mode_migElement.setAttribute("name", "mode_sw_" + this.modeCount++ + "_migration_generated");

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

	/**
	 * As SchedulingSWUnit is moved from SW model to OS model. Only xsi:type is to be updated with sw:SchedulingSWUnit
	 * -> at all the places where schedulingunit with type : sw:SchedulingSWUnit was contained
	 *
	 * @param rootElement
	 */

	private void update_SchedulingSWUnit_namespace(final Element rootElement) {

		final String xpathString = ".//schedulingUnit[(@xsi:type=\"sw:SchedulingSWUnit\")]";

		final List<Element> schedulingUnits = this.helper.getXpathResult(rootElement, xpathString, Element.class,
				this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Element schedulingUnit : schedulingUnits) {

			final Attribute attribute = schedulingUnit.getAttribute("type", this.helper.getGenericNS("xsi"));
			attribute.setValue("os:SchedulingSWUnit");
		}

	}

	private void updateEnum_WaitEventType(final Element rootElement) {


		/*--
		 * Migraiton step to 111 from 110: Grep the references of "calls" having type as : CallSequenceItem  and which do not contain "maskType" attribute
		 */

		final String xpathString = ".//calls[(@xsi:type=\"sw:WaitEvent\") and not(@maskType) ]";

		final List<Element> waitEvents = this.helper.getXpathResult(rootElement, xpathString, Element.class,
				this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Element waitEvent : waitEvents) {

			waitEvent.setAttribute("maskType", "AND");
		}

	}

	/*-
	 *
	 * In this case, literal of the enum have changed
	 *
	 * From 1.1.0:
	 *
	 * enum WaitingBehaviour{
	 *	 unspecified = 0
	 *	 active = 1
	 *	 passive = 2
	 *	}
	 *
	 * From 1.1.1:
	 *
	 * enum WaitingBehaviour
	 *{
	 *	_undefined_ as "<waiting>"
	 *	active
	 *	passive
	 *}
	 *
	 */
	private void updateEnum_WaitingBehaviour(final Element rootElement) {


		/*--
		 * Migraiton step to 111 from 110: Grep the references of "calls" having type as : CallSequenceItem  and which do not contain "maskType" attribute
		 *
		 * 1. do not explicity add the default value e.g: in 1.1.0 default was "unspecified", in 1.1.1 default is "_undefined_"
		 * 2. in case if the  value is set as "unspecified", then remove the attribute "waitingBehaviour" -> as this literal is removed in 1.1.1.  In this case default literal _unspecified_ will be considered by default
		 */

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//calls[(@xsi:type=\"sw:WaitEvent\") and  (@waitingBehaviour=\"unspecified\") ]");

		xpathBuffer.append("|");


		xpathBuffer.append(
				".//runnableItems[(@xsi:type=\"sw:SynchronousServerCall\") and  (@waitingBehaviour=\"unspecified\") ]");


		xpathBuffer.append("|");


		xpathBuffer.append(
				".//runnableItem[(@xsi:type=\"sw:SynchronousServerCall\") and  (@waitingBehaviour=\"unspecified\") ]");


		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Element waitEvent : elements) {

			waitEvent.removeAttribute("waitingBehaviour");
		}

	}


	private void updateEnum_AccessPrecedenceType(final Element rootElement) {
		/*--
		 * Migraiton step to 111 from 110: Grep the references of "accessPrecedenceSpec"  which do not contain "orderType" attribute (note: here this attribute corresponds to AccessPrecedenceSpec enum)
		 */

		final String xpathString = ".//accessPrecedenceSpec[not(@orderType) ]";

		final List<Element> accessPrecedenceSpecs = this.helper.getXpathResult(rootElement, xpathString, Element.class,
				this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Element accessPrecedenceSpec : accessPrecedenceSpecs) {

			accessPrecedenceSpec.setAttribute("orderType", "ignoreWR");
		}

	}


	private void updateEnum_OrderType(final Element rootElement) {
		/*--
		 * Migraiton step to 111 from 110: Grep the references of "orderPrecedenceSpec"  which do not contain "orderType" attribute (note: here this attribute corresponds to OrderType enum)
		 */

		final String xpathString = ".//orderPrecedenceSpec[not(@orderType) ]";

		final List<Element> accessPrecedenceSpecs = this.helper.getXpathResult(rootElement, xpathString, Element.class,
				this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Element accessPrecedenceSpec : accessPrecedenceSpecs) {

			accessPrecedenceSpec.setAttribute("orderType", "order");
		}

	}


	private void updateEnum_LabelAccessEnum(final Element rootElement) {
		/*--
		 * Migraiton step to 111 from 110: Grep the references of "accessPrecedenceSpec"  which do not contain "orderType" attribute (note: here this attribute corresponds to AccessPrecedenceSpec enum)
		 */

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//runnableItems[(@xsi:type=\"sw:LabelAccess\"  and not(@access))]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//runnableItem[(@xsi:type=\"sw:LabelAccess\"  and not(@access))]");


		final List<Element> labelAccesss = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Element labelAccess : labelAccesss) {

			labelAccess.setAttribute("access", "read");
		}

	}


	private void updateEnum_SemaphoreAccessEnum(final Element rootElement) {
		/*--
		 * Migraiton step to 111 from 110: Grep the references of "accessPrecedenceSpec"  which do not contain "orderType" attribute (note: here this attribute corresponds to AccessPrecedenceSpec enum)
		 */

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//runnableItems[(@xsi:type=\"sw:SemaphoreAccess\" and not(@accessEnum))]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//runnableItem[(@xsi:type=\"sw:SemaphoreAccess\" and not(@accessEnum))]");


		final List<Element> semaphoreAccesss = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Element semaphoreAccess : semaphoreAccesss) {

			semaphoreAccess.setAttribute("accessEnum", "request");
		}

	}

	private void updateEnum_Preemption(final Element rootElement) {
		/*--
		 * Migraiton step to 111 from 110: Grep the references of "accessPrecedenceSpec"  which do not contain "orderType" attribute (note: here this attribute corresponds to AccessPrecedenceSpec enum)
		 */

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./sw:SWModel/tasks[not(@preemption)]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//swModel/tasks[not(@preemption)]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//processPrototypes[not(@preemption)]");

		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Element element : elements) {

			element.setAttribute("preemption", "cooperative");
		}

	}


	/**
	 * This method is responsible for following: <br>
	 * - to create ModeLabel objects and assign them to the corresponding references inside sw model<br>
	 * - to convert ModeSwitch objects as LabelSwitch objects<br>
	 * <br>
	 * Note: Only for the Label objects which are referred inside LabelSwitch -> corresponding ModeLabel objects are
	 * created
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
		xpathBuffer.append("(.//graphEntries[(@xsi:type=\"sw:LabelSwitch\")]/@label)");

		final Map<String, String> localMap = new HashMap<String, String>();

		final List<Attribute> valueLabelProvidersRefs = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Attribute.class, this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));

		for (final Attribute attribute : valueLabelProvidersRefs) {

			final String value = attribute.getValue();

			String modeLabelID = "";

			if (!localMap.containsKey(value)) {

				if (value.contains("//")) {
					final Element label = getLabel(value, true);
					// TODO: log warning when label is null

					if (label == null) {
						continue;
					}
					modeLabelID = createModeLabel(label, this.targetFile);
					localMap.put(value, modeLabelID);
				}
				else {
					final Element label = getLabel(value, false);
					// TODO: log warning
					if (label == null) {
						continue;
					}
					modeLabelID = createModeLabel(label, this.targetFile);
					localMap.put(value, modeLabelID);
				}
			}
			else {
				modeLabelID = localMap.get(value);
			}

			if (modeLabelID != null && modeLabelID.length() > 0) {

				/*-
				 * **************************************
				 * Linking ModeLabel as valueProvider
				 * **************************************
				 */
				attribute.setValue(modeLabelID);

				/*-TODO: LabelSwitch -> variable " Label label" is changed to "refers ModeValueProvider valueProvider"*/
				attribute.setName("valueProvider");

				/*- parent here is graphEntries object -> it should of type sw:ModeSwitch*/
				final Element parent = attribute.getParent();

				parent.removeAttribute("type", this.helper.getGenericNS("xsi"));

				parent.setAttribute("type", "sw:ModeSwitch", this.helper.getGenericNS("xsi"));


			}


		}

		/*-
		 ** **************************************
		 * Fetching data from HREF
		 * **************************************
		 *
		 */

		final StringBuffer xpathHREFBuffer = new StringBuffer();
		xpathHREFBuffer.append("(.//graphEntries[(@xsi:type=\"sw:LabelSwitch\")]/label/@href)");


		final List<Attribute> hRefs = this.helper.getXpathResult(rootElement, xpathHREFBuffer.toString(),
				Attribute.class, this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));

		for (final Attribute attribute : hRefs) {

			final String value = attribute.getValue();

			final File referredFile = getReferredFile(value);

			String modeLabelID = "";

			if (!localMap.containsKey(value)) {

				final Element label = getLabelFromHRef(value);

				if (label == null) {
					continue;
				}

				modeLabelID = value.split("#")[0] + "#" + createModeLabel(label, referredFile);

				localMap.put(value, modeLabelID);
			}
			else {
				modeLabelID = localMap.get(value);
			}

			if (modeLabelID != null && modeLabelID.length() > 0) {

				/*-
				 * **************************************
				 * Linking ModeLabel as valueProvider
				 * **************************************
				 */
				attribute.setValue(modeLabelID);

				/*- parent here is valueProvider object -> it should of type sw:ModeLabel*/

				final Element parent = attribute.getParent();

				parent.removeAttribute("type", this.helper.getGenericNS("xsi"));

				parent.setAttribute("type", "sw:ModeLabel", this.helper.getGenericNS("xsi"));

				/*-TODO: LabelSwitch -> variable "refers Label label" is changed to "refers ModeValueProvider valueProvider"*/
				parent.setName("valueProvider");


				/*- parent here is graphEntries object -> it should of type sw:ModeSwitch*/
				final Element graphEntries = parent.getParentElement();

				graphEntries.removeAttribute("type", this.helper.getGenericNS("xsi"));

				graphEntries.setAttribute("type", "sw:ModeSwitch", this.helper.getGenericNS("xsi"));

			}

		}

	}

	/**
	 * This method is used to fetch the canonical file path referred in the given string.
	 *
	 * @param value
	 *            String in the following format <relative path of model file>#<element name>
	 * @return file Canonical file object
	 * @throws IOException
	 */

	private File getReferredFile(final String value) throws IOException {


		final String[] split = value.split("#");

		if (split.length != 2) {
			return null;
		}
		final String refFileName = split[0];


		final String referencedFilePath = this.workingDirectoryLocation + File.separator + refFileName;

		final File referenceFile = new File(referencedFilePath).getCanonicalFile();

		return referenceFile;

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

						if (element != null) {
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

	/**
	 * This method is used to create ModeLabel object for each Label object. Once the ModeLabel object is created, it is
	 * associated to the SW Model
	 */
	private String createModeLabel(final Element labelElement, final File file) {

		final String labelName = labelElement.getAttributeValue("name");

		// step1: check if the ModeLabel object is exiting

		final Element modeLabel = getModeLabel(file, labelName);

		if (modeLabel == null) {

			/*- Parent of the Label element is SWModel */
			final Parent parent = labelElement.getParent();

			final Element element = new Element("modeLabels");

			element.setAttribute("name", labelElement.getAttributeValue("name"));

			final String uuid = EcoreUtil.generateUUID();

			element.setAttribute("id", uuid, this.helper.getGenericNS("xmi"));

			/*- adding ModeLabel element to the SWModel */
			parent.addContent(element);

			return uuid;


		}

		/*- This is the case where ModeLabel object with the supplied name is already existing */
		return modeLabel.getAttributeValue("id", this.helper.getGenericNS("xmi"));


	}

}
