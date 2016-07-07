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
package org.eclipse.app4mc.amalthea.converters110.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters.common.utils.HrefElement;
import org.eclipse.app4mc.amalthea.converters.common.utils.Tags;
import org.eclipse.app4mc.amalthea.converters110.utils.HelperUtils_103_110;
import org.eclipse.app4mc.amalthea.converters110.utils.ProcessCacheBuilder;
import org.eclipse.app4mc.amalthea.converters110.utils.ProcessCacheEnum;
import org.eclipse.app4mc.amalthea.converters110.utils.SchedulerCacheBuilder;
import org.eclipse.app4mc.amalthea.converters110.utils.SchedulerCacheEnum;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

import com.google.common.collect.BiMap;


/**
 *
 * Note: There is a dependency of MappingConverter with OS and SW converter's.
 *
 * OS -> Schedulers
 *
 * SW -> Process, Task, ISR, InterruptController
 *
 * If MappingConverter is to be called after OS & SW converters -> then it expects the data from these models in the
 * format of 1.1.0
 *
 * But the mapping model data should be still of 1.0.3 format
 *
 * @author MEZ2RNG
 *
 */

public class MappingConverter implements IConverter {

	private final HelperUtils_103_110 helper;

	private String workingDirectoryLocation;

	private List<ICache> caches;

	private final Map<Element, Element> os_defaultInterruptControllerMap = new HashMap<Element, Element>();

