package fr.afpa.math;

import java.math.BigInteger;

public class MathBean {
	public BigInteger factorielle(BigInteger value) throws StackOverflowError, IllegalArgumentException {
		if (value.compareTo(new BigInteger("0"))==-1) {
			throw new IllegalArgumentException();
		} else if (value.compareTo(new BigInteger("0")) == 0 || value.compareTo(new BigInteger("1")) == 0) { // = 0 ou = 1
			return new BigInteger("1");
		}
		return value.multiply(factorielle(value.subtract(new BigInteger("1"))));

	}
}
