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

public class SwConverter extends AbstractConverter {

	

	private File targetFile;

	public SwConverter() {
		this.helper = HelperUtils_092_093.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.9.2 to 0.9.3 : Executing Sw converter for model file : " + targetFile.getName());

		this.caches = caches;

		this.fileName_documentsMap = fileName_documentsMap;

		this.targetFile = targetFile;

		final Document root = fileName_documentsMap.get(this.targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();
		
		update_ExecutionNeed(rootElement);

		update_ChunkProcessingInstructions(rootElement);
		
		update_activations(rootElement);

	}
	
	private void update_activations(Element rootElement) {
		final StringBuffer xpathBuffer = new StringBuffer();
		xpathBuffer.append("./swModel/activations");
		
		final List<Element> activationElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_093("am"),this.helper.getGenericNS("xsi"));

		for (Element activationElement : activationElements) { 
			String activationType=activationElement.getAttributeValue("type", this.helper.getGenericNS("xsi"));
			
			if(activationType!=null) {
				
				if(activationType.equals("am:VariableRateActivation")) {

					Element occurrencesPerStep_double_deviationElement = activationElement.getChild("occurrencesPerStep");
					
					if(occurrencesPerStep_double_deviationElement!=null) {
						
						Element migratedElement=migrateDeviationElement_Containing_DoubleValue(occurrencesPerStep_double_deviationElement, "occurrencesPerStep");
						
						int indexOf = activationElement.indexOf(occurrencesPerStep_double_deviationElement);
						
						activationElement.removeContent(occurrencesPerStep_double_deviationElement);
						
						if(migratedElement!=null) {
							//adding migrated element to the activation element
							activationElement.addContent(indexOf, migratedElement);
							
						}
					}


				}else if(activationType.equals("am:SporadicActivation")) {
					
					Element activationDeviation_Time_deviationElement = activationElement.getChild("activationDeviation");

					if(activationDeviation_Time_deviationElement!=null) {
						
						Element migratedElement=migrateDeviationElement_Containing_TimeValue(activationDeviation_Time_deviationElement, "activationDeviation");
						
						int indexOf = activationElement.indexOf(activationDeviation_Time_deviationElement);
						
						activationElement.removeContent(activationDeviation_Time_deviationElement);
						
						if(migratedElement!=null) {
							//adding migrated element to the activation element
							activationElement.addContent(indexOf, migratedElement);
							
						}
					}

				
				}
			}
		}
		
	}

	private void update_ChunkProcessingInstructions(Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		/*-
		 * As per the change in 0.9.3, chunkProcessingInstructions (of 0.9.2) inside TransmissionPolicy class, is changed to chunkProcessingTicks
		 *
		 */

		xpathBuffer.append("./swModel/runnables//*[@xsi:type=\"am:LabelAccess\" or @xsi:type=\"am:ChannelSend\" or @xsi:type=\"am:ChannelReceive\"]/transmissionPolicy");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/operatingSystems/taskSchedulers/computationItems[@xsi:type=\"am:LabelAccess\"]/transmissionPolicy");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/operatingSystems/interruptControllers/computationItems[@xsi:type=\"am:LabelAccess\"]/transmissionPolicy");
		 
		final List<Element> transmissionPolicyElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_093("am"),this.helper.getGenericNS("xsi"));
		
