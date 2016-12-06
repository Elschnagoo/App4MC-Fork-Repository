package org.eclipse.app4mc.amalthea.converters072.impl;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters072.utils.HelperUtils_071_072;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class SwConverter extends AbstractConverter {


	public SwConverter() {
		this.helper = HelperUtils_071_072.getInstance();
		this.logger = LogManager.getLogger(this.getClass());
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.1 to 0.7.2 : Starting SW converter");


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		update_Buffering(rootElement);

		update_SamplingType(rootElement);

		update_InstructionsConstant(rootElement);

		update_InstructionsDeviation(rootElement);

		update_ProbabilityGroup(rootElement);

		update_Group(rootElement);

		update_Preemption(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	private void update_Buffering(final Element rootElement) {

		final StringBuffer labelXpathBuffer = new StringBuffer();

		labelXpathBuffer.append("./swModel/labels");

		final List<Element> elements = this.helper.getXpathResult(rootElement, labelXpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		for (final Element labelElement : elements) {

			final Attribute bufferedAttribute = labelElement.getAttribute("buffered");

			if (bufferedAttribute != null) {

				bufferedAttribute.setName("dataStability");

				final String bufferedValue = bufferedAttribute.getValue();

				if (bufferedValue.equals("buffered")) {
					bufferedAttribute.setValue("customProtection");

				}
				else if (bufferedValue.equals("notBuffered")) {
					bufferedAttribute.setValue("noProtection");
				}

			}

		}

		final StringBuffer labelAccessXpathBuffer = new StringBuffer();

		labelAccessXpathBuffer.append("./swModel/runnables//runnableItems[@xsi:type=\"am:LabelAccess\"]");
		labelAccessXpathBuffer.append("|");
		labelAccessXpathBuffer.append("./swModel/runnables//runnableItem[@xsi:type=\"am:LabelAccess\"]");

		final List<Element> labelAccesselements = this.helper.getXpathResult(rootElement,
				labelAccessXpathBuffer.toString(), Element.class, this.helper.getGenericNS("xsi"));

		for (final Element labelAccessElement : labelAccesselements) {

			final Attribute bufferedAttribute = labelAccessElement.getAttribute("buffered");

			if (bufferedAttribute != null) {

				bufferedAttribute.setName("dataStability");

				final String bufferedValue = bufferedAttribute.getValue();

				if (bufferedValue.equals("inherited")) {
					bufferedAttribute.setValue("inherited");

				}
				else if (bufferedValue.equals("buffered")) {
					bufferedAttribute.setValue("customProtection");
				}
				else if (bufferedValue.equals("notBuffered")) {
					bufferedAttribute.setValue("noProtection");
				}
			}

		}


	}

	/**
	 *
	 * SamplingType Enum is part of Deviation object till 0.7.1
	 *
	 * Based on bugzilla : 508523, SamplingType is shifted from Deviation element to Boundaries element (sub-class of
	 * Distribution)
	 *
	 * -- As a part of migration, SamplingType content part of Deviation is associted to Boundaries. In case
	 * Distribution of type Distribution is not present inside Deviation, SamplingType content is not associated and
	 * lost (as expected)
	 *
	 * Note: Deviation element is used inside Stimulus model, HW model, OS model, SW model
	 *
	 * @param rootElement
	 */

	private void update_SamplingType(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./stimuliModel/stimuli/stimulusDeviation");
		xpathBuffer.append("|");
		xpathBuffer.append("./hwModel/accessPaths/latencies[@xsi:type=\"am:LatencyDeviation\"]/deviation");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/operatingSystems/taskSchedulers/schedulingUnit/instructions/deviation");
		xpathBuffer.append("|");

		xpathBuffer.append("./osModel/operatingSystems/interruptControllers/schedulingUnit/instructions/deviation");
		xpathBuffer.append("|");

		xpathBuffer.append("./osModel/osOverheads//deviation");
		xpathBuffer.append("|");

		xpathBuffer.append("./swModel/runnables//deviation");


		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"));

		for (final Element deviation : elements) {
			/*- updating the type of the Element as per change introduced in 0.7.2*/
			final Attribute samplingTypeAttribute = deviation.getAttribute("samplingType");

			if (samplingTypeAttribute != null) {
				final String value = samplingTypeAttribute.getValue();

				final Element distribution = deviation.getChild("distribution");

				if (distribution != null) {

					distribution.setAttribute("samplingType", value);
				}

				deviation.removeAttribute(samplingTypeAttribute);

			}

		}


	}

	private void update_InstructionsConstant(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/runnables//runnableItems[@xsi:type=\"am:InstructionsConstant\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/runnables//runnableItem[@xsi:type=\"am:InstructionsConstant\"]");

		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"));

		for (final Element instructionsConstantElement : elements) {
			/*- updating the type of the Element as per change introduced in 0.7.2*/
			final Attribute typeAttribute = instructionsConstantElement.getAttribute("type",
					this.helper.getGenericNS("xsi"));
			typeAttribute.setValue("am:RunnableInstructions");

			final Attribute valueAttribute = instructionsConstantElement.getAttribute("value");


			final Element subInstructionsConstantElement = new Element("default");
			subInstructionsConstantElement.setAttribute("type", "am:InstructionsConstant",
					this.helper.getGenericNS("xsi"));

			if (valueAttribute != null) {
				subInstructionsConstantElement.setAttribute("value", valueAttribute.getValue());
				instructionsConstantElement.removeAttribute(valueAttribute);
			}

			instructionsConstantElement.addContent(subInstructionsConstantElement);
		}


	}

	private void update_InstructionsDeviation(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/runnables//runnableItems[@xsi:type=\"am:InstructionsDeviation\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/runnables//runnableItem[@xsi:type=\"am:InstructionsDeviation\"]");

		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"));

		for (final Element instructionsDeviationElement : elements) {
			/*- updating the type of the Element as per change introduced in 0.7.2*/
			final Attribute typeAttribute = instructionsDeviationElement.getAttribute("type",
					this.helper.getGenericNS("xsi"));
			typeAttribute.setValue("am:RunnableInstructions");


			final Element subInstructionsDeviationElement = new Element("default");
			subInstructionsDeviationElement.setAttribute("type", "am:InstructionsDeviation",
					this.helper.getGenericNS("xsi"));

			final List<Element> instructionsDeviationChildElements = instructionsDeviationElement.getChildren();

			final Iterator<Element> instructionsDeviationChildElements_iterator = instructionsDeviationChildElements
					.iterator();

			while (instructionsDeviationChildElements_iterator.hasNext()) {

				final Element nextChildElement = instructionsDeviationChildElements_iterator.next();

				instructionsDeviationChildElements_iterator.remove();

				subInstructionsDeviationElement.addContent(nextChildElement);
			}

			instructionsDeviationElement.addContent(subInstructionsDeviationElement);
		}


	}


	private void update_Preemption(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/processPrototypes[@preemption=\"unknown\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/tasks[@preemption=\"unknown\"]");

		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"));

		for (final Element element : elements) {
			element.removeAttribute("preemption");
		}


	}

	/**
	 * Due to removal of element : DeviationRunnableItem
	 *
	 *
	 * @param rootElement
	 */
	private void update_Group(final Element rootElement) {

		/*-
		 * Input :
		 *
		 *    <runnableItems xsi:type="am:Group" ordered="false">
		 *		<items>
		 *  			<runnableItem xsi:type="am:RunnableProbabilitySwitch">
		 *    			<entries probability="0" />
		 *	 		</runnableItem>
		 *		</items>
		 *	</runnableItems>
		 *
		 */
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/runnables//runnableItems[@xsi:type=\"am:Group\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/runnables//runnableItem[@xsi:type=\"am:Group\"]");
		xpathBuffer.append("|");
		xpathBuffer.append(
				"./swModel/runnables//items[@xsi:type=\"am:Group\"]"); /*- note: the last Xpath is introduced, as the model is adapted to 0.7.2 in update_ProbabilityGroup method*/

		final List<Element> runnableItemElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		for (final Element runnableItemElement : runnableItemElements) {


			final List<Element> deviationRunnableItemsList = this.helper.getXpathResult(runnableItemElement, "./items",
					Element.class);

			final Iterator<Element> deviationRunnableItemsListIterator = deviationRunnableItemsList.iterator();

			while (deviationRunnableItemsListIterator.hasNext()) {

				final Element deviationRunnableItemElement = deviationRunnableItemsListIterator.next();


				final List<Element> childRunnableItems = this.helper.getXpathResult(deviationRunnableItemElement,
						"./runnableItem", Element.class);

				if (childRunnableItems != null && childRunnableItems.size() > 0) {

					final Element childRunnableItem = childRunnableItems.get(0);

					/*- disassociating the runnableItem from its parent DeviationRunnableItem */

					deviationRunnableItemElement.removeContent(childRunnableItem);

					childRunnableItem.setName("items");

					runnableItemElement.removeContent(deviationRunnableItemElement);
					/*- now associate RunnableItem to the Group directly */
					runnableItemElement.addContent(childRunnableItem);

				}
				else {
					/*- this is the case where empty items tag is present (i.e. DeviationRunnableItem -> without RunnableItems */
					runnableItemElement.removeContent(deviationRunnableItemElement);

				}


				/*- DeviationRunnableItem is removed from metamodel -> RunnableItem which is present inside DeviationRunnableItem is directly associated inside Group
				 *  Due to the above reason : DeviationRunnableElement is removed from Group
				 * */


			}

		}

	}

	private void update_ProbabilityGroup(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/runnables//runnableItems[@xsi:type=\"am:ProbabilityGroup\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/runnables//runnableItem[@xsi:type=\"am:ProbabilityGroup\"]");

		final List<Element> runnableItemElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		for (final Element runnableItemElement : runnableItemElements) {

			final Attribute typeAttribute = runnableItemElement.getAttribute("type", this.helper.getGenericNS("xsi"));

			typeAttribute.setValue("am:RunnableProbabilitySwitch");

			final List<Element> itemsElements = runnableItemElement.getChildren("items");

			for (final Element itemsElement : itemsElements) {
				itemsElement.setName("entries");

				final Element childRunnableItemElement = itemsElement.getChild("runnableItem");

				if (childRunnableItemElement != null) {
					childRunnableItemElement.setName("items");
				}
			}


		}

	}


}
