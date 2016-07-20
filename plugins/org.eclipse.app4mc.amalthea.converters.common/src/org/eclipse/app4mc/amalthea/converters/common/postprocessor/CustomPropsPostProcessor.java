/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters.common.postprocessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.IPostProcessor;
import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This PostProcessor is used to migrate CustomProperties which are having value as ReferenceObject
 *
 * @author MEZ2RNG
 *
 */
public class CustomPropsPostProcessor implements IPostProcessor {

	public CustomPropsPostProcessor() {
	}
	
	private final Logger logger=LogManager.getLogger(this.getClass());

	private AbstractHelper helper;

	@Override
	public void process(final Map<File, Document> fileName_documentsMap, final AbstractHelper helper) throws Exception {

		this.helper = helper;

		/*-Map holding File name as a Key and value as a Map:
		 * containing key as : uriFragment or xmi ID of AMALTHEA element
		 * Value as : List of CustomProperties Value object which is of type common:ReferenceObject
		 *  */
		final Map<File, Map<String, List<Element>>> map_values_to_be_investigated = new HashMap<File, Map<String, List<Element>>>();

		boolean areXMIIDsUsed = false;

		Map<File, Map<String, List<Element>>> idElementsCacheMap = new HashMap<File, Map<String, List<Element>>>();


		for (final File targetFile : fileName_documentsMap.keySet()) {

			final Document root = fileName_documentsMap.get(targetFile);

			if (root == null) {
				return;
			}
			final Element rootElement = root.getRootElement();

			/*-
			 * Contains key as : uriFragment or xmi ID of AMALTHEA element
			 * Value : List of CustomProperties Value object's having
			 */
			final Map<String, List<Element>> refCustomProps_ObjectsMap = new HashMap<String, List<Element>>();

			/*-
			 * CustomProperties with Reference to ReferableBaseObject can exists in the following way:
			 *
			 *Case 1: Referring elements inside the same model
			 *  <customProperties xmi:id="_p-7r4OnfEeW9t73E3V9yAw" key="key">
			 *		<value xsi:type="common:ReferenceObject" xmi:id="_qsGT4OnfEeW9t73E3V9yAw" value="_oi1hUOnfEeW9t73E3V9yAw"/>
			 *	</customProperties>
			 *
			 *Case 2: Referring elements across the model files
			 *
			 *<customProperties xmi:id="__0JRIOqOEeW9t73E3V9yAw">
			 *		<value xsi:type="common:ReferenceObject" xmi:id="_AmqTMOqPEeW9t73E3V9yAw">
			 *			<value href="default.amxmi#_UZWXYOqLEeW9t73E3V9yAw"/>
			 *		</value>
			 *	</customProperties>
			 *
			 *Case 3: List of Ref objects
			 *
			 *<customProperties xmi:id="_rnhEIBaeEeasLIggkXJ5XQ" key="group_labels">
			 *   <value xsi:type="common:ListObject" xmi:id="_sJ_fEBaeEeasLIggkXJ5XQ">
			 *     <values xsi:type="common:ReferenceObject" xmi:id="_t-0SsBaeEeasLIggkXJ5XQ" value="_hk2sYBaeEeasLIggkXJ5XQ"/>
			 *     <values xsi:type="common:ReferenceObject" xmi:id="_vzxCIBaeEeasLIggkXJ5XQ" value="_k5wysBaeEeasLIggkXJ5XQ"/>
			 *     <values xsi:type="common:ReferenceObject" xmi:id="_yQN2cBaeEeasLIggkXJ5XQ" value="_lDRUABaeEeasLIggkXJ5XQ"/>
			 *     <values xsi:type="common:ReferenceObject" xmi:id="_9YBRUBaeEeasLIggkXJ5XQ">
			 *	       <value href="slave_default.amxmi#_hk2sYBaeEeasLIggkXJ5XQ"/>
			 *       </values>
			 *    </value>
			 *   </customProperties>
			 */


			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append(".//customProperties/value[@xsi:type=\"common:ReferenceObject\"]");
			xpathBuffer.append("|");
			xpathBuffer.append(".//customProperties/value/values[@xsi:type=\"common:ReferenceObject\"]");


			final List<Element> value_custProps_refObjects = helper.getXpathResult(rootElement, xpathBuffer.toString(),
					Element.class, helper.getGenericNS("xsi"));


			for (final Element element : value_custProps_refObjects) {

				String attributeValue = element.getAttributeValue("value");

				if (attributeValue == null) {
					/*-
					 * Case where elements across the model files are referred:
					 * <value xsi:type="common:ReferenceObject" xmi:id="_AmqTMOqPEeW9t73E3V9yAw">
					 * 	<value  href="default.amxmi#_UZWXYOqLEeW9t73E3V9yAw"/>
					 * </value>
					 */
					attributeValue = element.getChild("value") != null
							? element.getChild("value").getAttributeValue("href") : null;
				}

				if (attributeValue != null) {

					if (!refCustomProps_ObjectsMap.containsKey(attributeValue)) {
						refCustomProps_ObjectsMap.put(attributeValue, new ArrayList<Element>());
					}

					refCustomProps_ObjectsMap.get(attributeValue).add(element);

					if ((areXMIIDsUsed == false) && !isURIFragment(attributeValue)) {
						areXMIIDsUsed = true;
					}
				}

			}

			map_values_to_be_investigated.put(targetFile, refCustomProps_ObjectsMap);

		}

		/*- In the case where XMI ID's are used, fetching the elements through Xpath will be of performance hit.
		 * Instead of Xpath, memory map is built for all the model elements with key as XMI ID
		 */
		if (areXMIIDsUsed) {
			idElementsCacheMap = buildCache(fileName_documentsMap, helper);
		}

		/*
		 * verifying if the referred elements are implementing ReferableBaseObject Interface. In the case elements are
		 * not implementing ReferableBaseObject, then such CustomProperty value elements should be removed from the
		 * model
		 */

		final HashMap<String, File> refFileInfoMap = new HashMap<String, File>();

		final Map<String, List<XSDElement>> tags_refbaseObjectsMap = populateInfoOfAmaltheModelTags_111_Content();

		for (final File modelFile : map_values_to_be_investigated.keySet()) {

			final Map<String, List<Element>> map = map_values_to_be_investigated.get(modelFile);

			if (map != null) {

				for (final String refString : map.keySet()) {

					/*- refString can be either an ID or the URIFragment */

					final List<Element> values = map.get(refString);

					boolean isRefBaseObjectType = true;

					if (!isURIFragment(refString)) {

						/*- case of refering elements across models*/

						final int indexOfHash = refString.indexOf("#");

						if (indexOfHash != -1) {

							final String fileName = refString.substring(0, indexOfHash);

							final String id = refString.substring(indexOfHash + 1);

							final File refFile = getRefFile(modelFile, refFileInfoMap, fileName);


							/*- check is performed here to verify if Element associated to id is implementing ReferableBaseObject*/

							final Entry<Boolean, ElementRef> result = isElementOfRefBaseObject(refFile, id,
									idElementsCacheMap, tags_refbaseObjectsMap);

							isRefBaseObjectType = result.getKey();

							final ElementRef elementRef = result.getValue();

							/*- in case where elements are referred from other model, corresponding types of it should be updated at the place where they are referred*/

							updateTypeForAllElements(values, elementRef != null ? elementRef.getType() : null);


						}
						else {
							/*- case of refering elements within the same model*/

							final Entry<Boolean, ElementRef> result = isElementOfRefBaseObject(modelFile, refString,
									idElementsCacheMap, tags_refbaseObjectsMap);
							isRefBaseObjectType = result.getKey();

						}

					}
					else {
						/*- This is the case where legacy URI fragments are specified  example: //@stimuliModel/@stimuli.0*/


						final ElementRef elementRef = elementRefBuilder(refString);


						isRefBaseObjectType = isElementOfRefBaseObject(elementRef, tags_refbaseObjectsMap);
					}

					if (!isRefBaseObjectType) {

						detachElements(values);

					}


				}
			}

		}

	}

