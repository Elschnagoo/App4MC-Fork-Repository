/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.converters093.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters093.utils.HelperUtils_092_093;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public abstract class AbstractConverter implements IConverter {

	protected HelperUtils_092_093 helper;

	protected Logger logger;

	protected List<ICache> caches;

	protected Map<File, Document> fileName_documentsMap;
	
	/**-
	 * This method is used to migrate the data of Deviation element (and the corresponding sub-element : Distribution) into the equivalent semantics as per 0.9.3
	 * <br>
	 * <b>Note:</b><br>
	 * Below are the mappings for ditribution<br>
	 * 
	 *  <table><th>0.9.2</th><th>0.9.3</th>
	 *  <tr>
	 *  <td>Boundaries</td><td>DiscreteInterval</td>
	 *  </tr>
	 *  
	 *  <tr>
	 *  <td>UniformDistribution</td><td>DiscreteUniformDistribution</td>
	 *  </tr>
	 *  
	 	 *  <tr>
	 *  <td>BetaDistribution</td><td>DiscreteBetaDistribution</td>
	 *  </tr> 
	 *  
		 *  <tr>
	 *  <td>WeibullEstimators</td><td>DiscreteWeibullEstimatorsDistribution</td>
	 *  </tr>
		 *  <tr>
	 *  <td>GaussDistribution</td><td>DiscreteGaussDistribution</td>
	 *  </tr>
	 *  
	  
	 *  
	 *  </table>
	 * @param deviationElement
	 * @param newElementName
	 * @return
	 */

	public Element migrateDeviationElement(Element deviationElement, String newElementName) {
		
		 Element tc_executionTicksElement=new Element(newElementName);



		 Element distributionElement=null;
		 
		 String distributionTypeTill092 = null;
		 
		 String lowerBoundValue="0.0";
		 String upperBoundValue="0.0";
		 
		if (deviationElement != null) {

			Element child = deviationElement.getChild("lowerBound");

			if (child != null) {
				String value = child.getAttributeValue("value");
				
				if(value!=null) {
					lowerBoundValue=value;
				}
			}

			Element child2 = deviationElement.getChild("upperBound");

			if (child2 != null) {
				String value = child2.getAttributeValue("value");
				
				if(value !=null) {
					upperBoundValue=value;
				}
			}

			distributionElement = deviationElement.getChild("distribution");

			if (distributionElement != null) {
				distributionTypeTill092 = distributionElement.getAttributeValue("type",
						helper.getGenericNS("xsi"));
			}
		}
		 
		 String distributionTypeFrom093 = null;
		 
		 
		if (distributionTypeTill092 == null) {
			return null;
		} else if (distributionTypeTill092.equals("am:BetaDistribution")) {
			
			/*-
			<deviation>
			      <lowerBound xsi:type="am:LongObject" value="10"/>
			      <upperBound xsi:type="am:LongObject" value="20"/>
			      <distribution xsi:type="am:BetaDistribution" alpha="0.0" beta="0.0"/>
			</deviation>
			*/
			
			distributionTypeFrom093 = "am:DiscreteBetaDistribution";
			
			tc_executionTicksElement.setAttribute(new Attribute("lowerBound", lowerBoundValue));
			tc_executionTicksElement.setAttribute(new Attribute("upperBound", upperBoundValue));
			
			String alpha=distributionElement.getAttributeValue("alpha");
			String beta=distributionElement.getAttributeValue("beta");
			
			if(alpha!=null) {
				tc_executionTicksElement.setAttribute(new Attribute("alpha", alpha));
			}
			if(beta!=null) {
				tc_executionTicksElement.setAttribute(new Attribute("beta", beta));
			}
			
		} else if (distributionTypeTill092.equals("am:Boundaries")) {
			/*-
			<deviation>
			                <lowerBound xsi:type="am:LongObject" value="0"/>
			                <upperBound xsi:type="am:LongObject" value="0"/>
			                <distribution xsi:type="am:Boundaries" samplingType="WorstCase"/>
			</deviation>
			*/
			
			distributionTypeFrom093 = "am:DiscreteInterval";
			
			tc_executionTicksElement.setAttribute(new Attribute("lowerBound", lowerBoundValue));
			tc_executionTicksElement.setAttribute(new Attribute("upperBound", upperBoundValue));
			
			String samplingType=distributionElement.getAttributeValue("samplingType");
			
			if(samplingType!=null) {
				tc_executionTicksElement.setAttribute(new Attribute("samplingType", samplingType));
			}
			
		} else if (distributionTypeTill092.equals("am:GaussDistribution")) {
			
			/*-
			<deviation>
			              <lowerBound xsi:type="am:LongObject" value="10"/>
			              <upperBound xsi:type="am:LongObject" value="20"/>
			              <distribution xsi:type="am:GaussDistribution">
			                <sd xsi:type="am:LongObject" value="5"/>
			                <mean xsi:type="am:LongObject" value="4"/>
			              </distribution>
			</deviation>
			*/
			
			distributionTypeFrom093 = "am:DiscreteGaussDistribution";
			

			tc_executionTicksElement.setAttribute(new Attribute("lowerBound", lowerBoundValue));
			tc_executionTicksElement.setAttribute(new Attribute("upperBound", upperBoundValue));
			
			
			String mean=helper.getValueFromChildElement(distributionElement, "mean", "value");
			
			String sd=helper.getValueFromChildElement(distributionElement, "sd", "value");;
			
			if(mean!=null) {
				tc_executionTicksElement.setAttribute(new Attribute("mean", mean));
			}
			if(sd!=null) {
				tc_executionTicksElement.setAttribute(new Attribute("sd", sd));
			}

		} else if (distributionTypeTill092.equals("am:UniformDistribution")) {
			
			/*-
	           <deviation>
	                <lowerBound xsi:type="am:LongObject" value="0"/>
	                <upperBound xsi:type="am:LongObject" value="0"/>
	                <distribution xsi:type="am:UniformDistribution"/>
	              </deviation>
			 */
			
			distributionTypeFrom093 = "am:DiscreteUniformDistribution";
			
			tc_executionTicksElement.setAttribute(new Attribute("lowerBound", lowerBoundValue));
			tc_executionTicksElement.setAttribute(new Attribute("upperBound", upperBoundValue));
			

		} else if (distributionTypeTill092.equals("am:WeibullEstimators")) {
			
			/*-
			 <deviation>
			              <lowerBound xsi:type="am:LongObject" value="10"/>
			              <upperBound xsi:type="am:LongObject" value="20"/>
			              <distribution xsi:type="am:WeibullEstimators" pRemainPromille="5.0">
			                <mean xsi:type="am:LongObject" value="20"/>
			              </distribution>
			</deviation>
			*/

			distributionTypeFrom093 = "am:DiscreteWeibullEstimatorsDistribution";
			
			tc_executionTicksElement.setAttribute(new Attribute("lowerBound", lowerBoundValue));
			tc_executionTicksElement.setAttribute(new Attribute("upperBound", upperBoundValue));

			String pRemainPromille=distributionElement.getAttributeValue("pRemainPromille");

			if(pRemainPromille!=null) {
				tc_executionTicksElement.setAttribute(new Attribute("pRemainPromille", pRemainPromille));
			}
			
			String mean=helper.getValueFromChildElement(distributionElement, "mean", "value");
			
			if(mean!=null) {
				tc_executionTicksElement.setAttribute(new Attribute("average", mean));
			}
			

		} else if (distributionTypeTill092.equals("am:WeibullParameters")) {
			
			distributionTypeFrom093 = "am:DiscreteWeibullParametersDistribution";

			logger.error("Deviation with \"WeibullParameters\" as distribution can not be migrated as the semantics of \"WeibullParameters\" were not clearly described");
			
			return null;
		}
		Attribute value_TypeAttribute=new Attribute("type", distributionTypeFrom093, this.helper.getGenericNS("xsi"));

		tc_executionTicksElement.getAttributes().add(value_TypeAttribute);

		 return tc_executionTicksElement;
	 }
}
