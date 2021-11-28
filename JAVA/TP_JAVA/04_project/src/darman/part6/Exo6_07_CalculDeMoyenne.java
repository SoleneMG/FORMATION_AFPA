package darman.part6;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exo6_07_CalculDeMoyenne {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez la fin de l’algorithme 6.3 afin que le calcul de la moyenne des notes
	 * soit effectué et affiché à l’écran.
	 */

	public static void main(String[] args) {

		int length = 3;
		int[] board = new int[length];

		int i = 0;
		do {
			System.out.println("Entrer une note : ");
			board[i] = sc.nextInt();
			sc.nextLine();
			i++;
		} while (i < length);
		int total = 0;
		for (int x = 0; x < board.length; x++) {
			total += board[x];
		}
		double moyenne = (double) total / (double) length;
		Format formatter = new DecimalFormat("0.00");
		System.out.print("Moyenne des notes : " + formatter.format(moyenne) + "\n");
		sc.close();
		
	}

}
