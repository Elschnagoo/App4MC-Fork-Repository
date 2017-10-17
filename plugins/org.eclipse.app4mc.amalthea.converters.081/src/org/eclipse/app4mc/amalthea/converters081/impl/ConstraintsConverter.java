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
package org.eclipse.app4mc.amalthea.converters081.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters081.utils.ConstraintElementsCacheBuilder;
import org.eclipse.app4mc.amalthea.converters081.utils.ConstraintElementsCacheEnum;
import org.eclipse.app4mc.amalthea.converters081.utils.HelperUtils_080_081;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the Constraints Model elements from 0.8.0 to 0.8.1 version format of
 * AMALTHEA model
 *
 * @author mez2rng
 *
 */
public class ConstraintsConverter extends AbstractConverter {

	private ConstraintElementsCacheBuilder constraintElementsCacheBuilder;
	private List<ICache> caches;


	public ConstraintsConverter() {
		this.helper = HelperUtils_080_081.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.0 to 0.8.1  : Executing Constraints converter for model file : "
				+ targetFile.getName());

		this.caches = caches;

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		updateEventChainElementDefinitions_and_references(rootElement);


		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	/**
	 * This method is used for the migration of EventChain definitions and references present inside the Constraints
	 * model (For further details, check : Bug 518119 )
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateEventChainElementDefinitions_and_references(final Element rootElement) {


		final List<Element> rootEventChainElements = this.helper.getXpathResult(rootElement,
				"./constraintsModel/eventChains", Element.class, this.helper.getGenericNS("xsi"));

		final List<String> allRootEventChainElements = getAllRootEventChainElements();

		if (rootEventChainElements.size() > 0) {

			for (final Element rootEventChainElement : rootEventChainElements) {

				final List<Element> subEventChainElements = this.helper.getXpathResult(rootEventChainElement,
						".//*[@xsi:type=\"am:SubEventChain\"]", Element.class, this.helper.getGenericNS("xsi"));

				for (final Element subEventChainElement : subEventChainElements) {

					final Attribute typeAttribute = subEventChainElement.getAttribute("type",
							this.helper.getGenericNS("xsi"));

					if (typeAttribute != null) {
						typeAttribute.setValue("am:EventChainContainer");
					}

				}

				updateEventChainReferences(allRootEventChainElements, rootEventChainElement);


			}
		}

		updateEventChainReferences_in_TimingConstraints(allRootEventChainElements, rootElement);


	}

	/**
	 * This method is used to migrate the contents of TimingConstraint elements of type EventChainLatencyConstraint and
	 * EventChainSynchronizationConstraint, which are present inside Constraints Model.
	 *
	 * <b>Note:</b> As a part of migration, it should be ensured that sub EventChain elements are not directly referred
	 * inside TimingConstraint elements. Till 0.8.1, it was possible to refer sub EventChain elements --> but based on
	 * this change such references are removed. To preserve the data specified by the user, reference String is stored
	 * as a CustomProperty
	 *
	 *
	 * @param allRootEventChainElements
	 *            List<String> contains the names of all the root EventChain elements (in the entire model scope)
	 * @param rootElement
	 *            Amalthea root element
	 *
	 */

