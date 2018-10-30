/**
 * Copyright (c) 2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 */

package org.eclipse.app4mc.amalthea.model.builder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class AmaltheaBuilder {
	private final HashMap<String, EObject> objectRegistry = new HashMap<String, EObject>();

	public Amalthea amalthea(final Procedure1<Amalthea> initializer) {
		final Amalthea obj = AmaltheaFactory.eINSTANCE.createAmalthea();
		initializer.apply(obj);
		return obj;
	}

	// ********** Top level elements **********

	public void commonElements(final Amalthea container, final Procedure1<CommonElements> initializer) {
		final CommonElements obj = AmaltheaFactory.eINSTANCE.createCommonElements();
		container.setCommonElements(obj);
		initializer.apply(obj);
	}

	public void eventModel(final Amalthea container, final Procedure1<EventModel> initializer) {
		final EventModel obj = AmaltheaFactory.eINSTANCE.createEventModel();
		container.setEventModel(obj);
		initializer.apply(obj);
	}

	public void stimuliModel(final Amalthea container, final Procedure1<StimuliModel> initializer) {
		final StimuliModel obj = AmaltheaFactory.eINSTANCE.createStimuliModel();
		container.setStimuliModel(obj);
		initializer.apply(obj);
	}

	public void softwareModel(final Amalthea container, final Procedure1<SWModel> initializer) {
		final SWModel obj = AmaltheaFactory.eINSTANCE.createSWModel();
		container.setSwModel(obj);
		initializer.apply(obj);
	}

	public void osModel(final Amalthea container, final Procedure1<OSModel> initializer) {
		final OSModel obj = AmaltheaFactory.eINSTANCE.createOSModel();
		container.setOsModel(obj);
		initializer.apply(obj);
	}

	public void hardwareModel(final Amalthea container, final Procedure1<HWModel> initializer) {
		final HWModel obj = AmaltheaFactory.eINSTANCE.createHWModel();
		container.setHwModel(obj);
		initializer.apply(obj);
	}

	public void constraintsModel(final Amalthea container, final Procedure1<ConstraintsModel> initializer) {
		final ConstraintsModel obj = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		container.setConstraintsModel(obj);
		initializer.apply(obj);
	}

	public void propertyConstraintsModel(final Amalthea container, final Procedure1<PropertyConstraintsModel> initializer) {
		final PropertyConstraintsModel obj = AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel();
		container.setPropertyConstraintsModel(obj);
		initializer.apply(obj);
	}

	public void componentsModel(final Amalthea container, final Procedure1<ComponentsModel> initializer) {
		final ComponentsModel obj = AmaltheaFactory.eINSTANCE.createComponentsModel();
		container.setComponentsModel(obj);
		initializer.apply(obj);
	}

	public void mappingModel(final Amalthea container, final Procedure1<MappingModel> initializer) {
		final MappingModel obj = AmaltheaFactory.eINSTANCE.createMappingModel();
		container.setMappingModel(obj);
		initializer.apply(obj);
	}

	// ********** Cross reference registry **********

	public <T extends EObject> void _reg(final T obj, final String name) {
		this.objectRegistry.put(name, obj);
	}

	public <T extends EObject> T _ref(final Class<T> cl, final String name) {
		final EObject obj = this.objectRegistry.get(name);
		return cl.cast(obj);
	}

	// ********** Cross reference finder (via name based index search) **********

	public <T extends INamed> T _find(final EObject context, final Class<T> cl, final String name) {
		final Set<? extends T> resultSet = AmaltheaIndex.<T>getElements(context, name, cl);
		Iterator<? extends T> iterator = resultSet.iterator();
		if (iterator.hasNext()) {
			return iterator.next();
		}
		
		return null;
	}

}
