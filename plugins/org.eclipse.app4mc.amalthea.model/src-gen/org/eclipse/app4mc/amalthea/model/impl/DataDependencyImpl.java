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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.CallArgument;
import org.eclipse.app4mc.amalthea.model.DataDependency;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataDependencyImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataDependencyImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataDependencyImpl#getCallArguments <em>Call Arguments</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataDependencyImpl#getContainingRunnable <em>Containing Runnable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDependencyImpl extends BaseObjectImpl implements DataDependency {
	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableParameter> parameters;

	/**
	 * The cached value of the '{@link #getCallArguments() <em>Call Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<CallArgument> callArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDataDependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectResolvingEList<Label>(Label.class, this, AmaltheaPackage.DATA_DEPENDENCY__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RunnableParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<RunnableParameter>(RunnableParameter.class, this, AmaltheaPackage.DATA_DEPENDENCY__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CallArgument> getCallArguments() {
		if (callArguments == null) {
			callArguments = new EObjectResolvingEList<CallArgument>(CallArgument.class, this, AmaltheaPackage.DATA_DEPENDENCY__CALL_ARGUMENTS);
		}
		return callArguments;
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
			case AmaltheaPackage.DATA_DEPENDENCY__LABELS:
				return getLabels();
			case AmaltheaPackage.DATA_DEPENDENCY__PARAMETERS:
				return getParameters();
			case AmaltheaPackage.DATA_DEPENDENCY__CALL_ARGUMENTS:
				return getCallArguments();
			case AmaltheaPackage.DATA_DEPENDENCY__CONTAINING_RUNNABLE:
				return getContainingRunnable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.DATA_DEPENDENCY__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case AmaltheaPackage.DATA_DEPENDENCY__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends RunnableParameter>)newValue);
				return;
			case AmaltheaPackage.DATA_DEPENDENCY__CALL_ARGUMENTS:
				getCallArguments().clear();
				getCallArguments().addAll((Collection<? extends CallArgument>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.DATA_DEPENDENCY__LABELS:
				getLabels().clear();
				return;
			case AmaltheaPackage.DATA_DEPENDENCY__PARAMETERS:
				getParameters().clear();
				return;
			case AmaltheaPackage.DATA_DEPENDENCY__CALL_ARGUMENTS:
				getCallArguments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.DATA_DEPENDENCY__LABELS:
				return labels != null && !labels.isEmpty();
			case AmaltheaPackage.DATA_DEPENDENCY__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case AmaltheaPackage.DATA_DEPENDENCY__CALL_ARGUMENTS:
				return callArguments != null && !callArguments.isEmpty();
			case AmaltheaPackage.DATA_DEPENDENCY__CONTAINING_RUNNABLE:
				return getContainingRunnable() != null;
		}
		return super.eIsSet(featureID);
	}

} //DataDependencyImpl
