/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
 * 
 *  This program and the accompanying materials are made
 *  available under the terms of the Eclipse Public License 2.0
 *  which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.impl;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.CallGraphItem;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Graph Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CallGraphItemImpl#getContainingProcess <em>Containing Process</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CallGraphItemImpl#getContainingRunnable <em>Containing Runnable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CallGraphItemImpl extends BaseObjectImpl implements CallGraphItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallGraphItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getCallGraphItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.app4mc.amalthea.model.Process getContainingProcess() {
		return AmaltheaServices.<org.eclipse.app4mc.amalthea.model.Process>getContainerOfType(this, org.eclipse.app4mc.amalthea.model.Process.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.app4mc.amalthea.model.Runnable getContainingRunnable() {
		return AmaltheaServices.<org.eclipse.app4mc.amalthea.model.Runnable>getContainerOfType(this, org.eclipse.app4mc.amalthea.model.Runnable.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.CALL_GRAPH_ITEM__CONTAINING_PROCESS:
				return getContainingProcess();
			case AmaltheaPackage.CALL_GRAPH_ITEM__CONTAINING_RUNNABLE:
				return getContainingRunnable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.CALL_GRAPH_ITEM__CONTAINING_PROCESS:
				return getContainingProcess() != null;
			case AmaltheaPackage.CALL_GRAPH_ITEM__CONTAINING_RUNNABLE:
				return getContainingRunnable() != null;
		}
		return super.eIsSet(featureID);
	}

} //CallGraphItemImpl
