/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.util;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.ConfigModel;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MeasurementModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.emf.ecore.EObject;

public class ModelUtil {

	@SuppressWarnings("unchecked")
	public static <T> T getParentContainer(EObject eObject, Class<T> cl) {
		EObject result = null;
		if (eObject != null) {
			for (EObject parent = eObject.eContainer(); parent != null; parent = parent.eContainer()) {

				if (cl.isAssignableFrom(parent.getClass())) {
					return (T) parent;
				}

			}
		}
		return (T) result;
	}


	public static CommonElements getOrCreateCommonElements(Amalthea model) {
		if (model.getCommonElements() == null) {
			model.setCommonElements(AmaltheaFactory.eINSTANCE.createCommonElements());
		}
		return model.getCommonElements();
	}

	public static SWModel getOrCreateSwModel(Amalthea model) {
		if (model.getSwModel() == null) {
			model.setSwModel(AmaltheaFactory.eINSTANCE.createSWModel());
		}
		return model.getSwModel();
	}

	public static HWModel getOrCreateHwModel(Amalthea model) {
		if (model.getHwModel() == null) {
			model.setHwModel(AmaltheaFactory.eINSTANCE.createHWModel());
		}
		return model.getHwModel();
	}

	public static OSModel getOrCreateOsModel(Amalthea model) {
		if (model.getOsModel() == null) {
			model.setOsModel(AmaltheaFactory.eINSTANCE.createOSModel());
		}
		return model.getOsModel();
	}

	public static StimuliModel getOrCreateStimuliModel(Amalthea model) {
		if (model.getStimuliModel() == null) {
			model.setStimuliModel(AmaltheaFactory.eINSTANCE.createStimuliModel());
		}
		return model.getStimuliModel();
	}

	public static EventModel getOrCreateEventModel(Amalthea model) {
		if (model.getEventModel() == null) {
			model.setEventModel(AmaltheaFactory.eINSTANCE.createEventModel());
		}
		return model.getEventModel();
	}

	public static ConstraintsModel getOrCreateConstraintsModel(Amalthea model) {
		if (model.getConstraintsModel() == null) {
			model.setConstraintsModel(AmaltheaFactory.eINSTANCE.createConstraintsModel());
		}
		return model.getConstraintsModel();
	}

	public static PropertyConstraintsModel getOrCreatePropertyConstraintsModel(Amalthea model) {
		if (model.getPropertyConstraintsModel() == null) {
			model.setPropertyConstraintsModel(AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel());
		}
		return model.getPropertyConstraintsModel();
	}

	public static MappingModel getOrCreateMappingModel(Amalthea model) {
		if (model.getMappingModel() == null) {
			model.setMappingModel(AmaltheaFactory.eINSTANCE.createMappingModel());
		}
		return model.getMappingModel();
	}

	public static ComponentsModel getOrCreateComponentsModel(Amalthea model) {
		if (model.getComponentsModel() == null) {
			model.setComponentsModel(AmaltheaFactory.eINSTANCE.createComponentsModel());
		}
		return model.getComponentsModel();
	}

	public static ConfigModel getOrCreateConfigModel(Amalthea model) {
		if (model.getConfigModel() == null) {
			model.setConfigModel(AmaltheaFactory.eINSTANCE.createConfigModel());
		}
		return model.getConfigModel();
	}

	public static MeasurementModel getOrCreateMeasurementModel(Amalthea model) {
		if (model.getMeasurementModel() == null) {
			model.setMeasurementModel(AmaltheaFactory.eINSTANCE.createMeasurementModel());
		}
		return model.getMeasurementModel();
	}

}
