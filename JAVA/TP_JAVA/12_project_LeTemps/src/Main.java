import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		Birthday birthday = new Birthday();
		LocalDate date = m.returnLocalDateOfBirthday(m.askBirthday(), LocalDate.now());
		long day = birthday.getDayBetweenBirthdayDateAndNow(date);
		m.displayNumberOfDayBetweenBirthdayAndNow(day, date);

	}

	public String askBirthday() {
		return JOptionPane.showInputDialog(null, "Date d'anniversaire (jj/mm) :");
	}
	
	public LocalDate returnLocalDateOfBirthday(String date, LocalDate now) {
		LocalDate birthday = null;
		StringBuilder sb = new StringBuilder();
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		sb.append(date).append("/" + now.getYear());
		
		try {

			birthday = LocalDate.parse(sb, format);
		} catch (DateTimeParseException e) {
			System.err.println("La date renseignée n'est pas au bon format. \nNouvelle saisie :");
		}
		
		if (birthday != null) {
			if (birthday.compareTo(now) > 0 ) {
				return birthday;
			}
			return birthday.plusYears(1);
		} else {
			return returnLocalDateOfBirthday(date, now);
		}
	}

	public void displayNumberOfDayBetweenBirthdayAndNow(long day, LocalDate date) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy");

		JOptionPane.showMessageDialog(null,
				"Votre anniversaire est dans " + day + " jours\n le " + format.format(date));
	}

}
