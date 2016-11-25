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

public class OSConverter extends AbstractConverter {


	public OSConverter() {
		this.helper = HelperUtils_071_072.getInstance();
		this.logger = LogManager.getLogger(this.getClass());
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.1 to 0.7.2 : Starting OS converter");


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		update_AffinityConstraints(rootElement);

		update_OsExecutionInstructions(rootElement);


		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
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
