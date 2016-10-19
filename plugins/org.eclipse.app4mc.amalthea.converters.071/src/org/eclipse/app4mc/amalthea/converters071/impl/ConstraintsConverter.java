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
import java.util.List;
import java.util.Map;

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

		/*- Migration of ProcessRunnableGroupEntry as per Bug: 500501 */

		remove_processScope_ProcessRunnableGroupEntry(rootElement);

		/*- Migration of groupingType attribute of ProcessRunnableGroup  --> as per Bug: 500501 */

		remove_groupingType_ProcessRunnableGroup(rootElement);
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
	 * As per the changes introduced in 0.7.1, processScope is removed from ProcessRunnableGroupEntry element
	 *
	 * For details refer to : Bug: 500501
	 *
	 * @param rootElement
	 */

	private void remove_processScope_ProcessRunnableGroupEntry(final Element rootElement) {

		final List<Element> processRunnableGroupEntries = this.helper.getXpathResult(rootElement,
				"./constraintsModel/runnableSequencingConstraints/runnableGroups/entries", Element.class,
				this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

		for (final Element processRunnableGroupEntry : processRunnableGroupEntries) {

			processRunnableGroupEntry.removeAttribute("processScope");
			processRunnableGroupEntry.removeChildren("processScope");

		}
	}

	/**
	 * As per the changes introduced in 0.7.1, groupingType is removed from ProcessRunnableGroup element
	 *
	 * For details refer to : Bug: 500501
	 *
	 * @param rootElement
	 */

	private void remove_groupingType_ProcessRunnableGroup(final Element rootElement) {

		final List<Element> runnableGroups = this.helper.getXpathResult(rootElement,
				"./constraintsModel/runnableSequencingConstraints/runnableGroups", Element.class,
				this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

		for (final Element runnableGroup : runnableGroups) {

			runnableGroup.removeAttribute("groupingType");

		}
	}


}
