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
package org.eclipse.app4mc.amalthea.converters.common.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.xpath.utils.BulkXpathOperation;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public abstract class AbstractAttributeRefCacheBuilder implements ICache {

	Map<File, Map<String, Object>> map = new HashMap<File, Map<String, Object>>();

	protected AbstractHelper helper;

	protected final Logger logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");

	@Override
	public Map<File, Map<String, Object>> getCacheMap() {
		return this.map;
	}

	@Override
	public void clearCacheMap() {
		this.map.clear();
	}

	/**
	 * This method is used to grab all Elements referred by legacy URI fragments and build a Map containing key as
	 * URIFragment and value as corresponding Element
	 *
	 * Expected keys:
	 *
	 * URIFRAGMENT_SCHEDULER_REFS_ATRIBUTES
	 *
	 * @param targetFile
	 * @param rootDocument
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected Map<String, Element> getAllElements_referred_by_URIFragments(final File targetFile,
			final Document rootDocument, final String URIFRAGMENT_ELEMENT_REFS_ATRIBUTES) {


		final Map<String, List<Attribute>> uriFragment_schedulerRefAttribsMap =

				(Map<String, List<Attribute>>) getCacheMap().get(targetFile).get(URIFRAGMENT_ELEMENT_REFS_ATRIBUTES);

		if (uriFragment_schedulerRefAttribsMap == null) {
			// TODO: log
			System.err.println("cache : \"" + URIFRAGMENT_ELEMENT_REFS_ATRIBUTES + "\" not populated");
			return new HashMap<String, Element>();
		}

		final Set<String> uriFragments = uriFragment_schedulerRefAttribsMap.keySet();

		final Map<String, Element> uriFragment_ElementsMap = getAllElements_referred_by_URIFragments(rootDocument,
				uriFragments);

		return uriFragment_ElementsMap;
	}

	// TODO:Use Xpath bulk operation
	protected Map<String, Element> getAllElements_referred_by_URIFragments(final Document rootDocument,
			final Set<String> uriFragments) {
		final Map<String, Element> uriFragment_ElementsMap = new HashMap<String, Element>();

		/*- temporary Map to store key as URIFragment and Vale as Xpath*/
		final Map<String, String> uriFragment_XpathStringMap = new HashMap<String, String>();

		/*- Map to store the result of */

		Map<String, List<Element>> xpath_ElementsMap = new HashMap<String, List<Element>>();


		for (final String uriFragment : uriFragments) {
			uriFragment_XpathStringMap.put(uriFragment, getXpathString(uriFragment));
		}

		/*- Bulk operation applied to fetch the JDOM Element's to improve the performance */
		final BulkXpathOperation bulkXpathOperation = new BulkXpathOperation();

		xpath_ElementsMap = bulkXpathOperation.invokeXpath(rootDocument, uriFragment_XpathStringMap.values(),
				this.helper);

		for (final String uriFragment : uriFragments) {

			if (!uriFragment_ElementsMap.containsKey(uriFragment)) {

				final String xpath = uriFragment_XpathStringMap.get(uriFragment);

				final List<Element> list = xpath_ElementsMap.get(xpath);

				if (list.size() > 0) {
					uriFragment_ElementsMap.put(uriFragment, list.get(0));
				}
				else {
					// TODO: log a WARNING message, as no objects are found for this URIFragment
					System.err.println("No references can be found for : " + uriFragment
							+ " corresponding Xpath used is : " + xpath);
				}
			}
		}
		return uriFragment_ElementsMap;
	}

	@SuppressWarnings("unchecked")
	protected void addAttributeTo_Href_URIFragment_Attributes_Cache(final File targetFile, final File refFile,
			final String uriFragment_with_fileInfo, final String fileNameInfo, final String localURIFragment,
			final Attribute attribute, final String HREF_URIFRAGMENT_ELEMENT_REFS_ATRIBUTES) {


		final Map<File, Table<String, String, List<Attribute>>> reffile_uriFragment_schedulerRefAttribsMap = ((Map<File, Table<String, String, List<Attribute>>>) getCacheMap()
				.get(targetFile).get(HREF_URIFRAGMENT_ELEMENT_REFS_ATRIBUTES));


		Table<String, String, List<Attribute>> table = reffile_uriFragment_schedulerRefAttribsMap.get(refFile);

		if (table == null) {
			table = HashBasedTable.create();
			reffile_uriFragment_schedulerRefAttribsMap.put(refFile, table);
		}

		List<Attribute> list = table.get(uriFragment_with_fileInfo, localURIFragment);

		if (list == null) {
			list = new ArrayList<Attribute>();

			table.put(uriFragment_with_fileInfo, localURIFragment, list);
		}

		list.add(attribute);

	}


	/**
	 * <pre>
	 * This method is used to get Xpath String from URIFragment
	 *
	 * Example: <br>
	 *
	 * Case 1:
	 * If input for this method is : //@osModel/@scheduler.0 <br>
	 * This method will return : //osModel/scheduler[0]
	 *
	 * Case 2:
	 *
	 * If input for this method is : //@osModel/@operatingSystems.0/@taskSchedulers.0
	 * This method will return : //osModel/operatingSystems[0]/taskSchedulers[0]
	 * </pre>
	 *
	 * @param uriFragment
	 * @return
	 */

	protected String getXpathString_old(String uriFragment) {

		uriFragment = uriFragment.replaceAll("@", "");

		if (uriFragment.contains(".")) {

			final int lastIndexOf = uriFragment.lastIndexOf(".");

			final String substring = uriFragment.substring(lastIndexOf + 1);

			try {

				/*- In EMF first element of array starts with index 0. And the same is used for URI fragment*/

				/*- In Xpath 1st element of array starts with index 1 */

				/*- Note: For conversion of URIFragment to Xpath, array index should be incremented by 1 */

				final int arrayIndex = Integer.parseInt(substring) + 1;

				uriFragment = uriFragment.substring(0, lastIndexOf) + "[" + arrayIndex + "]";

			}
			catch (final Exception e) {

				this.logger.error(
						"Exception occured during conversion of URIFragment : " + uriFragment + " to Xpath String", e);

				throw e;
			}
		}

		return uriFragment;
	}


	/**
	 * <pre>
	 * This method is used to get Xpath String from URIFragment
	 *
	 * Example: <br>
	 *
	 * Case 1:
	 * If input for this method is : //@osModel/@scheduler.0 <br>
	 * This method will return : //osModel/scheduler[0]
	 *
	 * Case 2:
	 *
	 * If input for this method is : //@osModel/@operatingSystems.0/@taskSchedulers.0
	 * This method will return : //osModel/operatingSystems[0]/taskSchedulers[0]
	 * </pre>
	 *
	 * @param uriFragment
	 * @return
	 */

	protected String getXpathString(String uriFragment) {

		uriFragment = uriFragment.replaceAll("@", "");

		if (uriFragment.contains(".")) {

			final char[] charArray = uriFragment.toCharArray();

			final StringBuffer xpathBuffer = new StringBuffer();

			boolean isBuildingIndex = false;

			StringBuffer indexBuffer = new StringBuffer();

			for (int i = 0; i < charArray.length; i++) {

				if (charArray[i] == '.') {

					xpathBuffer.append("[");

					isBuildingIndex = true;

					indexBuffer = new StringBuffer();

				}
				else if (isBuildingIndex && (charArray[i] == '/')) {

					addIndexToBuffer(xpathBuffer, indexBuffer);


					indexBuffer = new StringBuffer();

					xpathBuffer.append("]");

					xpathBuffer.append("/");
					isBuildingIndex = false;

				}

				else if (isBuildingIndex) {

					indexBuffer.append(charArray[i]);
				}
				else {
					xpathBuffer.append(charArray[i]);
				}

			}

			if (isBuildingIndex) {

				addIndexToBuffer(xpathBuffer, indexBuffer);

				xpathBuffer.append("]");
			}

			uriFragment = xpathBuffer.toString();
		}

		return uriFragment;
	}

	private void addIndexToBuffer(final StringBuffer xpathBuffer, final StringBuffer indexBuffer) {
		try {
			final long parseLong = Long.parseLong(indexBuffer.toString());

			/*-
			 *  TODO Add additional documentation : As Xpath index starts with 1 and EMF index starts with 0
			 *           ===> during the conversion of uri fragment to Xpath ==> index is incremented by 1
			 *
			 */
			xpathBuffer.append(parseLong + 1);

		}
		catch (final Exception e) {
			xpathBuffer.append(indexBuffer);

		}
	}

	/**
	 * This method is used to grab all the Attributes referring to legacy format of URI fragments and group them
	 * accordingly based on key as URIFragment
	 *
	 * @param rootDocument
	 * @return
	 */
	protected Map<String, List<Attribute>> getAllAttributes_containing_URIFragments(final Document rootDocument,
			final String xPath_for_attributes, final Namespace... nameSpaces) {

		final List<Attribute> schedulerAttributes = this.helper.getXpathResult(rootDocument, xPath_for_attributes,
				Attribute.class, nameSpaces);

		/*- map containing key as URIFragment and value as List of Attribute objects */
		final Map<String, List<Attribute>> uriFragment_AttributesMap = new HashMap<String, List<Attribute>>();


		for (final Attribute attribute : schedulerAttributes) {

			final String uriFragment = attribute.getValue();

			if (!uriFragment_AttributesMap.containsKey(uriFragment)) {
				uriFragment_AttributesMap.put(uriFragment, new ArrayList<Attribute>());
			}

			uriFragment_AttributesMap.get(uriFragment).add(attribute);
		}

		return uriFragment_AttributesMap;

	}

	/**
	 * <pre>
	 * xpath_elementtype_href_attribute :
	 *   ".//scheduler/@href[contains(., \"/\")]"
	 *
	 * </pre>
	 *
	 * @param targetFile
	 * @param rootDocument
	 * @param xpath_elementtype_href_attribute
	 */

	protected void populateAllHREF_ElementAttributes_having_legacy_URI_refs(final File targetFile,
			final Document rootDocument, final String xpath_elementtype_href_attribute,
			final String HREF_URIFRAGMENT_ELEMENT_REFS_ATRIBUTES, final Namespace... namespaces) {


		final List<Attribute> schedulerHrefs = this.helper.getXpathResult(rootDocument,
				xpath_elementtype_href_attribute, Attribute.class, namespaces);


		final HashMap<String, File> refFileInfoMap = new HashMap<String, File>();


		final Map<File, Table<String, String, List<Attribute>>> reffile_uriFragment_schedulerRefAttribsMap = new HashMap<File, Table<String, String, List<Attribute>>>();

		/*- Adding elements into Cache */
		getCacheMap().get(targetFile).put(HREF_URIFRAGMENT_ELEMENT_REFS_ATRIBUTES,
				reffile_uriFragment_schedulerRefAttribsMap);


		loop: for (final Attribute attribute : schedulerHrefs) {

			final String uriFragment_with_fileInfo = attribute.getValue();

			final int indexOfHash = uriFragment_with_fileInfo.indexOf("#");

			if (indexOfHash != -1) {
				final String fileNameInfo = uriFragment_with_fileInfo.substring(0, indexOfHash);

				final String localURIFragment = uriFragment_with_fileInfo.substring(indexOfHash + 1);

				// TODO:verify if the localURIFragment is of old format and not XMI ID

				if (localURIFragment.contains("//") == false) {
					// this is the case of UUID (XMI ID) being present as a reference. It is not required to store such
					// elements in the cache
					continue loop;
				}

				final File refFile = getRefFile(targetFile, refFileInfoMap, fileNameInfo);

				if (refFile != null) {

					addAttributeTo_Href_URIFragment_Attributes_Cache(targetFile, refFile, uriFragment_with_fileInfo,
							fileNameInfo, localURIFragment, attribute, HREF_URIFRAGMENT_ELEMENT_REFS_ATRIBUTES);
				}
				else {
					System.err.println("Skipping attribut with value : " + uriFragment_with_fileInfo);
				}

			}
		}
	}


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

	@SuppressWarnings("unchecked")
	protected void populate_All_UUID_Elements(final File targetFile, final Document rootDocument, final String xpath,
			final String UUID_ELEMENT, final Namespace... nameSpaces) {

		Map<String, Element> uuid_element_map = null;

		if (!getCacheMap().get(targetFile).containsKey(UUID_ELEMENT)) {
			uuid_element_map = new HashMap<String, Element>();
			getCacheMap().get(targetFile).put(UUID_ELEMENT, uuid_element_map);
		}
		else {
			uuid_element_map = (Map<String, Element>) getCacheMap().get(targetFile).get(UUID_ELEMENT);
		}

		final List<Element> elements = this.helper.getXpathResult(rootDocument, xpath, Element.class, nameSpaces);

		for (final Element element : elements) {

			final Attribute attribute = element.getAttribute("id", this.helper.getGenericNS("xmi"));

			if (attribute != null) {
				uuid_element_map.put(attribute.getValue(), element);
			}

		}

	}

	@SuppressWarnings("unchecked")
	protected void populate_All_Elements_With_Name(final File targetFile, final Document rootDocument,
			final String xpath, final String ELEMENT_NAME, final Namespace... nameSpaces) {

		Map<String, Element> name_element_map = null;

		if (!getCacheMap().get(targetFile).containsKey(ELEMENT_NAME)) {
			name_element_map = new HashMap<String, Element>();
			getCacheMap().get(targetFile).put(ELEMENT_NAME, name_element_map);
		}
		else {
			name_element_map = (Map<String, Element>) getCacheMap().get(targetFile).get(ELEMENT_NAME);
		}

		final List<Element> elements = this.helper.getXpathResult(rootDocument, xpath, Element.class, nameSpaces);

		for (final Element element : elements) {

			final Attribute attribute = element.getAttribute("name");

			if (attribute != null) {
				name_element_map.put(attribute.getValue(), element);
			}

		}

	}

	// TODO: optimize Xpath
	@SuppressWarnings("unchecked")
	protected void populate_AllElements_referred_by_hrefURIFragments(final File targetFile, final Document rootDocument,
			final Map<File, Document> fileName_documentsMap, final String HREF_URIFRAGMENT_ELEMENT_REFS_ATRIBUTES,
			final String HREF_URIFRAGMENT_ELEMENT) {

		final Map<File, Table<String, String, List<Attribute>>> reffile_uriFragment_schedulerRefAttribsMap = (Map<File, Table<String, String, List<Attribute>>>) getCacheMap()
				.get(targetFile).get(HREF_URIFRAGMENT_ELEMENT_REFS_ATRIBUTES);

		final Set<File> keySet = reffile_uriFragment_schedulerRefAttribsMap.keySet();

		/*- Result: gloabl uri fragment & JDOM Element mapping */
		final Map<String, Element> allElements_referred_by_URIFragments = new HashMap<String, Element>();

		getCacheMap().get(targetFile).put(HREF_URIFRAGMENT_ELEMENT, allElements_referred_by_URIFragments);

		/*- ===========new code ==============*/
		for (final File referencedFile : keySet) {

			/*- Fetching the corresponding Document object belonging to the referencedFile [Note: all Xpath's should be applied on this document ] */
			final Document targetDocument = fileName_documentsMap.get(referencedFile);

			/*-Below table contains Row as: GlobalURI Fragment, Column as : local URI Fragment, value as: List of attributes having global URI fragment */
			final Table<String, String, List<Attribute>> table = reffile_uriFragment_schedulerRefAttribsMap
					.get(referencedFile);

			/*- temporary Map to store key as local URIFragment and Vale as global URI Fragment*/
			final Map<String, String> local_uriFragment_global_uriFragment_Map = new HashMap<String, String>();

			/*- temporary Map to store key as local URIFragment and Vale as Xpath*/
			final Map<String, String> local_uriFragment_Xpath_Map = new HashMap<String, String>();

			/*- temporary Map to store key as Xpath and Vale as JDOM Elements which are obtained as result of this Xpath*/
			Map<String, List<Element>> xpath_ElementsMap = new HashMap<String, List<Element>>();


			for (final String row_globalURI : table.rowKeySet()) {
				/*- rowkey is global URI fragment */
				final Map<String, List<Attribute>> rowMap = table.row(row_globalURI);

				final Set<String> columns = rowMap.keySet();

				if (columns != null && columns.size() > 0) {
					// As there is one to one mapping between Global URI Fragments and local URI fragment associated to
					// it. Pick the first element

					for (final String column_localURI : columns) {
						/*- column_localURI is local URI fragment (i.e. without file name information) */

						local_uriFragment_global_uriFragment_Map.put(column_localURI, row_globalURI);

						/*- column_localURI is local URI fragment (i.e. without file name information) & value is the corresponding Xpath*/

						local_uriFragment_Xpath_Map.put(column_localURI, getXpathString(column_localURI));

					}
				}

			}

			/*- Bulk operation applied to fetch the JDOM Element's to improve the performance */
			final BulkXpathOperation bulkXpathOperation = new BulkXpathOperation();

			/*- supplying targetDcoument (JDOM Document object), Xpath's (obtained from local URI fragments) and helper class object */
			xpath_ElementsMap = bulkXpathOperation.invokeXpath(targetDocument, local_uriFragment_Xpath_Map.values(),
					this.helper);


			/*- now populating the resultsMap with the required data : i.e. Global URI fragment & JDOM Elements belonging to it */

			for (final String local_uri : local_uriFragment_Xpath_Map.keySet()) {

				final String xpath = local_uriFragment_Xpath_Map.get(local_uri);

				final String global_uri = local_uriFragment_global_uriFragment_Map.get(local_uri);

				final List<Element> elements = xpath_ElementsMap.get(xpath);

				if (elements.size() > 0) {

					allElements_referred_by_URIFragments.put(global_uri, elements.get(0));
				}
				else {
					// TODO: log error message stating element could not be found

					System.err.println("Element could not be found for URI : " + global_uri);

				}

			}

		}

	}
}
