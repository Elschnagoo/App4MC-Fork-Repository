/*********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters110.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters110.utils.HelperUtils_103_110;
import org.eclipse.app4mc.amalthea.converters110.utils.ProcessCacheBuilder;
import org.eclipse.app4mc.amalthea.converters110.utils.SchedulerCacheBuilder;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;


public abstract class AbstractConverterTest {


	protected final Map<File, Document> fileName_documentsMap;

	protected HelperUtils_103_110 helper;

	protected final String inputXmlFilePath;

	protected final String outputXmlFilePath;

	protected final String xmlFileRelativeLocation;

	protected final boolean canExecuteTestCase;

	protected final String inputGlobalTestsDirectory = "./TestModels/input";

	protected final String outputGlobalTestsDirectory = "./TestModels/output";

	protected final String localOutputDirectory;

	protected final Logger logger;

	public AbstractConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		this.inputXmlFilePath = this.inputGlobalTestsDirectory + File.separator + xmlFileRelativeLocation;
		this.outputXmlFilePath = this.outputGlobalTestsDirectory + File.separator + xmlFileRelativeLocation;
		this.canExecuteTestCase = canExecuteTestCase;
		this.xmlFileRelativeLocation = xmlFileRelativeLocation;
		this.fileName_documentsMap = new HashMap<File, Document>();
		this.localOutputDirectory = new File(this.outputGlobalTestsDirectory, this.xmlFileRelativeLocation).getParent();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea");
		this.logger.addAppender(new ConsoleAppender(new PatternLayout("%d{ISO8601} %-5p [%c]: %m%n")));
		this.logger.setLevel(Level.ERROR);
	}


	public void testConversion(final Class<?>... classes) {

		if (!this.canExecuteTestCase) {
			return;
		}
		try {

			parseInputXMLFiles();

			final List<ICache> caches = buildCaches();

			invokeDependentConverters_ForAll_Files(this.fileName_documentsMap.keySet(), this.fileName_documentsMap,
					caches, classes);

			saveMigratedFiles();
		}
		catch (final Exception e) {
			fail(e.getMessage());
		}
	}

	public void verification() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying the namespace */
			namespaceVerification(document);

		}

	}


	public void parseInputXMLFiles() {


		this.logger.info("Parsing input files");

		this.fileName_documentsMap.clear();
		if (!this.canExecuteTestCase) {
			return;
		}

		this.helper = HelperUtils_103_110.getInstance();

		try {

			this.helper.buildXMLDocumentsMap(new File(this.inputXmlFilePath), this.fileName_documentsMap);

		}
		catch (final Exception e) {
			fail(e.getMessage());
		}
	}


	public void parseGeneratedXMLFiles() {

		this.logger.info("Parsing generated files");

		this.fileName_documentsMap.clear();

		if (!this.canExecuteTestCase) {
			return;
		}

		this.helper = HelperUtils_103_110.getInstance();

		try {

			this.helper.buildXMLDocumentsMap(new File(this.outputXmlFilePath), this.fileName_documentsMap);

		}
		catch (final Exception e) {
			fail(e.getMessage());
		}
	}


	protected List<ICache> buildCaches() {
		final List<ICache> caches = new ArrayList<ICache>();


		final SchedulerCacheBuilder schedulerCacheBuilder = new SchedulerCacheBuilder();

		final ProcessCacheBuilder processCacheBuilder = new ProcessCacheBuilder();

		caches.add(schedulerCacheBuilder);
		caches.add(processCacheBuilder);

		for (final ICache iCache : caches) {
			iCache.buildCache(this.fileName_documentsMap);
		}
		return caches;
	}

	@SafeVarargs
	final protected void invokeDependentConverters_ForAll_Files(final Set<File> files,
			final Map<File, Document> fileName_documentsMap, final List<ICache> caches,
			final Class<?>... converterClasss) throws InstantiationException, IllegalAccessException, Exception {

		if (converterClasss != null) {
			for (final Class<?> class1 : converterClasss) {

				if (IConverter.class.isAssignableFrom(class1)) {

					for (final File file : files) {
						((IConverter) class1.newInstance()).convert(file, fileName_documentsMap, caches);

					}

				}
			}

		}
	}


	/**
	 * This method is used to verify if the AMALTHEA namespaces used in this document are of AMALTHEA 1.1.0
	 *
	 * @param document
	 */
	protected void namespaceVerification(final Document document) {
		final List<Namespace> namespacesInScope = document.getRootElement().getNamespacesInScope();

		for (final Namespace namespace : namespacesInScope) {

			final String prefix = namespace.getPrefix();

			final boolean isAmaltheaNameSpacePrefix = this.helper.enumTypeContainsIn110(prefix);

			if (isAmaltheaNameSpacePrefix) {
				final boolean ns_AvailableIn_110 = this.helper.isNS_AvailableIn_110(namespace);

				assertTrue("Expected namespace from AMALTHEA 1.1.0 : " + namespace.getURI() + "  --> "
						+ document.getBaseURI(), ns_AvailableIn_110);

			}

		}
	}

	/**
	 * This method is used to save all migrated files
	 *
	 * @throws Exception
	 */
	protected void saveMigratedFiles() throws Exception {
		final Set<File> keySet = this.fileName_documentsMap.keySet();

		for (final File file : keySet) {
			this.helper.saveFile(this.fileName_documentsMap.get(file),
					this.localOutputDirectory + File.separator + file.getName(), true, true);
		}
	}

	@Rule
	public TestName testName = new TestName();

	@Before
	public void before() {
		this.logger.info("******************** Executing test case : " + this.testName.getMethodName()
				+ " *****************************");
	}

	@After
	public void after() {
		this.logger.info("******************** Completed execution of test case :  " + this.testName.getMethodName()
				+ " *****************************");
	}

	/**
	 * This method is used to apply the Xpath and query the contents
	 *
	 * Note: This mehtod is used only to query the Nodes, not the attributes
	 *
	 * @param element
	 * @param xpath
	 * @return
	 */
	protected List<Element> getXpathResult(final Element element, final String xpath) {
		final StringBuffer xpathBuffer = new StringBuffer();
		xpathBuffer.append(xpath);


		final List<Element> elements = this.helper.getXpathResult(element, xpathBuffer.toString(), Element.class,
				this.helper.getNS_110("central"), this.helper.getGenericNS("xsi"));
		return elements;
	}
}
