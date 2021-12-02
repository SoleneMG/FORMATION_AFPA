package fr.afpa.math;

import static fr.afpa.math.Math.factorielle;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;

class MathTest2 {

	@ParameterizedTest
	//@MethodSource("addArguments")
	@CsvSource({
		"0,1",
		"1,1",
		"3,6"})
	void testFactorielle(long nb, long expected) {
		//Given
//				Long nb = 21L;
//				Object expected = new IllegalArgumentException();
				//When
				Object result = fr.afpa.math.Math.factorielle(nb);
				//Then
				//assertEquals(expected, result);
				Assertions.assertEquals(result, expected);
				//AssertionError
	}
	
	void testFactorielleException(long nb, Object expected) {
		//Given
//				Long nb = 21L;
//				Object expected = new IllegalArgumentException();
				//When
				Object result = factorielle(nb);
				//Then
				//assertEquals(expected, result);
				//assertThrows(expected, () -> factorielle(nb))
				
	}
	
	private static Stream<Arguments> addArguments(){
		return Stream.of(
Arguments.of(0, 1),
Arguments.of(1, 1),
Arguments.of(3, 6),
Arguments.of(-1, IllegalArgumentException.class)
				
				);
	}

	

}



