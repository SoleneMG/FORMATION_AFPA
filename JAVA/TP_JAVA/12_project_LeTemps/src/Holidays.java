import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class Holidays {
	
	String newYearDay = "01/01";
	String workDay = "01/05";
	String victoryDay = "08/05";
	String BastilleDay = "14/07";
	String AssomptionDay = "15/08";
	String ToussaintDay = "01/11";
	String ArmisticeDay = "11/11";
	
	public final String[] holidayDay = {newYearDay,  workDay,  victoryDay, BastilleDay, AssomptionDay, ToussaintDay, ArmisticeDay};

	public String askYear() {
		return JOptionPane.showInputDialog("Année recherchée :");
	}
	
	
	public LocalDate[] transformtoLocalDate(String year, String[] day) throws DateTimeParseException {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate[] dayTab = new LocalDate[7];
		
		for (int i = 0; i < day.length; i++) {
			dayTab[i]= LocalDate.parse(day[i]+"/"+year, format);
		}
		return dayTab;
	}
	
	
	public int getDayOfWeek(LocalDate[] date) {
		int counter = 0;
		for (int i = 0; i < date.length; i++) {
			if(date[i].getDayOfWeek().getValue()==7 ||date[i].getDayOfWeek().getValue()==6) {
				counter++;
			}
		}
		return counter;
	}
	
	public void displayHolidayDuringTheWeekend(LocalDate[] date, int counter) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dddd MMMM yyyy");
		counter+=3; // add fix holiday
		String year = date[0].getYear;
		String nbHolidayOutOfTheWeekend = counter;
		StringBuilder sb = new StringBuilder();
		sb.append("Calendrier français des jours fériés de ").append(year).append(" (")
		.append(nbHolidayOutOfTheWeekend).append(" jours hors week end):")
		.append("\nJours fériés fixes :")
		.append("\n\\\u25A0 Lundi de pâques")
		.append("\n\\\u25A0 Jeudi de l'ascension")
		.append("\n\\\u25A0 Lundi de pentecôte)"
		.append("\nJours fériés mobiles :");
		
		for (int i = 0; i < date.length; i++) {
			sb.append("\n\\\\u25A0")
			.append(dtf.format(date[i]));
		}
		
		JOptionPane.showMessageDialog(null, sb);
	
		
	}
}
