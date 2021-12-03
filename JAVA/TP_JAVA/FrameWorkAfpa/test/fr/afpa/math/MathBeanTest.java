package fr.afpa.math;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MathBeanTest {
	static MathBean bean;

	@BeforeAll
	public static void onceExecutedBeforeAll() {
		bean = new MathBean();
	}

	@ParameterizedTest
	@CsvSource({ "0,1", "1,1", "3,6", "19,121645100408832000", "20,2432902008176640000" })
	void testFactorielleBigInteger(BigInteger nb, BigInteger expected) {
		// Given

		// When
		BigInteger result = bean.factorielle(nb);
		// Then
		assertEquals(result, expected);
	}
	
	@AfterAll
	public static void oneExecuteAfterAll() {
		bean = null;
	}
	

}
