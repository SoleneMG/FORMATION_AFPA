package fr.afpa.math;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import fr.afpa.util.UtilitaireBookstore;

class UtilitaireBookstoreTest {
	static UtilitaireBookstore ub;

	@BeforeAll
	public static void init() {
		ub = new UtilitaireBookstore();
	}

	@Test
	void testIsPretEnRetard() {
		// Given
		LocalDate dateEmpruntEffective = LocalDate.of(2021, 12, 01);
		LocalDate maintenant = LocalDate.of(2021, 12, 06);
		int dureeMax = 15;
		// When
		boolean result = UtilitaireBookstore.isPretEnRetard(dateEmpruntEffective, maintenant, dureeMax);
		// Then
		Assert.assertFalse(result);
	}

	@ParameterizedTest
	@CsvSource({ "1989-03-05, 2021-12-06, 32",
				 "2021-06-12, 2021-12-06, 0"
	})
	void testgetAge(LocalDate birthday, LocalDate now, int expected) {
		// Given

		// When
		int result = UtilitaireBookstore.getAge(birthday, now);
		// Then
		Assert.assertEquals(expected, result);
	}

	@ParameterizedTest
	@MethodSource("arguments")
	void testIsPretEnRetard2(LocalDate dateEmpruntEffective, LocalDate maintenant, int dureeMax, boolean expected) {
		// When
		boolean result = UtilitaireBookstore.isPretEnRetard2(dateEmpruntEffective, maintenant, dureeMax);
		// Then
		Assert.assertEquals(expected, result);
	}

	private static Stream<Arguments> arguments() {

		return Stream.of(
				Arguments.of(LocalDate.of(2021, Month.DECEMBER, 01), LocalDate.of(2021, Month.DECEMBER, 06), 15, false),
				Arguments.of(LocalDate.of(2021, Month.DECEMBER, 01), LocalDate.of(2021, Month.DECEMBER, 06), 2, true),
				Arguments.of(LocalDate.of(2021, Month.DECEMBER, 01), LocalDate.of(2021, Month.DECEMBER, 15), 15, false),
				Arguments.of(LocalDate.of(2021, Month.DECEMBER, 01), LocalDate.of(2021, Month.DECEMBER, 16), 15, true)

		);
	}

}
