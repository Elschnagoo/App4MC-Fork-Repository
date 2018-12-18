package org.eclipse.app4mc.amalthea.converters093.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters093.utils.HelperUtils_092_093;
import org.jdom2.Document;
import org.jdom2.Element;

public class MeasurementConverter extends AbstractConverter {


	private File targetFile;

	public MeasurementConverter() {
		this.helper = HelperUtils_092_093.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.9.2 to 0.9.3 : Executing Measurement converter for model file : " + targetFile.getName());

		this.caches = caches;

		this.fileName_documentsMap = fileName_documentsMap;

		this.targetFile = targetFile;

		final Document root = fileName_documentsMap.get(this.targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();
		
		update_Stimuli(rootElement);

	}
	
	private void update_Stimuli(final Element rootElement) {
		final StringBuffer xpathBuffer = new StringBuffer();
		xpathBuffer.append("./measurementModel/measurements");
		
		final List<Element> measurementElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_093("am"),this.helper.getGenericNS("xsi"));

		for (Element measurementElement : measurementElements) { 
			
			Element runtimeDeviation_Time_element = measurementElement.getChild("runtimeDeviation");
			
			if(runtimeDeviation_Time_element!=null) {
				
				Element migratedElement=migrateDeviationElement_Containing_TimeValue(runtimeDeviation_Time_element, "runtimeDeviation");
				
				int indexOf = measurementElement.indexOf(runtimeDeviation_Time_element);
				
				measurementElement.removeContent(runtimeDeviation_Time_element);
				
				if(migratedElement!=null) {
					//adding migrated element to the stimuli element
					measurementElement.addContent(indexOf, migratedElement);
				}
			}
			
		}
		
	}
	
	
 
	
	
 


}
