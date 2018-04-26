package org.eclipse.app4mc.amalthea.converters090.utils;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.app4mc.amalthea.converters.common.base.IPostProcessor;
import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.jdom2.Document;
import org.jdom2.Element;

public class UpdateCustomPropsPostProcessor implements IPostProcessor {

	public UpdateCustomPropsPostProcessor() {
	}

	@Override
	public void process(Map<File, Document> fileName_documentsMap, AbstractHelper helper) throws Exception {

		Collection<Document> values = fileName_documentsMap.values();
		
		for (Document document : values) {
			Element rootElement = document.getRootElement();
			

			final List<Element> value_customPropertyElements =  helper.getXpathResult(rootElement,".//customProperties//*[@xsi:type=\"am:ReferenceObject\"]",
					Element.class,  helper.getGenericNS("xsi"));
			
			for (Element value_customPropertyElement : value_customPropertyElements) {

				Entry<String, String> entry = helper.getSingleElementsNameandTypeFromAttributeOrChildeElement("value", value_customPropertyElement);
				
				value_customPropertyElement.removeAttribute("value");
				value_customPropertyElement.removeChild("value");
				
				if(entry!=null) {
					String updatedTypeAfterMigration=getUpdatedType(entry.getValue());

					if(values.size()>1) {
						Element valueElement=new Element("value");
						
						
						valueElement.setAttribute("type", "am:"+updatedTypeAfterMigration, helper.getGenericNS("xsi"));
						
						valueElement.setAttribute("href", "amlt:/#"+entry.getKey()+"?"+"type="+updatedTypeAfterMigration);
						
						value_customPropertyElement.addContent(valueElement);
					}else {
						value_customPropertyElement.setAttribute("value", entry.getKey()+"?type="+updatedTypeAfterMigration);
					}
					
					
				}
				
			}
			
		}
	}

	private String getUpdatedType(String value) {

		if (value == null) {
			return null;
		}

		if (value.equals("MemoryType")) {
			value = "MemoryDefinition";
		} else if (value.equals("CoreType")) {
			value = "ProcessingUnit";
		} else if (value.equals("NetworkType")) {
			value = "ConnectionHandler";
		} else if (value.equals("HwSystem")) {
			value = "HwStructure";
		} else if (value.equals("ECU")) {
			value = "HwStructure";
		} else if (value.equals("Microcontroller")) {
			value = "HwStructure";
		} else if (value.equals("Core")) {
			value = "ProcessingUnitDefinition";
		} else if (value.equals("Network")) {
			value = "ConnectionHandlerDefinition";
		} else if (value.equals("Quartz")) {
			value = "FrequencyDomain";
		}

		return value;
	}

}
