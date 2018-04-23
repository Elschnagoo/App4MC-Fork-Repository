/**
 * *******************************************************************************
 *  Copyright (c) 2015 itemis AG and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     itemis AG, Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui;

import org.eclipse.app4mc.amalthea.model.provider.AmaltheaItemProviderAdapterFactory;
import org.eclipse.app4mc.amalthea.sphinx.ui.common.extended.ExtendedCoreClassifierItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.common.extended.ExtendedMemoryClassifierItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.common.extended.ExtendedTagItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedCacheDefinitionItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedCacheItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedConnectionHandlerDefinitionItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedConnectionHandlerItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedFrequencyDomainItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedHwConnectionItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedHwFeatureCategoryItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedHwStructureItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedMemoryDefinitionItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedMemoryItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedPowerDomainItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedProcessingUnitDefinitionItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended.ExtendedProcessingUnitItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedAsynchronousServerCallItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedBaseTypeDefinitionItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedChannelItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedChannelReceiveItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedChannelSendItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedCustomActivationItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedCustomEntityItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedCustomEventTriggerItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedDataTypeDefinitionItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedEventActivationItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedExecutionNeedtemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedGetResultServerCallItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedGroupItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedISRItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedLabelAccessItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedLabelItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedModeItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedModeLabelAccessItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedModeLabelItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedOsEventItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedPeriodicActivationItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedProcessChainItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedProcessPrototypeItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedRunnableCallItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedRunnableItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedRunnableModeSwitchItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedRunnableProbabilitySwitchItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedSectionItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedSemaphoreAccessItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedSenderReceiverReadItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedSenderReceiverWriteItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedSingleActivationItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedSporadicActivationItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedSynchronousServerCallItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedTaskItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedVariableRateActivationItemProvider;
import org.eclipse.emf.common.notify.Adapter;

public class ExtendedAmaltheaItemProviderAdapterFactory extends AmaltheaItemProviderAdapterFactory {

// HWModel Definitions

	@Override
	public Adapter createProcessingUnitDefinitionAdapter() {
		return new ExtendedProcessingUnitDefinitionItemProvider(this);
	}

	@Override
	public Adapter createMemoryDefinitionAdapter() {
		return new ExtendedMemoryDefinitionItemProvider(this);
	}

	@Override
	public Adapter createCacheDefinitionAdapter() {
		return new ExtendedCacheDefinitionItemProvider(this);
	}

	@Override
	public Adapter createConnectionHandlerDefinitionAdapter() {
		return new ExtendedConnectionHandlerDefinitionItemProvider(this);
	}

// HWModel Domains

	@Override
	public Adapter createFrequencyDomainAdapter() {
		return new ExtendedFrequencyDomainItemProvider(this);
	}

	@Override
	public Adapter createPowerDomainAdapter() {
		return new ExtendedPowerDomainItemProvider(this);
	}

// HWModel Features

	@Override
	public Adapter createHwFeatureCategoryAdapter() {
		return new ExtendedHwFeatureCategoryItemProvider(this);
	}

// HWModel Structure Modules

	@Override
	public Adapter createProcessingUnitAdapter() {
		return new ExtendedProcessingUnitItemProvider(this);
	}

	@Override
	public Adapter createMemoryAdapter() {
		return new ExtendedMemoryItemProvider(this);
	}

	@Override
	public Adapter createCacheAdapter() {
		return new ExtendedCacheItemProvider(this);
	}

	@Override
	public Adapter createConnectionHandlerAdapter() {
		return new ExtendedConnectionHandlerItemProvider(this);
	}

// HWModel Structure Connections

	@Override
	public Adapter createHwConnectionAdapter() {
		return new ExtendedHwConnectionItemProvider(this);
	}

// CommonElements

	// @Override
	@Override
	public Adapter createTagAdapter() {
		return new ExtendedTagItemProvider(this);
	}

	@Override
	public Adapter createCoreClassifierAdapter() {
		return new ExtendedCoreClassifierItemProvider(this);
	}

	@Override
	public Adapter createMemoryClassifierAdapter() {
		return new ExtendedMemoryClassifierItemProvider(this);
	}

// SWModel Runnable Items

	@Override
	public Adapter createChannelReceiveAdapter() {
		return new ExtendedChannelReceiveItemProvider(this);
	}

	@Override
	public Adapter createChannelSendAdapter() {
		return new ExtendedChannelSendItemProvider(this);
	}

	@Override
	public Adapter createCustomEventTriggerAdapter() {
		return new ExtendedCustomEventTriggerItemProvider(this);
	}

	@Override
	public Adapter createExecutionNeedAdapter() {
		return new ExtendedExecutionNeedtemProvider(this);
	}

	@Override
	public Adapter createGroupAdapter() {
		return new ExtendedGroupItemProvider(this);
	}

	@Override
	public Adapter createLabelAccessAdapter() {
		return new ExtendedLabelAccessItemProvider(this);
	}

	@Override
	public Adapter createModeLabelAccessAdapter() {
		return new ExtendedModeLabelAccessItemProvider(this);
	}

	@Override
	public Adapter createRunnableCallAdapter() {
		return new ExtendedRunnableCallItemProvider(this);
	}

	@Override
	public Adapter createRunnableModeSwitchAdapter() {
		return new ExtendedRunnableModeSwitchItemProvider(this);
	}

	@Override
	public Adapter createRunnableProbabilitySwitchAdapter() {
		return new ExtendedRunnableProbabilitySwitchItemProvider(this);
	}

	@Override
	public Adapter createSemaphoreAccessAdapter() {
		return new ExtendedSemaphoreAccessItemProvider(this);
	}

	@Override
	public Adapter createSynchronousServerCallAdapter() {
		return new ExtendedSynchronousServerCallItemProvider(this);
	}

	@Override
	public Adapter createAsynchronousServerCallAdapter() {
		return new ExtendedAsynchronousServerCallItemProvider(this);
	}

	@Override
	public Adapter createGetResultServerCallAdapter() {
		return new ExtendedGetResultServerCallItemProvider(this);
	}

	@Override
	public Adapter createSenderReceiverReadAdapter() {
		return new ExtendedSenderReceiverReadItemProvider(this);
	}

	@Override
	public Adapter createSenderReceiverWriteAdapter() {
		return new ExtendedSenderReceiverWriteItemProvider(this);
	}

// SWModel Type Definitions

	@Override
	public Adapter createBaseTypeDefinitionAdapter() {
		return new ExtendedBaseTypeDefinitionItemProvider(this);
	}

	@Override
	public Adapter createDataTypeDefinitionAdapter() {
		return new ExtendedDataTypeDefinitionItemProvider(this);
	}

// SWModel Activations

	@Override
	public Adapter createCustomActivationAdapter() {
		return new ExtendedCustomActivationItemProvider(this);
	}

	@Override
	public Adapter createEventActivationAdapter() {
		return new ExtendedEventActivationItemProvider(this);
	}

	@Override
	public Adapter createPeriodicActivationAdapter() {
		return new ExtendedPeriodicActivationItemProvider(this);
	}
	
	@Override
	public Adapter createSingleActivationAdapter() {
		return new ExtendedSingleActivationItemProvider(this);
	}

	@Override
	public Adapter createSporadicActivationAdapter() {
		return new ExtendedSporadicActivationItemProvider(this);
	}

	@Override
	public Adapter createVariableRateActivationAdapter() {
		return new ExtendedVariableRateActivationItemProvider(this);
	}

// SWModel (simple containers with only one type)

	@Override
	public Adapter createChannelAdapter() {
		return new ExtendedChannelItemProvider(this);
	}

	@Override
	public Adapter createCustomEntityAdapter() {
		return new ExtendedCustomEntityItemProvider(this);
	}

	@Override
	public Adapter createOsEventAdapter() {
		return new ExtendedOsEventItemProvider(this);
	}

	@Override
	public Adapter createISRAdapter() {
		return new ExtendedISRItemProvider(this);
	}

	@Override
	public Adapter createLabelAdapter() {
		return new ExtendedLabelItemProvider(this);
	}

	@Override
	public Adapter createModeAdapter() {
		return new ExtendedModeItemProvider(this);
	}

	@Override
	public Adapter createModeLabelAdapter() {
		return new ExtendedModeLabelItemProvider(this);
	}

	@Override
	public Adapter createProcessChainAdapter() {
		return new ExtendedProcessChainItemProvider(this);
	}

	@Override
	public Adapter createProcessPrototypeAdapter() {
		return new ExtendedProcessPrototypeItemProvider(this);
	}

	@Override
	public Adapter createRunnableAdapter() {
		return new ExtendedRunnableItemProvider(this);
	}

	@Override
	public Adapter createSectionAdapter() {
		return new ExtendedSectionItemProvider(this);
	}

	@Override
	public Adapter createTaskAdapter() {
		return new ExtendedTaskItemProvider(this);
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
		return new ExtendedHwStructureItemProvider(this);
	}

}