	/**
	 * This method is used to check if the supplied tag (through ElementRef) is extending RefBaseObject
	 *
	 * @param elementRef
	 * @param tags_refbaseObjectsMap
	 * @return
	 */

	private boolean isElementOfRefBaseObject(final ElementRef elementRef,
			final Map<String, List<XSDElement>> tags_refbaseObjectsMap) {

		final List<XSDElement> list = tags_refbaseObjectsMap.get(elementRef.getName());

		if (list != null) {

			final ElementRef parentRef = elementRef.getParentRef();

			final String parentName = parentRef.getName();

			final String parentType = parentRef.getType();

			boolean isParentSame = false;

			mainLoop: for (final XSDElement elementRef2 : list) {

				final Set<XSDElement> parentRefs = elementRef2.getParentRefs();

				for (final XSDElement xsdElementRef : parentRefs) {

					if (parentName != null) {
						if (xsdElementRef.getName().equals(parentName)) {

							/*- setting the type from the XSD element .. in a case where ElementRef Type is not available from XMI */
							if (elementRef.getType() == null) {
								elementRef.setType(elementRef2.getType());
							}

							isParentSame = true;
							break mainLoop;
						}
					}
					else if (parentType != null) {
						if (xsdElementRef.getType().equals(parentType)) {
							isParentSame = true;
							break mainLoop;
						}
					}
				}

			}

			return isParentSame;
		}

		return false;
	}


