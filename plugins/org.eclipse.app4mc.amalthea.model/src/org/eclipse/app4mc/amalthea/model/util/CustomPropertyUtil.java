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

package org.eclipse.app4mc.amalthea.model.util;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.IntegerObject;
import org.eclipse.app4mc.amalthea.model.StringObject;
import org.eclipse.app4mc.amalthea.model.Value;

public final class CustomPropertyUtil {

	public static Value customPut(IAnnotatable object, String key, int num) {
		IntegerObject valueObject;
		valueObject = AmaltheaFactory.eINSTANCE.createIntegerObject();
		valueObject.setValue(num);
		Value oldValue = object.getCustomProperties().put(key, valueObject);
		
		return oldValue;
	}
	
	public static Value customPut(IAnnotatable object, String key, String str) {
		StringObject valueObject;
		valueObject = AmaltheaFactory.eINSTANCE.createStringObject();
		valueObject.setValue(str);
		Value oldValue = object.getCustomProperties().put(key, valueObject);
		
		return oldValue;
	}
	
	public static Integer customGetInteger(IAnnotatable object, String key) {
		Value valueObject = object.getCustomProperties().get(key);
		if (valueObject instanceof IntegerObject) {
			return ((IntegerObject) valueObject).getValue();
		} else {
			return null;
		}
	}

	public static String customGetString(IAnnotatable object, String key) {
		Value valueObject = object.getCustomProperties().get(key);
		if (valueObject instanceof StringObject) {
			return ((StringObject) valueObject).getValue();
		} else {
			return null;
		}
	}

}
