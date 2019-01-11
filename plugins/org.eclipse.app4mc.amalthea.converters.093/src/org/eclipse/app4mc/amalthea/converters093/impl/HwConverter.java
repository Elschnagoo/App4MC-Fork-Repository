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
import org.jdom2.Parent;

public class HwConverter extends AbstractConverter {

	

	private File targetFile;

	public HwConverter() {
		this.helper = HelperUtils_092_093.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.9.2 to 0.9.3 : Executing Hw converter for model file : " + targetFile.getName());

		this.caches = caches;

		this.fileName_documentsMap = fileName_documentsMap;

		this.targetFile = targetFile;

		final Document root = fileName_documentsMap.get(this.targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();
		

		update_Latency(rootElement);

	}
	
	private void update_Latency(Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		/*-
		 * As per the change in 0.9.3, Read, Write, Access Latency element definitions are changed
		 *
		 */

		xpathBuffer.append("./hwModel//accessLatency");
		xpathBuffer.append("|");
		xpathBuffer.append("./hwModel//readLatency");
		xpathBuffer.append("|");
		xpathBuffer.append("./hwModel//writeLatency");
		 
		final List<Element> latencyElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_093("am"),this.helper.getGenericNS("xsi"));
		
		for (Element latencyElement : latencyElements) {
			
			Attribute typeAttribute = latencyElement.getAttribute("type", this.helper.getGenericNS("xsi"));
			
			if(typeAttribute!=null) {
				String type = typeAttribute.getValue();
				
				if(type.equals("am:LatencyConstant")) {
					
					type="am:DiscreteValueConstant";
					//setting the updated type value
					typeAttribute.setValue(type);
					
					Attribute cyclesAttribute = latencyElement.getAttribute("cycles");
					
					if(cyclesAttribute!=null) {
						cyclesAttribute.setName("value");
					}
					
				}else if(type.equals("am:LatencyDeviation")) {
					
					String elementName=latencyElement.getName();
					
					Parent parentElement = latencyElement.getParent();
					
					int indexOf = parentElement.indexOf(latencyElement);
					
					Element migratedElement = migrateDeviationElement_Containing_LongValue(latencyElement.getChild("cycles"), elementName,1.0);
					
					parentElement.removeContent(latencyElement);
					
					if(migratedElement!=null) {
						parentElement.addContent(indexOf, migratedElement);
					}
					
				} 
				
			}
		}
	}
 	 

}
