/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CallArgument#getContainingCall <em>Containing Call</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CallArgument#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CallArgument#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallArgument()
 * @model
 * @generated
 */
public interface CallArgument extends ReferableObject {
	/**
	 * Returns the value of the '<em><b>Containing Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.RunnableCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Call</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Call</em>' container reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallArgument_ContainingCall()
	 * @see org.eclipse.app4mc.amalthea.model.RunnableCall#getArguments
	 * @model opposite="arguments" transient="false" changeable="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only'"
	 * @generated
	 */
	RunnableCall getContainingCall();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(RunnableParameter)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallArgument_Parameter()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Main'"
	 * @generated
	 */
	RunnableParameter getParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CallArgument#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(RunnableParameter value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference.
	 * @see #setDependsOn(DataDependency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallArgument_DependsOn()
	 * @model containment="true"
	 * @generated
	 */
	DataDependency getDependsOn();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CallArgument#getDependsOn <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' containment reference.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(DataDependency value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _xifexpression = null;\nboolean _isNullOrEmpty = &lt;%org.eclipse.xtext.xbase.lib.StringExtensions%&gt;.isNullOrEmpty(super.getName());\nif (_isNullOrEmpty)\n{\n\t_xifexpression = \"access.1\";\n}\nelse\n{\n\t_xifexpression = super.getName();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.app4mc.amalthea.model.RunnableCall%&gt; _containingCall = this.getContainingCall();\n&lt;%org.eclipse.app4mc.amalthea.model.Runnable%&gt; _containingRunnable = null;\nif (_containingCall!=null)\n{\n\t_containingRunnable=_containingCall.getContainingRunnable();\n}\n&lt;%java.lang.String%&gt; _name = null;\nif (_containingRunnable!=null)\n{\n\t_name=_containingRunnable.getName();\n}\n&lt;%java.lang.String%&gt; _encode = this.encode(_name);\n&lt;%java.lang.String%&gt; _plus = (_encode + \"/calls/\");\n&lt;%org.eclipse.app4mc.amalthea.model.RunnableCall%&gt; _containingCall_1 = this.getContainingCall();\n&lt;%org.eclipse.app4mc.amalthea.model.Runnable%&gt; _runnable = null;\nif (_containingCall_1!=null)\n{\n\t_runnable=_containingCall_1.getRunnable();\n}\n&lt;%java.lang.String%&gt; _name_1 = null;\nif (_runnable!=null)\n{\n\t_name_1=_runnable.getName();\n}\n&lt;%java.lang.String%&gt; _encode_1 = this.encode(_name_1);\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _encode_1);\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + \"/param/\");\n&lt;%org.eclipse.app4mc.amalthea.model.RunnableParameter%&gt; _parameter = this.getParameter();\n&lt;%java.lang.String%&gt; _name_2 = null;\nif (_parameter!=null)\n{\n\t_name_2=_parameter.getName();\n}\n&lt;%java.lang.String%&gt; _encode_2 = this.encode(_name_2);\n&lt;%java.lang.String%&gt; _plus_3 = (_plus_2 + _encode_2);\n&lt;%java.lang.String%&gt; _plus_4 = (_plus_3 + \"/\");\n&lt;%java.lang.String%&gt; _encode_3 = this.encode(this.getName());\n&lt;%java.lang.String%&gt; _plus_5 = (_plus_4 + _encode_3);\n&lt;%java.lang.String%&gt; _plus_6 = (_plus_5 + \"?type=\");\n&lt;%java.lang.String%&gt; _name_3 = this.eClass().getName();\nreturn (_plus_6 + _name_3);'"
	 * @generated
	 */
	String computeUniqueName();

} // CallArgument
