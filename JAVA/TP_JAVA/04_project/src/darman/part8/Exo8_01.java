package darman.part8;

import java.util.Arrays;

public class Exo8_01 {
	
	/** Écrivez un algorithme remplissant un tableau de 6 sur 13, avec des zéros. */

	public static void main(String[] args) {
	 int[][] board = new int[6][13];
	 
	 for (int[] lignes : board) {
		System.out.println("");
		for (int colonnes : lignes) {
		System.out.print(lignes[colonnes]+" ");
		}
	}

	}

}
