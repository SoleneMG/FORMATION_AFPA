package darman.part7;

import java.util.Scanner;

public class Exo7_04 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez un algorithme qui permette à l’utilisateur de supprimer une valeur
	 * d’un tableau préalablement saisi. L’utilisateur donnera l’indice de la valeur
	 * qu’il souhaite supprimer. Attention, il ne s’agit pas de remettre une valeur
	 * à zéro, mais bel et bien de la supprimer du tableau lui-même ! Si le tableau
	 * de départ était :
	 * 
	 * 12 8 4 45 64 9 2
	 * 
	 * Et que l’utilisateur souhaite supprimer la valeur d’indice 4, le nouveau
	 * tableau sera :
	 * 
	 * 12 8 4 45 9 2
	 * 
	 */

	public static void main(String[] args) {
		int[] board = { 8, 5, 4, 9, 3, 2 };
		System.out.println("Quelle valeur voulez-vous supprimer ? ");
		affiche(board);
		System.out.println("\nChoix n° : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("\nVoici le nouveau tableau : ");
		affiche(supprime(board, index-1)); // -1 affichage incrémenté de 1 par rapport à l'index
	}

	public static int[] supprime(int[] board, int index) {
		int[] newBoard = new int[board.length-1];
		for (int i = 0; i < (newBoard.length); i++) {
			if(i>=index) {
				newBoard[i] = board[i+1];
			} else {
				newBoard[i] = board[i];
			}
			
		}
		return newBoard;
	}

	public static void affiche(int[] board) {
		int numero =1;
		for (int i = 0; i < board.length; i++) {
			System.out.println("n°"+numero+" : "+board[i]);
			numero++;
		}
	}
}