	private void updateEventChainReferences_in_TimingConstraints(final List<String> allRootEventChainElements,
			final Element rootElement) {

		final List<Element> eventChainReferenceEleemnts = this.helper.getXpathResult(rootElement,
				"./constraintsModel/timingConstraints[@xsi:type=\"am:EventChainLatencyConstraint\" or @xsi:type=\"am:EventChainSynchronizationConstraint\"]",
				Element.class, this.helper.getGenericNS("xsi"));


		for (final Element timingConstraint : eventChainReferenceEleemnts) {

			final List<String> invalidEventChainRefs = new ArrayList<String>();

			final Attribute eventChainsAttribute = timingConstraint.getAttribute("scope");


			if (eventChainsAttribute != null) {

				boolean isRefEventChainStringsUpdated = false;

				String refEventChainStrings = eventChainsAttribute.getValue();

				final StringTokenizer stringTokenizer = new StringTokenizer(refEventChainStrings);

				while (stringTokenizer.hasMoreTokens()) {


					final String refEventChainString = stringTokenizer.nextToken();


					final String refEventChainName = refEventChainString.substring(0,
							refEventChainString.lastIndexOf("?"));

					/*- performing validation, to identify if childelements are referred */

					if (!allRootEventChainElements.contains(refEventChainName)) {

						isRefEventChainStringsUpdated = true;

						/*- this is the case child EventChain element is referred (Note: As per AMALTHEA 0.8.1, it is not supported)*/

						refEventChainStrings = refEventChainStrings.replace(refEventChainString, "");

						/*- adding invalid EventChain reference string to a list -> to create CustomProperty object later */
						invalidEventChainRefs.add(refEventChainString);

						if (refEventChainStrings.trim().length() == 0) {
							timingConstraint.removeAttribute(eventChainsAttribute);
						}

						logEventChainMessage_TimingConstraint(timingConstraint, refEventChainName);

					}

				}

				if (isRefEventChainStringsUpdated) {

					/*- setting the updated EventChain reference String */

					eventChainsAttribute.setValue(refEventChainStrings.trim());
				}


			}

			/*-
			 * If EventChain element is defined in other model file, then the reference inside TimingConstraint element will be generated as a separate tag in XMI
			 *
			 * Example:
			 *
			 *  <timingConstraints xsi:type="am:EventChainLatencyConstraint" name="ecl2">
			 *		<scope href="amlt:/#eventChain_from_second_file_sub_element?type=EventChain"/>
			 *	</timingConstraints>
			 *  */
			final List<Element> eventChains = timingConstraint.getChildren("scope");


			if (eventChains != null) {

				for (final Element eventChainElement : eventChains) {

					final String hrefValue = eventChainElement.getAttributeValue("href");

					if (hrefValue != null && hrefValue.contains("amlt:/#")) {

						final String refEventChainName = hrefValue.substring(hrefValue.indexOf("#") + 1,
								hrefValue.indexOf("?"));

						/*- performing validation, to identify if childelements are referred */

						if (!allRootEventChainElements.contains(refEventChainName)) {

							/*- this is the case child EventChain element is referred (Note: As per AMALTHEA 0.8.1, it is not supported)*/

							timingConstraint.removeContent(eventChainElement);

							invalidEventChainRefs.add(hrefValue);

							logEventChainMessage_TimingConstraint(timingConstraint, refEventChainName);

						}

					}
				}

			}


			/*-
			 * =================== Creating CustomProperty and associating invalid EventChain reference Strings to it. This step is performed to avoid loss of data ===========
			 */
			if (invalidEventChainRefs.size() > 0) {

				final Element customPropertyElement = new Element("customProperties");

				customPropertyElement.setAttribute("key", "scope");

				final Element valueElement = new Element("value");

				valueElement.setAttribute("type", "am:ListObject", this.helper.getGenericNS("xsi"));


				for (final String invalidEventChainRef : invalidEventChainRefs) {

					final Element valuesElement = new Element("values");

					valuesElement.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));

					valuesElement.setAttribute("value", invalidEventChainRef);

					valueElement.addContent(valuesElement);

				}

				customPropertyElement.addContent(valueElement);
				timingConstraint.addContent(customPropertyElement);

			}

		}
	}


	/**
	 * This method is used to migrate the contents of EventChainReference objects which are present inside EventChain
	 * object in Constraints Model.
	 *
	 * <b>Note:</b> As a part of migration, it should be ensured that sub EventChain elements are not directly referred
	 * inside EventChainReference elements. Till 0.8.1, there was a possibility to refer sub EventChain elements --> but
	 * based on this change such references are removed. To preserve the data specified by the user, reference String is
	 * stored as a CustomProperty
	 *
	 *
	 * @param allRootEventChainElements
	 *            List<String> contains the names of all the root EventChain elements (in the entire model scope)
	 * @param rootEventChainElement
	 *            EventChain element which is directly present inside Constraints Model
	 */
	private void updateEventChainReferences(final List<String> allRootEventChainElements,
			final Element rootEventChainElement) {

		final List<Element> eventChainReferenceEleemnts = this.helper.getXpathResult(rootEventChainElement,
				".//*[@xsi:type=\"am:EventChainReference\"]", Element.class, this.helper.getGenericNS("xsi"));


		for (final Element eventChainReferenceElement : eventChainReferenceEleemnts) {

			final Attribute eventChainReferenceAttribute = eventChainReferenceElement.getAttribute("eventChain");


			if (eventChainReferenceAttribute != null) {
				final String refEventChainString = eventChainReferenceAttribute.getValue();

				if (refEventChainString != null && refEventChainString.contains("?")) {

					final String refEventChainName = refEventChainString.substring(0,
							refEventChainString.lastIndexOf("?"));

					/*- performing validation, to identify if childelements are referred */

					/*
					 * ASSUMPTION !!! : In case of model element reference, elements name should be already encoded as a part of the reference.
					 * 
					 * allRootEventChainElements -> obtained from the CacheBuilder should already contain encoded names of the EventChain elements
					 */
					if (!allRootEventChainElements.contains((refEventChainName))) {

						/*- this is the case child EventChain element is referred (Note: As per AMALTHEA 0.8.1, it is not supported)*/

						eventChainReferenceElement.removeAttribute(eventChainReferenceAttribute);

						logEventChainMessage_and_Create_CustomProperty(rootEventChainElement,
								eventChainReferenceElement, refEventChainString, refEventChainName);

					}

				}

			}

			/*-
			 * if EventChain element is defined in other model file, then the eventChain element will be generated as a separate tag in XMI
			 *
			 * Example:
			 *
			 * <segments xsi:type="am:EventChainReference">
			 *		<eventChain href="amlt:/#eventChain_from_second_file?type=EventChain"/>
			 *	</segments>
			 *
			 *  */
			final Element eventChainElement = eventChainReferenceElement.getChild("eventChain");

			if (eventChainElement != null) {

				final String hrefValue = eventChainElement.getAttributeValue("href");

				if (hrefValue != null && hrefValue.contains("amlt:/#")) {

					final String refEventChainName = hrefValue.substring(hrefValue.indexOf("#") + 1,
							hrefValue.indexOf("?"));

					/*- performing validation, to identify if childelements are referred */

					/*
					 * ASSUMPTION !!! : In case of model element reference (refEventChainName), elements name should be already encoded as a part of the reference.
					 * 
					 * allRootEventChainElements -> obtained from the CacheBuilder should already contain encoded names of the EventChain elements
					 */
					
					if (!allRootEventChainElements.contains((refEventChainName))) {

						/*- this is the case child EventChain element is referred (Note: As per AMALTHEA 0.8.1, it is not supported)*/

						eventChainReferenceElement.removeContent(eventChainElement);

						logEventChainMessage_and_Create_CustomProperty(rootEventChainElement,
								eventChainReferenceElement, hrefValue, refEventChainName);

					}

				}

			}


		}
	}

	private void logEventChainMessage_TimingConstraint(final Element timingConstraintElement,
			final String refEventChainName) {

		this.logger.warn("Sub EventChain : " + this.helper.decodeName(refEventChainName) + " is referred inside TimingConstraint as \"Scope\": "
				+ timingConstraintElement.getAttributeValue("name")
				+ ". As per 0.8.1, it is not valid to refer sub EventChain elements directly."
				+ System.getProperty("line.separator") + " EventChain " + refEventChainName
				+ "'s association is removed from TimingConstraint object, and corresponding information is stored as a CustomProperty");

	}


	private void logEventChainMessage_and_Create_CustomProperty(final Element rootEventChainElement,
			final Element eventChainReferenceElement, final String refEventChainString,
			final String refEventChainName) {

		this.logger.warn("Sub EventChain : " + this.helper.decodeName(refEventChainName)
				+ " is referred inside EventChainReference of EventChain : "
				+ rootEventChainElement.getAttributeValue("name")
				+ ". As per 0.8.1, it is not valid to refer sub EventChain elements inside EventChainReference."
				+ System.getProperty("line.separator")
				+ " eventChain association is removed from EventChainReference object, and corresponding information is stored as a CustomProperty");


		final Element customPropertyElement = new Element("customProperties");

		customPropertyElement.setAttribute("key", "eventChain");

		final Element valueElement = new Element("value");

		valueElement.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));

		valueElement.setAttribute("value", refEventChainString);

		customPropertyElement.addContent(valueElement);

		eventChainReferenceElement.addContent(customPropertyElement);
	}

	/**
	 * This method returns the names of all root EventChain elements -- from different AMALTHEA models which are in
	 * folder scope
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<String> getAllRootEventChainElements() {

		final ArrayList<String> rootEventChainNames = new ArrayList<String>();

		if (getConstraintElementsCacheBuilder() != null) {

			final Map<File, Map<String, Object>> cacheMap = getConstraintElementsCacheBuilder().getCacheMap();

			final Collection<Map<String, Object>> values = cacheMap.values();

			for (final Map<String, Object> map : values) {

				final Object value = map.get(ConstraintElementsCacheEnum.ROOT_EVENTCHAIN_NAMES.name());

				if (value instanceof List<?>) {
					rootEventChainNames.addAll((Collection<? extends String>) value);
				}
			}


		}

		return rootEventChainNames;
	}

	/**
	 * This method is used to get the ConstraintElementsCacheBuilder object
	 *
	 * @return ConstraintElementsCacheBuilder
	 */
	private ConstraintElementsCacheBuilder getConstraintElementsCacheBuilder() {

		if (this.constraintElementsCacheBuilder == null) {
			for (final ICache cache : this.caches) {

				if (cache instanceof ConstraintElementsCacheBuilder) {
					this.constraintElementsCacheBuilder = (ConstraintElementsCacheBuilder) cache;
					return this.constraintElementsCacheBuilder;
				}
			}
		}

		return this.constraintElementsCacheBuilder;
	}

	

}
