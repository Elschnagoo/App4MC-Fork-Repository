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
import org.eclipse.app4mc.amalthea.model.GaussDistribution;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.GaussDistribution} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class GaussDistributionItemProvider extends DistributionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GaussDistributionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
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
	 * This returns GaussDistribution.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GaussDistribution"));
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
		return getString("_UI_GaussDistribution_type");
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		// delegate to custom item provider
		return CustomItemProviderService.getGaussDistributionItemProviderText(object, getTextGen(object));
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

		switch (notification.getFeatureID(GaussDistribution.class)) {
			case AmaltheaPackage.GAUSS_DISTRIBUTION__SD:
			case AmaltheaPackage.GAUSS_DISTRIBUTION__MEAN:
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
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createAmalthea()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSignedTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createFrequency()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDataSize()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDataRate()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.create(AmaltheaPackage.eINSTANCE.getCustomProperty())));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createListObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createStringObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createBigIntegerObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createReferenceObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createIntegerObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createLongObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createFloatObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDoubleObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createBooleanObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTimeObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSignedTimeObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createWeibullParameters()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createWeibullEstimators()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createUniformDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createBoundaries()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createGaussDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createMinAvgMaxStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSingleValueStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createMode()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createModeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createComponentsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createQualifiedPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createFInterfacePort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createConfigModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createEventConfigLink()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createEventConfigElement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunnableSequencingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessRunnableGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessRunnableGroupEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunnableSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSchedulerSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunnablePairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSchedulerPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTargetCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTargetScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTargetProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTargetCallSequence()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSchedulerEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunnableEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTagGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createEventChainReference()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSubEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOrderConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSynchronisationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createReactionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDelayConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createAgeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRepetitionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDataAgeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDataAgeCycle()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDataAgeTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunnableRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createArchitectureRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessChainRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCPUPercentageRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createFrequencyRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPercentageRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCountRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTimeRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDataCoherencyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunnableScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createComponentScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createEventModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createEventSet()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCustomEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createStimulusEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessChainEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunnableEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createLabelEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createHWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createHwSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createECU()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createMicrocontroller()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createQuartz()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createHwComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createAbstractionType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createECUType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createMicrocontrollerType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCoreType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createMemoryType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createNetworkType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createHwPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createComplexPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createComplexPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPrescaler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCrossbarSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createBridge()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createLatencyAccessPath()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createHwAccessPath()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createAccessPathRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createLatencyConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createLatencyDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createHwAccessPathRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createHwElementRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createMappingModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCoreAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSectionMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createAbstractElementMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTaskAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createISRAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunnableAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOSModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOsBuffering()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSemaphore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOSEK()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPartlyPFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPfairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPartlyEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createLeastLocalRemainingExecutionTimeFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createEarliestDeadlineFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDeadlineMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRateMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPriorityBasedRoundRobin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createUserSpecificSchedulingAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPriorityBased()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createAlgorithmParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSchedulingHWUnit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSchedulingSWUnit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createVendorOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTaskScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createInterruptController()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOsInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOsAPIInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOsISRInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOsExecutionInstructionsDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOsExecutionInstructionsConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessPrototypeAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunnableAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSectionMappingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createAbstractElementMappingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createHwCoreProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createHwCoreConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createHwMemoryProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createHwMemoryConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createStimuliModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createModeValueList()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createModeValueListEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPeriodic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPeriodicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCustomStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSingle()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createInterProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSporadic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createArrivalCurve()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createArrivalCurveEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createClockTriangleFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createClockSinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createClockMultiplierList()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createClockMultiplierListEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCustomEntity()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCallGraph()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCallSequence()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createModeSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createModeSwitchEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProbabiltitySwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProbabilitySwitchEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCounter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createWaitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSetEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createClearEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createEventMask()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOsEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createInterProcessActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createEnforcedMigration()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTaskRunnableCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSchedulePoint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTerminateProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createISR()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createChainedProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createAccessPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createOrderPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunnable()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createModeLabel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createModeLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverRead()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverWrite()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createAsynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProbabilityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createProbabilityRunnableItem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDeviationRunnableItem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunnableCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createInstructionsDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createInstructionsConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createStructEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPointer()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createTypeRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDataPlatformMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createDataTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createBaseTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createPeriodicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSporadicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createSingleActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createCustomActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createLabelAccessStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createInstructionFetch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 AmaltheaFactory.eINSTANCE.createRunEntityCallStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd(),
				 EcoreFactory.eINSTANCE.createETypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createAmalthea()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSignedTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createFrequency()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDataSize()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDataRate()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.create(AmaltheaPackage.eINSTANCE.getCustomProperty())));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createListObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createStringObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createBigIntegerObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createReferenceObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createIntegerObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createLongObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createFloatObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDoubleObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createBooleanObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTimeObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSignedTimeObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createWeibullParameters()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createWeibullEstimators()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createUniformDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createBoundaries()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createGaussDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createMinAvgMaxStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSingleValueStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createMode()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createModeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createComponentsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createQualifiedPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createFInterfacePort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createConfigModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createEventConfigLink()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createEventConfigElement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunnableSequencingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessRunnableGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessRunnableGroupEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunnableSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSchedulerSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunnablePairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSchedulerPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTargetCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTargetScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTargetProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTargetCallSequence()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSchedulerEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunnableEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessEntityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTagGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createEventChainReference()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSubEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOrderConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSynchronisationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createReactionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDelayConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createAgeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRepetitionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDataAgeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDataAgeCycle()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDataAgeTime()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunnableRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createArchitectureRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessChainRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCPUPercentageRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createFrequencyRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPercentageRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCountRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTimeRequirementLimit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDataCoherencyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunnableScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createComponentScope()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createEventModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createEventSet()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCustomEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createStimulusEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessChainEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunnableEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createLabelEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createHWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createHwSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createECU()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createMicrocontroller()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createQuartz()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createHwComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createAbstractionType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createECUType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createMicrocontrollerType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCoreType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createMemoryType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createNetworkType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createHwPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createComplexPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createComplexPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPrescaler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCrossbarSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createBridge()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createLatencyAccessPath()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createHwAccessPath()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createAccessPathRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createLatencyConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createLatencyDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createHwAccessPathRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createHwElementRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createMappingModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCoreAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSectionMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createAbstractElementMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTaskAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createISRAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunnableAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOSModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOsBuffering()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSemaphore()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOSEK()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPartlyPFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPfairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPartlyEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createLeastLocalRemainingExecutionTimeFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createEarliestDeadlineFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDeadlineMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRateMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPriorityBasedRoundRobin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createUserSpecificSchedulingAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPriorityBased()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createAlgorithmParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSchedulingHWUnit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSchedulingSWUnit()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createVendorOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTaskScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createInterruptController()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOsInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOsAPIInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOsISRInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOsExecutionInstructionsDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOsExecutionInstructionsConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessPrototypeAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunnableAllocationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSectionMappingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createAbstractElementMappingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createHwCoreProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createHwCoreConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createHwMemoryProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createHwMemoryConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createStimuliModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createModeValueList()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createModeValueListEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPeriodic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPeriodicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCustomStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSingle()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createInterProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSporadic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createArrivalCurve()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createArrivalCurveEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createClockTriangleFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createClockSinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createClockMultiplierList()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createClockMultiplierListEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCustomEntity()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCallGraph()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCallSequence()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createModeSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createModeSwitchEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProbabiltitySwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProbabilitySwitchEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCounter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createWaitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSetEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createClearEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createEventMask()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOsEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createInterProcessActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createEnforcedMigration()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTaskRunnableCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSchedulePoint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTerminateProcess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createISR()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createChainedProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createAccessPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createOrderPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunnable()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createModeLabel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createModeLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverRead()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverWrite()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createAsynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProbabilityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createProbabilityRunnableItem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDeviationRunnableItem()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunnableCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createInstructionsDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createInstructionsConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createStructEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPointer()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createTypeRef()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDataPlatformMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createDataTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createBaseTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createPeriodicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSporadicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createSingleActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createCustomActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createLabelAccessStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createInstructionFetch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 AmaltheaFactory.eINSTANCE.createRunEntityCallStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean(),
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
			childFeature == AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd() ||
			childFeature == AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
