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

package org.eclipse.app4mc.amalthea.converters071.impl;

import java.io.File;
import java.util.AbstractMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters071.utils.HelperUtils_070_071;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class ConstraintsConverter extends AbstractConverter {


	public ConstraintsConverter() {
		this.helper = HelperUtils_070_071.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.0 to 0.7.1 : Executing Constraints converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		/*- Migration of SchedulerPairingConstraint  and SchedulerSeparationConstraint  as per Bug: 500502 */

		remove_SchedulerPairing_SchedulerSeparation_Constraints(rootElement);


		/*- Migration of groupingType attribute of ProcessRunnableGroup  --> as per Bug: 500501 */

		update_ProcessRunnableGroup(rootElement);

		/*- Migration of OrderConstraint as per Bug: 500506 */

		remove_OrderConstraints(rootElement);

		/*- Migration of Age/Reaction/Delay/Synchronisation Constraints as per Bug: 500506 */

		update_Age_Reaction_Delay_SynchronisationConstraints(rootElement);
	}

	/**
	 * Bug: 500506<br>
	 * This method is used to migrate the below Elements:
	 *
	 * <pre>
	 * 1. AgeConstraint
	 *			 AgeConstraint object is changed to EventChainLatencyConstraint.
	 *			 LatencyType attribute should be : Age
	 * 2. ReactionConstraint
	 *			 ReactionConstraint object is changed to EventChainLatencyConstraint
	 *			 LatencyType attribute should be : Reaction
	 * 3. DelayConstraint
	 *			 mappingType value is set as "Reaction"
	 *
	 * </pre>
	 *
	 * @param rootElement
	 *            Root Element of AMALTHEA model file
	 */
	private void update_Age_Reaction_Delay_SynchronisationConstraints(final Element rootElement) {


		final List<Element> ageConstraints = this.helper.getXpathResult(rootElement,
				"./constraintsModel/timingConstraints[@xsi:type=\"am:AgeConstraint\" or @xsi:type=\"am:ReactionConstraint\" or  @xsi:type=\"am:DelayConstraint\" or @xsi:type=\"am:SynchronisationConstraint\"]",
				Element.class, this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

		for (final Element constraint : ageConstraints) {

			final Attribute typeAttrib = constraint.getAttribute("type", this.helper.getGenericNS("xsi"));

			final String attribValue = typeAttrib.getValue();

			if (attribValue.equals("am:AgeConstraint")) {

				/*- Migrating AgeConstraint elements to EventChainLatencyConstraint */

				typeAttrib.setValue("am:EventChainLatencyConstraint");

				constraint.setAttribute("type", "Age");

			}
			else if (attribValue.equals("am:ReactionConstraint")) {

				/*- Migrating ReactionConstraint elements to EventChainLatencyConstraint */

				typeAttrib.setValue("am:EventChainLatencyConstraint");

				constraint.setAttribute("type", "Reaction");

			}
			else if (attribValue.equals("am:SynchronisationConstraint")) {

				/*- Migrating SynchronisationConstraint elements to EventSynchronizationConstraint */

				typeAttrib.setValue("am:EventSynchronizationConstraint");

			}
			else if (attribValue.equals("am:DelayConstraint")) {

				/*- Migrating DelayConstraint */

				constraint.setAttribute("mappingType", "Reaction");
			}


		}


	}

	/**
	 * As per the changes introduced in 0.7.1, OrderConstraint elements are removed from data model
	 *
	 * For details refer to : Bug: 500506
	 *
	 * @param rootElement
	 */
	private void remove_OrderConstraints(final Element rootElement) {

		final List<Element> constraints = this.helper.getXpathResult(rootElement,
				"./constraintsModel/timingConstraints[@xsi:type=\"am:OrderConstraint\"]", Element.class,
				this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

		for (final Element constraint : constraints) {
			constraint.getParentElement().removeContent(constraint);
		}

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


			final Map.Entry<Boolean, Set<String>> resultEntry = getRunnableRefs_from_ProcessRunnableGroupEntries(
					processRunnableGroupEntries);

			final Boolean isExternalAmaltheaModelElementReferred = resultEntry.getKey();

			final Set<String> runnableRefs = resultEntry.getValue();

			if (isExternalAmaltheaModelElementReferred) {

				/*-
				 * Below is the standard behaviour from EMF/Sphinx (also the same is depicted when Amalthea editor is used)
				 *
				 * If atleast one Runnable element from other model is referred then all the references should be generated as seperate "runnables" tag containing "href" attribute
				 *
				 *  <runnableGroups  xmi:id="_bKVRUOL0EeaRdL88dwrE6Q">
						<runnables href="#_c2jikOL0EeaRdL88dwrE6Q"/>
						<runnables href="#_tyEzEOL1EeaRdL88dwrE6Q"/>
						<runnables href="ref.amxmi#_ksC4IOL0EeaRdL88dwrE6Q"/>
					</runnableGroups>
				 */

				for (String runnableRef : runnableRefs) {

					final Element runnableRefElement = new Element("runnables");

					if (runnableRef.contains("?")) {

						/*-
						 * This is the case attribute value can exists in one of the below format:
						 *
						 * Case 1: "r1?type=Runnable"
						 * Case 2: "amlt:/#r2?type=Runnable"
						 */
						if (!runnableRef.contains("amlt:/#")) {
							runnableRef = ("amlt:/#" + runnableRef);
						}

					}
					else {
						/*-
						 * This is the case value is existing in one of the below format:
						 *
						 * Case 1: elements.amxmi#_USTB0JXtEeaygMeuHaNR-Q
						 *
						 * Case 2: _USTB0JXtEeaygMeuHaNR-Q
						 *
						 * Case 3: #_USTB0JXtEeaygMeuHaNR-Q
						 *
						 *In all the cases valid conversion is : amlt:/#_USTB0JXtEeaygMeuHaNR-Q
						 */

						final int indexOf = runnableRef.indexOf("#");
						if (indexOf != -1) {
							runnableRef = runnableRef.substring(indexOf + 1);
						}
						runnableRef = "amlt:/#" + runnableRef;

					}

					runnableRefElement.setAttribute("href", runnableRef);

					runnableGroup.addContent(runnableRefElement);

				}
			}
			else {

				// This is the case where no runnable elements from other models are imported
				final StringBuffer runnablesBuffer = new StringBuffer();

				for (final String runnable : runnableRefs) {
					runnablesBuffer.append(runnable);
					runnablesBuffer.append(" ");
				}

				runnableGroup.setAttribute(new Attribute("runnables", runnablesBuffer.toString().trim()));
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
	 * @return Map.Entry<Boolean, Set<String>> <br>
	 *         key is the boolean value (used to identify if there exists any runnable elements from other models) <br>
	 *         value is the Set of runnableRefs
	 */
	private Map.Entry<Boolean, Set<String>> getRunnableRefs_from_ProcessRunnableGroupEntries(
			final List<Element> processRunnableGroupEntries) {

		boolean isElementFromOtherFilePresent = false;

		final Set<String> runnableRefs = new LinkedHashSet<String>();

		for (final Element entry : processRunnableGroupEntries) {
			String attributeValue = entry.getAttributeValue("runnable");

			if (attributeValue == null) {
				final Element runnableElement = entry.getChild("runnable");

				if (runnableElement != null) {
					attributeValue = runnableElement.getAttributeValue("href");

					/*- Note: presence of external element will influence the content generation in amxmi file.
					 * Due to this reason below check is performed and the result is stored in the boolean value*/

					if (attributeValue != null) {
						isElementFromOtherFilePresent = true;
					}
				}

			}

			if (attributeValue != null) {
				// Attribute value (or) href value is directly stored in the Set (so as to obtain the unique values)
				runnableRefs.add(attributeValue);
			}
		}
		return new AbstractMap.SimpleEntry<>(isElementFromOtherFilePresent, runnableRefs);
	}


}
