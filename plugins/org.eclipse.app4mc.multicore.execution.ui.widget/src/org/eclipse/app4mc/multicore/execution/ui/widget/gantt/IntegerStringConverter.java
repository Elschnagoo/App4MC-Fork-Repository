/**
 ********************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

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
