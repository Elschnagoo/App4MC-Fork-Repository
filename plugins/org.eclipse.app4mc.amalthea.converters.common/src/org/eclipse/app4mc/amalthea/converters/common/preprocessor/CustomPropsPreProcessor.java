/**
 ********************************************************************************
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

package org.eclipse.app4mc.amalthea.converters.common.preprocessor;

import java.io.File;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.base.IPreProcessor;
import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.eclipse.app4mc.amalthea.converters.common.utils.BaseHelperUtils;
import org.jdom2.Document;

public class CustomPropsPreProcessor implements IPreProcessor {

	AbstractHelper helper;

	public CustomPropsPreProcessor() {
		this.helper = BaseHelperUtils.getInstance();
	}

	@Override
	public void process(final File targetFile, final Map<File, Document> fileName_documentsMap) throws Exception {

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}


		/*-
		*
		*Custom Properties with reference to an object will  be present in the following format :
		*
		*    <customProperties xmi:id="_Wc8AsNotEeWXsaNW2kxe8A" key="custPropKey">
		*		<value xsi:type="common:ReferenceObject" xmi:id="_bSW3gNotEeWXsaNW2kxe8A" value="_Zp_LgNotEeWXsaNW2kxe8A"/>
		*	</customProperties>
		*
		*	<customProperties xmi:id="_qefqgNotEeWXsaNW2kxe8A" key="custKey">
		*		<value xsi:type="common:ReferenceObject" xmi:id="_rwIRgNotEeWXsaNW2kxe8A">
		*			<value href="default1.amxmi#_nDgKUNotEeWXsaNW2kxe8A"/>
		*		</value>
		*	</customProperties>
		*
		*/

		/*- Below query will result in returning value node which has a xsi:type ="common:ReferenceObject"  & is immediate child of customProperties*/

		/*-=======================Below code is commented, as it was completely removing the ref elements which is not expected =================*/


		/*
		 * final List<Element> value_custProps_refObjects = this.helper.getXpathResult(rootElement,
		 * ".//customProperties/value[@xsi:type=\"common:ReferenceObject\"]", Element.class,
		 * this.helper.getGenericNS("xsi"));
		 *
		 * for (final Element element : value_custProps_refObjects) { final Element parentElement =
		 * element.getParentElement();
		 *
		 * final String key = parentElement.getAttributeValue("key");
		 *
		 * element.detach();
		 *
		 * System.out.println( "Reference Object -> associated as value in CustomProperty having key: \"" + key +
		 * "\" is removed"); }
		 *
		 *
		 * fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
		 */
	}

}
