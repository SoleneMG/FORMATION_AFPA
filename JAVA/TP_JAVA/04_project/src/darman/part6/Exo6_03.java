package darman.part6;

import java.util.Scanner;

public class Exo6_03 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire un algorithme qui déclare un tableau de 9 notes, dont on fait ensuite
	 * saisir les valeurs par l’utilisateur.
	 */

	public static void main(String[] args) {

		int length = 9;
		int[] board = new int[length];

		int i = 0;
		do {
			System.out.println("Entrer une note : ");
			board[i] = sc.nextInt();
			sc.nextLine();
			i++;
		} while (i < length);

		for (int x = 0; x < board.length; x++) {
			System.out.print("Note : " + board[x] + "\n");

		}
	}

}
