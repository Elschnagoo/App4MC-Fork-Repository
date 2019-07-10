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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.ASILType;
import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallGraphItem;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunction;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.model.Section;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getExecutionCondition <em>Execution Condition</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getCallGraph <em>Call Graph</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getActivations <em>Activations</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#isCallback <em>Callback</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#isService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getAsilLevel <em>Asil Level</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getRunnableCalls <em>Runnable Calls</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getReferringComponents <em>Referring Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunnableImpl extends AbstractMemoryElementImpl implements org.eclipse.app4mc.amalthea.model.Runnable {
	/**
	 * The cached value of the '{@link #getExecutionCondition() <em>Execution Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionCondition()
	 * @generated
	 * @ordered
	 */
	protected ModeConditionDisjunction executionCondition;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableParameter> parameters;

	/**
	 * The cached value of the '{@link #getCallGraph() <em>Call Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallGraph()
	 * @generated
	 * @ordered
	 */
	protected CallGraph callGraph;

	/**
	 * The cached value of the '{@link #getActivations() <em>Activations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<Activation> activations;

	/**
	 * The default value of the '{@link #isCallback() <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallback()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALLBACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallback() <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallback()
	 * @generated
	 * @ordered
	 */
	protected boolean callback = CALLBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #isService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected boolean service = SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsilLevel() <em>Asil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsilLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ASILType ASIL_LEVEL_EDEFAULT = ASILType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getAsilLevel() <em>Asil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsilLevel()
	 * @generated
	 * @ordered
	 */
	protected ASILType asilLevel = ASIL_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected Section section;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getRunnable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeConditionDisjunction getExecutionCondition() {
		return executionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionCondition(ModeConditionDisjunction newExecutionCondition, NotificationChain msgs) {
		ModeConditionDisjunction oldExecutionCondition = executionCondition;
		executionCondition = newExecutionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__EXECUTION_CONDITION, oldExecutionCondition, newExecutionCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionCondition(ModeConditionDisjunction newExecutionCondition) {
		if (newExecutionCondition != executionCondition) {
			NotificationChain msgs = null;
			if (executionCondition != null)
				msgs = ((InternalEObject)executionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE__EXECUTION_CONDITION, null, msgs);
			if (newExecutionCondition != null)
				msgs = ((InternalEObject)newExecutionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE__EXECUTION_CONDITION, null, msgs);
			msgs = basicSetExecutionCondition(newExecutionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__EXECUTION_CONDITION, newExecutionCondition, newExecutionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RunnableParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<RunnableParameter>(RunnableParameter.class, this, AmaltheaPackage.RUNNABLE__PARAMETERS, AmaltheaPackage.RUNNABLE_PARAMETER__CONTAINING_RUNNABLE);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallGraph getCallGraph() {
		return callGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallGraph(CallGraph newCallGraph, NotificationChain msgs) {
		CallGraph oldCallGraph = callGraph;
		callGraph = newCallGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__CALL_GRAPH, oldCallGraph, newCallGraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallGraph(CallGraph newCallGraph) {
		if (newCallGraph != callGraph) {
			NotificationChain msgs = null;
			if (callGraph != null)
				msgs = ((InternalEObject)callGraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE__CALL_GRAPH, null, msgs);
			if (newCallGraph != null)
				msgs = ((InternalEObject)newCallGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE__CALL_GRAPH, null, msgs);
			msgs = basicSetCallGraph(newCallGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__CALL_GRAPH, newCallGraph, newCallGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activation> getActivations() {
		if (activations == null) {
			activations = new EObjectResolvingEList<Activation>(Activation.class, this, AmaltheaPackage.RUNNABLE__ACTIVATIONS);
		}
		return activations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCallback() {
		return callback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallback(boolean newCallback) {
		boolean oldCallback = callback;
		callback = newCallback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__CALLBACK, oldCallback, callback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService(boolean newService) {
		boolean oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASILType getAsilLevel() {
		return asilLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsilLevel(ASILType newAsilLevel) {
		ASILType oldAsilLevel = asilLevel;
		asilLevel = newAsilLevel == null ? ASIL_LEVEL_EDEFAULT : newAsilLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__ASIL_LEVEL, oldAsilLevel, asilLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section getSection() {
		if (section != null && section.eIsProxy()) {
			InternalEObject oldSection = (InternalEObject)section;
			section = (Section)eResolveProxy(oldSection);
			if (section != oldSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE__SECTION, oldSection, section));
			}
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section basicGetSection() {
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSection(Section newSection) {
		Section oldSection = section;
		section = newSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__SECTION, oldSection, section));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RunnableCall> getRunnableCalls() {
		EReference _runnableCall_Runnable = AmaltheaPackage.eINSTANCE.getRunnableCall_Runnable();
		return AmaltheaIndex.<RunnableCall>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getRunnable_RunnableCalls(), 
			java.util.Collections.<EReference>unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EReference>newHashSet(_runnableCall_Runnable)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getReferringComponents() {
		EReference _component_Runnables = AmaltheaPackage.eINSTANCE.getComponent_Runnables();
		return AmaltheaIndex.<Component>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getRunnable_ReferringComponents(), 
			java.util.Collections.<EReference>unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EReference>newHashSet(_component_Runnables)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CallGraphItem> getRunnableItems() {
		EList<CallGraphItem> _xblockexpression = null;
		{
			CallGraph _callGraph = this.getCallGraph();
			boolean _tripleEquals = (_callGraph == null);
			if (_tripleEquals) {
				this.setCallGraph(AmaltheaFactory.eINSTANCE.createCallGraph());
			}
			_xblockexpression = this.getCallGraph().getItems();
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activation getFirstActivation() {
		return IterableExtensions.<Activation>head(this.getActivations());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.RUNNABLE__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.RUNNABLE__EXECUTION_CONDITION:
				return basicSetExecutionCondition(null, msgs);
			case AmaltheaPackage.RUNNABLE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.RUNNABLE__CALL_GRAPH:
				return basicSetCallGraph(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.RUNNABLE__EXECUTION_CONDITION:
				return getExecutionCondition();
			case AmaltheaPackage.RUNNABLE__PARAMETERS:
				return getParameters();
			case AmaltheaPackage.RUNNABLE__CALL_GRAPH:
				return getCallGraph();
			case AmaltheaPackage.RUNNABLE__ACTIVATIONS:
				return getActivations();
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				return isCallback();
			case AmaltheaPackage.RUNNABLE__SERVICE:
				return isService();
			case AmaltheaPackage.RUNNABLE__ASIL_LEVEL:
				return getAsilLevel();
			case AmaltheaPackage.RUNNABLE__SECTION:
				if (resolve) return getSection();
				return basicGetSection();
			case AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS:
				return getRunnableCalls();
			case AmaltheaPackage.RUNNABLE__REFERRING_COMPONENTS:
				return getReferringComponents();
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
			case AmaltheaPackage.RUNNABLE__EXECUTION_CONDITION:
				setExecutionCondition((ModeConditionDisjunction)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends RunnableParameter>)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__CALL_GRAPH:
				setCallGraph((CallGraph)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__ACTIVATIONS:
				getActivations().clear();
				getActivations().addAll((Collection<? extends Activation>)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				setCallback((Boolean)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__SERVICE:
				setService((Boolean)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__ASIL_LEVEL:
				setAsilLevel((ASILType)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__SECTION:
				setSection((Section)newValue);
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
			case AmaltheaPackage.RUNNABLE__EXECUTION_CONDITION:
				setExecutionCondition((ModeConditionDisjunction)null);
				return;
			case AmaltheaPackage.RUNNABLE__PARAMETERS:
				getParameters().clear();
				return;
			case AmaltheaPackage.RUNNABLE__CALL_GRAPH:
				setCallGraph((CallGraph)null);
				return;
			case AmaltheaPackage.RUNNABLE__ACTIVATIONS:
				getActivations().clear();
				return;
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				setCallback(CALLBACK_EDEFAULT);
				return;
			case AmaltheaPackage.RUNNABLE__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case AmaltheaPackage.RUNNABLE__ASIL_LEVEL:
				setAsilLevel(ASIL_LEVEL_EDEFAULT);
				return;
			case AmaltheaPackage.RUNNABLE__SECTION:
				setSection((Section)null);
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
			case AmaltheaPackage.RUNNABLE__EXECUTION_CONDITION:
				return executionCondition != null;
			case AmaltheaPackage.RUNNABLE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case AmaltheaPackage.RUNNABLE__CALL_GRAPH:
				return callGraph != null;
			case AmaltheaPackage.RUNNABLE__ACTIVATIONS:
				return activations != null && !activations.isEmpty();
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				return callback != CALLBACK_EDEFAULT;
			case AmaltheaPackage.RUNNABLE__SERVICE:
				return service != SERVICE_EDEFAULT;
			case AmaltheaPackage.RUNNABLE__ASIL_LEVEL:
				return asilLevel != ASIL_LEVEL_EDEFAULT;
			case AmaltheaPackage.RUNNABLE__SECTION:
				return section != null;
			case AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS:
				return !getRunnableCalls().isEmpty();
			case AmaltheaPackage.RUNNABLE__REFERRING_COMPONENTS:
				return !getReferringComponents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AmaltheaPackage.RUNNABLE___GET_RUNNABLE_ITEMS:
				return getRunnableItems();
			case AmaltheaPackage.RUNNABLE___GET_FIRST_ACTIVATION:
				return getFirstActivation();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (callback: ");
		result.append(callback);
		result.append(", service: ");
		result.append(service);
		result.append(", asilLevel: ");
		result.append(asilLevel);
		result.append(')');
		return result.toString();
	}

} //RunnableImpl
