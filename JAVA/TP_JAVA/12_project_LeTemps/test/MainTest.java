import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MainTest {
	static Main m;
	LocalDate now;
	
	@BeforeAll
	public static void init() {
		m = new Main();
	}

	@BeforeEach
	public void initEach() {
		now = LocalDate.now();
	}
	
	@ParameterizedTest
	@CsvSource({
		"05/03, 2022-03-05",
		"08/12, 2021-12-08"
	})
	void test_returnLocalDateOfBirthday(String date, LocalDate expected) {
		//Given
		
		//When
		LocalDate result = m.returnLocalDateOfBirthday(date, now);
		
		//Then
		Assert.assertEquals(expected, result);
		
	}

}