	public MappingConverter() {

		this.helper = HelperUtils_103_110.getInstance();
	}


	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.caches = caches;

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}

		this.workingDirectoryLocation = targetFile.getParentFile().getCanonicalPath();

		/*- updating namespaces */

		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_110(rootElement);

		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("os"), this.helper.getNS_110("sw"));


		updateProcessAllocations(targetFile, rootElement, fileName_documentsMap);

		updateRunnableAllocations(targetFile, rootElement, fileName_documentsMap);

		fileName_documentsMap.put(getFile(fileName_documentsMap, targetFile.getName()), root);

	}

	/**
	 * This method is used to
	 *
	 * @param targetFile
	 *
	 * @param rootElement
	 * @param fileName_documentsMap
	 */

	private void updateRunnableAllocations(final File targetFile, final Element rootElement,
			final Map<File, Document> fileName_documentsMap) {

		/*-
		 * ===================
		 * Input data (1.0.3) :
		 * ===================
		 * <executableAllocation xsi:type="mapping:RunnableAllocation" xmi:id="_hjmNUJK2EeWQC6k3Y09j_A">
		 *		<scheduler href="default.amxmi-os#_RUx1UJK2EeWQC6k3Y09j_A"/>
		 *		<entity href="sw.amxmi#_XLRHkJK2EeWQC6k3Y09j_A"/>
		 *   </executableAllocation>
		 *
		 * =================================
		 * Exptected output data (1.1.0) :
		 * ================================
		 *
		 *  <runnableAllocation xsi:type="mapping:RunnableAllocation" xmi:id="_hjmNUJK2EeWQC6k3Y09j_A">
		 *    <scheduler href="default.amxmi-os#_RUx1UJK2EeWQC6k3Y09j_A" xsi:type="os:TaskScheduler" />
		 *      <entity href="sw.amxmi#_XLRHkJK2EeWQC6k3Y09j_A" />
		 *  </runnableAllocation>
		 *
		 *  Below are the requirements :
		 *
		 *  1. Change the tag name from executableAllocation to runnableAllocation
		 *  2. For scheduler tag, add the attribute xsi:type with the appropriate value.
		 *    - As in 1.0.3, only TaskScheduler was available -> in the converted files generate type as "os:TaskScheduler"
		 */


		final List<Element> xpathResult = this.helper.getXpathResult(rootElement,
				".//executableAllocation[@xsi:type=\"mapping:RunnableAllocation\"]", Element.class,
				this.helper.getGenericNS("xsi"), this.helper.getNS_110("mapping"));

		for (final Element element : xpathResult) {
			element.setName(Tags.runnableAllocation.getValue());

			final Element refScheduler = element.getChild("scheduler");

			if (refScheduler != null) {

				final Attribute typeAttribute = refScheduler.getAttribute("type", this.helper.getGenericNS("xsi"));
				if (typeAttribute == null) {
					refScheduler.setAttribute("type", "os:TaskScheduler", this.helper.getGenericNS("xsi"));
				}
			}
		}
	}

	private void updateProcessAllocations(final File targetFile, final Element rootElement,
			final Map<File, Document> fileName_documentsMap) throws Exception {

		/*-
		 * ===================
		 * Input data (1.0.3) :
		 * ===================
		 * Case 1:
		 *
		 *   <executableAllocation xsi:type="mapping:ProcessAllocation" xmi:id="_G9HlYJHvEeWQC6k3Y09j_A" scheduler="_AX_EcJHvEeWQC6k3Y09j_A" process="_-aEmQJHuEeWQC6k3Y09j_A"/>
		 *
		 * Case 2:
		 *
		 * <executableAllocation xsi:type="mapping:ProcessAllocation" xmi:id="_j5cDUJK2EeWQC6k3Y09j_A">
		 * 		 <scheduler href="os.amxmi#_T_4JoJK2EeWQC6k3Y09j_A"/>
		 * 		  <process xsi:type="sw:Task" href="sw.amxmi#_YOuvsJK2EeWQC6k3Y09j_A"/>
		 * </executableAllocation>
		 *
		 * Case 3:
		 *
		 * <executableAllocation xsi:type="mapping:ProcessAllocation" xmi:id="_MGprAJHvEeWQC6k3Y09j_A" process="_-aEmQJHuEeWQC6k3Y09j_A">
		 *		<scheduler href="../OS/OS.amxmi#_3QZckJHoEeWQC6k3Y09j_A"/>
		 *	</executableAllocation>
		 *
		 * =================================
		 * Exptected output data (1.1.0) :
		 * ================================
		 *	For case 2:
		 *
		 *  <processAllocation xsi:type="mapping:TaskAllocation" xmi:id="_j5cDUJK2EeWQC6k3Y09j_A">
		 * 		<scheduler href="os.amxmi#_T_4JoJK2EeWQC6k3Y09j_A" xsi:type="os:TaskScheduler" />
		 * 		<process xsi:type="sw:Task" href="sw.amxmi#_YOuvsJK2EeWQC6k3Y09j_A" />
		 * </processAllocation>
		 *
		 *  Below are the requirements :
		 *
		 *  1. Change the tag name from executableAllocation to processAllocation
		 *  2. processAllocation tag, attribute xsi:type should be updated either to "mapping:TaskAllocation" or "mapping:ISRAllocation"
		 *  	- This is dependent on if the referred Process object is of type Task or ISR
		 *  3. If ISR is the corresponding Process element, and if TaskScheduler is referred, then it should be changed to InterruptController
		 *  	- For this, default InterruptController object should be created in the same location where Scheduler object was referred from
		 *      - ID of the InterruptController object should be associated to the corresponding, scheduler tag
		 *  4. For scheduler tag, add the attribute xsi:type with the appropriate value os:TaskScheduler" or os:InterruptController"
		 *      - Based on the type of scheduler
		 *
		 */

		final List<Element> processAllocationElements = this.helper.getXpathResult(rootElement,
				".//executableAllocation[@xsi:type=\"mapping:ProcessAllocation\"]", Element.class,
				this.helper.getGenericNS("xsi"), this.helper.getNS_110("mapping"));

		processAllocationMigrationLoop: for (final Element processAllocationElement : processAllocationElements) {

			/*- changing the Element name from executableAllocation (1.0.3) to processAllocation (1.1.0) **/

			processAllocationElement.setName(Tags.processAllocation.getValue());

			final Attribute schedulerIDAttrribute = processAllocationElement.getAttribute(Tags.scheduler.getValue());

			final Attribute processIDAttribute = processAllocationElement.getAttribute(Tags.process.getValue());

			final Element refSchedulerElement = processAllocationElement.getChild(Tags.scheduler.getValue());

			final Element refProcessElement = processAllocationElement.getChild(Tags.process.getValue());

			HrefElement schedulerHRef = null;

			HrefElement processHRef = null;

			String schedulerID = null;

			String processID = null;

			String schedulerRefFile = null;

			String processRefFile = null;


			if (schedulerIDAttrribute == null && refSchedulerElement != null) {

				/*- model elements from other files can be referred . Fetching the scheduler href attribute*/

				final Attribute attribute = refSchedulerElement.getAttribute("href");

				schedulerHRef = this.helper.getHrefElement(attribute.getValue());

				schedulerRefFile = schedulerHRef.getFileName();

				schedulerID = schedulerHRef.getXmiID();

			}
			else if (schedulerIDAttrribute != null) {
				schedulerID = schedulerIDAttrribute.getValue();
			}


			if (processIDAttribute == null && refProcessElement != null) {
				/*- model elements from other files can be referred here. Fetching the process href attribute*/

				final Attribute attribute = refProcessElement.getAttribute("href");

				processHRef = this.helper.getHrefElement(attribute.getValue());

				processRefFile = processHRef.getFileName();

				processID = processHRef.getXmiID();

			}
			else if (processIDAttribute != null) {
				processID = processIDAttribute.getValue();
			}

			/*- Processing migration only if Scheduler ID and Process ID are not null */

			if (schedulerID != null && processID != null) {

				/*- Fetching Scheduler objects having specific ID */
				final List<Element> schedulers = getScheduler(targetFile, schedulerID, schedulerRefFile, schedulerHRef,
						rootElement, fileName_documentsMap);

				/*- Fetching Process objects having specific ID */
				final List<Element> processs = getProcess(targetFile, processID, processRefFile, processHRef,
						rootElement, fileName_documentsMap);

				/*- Processing migration only if Scheduler object and Process object are found */

				if (schedulers.size() == 0 || processs.size() == 0) {
					// TODO: log an error and skip this element

					if (schedulers.size() == 0) {
						System.err.println("Unable to find the Scheduler having ID : " + schedulerID);
					}
					if (processs.size() == 0) {
						System.err.println("Unable to find the Process having ID : " + processID);
					}

					continue processAllocationMigrationLoop;
				}

				/*- definition of Process and Scheduler objects */

				final Element processElement = processs.get(0);

				final Element schedulerElement = schedulers.get(0);

				boolean isInterruptControllerAssigned = false;

				final String processElementName = processElement.getName();

				/*- If process element tag name is : isrs, then it is a ISR*/

				if (processElementName.equals(Tags.isrs.getValue())) {

					final Attribute attribute = processAllocationElement.getAttribute("type",
							this.helper.getGenericNS("xsi"));
					attribute.setValue("mapping:ISRAllocation");

					/*-
					 *  In 1.1.0, if the Process is of ISR type, then Scheduler should be of type only
					 * InterruptController.
					 *
					 * In 1.0.3, there is no type InterruptController --> only Scheduler of type TaskScheduler was
					 * available.
					 *
					 * Below are the possible solutions to handle this scenario:
					 *
					 * Create a new InterruptController (Scheduler) having PriorityBased algorithm and associate it to the ISRAllocation.
					 *
					 */

					isInterruptControllerAssigned = true;

					final Element interrupControllerElement = createDefaultInterruptController(schedulerElement);

					/*- setting irruptsControllerElement ID to executableAllocationElement*/

					if (schedulerIDAttrribute != null) {
						schedulerIDAttrribute.setValue(
								interrupControllerElement.getAttributeValue("id", this.helper.getGenericNS("xmi")));
					}
					else if (refSchedulerElement != null && schedulerHRef != null) {


						/*
						 * refSchedulerElement.setAttribute("type", "os:InterruptController",
						 * this.helper.getGenericNS("xsi"));
						 */

						refSchedulerElement.getAttribute("href").setValue(schedulerHRef.getFileName() + "#"
								+ interrupControllerElement.getAttributeValue("id", this.helper.getGenericNS("xmi")));
					}


				}
				else if (processElementName.equals(Tags.tasks.getValue())) {
					final Attribute processAllocationTypeAttribute = processAllocationElement.getAttribute("type",
							this.helper.getGenericNS("xsi"));
					processAllocationTypeAttribute.setValue("mapping:TaskAllocation");

					/*
					 * if (refSchedulerElement != null) {
					 *
					 * refSchedulerElement.setAttribute("type", "os:TaskScheduler", this.helper.getGenericNS("xsi"));
					 *
					 * }
					 */

				}


				/*- As from 1.1.0, Scheduler is Abstract and there exsits os:InterruptController and os:TaskScheduler as concrete class's. Type should be set for the Schduler tag*/

				if ((refSchedulerElement != null)) {

					if (schedulerElement.getName().equals("taskSchedulers")) {

						if (isInterruptControllerAssigned) {
							refSchedulerElement.setAttribute("type", "os:InterruptController",
									this.helper.getGenericNS("xsi"));
						}
						else {
							refSchedulerElement.setAttribute("type", "os:TaskScheduler",
									this.helper.getGenericNS("xsi"));
						}
					}
					else if (schedulerElement.getName().equals("interruptControllers")) {
						refSchedulerElement.setAttribute("type", "os:InterruptController",
								this.helper.getGenericNS("xsi"));
					}

				}


			}
			else if (schedulerID == null && processID != null) {

				/*- Fetching Process objects having specific ID */
				final List<Element> processs = getProcess(targetFile, processID, processRefFile, processHRef,
						rootElement, fileName_documentsMap);

				/*- Processing migration only if Scheduler object and Process object are found */

				if (processs.size() == 0) {

					System.err.println("Unable to find the Process having ID : " + processID);

					continue processAllocationMigrationLoop;
				}

				/*- definition of Process and Scheduler objects */

				final Element processElement = processs.get(0);


				final String processElementName = processElement.getName();

				/*- If process element tag name is : isrs, then it is a ISR*/

				if (processElementName.equals(Tags.isrs.getValue())) {

					final Attribute attribute = processAllocationElement.getAttribute("type",
							this.helper.getGenericNS("xsi"));
					attribute.setValue("mapping:ISRAllocation");

				}
				else if (processElementName.equals(Tags.tasks.getValue())) {
					final Attribute processAllocationTypeAttribute = processAllocationElement.getAttribute("type",
							this.helper.getGenericNS("xsi"));
					processAllocationTypeAttribute.setValue("mapping:TaskAllocation");

				}

			}
			else if (schedulerID != null && processID == null) {
				{

					/*- Fetching Scheduler objects having specific ID */
					final List<Element> schedulers = getScheduler(targetFile, schedulerID, schedulerRefFile,
							schedulerHRef, rootElement, fileName_documentsMap);


					if (schedulers.size() == 0) {
						// TODO: log an error and skip this element

						if (schedulers.size() == 0) {
							System.err.println("Unable to find the Scheduler having ID : " + schedulerID);
						}

						continue processAllocationMigrationLoop;
					}

					/*- definition of Process and Scheduler objects */

					final Element schedulerElement = schedulers.get(0);

					/*-
					 * As Process object is not defined, transforming executableAllocation as processAllocation of type mapping:TaskAllocation
					 */
					final Attribute processAllocationTypeAttribute = processAllocationElement.getAttribute("type",
							this.helper.getGenericNS("xsi"));
					processAllocationTypeAttribute.setValue("mapping:TaskAllocation");


					/*- As from 1.1.0, Scheduler is Abstract and there exsits os:InterruptController and os:TaskScheduler as concrete class's. Type should be set for the Schduler tag*/

					if (refSchedulerElement != null) {
						if (schedulerElement.getName().equals("taskSchedulers")) {
							refSchedulerElement.setAttribute("type", "os:TaskScheduler",
									this.helper.getGenericNS("xsi"));
						}
						else if (schedulerElement.getName().equals("interruptControllers")) {
							refSchedulerElement.setAttribute("type", "os:InterruptController",
									this.helper.getGenericNS("xsi"));
						}

					}


				}
			}
			else {
				// TODO: log error
				System.err.println("unable to find both : Scheduler and Process attributes for element : "
						+ processAllocationElement.toString());
			}


		}
	}

	private int interruptControllerCount = 1;

	/**
	 * This method is used to create default interrupt controller
	 *
	 * @return
	 */
	private Element createDefaultInterruptController(final Element schedulerElement) {

		final Element schedulersParent = schedulerElement.getParentElement();

		// first check if DefaultInterruptController is already created -> if so then return the same
		if (this.os_defaultInterruptControllerMap.containsKey(schedulersParent)) {
			return this.os_defaultInterruptControllerMap.get(schedulersParent);
		}

		final Element interrupControllerElement = new Element("interruptControllers");

		final String interruptControllerID = EcoreUtil.generateUUID();

		interrupControllerElement.setAttribute("id", interruptControllerID, this.helper.getGenericNS("xmi"));

		/*- name of the InterruptController */
		interrupControllerElement.setAttribute("name",
				"interruptController" + this.interruptControllerCount++ + "_migration_generated");

		final Element schedulingAlgorithmElement = new Element("schedulingAlgorithm");

		schedulingAlgorithmElement.setAttribute("type", "os:PriorityBased", this.helper.getGenericNS("xsi"));

		final String schedulingAlgorithmID = EcoreUtil.generateUUID();

		schedulingAlgorithmElement.setAttribute("id", schedulingAlgorithmID, this.helper.getGenericNS("xmi"));


		interrupControllerElement.addContent(schedulingAlgorithmElement);


		/*-associating the newly created InterruptController element to the parent of supplied schedulerElement (i.e. OperatingSystem) */

		schedulersParent.addContent(schedulersParent.indexOf(schedulerElement), interrupControllerElement);


		/*- Adding the OS element & interruptController element to the map*/
		this.os_defaultInterruptControllerMap.put(schedulersParent, interrupControllerElement);

		return interrupControllerElement;
	}


	/**
	 * - Querying data from OS model.
	 *
	 * NOte: it is expected that this model is already converted to 1.1.0
	 *
	 * @param targetFile
	 *
	 * @param schedulerID
	 * @param schedulerHRef
	 * @param rootElement
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	private List<Element> getScheduler(final File targetFile, String schedulerID, final String refFileName,
			final HrefElement schedulerHRef, final Element rootElement, final Map<File, Document> fileName_documentsMap)
			throws Exception {

		List<Element> schedulerElements = new ArrayList<Element>();


		/*- check if schedulerID is of URIFragment type */

		if (schedulerID.contains("/")) {

			if (schedulerHRef != null) {
				schedulerID = schedulerHRef.getFileName() + "#" + schedulerHRef.getXmiID();
			}

			/*-  Note: As OS converter would have changed the structure of the OSModel contents, old cache keys are no longer valid.
			 *
			 *  To establish the link between old & new URIFragments, use the BiMap available in cache (SchedulerCacheEnum.URI_FRAGMENT_NEW_OLD)
			 *
			 * BiMap holds the key as new URIFragments and value as old URIFragments
			
			 **/

			cacheLoop: for (final ICache cache : getFilteredCaches(this.caches, SchedulerCacheBuilder.class)) {

				final Map<String, Object> map = cache.getCacheMap().get(targetFile);

				if (map != null) {

					final BiMap<String, String> urifragment_new_old_map = (BiMap<String, String>) map
							.get(SchedulerCacheEnum.URI_FRAGMENT_NEW_OLD.name());

					if (urifragment_new_old_map != null) {
						/*- getting old scheduler URIFragment -> as the entire cache structure is built based on it */

						schedulerID = urifragment_new_old_map.get(schedulerID);
					}


					Map<String, Element> uriFragment_SchedulerMap = null;

					if (schedulerID.contains("#")) {
						uriFragment_SchedulerMap = (Map<String, Element>) map
								.get(SchedulerCacheEnum.HREF_URIFRAGMENT_SCHEDULER_ELEMENT.name());

					}
					else {

						uriFragment_SchedulerMap = (Map<String, Element>) map
								.get(SchedulerCacheEnum.URIFRAGMENT_SCHEDULER_ELEMENT.name());

					}


					if (uriFragment_SchedulerMap != null) {

						final Element element = uriFragment_SchedulerMap.get(schedulerID);

						if (element != null) {

							schedulerElements.add(element);

							break cacheLoop;

						}
					}


				}
			}


			return schedulerElements;

		}

		/*- Case where ID doesn't hold URIFragment */

		if (refFileName != null) {

			final String referencedFilePath = this.workingDirectoryLocation + File.separator + refFileName;

			final File referenceFile = new File(referencedFilePath).getCanonicalFile();

			final Document document = fileName_documentsMap.get(referenceFile);

			schedulerElements = getSchedulerObject(schedulerID, referenceFile, document);

		}
		else {
			schedulerElements = getSchedulerObject(schedulerID, targetFile, rootElement.getDocument());

		}
		return schedulerElements;
	}


	/**
	 * This method is used to get Process object which contains specific ID
	 *
	 * @param targetFile
	 *
	 * @param processID
	 * @param refFileName
	 * @param processHRef
	 * @param rootElement
	 * @param fileName_documentsMap
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	private List<Element> getProcess(final File targetFile, String processID, final String refFileName,
			final HrefElement processHRef, final Element rootElement, final Map<File, Document> fileName_documentsMap)
			throws Exception {

		List<Element> processElements = new ArrayList<Element>();


		/*- check if schedulerID is of URIFragment type */

		if (processID.contains("/")) {

			if (processHRef != null) {
				processID = processHRef.getFileName() + "#" + processHRef.getXmiID();
			}

			cacheLoop: for (final ICache cache : this.caches) {

				final Map<String, Object> map = cache.getCacheMap().get(targetFile);

				if (map != null) {

					Map<String, Element> uriFragment_ProcessMap = null;

					if (processID.contains("#")) {
						uriFragment_ProcessMap = (Map<String, Element>) map
								.get(ProcessCacheEnum.HREF_URIFRAGMENT_PROCESS_ELEMENT.name());

					}
					else {

						uriFragment_ProcessMap = (Map<String, Element>) map
								.get(ProcessCacheEnum.URIFRAGMENT_PROCESS_ELEMENT.name());

					}


					if (uriFragment_ProcessMap != null) {

						final Element element = uriFragment_ProcessMap.get(processID);

						if (element != null) {

							processElements.add(element);

							break cacheLoop;

						}
					}


				}
			}


			return processElements;

		}


		/*- ID can be of following format : "Amalthea_ArExampleEngine-os.amxmi#_DaOKkpHoEeWQC6k3Y09j_A" */
		if (refFileName != null) {
			final String referencedFilePath = new File(this.workingDirectoryLocation + File.separator + refFileName)
					.getCanonicalPath();

			final File referenceFile = new File(referencedFilePath);
			final Document document = fileName_documentsMap.get(referenceFile);

			processElements = getProcessObject(processID, referenceFile, document);

		}
		else {
			processElements = getProcessObject(processID, targetFile, rootElement.getDocument());
		}
		return processElements;
	}


	/**
	 * Utility method used to get Process object which contains specific ID
	 *
	 * @param processID
	 * @param document
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<Element> getProcessObject(final String processID, final File targetFile, final Document document) {

		loop: for (final ICache iCache : getFilteredCaches(this.caches, ProcessCacheBuilder.class)) {


			final Map<String, Object> map = iCache.getCacheMap().get(targetFile);

			if (map == null) {
				System.err.println("Target file can't be found : " + targetFile.getName());
				continue loop;
			}
			final Map<String, Element> uuid_process_map = (Map<String, Element>) map
					.get(ProcessCacheEnum.UUID_PROCESS_ELEMENT.name());

			if (uuid_process_map != null) {
				final Element element = uuid_process_map.get(processID);

				if (element != null) {
					final List<Element> elements = new ArrayList<Element>();
					elements.add(element);
					return elements;
				}
			}


		}


		List<Element> processElements;
		/*- get Task elements -*/
		processElements = this.helper.getXpathResult(document, ".//swModel/tasks[@xmi:id=\"" + processID + "\"  ] ",
				Element.class, this.helper.getGenericNS("xmi"), this.helper.getNS_110("sw"));

		if (processElements.size() == 0) {
			processElements = this.helper.getXpathResult(document,
					".//sw:SWModel/tasks[@xmi:id=\"" + processID + "\"  ] ", Element.class,
					this.helper.getGenericNS("xmi"), this.helper.getNS_110("sw"));
		}

		/*- get ISR's -*/

		if (processElements.size() == 0) {
			processElements = this.helper.getXpathResult(document, ".//swModel/isrs[@xmi:id=\"" + processID + "\"  ] ",
					Element.class, this.helper.getGenericNS("xmi"), this.helper.getNS_110("sw"));
		}

		if (processElements.size() == 0) {
			processElements = this.helper.getXpathResult(document,
					".//sw:SWModel/isrs[@xmi:id=\"" + processID + "\"  ] ", Element.class,
					this.helper.getGenericNS("xmi"), this.helper.getNS_110("sw"));
		}
		return processElements;
	}

	/**
	 * Utility method used to get Scheduler object which contains specific ID
	 *
	 * @param schedulerID
	 * @param targetFile
	 * @param document
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<Element> getSchedulerObject(final String schedulerID, final File targetFile, final Document document) {


		loop: for (final ICache iCache : this.caches) {

			if (iCache instanceof SchedulerCacheBuilder) {
				final Map<String, Object> map = iCache.getCacheMap().get(targetFile);

				if (map == null) {
					System.err.println("Target file can't be found : " + targetFile.getName());
					continue loop;
				}
				final Map<String, Element> uuid_scheduler_map = (Map<String, Element>) map
						.get(SchedulerCacheEnum.UUID_SCHEDULER_ELEMENT.name());

				if (uuid_scheduler_map != null) {
					final Element element = uuid_scheduler_map.get(schedulerID);

					if (element != null) {
						final List<Element> elements = new ArrayList<Element>();
						elements.add(element);
						return elements;
					}
				}


			}


		}

		/*- below code is executed when cache is not available */

		List<Element> schedulerElements;

		/*- applying xpath on document object */
		schedulerElements = this.helper.getXpathResult(document,
				".//osModel/operatingSystems/taskSchedulers[@xmi:id=\"" + schedulerID + "\"]", Element.class,
				this.helper.getGenericNS("xmi"));

		if (schedulerElements.size() == 0) {
			schedulerElements = this.helper.getXpathResult(document,
					".//os:OSModel/operatingSystems/taskSchedulers[@xmi:id=\"" + schedulerID + "\"]", Element.class,
					this.helper.getGenericNS("xmi"), this.helper.getNS_110("os"));
		}
		return schedulerElements;
	}


	public List<ICache> getCaches() {
		return this.caches;
	}

	public void setCaches(final List<ICache> caches) {
		this.caches = caches;
	}


}