	/**
	 * This method is used to check if the element having a specific XMI ID is belonging to Java class extending
	 * ReferableBaseObject
	 *
	 * @param refFile
	 *            File to which XML element is belonging to
	 * @param id
	 *            XMI ID of the XML element
	 *
	 * @param idElementsCacheMap
	 *            map containing cache of XML elements
	 * @param tags_refbaseObjectsMap
	 *            map containing the metadata information of Ecore (1.1.1)
	 * @return
	 */
	private Entry<Boolean, ElementRef> isElementOfRefBaseObject(final File refFile, final String id,
			final Map<File, Map<String, List<Element>>> idElementsCacheMap,
			final Map<String, List<XSDElement>> tags_refbaseObjectsMap) {

		final Map<String, List<Element>> map = idElementsCacheMap.get(refFile);

		if (map != null) {

			final List<Element> elements = map.get(id);

			if (elements != null) {

				for (final Element element2 : elements) {

					/*- ElementRef is a temporary class used to store the information of XML element */
					final ElementRef elementRef = elementRefBuilder(element2);

					final boolean result = isElementOfRefBaseObject(elementRef, tags_refbaseObjectsMap);

					if (result) {
						return new AbstractMap.SimpleEntry<Boolean, ElementRef>(true, elementRef);
					}

				}

			}
		}
		return new AbstractMap.SimpleEntry<Boolean, ElementRef>(false, null);
	}

	/**
	 * This method is used to remove the element from the XML Document
	 *
	 * @param values
	 *
	 *            Note: List<Element> consists of either<br>
	 *            1. value element which is the first sub-element of CustomProperties<br>
	 *            2. values element which is the second sub-element of CustomProperties (incase of List of RefObjects)
	 *            <br>
	 *
	 *
	 *            Case 1:
	 *
	 *            <customProperties xmi:id="_A0YGsBhQEea3AoorCOXNXA" key="custKey_abstractProcess">
	 *            <value xsi:type="common:ReferenceObject" xmi:id="_A0YGsRhQEea3AoorCOXNXA"> ------------------------->
	 *            This element is part of List <value href="default1.amxmi#_nDgKUNotEeWXsaNW2kxe8A" /> </value>
	 *            </customProperties>
	 *
	 *            Case 2:
	 *
	 *            <customProperties xmi:id="_NaacUBhfEea3AoorCOXNXA" key="custKey_group_refobjs">
	 *            <value xsi:type="common:ListObject" xmi:id="_8b8TkBhfEea3AoorCOXNXA">
	 *            <values xsi:type="common:ReferenceObject" xmi:id="__kW2ABhfEea3AoorCOXNXA"> ------------------------->
	 *            This element is part of List <value href="default1.amxmi#_nDgKUNotEeWXsaNW2kxe8A" /> </values>
	 *            <values xsi:type="common:ReferenceObject" xmi:id="__0BpsBhfEea3AoorCOXNXA">
	 *            <value href="default1.amxmi#_6PbocBhOEea3AoorCOXNXA" /> </values> </value> </customProperties>
	 *
	 *
	 *
	 */
	private void detachElements(final List<Element> values) {
		for (final Element element : values) {

			final String tag_name = element.getName();

			String key = "";

			if (tag_name.equals("value")) {
				key = element.getParentElement() != null ? element.getParentElement().getAttributeValue("key") : null;

			}
			else if (tag_name.equals("values")) {
				key = element.getParentElement() != null ? element.getParentElement().getParentElement() != null
						? element.getParentElement().getParentElement().getAttributeValue("key") : null : null;
			}


			if (key != null) {

				// TODO: log info/warning message using logger
				logger.info("Value of CustomProperty  : " + key
						+ " is removed (as it is not inheriting RefereableBaseObject)");
			}


			element.detach();
		}
	}

