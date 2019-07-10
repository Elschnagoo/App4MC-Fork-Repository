/**
 ********************************************************************************
 * Copyright (c) 2015-2019 itemis AG and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     itemis AG, Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui;

import org.eclipse.app4mc.amalthea.model.provider.AmaltheaItemProviderAdapterFactory;
import org.eclipse.app4mc.amalthea.sphinx.ui.common.extended.ExtendedCoreClassifierIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.common.extended.ExtendedMemoryClassifierIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.common.extended.ExtendedTagIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedCacheDefinitionIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedCacheIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedConnectionHandlerDefinitionIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedConnectionHandlerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedFrequencyDomainIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedHwConnectionIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedHwFeatureCategoryIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedHwStructureIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedMemoryDefinitionIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedMemoryIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedPowerDomainIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedProcessingUnitDefinitionIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedProcessingUnitIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedBaseTypeDefinitionIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedChannelIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedCustomActivationIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedCustomEntityIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedDataTypeDefinitionIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedEnumModeIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedEventActivationIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedISRIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedLabelIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedModeLabelIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedNumericModeIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedOsEventIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedPeriodicActivationIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedProcessChainIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedProcessPrototypeIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedRunnableIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedRunnableParameterIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedSectionIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedSingleActivationIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedSporadicActivationIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedTaskIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedVariableRateActivationIP;
import org.eclipse.emf.common.notify.Adapter;

public class ExtendedAmaltheaItemProviderAdapterFactory extends AmaltheaItemProviderAdapterFactory {

// HWModel Definitions

	@Override
	public Adapter createProcessingUnitDefinitionAdapter() {
		return new ExtendedProcessingUnitDefinitionIP(this);
	}

	@Override
	public Adapter createMemoryDefinitionAdapter() {
		return new ExtendedMemoryDefinitionIP(this);
	}

	@Override
	public Adapter createCacheDefinitionAdapter() {
		return new ExtendedCacheDefinitionIP(this);
	}

	@Override
	public Adapter createConnectionHandlerDefinitionAdapter() {
		return new ExtendedConnectionHandlerDefinitionIP(this);
	}

// HWModel Domains

	@Override
	public Adapter createFrequencyDomainAdapter() {
		return new ExtendedFrequencyDomainIP(this);
	}

	@Override
	public Adapter createPowerDomainAdapter() {
		return new ExtendedPowerDomainIP(this);
	}

// HWModel Features

	@Override
	public Adapter createHwFeatureCategoryAdapter() {
		return new ExtendedHwFeatureCategoryIP(this);
	}

// HWModel Structure Modules

	@Override
	public Adapter createProcessingUnitAdapter() {
		return new ExtendedProcessingUnitIP(this);
	}

	@Override
	public Adapter createMemoryAdapter() {
		return new ExtendedMemoryIP(this);
	}

	@Override
	public Adapter createCacheAdapter() {
		return new ExtendedCacheIP(this);
	}

	@Override
	public Adapter createConnectionHandlerAdapter() {
		return new ExtendedConnectionHandlerIP(this);
	}

// HWModel Structure Connections

	@Override
	public Adapter createHwConnectionAdapter() {
		return new ExtendedHwConnectionIP(this);
	}

// CommonElements

	// @Override
	@Override
	public Adapter createTagAdapter() {
		return new ExtendedTagIP(this);
	}

	@Override
	public Adapter createCoreClassifierAdapter() {
		return new ExtendedCoreClassifierIP(this);
	}

	@Override
	public Adapter createMemoryClassifierAdapter() {
		return new ExtendedMemoryClassifierIP(this);
	}

// SWModel Type Definitions

	@Override
	public Adapter createBaseTypeDefinitionAdapter() {
		return new ExtendedBaseTypeDefinitionIP(this);
	}

	@Override
	public Adapter createDataTypeDefinitionAdapter() {
		return new ExtendedDataTypeDefinitionIP(this);
	}

// SWModel Activations

	@Override
	public Adapter createCustomActivationAdapter() {
		return new ExtendedCustomActivationIP(this);
	}

	@Override
	public Adapter createEventActivationAdapter() {
		return new ExtendedEventActivationIP(this);
	}

	@Override
	public Adapter createPeriodicActivationAdapter() {
		return new ExtendedPeriodicActivationIP(this);
	}
	
	@Override
	public Adapter createSingleActivationAdapter() {
		return new ExtendedSingleActivationIP(this);
	}

	@Override
	public Adapter createSporadicActivationAdapter() {
		return new ExtendedSporadicActivationIP(this);
	}

	@Override
	public Adapter createVariableRateActivationAdapter() {
		return new ExtendedVariableRateActivationIP(this);
	}

// SWModel (simple containers with only one type)

	@Override
	public Adapter createChannelAdapter() {
		return new ExtendedChannelIP(this);
	}

	@Override
	public Adapter createCustomEntityAdapter() {
		return new ExtendedCustomEntityIP(this);
	}

	@Override
	public Adapter createOsEventAdapter() {
		return new ExtendedOsEventIP(this);
	}

	@Override
	public Adapter createISRAdapter() {
		return new ExtendedISRIP(this);
	}

	@Override
	public Adapter createLabelAdapter() {
		return new ExtendedLabelIP(this);
	}

	@Override
	public Adapter createNumericModeAdapter() {
		return new ExtendedNumericModeIP(this);
	}

	@Override
	public Adapter createEnumModeAdapter() {
		return new ExtendedEnumModeIP(this);
	}

	@Override
	public Adapter createModeLabelAdapter() {
		return new ExtendedModeLabelIP(this);
	}

	@Override
	public Adapter createProcessChainAdapter() {
		return new ExtendedProcessChainIP(this);
	}

	@Override
	public Adapter createProcessPrototypeAdapter() {
		return new ExtendedProcessPrototypeIP(this);
	}

	@Override
	public Adapter createRunnableAdapter() {
		return new ExtendedRunnableIP(this);
	}

	@Override
	public Adapter createSectionAdapter() {
		return new ExtendedSectionIP(this);
	}

	@Override
	public Adapter createTaskAdapter() {
		return new ExtendedTaskIP(this);
	}

	@Override
	public Adapter createRunnableParameterAdapter() {
		return new ExtendedRunnableParameterIP(this);
	}


// Other nodes with virtual sub folders

	@Override
	public Adapter createCommonElementsAdapter() {
		return new ExtendedCommonElementsItemProvider(this);
	}

	@Override
	public Adapter createSWModelAdapter() {
		return new ExtendedSWModelItemProvider(this);
	}

	@Override
	public Adapter createHWModelAdapter() {
		return new ExtendedHWModelItemProvider(this);
	}

	@Override
	public Adapter createHwStructureAdapter() {
		return new ExtendedHwStructureIP(this);
	}

}
