package darman.part6;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exo6_12 {
	public static Scanner sc = new Scanner(System.in);
	
	/**
	 * Ecrivez un algorithme qui permette la saisie d’un nombre quelconque de
	 * valeurs, sur le principe de l’ex 6.8. Toutes les valeurs doivent être ensuite
	 * augmentées de 1, et le nouveau tableau sera affiché à l’écran.
	 */

	public static void main(String[] args) {
		
		System.out.println("Entrer un nombre max de valeurs : ");
		int length = sc.nextInt();
		sc.nextLine();
		
		int[] board = new int[length];
		int i = 0;
		do {
			System.out.printf("Saisir la valeur à l'index %d : \n", i);
			board[i] = sc.nextInt();
			sc.nextLine();
			i++;
		} while (i < length);
		
		for (int x = 0; x < board.length; x++) {
			if (x == 0) {
				System.out.print("|");
			}
			System.out.print(++board[x] + "|");
			
		}
	
		sc.close();
	}

}
