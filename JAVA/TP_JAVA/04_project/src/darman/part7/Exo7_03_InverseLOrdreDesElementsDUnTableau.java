package darman.part7;

import java.util.Scanner;

public class Exo7_03_InverseLOrdreDesElementsDUnTableau {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez un algorithme qui inverse l’ordre des éléments d’un tableau dont on
	 * suppose qu'il a été préalablement saisi (« les premiers seront les derniers…
	 * »)
	 */

	public static void main(String[] args) {
		int[] board = { 8, 5, 4, 9, 3, 2 };
		System.out.println("Tableau :");
		affiche(board);
		System.out.println("Tableau inversé :");
		affiche(inverse(board));
	}

	public static int[] inverse(int[] board) {
		
		for (int i = 0; i < (board.length/2); i++) {
			int temp = board[i];
			board[i]= board[board.length-i-1];
			board[board.length-i-1] = temp;
		}
		return board;
	}

	public static void affiche(int[] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.println(board[i]);
		}
	}
}
