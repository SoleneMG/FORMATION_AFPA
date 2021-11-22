package darman.part7;

import java.util.Scanner;

public class Exo7_06 {

	/**
	 * �crivez un algorithme qui fusionne deux tableaux (d�j� existants) dans un
	 * troisi�me, qui devra �tre tri�. Attention ! On pr�sume que les deux tableaux
	 * de d�part sont pr�alablement tri�s : il est donc irrationnel de faire une
	 * simple concat�nation des deux tableaux de d�part, puis d'op�rer un tri :
	 * comme quand on se trouve face � deux tas de papiers d�j� tri�s et qu'on veut
	 * les r�unir, il existe une m�thode bien plus �conomique (et donc, bien plus
	 * rationnelle...)
	 * 
	 */

	public static void main(String[] args) {
		int[] tableau1 = { 1, 3, 8, 12, 15 };
		int[] tableau2 = { 5, 6, 7, 12, 17 };

		int[] tableau3 = fusion(tableau1, tableau2);
		affiche(tableau3);

	}

	public static int[] fusion(int[] tableau1, int[] tableau2) {
		int lengthTableau3 = tableau1.length + tableau2.length;
		int[] tableau3 = new int[lengthTableau3];
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		boolean tableau1EstTraiteEnEntier = false;

		do {
			
			if (tableau1[i1] <= tableau2[i2] && tableau1EstTraiteEnEntier == false) {
				tableau3[i3] = tableau1[i1];
				if (i1 < tableau1.length-1) {
					i1++;
				}
				if(tableau3[i3] == tableau1[tableau1.length-1]) {
					tableau1EstTraiteEnEntier = true;
				}
				

			} else {
				tableau3[i3] = tableau2[i2];
				if (i2 < tableau2.length-1) {
					i2++;
				}
			} 
			i3++;
		} while (i3 < lengthTableau3);
		return tableau3;

	}

	public static void affiche(int[] board) {
		int numero = 1;
		for (int i = 0; i < board.length; i++) {
			System.out.println("n�" + numero + " : " + board[i]);
			numero++;
		}
	}
}
