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
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.filter.ElementFilter;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

import com.google.common.io.Files;

@SuppressWarnings("unchecked")
public abstract class AbstractHelper {

	public final Logger logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");

	public void addAdditionalNameSpace(final Element rootElement, final Namespace... namespaces) {

		for (final Namespace namespace2 : namespaces) {

			final List<Namespace> additionalNamespaces = rootElement.getAdditionalNamespaces();
			if (!additionalNamespaces.contains(namespace2)
					|| !isNameSpacePrefixExisting(additionalNamespaces, namespace2)) {

				rootElement.addNamespaceDeclaration(namespace2);
			}

		}
	}

	private boolean isNameSpacePrefixExisting(final List<Namespace> namespaces, final Namespace targetNameSpace) {

		for (final Namespace namespace : namespaces) {

			if (namespace.getPrefix().equals(targetNameSpace.getPrefix())) {
				return true;
			}
		}

		return false;

	}

	public boolean isNS_AvailableIn_082(final Namespace namespace) {

		if (namespace != null) {

			final String ns_prefix = namespace.getPrefix();

			final String ns_uri = namespace.getURI();

			if (enumTypeContainsIn082(ns_prefix)) {

				if (ns_uri.equals(NameSpace_082.valueOf(ns_prefix).getNSValue())) {
					return true;
				}
			}
		}

		return false;
	}

	
	
