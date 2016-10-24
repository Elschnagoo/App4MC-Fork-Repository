/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *     Generated using Eclipse EMF
 *
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.ModeSwitchEntry} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ModeSwitchEntryItemProvider extends BaseObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSwitchEntryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addValuesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModeSwitchEntry_values_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModeSwitchEntry_values_feature", "_UI_ModeSwitchEntry_type"),
				 AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Values(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ModeSwitchEntry.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModeSwitchEntry"));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextGen(Object object) {
		return getString("_UI_ModeSwitchEntry_type");
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		// delegate to custom item provider
		return CustomItemProviderService.getModeSwitchEntryItemProviderText(object, getTextGen(object));
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ModeSwitchEntry.class)) {
			case AmaltheaPackage.MODE_SWITCH_ENTRY__ITEMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}


	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptorsGen(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createAmalthea()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSignedTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createFrequency()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDataSize()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDataRate()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.create(AmaltheaPackage.eINSTANCE.getCustomProperty())));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createListObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createStringObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createBigIntegerObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createReferenceObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createIntegerObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createLongObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createFloatObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDoubleObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createBooleanObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTimeObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSignedTimeObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createWeibullParameters()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createWeibullEstimators()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createUniformDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createBoundaries()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createGaussDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createBetaDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createMinAvgMaxStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSingleValueStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createMode()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createModeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createComponentsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createQualifiedPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createFInterfacePort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createConfigModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEventConfigLink()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEventConfigElement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnableSequencingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessRunnableGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnableSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDataSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnablePairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDataPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTargetMemory()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTargetCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTargetScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTargetProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTargetCallSequence()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createLabelEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnableEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTagGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEventChainReference()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSubEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPhysicalSectionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEventChainSynchronizationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDelayConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRepetitionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDataAgeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDataAgeCycle()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDataAgeTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnableRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createArchitectureRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessChainRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCPUPercentageRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createFrequencyRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPercentageRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCountRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTimeRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDataCoherencyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDataStabilityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnableScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createComponentScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEventModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEventSet()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCustomEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createStimulusEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessChainEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnableEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createLabelEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createHWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createHwSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createECU()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createMicrocontroller()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createQuartz()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createHwComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createECUType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createMicrocontrollerType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCoreType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createMemoryType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createNetworkType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createHwPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createComplexPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createComplexPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPrescaler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCrossbarSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createBridge()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createLatencyAccessPath()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createHwAccessPath()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createAccessPathRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createLatencyConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createLatencyDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createHwAccessPathRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createHwElementRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createMappingModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCoreAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPhysicalSectionMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createAbstractElementMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTaskAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createISRAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnableAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createOSModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createOsBuffering()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSemaphore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createOSEK()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPartlyPFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPfairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPartlyEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createLeastLocalRemainingExecutionTimeFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEarliestDeadlineFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDeadlineMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRateMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPriorityBasedRoundRobin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createUserSpecificSchedulingAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPriorityBased()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createAlgorithmParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSchedulingHWUnit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSchedulingSWUnit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createVendorOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTaskScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createInterruptController()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createOsInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createOsAPIInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createOsISRInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createOsExecutionInstructionsDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createOsExecutionInstructionsConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessPrototypeAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnableAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createAbstractElementMappingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createHwCoreProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createHwCoreConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createHwMemoryProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createHwMemoryConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createStimuliModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createModeValueList()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createModeValueListEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPeriodic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPeriodicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSynthetic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTimestampList()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCustomStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSingle()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createInterProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSporadic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createArrivalCurve()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createArrivalCurveEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createClockTriangleFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createClockSinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createClockMultiplierList()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createClockMultiplierListEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCustomEntity()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCallGraph()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCallSequence()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createModeSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createModeSwitchEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createModeSwitchDefault()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProbabiltitySwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProbabilitySwitchEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCounter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createWaitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSetEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createClearEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEventMask()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createOsEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createInterProcessActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createEnforcedMigration()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTaskRunnableCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSchedulePoint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTerminateProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createISR()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createChainedProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createAccessPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createOrderPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnable()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createModeLabel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createModeLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnableModeSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverRead()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverWrite()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createAsynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProbabilityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createProbabilityRunnableItem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDeviationRunnableItem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunnableCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createInstructionsDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createInstructionsConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createStructEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPointer()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createTypeRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDataPlatformMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createDataTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createBaseTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createPeriodicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSporadicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createSingleActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createCustomActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createLabelAccessStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createInstructionFetch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 AmaltheaFactory.eINSTANCE.createRunEntityCallStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items(),
				 EcoreFactory.eINSTANCE.createETypeParameter()));
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
		// call generated method
		collectNewChildDescriptorsGen(newChildDescriptors, object);
		// postprocessing
		EcoreGenericsHelper.correctChildDescriptorListForGenericTypes(object, newChildDescriptors);
	}


	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AmaltheaPackage.eINSTANCE.getIAnnotatable_CustomProperties() ||
			childFeature == AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Items();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
