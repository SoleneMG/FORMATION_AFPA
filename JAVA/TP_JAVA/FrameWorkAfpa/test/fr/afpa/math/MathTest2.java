package fr.afpa.math;

import static fr.afpa.math.Math.factorielle;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.math.BigInteger;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class MathTest2 {

	@ParameterizedTest
	@CsvSource({ 
		"0,1", 
		"1,1", 
		"3,6", 
		"19,121645100408832000", 
		"20,2432902008176640000" })
	void testFactorielleLong(long nb, long expected) {
		// Given

		// When
		long result = factorielle(nb);
		// Then
		assertEquals(result, expected);
	}

	@ParameterizedTest
	@MethodSource("addArgumentsLong")
	void testFactorielleExceptionLong(long nb, Class<Exception> expectedException) {

		assertThrows(null, expectedException, () -> {
			factorielle(nb);
		});

	}

	private static Stream<Arguments> addArgumentsLong() {
		return Stream.of(

				Arguments.of(21, IllegalArgumentException.class), 
				Arguments.of(-1, IllegalArgumentException.class)

		);
	}
	
	@ParameterizedTest
	@CsvSource({ 
		"0,1", 
		"1,1", 
		"3,6", 
		"19,121645100408832000", 
		"20,2432902008176640000" })
	void testFactorielleBigInteger(BigInteger nb, BigInteger expected) {
		// Given

		// When
		BigInteger result = factorielle(nb);
		// Then
		assertEquals(result, expected);
	}

	@ParameterizedTest
	@MethodSource("addArgumentsBigInteger")
	void testFactorielleException(BigInteger nb, Class<Exception> expectedException) {

		assertThrows(null, expectedException, () -> {
			factorielle(nb);
		});

	}

	private static Stream<Arguments> addArgumentsBigInteger() {
		return Stream.of(

				Arguments.of(new BigInteger("7000"), StackOverflowError.class), 
				Arguments.of(new BigInteger("-1"), IllegalArgumentException.class)

		);
	}
	
	

}
