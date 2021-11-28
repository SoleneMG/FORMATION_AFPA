package darman.part7;

import java.util.Scanner;

public class Exo7_05_TriParDichotomie {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez l'algorithme qui recherche un mot saisi au clavier dans un
	 * dictionnaire. Le dictionnaire est supposé être codé dans un tableau
	 * préalablement rempli et trié.
	 * 
	 */

	public static void main(String[] args) {
		String[] dictionnaire = { "aMot", "bMot", "cMot", "dMot", "eMot", "fMot", "gMot", "hMot", "iMot", "jMot",
				"kMot", "lMot", "mMot", "nMot", "oMot", "pMot", "qMot", "rMot", "sMot", "tMot", "uMot", "vMot", "wMot",
				"xMot", "yMot", "zMot" };

		System.out.println("Quel mot cherchez-vous ? ");
		String motATrouver = sc.nextLine();

		int nbDeBoucle = chercheParDichotomie(dictionnaire, motATrouver);
		if (nbDeBoucle == -1) {
			System.out.println("Le mot recherché n'est pas dans le dictionnaire");
		} else {
			System.out.printf("Trouvé en %d tour de boucle(s).", nbDeBoucle);
		}
	}

	public static int chercheParDichotomie(String[] board, String motATrouver) {
		int debut = 0;
		int milieu;
		int fin = board.length;
		boolean trouve = false;
		int nbDeBoucles = 0;

		do {
			milieu = (debut + fin) / 2;
			if (board[milieu].equals(motATrouver)) {
				trouve = true;
			} else {
				if (motATrouver.compareTo(board[milieu]) < 0) {
					fin = milieu;
				} else {
					debut = milieu;
				}
			}
			nbDeBoucles++;
		} while (trouve == false && debut < fin);
		if (trouve == false) {
			return -1;
		}
		return nbDeBoucles;
	}

	public static void affiche(int[] board) {
		int numero = 1;
		for (int i = 0; i < board.length; i++) {
			System.out.println("n°" + numero + " : " + board[i]);
			numero++;
		}
	}
}
