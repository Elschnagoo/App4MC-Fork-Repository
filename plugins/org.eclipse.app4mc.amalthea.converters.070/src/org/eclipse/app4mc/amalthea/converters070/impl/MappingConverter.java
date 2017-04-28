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
package org.eclipse.app4mc.amalthea.converters070.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters070.utils.HelperUtils_111_070;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class MappingConverter implements IConverter {

	private final HelperUtils_111_070 helper;

	private final Logger logger;

	public MappingConverter() {
		this.helper = HelperUtils_111_070.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from itea.111 to 0.7.0 : Executing Mapping converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		update_ProcessAllocation(rootElement);

		update_Mapping_mem(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	private void update_Mapping_mem(final Element rootElement) {

		final List<Element> mappings = this.helper.getXpathResult(rootElement,
				".//mappingModel/mapping|/mapping:MappingModel/mapping", Element.class,
				this.helper.getNS_111("mapping"), this.helper.getGenericNS("xsi"));

		for (final Element mappingElement : mappings) {

			final Attribute memAttribute = mappingElement.getAttribute("mem");

			if (memAttribute != null) {
				memAttribute.setName("memory");
			}
			else {
				/*-This is a case of cross document reference */

				final Element memElement = mappingElement.getChild("mem");
				if (memElement != null) {
					memElement.setName("memory");
				}
			}


		}

	}

	private void update_ProcessAllocation(final Element rootElement) {

		/*--
		 * Migraiton step to App4MC 0.7.0 from itea.1.1.1: processAllocation tag contents are splitted into taskAllocation, isrAllocation
		 */

		final List<Element> taskAllocations = this.helper.getXpathResult(rootElement,
				".//mappingModel/processAllocation[(@xsi:type=\"mapping:TaskAllocation\")]|/mapping:MappingModel/processAllocation[(@xsi:type=\"mapping:TaskAllocation\")]",
				Element.class, this.helper.getNS_111("mapping"), this.helper.getGenericNS("xsi"));


		for (final Element processAllocationElement : taskAllocations) {


			final Element newTaskAllocationElement = new Element("taskAllocation");

			final String process = processAllocationElement.getAttributeValue("process");

			final String scheduler = processAllocationElement.getAttributeValue("scheduler");

			/*-
			 * This content will occur when both Process and Scheduler elemetns are referred from different model files
			 *==============================
			 *Input from 1.1.1:
			 *==============================
			 * <processAllocation xsi:type="mapping:TaskAllocation">
			 *		 <process xsi:type="sw:Task" href="amlt:/#Task_sw?type=sw.Task"/>
			 *		 <scheduler xsi:type="os:TaskScheduler" href="amlt:/#scheduler_os?type=os.TaskScheduler"/>
			 *	</processAllocation>
			 *
			 *==============================
			 *Expected output from migrator:
			 *==============================
			 *<taskAllocation>
			 *	<task href="amlt:/#Task_sw?type=Task"/>
			 *	<scheduler href="amlt:/#scheduler_os?type=TaskScheduler"/>
			 * </taskAllocation>
			 */

			if (process != null) {

				newTaskAllocationElement.setAttribute("task", process);

			}
			else {
				final Element processElement = processAllocationElement.getChild("process");

				final String href = processElement != null ? processElement.getAttributeValue("href") : null;

				if (href != null) {
					final Element sub_task_Element = new Element("task");
					sub_task_Element.setAttribute("href", href);
					/*- Associating task element to the taskAllocation element */
					newTaskAllocationElement.addContent(sub_task_Element);
				}

			}

			if (scheduler != null) {
				newTaskAllocationElement.setAttribute("scheduler", scheduler);
			}
			else {
				final Element schedulerElement = processAllocationElement.getChild("scheduler");

				final String href = schedulerElement != null ? schedulerElement.getAttributeValue("href") : null;

				if (href != null) {
					final Element sub_scheduler_Element = new Element("scheduler");
					sub_scheduler_Element.setAttribute("href", href);
					/*- Associating task element to the taskAllocation element */
					newTaskAllocationElement.addContent(sub_scheduler_Element);
				}
			}


			/*- associating the new element to the parent */
			final Element parentElement = processAllocationElement.getParentElement();

			parentElement.addContent(newTaskAllocationElement);

			processAllocationElement.detach();

		}

		/* =============== Handling elements of type mapping:ISRAllocation =============== */

		final List<Element> isrAllocations = this.helper.getXpathResult(rootElement,
				".//mappingModel/processAllocation[(@xsi:type=\"mapping:ISRAllocation\")]|/mapping:MappingModel/processAllocation[(@xsi:type=\"mapping:ISRAllocation\")]",
				Element.class, this.helper.getNS_111("mapping"), this.helper.getGenericNS("xsi"));

		for (final Element processAllocationElement : isrAllocations) {

			final Element newISRAllocationElement = new Element("isrAllocation");

			final String process = processAllocationElement.getAttributeValue("process");

			final String scheduler = processAllocationElement.getAttributeValue("scheduler");

			/*-
			 * This content will occur when both Process and Scheduler elemetns are referred from different model files
			 *==============================
			 *Input from 1.1.1:
			 *==============================
			 * <processAllocation xsi:type="mapping:ISRAllocation">
			 *		<process xsi:type="sw:ISR" href="amlt:/#ISR_SW?type=sw.ISR"/>
			 *		<scheduler xsi:type="os:InterruptController" href="amlt:/#IC_os?type=os.InterruptController"/>
			 *	</processAllocation>
			 *
			 *==============================
			 *Expected output from migrator:
			 *==============================
			 *<isrAllocation>
			 *		<isr href="amlt:/#ISR_sw?type=ISR"/>
			 *		<controller href="amlt:/#IC_os?type=InterruptController"/>
			 *	</isrAllocation>
			 */
			if (process != null) {
				newISRAllocationElement.setAttribute("isr", process);
			}
			else {
				final Element processElement = processAllocationElement.getChild("process");

				final String href = processElement != null ? processElement.getAttributeValue("href") : null;

				if (href != null) {
					final Element sub_isr_Element = new Element("isr");
					sub_isr_Element.setAttribute("href", href);
					/*- Associating task element to the taskAllocation element */
					newISRAllocationElement.addContent(sub_isr_Element);
				}

			}


			if (scheduler != null) {
				newISRAllocationElement.setAttribute("controller", scheduler);
			}
			else {
				final Element schedulerElement = processAllocationElement.getChild("scheduler");

				final String href = schedulerElement != null ? schedulerElement.getAttributeValue("href") : null;

				if (href != null) {
					final Element sub_controller_Element = new Element("controller");
					sub_controller_Element.setAttribute("href", href);
					/*- Associating task element to the taskAllocation element */
					newISRAllocationElement.addContent(sub_controller_Element);
				}
			}


			/*- associating the new element to the parent */
			final Element parentElement = processAllocationElement.getParentElement();

			parentElement.addContent(newISRAllocationElement);

			processAllocationElement.detach();
		}


	}


}
