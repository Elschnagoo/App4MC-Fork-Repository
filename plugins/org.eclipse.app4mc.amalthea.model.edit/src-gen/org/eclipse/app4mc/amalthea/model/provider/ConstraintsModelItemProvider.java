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
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.ConstraintsModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsModelItemProvider extends BaseObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getConstraintsModel_EventChains());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getConstraintsModel_TimingConstraints());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getConstraintsModel_AffinityConstraints());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getConstraintsModel_RunnableSequencingConstraints());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getConstraintsModel_DataAgeConstraints());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getConstraintsModel_Requirements());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getConstraintsModel_DataCoherencyGroups());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getConstraintsModel_PhysicalSectionConstraints());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ConstraintsModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConstraintsModel"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ConstraintsModel_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConstraintsModel.class)) {
			case AmaltheaPackage.CONSTRAINTS_MODEL__EVENT_CHAINS:
			case AmaltheaPackage.CONSTRAINTS_MODEL__TIMING_CONSTRAINTS:
			case AmaltheaPackage.CONSTRAINTS_MODEL__AFFINITY_CONSTRAINTS:
			case AmaltheaPackage.CONSTRAINTS_MODEL__RUNNABLE_SEQUENCING_CONSTRAINTS:
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_AGE_CONSTRAINTS:
			case AmaltheaPackage.CONSTRAINTS_MODEL__REQUIREMENTS:
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_COHERENCY_GROUPS:
			case AmaltheaPackage.CONSTRAINTS_MODEL__PHYSICAL_SECTION_CONSTRAINTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_EventChains(),
				 AmaltheaFactory.eINSTANCE.createEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_TimingConstraints(),
				 AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_TimingConstraints(),
				 AmaltheaFactory.eINSTANCE.createEventChainSynchronizationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_TimingConstraints(),
				 AmaltheaFactory.eINSTANCE.createDelayConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_TimingConstraints(),
				 AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_TimingConstraints(),
				 AmaltheaFactory.eINSTANCE.createRepetitionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_AffinityConstraints(),
				 AmaltheaFactory.eINSTANCE.createRunnableSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_AffinityConstraints(),
				 AmaltheaFactory.eINSTANCE.createProcessSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_AffinityConstraints(),
				 AmaltheaFactory.eINSTANCE.createDataSeparationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_AffinityConstraints(),
				 AmaltheaFactory.eINSTANCE.createRunnablePairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_AffinityConstraints(),
				 AmaltheaFactory.eINSTANCE.createProcessPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_AffinityConstraints(),
				 AmaltheaFactory.eINSTANCE.createDataPairingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_RunnableSequencingConstraints(),
				 AmaltheaFactory.eINSTANCE.createRunnableSequencingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_DataAgeConstraints(),
				 AmaltheaFactory.eINSTANCE.createDataAgeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_Requirements(),
				 AmaltheaFactory.eINSTANCE.createProcessRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_Requirements(),
				 AmaltheaFactory.eINSTANCE.createRunnableRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_Requirements(),
				 AmaltheaFactory.eINSTANCE.createArchitectureRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_Requirements(),
				 AmaltheaFactory.eINSTANCE.createProcessChainRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_DataCoherencyGroups(),
				 AmaltheaFactory.eINSTANCE.createDataCoherencyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConstraintsModel_PhysicalSectionConstraints(),
				 AmaltheaFactory.eINSTANCE.createPhysicalSectionConstraint()));
	}

}
