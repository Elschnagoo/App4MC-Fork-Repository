package org.eclipse.app4mc.amalthea.converters093.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters093.utils.HWCacheBuilder.PUDefinition_IPCData;
import org.eclipse.app4mc.amalthea.converters093.utils.HelperUtils_092_093;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Parent;

import com.google.common.collect.Iterables;

public class SwConverter extends AbstractConverter {

	

	private File targetFile;

	private List<ICache> caches;
	
	private PUDefinition_IPCData hwCache;
	
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
						migratedElement.setName("occurrence");
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
		xpathBuffer
				.append("./osModel/operatingSystems/taskSchedulers/computationItems[@xsi:type=\"am:ExecutionNeed\"]");
		xpathBuffer.append("|");
		xpathBuffer.append(
				"./osModel/operatingSystems/interruptControllers/computationItems[@xsi:type=\"am:ExecutionNeed\"]");

		final List<Element> executionNeeds = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getNS_093("am"), this.helper.getGenericNS("xsi"));

		for (final Element executionNeedElement : executionNeeds) {

			String containerElementName = null;

			String containerType = "";

			Element parentElement = this.helper.getParentElementOfName(executionNeedElement, "runnables",
					"taskSchedulers", "interruptControllers");

			if (parentElement != null) {

				containerElementName = parentElement.getAttributeValue("name");

				if (parentElement.getName().equals("runnables")) {
					containerType = "Runnable";
				} else if (parentElement.getName().equals("taskSchedulers")) {
					containerType = "TaskScheduler";

				} else if (parentElement.getName().equals("interruptControllers")) {
					containerType = "InterruptController";

				}
			}

			String nodeName = executionNeedElement.getName();

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

			Map<String, Element> defaultElementsMap = new LinkedHashMap<>();

			for (Element defaultElement : defaultElements) {

				String key = defaultElement.getAttributeValue("key");

				if (key != null) {
					defaultElementsMap.put(key, defaultElement);
				}
			}

			Element newExecutionTicksElement = null;

			Element newExecutionNeedsElement = null;
			
			
			
			Set<Entry<String, Element>> entrySet = defaultElementsMap.entrySet();
			
			Iterator<Entry<String, Element>> iterator = entrySet.iterator();
			
			while(iterator.hasNext()) {
				
				Entry<String, Element> next = iterator.next();
				
				String key = next.getKey();

				if (key.equals("Instructions")) {

					Element defaultInstructionsElement = defaultElementsMap.get("Instructions");

					/*- ------ExecutionTicks element --------------*/
					newExecutionTicksElement = new Element(nodeName);

					Attribute typeAttribute = new Attribute("type", "am:Ticks", this.helper.getGenericNS("xsi"));

					newExecutionTicksElement.getAttributes().add(typeAttribute);
					

					/*-
					 *    <default key="Instructions">
							<value xsi:type="am:NeedConstant" value="20"/>
						  </default>
					 */
					Element valueElement = defaultInstructionsElement.getChild("value");

					Element default_executionTicksElement = createTicksElementFromNeed(valueElement, "default", 1.0);

					if (default_executionTicksElement != null) {
						// Adding default ExecutionTicks element
						newExecutionTicksElement.addContent(default_executionTicksElement);
					}
				} else {

					if (containerType.equals("TaskScheduler") || containerType.equals("InterruptController")) {
						logger.warn("In "+containerType+" : "+ containerElementName+ ", ExecutionNeed element's NeedEntry (having HwFeatureCategory :  "+key +")-> can not be migrated. As this is not supported in 0.9.3. \nIn "+containerType+" element only NeedEntry elements having HwFeatureCategory Instructions are migrated to Ticks");
						continue;
					}
					Element defaultExecutionNeedElement = defaultElementsMap.get(key);

					if (newExecutionNeedsElement == null) {

						newExecutionNeedsElement = new Element(nodeName);

						Attribute typeAttribute = new Attribute("type", "am:ExecutionNeed",
								this.helper.getGenericNS("xsi"));

						newExecutionNeedsElement.getAttributes().add(typeAttribute);

					}

					/*-
					 *    <default key="Instructions">
					<value xsi:type="am:NeedConstant" value="20"/>
					 </default>
					 */
					Element valueElement = defaultExecutionNeedElement.getChild("value");

					if (valueElement != null) {
						Element newNeedElementValue = createTicksElementFromNeed(valueElement, "value",1.0);

						if (newNeedElementValue != null) {
							Element needsElement = new Element("needs");

							needsElement.setAttribute(new Attribute("key", key));

							needsElement.addContent(newNeedElementValue);

							// adding needs element to ExecutionNeed element

							newExecutionNeedsElement.addContent(needsElement);
						}
					}
				}
			
			}
			
			
//			for (String key : defaultElementsMap.keySet()) {}

			/*------------------------------ Handling ExtendedElements ---------------------------*/

			List<Element> extendedElements = executionNeedElement.getChildren("extended");

			for (Element extendedElement : extendedElements) {

				Double ipcValue=getIPCValue(extendedElement);
				
				final List<Element> valueElements = this.helper.getXpathResult(extendedElement,
						"./value[@key=\"Instructions\"]", Element.class, this.helper.getNS_093("am"));

				if (valueElements.size() > 0) {

					Element extended_executionTicksElement = new Element("extended");

					this.helper.copyElement_Attribute_or_Element(extendedElement, extended_executionTicksElement,
							"key");
					/*-
					 *  <extended key="puDef?type=ProcessingUnitDefinition">
							<value key="Instructions">
								<value xsi:type="am:NeedConstant" value="10"/>
						    </value>
						</extended>
					 * 
					 */
					Element valueElement = valueElements.get(0);

					Element valueValueElement = valueElement.getChild("value");

					Element value_executionTicksElement = createTicksElementFromNeed(valueValueElement, "value",ipcValue);

					if (value_executionTicksElement != null) {
						/*- adding value to the Extended ticks element */
						extended_executionTicksElement.addContent(value_executionTicksElement);

						// Adding extended ExecutionTicks element

						if (newExecutionTicksElement == null) {
							newExecutionTicksElement = new Element(nodeName);

							Attribute typeAttribute = new Attribute("type", "am:Ticks",
									this.helper.getGenericNS("xsi"));

							newExecutionTicksElement.getAttributes().add(typeAttribute);
						}
						newExecutionTicksElement.addContent(extended_executionTicksElement);

					}
				}

			}

			List<Element> newRunnableItemElementsList=new ArrayList<>();
			
			if (newExecutionTicksElement != null) {

				newRunnableItemElementsList.add(newExecutionTicksElement);
			}
			if (newExecutionNeedsElement != null) {
				newRunnableItemElementsList.add(newExecutionNeedsElement);
			} 
			
			Parent parent = executionNeedElement.getParent();
			
			int indexOf = parent.indexOf(executionNeedElement);
			
			if(newRunnableItemElementsList.size()>0) {
				parent.addContent(indexOf, newRunnableItemElementsList);
			}

			final List<Element> skippedValuesExtended = this.helper.getXpathResult(executionNeedElement,
					"./extended/value[not(@key=\"Instructions\")]", Element.class, this.helper.getNS_093("am"));

			final List<Element> skippedValuesDefault = this.helper.getXpathResult(executionNeedElement,
					"./default[not(@key=\"Instructions\")]", Element.class, this.helper.getNS_093("am"));

			StringBuffer extendedElementsbuffer = new StringBuffer();
			for (Element elementKey : skippedValuesExtended) {
				String attributeValue = elementKey.getAttributeValue("key");
				extendedElementsbuffer.append(attributeValue);
				extendedElementsbuffer.append(",");
			}
			StringBuffer defaultElementsbuffer = new StringBuffer();
			for (Element elementKey : skippedValuesDefault) {
				String attributeValue = elementKey.getAttributeValue("key");
				defaultElementsbuffer.append(attributeValue);
				defaultElementsbuffer.append(",");
			}

			if (extendedElementsbuffer.length() > 0) {
				logger.info("In " + containerType + " : \"" + containerElementName
						+ ", \" Entries of ExecutionNeed (extended elements) with following keys can not be migrated : "
						+ extendedElementsbuffer.toString().substring(0, extendedElementsbuffer.length() - 1) +" -> (only supported \"HwFeatureCategory\" as key is : \"Instructions\")");

			}
			
			if ((defaultElementsbuffer.length() > 0)&&(containerType.equals("TaskScheduler")||containerType.equals("InterruptController"))) {
				logger.info("In " + containerType + " : \"" + containerElementName
						+ ", \" Entries of ExecutionNeed (default elements) with following keys can not be migrated : "
						+ defaultElementsbuffer.toString().substring(0, defaultElementsbuffer.length() - 1) +" ->(only supported \"HwFeatureCategory\" as key is : \"Instructions\")");

			}

			/*- Removing ExecutionNeeds element as the data of it is migrated */

			parent.removeContent(executionNeedElement);

		}
	}

	private Double getIPCValue(Element extendedElement) {
		
		String puDefinition = helper.getSingleElementNameFromAttributeOrChildeElement("key", extendedElement);
		
		if(puDefinition !=null) {
			
			String ipcFeatureElement = getHWCache().puDefinition_IPCFeatureMap.get(puDefinition);
			
			if(ipcFeatureElement!=null) {
				Double ipcValue = getHWCache().ipcFeature_valueMap.get(ipcFeatureElement);
				if(ipcValue!=null) {
					return ipcValue;
				}
			}
			
		}
		return 1d;
	}

	

	private Element createTicksElementFromNeed(  Element valueElement, String newElementName, double ipcValue) {
		if(valueElement !=null) {
			 String valueType = valueElement.getAttributeValue("type", this.helper.getGenericNS("xsi"));
			 /*- it can be either NeedConstant or NeedDeviation */
			 
			 if(valueType !=null && valueType.equals("am:NeedConstant")) {
				 
				 Element tc_executionTicksElement=new Element(newElementName);

				 Attribute default_executionTicksElement_TypeAttribute=new Attribute("type", "am:DiscreteValueConstant", this.helper.getGenericNS("xsi"));
					
				 tc_executionTicksElement.getAttributes().add(default_executionTicksElement_TypeAttribute);
					
				 
				 String valueValue = valueElement.getAttributeValue("value");
				 
				 if(valueValue!=null) {
					 //TODO: divide with value of Instructions
					 tc_executionTicksElement.getAttributes().add(new Attribute("value", getValueAfterApplyingIPC(valueValue, ipcValue)));
				 }
				 
				 return tc_executionTicksElement;
			 }else  if(valueType !=null && valueType.equals("am:NeedDeviation")) {

				 Element deviationElement = valueElement.getChild("deviation");

				 return migrateDeviationElement_Containing_LongValue(deviationElement, newElementName,ipcValue);
			 }
		}
		return null;
	}


	
	/**
	 * This method is used to get the HW model cache data
	 *
	 * @return PUDefinition_IPCData
	 */
	private PUDefinition_IPCData getHWCache() {

		if (this.hwCache == null) {

			for (final ICache cache : this.caches) {

				if (cache instanceof org.eclipse.app4mc.amalthea.converters093.utils.HWCacheBuilder) {
					Map<File, Map<String, Object>> cacheMap = cache.getCacheMap();

					if(cacheMap!=null && cacheMap.size()>0) {
						Map<String, Object> map = Iterables.get(cacheMap.values(), 0);

						if(map!=null) {
							Object object = map.get("globalCache");

							return (PUDefinition_IPCData) object;
						}

					}
				}
			}

		 
		}
		return hwCache;

	}
	 

}
