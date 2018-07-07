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

package org.eclipse.app4mc.amalthea.converters072.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters072.utils.HelperUtils_071_072;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Parent;

public class OSConverter extends AbstractConverter {


	public OSConverter() {
		this.helper = HelperUtils_071_072.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.7.1 to 0.7.2 : Executing OS converter for model file : " + targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		update_AffinityConstraints(rootElement);

		update_OsExecutionInstructions(rootElement);

		update_OsBuffering(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	/**
	 * This method is used to migrate the OsBuffering element as per the changes in 0.7.2.
	 *
	 * Below are the steps which are followed
	 *
	 * <pre>
	 *  * OsBuffering element is replaced with element OsDataConsistency
	 *  		Case 1: If (OsBuffering::runnableLevel || OsBuffering::processLevel || OsBuffering::scheduleSectionLevel) =="true" then
	 *  					- OsDataConsistency object is created and the mode is set as "automaticProtection"
	 *  						- DataStability object is created inside OsDataConsistency and below properties are set
	 *  								- enabled=true
	 *  								- algorithm = OsBuffering::bufferingAlgorithm
	 *  								- accessMultiplicity = multipleAccesses
	 *  								- level = <respective OsBuffering flag>
	 *         Case 2: If (OsBuffering::runnableLevel || OsBuffering::processLevel || OsBuffering::scheduleSectionLevel) =="false" then
	 *         				- OsDataConsistency object is created and the mode is set as "noProtection"
	 *
	 *         Case 3: If OsBuffering element is not present then
	 *         				- OsDataConsistency object is created and the mode is set as "_undefined_" (i.e. default)
	 *
	 * </pre>
	 *
	 * @param rootElement
	 */
	private void update_OsBuffering(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./osModel/osBuffering");


		final List<Element> osBufferingElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		if (osBufferingElements.size() > 0) {

			for (final Element osBufferingElement : osBufferingElements) {

				final String runnableLevel = osBufferingElement.getAttributeValue("runnableLevel");
				final String processLevel = osBufferingElement.getAttributeValue("processLevel");
				final String scheduleSectionLevel = osBufferingElement.getAttributeValue("scheduleSectionLevel");
				final String bufferingAlgorithm = osBufferingElement.getAttributeValue("bufferingAlgorithm");

				if (Boolean.valueOf(runnableLevel) || Boolean.valueOf(processLevel)
						|| Boolean.valueOf(scheduleSectionLevel)) {

					final Parent osModelElement = osBufferingElement.getParent();
					osModelElement.removeContent(osBufferingElement);

					final Element osDataConsistencyElement = new Element("osDataConsistency");
					osDataConsistencyElement.setAttribute("mode", "automaticProtection");

					final Element dataStabilityElement = new Element("dataStability");
					osDataConsistencyElement.addContent(dataStabilityElement);

					dataStabilityElement.setAttribute("enabled", "true");
					dataStabilityElement.setAttribute("algorithm",
							bufferingAlgorithm != null ? bufferingAlgorithm : "");
					dataStabilityElement.setAttribute("accessMultiplicity", "multipleAccesses");

					if (Boolean.valueOf(processLevel)) {
						dataStabilityElement.setAttribute("level", "process");
					}
					else if (Boolean.valueOf(runnableLevel)) {
						dataStabilityElement.setAttribute("level", "runnable");
					}
					else if (Boolean.valueOf(scheduleSectionLevel)) {
						dataStabilityElement.setAttribute("level", "scheduleSection");
					}

					osModelElement.addContent(osDataConsistencyElement);

				}
				else {
					// this is the case where all the booleans are resulting false

					final Parent osModelElement = osBufferingElement.getParent();
					osModelElement.removeContent(osBufferingElement);
					final Element osDataConsistencyElement = new Element("osDataConsistency");
					osDataConsistencyElement.setAttribute("mode", "noProtection");

					osModelElement.addContent(osDataConsistencyElement);

				}

			}

		}
		else {
			// this is the case where OSBuffering is not present

			final Element osModelElement = rootElement.getChild("osModel");

			if (osModelElement != null) {
				final Element osDataConsistencyElement = new Element("osDataConsistency");
				osModelElement.addContent(osDataConsistencyElement);

			}

		}

	}

	private void update_OsExecutionInstructions(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./osModel/operatingSystems/taskSchedulers/schedulingUnit/instructions");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/operatingSystems/interruptControllers/schedulingUnit/instructions");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiSendMessage");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiTerminateTask");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiSchedule");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiRequestResource");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiReleaseResource");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiSetEvent");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiWaitEvent");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiClearEvent");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiActivateTask");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiEnforcedMigration");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/isrCategory1Overhead/preExecutionOverhead");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/isrCategory1Overhead/postExecutionOverhead");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/isrCategory2Overhead/preExecutionOverhead");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/isrCategory2Overhead/postExecutionOverhead");

		final List<Element> instructionElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		for (final Element instructionElement : instructionElements) {

			final Attribute attribute = instructionElement.getAttribute("type", this.helper.getGenericNS("xsi"));

			if (attribute != null) {
				final String value = attribute.getValue();
				if (value != null) {
					if (value.equals("am:OsExecutionInstructionsConstant")) {

						attribute.setValue("am:InstructionsConstant");
					}
					else if (value.equals("am:OsExecutionInstructionsDeviation")) {
						attribute.setValue("am:InstructionsDeviation");
					}

				}
			}
		}

	}

	private void update_AffinityConstraints(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./osModel/semaphores");


		final List<Element> semaphoreElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		for (final Element semaphoreElement : semaphoreElements) {

			final Attribute attribute = semaphoreElement.getAttribute("initalValue");

			if (attribute != null) {
				attribute.setName("initialValue");
			}
		}
	}


}
