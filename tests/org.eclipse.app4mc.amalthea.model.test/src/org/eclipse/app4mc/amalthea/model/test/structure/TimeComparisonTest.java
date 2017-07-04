package org.eclipse.app4mc.amalthea.model.test.structure;

import java.math.BigInteger;

import org.eclipse.app4mc.amalthea.model.AbstractTime;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeObject;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.core.runtime.Assert;
import org.junit.Test;



public class TimeComparisonTest {

	@Test
	public void case1() {
		
		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000", "ms");
		
		int compareTo = t1.compareTo(t2);

		Assert.isTrue(compareTo==0,"Failed to compare Time objects having TimeUnit second and Millisecond");
		
	}
	
	@Test
	public void case2() {
		
		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000000", "us");
		
		int compareTo = t1.compareTo(t2);

		Assert.isTrue(compareTo==0,"Failed to compare Time objects having TimeUnit second and Microsecond");
		
	}
	
	@Test
	public void case3() {
		
		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000000000", "ns");
		
		int compareTo = t1.compareTo(t2);

		Assert.isTrue(compareTo==0,"Failed to compare Time objects having TimeUnit second and Nanosecond");
		
	}
	
	@Test
	public void case4() {
		
		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000000000000", "ps");
		
		int compareTo = t1.compareTo(t2);

		Assert.isTrue(compareTo==0,"Failed to compare Time objects having TimeUnit second and Picosecond");
		
	}
	
	@Test
	public void case5() {
		
		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000", "-");
		
		boolean isExceptionThrown=false;
		
		try {
			 t1.compareTo(t2);
		} catch (RuntimeException e) {
			isExceptionThrown=true;
		}
		
		Assert.isTrue(isExceptionThrown,"Failed to compare Time objects");
		
	}
	
	@Test
	public void case6() {
		
		Time t1 = createTime("1", "s");;

		Assert.isTrue(t1.compareTo(t1)==0,"Failed to compare Time objects which are same");
		
	}
	
	
	@Test
	public void case7() {
		
		Time t1 = null;
		Time t2 = null;
		
		
		Assert.isTrue(AmaltheaServices.compareTimeElement(t1, t2)==0,"Failed to compare Time objects");
		
	}
	
	@Test
	public void case8() {
		
		Time t1 = createTime("1", "s");
		Time t2 = null;
		
		boolean isExceptionThrown=false;
		
		try {
			 t1.compareTo(t2);
		} catch (RuntimeException e) {
			isExceptionThrown=true;
		}
		
		Assert.isTrue(isExceptionThrown,"Failed to compare Time objects");
		
	}
	
	
	@Test
	public void case9() {
		
		TimeObject t1 = createTimeObject("1", "s");
		Time t2 = createTime("1000000000000", "ps");
		
		Exception e = null;
		try{
				t1.compareTo(t2);
			
		}catch(Exception e1){
			e=e1;
		}

		Assert.isTrue(e.getMessage().contains("Can not compare AbstractTime objects of different types :TimeObject , Time"),"Failed to compare Time and TimeObjec - > Exception is not thrown..");
		
	}
	
	

	private Time createTime(String value1, String unit1) {

		Time time1 = AmaltheaFactory.eINSTANCE.createTime();

		time1.setValue(new BigInteger(value1));

		time1.setUnit(TimeUnit.get(unit1));

		return time1;
	}

	private TimeObject createTimeObject(String value1, String unit1) {

		TimeObject timeObject = AmaltheaFactory.eINSTANCE.createTimeObject();

		timeObject.setValue(new BigInteger(value1));

		timeObject.setUnit(TimeUnit.get(unit1));

		return timeObject;
	}
 
}
