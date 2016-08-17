package org.eclipse.app4mc.amalthea.model;

import java.math.BigInteger;

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

		case BYTE:
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
}
