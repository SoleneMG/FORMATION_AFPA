package main.java.domain;

import java.math.BigInteger;

public class MathBean {
	public BigInteger factorielle(BigInteger value) throws MathException { // StackOverflowError, IllegalArgumentException 
		try {
		if (value.compareTo(new BigInteger("0"))==-1) {
			throw new MathException("IllegalArgument Exception");
		} else if (value.compareTo(new BigInteger("0")) == 0 || value.compareTo(new BigInteger("1")) == 0) { // = 0 ou = 1
			return new BigInteger("1");
		}
		return value.multiply(factorielle(value.subtract(new BigInteger("1"))));
		} catch (StackOverflowError e) {
			throw new MathException("StackOverflow Exception");
		}
	}
}
