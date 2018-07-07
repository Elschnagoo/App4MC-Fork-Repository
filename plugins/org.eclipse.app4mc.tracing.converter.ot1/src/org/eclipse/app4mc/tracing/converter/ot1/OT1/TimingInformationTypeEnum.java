/**
 ********************************************************************************
 * Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *     Generated using Eclipse EMF
 * 
 ********************************************************************************
 */

package org.eclipse.app4mc.tracing.converter.ot1.OT1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Timing Information Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Die Auflistung aller Basis-Timing-Typen:
 * 				CET: Core
 * 				Execution Time
 * 				GET: Gross Execution Time
 * 				DT: Delta Time
 * 				RT: Response
 * 				Time
 * 				ST: Slack Time
 * 				IPT: Inital Pending Time
 * 				PRE: Preemption Time
 * 				OFF:
 * 				Offset
 * 				PER: Period
 * 				CPU: CPU load
 * 				CAF: Code Access Frequency
 * 				DAF: Data
 * 				Access Frequency
 * 				DAT: Data Access Time
 * 				TT: Transmission Time
 * 			
 * <!-- end-model-doc -->
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingInformationTypeEnum()
 * @model extendedMetaData="name='TimingInformationTypeEnum'"
 * @generated
 */
public enum TimingInformationTypeEnum implements Enumerator {
	/**
	 * The '<em><b>CET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CET_VALUE
	 * @generated
	 * @ordered
	 */
	CET(0, "CET", "CET"),

	/**
	 * The '<em><b>GET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_VALUE
	 * @generated
	 * @ordered
	 */
	GET(1, "GET", "GET"),

	/**
	 * The '<em><b>DT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DT_VALUE
	 * @generated
	 * @ordered
	 */
	DT(2, "DT", "DT"),

	/**
	 * The '<em><b>ST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ST_VALUE
	 * @generated
	 * @ordered
	 */
	ST(3, "ST", "ST"),

	/**
	 * The '<em><b>RT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RT_VALUE
	 * @generated
	 * @ordered
	 */
	RT(4, "RT", "RT"),

	/**
	 * The '<em><b>IPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPT_VALUE
	 * @generated
	 * @ordered
	 */
	IPT(5, "IPT", "IPT"),

	/**
	 * The '<em><b>PRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_VALUE
	 * @generated
	 * @ordered
	 */
	PRE(6, "PRE", "PRE"),

	/**
	 * The '<em><b>OFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_VALUE
	 * @generated
	 * @ordered
	 */
	OFF(7, "OFF", "OFF"),

	/**
	 * The '<em><b>PER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_VALUE
	 * @generated
	 * @ordered
	 */
	PER(8, "PER", "PER"),

	/**
	 * The '<em><b>WT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WT_VALUE
	 * @generated
	 * @ordered
	 */
	WT(9, "WT", "WT"),

	/**
	 * The '<em><b>CPU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_VALUE
	 * @generated
	 * @ordered
	 */
	CPU(10, "CPU", "CPU"),

	/**
	 * The '<em><b>CAF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAF_VALUE
	 * @generated
	 * @ordered
	 */
	CAF(11, "CAF", "CAF"),

	/**
	 * The '<em><b>DAF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAF_VALUE
	 * @generated
	 * @ordered
	 */
	DAF(12, "DAF", "DAF"),

	/**
	 * The '<em><b>DAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAT_VALUE
	 * @generated
	 * @ordered
	 */
	DAT(13, "DAT", "DAT"),

	/**
	 * The '<em><b>TT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TT_VALUE
	 * @generated
	 * @ordered
	 */
	TT(14, "TT", "TT");

	/**
	 * The '<em><b>CET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CET_VALUE = 0;

	/**
	 * The '<em><b>GET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_VALUE = 1;

	/**
	 * The '<em><b>DT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DT_VALUE = 2;

	/**
	 * The '<em><b>ST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ST_VALUE = 3;

	/**
	 * The '<em><b>RT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RT_VALUE = 4;

	/**
	 * The '<em><b>IPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPT_VALUE = 5;

	/**
	 * The '<em><b>PRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRE_VALUE = 6;

	/**
	 * The '<em><b>OFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFF_VALUE = 7;

	/**
	 * The '<em><b>PER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PER_VALUE = 8;

	/**
	 * The '<em><b>WT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WT_VALUE = 9;

	/**
	 * The '<em><b>CPU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CPU_VALUE = 10;

	/**
	 * The '<em><b>CAF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAF_VALUE = 11;

	/**
	 * The '<em><b>DAF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAF_VALUE = 12;

	/**
	 * The '<em><b>DAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAT_VALUE = 13;

	/**
	 * The '<em><b>TT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TT_VALUE = 14;

	/**
	 * An array of all the '<em><b>Timing Information Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimingInformationTypeEnum[] VALUES_ARRAY =
		new TimingInformationTypeEnum[] {
			CET,
			GET,
			DT,
			ST,
			RT,
			IPT,
			PRE,
			OFF,
			PER,
			WT,
			CPU,
			CAF,
			DAF,
			DAT,
			TT,
		};

	/**
	 * A public read-only list of all the '<em><b>Timing Information Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimingInformationTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Timing Information Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingInformationTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingInformationTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Information Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingInformationTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingInformationTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Information Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingInformationTypeEnum get(int value) {
		switch (value) {
			case CET_VALUE: return CET;
			case GET_VALUE: return GET;
			case DT_VALUE: return DT;
			case ST_VALUE: return ST;
			case RT_VALUE: return RT;
			case IPT_VALUE: return IPT;
			case PRE_VALUE: return PRE;
			case OFF_VALUE: return OFF;
			case PER_VALUE: return PER;
			case WT_VALUE: return WT;
			case CPU_VALUE: return CPU;
			case CAF_VALUE: return CAF;
			case DAF_VALUE: return DAF;
			case DAT_VALUE: return DAT;
			case TT_VALUE: return TT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimingInformationTypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TimingInformationTypeEnum
