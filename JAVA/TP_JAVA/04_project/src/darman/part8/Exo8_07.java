package darman.part8;

import java.util.Arrays;
import java.util.Scanner;

public class Exo8_07 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Soit un tableau T à deux dimensions [12, 8] préalablement rempli de valeurs
	 * numériques. Écrire un algorithme qui recherche la plus grande valeur au sein
	 * de ce tableau.
	 */

	public static void main(String[] args) {
		int nbLignes = 10;
		int nbColonnes = 10;
		int ligne, colonne, mouvement;
		int[][] board = new int[nbLignes][nbColonnes];

		do {
			System.out.println("Sur quelle case se trouve votre pion ? ");
			System.out.println("Ligne :");
			ligne = sc.nextInt();
			System.out.println("Colonne :");
			colonne = sc.nextInt();
			if (ligne < 1 || ligne > 10 || colonne < 1 || colonne > 10) {
				System.out.println("La case saisie est invalide");
			}
		} while (ligne < 1 || ligne > 10 || colonne < 1 || colonne > 10);

		System.out.printf("Votre pion se trouve en %d | %d\n", ligne, colonne);
		System.out.println(
				"Quel mouvement voulez-vous effectuer ?\nen haut à gauche : 0\nen haut à droite : 1\nen bas à gauche  : 2\nen bas à droite  : 3");
		mouvement = sc.nextInt();
		sc.nextLine();

		boolean mouvementAutorise = mouvementEstValide(mouvement, ligne, colonne);
		if (mouvementAutorise) {
			affiche(board, mouvement, ligne, colonne);
		}

		sc.close();
	}

	public static boolean mouvementEstValide(int mouvement, int ligne, int colonne) {
		boolean mouvementAutorise = true;
		//////////////////////////
		// passe de l'affichage à l'indexage
		ligne-=1;
		colonne-=1;
		
		switch (ligne) {
		case 0:
			switch (colonne) {
			case 0:
				if (mouvement != 3) {
					System.out.println("Mouvement impossible");
					mouvementAutorise = false;
					break;
				}
				break;
			case 10:
				if (mouvement != 2) {
					System.out.println("Mouvement impossible");
					mouvementAutorise = false;
					break;
				}
				break;
			case 1, 2, 3, 4, 5, 6, 7, 8, 9:
				if (mouvement != 2 || mouvement != 3) {
					System.out.println("Mouvement impossible");
					mouvementAutorise = false;
					break;
				}
			break;
			}
			break;
		case 10:
			switch (colonne) {
			case 0:
				if (mouvement != 1) {
					System.out.println("Mouvement impossible");
					mouvementAutorise = false;
					break;
				}
				break;
			case 10:
				if (mouvement != 0) {
					System.out.println("Mouvement impossible");
					mouvementAutorise = false;
					break;
				}
				break;
			case 1, 2, 3, 4, 5, 6, 7, 8, 9:
				if (mouvement != 0 || mouvement != 1) {
					System.out.println("Mouvement impossible");
					mouvementAutorise = false;
					break;
				}
			break;
			}
			break;
		case 1, 2, 3, 4, 5, 6, 7, 8, 9:
			switch (colonne) {
			case 0:
				if (mouvement != 1 || mouvement != 3) {
					System.out.println("Mouvement impossible");
					mouvementAutorise = false;
					break;
				}
				break;
			case 10:
				if (mouvement != 0 || mouvement != 2) {
					System.out.println("Mouvement impossible");
					mouvementAutorise = false;
					break;
				}
				break;
			}
		break;
		}
		return mouvementAutorise;
	}

	public static void affiche(int[][] board, int mouvement, int ligne, int colonne) {
		ligne -= 1;
		colonne -= 1;
		switch (mouvement) {
		case 0:
			ligne -= 1;
			colonne -= 1;
			break;
		case 1:
			ligne -= 1;
			colonne += 1;
			break;
		case 2:
			ligne += 1;
			colonne -= 1;
			break;
		case 3:
			ligne += 1;
			colonne += 1;
			break;
		default:
			throw new IllegalArgumentException("Cas non traité");
		}
		for (int l = 0; l < board.length; l++) {
			System.out.println();
			for (int c = 0; c < board[l].length; c++) {
				if (l == ligne && c == colonne) {
					System.out.print(" X ");
				} else {
					System.out.print(" O ");
				}

			}
		}
	}

}
