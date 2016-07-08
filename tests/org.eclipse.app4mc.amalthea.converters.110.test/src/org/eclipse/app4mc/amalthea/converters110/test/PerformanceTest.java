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
package org.eclipse.app4mc.amalthea.converters110.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.eclipse.app4mc.amalthea.converters.common.postprocessor.CustomPropsPostProcessor;
import org.eclipse.app4mc.amalthea.converters110.impl.CommonsConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.ComponentsConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.ConfigConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.ConstraintsConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.EventsConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.MappingConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.OsConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.PropertyConstraintsConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.SchedulerRefsConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.StimuliConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.SwConverter;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class PerformanceTest extends AbstractConverterTest {

	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/performance/amalthea.amxmi", true } });
	}

	public PerformanceTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConverter() {

		super.testConversion(OsConverter.class, SwConverter.class, SchedulerRefsConverter.class, MappingConverter.class,
				HwConverter.class, CommonsConverter.class, ComponentsConverter.class, StimuliConverter.class,
				PropertyConstraintsConverter.class, EventsConverter.class, ConstraintsConverter.class,
				ConfigConverter.class);

	}

	@Override
	@Test
	public void verification() {
		super.verification();

	}


	@Test
	public void testConverter_CustomPropsCheck_RefBaseObject() {

		if (!this.canExecuteTestCase) {
			return;
		}
		try {

			parseGeneratedXMLFiles();

			System.setProperty("junit:tags_Elements_ReferableBaseObject", this.inputGlobalTestsDirectory
					+ File.separator + "/performance/tags_Elements_ReferableBaseObject.txt");

			final CustomPropsPostProcessor customPropsPostProcessor = new CustomPropsPostProcessor();

			customPropsPostProcessor.process(this.fileName_documentsMap, this.helper);

			final Set<File> keySet = this.fileName_documentsMap.keySet();

			for (final File file : keySet) {
				this.helper.saveFile(this.fileName_documentsMap.get(file),
						this.localOutputDirectory + File.separator + file.getName(), true, true);
			}

		}
		catch (final Exception e) {
			fail(e.getMessage());
		}
	}

	public void testConverter_manual() {

		if (!this.canExecuteTestCase) {
			return;
		}
		try {

			parseInputXMLFiles();

			final Document rootDocument = this.fileName_documentsMap
					.get((new File(this.inputXmlFilePath).getCanonicalFile()));

			Timer.start();

			final List<Attribute> schedulerHrefs = this.helper.getXpathResult(rootDocument, ".//scheduler/@href",
					Attribute.class);

			System.out.println(".//scheduler/@href " + schedulerHrefs.size());

			Timer.end("xpath for scheduler href");

			Timer.start();

			final List<Attribute> schedulerRefs = this.helper.getXpathResult(rootDocument,
					".//@scheduler[contains(., \"/\")]", Attribute.class);

			System.out.println(".//@scheduler " + schedulerRefs.size());

			Timer.end("Time taken for scheduler attributes");

			Timer.start();

			processSchedulerAttributes(schedulerRefs, rootDocument);

			Timer.end("Building uri fragments map");

			final Set<File> keySet = this.fileName_documentsMap.keySet();

			for (final File file : keySet) {
				this.helper.saveFile(this.fileName_documentsMap.get(file),
						this.localOutputDirectory + File.separator + file.getName(), true, true);
			}
		}
		catch (final Exception e) {
			fail(e.getMessage());
		}
	}

	public void processSchedulerAttributes(final List<Attribute> schedulerAttributes, final Document doc) {

		/*- map containing key as URIFragment and value as List of Attribute objects */
		final Map<String, List<Attribute>> uriFragment_AttributesMap = new HashMap<String, List<Attribute>>();

		for (final Attribute attribute : schedulerAttributes) {

			final String uriFragment = attribute.getValue();

			if (!uriFragment_AttributesMap.containsKey(uriFragment)) {
				uriFragment_AttributesMap.put(uriFragment, new ArrayList<Attribute>());
			}

			uriFragment_AttributesMap.get(uriFragment).add(attribute);
		}

		/*- map containing key as URIFragment and value as List of Element objects */

		System.out.println("unique uri fragments : " + uriFragment_AttributesMap.keySet());

		final Map<String, List<Element>> uriFragment_ElementsMap = new HashMap<String, List<Element>>();

		for (final String uriFragment : uriFragment_AttributesMap.keySet()) {

			if (!uriFragment_ElementsMap.containsKey(uriFragment)) {

				final String xpath = getXpathString(uriFragment);

				System.out.println("==========================================");
				System.out.println(xpath);

				final List<Element> schedulers = this.helper.getXpathResult(doc, xpath, Element.class);

				for (final Element element : schedulers) {
					System.out.println(element.getAttributeValue("name"));
				}

				System.out.println("==========================================");

				uriFragment_ElementsMap.put(uriFragment, schedulers);
			}
		}

		System.out.println(uriFragment_AttributesMap);

		System.out.println(uriFragment_ElementsMap);

		System.out.println("==========================================================");

		System.out.println("Printing URI fragment contents : ");

		final Set<String> keySet = uriFragment_ElementsMap.keySet();

		for (final String uriFragment : keySet) {

			final List<Element> list = uriFragment_ElementsMap.get(uriFragment);

			for (final Element element : list) {

				System.out.println(" standard uri fragment is : " + uriFragment + "  Xpath is : "
						+ getXpathString(uriFragment) + " generated uri fragment : " + getURIFragment(element));
			}
		}
	}

	private String getXpathString(String uriFragment) {

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

				// TODO:
				e.printStackTrace();
			}
		}

		return uriFragment;
	}

	private String getURIFragment(final Element element) {

		/*- element is Sheduler */

		final Stack<Object> stack = new Stack<Object>();

		final Element parent = element.getParentElement();

		if (parent != null) {
			/*- Index of Scheduler element in the Parent container */

			int indexOf = parent.indexOf(element);

			/*- Index returned by JDOM is not same as element index.
			 * In the below content:
			 * left side is index generated by JDOM for an element insdie parent container, right side is the original
			1  -> 1
			3  -> 2
			5  -> 3
			7  -> 4
			9  -> 5
			11 -> 6
			13 -> 7
			15 -> 8
			17 -> 9
			19 -> 10
			 */
			indexOf = (indexOf + 1) / 2;

			/*- building EMF URI fragment stub for Scheduler */

			/*- Substracting 1 from index, to make it URIFragment compaible */

			stack.push(element.getName() + "." + (indexOf - 1));

			populateStack(parent, stack);
		}

		String uriFragment = "//";

		while (!stack.empty()) {

			uriFragment = uriFragment + "@" + stack.pop() + "/";
		}

		return uriFragment;
	}

	private void populateStack(final Element element, final Stack<Object> st) {

		st.push(element.getName());

		final Element parentElement = element.getParentElement();

		if (parentElement != null) {

			populateStack(parentElement, st);
		}
	}
}
