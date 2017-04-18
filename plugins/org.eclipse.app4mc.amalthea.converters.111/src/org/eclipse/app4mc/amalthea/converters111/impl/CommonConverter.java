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
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters111.utils.HelperUtils_110_111;
import org.jdom2.Document;
import org.jdom2.Element;

public class CommonConverter implements IConverter {

	private final HelperUtils_110_111 helper;
	private final Logger logger;

	public CommonConverter() {
		this.helper = HelperUtils_110_111.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from itea.110 to itea.111 : Starting Common converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_111(rootElement);

		updateEnum_TimeUnit(rootElement);

		update_Tag(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}


	private void update_Tag(final Element rootElement) {

		/*
		 * tagName attribute (as per 1.1.0) inside Tag is changed to "name" in 1.1.1
		 *
		 * As a part of model migration all the definitions of the Tag object should be updated with the new attribute
		 * "name"
		 */
		final List<Element> tags = this.helper.getXpathResult(rootElement,
				".//componentsModel/tags[not(@type)]|/components:ComponentsModel/tags|.//swModel/tags| /sw:SWModel/tags",
				Element.class, this.helper.getNS_111("components"), this.helper.getNS_111("sw"));


		for (final Element tag : tags) {

			final String attributeValue = tag.getAttributeValue("tagName");

			tag.removeAttribute("tagName");

			if (attributeValue != null) {
				tag.setAttribute("name", attributeValue);
			}
		}
	}

	private void updateEnum_TimeUnit(final Element rootElement) {


		/*- TimeUnit enum is contained inside Time, SignedTime with variable unit
		 *
		 * Time is contained inside various Class's with variable reference names as :
		 * tolerance,minimum,maximum,upper,lower,jitter,minimumTime,maximumTime,delay,offset,recurrence,activation,lowerTimeBorder,upperTimeBorder,period,time,deadline, min, max, offset, deadline
		 *
		 * =========================================
		 *|| SignedTime can be contained inside:   ||
		 * =========================================
		 *  1.abstract class Stimulus - with variable name as stimulusDeviation
		 *
		 *  Abstract class Stimulus objects are referred inside StimuliModel using "stimuli" array variable
		 *
		 *  stimulusDeviation can have following variables which can contain SignedTime :
		 *  lowerBound
		 *  upperBound
		 *  distribution -> as a complex node which can further contain SignedTime references inside.
		 *
		 *  2.ClockTriangleFunction - with variable name as shift
		 *
		 *  3.ClockSinusFunction - with variable name as shift
		 * =========================================
		 *|| Time can be contained inside: 		  ||
		 * =========================================
		 *                                                              SchedulingHWUnit->delay
		 * SynchronisationConstraint -> tolerance                       stimuli:Periodic->offset
		 * ReactionConstraint ->minimum                                 stimuli:Periodic->recurrence
		 * ReactionConstraint ->maximum                                 sw:Periodic -> min
		 * DelayConstraint->upper                                       sw:Periodic -> max
		 * DelayConstraint->lower                                       sw:Periodic -> offset
		 * AgeConstraint->maximum                                       sw:Periodic -> deadline
		 * AgeConstraint->minimum                                       SingleActivation -> min
		 * RepetitionConstraint->lower                                  SingleActivation -> max
		 * RepetitionConstraint->upper                                  Single -> activation
		 * RepetitionConstraint->jitter                                 ArrivalCurveEntry ->lowerTimeBorder
		 * DataAgeTime->minimumTime                                     ArrivalCurveEntry ->upperTimeBorder
		 * DataAgeTime->maximumTime                                     ClockTriangleFunction -> period
		 * AbstractProcess -> deadline (removeed in 1.1.1)              ClockSinusFunction -> period
		 * Runnable -> deadline                                         ClockMultiplierListEntry -> time

		 */


		/*--
		 *  * Migraiton step to 111 from 110: Grep the references of "features" and "hw:FeatureTypes" tag which do not contain "value" attribute
		 *  */

		final StringBuffer timeXpathBuffer = new StringBuffer();

		timeXpathBuffer.append(
				".//timingConstraints[(@xsi:type=\"constraints:SynchronisationConstraint\")]/tolerance[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer
				.append(".//timingConstraints[(@xsi:type=\"constraints:ReactionConstraint\")]/minimum[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer
				.append(".//timingConstraints[(@xsi:type=\"constraints:ReactionConstraint\")]/maximum[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//timingConstraints[(@xsi:type=\"constraints:DelayConstraint\")]/upper[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//timingConstraints[(@xsi:type=\"constraints:DelayConstraint\")]/lower[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//timingConstraints[(@xsi:type=\"constraints:AgeConstraint\")]/maximum[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//timingConstraints[(@xsi:type=\"constraints:AgeConstraint\")]/minimum[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer
				.append(".//timingConstraints[(@xsi:type=\"constraints:RepetitionConstraint\")]/lower[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer
				.append(".//timingConstraints[(@xsi:type=\"constraints:RepetitionConstraint\")]/upper[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer
				.append(".//timingConstraints[(@xsi:type=\"constraints:RepetitionConstraint\")]/jitter[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(
				".//dataAgeConstraints/dataAge[(@xsi:type=\"constraints:DataAgeTime\")]/minimumTime[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(
				".//dataAgeConstraints/dataAge[(@xsi:type=\"constraints:DataAgeTime\")]/maximumTime[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//schedulingUnit[(@xsi:type=\"os:SchedulingHWUnit\")]/delay[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//stimuli[(@xsi:type=\"stimuli:Periodic\")]/offset[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//stimuli[(@xsi:type=\"stimuli:Periodic\")]/recurrence[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:Periodic\")]/min[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:Periodic\")]/max[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:Periodic\")]/deadline[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:Periodic\")]/offset[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:SingleActivation\")]/min[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:SingleActivation\")]/max[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//stimuli[(@xsi:type=\"stimuli:Single\")]/activation[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(
				".//stimuli[(@xsi:type=\"stimuli:ArrivalCurve\")]/arrivalCurveEntries/lowerTimeBorder[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(
				".//stimuli[(@xsi:type=\"stimuli:ArrivalCurve\")]/arrivalCurveEntries/upperTimeBorder[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockTriangleFunction\")]/period[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockSinusFunction\")]/period[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockMultiplierList\")]/entries/time[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//runnables/deadline[not(@unit)]|/sw:Runnable/deadline[not(@unit)]");
		timeXpathBuffer.append("|");
		timeXpathBuffer.append(".//schedulingUnit[(@xsi:type=\"sw:SchedulingSWUnit\")]/runnable/deadline[not(@unit)]");

		final List<Element> matchingTimeElements = this.helper.getXpathResult(rootElement, timeXpathBuffer.toString(),
				Element.class, this.helper.getNS_111("common"), this.helper.getNS_111("stimuli"),
				this.helper.getNS_111("os"), this.helper.getNS_111("hw"), this.helper.getNS_111("sw"),
				this.helper.getGenericNS("xsi"));

		for (final Element element : matchingTimeElements) {

			element.setAttribute("unit", "ps");
		}

		final StringBuffer signedTimeXpathBuffer = new StringBuffer();
		signedTimeXpathBuffer
				.append(".//stimuli/stimulusDeviation/lowerBound[(@xsi:type=\"common:SignedTime\") and not(@unit)]");
		signedTimeXpathBuffer.append("|");
		signedTimeXpathBuffer
				.append(".//stimuli/stimulusDeviation/upperBound[(@xsi:type=\"common:SignedTime\") and not(@unit)]");
		signedTimeXpathBuffer.append("|");
		signedTimeXpathBuffer.append(
				".//stimuli/stimulusDeviation/distribution/*[(@xsi:type=\"common:SignedTime\") and not(@unit)]");
		signedTimeXpathBuffer.append("|");

		signedTimeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockTriangleFunction\")]/shift[not(@unit)]");
		signedTimeXpathBuffer.append("|");
		signedTimeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockSinusFunction\")]/shift[not(@unit)]");


		final List<Element> matchingSignedTimeElements = this.helper.getXpathResult(rootElement,
				signedTimeXpathBuffer.toString(), Element.class, this.helper.getNS_111("common"),
				this.helper.getNS_111("stimuli"), this.helper.getGenericNS("xsi"));


		for (final Element element : matchingSignedTimeElements) {

			element.setAttribute("unit", "ps");
		}

	}


}
