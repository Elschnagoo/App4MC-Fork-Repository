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
package org.eclipse.app4mc.amalthea.converters070.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters.common.postprocessor.FileNameUpdationProcessor;
import org.eclipse.app4mc.amalthea.converters.common.utils.NameSpace_070;
import org.eclipse.app4mc.amalthea.converters.common.utils.NameSpace_111;
import org.eclipse.app4mc.amalthea.converters070.utils.HelperUtils_111_070;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import com.google.common.io.Files;

public abstract class AbstractConverterTest {


	protected final Map<File, Document> fileName_documentsMap;

	protected HelperUtils_111_070 helper;

	protected final String inputXmlFilePath;
	
	protected final String outputXmlFilePath;

	protected final String xmlFileRelativeLocation;

	protected final boolean canExecuteTestCase;

	protected final String inputGlobalTestsDirectory = "./TestModels/input";

	protected final String outputGlobalTestsDirectory = "./TestModels/output";

	protected final String localOutputDirectory;


	public AbstractConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		this.inputXmlFilePath = this.inputGlobalTestsDirectory + File.separator + xmlFileRelativeLocation;
		this.outputXmlFilePath = this.outputGlobalTestsDirectory + File.separator + xmlFileRelativeLocation;
		this.canExecuteTestCase = canExecuteTestCase;
		this.xmlFileRelativeLocation = xmlFileRelativeLocation;
		this.fileName_documentsMap = new HashMap<File, Document>();
		this.localOutputDirectory = new File(this.outputGlobalTestsDirectory, this.xmlFileRelativeLocation).getParent();
	}

	public void parseInputXMLFiles() {
		
		
		System.out.println("Parsing input files");

		fileName_documentsMap.clear();
		if (!this.canExecuteTestCase) {
			return;
		}

		this.helper = HelperUtils_111_070.getInstance();

		try {

			this.helper.buildXMLDocumentsMap(new File(this.inputXmlFilePath), this.fileName_documentsMap);

		}
		catch (final Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	public void parseGeneratedXMLFiles() {
		
		
		System.out.println("Parsing generated files");

		fileName_documentsMap.clear();

		if (!this.canExecuteTestCase) {
			return;
		}

		this.helper = HelperUtils_111_070.getInstance();

		try {

			/*-
			 * Special handling for fetching the files is implemented as in certain cases, file extensions are updated during model migration 
			 */
			File targetFile = new File(this.outputXmlFilePath);
			if(!targetFile.exists()){
				String fileExtension = Files.getFileExtension(targetFile.getAbsolutePath());
				
				if(!fileExtension.equalsIgnoreCase("amxmi")){
					targetFile = new File(this.outputXmlFilePath+".amxmi");
				}
			}
			
			this.helper.buildXMLDocumentsMap(targetFile, this.fileName_documentsMap);

		}
		catch (final Exception e) {
			fail(e.getMessage());
		}
	}


	protected List<ICache> buildCaches() {
		final List<ICache> caches = new ArrayList<ICache>();


//		final ComponentModelRefsCacheBuilder componentModelChangesCacheBuilder = new ComponentModelRefsCacheBuilder();
//
//		final LabelValueProviderRefsCacheBuilder labelValueProviderRefsCacheBuilder = new LabelValueProviderRefsCacheBuilder();
//		
//		final ModeLabelsCacheBuilder modeLabelsCacheBuilder=new ModeLabelsCacheBuilder();
//
//		caches.add(componentModelChangesCacheBuilder);
//
//		caches.add(labelValueProviderRefsCacheBuilder);
//		
//		caches.add(modeLabelsCacheBuilder);
//
//		for (final ICache iCache : caches) {
//			iCache.buildCache(this.fileName_documentsMap);
//		}
		return caches;
	}


	@SafeVarargs
	final protected void invokeDependentConverters_ForAll_Files(final Set<File> files,
			final Map<File, Document> fileName_documentsMap, final List<ICache> caches, final Class<?>... converterClasss)
			throws InstantiationException, IllegalAccessException, Exception {

		if (converterClasss != null) {
			for (final Class<?> class1 : converterClasss) {

				if (IConverter.class.isAssignableFrom(class1)) {
					
					IConverter newInstance = (IConverter) class1.newInstance();
					for(File file: files){
						newInstance.convert(file, fileName_documentsMap, caches);
						
					}

				}
			}

		}
	}
	
	
	/**
	 * This method is used to verify if the AMALTHEA namespaces used in this document are of AMALTHEA 1.1.1 
	 * @param document
	 */
	protected void namespaceVerification(Document document) {
		List<Namespace> namespacesInScope = document.getRootElement().getNamespacesInScope();
		
		for (Namespace namespace : namespacesInScope) {

			String prefix = namespace.getPrefix();
			
			if(prefix.equals("xmlns")||prefix.equals("xmi")||prefix.equals("xsi")||prefix.equals("")||prefix.equals("xml")){
				continue;
			}
			boolean isAmaltheaNameSpacePrefix = this.helper.enumTypeContainsIn070(prefix);
			
			if(isAmaltheaNameSpacePrefix){
				boolean ns_AvailableIn_070 = this.helper.isNS_AvailableIn_070(namespace);
				
				assertTrue("Expected namespace from AMALTHEA 0.7.0 : "+ namespace.getURI()+"  --> "+ document.getBaseURI(),ns_AvailableIn_070);
				
			}else{
				assertTrue("Invalid namespace is present in AMALTHEA model file : " +namespace.getURI(), false);
			}
			
		}
	}

	/**
	 * This method is used to save all migrated files
	 * @throws Exception
	 */
	protected void saveMigratedFiles() throws Exception {
		
		saveFiles(true, this.localOutputDirectory);
 }
	
	private void saveFiles( 
			final boolean updateFileNames, String outputDirectoryLocation) throws Exception {

		new FileNameUpdationProcessor().process(this.fileName_documentsMap, helper);

		final List<File> outputFiles = new ArrayList<File>();

		final Set<File> keySet = fileName_documentsMap.keySet();

		for (final File inputFile : keySet) {

			String convertedFileName = inputFile.getName();

			if (updateFileNames) {
				// add amxmi extension to file names which do not have it (and are migrated to versions 1.1.1 or higher)

				final int indexOfDot = convertedFileName.lastIndexOf(".");

				final String extension = convertedFileName.substring(indexOfDot + 1);

				if (extension.startsWith("amxmi") && !extension.equals("amxmi")) {
					convertedFileName = convertedFileName + ".amxmi";
				}


			}

			File outputFile = null;

			if (outputDirectoryLocation != null && !outputDirectoryLocation.equals("")) {

				final String location = outputDirectoryLocation + File.separator + convertedFileName;
				this.helper.saveFile(fileName_documentsMap.get(inputFile), location, true, true);

				outputFile = new File(location);
				/*-adding new file path */
				outputFiles.add(outputFile);
			}
			else {
				final String location = inputFile.getParentFile().getAbsolutePath() + File.separator
						+ convertedFileName;
				this.helper.saveFile(fileName_documentsMap.get(inputFile), location, true, true);

				/*-adding new file path */

				outputFile = new File(location);
				outputFiles.add(outputFile);
			}

			System.out.println("File saved : " + outputFile.getAbsolutePath());
		}



	}
	
	@Rule public TestName testName = new TestName();
	  
	@Before
    public void before() {
        System.out.println("******************** Executing test case : "+ testName.getMethodName()+" *****************************");
    }
	
	@After
    public void after() {
		System.out.println("******************** Completed execution of test case :  "+ testName.getMethodName()+" *****************************");
    }
	
	/**
	 * This method is used to apply the Xpath and query the contents
	 * 
	 * Note: This mehtod is used only to query the Nodes, not the attributes
	 * @param element
	 * @param xpath
	 * @return
	 */
	protected List<Element> getXpathResult(Element element, String xpath ) {
		final StringBuffer xpathBuffer = new StringBuffer();
		xpathBuffer.append(
				xpath);

		List<Element> elements = this.helper.getXpathResult(element, xpathBuffer.toString(), Element.class , getNameSpaces());
		return elements;
	}

	private Namespace[] getNameSpaces() {
		Namespace xmiNs = this.helper.getGenericNS("xmi");

		Namespace xsiNs = this.helper.getGenericNS("xsi");
		
		List<Namespace> nsList=new ArrayList<Namespace>();
		
		nsList.add(xmiNs);
		
		nsList.add(xsiNs);
		
		NameSpace_111[] ns = NameSpace_111.values();

		for (NameSpace_111 namespace : ns) {
			
			nsList.add(this.helper.getNS_111(namespace.name()));
		}
		
		NameSpace_070[] ns1 = NameSpace_070.values();

		for (NameSpace_070 namespace : ns1) {
			
			nsList.add(this.helper.getNS_070(namespace.name()));
		}

	  Namespace[] array = nsList.toArray( new Namespace[]{});
		return array;
	}
	
	/**
	 * This method is used to apply the Xpath and query the contents
	 * 
	 * Note: This mehtod is used only to query the attributes, not the elements
	 * @param element
	 * @param xpath
	 * @return
	 */
	protected List<Attribute> getXpathResult_Attributes(Element element, String xpath) {
		final StringBuffer xpathBuffer = new StringBuffer();
		xpathBuffer.append(
				xpath);


		List<Attribute> attributes = this.helper.getXpathResult(element, xpathBuffer.toString(), Attribute.class,getNameSpaces());
		return attributes;
	}
	
	public void testConversion(Class<?>...classes ) {

		if (!this.canExecuteTestCase) {
			return;
		}
		try {

			parseInputXMLFiles();

			final List<ICache> caches = buildCaches();
			
				invokeDependentConverters_ForAll_Files( this.fileName_documentsMap.keySet(), this.fileName_documentsMap, caches,
						classes);

				saveMigratedFiles();
		}
		catch (final Exception e) {
			fail(e.getMessage());
		}
	}
	
	public void verification(){

		parseGeneratedXMLFiles();

		Collection<Document> values = this.fileName_documentsMap.values();
		
		for (Document document : values) {
			
			/*- verifying the namespace */
			namespaceVerification(document);
			
		}
		
	}
}
