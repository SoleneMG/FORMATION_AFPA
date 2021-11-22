package darman.part8;

import java.util.Arrays;

public class Exo8_06 {

	/**
	 * Soit un tableau T à deux dimensions [12, 8] préalablement rempli de valeurs
	 * numériques. Écrire un algorithme qui recherche la plus grande valeur au sein
	 * de ce tableau.
	 */

	public static void main(String[] args) {
		int nbLignes = 12;
		int nbColonnes = 8;
		int[][] board = new int[nbLignes]nbColonnes];
		// int[][] board = {{20,4,8}, {0,107,20}, {2,4,10}};
		int max = 0;

		for (int l = 0; l < board.length; l++) {
			for (int c = 0; c < board[l].length; c++) {
				if (l == 0 && c == 0) {
					max = board[l][c];
				} else if (board[l][c] > max) {
					max = board[l][c];
				} else {
					// continue
				}
			}
		}
		System.out.println(max);
	}

	/*
	 * public static void affiche(int[][] board) { for (int[] lignes : board) {
	 * System.out.println(""); for (int colonnes : lignes) {
	 * System.out.print(lignes[colonnes]+" "); } } }
	 */

}
