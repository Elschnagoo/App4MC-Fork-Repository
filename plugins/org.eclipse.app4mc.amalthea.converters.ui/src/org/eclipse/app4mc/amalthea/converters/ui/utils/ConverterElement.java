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
package org.eclipse.app4mc.amalthea.converters.ui.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;

public class ConverterElement {

	private boolean isCompleted;

	private final IConverter converterObject;

	private final List<String> dependentOnConverterIDs;

	private final String id;

	private final List<ConverterElement> requiredConverterObjects;


	public ConverterElement(final String id, final IConverter converterObject) {

		this.dependentOnConverterIDs = new ArrayList<String>();
		this.converterObject = converterObject;
		this.id = id;
		this.requiredConverterObjects = new ArrayList<ConverterElement>();
	}

	public String getID() {
		return this.id;
	}

	public void addDependentOnConverterID(final String converterID) {

		this.dependentOnConverterIDs.add(converterID);
	}

	public List<String> getIDSofDependentOnConverters() {
		return this.dependentOnConverterIDs;
	}

	public IConverter getConverterObject() {
		return this.converterObject;
	}

	public boolean isCompleted() {
		return this.isCompleted;
	}

	public void setCompleted(final boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public List<ConverterElement> getRequiredConverters() {

		return this.requiredConverterObjects;
	}

	public void addRequiredConverter(final ConverterElement converterElement) {

		if (converterElement != null) {
			this.requiredConverterObjects.add(converterElement);
		}
	}
}
