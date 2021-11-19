package darman.part6;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exo6_10 {

	/**
	 * Ecrivez un algorithme calculant la somme des valeurs d�un tableau (on suppose
	 * que le tableau a �t� pr�alablement saisi).
	 */

	public static void main(String[] args) {
		int i = 0;
		int[] board1 = { 4, 8, 7, 9, 1, 5, 4, 6 };
		int[] board2 = { 7, 6, 5, 2, 1, 3, 7, 4 };
		int[] board3 = new int[8];

		System.out.println("Tableau 1 :");
		do {
			if (i == 0) {
				System.out.print("|");
			}
			System.out.print(board1[i] + "|");
			i++;
		} while (i < board1.length);

		i = 0;
		System.out.println("\n\nTableau 2 :");
		do {

			if (i == 0) {
				System.out.print("|");
			}
			System.out.print(board2[i] + "|");
			i++;
		} while (i < board2.length);

		i = 0;
		System.out.println("\n\nTableau � consituer :");
		do {
			board3[i] = board1[i] + board2[i];
			if (i == 0) {
				System.out.print("|");
			}
			System.out.print(board3[i] + "|");
			i++;
		} while (i < board3.length);

	}

}
