package fr.afpa.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Math {
	public static final BigDecimal TAUX_EURO_DOLLAR = new BigDecimal("1.18674");

	public static BigDecimal euroToDollar(BigDecimal value) {
		return value.multiply(TAUX_EURO_DOLLAR);
	}

	public static BigDecimal dollarToEuro(BigDecimal value) {
		return value.divide(TAUX_EURO_DOLLAR, 2, RoundingMode.HALF_EVEN);
	}

	public static BigDecimal scale(BigDecimal value) {
		return value.setScale(2, RoundingMode.HALF_EVEN);
	}

	public static Long factorielle(Long value) throws IllegalArgumentException{
		if (value < 0) {
			throw new IllegalArgumentException();
		} else if (value > 20) {
			throw new IllegalArgumentException();
		} else if (value == 0 || value == 1) {
			return 1L;
		}
		return value * factorielle(value - 1);

	}
	
	public static BigInteger factorielle(BigInteger value) throws StackOverflowError, IllegalArgumentException {
		if (value.compareTo(new BigInteger("0"))==-1) {
			throw new IllegalArgumentException();
		} else if (value.compareTo(new BigInteger("0")) == 0 || value.compareTo(new BigInteger("1")) == 0) { // = 0 ou = 1
			return new BigInteger("1");
		}
		return value.multiply(factorielle(value.subtract(new BigInteger("1"))));

	}
}
