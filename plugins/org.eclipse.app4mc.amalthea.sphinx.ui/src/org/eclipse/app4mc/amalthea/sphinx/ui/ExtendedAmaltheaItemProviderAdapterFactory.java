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
import org.eclipse.app4mc.amalthea.sphinx.ui.common.extended.ExtendedTagItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedAsynchronousServerCallItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedBaseTypeDefinitionItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedChannelItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedCustomActivationItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedCustomEntityItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedDataTypeDefinitionItemProvider;
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
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended.ExtendedRunnableInstructionsItemProvider;
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
import org.eclipse.emf.common.notify.Adapter;

public class ExtendedAmaltheaItemProviderAdapterFactory extends AmaltheaItemProviderAdapterFactory {

	@Override
	public Adapter createAsynchronousServerCallAdapter() {
		return new ExtendedAsynchronousServerCallItemProvider(this);
	}

	@Override
	public Adapter createBaseTypeDefinitionAdapter() {
		return new ExtendedBaseTypeDefinitionItemProvider(this);
	}

	@Override
	public Adapter createChannelAdapter() {
		return new ExtendedChannelItemProvider(this);
	}

	@Override
	public Adapter createCommonElementsAdapter() {
		return new ExtendedCommonElementsItemProvider(this);
	}

	@Override
	public Adapter createCustomActivationAdapter() {
		return new ExtendedCustomActivationItemProvider(this);
	}

	@Override
	public Adapter createCustomEntityAdapter() {
		return new ExtendedCustomEntityItemProvider(this);
	}

	@Override
	public Adapter createDataTypeDefinitionAdapter() {
		return new ExtendedDataTypeDefinitionItemProvider(this);
	}

	@Override
	public Adapter createGroupAdapter() {
		return new ExtendedGroupItemProvider(this);
	}

	
	@Override
	public Adapter createRunnableInstructionsAdapter() {
		return new ExtendedRunnableInstructionsItemProvider(this);
	}

	@Override
	public Adapter createISRAdapter() {
		return new ExtendedISRItemProvider(this);
	}

	@Override
	public Adapter createLabelAccessAdapter() {
		return new ExtendedLabelAccessItemProvider(this);
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
	public Adapter createModeLabelAccessAdapter() {
		return new ExtendedModeLabelAccessItemProvider(this);
	}

	@Override
	public Adapter createModeLabelAdapter() {
		return new ExtendedModeLabelItemProvider(this);
	}

	@Override
	public Adapter createOsEventAdapter() {
		return new ExtendedOsEventItemProvider(this);
	}

	@Override
	public Adapter createPeriodicActivationAdapter() {
		return new ExtendedPeriodicActivationItemProvider(this);
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
	public Adapter createSectionAdapter() {
		return new ExtendedSectionItemProvider(this);
	}

	@Override
	public Adapter createSemaphoreAccessAdapter() {
		return new ExtendedSemaphoreAccessItemProvider(this);
	}

	@Override
	public Adapter createSenderReceiverReadAdapter() {
		return new ExtendedSenderReceiverReadItemProvider(this);
	}

	@Override
	public Adapter createSenderReceiverWriteAdapter() {
		return new ExtendedSenderReceiverWriteItemProvider(this);
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
	public Adapter createSWModelAdapter() {
		return new ExtendedSWModelItemProvider(this);
	}

	@Override
	public Adapter createSynchronousServerCallAdapter() {
		return new ExtendedSynchronousServerCallItemProvider(this);
	}

	// @Override
	@Override
	public Adapter createTagAdapter() {
		return new ExtendedTagItemProvider(this);
	}

	@Override
	public Adapter createTaskAdapter() {
		return new ExtendedTaskItemProvider(this);
	}
}
