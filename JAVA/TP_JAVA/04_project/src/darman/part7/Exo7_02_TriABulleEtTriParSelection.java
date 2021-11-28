package darman.part7;

import java.util.Scanner;

public class Exo7_02_TriABulleEtTriParSelection {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez un algorithme qui trie un tableau dans l’ordre décroissant. Vous
	 * écrirez bien entendu deux versions de cet algorithme, l'une employant le tri
	 * par sélection, l'autre le tri à bulles.
	 */

	public static void main(String[] args) {
		int[] board = { 8, 5, 4, 9, 3, 2 };
		
		int[] tableauTrieParSelection = triParSelection(board);
		int[] tableauTrieParBulles = triParBulle(board);
		System.out.println("Tri par séléction :");
		affiche(tableauTrieParSelection);
		System.out.println("Tri par bulles :");
		affiche(tableauTrieParBulles);
	}

	public static int[] triParSelection(int[] board) {
		int temp = board[0];

		for (int i1 = 0; i1 < board.length; i1++) {
			for (int i2 = 0; i2 < board.length; i2++) {
				if (board[i2] < board[i1]) {
					temp = board[i2];
					board[i2] = board[i1];
					board[i1] = temp;
				}
			}
		}
		return board;
	}
	
	public static int[] triParBulle(int[] board) {
		boolean isChanged = true;
		do {
			isChanged = false;
			for (int i = 0; i < board.length-1; i++) {
				if(board[i] < board[i+1]) {
					int temp = board[i];
					board[i]=board[i+1];
					board[i+1]=temp;
					isChanged = true;
				}
			}
		} while(isChanged);
		return board;
	}
	
	public static void affiche(int[] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.println(board[i]);
		}
	}
}