		for (Element transmissionPolicyElement : transmissionPolicyElements) {
			
			Attribute attribute = transmissionPolicyElement.getAttribute("chunkProcessingInstructions");
			
			if(attribute!=null) {
				attribute.setName("chunkProcessingTicks");
			}
		}
	}

	private void update_ExecutionNeed(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		/*-
		 * As per the change in 0.9.3, ExecutionNeed (of 0.9.2) with default and extended entries having key as Instructions, is converted to ExecutionTicks
		 *
		 * xpathBuffer.append("./swModel/sections/size");
		 * xpathBuffer.append("|");
		 */

		xpathBuffer.append("./swModel/runnables//*[@xsi:type=\"am:ExecutionNeed\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/operatingSystems/taskSchedulers/computationItems[@xsi:type=\"am:ExecutionNeed\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/operatingSystems/interruptControllers/computationItems[@xsi:type=\"am:ExecutionNeed\"]");
		 

		final List<Element> executionNeeds = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_093("am"),this.helper.getGenericNS("xsi"));

		for (final Element executionNeedElement : executionNeeds) {
			
			
			String containerElementName=null;
			
			String containerType="";
			
			Element parentElement = this.helper.getParentElementOfName(executionNeedElement, "runnables","taskSchedulers","interruptControllers");
			
			if(parentElement !=null) {
				
				containerElementName=parentElement.getAttributeValue("name");
				
				if(parentElement.getName().equals("runnables")) {
					containerType="Runnable";
				}else if(parentElement.getName().equals("taskSchedulers")) {
					containerType="TaskScheduler";
					
				}else if(parentElement.getName().equals("interruptControllers")) {
					containerType="InterruptController";
					
				}
			}
		 
			String nodeName=executionNeedElement.getName();
			
			
			/*-
			 *    <default key="Instructions">
          <value xsi:type="am:NeedConstant" value="45"/>
        </default>
        <default key="FLOP">
          <value xsi:type="am:NeedDeviation">
            <deviation>
              <lowerBound xsi:type="am:LongObject" value="0"/>
              <upperBound xsi:type="am:LongObject" value="0"/>
              <distribution xsi:type="am:BetaDistribution" alpha="0.0" beta="0.0"/>
            </deviation>
          </value>
        </default>
			 */
			List<Element> defaultElements = executionNeedElement.getChildren("default");
			
			boolean isInstructionsPresent=false;

			Element defaultInstructionsElement=null;
			
			loop: for (Element defaultElement : defaultElements) {
				
				String key = defaultElement.getAttributeValue("key");
				
				if(key!=null && key.equalsIgnoreCase("Instructions")) {
					isInstructionsPresent=true;
					defaultInstructionsElement=defaultElement;
					break loop;
				}
			}
			
			/*- ------ExecutionTicks element --------------*/
			Element executionTicksElement=new Element(nodeName);
			
			Attribute typeAttribute=new Attribute("type", "am:Ticks", this.helper.getGenericNS("xsi"));
			
			executionTicksElement.getAttributes().add(typeAttribute);
			
			/*- -----------------------------------------*/
			
			if(isInstructionsPresent && defaultInstructionsElement!=null) {
				
				/*-
				 *    <default key="Instructions">
          				<value xsi:type="am:NeedConstant" value="20"/>
        			  </default>
				 */
				Element valueElement = defaultInstructionsElement.getChild("value");
	
				Element default_executionTicksElement= createTicksElementFromNeed( valueElement,"default");
	
				if(default_executionTicksElement!=null) {
					//Adding default ExecutionTicks element
					executionTicksElement.addContent(default_executionTicksElement);
				}
				
			}
			
			/*------------------------------ Handling ExtendedElements ---------------------------*/
			
			
			List<Element> extendedElements = executionNeedElement.getChildren("extended");
			
			for (Element extendedElement : extendedElements) {
			
				

				final List<Element> valueElements = this.helper.getXpathResult(extendedElement,"./value[@key=\"Instructions\"]", Element.class,
						this.helper.getNS_093("am"));
				
				if(valueElements.size()>0) {
					
					Element extended_executionTicksElement=new Element("extended");
					
					this.helper.copyElement_Attribute_or_Element(extendedElement,extended_executionTicksElement,"key");
					/*-
					 *  <extended key="puDef?type=ProcessingUnitDefinition">
     						<value key="Instructions">
     							<value xsi:type="am:NeedConstant" value="10"/>
 						    </value>
 						</extended>
					 * 
					 */
					Element valueElement = valueElements.get(0);
					
					Element valueValueElement=valueElement.getChild("value");
					
					Element value_executionTicksElement= createTicksElementFromNeed( valueValueElement,"value");
					
					if(value_executionTicksElement!=null) {
						/*- adding value to the Extended ticks element */
						extended_executionTicksElement.addContent(value_executionTicksElement);
						
						//Adding extended ExecutionTicks element
						executionTicksElement.addContent(extended_executionTicksElement);
						
					}
				}
			 
			}
			
			Parent parent = executionNeedElement.getParent();

			/*- checking if the ExecutionTicks contain any elements. If there are no children inside ExecutionTicks, it is not required to add it as a RunnableItem */
			if(executionTicksElement.getChildren().size()>0) {
				
				int indexOf = parent.indexOf(executionNeedElement);
				
				parent.addContent(indexOf, executionTicksElement);
				
			}
			
			final List<Element> skippedValues = this.helper.getXpathResult(executionNeedElement,"./default[not(@key=\"Instructions\")] | ./extended/value[not(@key=\"Instructions\")]", Element.class,
					this.helper.getNS_093("am"));
			
			StringBuffer buffer=new StringBuffer();
			for (Element elementKey : skippedValues) {
				String attributeValue = elementKey.getAttributeValue("key");
				buffer.append(attributeValue);
				buffer.append(",");
			}
			
			if(buffer.length()>0) {
				logger.info("In "+containerType+" : \""+containerElementName+"\" Entries of ExecutionNeed with following keys can not be migrated (only supported \"HwFeatureCategory\" as key is : \"Instructions\"): " + buffer.toString().substring(0, buffer.length()-1));
				
			}
			
			
			/*- Removing ExecutionNeeds element as the data of it is migrated */
 
			parent.removeContent(executionNeedElement);
		}
	}

	

	private Element createTicksElementFromNeed(  Element valueElement, String newElementName) {
		if(valueElement !=null) {
			 String valueType = valueElement.getAttributeValue("type", this.helper.getGenericNS("xsi"));
			 /*- it can be either NeedConstant or NeedDeviation */
			 
			 if(valueType !=null && valueType.equals("am:NeedConstant")) {
				 
				 Element tc_executionTicksElement=new Element(newElementName);

				 Attribute default_executionTicksElement_TypeAttribute=new Attribute("type", "am:DiscreteConstant", this.helper.getGenericNS("xsi"));
					
				 tc_executionTicksElement.getAttributes().add(default_executionTicksElement_TypeAttribute);
					
				 
				 String valueValue = valueElement.getAttributeValue("value");
				 
				 if(valueValue!=null) {
					 //TODO: multiply with value of Instructions
					 tc_executionTicksElement.getAttributes().add(new Attribute("value", valueValue));
				 }
				 
				 return tc_executionTicksElement;
			 }else  if(valueType !=null && valueType.equals("am:NeedDeviation")) {

				 Element deviationElement = valueElement.getChild("deviation");

				 return migrateDeviationElement_Containing_LongValue(deviationElement, newElementName);
			 }
		}
		return null;
	}

	
	 

}
