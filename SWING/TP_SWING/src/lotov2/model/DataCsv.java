package lotov2.model;

import java.time.LocalDate;

public class DataCsv {
	public final String date;
	public final int amount;
	public final int winner;
	public final int[] ballsDrawedFirstDraw;
	public final int[] ballsDrawedSecondDraw;
	
	
	public DataCsv(String date, int amount, int winner, int[] ballsDrawedFirstDraw,  int[] ballsDrawedSecondDraw) {
		super();
		this.date = date;
		this.amount = amount;
		this.winner = winner;
		this.ballsDrawedFirstDraw = ballsDrawedFirstDraw;
		this.ballsDrawedSecondDraw = ballsDrawedSecondDraw;
	}
	
	
	
	
	
	
}