	public boolean isNS_AvailableIn_081(final Namespace namespace) {

		if (namespace != null) {

			final String ns_prefix = namespace.getPrefix();

			final String ns_uri = namespace.getURI();

			if (enumTypeContainsIn081(ns_prefix)) {

				if (ns_uri.equals(NameSpace_081.valueOf(ns_prefix).getNSValue())) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean isNS_AvailableIn_080(final Namespace namespace) {

		if (namespace != null) {

			final String ns_prefix = namespace.getPrefix();

			final String ns_uri = namespace.getURI();

			if (enumTypeContainsIn080(ns_prefix)) {

				if (ns_uri.equals(NameSpace_080.valueOf(ns_prefix).getNSValue())) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean isNS_AvailableIn_072(final Namespace namespace) {

		if (namespace != null) {

			final String ns_prefix = namespace.getPrefix();

			final String ns_uri = namespace.getURI();

			if (enumTypeContainsIn072(ns_prefix)) {

				if (ns_uri.equals(NameSpace_072.valueOf(ns_prefix).getNSValue())) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean isNS_AvailableIn_071(final Namespace namespace) {

		if (namespace != null) {

			final String ns_prefix = namespace.getPrefix();

			final String ns_uri = namespace.getURI();

			if (enumTypeContainsIn071(ns_prefix)) {

				if (ns_uri.equals(NameSpace_071.valueOf(ns_prefix).getNSValue())) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean isNS_AvailableIn_070(final Namespace namespace) {

		if (namespace != null) {

			final String ns_prefix = namespace.getPrefix();

			final String ns_uri = namespace.getURI();

			if (enumTypeContainsIn070(ns_prefix)) {

				if (ns_uri.equals(NameSpace_070.valueOf(ns_prefix).getNSValue())) {
					return true;
				}
			}
		}

		return false;
	}


	public boolean isNS_AvailableIn_111(final Namespace namespace) {

		if (namespace != null) {

			final String ns_prefix = namespace.getPrefix();

			final String ns_uri = namespace.getURI();

			if (enumTypeContainsIn111(ns_prefix)) {

				if (ns_uri.equals(NameSpace_111.valueOf(ns_prefix).getNSValue())) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean isNS_AvailableIn_110(final Namespace namespace) {

		if (namespace != null) {

			final String ns_prefix = namespace.getPrefix();

			final String ns_uri = namespace.getURI();

			if (enumTypeContainsIn110(ns_prefix)) {

				if (ns_uri.equals(NameSpace_110.valueOf(ns_prefix).getNSValue())) {
					return true;
				}
			}
		}

		return false;
	}


	public boolean isNS_AvailableIn_103(final Namespace namespace) {

		if (namespace != null) {

			final String ns_prefix = namespace.getPrefix();

			final String ns_uri = namespace.getURI();

			if (enumTypeContainsIn103(ns_prefix)) {

				if (ns_uri.equals(NameSpace_103.valueOf(ns_prefix).getNSValue())) {
					return true;
				}
			}
		}

		return false;
	}

	public Namespace getNS_111(final String prefix) {

		if (enumTypeContainsIn111(prefix)) {
			return Namespace.getNamespace(prefix, NameSpace_111.valueOf(prefix).getNSValue());
		}

		return Namespace.getNamespace("", "");
	}


	public Namespace getNS_110(final String prefix) {

		if (enumTypeContainsIn110(prefix)) {
			return Namespace.getNamespace(prefix, NameSpace_110.valueOf(prefix).getNSValue());
		}

		return Namespace.getNamespace("", "");
	}


	public Namespace getNS_103(final String prefix) {

		if (enumTypeContainsIn103(prefix)) {
			return Namespace.getNamespace(prefix, NameSpace_103.valueOf(prefix).getNSValue());
		}

		return Namespace.getNamespace("", "");
	}

	public Namespace getNS_070(final String prefix) {

		if (enumTypeContainsIn070(prefix)) {
			return Namespace.getNamespace(prefix, NameSpace_070.valueOf(prefix).getNSValue());
		}

		return Namespace.getNamespace("", "");
	}

	public Namespace getNS_071(final String prefix) {

		if (enumTypeContainsIn071(prefix)) {
			return Namespace.getNamespace(prefix, NameSpace_071.valueOf(prefix).getNSValue());
		}

		return Namespace.getNamespace("", "");
	}

	public Namespace getNS_072(final String prefix) {

		if (enumTypeContainsIn072(prefix)) {
			return Namespace.getNamespace(prefix, NameSpace_072.valueOf(prefix).getNSValue());
		}

		return Namespace.getNamespace("", "");
	}

	public Namespace getNS_080(final String prefix) {

		if (enumTypeContainsIn080(prefix)) {
			return Namespace.getNamespace(prefix, NameSpace_080.valueOf(prefix).getNSValue());
		}

		return Namespace.getNamespace("", "");
	}

	public Namespace getNS_081(final String prefix) {

		if (enumTypeContainsIn081(prefix)) {
			return Namespace.getNamespace(prefix, NameSpace_081.valueOf(prefix).getNSValue());
		}

		return Namespace.getNamespace("", "");
	}
	
	public Namespace getNS_082(final String prefix) {

		if (enumTypeContainsIn082(prefix)) {
			return Namespace.getNamespace(prefix, NameSpace_082.valueOf(prefix).getNSValue());
		}

		return Namespace.getNamespace("", "");
	}

	public boolean enumTypeContainsIn110(final String s) {
		try {
			NameSpace_110.valueOf(s);
		}
		catch (final IllegalArgumentException iae) {
			return false;
		}
		return true;
	}


	public boolean enumTypeContainsIn103(final String s) {
		try {
			NameSpace_103.valueOf(s);
		}
		catch (final IllegalArgumentException iae) {
			return false;
		}
		return true;
	}

	public boolean enumTypeContainsIn111(final String s) {
		try {
			NameSpace_111.valueOf(s);
		}
		catch (final IllegalArgumentException iae) {
			return false;
		}
		return true;
	}


	public boolean enumTypeContainsIn070(final String s) {
		try {
			NameSpace_070.valueOf(s);
		}
		catch (final IllegalArgumentException iae) {
			return false;
		}
		return true;
	}

	public boolean enumTypeContainsIn071(final String s) {
		try {
			NameSpace_071.valueOf(s);
		}
		catch (final IllegalArgumentException iae) {
			return false;
		}
		return true;
	}

	public boolean enumTypeContainsIn072(final String s) {
		try {
			NameSpace_072.valueOf(s);
		}
		catch (final IllegalArgumentException iae) {
			return false;
		}
		return true;
	}

	public boolean enumTypeContainsIn080(final String s) {
		try {
			NameSpace_080.valueOf(s);
		}
		catch (final IllegalArgumentException iae) {
			return false;
		}
		return true;
	}

	public boolean enumTypeContainsIn081(final String s) {
		try {
			NameSpace_081.valueOf(s);
		}
		catch (final IllegalArgumentException iae) {
			return false;
		}
		return true;
	}

	public boolean enumTypeContainsIn082(final String s) {
		try {
			NameSpace_082.valueOf(s);
		}
		catch (final IllegalArgumentException iae) {
			return false;
		}
		return true;
	}
	
	public Namespace getGenericNS(final String prefix) {

		if ("xsi".equals(prefix)) {

			return (Namespace.getNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance"));
		}
		else if ("xmi".equals(prefix)) {

			return (Namespace.getNamespace("xmi", "http://www.omg.org/XMI"));
		}

		return Namespace.getNamespace("", "");
	}

	/**
	 * This method is used to copy the root namespace and additional namespaces from the source element and set them to
	 * the target element
	 *
	 * @param source
	 *            Element. Containing root namespace and additional namespaces
	 * @param target
	 *            Element. This element should be populated with the root namespace and additional namespaces
	 */
	public void copyAllNameSpaces(final Element source, final Element target) {

		final Namespace namespace = source.getNamespace();
		/*-setting target namespace */
		target.setNamespace(namespace);

		final List<Namespace> additionalNamespaces = source.getAdditionalNamespaces();

		for (final Namespace additionalNS : additionalNamespaces) {

			/*-setting additional namespace */

			target.addNamespaceDeclaration(additionalNS);
		}


	}


	public <T> List<T> getXpathResult(final Document document, final String xpath, final Class<T> expectedType,
			final Namespace... nameSpaces) {

		final XPathFactory xpfac = XPathFactory.instance();

		if (Attribute.class.isAssignableFrom(expectedType)) {
			final XPathExpression<Attribute> xp = xpfac.compile(xpath, Filters.attribute(), null, nameSpaces);

			return ((List<T>) xp.evaluate(document));

		}
		else if (Element.class.isAssignableFrom(expectedType)) {
			final XPathExpression<Element> xp = xpfac.compile(xpath, Filters.element(), null, nameSpaces);

			return ((List<T>) xp.evaluate(document));

		}
		return null;
	}


	public <T> List<T> getXpathResult(final Element element, final String xpath, final Class<T> expectedType,
			final Namespace... nameSpaces) {

		final XPathFactory xpfac = XPathFactory.instance();

		if (Attribute.class.isAssignableFrom(expectedType)) {
			final XPathExpression<Attribute> xp = xpfac.compile(xpath, Filters.attribute(), null, nameSpaces);

			return ((List<T>) xp.evaluate(element));

		}
		else if (Element.class.isAssignableFrom(expectedType)) {
			final XPathExpression<Element> xp = xpfac.compile(xpath, Filters.element(), null, nameSpaces);

			return ((List<T>) xp.evaluate(element));

		}
		return null;
	}

	public Document loadFile(final String path) throws Exception {

		final long start = System.currentTimeMillis();
		final File file = new File(path);

		final SAXBuilder sax = new SAXBuilder();

		Document doc;
		try {
			doc = sax.build(file);
		}
		catch (JDOMException | IOException e) {

			if (e instanceof JDOMException) {
				throw new JDOMException("Error occured while parsing file : " + path, e);
			}

			throw e;
		}

		final long end = System.currentTimeMillis();

		// throw new JDOMParseException("E");

		this.logger.info("Total time taken to load file :" + path + " : " + (end - start) + " milli seconds");

		return doc;
	}

	public void printContentsOnConsole(final Document doc) throws Exception {
		final XMLOutputter xout = new XMLOutputter(Format.getPrettyFormat());

		xout.output(doc, System.out);

	}


	public void saveFile(final Document doc, final String outputFilePath, final boolean prettyPrintXml)
			throws Exception {

		saveFile(doc, outputFilePath, prettyPrintXml, false);
	}

	public void saveFile(final Document doc, final String outputFilePath, final boolean prettyPrintXml,
			final boolean force) throws Exception {

		XMLOutputter xout;

		if (prettyPrintXml) {
			xout = new XMLOutputter(Format.getPrettyFormat());
		}
		else {

			xout = new XMLOutputter();
		}

		final File file = new File(outputFilePath);

		if (force && !file.exists()) {

			file.getParentFile().mkdirs();
		}


		try (FileOutputStream out = new FileOutputStream(file)) {
			xout.output(doc, out);
		}
		catch (final Exception e) {

			this.logger.error("Error occured during saving file : " + file, e);

			throw e;
		}
	}


	public void saveFile(final Document doc, final File outputFile, final boolean prettyPrintXml) throws Exception {
		saveFile(doc, outputFile, prettyPrintXml, false);
	}


	public void saveFile(final Document doc, final File outputFile, final boolean prettyPrintXml, final boolean force)
			throws Exception {

		XMLOutputter xout;

		if (prettyPrintXml) {
			xout = new XMLOutputter(Format.getPrettyFormat());
		}
		else {

			xout = new XMLOutputter();
		}

		if (force && !outputFile.exists()) {

			outputFile.getParentFile().mkdirs();
		}

		try (FileOutputStream out = new FileOutputStream(outputFile);) {
			xout.output(doc, out);
		}
		catch (final Exception e) {
			this.logger.error("Error occured during saving file : " + outputFile.getAbsolutePath(), e);
			throw e;
		}
	}


	/**
	 * This method is used to remove default namespace and standard additional namespaces.. along with xmi:version
	 * attribute
	 *
	 * @param element
	 */
	public void removeDefaultAttribs(final Element element) {
		element.setNamespace(null);
		element.removeNamespaceDeclaration(Namespace.getNamespace("http://www.omg.org/XMI"));
		element.removeNamespaceDeclaration(Namespace.getNamespace("http://www.w3.org/2001/XMLSchema-instance"));
		element.removeAttribute("version", Namespace.getNamespace("xmi", "http://www.omg.org/XMI"));

	}

	/**
	 * This method is used to build a Map containing File (canonical file) as a Key and Value as org.jdom2.Document
	 * objects. How it works :
	 *
	 * As a first step:
	 *
	 * This method is called for the file which should be migrated from one version to the other
	 *
	 * - Internally all the model file's which are referenced are fetched, and this method is called recursively for
	 * each referenced model file -> Goal of this method is to have a single map where all the required File's and
	 * corresponding org.jdom2.Document objects are available
	 *
	 * @param targetFile
	 * @param map
	 * @throws Exception
	 */
	public void buildXMLDocumentsMap(final File targetFile, final Map<File, Document> map) throws Exception {

		if (map.containsKey(targetFile.getCanonicalFile())) {
			return;
		}

		if (!targetFile.exists()) {
			this.logger.error("Referred file does not exists : " + targetFile.getAbsolutePath());
			return;
		}

		if (!Files.getFileExtension(targetFile.getAbsolutePath()).contains("amxmi")) {
			this.logger.info("Non amalthea files will not be considered for model migration");
			return;
		}
		final Document xmlDoc = loadFile(targetFile.getAbsolutePath());

		map.put(targetFile.getCanonicalFile(), xmlDoc);

		final List<Attribute> hrefs = getXpathResult(xmlDoc.getRootElement(), ".//@href", Attribute.class);

		final Set<String> referredFilePaths = new HashSet<String>();

		for (final Attribute attribute : hrefs) {

			final String value = attribute.getValue();

			if (value.startsWith("amlt:/")) {
				/*- files are referred using the new Amalthea protocol provider */

				/*- From 1.1.1, as the model scope is set as Folder. All the amxmi files present in the folder should be considered */

				final File[] allFilesInDirectory = targetFile.getParentFile().listFiles(new FilenameFilter() {

					@Override
					public boolean accept(final File arg0, final String arg1) {

						if (arg1.endsWith(".amxmi")) {
							return true;
						}
						return false;
					}
				});

				for (final File file : allFilesInDirectory) {
					buildXMLDocumentsMap(file, map);
				}

				continue;
			}

			final int index = value.lastIndexOf("#");

			if (index != -1) {

				final String fileName = value.substring(0, index);

				referredFilePaths.add(fileName);

			}
		}

		for (final String relativePath : referredFilePaths) {

			if (relativePath != null && relativePath.length() > 0) {

				buildXMLDocumentsMap(new File(targetFile.getParent() + File.separator + relativePath), map);
			}

		}

	}

	/**
	 * This method is used to fetch the org.jdom2.Document object from the map containing all the Files to be migrated.
	 *
	 * @param map
	 *            -> containing key as File (Canonical file) of Amalthea models, value as org.jdom2.Document objects
	 * @param workingDirectory
	 *            -> location where the file to be migrated is present
	 * @param relativeFilePath
	 *            -> relative path of the referenced file from the working directory
	 * @return org.jdom2.Document object
	 * @throws Exception
	 */

	public Document getDocument(final Map<File, Document> map, final String workingDirectory,
			final String relativeFilePath) throws Exception {

		final File file = new File(workingDirectory + File.separator + relativeFilePath);

		if (file.exists()) {
			return map.get(file.getCanonicalFile());
		}

		return null;
	}

	public HrefElement getHrefElement(final String href) {

		final int index = href.lastIndexOf("#");

		if (index != -1) {

			final String fileName = href.substring(0, index);

			final String xmiID = href.substring(index + 1);

			return new HrefElement(fileName, xmiID);

		}

		return null;

	}

	/*-
	 * - In EMF for building the URL fragment, element type is used for generation of the index
	 *
	 * example:
	 *
	 *Inside Component model tag, there can be n number of components and n number of system elements.
	 *
	 *For generation of URL fragment for "systems" Element, index of it inside the parent should  not be considered, rather its index inside parent among the elements of its type should be considered
	 *
	 * componentsModel
	 *  - components
	 *  - components
	 *  - systems
	 *
	 * @param parent
	 *
	 * @param targetElement
	 *
	 * @return
	 */

	private int getIndexOfElementForURIFragment(final Element parent, final Element targetElement) {

		final List<Element> childElements = parent.getContent(new ElementFilter());


		final Map<String, List<Element>> map = new HashMap<String, List<Element>>();

		for (final Element element : childElements) {

			final String tagName = element.getName();

			if (!map.containsKey(tagName)) {

				map.put(tagName, new ArrayList<Element>());
			}

			map.get(tagName).add(element);

		}

		// verifying if tagetElement is present

		if (map.containsKey(targetElement.getName())) {
			final List<Element> list = map.get(targetElement.getName());
			return list.indexOf(targetElement);
		}

		return -1;
	}

	public String getURIFragment(final Element element, final ModelVersion modelVersion) {

		/*- element is Sheduler */

		final Stack<Object> stack = new Stack<Object>();

		final Element parent = element.getParentElement();
		String uriFragment = "//";

		if (parent != null) {
			/*- Index of Scheduler element in the Parent container */

			String elementSuffix = "";

			if (SchemaUtils.isMultiOccuranceElement(element.getName(), modelVersion)) {

				/*- As the JDOM2 element indexOf() method, also considers Text element and Nodes into consideration -> it is not used here
				 *
				 * Info: indexOf(element) method is internally using element.getContents() -> which is a List of both Text & Element's
				 *
				 * In the below code, the same list is used with a Elements filter and then indexOf(element) is used to find the elements index
				 * */


				final int indexOf = getIndexOfElementForURIFragment(parent, element);// parent.getContent(new
																						// ElementFilter()).indexOf(element);

				elementSuffix = "." + indexOf;

			}


			/*- building EMF URI fragment stub for Scheduler */

			/*- Substracting 1 from index, to make it URIFragment compaible */

			if (parent.getQualifiedName().equals("xmi:XMI")) {

				final int indexOf = getIndexOfElementForURIFragment(parent, element);// parent.getContent(new
																						// ElementFilter()).indexOf(element);

				uriFragment = "/" + indexOf;
			}
			else {

				stack.push(element.getName() + elementSuffix);

				populateStack(parent, stack, modelVersion);
			}

		}


		while (!stack.empty()) {

			uriFragment = uriFragment + "@" + stack.pop() + "/";
		}


		if (uriFragment.endsWith("/")) {
			uriFragment = uriFragment.substring(0, uriFragment.lastIndexOf("/"));
		}

		return uriFragment;
	}


	private void populateStack(final Element element, final Stack<Object> st, final ModelVersion modelVersion) {


		final Element parentElement = element.getParentElement();

		if (parentElement != null) {

			String elementSuffix = "";

			if (SchemaUtils.isMultiOccuranceElement(element.getName(), modelVersion)) {
				final int indexOf = getIndexOfElementForURIFragment(parentElement, element);// parentElement.getContent(new
																							// ElementFilter()).indexOf(element);

				elementSuffix = "." + indexOf;

			}

			st.push(element.getName() + elementSuffix);

			populateStack(parentElement, st, modelVersion);
		}
	}
	
	public String encodeName(final String name) {
		if (name == null || name.length() == 0) {
			return "no-name";
		}

		String result;
		try {
			result = URLEncoder.encode(name, StandardCharsets.UTF_8.toString());
		}
		catch (final UnsupportedEncodingException e) {
			result = name; // keep old name - we have no better option
		}
		return result;
	}
	
	public String decodeName(final String name) {
		if (name == null || name.length() == 0) {
			return "no-name";
		}

		String result;
		try {
			result = URLDecoder.decode(name, StandardCharsets.UTF_8.toString());
		}
		catch (final UnsupportedEncodingException e) {
			result = name; // keep old name - we have no better option
		}
		return result;
	}
}
