package org.eclipse.app4mc.amalthea.converters093.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters093.utils.HelperUtils_092_093;
import org.jdom2.Document;
import org.jdom2.Element;

public class StimulusConverter extends AbstractConverter {


	private File targetFile;

	public StimulusConverter() {
		this.helper = HelperUtils_092_093.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.9.2 to 0.9.3 : Executing Stimulus converter for model file : " + targetFile.getName());

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
		xpathBuffer.append("./stimuliModel/stimuli");
		
		final List<Element> stimuliElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_093("am"),this.helper.getGenericNS("xsi"));

		for (Element stimuliElement : stimuliElements) { 
			
			String stimuliType=stimuliElement.getAttributeValue("type", this.helper.getGenericNS("xsi"));
			
			if(stimuliType!=null) {
				if(stimuliType.equals("am:PeriodicStimulus")) {
					
					Element jitter_time_deviationElement = stimuliElement.getChild("jitter");
					
					Element migratedElement=migrateDeviationElement_Containing_TimeValue(jitter_time_deviationElement, "jitter");
					
					int indexOf = stimuliElement.indexOf(jitter_time_deviationElement);

					stimuliElement.removeContent(jitter_time_deviationElement);
					
					//adding migrated element to the stimuli element
					stimuliElement.addContent(indexOf, migratedElement);
					
				}else if(stimuliType.equals("am:RelativePeriodicStimulus")) {
					
					Element nextOccurrence_time_deviationElement = stimuliElement.getChild("nextOccurrence");
					
					Element migratedElement=migrateDeviationElement_Containing_TimeValue(nextOccurrence_time_deviationElement, "nextOccurrence");
					
					int indexOf = stimuliElement.indexOf(nextOccurrence_time_deviationElement);

					stimuliElement.removeContent(nextOccurrence_time_deviationElement);
					
					//adding migrated element to the stimuli element
					stimuliElement.addContent(indexOf, migratedElement);


				}else if(stimuliType.equals("am:VariableRateStimulus")) {
					
					Element occurrencesPerStep_double_deviationElement = stimuliElement.getChild("occurrencesPerStep");
					
					Element migratedElement=migrateDeviationElement_Containing_DoubleValue(occurrencesPerStep_double_deviationElement, "occurrencesPerStep");
					
					int indexOf = stimuliElement.indexOf(occurrencesPerStep_double_deviationElement);
					
					stimuliElement.removeContent(occurrencesPerStep_double_deviationElement);
					
					//adding migrated element to the stimuli element
					stimuliElement.addContent(indexOf, migratedElement);
					

					Element maxIncreasePerStepElement = stimuliElement.getChild("maxIncreasePerStep");
				
					Element maxDecreasePerStepElement = stimuliElement.getChild("maxDecreasePerStep");
					
					//As DoubleObject is changed to Double (wrapper class) in model. Instead of child elements, xmi will have attributes for the below two parameters
					if(maxIncreasePerStepElement!=null) {
						stimuliElement.setAttribute("maxIncreasePerStep", maxIncreasePerStepElement.getAttributeValue("value"));
						stimuliElement.removeContent(maxIncreasePerStepElement);
					}
					
					if(maxDecreasePerStepElement!=null) {
						stimuliElement.setAttribute("maxDecreasePerStep", maxDecreasePerStepElement.getAttributeValue("value"));
						stimuliElement.removeContent(maxDecreasePerStepElement);
					}
					
					
				}
			}
			
		}
		
	}
	
	
 
	
	
 


}