	/**
	 * This method is used to remove the element from the XML Document
	 *
	 * @param values
	 *            List<Element>
	 * @param type
	 *            String (e.g: hw:Memory)
	 *
	 *            Note: List<Element> consists of either<br>
	 *            1. value element which is the first sub-element of CustomProperties<br>
	 *            2. values element which is the second sub-element of CustomProperties (incase of List of RefObjects)
	 *            <br>
	 *
	 *
	 *            Case 1:
	 *
	 *            <customProperties xmi:id="_A0YGsBhQEea3AoorCOXNXA" key="custKey_abstractProcess">
	 *            <value xsi:type="common:ReferenceObject" xmi:id="_A0YGsRhQEea3AoorCOXNXA"> ------------------------->
	 *            This element is part of List <value href="default1.amxmi#_nDgKUNotEeWXsaNW2kxe8A" /> </value>
	 *            </customProperties>
	 *
	 *            Case 2:
	 *
	 *            <customProperties xmi:id="_NaacUBhfEea3AoorCOXNXA" key="custKey_group_refobjs">
	 *            <value xsi:type="common:ListObject" xmi:id="_8b8TkBhfEea3AoorCOXNXA">
	 *            <values xsi:type="common:ReferenceObject" xmi:id="__kW2ABhfEea3AoorCOXNXA"> ------------------------->
	 *            This element is part of List <value href="default1.amxmi#_nDgKUNotEeWXsaNW2kxe8A" /> </values>
	 *            <values xsi:type="common:ReferenceObject" xmi:id="__0BpsBhfEea3AoorCOXNXA">
	 *            <value href="default1.amxmi#_6PbocBhOEea3AoorCOXNXA" /> </values> </value> </customProperties>
	 *
	 *
	 *
	 */

	private void updateTypeForAllElements(final List<Element> values, final String type) {

		if (type == null) {
			return;
		}

		for (final Element element : values) {

			final Element child = element.getChild("value");

			if (child != null) {

				final String attributeValue = child.getAttributeValue("type", this.helper.getGenericNS("xsi"));

				if (attributeValue == null) {

					child.setAttribute("type", type, this.helper.getGenericNS("xsi"));
				}

			}
		}
	}

