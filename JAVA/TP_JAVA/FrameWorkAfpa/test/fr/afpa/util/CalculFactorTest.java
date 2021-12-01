package fr.afpa.util;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class MathTest {

	@Test
	public void test_factorielle() {
		//Given
		Long nb = 21L;
		Object expected = new IllegalArgumentException();
		//When
		Long result = fr.afpa.math.Math.factorielle(nb);
		//Then
		Assertions.assertEquals(expected, result);
	}
	
	/*
	 * private static Stream<Arguments> getNumber(){ return Stream.of(
	 * Arguments.of(21L, new IllegalArgumentException()), Arguments.of(5L, 120L),
	 * Arguments.of(-5, new IllegalArgumentException()));
	 * 
	 * }
	 */

}
