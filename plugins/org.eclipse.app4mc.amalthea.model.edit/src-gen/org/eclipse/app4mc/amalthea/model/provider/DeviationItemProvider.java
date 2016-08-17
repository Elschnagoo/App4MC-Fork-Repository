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
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedItemProviderAdapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.Deviation} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class DeviationItemProvider extends AmaltheaExtendedItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getDeviation_Distribution());
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
	 * This returns Deviation.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Deviation"));
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
		return getString("_UI_Deviation_type");
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		// delegate to custom item provider
		return CustomItemProviderService.getDeviationItemProviderText(object, getTextGen(object),
				getRootAdapterFactory());
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	public void notifyChangedGen(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Deviation.class)) {
			case AmaltheaPackage.DEVIATION__LOWER_BOUND:
			case AmaltheaPackage.DEVIATION__UPPER_BOUND:
			case AmaltheaPackage.DEVIATION__DISTRIBUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		updateChildren(notification);

		// delegate to custom item provider and execute locally
		final List<ViewerNotification> notifications = CustomItemProviderService
				.getDeviationItemProviderNotifications(notification);
		for (final ViewerNotification vn : notifications) {
			fireNotifyChanged(vn);
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
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createAmalthea()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSignedTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createFrequency()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDataSize()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDataRate()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.create(AmaltheaPackage.eINSTANCE.getCustomProperty())));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createListObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createStringObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createBigIntegerObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createReferenceObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createIntegerObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createLongObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createFloatObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDoubleObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createBooleanObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTimeObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSignedTimeObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createWeibullParameters()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createWeibullEstimators()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createUniformDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createBoundaries()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createGaussDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createMinAvgMaxStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSingleValueStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createMode()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createModeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createComponentsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createQualifiedPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createFInterfacePort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createConfigModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createEventConfigLink()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createEventConfigElement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableSequencingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessRunnableGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessRunnableGroupEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulerSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunnablePairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulerPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTargetCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTargetScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTargetProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTargetCallSequence()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulerEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTagGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createEventChainReference()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSubEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOrderConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSynchronisationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createReactionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDelayConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createAgeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRepetitionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDataAgeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDataAgeCycle()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDataAgeTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createArchitectureRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessChainRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCPUPercentageRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createFrequencyRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPercentageRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCountRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTimeRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDataCoherencyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createComponentScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createEventModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createEventSet()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCustomEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createStimulusEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessChainEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createLabelEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createHWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createHwSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createECU()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createMicrocontroller()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createQuartz()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createHwComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createAbstractionType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createECUType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createMicrocontrollerType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCoreType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createMemoryType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createNetworkType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createHwPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createComplexPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createComplexPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPrescaler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCrossbarSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createBridge()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createLatencyAccessPath()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createHwAccessPath()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createAccessPathRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createLatencyConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createLatencyDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createHwAccessPathRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createHwElementRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createMappingModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCoreAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSectionMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createAbstractElementMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTaskAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createISRAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOSModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOsBuffering()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSemaphore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOSEK()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPartlyPFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPfairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPartlyEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createLeastLocalRemainingExecutionTimeFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createEarliestDeadlineFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDeadlineMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRateMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPriorityBasedRoundRobin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createUserSpecificSchedulingAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPriorityBased()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createAlgorithmParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulingHWUnit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulingSWUnit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createVendorOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTaskScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createInterruptController()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOsInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOsAPIInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOsISRInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOsExecutionInstructionsDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOsExecutionInstructionsConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessPrototypeAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSectionMappingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createAbstractElementMappingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createHwCoreProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createHwCoreConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createHwMemoryProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createHwMemoryConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createStimuliModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createModeValueList()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createModeValueListEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPeriodic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPeriodicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCustomStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSingle()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createInterProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSporadic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createArrivalCurve()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createArrivalCurveEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createClockTriangleFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createClockSinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createClockMultiplierList()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createClockMultiplierListEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCustomEntity()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCallGraph()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCallSequence()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createModeSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createModeSwitchEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProbabiltitySwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProbabilitySwitchEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCounter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createWaitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSetEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createClearEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createEventMask()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOsEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createInterProcessActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createEnforcedMigration()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTaskRunnableCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulePoint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTerminateProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createISR()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createChainedProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createAccessPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createOrderPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunnable()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createModeLabel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createModeLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverRead()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverWrite()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createAsynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProbabilityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createProbabilityRunnableItem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDeviationRunnableItem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createInstructionsDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createInstructionsConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createStructEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPointer()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createTypeRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDataPlatformMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createDataTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createBaseTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createPeriodicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSporadicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createSingleActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createCustomActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createLabelAccessStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createInstructionFetch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 AmaltheaFactory.eINSTANCE.createRunEntityCallStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_LowerBound(),
				 EcoreFactory.eINSTANCE.createETypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createAmalthea()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSignedTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createFrequency()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDataSize()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDataRate()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.create(AmaltheaPackage.eINSTANCE.getCustomProperty())));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createListObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createStringObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createBigIntegerObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createReferenceObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createIntegerObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createLongObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createFloatObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDoubleObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createBooleanObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTimeObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSignedTimeObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createWeibullParameters()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createWeibullEstimators()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createUniformDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createBoundaries()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createGaussDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createMinAvgMaxStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSingleValueStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createMode()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createModeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createComponentsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createQualifiedPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createFInterfacePort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createConfigModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createEventConfigLink()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createEventConfigElement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableSequencingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessRunnableGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessRunnableGroupEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulerSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunnablePairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulerPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTargetCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTargetScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTargetProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTargetCallSequence()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulerEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTagGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createEventChainReference()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSubEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOrderConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSynchronisationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createReactionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDelayConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createAgeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRepetitionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDataAgeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDataAgeCycle()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDataAgeTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createArchitectureRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessChainRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCPUPercentageRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createFrequencyRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPercentageRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCountRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTimeRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDataCoherencyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createComponentScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createEventModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createEventSet()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCustomEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createStimulusEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessChainEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createLabelEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createHWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createHwSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createECU()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createMicrocontroller()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createQuartz()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createHwComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createAbstractionType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createECUType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createMicrocontrollerType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCoreType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createMemoryType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createNetworkType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createHwPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createComplexPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createComplexPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPrescaler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCrossbarSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createBridge()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createLatencyAccessPath()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createHwAccessPath()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createAccessPathRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createLatencyConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createLatencyDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createHwAccessPathRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createHwElementRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createMappingModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCoreAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSectionMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createAbstractElementMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTaskAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createISRAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOSModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOsBuffering()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSemaphore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOSEK()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPartlyPFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPfairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPartlyEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createLeastLocalRemainingExecutionTimeFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createEarliestDeadlineFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDeadlineMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRateMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPriorityBasedRoundRobin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createUserSpecificSchedulingAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPriorityBased()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createAlgorithmParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulingHWUnit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulingSWUnit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createVendorOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTaskScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createInterruptController()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOsInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOsAPIInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOsISRInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOsExecutionInstructionsDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOsExecutionInstructionsConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessPrototypeAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSectionMappingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createAbstractElementMappingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createHwCoreProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createHwCoreConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createHwMemoryProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createHwMemoryConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createStimuliModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createModeValueList()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createModeValueListEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPeriodic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPeriodicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCustomStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSingle()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createInterProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSporadic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createArrivalCurve()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createArrivalCurveEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createClockTriangleFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createClockSinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createClockMultiplierList()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createClockMultiplierListEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCustomEntity()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCallGraph()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCallSequence()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createModeSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createModeSwitchEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProbabiltitySwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProbabilitySwitchEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCounter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createWaitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSetEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createClearEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createEventMask()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOsEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createInterProcessActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createEnforcedMigration()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTaskRunnableCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSchedulePoint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTerminateProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createISR()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createChainedProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createAccessPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createOrderPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunnable()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createModeLabel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createModeLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverRead()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverWrite()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createAsynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProbabilityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createProbabilityRunnableItem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDeviationRunnableItem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunnableCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createInstructionsDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createInstructionsConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createStructEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPointer()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createTypeRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDataPlatformMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createDataTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createBaseTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createPeriodicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSporadicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createSingleActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createCustomActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createLabelAccessStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createInstructionFetch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 AmaltheaFactory.eINSTANCE.createRunEntityCallStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_UpperBound(),
				 EcoreFactory.eINSTANCE.createETypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_Distribution(),
				 AmaltheaFactory.eINSTANCE.createWeibullParameters()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_Distribution(),
				 AmaltheaFactory.eINSTANCE.createWeibullEstimators()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_Distribution(),
				 AmaltheaFactory.eINSTANCE.createUniformDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_Distribution(),
				 AmaltheaFactory.eINSTANCE.createBoundaries()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getDeviation_Distribution(),
				 AmaltheaFactory.eINSTANCE.createGaussDistribution()));
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
			childFeature == AmaltheaPackage.eINSTANCE.getDeviation_LowerBound() ||
			childFeature == AmaltheaPackage.eINSTANCE.getDeviation_UpperBound() ||
			childFeature == AmaltheaPackage.eINSTANCE.getDeviation_Distribution();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AmaltheaEditPlugin.INSTANCE;
	}

}
