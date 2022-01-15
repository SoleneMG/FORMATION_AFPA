package model.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Data {
	public final String date;
	public final String[] firstDraw;
	public final String[] secondDraw;
	public final String chanceBall;
	public final String winner;
	public final String amount;
	
	
	public Data(String date, String[] firstDraw, String[] secondDraw, String chanceBall, String winner, String amount) {
		super();
		this.date = dateToString(date);
		this.firstDraw = firstDraw;
		this.secondDraw = secondDraw;
		this.chanceBall = chanceBall;
		this.winner = winnerToString(winner);
		this.amount = amountToString(amount);
	}
	
	private String dateToString(String date) {
		LocalDate dateLocalDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return dateLocalDate.format(DateTimeFormatter.ofPattern("eeee dd MMMM yyyy", Locale.FRANCE));
	}
	
	private String amountToString(String amount) {
		String patternThousand = "[1-9]+[0]{3}";
		String patternMillion = "[1-9]+[0]{6}";
		String patternBillion = "[1-9]+[0]{9}";
		return amount.matches(patternThousand)? "Jackpot de "+amount.charAt(0)+ " milles euros" : amount.matches(patternMillion)? "Jackpot de "+amount.charAt(0)+ " millions d'euros" : amount.matches(patternBillion)? "Jackpot de "+amount.charAt(0)+ " milliard d'euros" : "Jackpot de "+ amount + " euros"; 
	}
	
	private String winnerToString(String winner) {
		if(winner.equals("0")) {
			return "Non remporté";
		} else if(winner.equals("1")) {
			return winner + " gagnant";
		} else {
			return winner + "gagnants";
		}
	}

	
}
