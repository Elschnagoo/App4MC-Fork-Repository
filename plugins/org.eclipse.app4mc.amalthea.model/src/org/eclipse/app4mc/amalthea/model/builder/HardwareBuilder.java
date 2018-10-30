/**
 ********************************************************************************
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
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Cache;
import org.eclipse.app4mc.amalthea.model.CacheDefinition;
import org.eclipse.app4mc.amalthea.model.ConnectionHandler;
import org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition;
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryDefinition;
import org.eclipse.app4mc.amalthea.model.PowerDomain;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class HardwareBuilder {

	public HWModel hardwareModelRoot(final Procedure1<HWModel> initializer) {
		final HWModel obj = AmaltheaFactory.eINSTANCE.createHWModel();
		initializer.apply(obj);
		return obj;
	}

	// ********** Top level elements **********

	public void definition_Cache(final HWModel container, final Procedure1<CacheDefinition> initializer) {
		final CacheDefinition obj = AmaltheaFactory.eINSTANCE.createCacheDefinition();
		container.getDefinitions().add(obj);
		initializer.apply(obj);
	}

	public void definition_Memory(final HWModel container, final Procedure1<MemoryDefinition> initializer) {
		final MemoryDefinition obj = AmaltheaFactory.eINSTANCE.createMemoryDefinition();
		container.getDefinitions().add(obj);
		initializer.apply(obj);
	}

	public void definition_ProcessingUnit(final HWModel container, final Procedure1<ProcessingUnitDefinition> initializer) {
		final ProcessingUnitDefinition obj = AmaltheaFactory.eINSTANCE.createProcessingUnitDefinition();
		container.getDefinitions().add(obj);
		initializer.apply(obj);
	}

	public void definition_ConnectionHandler(final HWModel container, final Procedure1<ConnectionHandlerDefinition> initializer) {
		final ConnectionHandlerDefinition obj = AmaltheaFactory.eINSTANCE.createConnectionHandlerDefinition();
		container.getDefinitions().add(obj);
		initializer.apply(obj);
	}

	public void domain_Frequency(final HWModel container, final Procedure1<FrequencyDomain> initializer) {
		final FrequencyDomain obj = AmaltheaFactory.eINSTANCE.createFrequencyDomain();
		container.getDomains().add(obj);
		initializer.apply(obj);
	}

	public void domain_Power(final HWModel container, final Procedure1<PowerDomain> initializer) {
		final PowerDomain obj = AmaltheaFactory.eINSTANCE.createPowerDomain();
		container.getDomains().add(obj);
		initializer.apply(obj);
	}

	public void featureCategory(final HWModel container, final Procedure1<HwFeatureCategory> initializer) {
		final HwFeatureCategory obj = AmaltheaFactory.eINSTANCE.createHwFeatureCategory();
		container.getFeatureCategories().add(obj);
		initializer.apply(obj);
	}

	public void structure(final HWModel container, final Procedure1<HwStructure> initializer) {
		final HwStructure obj = AmaltheaFactory.eINSTANCE.createHwStructure();
		container.getStructures().add(obj);
		initializer.apply(obj);
	}

	// ********** Features **********

	public void feature(final HwFeatureCategory container, final Procedure1<HwFeature> initializer) {
		final HwFeature obj = AmaltheaFactory.eINSTANCE.createHwFeature();
		container.getFeatures().add(obj);
		initializer.apply(obj);
	}

	// ********** Structures **********

	public void structure(final HwStructure container, final Procedure1<HwStructure> initializer) {
		final HwStructure obj = AmaltheaFactory.eINSTANCE.createHwStructure();
		container.getStructures().add(obj);
		initializer.apply(obj);
	}

	public void module_Memory(final HwStructure container, final Procedure1<Memory> initializer) {
		final Memory obj = AmaltheaFactory.eINSTANCE.createMemory();
		container.getModules().add(obj);
		initializer.apply(obj);
	}

	public void module_ProcessingUnit(final HwStructure container, final Procedure1<ProcessingUnit> initializer) {
		final ProcessingUnit obj = AmaltheaFactory.eINSTANCE.createProcessingUnit();
		container.getModules().add(obj);
		initializer.apply(obj);
	}

	public void module_Cache(final HwStructure container, final Procedure1<Cache> initializer) {
		final Cache obj = AmaltheaFactory.eINSTANCE.createCache();
		container.getModules().add(obj);
		initializer.apply(obj);
	}

	public void module_ConnectionHandler(final HwStructure container, final Procedure1<ConnectionHandler> initializer) {
		final ConnectionHandler obj = AmaltheaFactory.eINSTANCE.createConnectionHandler();
		container.getModules().add(obj);
		initializer.apply(obj);
	}

	public void connection(final HwStructure container, final Procedure1<HwConnection> initializer) {
		final HwConnection obj = AmaltheaFactory.eINSTANCE.createHwConnection();
		container.getConnections().add(obj);
		initializer.apply(obj);
	}

	public void port(final HwStructure container, final Procedure1<HwPort> initializer) {
		final HwPort obj = AmaltheaFactory.eINSTANCE.createHwPort();
		container.getPorts().add(obj);
		initializer.apply(obj);
	}

	public void port(final Memory container, final Procedure1<HwPort> initializer) {
		final HwPort obj = AmaltheaFactory.eINSTANCE.createHwPort();
		container.getPorts().add(obj);
		initializer.apply(obj);
	}

	public void port(final ProcessingUnit container, final Procedure1<HwPort> initializer) {
		final HwPort obj = AmaltheaFactory.eINSTANCE.createHwPort();
		container.getPorts().add(obj);
		initializer.apply(obj);
	}

	public void port(final Cache container, final Procedure1<HwPort> initializer) {
		final HwPort obj = AmaltheaFactory.eINSTANCE.createHwPort();
		container.getPorts().add(obj);
		initializer.apply(obj);
	}

	public void port(final ConnectionHandler container, final Procedure1<HwPort> initializer) {
		final HwPort obj = AmaltheaFactory.eINSTANCE.createHwPort();
		container.getPorts().add(obj);
		initializer.apply(obj);
	}

	public void cache(final ProcessingUnit container, final Procedure1<Cache> initializer) {
		final Cache obj = AmaltheaFactory.eINSTANCE.createCache();
		container.getCaches().add(obj);
		initializer.apply(obj);
	}

	public void access(final ProcessingUnit container, final Procedure1<HwAccessElement> initializer) {
		final HwAccessElement obj = AmaltheaFactory.eINSTANCE.createHwAccessElement();
		container.getAccessElements().add(obj);
		initializer.apply(obj);
	}

	public void path(final HwAccessElement container, final Procedure1<HwAccessPath> initializer) {
		final HwAccessPath obj = AmaltheaFactory.eINSTANCE.createHwAccessPath();
		container.setAccessPath(obj);
		initializer.apply(obj);
	}

}
