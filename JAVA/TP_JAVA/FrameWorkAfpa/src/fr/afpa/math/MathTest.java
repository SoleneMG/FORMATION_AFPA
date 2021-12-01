package fr.afpa.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void testEuroToDollar() {
		BigDecimal result = new BigDecimal("10");
		BigDecimal expected = new BigDecimal("11.87");
		if(Math.euroToDollar(result).setScale(2, RoundingMode.HALF_EVEN).equals(expected)) {
			System.out.println("testEuroToDollar : TEST OK");
		} else {
			System.err.println("testEuroToDollar : TEST NOK");
		}
	}
	
	@Test
	void testEuroToDollar1() {
		BigDecimal result = new BigDecimal("0");
		BigDecimal expected = new BigDecimal("0.00");
		if(Math.euroToDollar(result).setScale(2, RoundingMode.HALF_EVEN).equals(expected)) {
			System.out.println("testEuroToDollar1 : TEST OK");
		} else {
			System.err.println("testEuroToDollar1 : TEST NOK");
		}
	}

	@Test
	void testDollarToEuro() {
		BigDecimal result = new BigDecimal("10");
		BigDecimal expected = new BigDecimal("8.43");
		if(Math.dollarToEuro(result).setScale(2, RoundingMode.HALF_EVEN).equals(expected)) {
			System.out.println("testdollarToEuro :TEST OK");
		} else {
			System.err.println("testdollarToEuro :TEST NOK");
		}
	}

}
