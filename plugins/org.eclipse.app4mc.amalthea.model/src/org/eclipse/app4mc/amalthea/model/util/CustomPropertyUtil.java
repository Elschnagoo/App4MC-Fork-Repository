/**
 ********************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Strings.isNullOrEmpty;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.IntegerObject;
import org.eclipse.app4mc.amalthea.model.ReferenceObject;
import org.eclipse.app4mc.amalthea.model.StringObject;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.jdt.annotation.NonNull;


public final class CustomPropertyUtil {
	
	private static final String ARG1_MESSAGE = "First argument is null, expected instance of IAnnotatable";
	private static final String ARG2_MESSAGE = "Key is null or empty, expected non empty String";

	public static Value customPut(@NonNull IAnnotatable object, @NonNull String key, int num) {
		checkArgument(object != null, ARG1_MESSAGE);
		checkArgument(! isNullOrEmpty(key), ARG2_MESSAGE);
		
		IntegerObject valueObject;
		valueObject = AmaltheaFactory.eINSTANCE.createIntegerObject();
		valueObject.setValue(num);
		Value oldValue = object.getCustomProperties().put(key, valueObject);
		
		return oldValue;
	}

	public static Value customPut(@NonNull IAnnotatable object, @NonNull String key, String str) {
		checkArgument(object != null, ARG1_MESSAGE);
		checkArgument(! isNullOrEmpty(key), ARG2_MESSAGE);

		StringObject valueObject;
		valueObject = AmaltheaFactory.eINSTANCE.createStringObject();
		valueObject.setValue(str);
		Value oldValue = object.getCustomProperties().put(key, valueObject);
		
		return oldValue;
	}

	public static Value customPut(@NonNull IAnnotatable object, @NonNull String key, Time time) {
		checkArgument(object != null, ARG1_MESSAGE);
		checkArgument(! isNullOrEmpty(key), ARG2_MESSAGE);

		Time valueObject;
		valueObject = AmaltheaFactory.eINSTANCE.createTime();
		valueObject.setValue(time.getValue());
		valueObject.setUnit(time.getUnit());
		Value oldValue = object.getCustomProperties().put(key, valueObject);
		
		return oldValue;
	}

	public static Value customPut(@NonNull IAnnotatable object, @NonNull String key, IReferable reference) {
		checkArgument(object != null, ARG1_MESSAGE);
		checkArgument(! isNullOrEmpty(key), ARG2_MESSAGE);

		ReferenceObject valueObject;
		valueObject = AmaltheaFactory.eINSTANCE.createReferenceObject();
		valueObject.setValue(reference);
		Value oldValue = object.getCustomProperties().put(key, valueObject);
		
		return oldValue;
	}

	public static Integer customGetInteger(@NonNull IAnnotatable object, @NonNull String key) {
		checkArgument(object != null, ARG1_MESSAGE);
		checkArgument(! isNullOrEmpty(key), ARG2_MESSAGE);

		Value valueObject = object.getCustomProperties().get(key);
		if (valueObject instanceof IntegerObject) {
			return ((IntegerObject) valueObject).getValue();
		} else {
			return null;
		}
	}

	public static String customGetString(@NonNull IAnnotatable object, @NonNull String key) {
		checkArgument(object != null, ARG1_MESSAGE);
		checkArgument(! isNullOrEmpty(key), ARG2_MESSAGE);

		Value valueObject = object.getCustomProperties().get(key);
		if (valueObject instanceof StringObject) {
			return ((StringObject) valueObject).getValue();
		} else {
			return null;
		}
	}

	public static Time customGetTime(@NonNull IAnnotatable object, @NonNull String key) {
		checkArgument(object != null, ARG1_MESSAGE);
		checkArgument(! isNullOrEmpty(key), ARG2_MESSAGE);

		Value valueObject = object.getCustomProperties().get(key);
		if (valueObject instanceof Time) {
			Time time = (Time) valueObject;
			Time result = AmaltheaFactory.eINSTANCE.createTime();
			result.setValue(time.getValue());
			result.setUnit(time.getUnit());
			return result;
		} else {
			return null;
		}
	}

	public static IReferable customGetReference(@NonNull IAnnotatable object, @NonNull String key) {
		checkArgument(object != null, ARG1_MESSAGE);
		checkArgument(! isNullOrEmpty(key), ARG2_MESSAGE);

		Value valueObject = object.getCustomProperties().get(key);
		if (valueObject instanceof ReferenceObject) {
			return ((ReferenceObject) valueObject).getValue();
		} else {
			return null;
		}
	}

}
