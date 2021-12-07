import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Birthday {

	public long getDayBetweenBirthdayDateAndNow(LocalDate birthday) {
		LocalDate now = LocalDate.now();
		return ChronoUnit.DAYS.between(now, birthday);
	}

}
