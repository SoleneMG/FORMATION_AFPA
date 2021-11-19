package darman.part6;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exo6_09 {

	/**
	 * Ecrivez un algorithme calculant la somme des valeurs d’un tableau (on suppose
	 * que le tableau a été préalablement saisi).
	 */

	public static void main(String[] args) {
		
		int[] board = {10,20,30,40,50,60,70};
		int total = 0;
		
		for (int x = 0; x < board.length; x++) {
			total +=board[x];
		}	

		System.out.printf("La somme des valeurs du tableau = %d", total);
		

	}

}
