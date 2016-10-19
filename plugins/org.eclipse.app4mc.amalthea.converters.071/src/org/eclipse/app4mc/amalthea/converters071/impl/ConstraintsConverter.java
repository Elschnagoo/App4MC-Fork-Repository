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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters071.utils.HelperUtils_070_071;
import org.jdom2.Document;
import org.jdom2.Element;

public class ConstraintsConverter extends AbstractConverter {


	public ConstraintsConverter() {
		this.helper = HelperUtils_070_071.getInstance();
		this.logger = LogManager.getLogger(this.getClass());
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.0 to 0.7.1 : Starting Constraints converter");

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		/*- Migration of SchedulerPairingConstraint  and SchedulerSeparationConstraint  as per Bug: 500502 */

		remove_SchedulerPairing_SchedulerSeparation_Constraints(rootElement);


		/*- Migration of groupingType attribute of ProcessRunnableGroup  --> as per Bug: 500501 */

		update_ProcessRunnableGroup(rootElement);
	}

	/**
	 * As per the changes introduced in 0.7.1, SchedulerPairing and SchedulerSeparation constraints are removed from
	 * data model
	 *
	 * For details refer to : Bug: 500502
	 *
	 * @param rootElement
	 */

	private void remove_SchedulerPairing_SchedulerSeparation_Constraints(final Element rootElement) {

		final List<Element> constraints = this.helper.getXpathResult(rootElement,
				"./constraintsModel/affinityConstraints[@xsi:type=\"am:SchedulerPairingConstraint\" or @xsi:type=\"am:SchedulerSeparationConstraint\" ]",
				Element.class, this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

		for (final Element constraint : constraints) {
			constraint.getParentElement().removeContent(constraint);
		}
	}


	/**
	 * As per the changes introduced in 0.7.1 for ProcessRunnableGroup:<br>
	 *
	 * groupingType is removed<br>
	 *
	 * enties are removed (as Element : ProcessRunnableGroupEntry is deleted from the model) <br>
	 *
	 * For details refer to : Bug: 500501
	 *
	 * @param rootElement
	 */

	private void update_ProcessRunnableGroup(final Element rootElement) {

		final List<Element> runnableGroups = this.helper.getXpathResult(rootElement,
				"./constraintsModel/runnableSequencingConstraints/runnableGroups", Element.class,
				this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

		for (final Element runnableGroup : runnableGroups) {

			/*- Removing groupingType */
			runnableGroup.removeAttribute("groupingType");

			final List<Element> processRunnableGroupEntries = runnableGroup.getChildren("entries");


			/*- Adding runnable Elements references  -> by fetching the data from ProcessRunnableGroupEntry objects   */

			final Set<String> runnableRefs = getRunnableRefs_from_ProcessRunnableGroupEntries(
					processRunnableGroupEntries);

			for (final String runnableRef : runnableRefs) {

				final Element runnableRefElement = new Element("runnables");

				runnableRefElement.setAttribute("href", runnableRef);

				runnableGroup.addContent(runnableRefElement);

			}

			/*- Removing Element : entries, as ProcessRunnableGroupEntry is removed  */
			runnableGroup.removeChildren("entries");

		}
	}

	/**
	 * This method is used to get unique Runnable references (in valid AMALTHEA format) from ProcessRunnableGroupEntry
	 * objects
	 *
	 * @param processRunnableGroupEntries
	 *            List<Element> List of ProcessRunnableGroupEntry objects
	 * @return List<String> list of runnableRefs in valid AMALTHEA HREF format
	 */
	private Set<String> getRunnableRefs_from_ProcessRunnableGroupEntries(
			final List<Element> processRunnableGroupEntries) {

		final Set<String> runnableRefs = new HashSet<String>();

		for (final Element entry : processRunnableGroupEntries) {
			String attributeValue = entry.getAttributeValue("runnable");

			if (attributeValue == null) {
				final Element runnableElement = entry.getChild("runnable");

				if (runnableElement != null) {
					attributeValue = runnableElement.getAttributeValue("href");
				}

			}

			if (attributeValue != null) {

				/*-
				 * In case of element references, following scenarios can exists:
				 *
				 *  1. Element ID is present as attribute value
				 *  2. Element reference as per AMALTHEA referencing mechanism
				 */
				if (attributeValue.contains("?")) {

					/*-
					 * This is the case attribute value can exists in one of the below format:
					 *
					 * Case 1: "r1?type=Runnable"
					 * Case 2: "amlt:/#r2?type=Runnable"
					 */
					if (!attributeValue.contains("amlt:/#")) {
						attributeValue = ("amlt:/#" + attributeValue);
					}
					runnableRefs.add(attributeValue);
				}
				else {
					/*-
					 * This is the case value is existing in one of the below format:
					 *
					 * Case 1: elements.amxmi#_USTB0JXtEeaygMeuHaNR-Q
					 *
					 * Case 2: _USTB0JXtEeaygMeuHaNR-Q
					 *
					 *In both the case valid conversion is : amlt:/#_USTB0JXtEeaygMeuHaNR-Q
					 */

					final int indexOf = attributeValue.indexOf("#");
					if (indexOf != -1) {
						attributeValue = attributeValue.substring(indexOf + 1);
					}
					runnableRefs.add("amlt:/#" + attributeValue);
				}
			}
		}
		return runnableRefs;
	}


}
