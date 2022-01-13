package lotov2.model;

import java.time.LocalDate;

public class Data {
	public final LocalDate date;
	public final String amount;
	public final String winner;
	public final int[] ballsDrawedFirstDraw;
	public final int[] ballsDrawedSecondDraw;
	
	
	public Data(LocalDate date, String amount, String winner, int[] ballsDrawedFirstDraw, int[] ballsDrawedSecondDraw) {
		super();
		this.date = date;
		this.amount = displayAmount(amount);
		this.winner = winner.equals("0") ? "Non remporté" : winner.equals("1") ? ""+ winner + " gagnant" : "" + winner + "gagnants";
		this.ballsDrawedFirstDraw = ballsDrawedFirstDraw;
		this.ballsDrawedSecondDraw = ballsDrawedSecondDraw;
	}
	
	private String displayAmount(String amount) {
		String patternThousand = "[1-9]+[0]{3}";
		String patternMillion = "[1-9]+[0]{6}";
		String patternBillion = "[1-9]+[0]{9}";
		return amount.matches(patternThousand)? "Jackpot de "+amount.charAt(0)+ " milles euros" : amount.matches(patternMillion)? "Jackpot de "+amount.charAt(0)+ " millions d'euros" : amount.matches(patternBillion)? "Jackpot de "+amount.charAt(0)+ " milliard d'euros" : "Jackpot de "+ amount + " euros"; 
	}
	
	

}
