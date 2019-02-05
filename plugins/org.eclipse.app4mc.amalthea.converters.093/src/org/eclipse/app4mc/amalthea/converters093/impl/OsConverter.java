package org.eclipse.app4mc.amalthea.converters093.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters093.utils.HelperUtils_092_093;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class OsConverter extends AbstractConverter {


	private File targetFile;

	public OsConverter() {
		this.helper = HelperUtils_092_093.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.9.2 to 0.9.3 : Executing Os converter for model file : " + targetFile.getName());

		this.caches = caches;

		this.fileName_documentsMap = fileName_documentsMap;

		this.targetFile = targetFile;

		final Document root = fileName_documentsMap.get(this.targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();
		
		update_OsOverhead_ref(rootElement);

		update_OsAPIInstructions_OsISRInstructions(rootElement);
	}
	
	private void update_OsOverhead_ref(final Element rootElement) {
		final StringBuffer xpathBuffer = new StringBuffer();
		xpathBuffer.append("./osModel/operatingSystems");
		
		final List<Element> operatingSystems = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_093("am"),this.helper.getGenericNS("xsi"));

		for (Element operatingSystemElement : operatingSystems) {
			
			String overHead_Element_Name = helper.getSingleElementNameFromAttributeOrChildeElement("overhead",operatingSystemElement);
			
			operatingSystemElement.removeAttribute("overhead");
			operatingSystemElement.removeChild("overhead");
			
			if(overHead_Element_Name!=null) {
				//creating OSOverhead elements reference
				
				Element osOverHeadRefElement=new Element("overhead");
				
				Attribute hrefAttribute=new Attribute("href", "amlt://#"+overHead_Element_Name+"?type=OsOverhead");
				
				osOverHeadRefElement.setAttribute(hrefAttribute);
				
				//Adding OsOverHead reference to the OperatingSystem element
				operatingSystemElement.addContent(osOverHeadRefElement);
				
			}
			
		}
		
	}
	
	
 
	private void update_OsAPIInstructions_OsISRInstructions(final Element rootElement) {
		final StringBuffer xpathBuffer = new StringBuffer();
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
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiSuspendOsInterrupts");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiResumeOsInterrupts");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiRequestSpinlock");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiReleaseSpinlock");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiSenderReceiverRead");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiSenderReceiverWrite");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiSynchronousServerCallPoint");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/apiOverhead/apiIocWrite");
		xpathBuffer.append("|");
		
		/* ---------------- Handling the Xpath's from isrCategory1Overhead and isrCategory2Overhead -------------*/
		
		xpathBuffer.append("./osModel/osOverheads/isrCategory1Overhead/preExecutionOverhead");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/isrCategory1Overhead/postExecutionOverhead");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/isrCategory2Overhead/preExecutionOverhead");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/osOverheads/isrCategory2Overhead/postExecutionOverhead");
				 
		
		final List<Element> osInstructionsSubElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_093("am"),this.helper.getGenericNS("xsi"));

		for (Element osInstructionsSubElement : osInstructionsSubElements) {

			String typeAttributeValue = osInstructionsSubElement.getAttributeValue("type",
					this.helper.getGenericNS("xsi"));

			String value = osInstructionsSubElement.getAttributeValue("value");

			osInstructionsSubElement.removeAttribute("type", this.helper.getGenericNS("xsi"));

			osInstructionsSubElement.removeAttribute("value");

			/*-------------- Removing fechStatistic element  -------------------*/
			osInstructionsSubElement.removeChild("fetchStatistic");

			/*-------------- Based on the typeAttribute value, adding corresponding element  -------------------*/

			if (typeAttributeValue.equals("am:InstructionsConstant")) {

				Element defaultElement = new Element("default");

				defaultElement.setAttribute(new Attribute("type", "am:DiscreteValueConstant", helper.getGenericNS("xsi")));

				defaultElement.setAttribute("value", value!=null?value:"0");

				osInstructionsSubElement.addContent(defaultElement);

			} else if (typeAttributeValue.equals("am:InstructionsDeviation")) {
				Element deviationElement = osInstructionsSubElement.getChild("deviation");

				if(deviationElement !=null) {
					
					Element migratedElement= migrateDeviationElement_Containing_LongValue(deviationElement, "default",1.0);

					osInstructionsSubElement.removeContent(deviationElement);
					
					if(migratedElement!=null) {
						osInstructionsSubElement.addContent(migratedElement);
					}
				}

			}

		}
		
	}
	
	
 


}
