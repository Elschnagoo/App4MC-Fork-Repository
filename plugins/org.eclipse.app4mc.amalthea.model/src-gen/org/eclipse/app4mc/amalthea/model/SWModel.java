/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SW Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Central instance to provide central access.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getIsrs <em>Isrs</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getRunnables <em>Runnables</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getProcessPrototypes <em>Process Prototypes</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getSections <em>Sections</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getActivations <em>Activations</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getCustomEntities <em>Custom Entities</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getProcessChains <em>Process Chains</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getModes <em>Modes</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getModeLabels <em>Mode Labels</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel()
 * @model
 * @generated
 */
public interface SWModel extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Isrs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ISR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isrs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isrs</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Isrs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISR> getIsrs();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Runnables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnables</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Runnables()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.eclipse.app4mc.amalthea.model.Runnable> getRunnables();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Channels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Process Prototypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ProcessPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Prototypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Prototypes</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_ProcessPrototypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessPrototype> getProcessPrototypes();

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Activations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Activation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activations</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Activations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activation> getActivations();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.OsEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Type Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definitions</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_TypeDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeDefinition> getTypeDefinitions();

	/**
	 * Returns the value of the '<em><b>Custom Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.CustomEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Entities</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_CustomEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomEntity> getCustomEntities();

	/**
	 * Returns the value of the '<em><b>Process Chains</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ProcessChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Chains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Chains</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_ProcessChains()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessChain> getProcessChains();

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Modes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mode> getModes();

	/**
	 * Returns the value of the '<em><b>Mode Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ModeLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Labels</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_ModeLabels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModeLabel> getModeLabels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" modeUnique="false" literalUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((&lt;%org.eclipse.xtext.xbase.lib.StringExtensions%&gt;.isNullOrEmpty(mode) || &lt;%org.eclipse.xtext.xbase.lib.StringExtensions%&gt;.isNullOrEmpty(literal)))\n{\n\treturn null;\n}\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.app4mc.amalthea.model.Mode%&gt;&gt; _modes = this.getModes();\n&lt;%org.eclipse.app4mc.amalthea.model.Mode%&gt; _findFirst = null;\nif (_modes!=null)\n{\n\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.app4mc.amalthea.model.Mode%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.app4mc.amalthea.model.Mode%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n\t{\n\t\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%org.eclipse.app4mc.amalthea.model.Mode%&gt; it)\n\t\t{\n\t\t\t&lt;%java.lang.String%&gt; _name = it.getName();\n\t\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(&lt;%com.google.common.base.Objects%&gt;.equal(_name, mode));\n\t\t}\n\t};\n\t_findFirst=&lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.Mode%&gt;&gt;findFirst(_modes, _function);\n}\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.app4mc.amalthea.model.ModeLiteral%&gt;&gt; _literals = null;\nif (_findFirst!=null)\n{\n\t_literals=_findFirst.getLiterals();\n}\n&lt;%org.eclipse.app4mc.amalthea.model.ModeLiteral%&gt; _findFirst_1 = null;\nif (_literals!=null)\n{\n\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.app4mc.amalthea.model.ModeLiteral%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function_1 = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.app4mc.amalthea.model.ModeLiteral%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n\t{\n\t\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%org.eclipse.app4mc.amalthea.model.ModeLiteral%&gt; it)\n\t\t{\n\t\t\t&lt;%java.lang.String%&gt; _name = it.getName();\n\t\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(&lt;%com.google.common.base.Objects%&gt;.equal(_name, literal));\n\t\t}\n\t};\n\t_findFirst_1=&lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.ModeLiteral%&gt;&gt;findFirst(_literals, _function_1);\n}\nreturn _findFirst_1;'"
	 * @generated
	 */
	ModeLiteral modeLiteral(String mode, String literal);

} // SWModel
