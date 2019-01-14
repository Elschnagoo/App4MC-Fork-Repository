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

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Channel;
import org.eclipse.app4mc.amalthea.model.CustomEntity;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.ProcessChain;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Section;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TypeDefinition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SW Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getIsrs <em>Isrs</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getRunnables <em>Runnables</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getProcessPrototypes <em>Process Prototypes</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getActivations <em>Activations</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getCustomEntities <em>Custom Entities</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getProcessChains <em>Process Chains</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getModes <em>Modes</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl#getModeLabels <em>Mode Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SWModelImpl extends BaseObjectImpl implements SWModel {
	/**
	 * The cached value of the '{@link #getIsrs() <em>Isrs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsrs()
	 * @generated
	 * @ordered
	 */
	protected EList<ISR> isrs;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getRunnables() <em>Runnables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnables()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.app4mc.amalthea.model.Runnable> runnables;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channels;

	/**
	 * The cached value of the '{@link #getProcessPrototypes() <em>Process Prototypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessPrototypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessPrototype> processPrototypes;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

	/**
	 * The cached value of the '{@link #getActivations() <em>Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<Activation> activations;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<OsEvent> events;

	/**
	 * The cached value of the '{@link #getTypeDefinitions() <em>Type Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDefinition> typeDefinitions;

	/**
	 * The cached value of the '{@link #getCustomEntities() <em>Custom Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomEntity> customEntities;

	/**
	 * The cached value of the '{@link #getProcessChains() <em>Process Chains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessChains()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessChain> processChains;

	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> modes;

	/**
	 * The cached value of the '{@link #getModeLabels() <em>Mode Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeLabel> modeLabels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SWModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSWModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISR> getIsrs() {
		if (isrs == null) {
			isrs = new EObjectContainmentEList<ISR>(ISR.class, this, AmaltheaPackage.SW_MODEL__ISRS);
		}
		return isrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, AmaltheaPackage.SW_MODEL__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.app4mc.amalthea.model.Runnable> getRunnables() {
		if (runnables == null) {
			runnables = new EObjectContainmentEList<org.eclipse.app4mc.amalthea.model.Runnable>(org.eclipse.app4mc.amalthea.model.Runnable.class, this, AmaltheaPackage.SW_MODEL__RUNNABLES);
		}
		return runnables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentEList<Label>(Label.class, this, AmaltheaPackage.SW_MODEL__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentEList<Channel>(Channel.class, this, AmaltheaPackage.SW_MODEL__CHANNELS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessPrototype> getProcessPrototypes() {
		if (processPrototypes == null) {
			processPrototypes = new EObjectContainmentEList<ProcessPrototype>(ProcessPrototype.class, this, AmaltheaPackage.SW_MODEL__PROCESS_PROTOTYPES);
		}
		return processPrototypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, AmaltheaPackage.SW_MODEL__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activation> getActivations() {
		if (activations == null) {
			activations = new EObjectContainmentEList<Activation>(Activation.class, this, AmaltheaPackage.SW_MODEL__ACTIVATIONS);
		}
		return activations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<OsEvent>(OsEvent.class, this, AmaltheaPackage.SW_MODEL__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefinition> getTypeDefinitions() {
		if (typeDefinitions == null) {
			typeDefinitions = new EObjectContainmentEList<TypeDefinition>(TypeDefinition.class, this, AmaltheaPackage.SW_MODEL__TYPE_DEFINITIONS);
		}
		return typeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomEntity> getCustomEntities() {
		if (customEntities == null) {
			customEntities = new EObjectContainmentEList<CustomEntity>(CustomEntity.class, this, AmaltheaPackage.SW_MODEL__CUSTOM_ENTITIES);
		}
		return customEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessChain> getProcessChains() {
		if (processChains == null) {
			processChains = new EObjectContainmentEList<ProcessChain>(ProcessChain.class, this, AmaltheaPackage.SW_MODEL__PROCESS_CHAINS);
		}
		return processChains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getModes() {
		if (modes == null) {
			modes = new EObjectContainmentEList<Mode>(Mode.class, this, AmaltheaPackage.SW_MODEL__MODES);
		}
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeLabel> getModeLabels() {
		if (modeLabels == null) {
			modeLabels = new EObjectContainmentEList<ModeLabel>(ModeLabel.class, this, AmaltheaPackage.SW_MODEL__MODE_LABELS);
		}
		return modeLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeLiteral modeLiteral(final String mode, final String literal) {
		if ((StringExtensions.isNullOrEmpty(mode) || StringExtensions.isNullOrEmpty(literal))) {
			return null;
		}
		EList<Mode> _modes = this.getModes();
		Mode _findFirst = null;
		if (_modes!=null) {
			final Function1<Mode, Boolean> _function = new Function1<Mode, Boolean>() {
				public Boolean apply(final Mode it) {
					String _name = it.getName();
					return Boolean.valueOf(Objects.equal(_name, mode));
				}
			};
			_findFirst=IterableExtensions.<Mode>findFirst(_modes, _function);
		}
		EList<ModeLiteral> _literals = null;
		if (_findFirst!=null) {
			_literals=_findFirst.getLiterals();
		}
		ModeLiteral _findFirst_1 = null;
		if (_literals!=null) {
			final Function1<ModeLiteral, Boolean> _function_1 = new Function1<ModeLiteral, Boolean>() {
				public Boolean apply(final ModeLiteral it) {
					String _name = it.getName();
					return Boolean.valueOf(Objects.equal(_name, literal));
				}
			};
			_findFirst_1=IterableExtensions.<ModeLiteral>findFirst(_literals, _function_1);
		}
		return _findFirst_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SW_MODEL__ISRS:
				return ((InternalEList<?>)getIsrs()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__RUNNABLES:
				return ((InternalEList<?>)getRunnables()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__PROCESS_PROTOTYPES:
				return ((InternalEList<?>)getProcessPrototypes()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__ACTIVATIONS:
				return ((InternalEList<?>)getActivations()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__TYPE_DEFINITIONS:
				return ((InternalEList<?>)getTypeDefinitions()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__CUSTOM_ENTITIES:
				return ((InternalEList<?>)getCustomEntities()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__PROCESS_CHAINS:
				return ((InternalEList<?>)getProcessChains()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__MODES:
				return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SW_MODEL__MODE_LABELS:
				return ((InternalEList<?>)getModeLabels()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.SW_MODEL__ISRS:
				return getIsrs();
			case AmaltheaPackage.SW_MODEL__TASKS:
				return getTasks();
			case AmaltheaPackage.SW_MODEL__RUNNABLES:
				return getRunnables();
			case AmaltheaPackage.SW_MODEL__LABELS:
				return getLabels();
			case AmaltheaPackage.SW_MODEL__CHANNELS:
				return getChannels();
			case AmaltheaPackage.SW_MODEL__PROCESS_PROTOTYPES:
				return getProcessPrototypes();
			case AmaltheaPackage.SW_MODEL__SECTIONS:
				return getSections();
			case AmaltheaPackage.SW_MODEL__ACTIVATIONS:
				return getActivations();
			case AmaltheaPackage.SW_MODEL__EVENTS:
				return getEvents();
			case AmaltheaPackage.SW_MODEL__TYPE_DEFINITIONS:
				return getTypeDefinitions();
			case AmaltheaPackage.SW_MODEL__CUSTOM_ENTITIES:
				return getCustomEntities();
			case AmaltheaPackage.SW_MODEL__PROCESS_CHAINS:
				return getProcessChains();
			case AmaltheaPackage.SW_MODEL__MODES:
				return getModes();
			case AmaltheaPackage.SW_MODEL__MODE_LABELS:
				return getModeLabels();
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
			case AmaltheaPackage.SW_MODEL__ISRS:
				getIsrs().clear();
				getIsrs().addAll((Collection<? extends ISR>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__RUNNABLES:
				getRunnables().clear();
				getRunnables().addAll((Collection<? extends org.eclipse.app4mc.amalthea.model.Runnable>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__PROCESS_PROTOTYPES:
				getProcessPrototypes().clear();
				getProcessPrototypes().addAll((Collection<? extends ProcessPrototype>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Section>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__ACTIVATIONS:
				getActivations().clear();
				getActivations().addAll((Collection<? extends Activation>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends OsEvent>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
				getTypeDefinitions().addAll((Collection<? extends TypeDefinition>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__CUSTOM_ENTITIES:
				getCustomEntities().clear();
				getCustomEntities().addAll((Collection<? extends CustomEntity>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__PROCESS_CHAINS:
				getProcessChains().clear();
				getProcessChains().addAll((Collection<? extends ProcessChain>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__MODES:
				getModes().clear();
				getModes().addAll((Collection<? extends Mode>)newValue);
				return;
			case AmaltheaPackage.SW_MODEL__MODE_LABELS:
				getModeLabels().clear();
				getModeLabels().addAll((Collection<? extends ModeLabel>)newValue);
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
			case AmaltheaPackage.SW_MODEL__ISRS:
				getIsrs().clear();
				return;
			case AmaltheaPackage.SW_MODEL__TASKS:
				getTasks().clear();
				return;
			case AmaltheaPackage.SW_MODEL__RUNNABLES:
				getRunnables().clear();
				return;
			case AmaltheaPackage.SW_MODEL__LABELS:
				getLabels().clear();
				return;
			case AmaltheaPackage.SW_MODEL__CHANNELS:
				getChannels().clear();
				return;
			case AmaltheaPackage.SW_MODEL__PROCESS_PROTOTYPES:
				getProcessPrototypes().clear();
				return;
			case AmaltheaPackage.SW_MODEL__SECTIONS:
				getSections().clear();
				return;
			case AmaltheaPackage.SW_MODEL__ACTIVATIONS:
				getActivations().clear();
				return;
			case AmaltheaPackage.SW_MODEL__EVENTS:
				getEvents().clear();
				return;
			case AmaltheaPackage.SW_MODEL__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
				return;
			case AmaltheaPackage.SW_MODEL__CUSTOM_ENTITIES:
				getCustomEntities().clear();
				return;
			case AmaltheaPackage.SW_MODEL__PROCESS_CHAINS:
				getProcessChains().clear();
				return;
			case AmaltheaPackage.SW_MODEL__MODES:
				getModes().clear();
				return;
			case AmaltheaPackage.SW_MODEL__MODE_LABELS:
				getModeLabels().clear();
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
			case AmaltheaPackage.SW_MODEL__ISRS:
				return isrs != null && !isrs.isEmpty();
			case AmaltheaPackage.SW_MODEL__TASKS:
				return tasks != null && !tasks.isEmpty();
			case AmaltheaPackage.SW_MODEL__RUNNABLES:
				return runnables != null && !runnables.isEmpty();
			case AmaltheaPackage.SW_MODEL__LABELS:
				return labels != null && !labels.isEmpty();
			case AmaltheaPackage.SW_MODEL__CHANNELS:
				return channels != null && !channels.isEmpty();
			case AmaltheaPackage.SW_MODEL__PROCESS_PROTOTYPES:
				return processPrototypes != null && !processPrototypes.isEmpty();
			case AmaltheaPackage.SW_MODEL__SECTIONS:
				return sections != null && !sections.isEmpty();
			case AmaltheaPackage.SW_MODEL__ACTIVATIONS:
				return activations != null && !activations.isEmpty();
			case AmaltheaPackage.SW_MODEL__EVENTS:
				return events != null && !events.isEmpty();
			case AmaltheaPackage.SW_MODEL__TYPE_DEFINITIONS:
				return typeDefinitions != null && !typeDefinitions.isEmpty();
			case AmaltheaPackage.SW_MODEL__CUSTOM_ENTITIES:
				return customEntities != null && !customEntities.isEmpty();
			case AmaltheaPackage.SW_MODEL__PROCESS_CHAINS:
				return processChains != null && !processChains.isEmpty();
			case AmaltheaPackage.SW_MODEL__MODES:
				return modes != null && !modes.isEmpty();
			case AmaltheaPackage.SW_MODEL__MODE_LABELS:
				return modeLabels != null && !modeLabels.isEmpty();
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
			case AmaltheaPackage.SW_MODEL___MODE_LITERAL__STRING_STRING:
				return modeLiteral((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SWModelImpl
