/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.execution.ui.widget.gantt;

import javafx.util.StringConverter;

/**
 * Used to format the time values along the x axis from the gantt widget.
 * @author Tobi
 *
 */
class IntegerStringConverter extends StringConverter<Number> {
	public IntegerStringConverter() {
	}

	@Override
	public String toString(Number object) {
		if (object.intValue() != object.doubleValue())
			return "";
		return "" + (object.intValue());
	}

	@Override
	public Number fromString(String string) {
		Number val = Double.parseDouble(string);
		return val.intValue();
	}
}