	/**
	 * This method is used to parse the text content (which has meta model info of elements extending
	 * ReferableBaseObjects and its parents)
	 *
	 * @return
	 */
	private Map<String, List<XSDElement>> populateInfoOfAmaltheModelTags_111_Content() {

		final Map<String, List<XSDElement>> map = new HashMap<String, List<XSDElement>>();


		/*-
		 * Text file contains the content in the following format (which replicates the containment relationship):
		 *
		 * swModel,sw:SWModel,labels,sw:Label,,
		 *
		 * Elements on the left side are the parents
		 */

		try (final InputStream inputStream = getInputStream();

				final BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));) {
			String inputLine;

			while ((inputLine = in.readLine()) != null) {

				final StringTokenizer tokenizer = new StringTokenizer(inputLine, ",");

				XSDElement parentElement = null;

				XSDElement processingElement = null;

				boolean isTagToProcess = true;
				boolean isTagTypeToProcess = false;

				while (tokenizer.hasMoreTokens()) {

					final String nextToken = tokenizer.nextToken();

					if (isTagToProcess) {
						processingElement = new XSDElement();
						processingElement.setName(nextToken);


						isTagToProcess = false;
						isTagTypeToProcess = true;
					}
					else if (isTagTypeToProcess && processingElement != null) {

						processingElement.setType(nextToken);


						if (!map.containsKey(processingElement.getName())) {

							map.put(processingElement.getName(), new ArrayList<XSDElement>());
							map.get(processingElement.getName()).add(processingElement);

						}
						else {

							final List<XSDElement> existingElements = map.get(processingElement.getName());

							boolean isElementWithSamePropsExisting = false;

							for (final XSDElement xsdElementRef : existingElements) {

								if ((processingElement.getName().equals(xsdElementRef.getName()))
										&& (processingElement.getType().equals(xsdElementRef.getType()))) {

									processingElement = xsdElementRef;

									isElementWithSamePropsExisting = true;
									break;

								}

							}

							if (!isElementWithSamePropsExisting) {
								map.get(processingElement.getName()).add(processingElement);
							}
						}

						if (parentElement != null) {
							processingElement.getParentRefs().add(parentElement);
						}

						parentElement = processingElement;

						isTagTypeToProcess = false;
						isTagToProcess = true;
					}

				}

			}
		}
		catch (final Exception e) {
			logger.error(e.getMessage(), e);
		}


		return map;
	}

	private InputStream getInputStream() throws FileNotFoundException, MalformedURLException, IOException {
		if (System.getProperty("junit:tags_Elements_ReferableBaseObject") != null) {

			final InputStream inputStream = new FileInputStream(
					new File(System.getProperty("junit:tags_Elements_ReferableBaseObject")));
			return inputStream;

		}
		final URL url = new URL(
				"platform:/plugin/org.eclipse.app4mc.amalthea.converters.common/resources/tags_Elements_ReferableBaseObject.txt");
		final InputStream inputStream = url.openConnection().getInputStream();
		return inputStream;

	}


	/**
	 * This method is used to take jdom2 Element node and return ElementRef object and its corresponding parent
	 * ElementRef's <br>
	 * Input string example: <StimuliModel><stimuli></stimuli></StimuliModel> <br>
	 * Result of this input : ElementRef (with name : stimuli) --> Parent ElementRef (with name : StimuliModel)
	 *
	 * @param node
	 * @return
	 */
	private ElementRef elementRefBuilder(final Element node) {

		final String tagName = node.getName();

		final ElementRef elementRef = new ElementRef();

		elementRef.setName(tagName);

		/*- element type from the XMI is fetched */
		elementRef.setType(node.getAttributeValue("type", this.helper.getGenericNS("xsi")));

		final ElementRef parentElementRef = addParentElementRef(node, elementRef);

		if (parentElementRef != null) {
			elementRef.setParentRef(parentElementRef);
		}
		return elementRef;

	}

	/**
	 * This method is used to create Parent ElementRef object for the supplied JDom node
	 *
	 * @param node
	 *            JDOM node element
	 * @param elementRef
	 *            ElementRef object for which parent should be created
	 * @return
	 */

	private static ElementRef addParentElementRef(final Element node, final ElementRef elementRef) {

		final Element parentElement = node.getParentElement();

		if (parentElement != null) {

			final String parentTagName = parentElement.getName()
					+ (parentElement.getNamespacePrefix() != null ? parentElement.getNamespacePrefix() : "");

			final ElementRef parentElementRef = new ElementRef();

			if (parentTagName.contains(":")) {
				parentElementRef.setType(parentTagName);
			}
			else {
				parentElementRef.setName(parentTagName);
			}


			return parentElementRef;
		}

		return null;
	}


	/**
	 * This method takes legacy URI fragment as an input and builds ElementRef object and its corresponding Parent
	 * ElementRef's
	 *
	 * Input string example: //@stimuliModel/@stimuli.0
	 *
	 * Result of this input : ElementRef (with name : stimuli) --> Parent ElementRef (with name : StimuliModel)
	 *
	 * @param refString
	 * @return
	 */
	private static ElementRef elementRefBuilder(final String refString) {

		ElementRef elementRef = null;

		ElementRef parentElementRef = null;


		final char[] charArray = refString.toCharArray();


		boolean isBuildingElement = false;

		final StringBuffer nameBuffer = new StringBuffer();

		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] == '/') {

				if (nameBuffer.length() > 0 && elementRef != null) {

					elementRef.setName(nameBuffer.toString());

					if (parentElementRef != null) {
						elementRef.setParentRef(parentElementRef);
					}

					parentElementRef = elementRef;

					nameBuffer.setLength(0);
				}

				isBuildingElement = false;

				// lookup for /@

				int lookUp = i + 1;


				if ((lookUp < charArray.length) && (charArray[lookUp] == '/')) {

					i++;

					lookUp = lookUp + 1;

					if ((lookUp < charArray.length) && (charArray[lookUp] == '@')) {
						i++;

						isBuildingElement = true;

						elementRef = new ElementRef();
					}

				}
				else if (charArray[lookUp] == '@') {

					i++;

					isBuildingElement = true;

					elementRef = new ElementRef();
				}

			}
			else if (charArray[i] == '.') {

				isBuildingElement = false;
			}
			else {

				if (isBuildingElement) {
					nameBuffer.append(charArray[i]);
				}
			}

		}

		if (nameBuffer.length() > 0 && elementRef != null) {

			elementRef.setName(nameBuffer.toString());

			if (parentElementRef != null) {
				elementRef.setParentRef(parentElementRef);
			}
			nameBuffer.setLength(0);

		}
		return elementRef;
	}

	/**
	 * This method is used to build the cache Map for the supplied XML Document objects
	 *
	 * @param fileName_documentsMap
	 * @param helper
	 * @return
	 */

	private Map<File, Map<String, List<Element>>> buildCache(final Map<File, Document> fileName_documentsMap,
			final AbstractHelper helper) {
		final Map<File, Map<String, List<Element>>> cacheMap = new HashMap<File, Map<String, List<Element>>>();

		for (final File targetFile : fileName_documentsMap.keySet()) {

			final Document root = fileName_documentsMap.get(targetFile);

			final List<Element> elements = helper.getXpathResult(root, ".//*[@xmi:id]", Element.class,
					helper.getGenericNS("xmi"));

			for (final Element element : elements) {
				final String id = element.getAttributeValue("id", helper.getGenericNS("xmi"));

				if (!cacheMap.containsKey(targetFile)) {
					cacheMap.put(targetFile, new HashMap<String, List<Element>>());
				}
				if (!cacheMap.get(targetFile).containsKey(id)) {
					cacheMap.get(targetFile).put(id, new ArrayList<Element>());
				}
				cacheMap.get(targetFile).get(id).add(element);

			}

		}
		return cacheMap;
	}

	/*
	 * If the input string is supplied as : "default.amxmi#_UZWXYOqLEeW9t73E3V9yAw"
	 */
	private boolean isURIFragment(final String string) {
		if (string.contains("#")) {
			return string.substring(string.indexOf("#") + 1).contains("/");
		}
		return string.contains("/");
	}

	/**
	 * This method is used to return File object based on the supplied content
	 *
	 * @param targetFile
	 * @param refFileInfoMap
	 * @param fileNameInfo
	 * @return
	 */
	protected File getRefFile(final File targetFile, final HashMap<String, File> refFileInfoMap,
			final String fileNameInfo) {

		File referredFile = null;

		if (!refFileInfoMap.containsKey(fileNameInfo)) {
			referredFile = new File(fileNameInfo);

			if (!referredFile.exists()) {
				referredFile = new File(targetFile.getParent(), fileNameInfo);


				if (!referredFile.exists()) {

					referredFile = null;

					System.err.println("Unable to find the referred file : " + fileNameInfo);

				}

			}

			refFileInfoMap.put(fileNameInfo, referredFile);
		}
		else {
			referredFile = refFileInfoMap.get(fileNameInfo);
		}

		return referredFile;

	}

}
