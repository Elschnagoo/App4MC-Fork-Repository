/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters095.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters095.utils.HelperUtils_094_095;
import org.jdom2.Document;
import org.jdom2.Element;

public class SwConverter extends AbstractConverter {

	public SwConverter() {
		this.helper = HelperUtils_094_095.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File file, final Map<File, Document> map, final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.9.4 to 0.9.5 : Executing Sw converter for model file : " + file.getName());

		basicConvert(file, map, caches);
	}

	public void basicConvert(final File file, final Map<File, Document> map, final List<ICache> caches) {

		final Document document = map.get(file);
		if (document == null) {
			return;
		}

		final Element rootElement = document.getRootElement();

		update_GraphEntries(rootElement);
		update_CallSequences(rootElement);

		update_RunnableItems(rootElement);
		update_RunnableModeSwitches(rootElement);
		update_RunnableProbabilitySwitches(rootElement);
	}

	private void update_GraphEntries(final Element rootElement) {
		final String xpath = "./swModel/tasks/callGraph/graphEntries";

		final List<Element> entries = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_095("am"), this.helper.getGenericNS("xsi"));

		for (Element graphEntry : entries) {
			// graphEntries -> items
			graphEntry.setName("items");
		}
	}

	private void update_CallSequences(final Element rootElement) {
		final String xpath = "./swModel/tasks//*[@xsi:type=\"am:CallSequence\"]";

		final List<Element> callSequences = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_095("am"), this.helper.getGenericNS("xsi"));

		for (Element cs : callSequences) {
			// CallSequence -> Group
			cs.setAttribute("type", "am:Group", this.helper.getGenericNS("xsi"));

			// set name="CallSequence"
			String oldName = cs.getAttributeValue("name");
			if (oldName == null || oldName.isEmpty()) {
				cs.setAttribute("name", "CallSequence");
			}

			// set ordered="true"
			cs.setAttribute("ordered", "true");

			for (Element call : cs.getChildren()) {
				// calls -> items
				call.setName("items");

				// am:TaskRunnableCall -> am:RunnableCall
				String callType = call.getAttributeValue("type", this.helper.getGenericNS("xsi"));
				if (callType.equals("am:TaskRunnableCall")) {
					call.setAttribute("type", "am:RunnableCall", this.helper.getGenericNS("xsi"));
				}
			}
		}
	}

	private void update_RunnableItems(final Element rootElement) {
		final String xpath = "./swModel/runnables";

		final List<Element> runnables = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_095("am"), this.helper.getGenericNS("xsi"));

		for (Element runnable : runnables) {
			// create call graph
			Element callGraph = new Element("callGraph");
			runnable.addContent(callGraph);

			// copy list of runnable items !
			List<Element> runnableItems = new ArrayList<>(runnable.getChildren("runnableItems"));

			for (Element item : runnableItems) {
				// runnableItems -> items
				item.setName("items");

				// move to callGraph
				item.detach();
				callGraph.addContent(item);
			}
		}
	}

	private void update_RunnableModeSwitches(final Element rootElement) {
		final String xpath = "./swModel/runnables//*[@xsi:type=\"am:RunnableModeSwitch\"]";

		final List<Element> switches = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_095("am"), this.helper.getGenericNS("xsi"));

		for (Element elem : switches) {
			// RunnableModeSwitch -> ModeSwitch
			elem.setAttribute("type", "am:ModeSwitch", this.helper.getGenericNS("xsi"));
		}
	}

	private void update_RunnableProbabilitySwitches(final Element rootElement) {
		final String xpath = "./swModel/runnables//*[@xsi:type=\"am:RunnableProbabilitySwitch\"]";

		final List<Element> switches = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_095("am"), this.helper.getGenericNS("xsi"));

		for (Element elem : switches) {
			// RunnableProbabilitySwitch -> ProbabilitySwitch
			elem.setAttribute("type", "am:ProbabilitySwitch", this.helper.getGenericNS("xsi"));
		}
	}

}
