/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

public class AmaltheaServices {

	public static BigInteger convertToBit(DataSize size) {
		if (size == null || size.getValue() == null) return null;

		BigInteger bitBase = size.getValue();
		BigInteger byteBase = size.getValue().multiply(BigInteger.valueOf(8));
		
		switch (size.getUnit()) {
		case _UNDEFINED_:
			return null;
		case BIT:
			return bitBase;
		case KBIT:
			return bitBase.multiply(BigInteger.TEN.pow(3));
		case MBIT:
			return bitBase.multiply(BigInteger.TEN.pow(6));
		case GBIT:
			return bitBase.multiply(BigInteger.TEN.pow(9));
		case TBIT:
			return bitBase.multiply(BigInteger.TEN.pow(12));
			
		case KIBIT:
			return bitBase.multiply(BigInteger.valueOf(2).pow(10));
		case MIBIT:
			return bitBase.multiply(BigInteger.valueOf(2).pow(20));
		case GIBIT:
			return bitBase.multiply(BigInteger.valueOf(2).pow(30));
		case TIBIT:
			return bitBase.multiply(BigInteger.valueOf(2).pow(40));

		case B:
			return byteBase;
		case KB:
			return byteBase.multiply(BigInteger.TEN.pow(3));
		case MB:
			return byteBase.multiply(BigInteger.TEN.pow(6));
		case GB:
			return byteBase.multiply(BigInteger.TEN.pow(9));
		case TB:
			return byteBase.multiply(BigInteger.TEN.pow(12));
			
		case KI_B:
			return byteBase.multiply(BigInteger.valueOf(2).pow(10));
		case MI_B:
			return byteBase.multiply(BigInteger.valueOf(2).pow(20));
		case GI_B:
			return byteBase.multiply(BigInteger.valueOf(2).pow(30));
		case TI_B:
			return byteBase.multiply(BigInteger.valueOf(2).pow(40));
		}
		
		return null;
	}
	
	public static BigDecimal convertToHz(Frequency frequency) {
		if (frequency == null || frequency.getValue() == 0.0) return null;

		double freqValue = frequency.getValue();
		
		switch (frequency.getUnit()) {
		case _UNDEFINED_:
			return null;
		case HZ:
			return BigDecimal.valueOf(freqValue);
		case KHZ:
			return BigDecimal.valueOf(freqValue).multiply(BigDecimal.TEN.pow(3));
		case MHZ:
			return BigDecimal.valueOf(freqValue).multiply(BigDecimal.TEN.pow(6));
		case GHZ:
			return BigDecimal.valueOf(freqValue).multiply(BigDecimal.TEN.pow(9));
		}
		
		return null;
	}
	
	public static EList<QualifiedPort> getInnerPorts(ISystem system) {
		List<QualifiedPort> qualifiedPorts = new ArrayList<QualifiedPort>();
		for (ComponentInstance inst : system.getComponentInstances()) {
			if (inst.getType() != null) {
				for (Port port : inst.getType().getPorts()) {
					QualifiedPort qp = AmaltheaFactory.eINSTANCE.createQualifiedPort();
					qp.setInstance(inst);
					qp.setPort(port);
					qualifiedPorts.add(qp);
				}
			}
		}
		
		if (qualifiedPorts.isEmpty()) {
			return  ECollections.emptyEList();			
		} else {
			return ECollections.unmodifiableEList(qualifiedPorts);
		}
	}
	
	/**
	 * This method is used to compare AbstractTime objects (Time/TimeObject) on
	 * the basis of their values (obtained in pico seconds after applying the conversion based on
	 * TimeUnit)
	 *  
	 * @param t1 AbstractTime object
	 * @param t2 AbstractTime object
	 * @return -1 ,0 or 1 
	 */
	public static int compareTimeElement(final AbstractTime t1, final AbstractTime t2) {

		if(t1 == t2){
			return 0;
		}
		//ensure that Null values are not used for comparison
		if(t1== null || t2==null){
			throw new NullPointerException();
		}
		//ensure that both objects belong to same EClass e.g: either Time or TimeObject
		if(t1.eClass() !=t2.eClass()){
			throw new UnsupportedOperationException("Can not compare AbstractTime objects of different types :" + t1.eClass().getName()+" , "+t2.eClass().getName() );
		}
		
		BigInteger value1 = convertToPS(t1);
		
		if(value1 ==null){
			throw new RuntimeException("Unable to convert value of Time/TimeObject to Pico Seconds : "+ t1);
		}

		BigInteger value2 = convertToPS(t2);
		
		if(value2 ==null){
			throw new RuntimeException("Unable to convert value of Time/TimeObject to Pico Seconds : "+ t2);
		}

		return value1.compareTo(value2);
	}

	/**
	 * This method is used to convert the value of Time/TimeObject element's value to BigInteger in Pico Seconds
	 * @param abstractTime AbstractTime object 
	 * @return value BigInteger in Pico Seconds
	 */
	public static BigInteger convertToPS(AbstractTime abstractTime){

		BigInteger timeValue = abstractTime.getValue();
		
		if(timeValue !=null){
			
			switch (abstractTime.getUnit()) {
			case _UNDEFINED_:
				return null;
			case PS:
				return  timeValue;
			case NS: 
				return timeValue.multiply(BigInteger.TEN.pow(3));
			case US:
				return timeValue.multiply(BigInteger.TEN.pow(6));
			case MS:
				return timeValue.multiply(BigInteger.TEN.pow(9));
			case S:
				return timeValue.multiply(BigInteger.TEN.pow(12));
			}
			
		}

		return null;
	}
	
}
