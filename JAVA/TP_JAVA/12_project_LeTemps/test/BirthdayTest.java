import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BirthdayTest {
	static Birthday bd;
	
	@BeforeAll
	public static void init() {
		bd = new Birthday();
	}

	@ParameterizedTest
	@CsvSource({
		"2022-03-05, 88",
		"2021-12-07, 0",
		"2021-12-09, 2"
	})
	void testGetDayBetweenBirthdayDateAndNow(LocalDate birthday, long expected) {	
		//When
		long result = bd.getDayBetweenBirthdayDateAndNow(birthday);
		
		//Then
		Assert.assertEquals(expected, result);
		
	}

}
