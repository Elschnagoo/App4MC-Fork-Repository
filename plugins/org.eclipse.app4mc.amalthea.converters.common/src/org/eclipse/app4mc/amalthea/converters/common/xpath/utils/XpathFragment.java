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

package org.eclipse.app4mc.amalthea.converters.common.xpath.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.jdom2.Element;

public class XpathFragment {

	/*- holds the Xpath fragment */
	private String value;

	/*- holds the resulting JDOM Element's obtained by applying the Xpath */

	private List<Element> xmlElements = new ArrayList<Element>();

	/*- Parent XpathFragment object
	 * In case of root element, parent XpathFragment is set as Null
	 */
	private XpathFragment parentFragment;

	/*- status if Xpath is applied */

	private boolean isVisited;

	public boolean isVisited() {
		return this.isVisited;
	}

	public void setVisited(final boolean isVisited) {
		this.isVisited = isVisited;
	}

	public XpathFragment getParent() {
		return this.parentFragment;
	}

	public void setParent(final XpathFragment parent) {
		this.parentFragment = parent;
	}

	/*- returns the sub Xpath content associated to this XpathFragment object */
	public String getValue() {
		return this.value;
	}

	public void setValue(final String value) {
		this.value = value;
	}


	public List<Element> getXmlElements() {
		return this.xmlElements;
	}

	public void addXmlElements(final Element element) {
		if (this.xmlElements == null) {
			this.xmlElements = new ArrayList<Element>();
		}
		this.xmlElements.add(element);

	}

	public void addAllXmlElements(final List<Element> elements) {

		if (this.xmlElements == null) {
			this.xmlElements = new ArrayList<Element>();
		}
		this.xmlElements.addAll(elements);

	}


	public void visit(final Element rootElement, final AbstractHelper helper) {

		if (!this.isVisited) {

			List<Element> parentElements = new ArrayList<Element>();

			if (this.parentFragment == null) {

				parentElements.add(rootElement);
			}
			else {
				if (!this.parentFragment.isVisited()) {
					this.parentFragment.visit(rootElement, helper);
				}
				parentElements = this.parentFragment.getXmlElements();

				if (parentElements == null || parentElements.size() == 0) {
					this.isVisited = true;
					return;
				}

			}

			for (final Element parentElement : parentElements) {

				final List<Element> elements = helper.getXpathResult(parentElement, this.value, Element.class);

				addAllXmlElements(elements);

			}
			this.isVisited = true;

		}


	}

}
