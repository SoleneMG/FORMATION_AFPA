package darman.part7;

import java.util.Scanner;

public class Exo7_01 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez un algorithme qui permette de saisir un nombre quelconque de valeurs,
	 * et qui les range au fur et � mesure dans un tableau. Le programme, une fois
	 * la saisie termin�e, doit dire si les �l�ments du tableau sont tous
	 * cons�cutifs ou non.
	 * 
	 * Par exemple, si le tableau est :
	 * 
	 * 12 13 14 15 16 17 18
	 * 
	 * ses �l�ments sont tous cons�cutifs. En revanche, si le tableau est :
	 * 
	 * 9 10 11 15 16 17 18
	 * 
	 * ses �l�ments ne sont pas tous cons�cutifs.
	 */

	public static void main(String[] args) {
		int[] board = initBoard();
		fillBoard(board);

		if (isConsecutif(board, -1)) {
			System.out.println("Les �l�ments du tableau sont tous cons�cutifs et d�croissant.");
		} else if (isConsecutif(board, 1)) {
			System.out.println("Les �l�ments du tableau sont tous cons�cutifs et croissant.");
		} else if (estUneSuiteDeChiffre(board)) {
			System.out.println("Les �l�ments du tableau sont une suite de chiffre continue.");
		} else {
			System.out.println("Les �l�ments du tableau ne sont pas tous cons�cutifs.");
		}

		sc.close();

	}

	public static int[] initBoard() {
		System.out.println("Entrer un nombre max de valeurs : ");
		int length = sc.nextInt();
		sc.nextLine();

		return new int[length];
	}

	public static void fillBoard(int[] board) {
		int i = 0;
		int nbAffichage = 1;
		do {
			System.out.printf("Nombre n�%d : ", nbAffichage);
			board[i] = sc.nextInt();
			sc.nextLine();
			i++;
			nbAffichage++;
		} while (i < board.length);
	}

	public static boolean isConsecutif(int[] board, int parametre) {
		boolean isConsecutif = true;
		int i = 0;
		do {
			if (i != 0) {
				if (board[i] != board[i - 1] + parametre) {
					return false;
				}
			}
			i++;
		} while (i < board.length);
		return isConsecutif;
	}

	public static boolean estUneSuiteDeChiffre(int[] board) {
		int i = 0;
		boolean estUneSuite = true;
		do {
			if (i != 0) {
				if (board[i] != (board[i - 1] + 1) && board[i] != (board[i - 1] - 1)) {
					return false;
				}
			}
			i++;
		} while (i < board.length);
		return estUneSuite;
	}

}
