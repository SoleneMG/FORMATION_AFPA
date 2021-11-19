package darman.part6;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exo6_08 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez un algorithme permettant � l�utilisateur de saisir un nombre
	 * quelconque de valeurs, qui devront �tre stock�es dans un tableau.
	 * L�utilisateur doit donc commencer par entrer le nombre de valeurs qu�il
	 * compte saisir. Il effectuera ensuite cette saisie. Enfin, une fois la saisie
	 * termin�e, le programme affichera le nombre de valeurs n�gatives et le nombre
	 * de valeurs positives.
	 */

	public static void main(String[] args) {
		
		System.out.println("Entrer un nombre max de valeurs : ");
		int length = sc.nextInt();
		sc.nextLine();
		
		int[] board = new int[length];
		int i = 0;
		do {
			System.out.printf("Saisir la valeur � l'index %d : \n", i);
			board[i] = sc.nextInt();
			sc.nextLine();
			i++;
		} while (i < length);
		
		int nbValeursNegatives=0;
		int nbValeursPositives=0;
		int nbValeursEgalesAZero = 0;
		for (int x = 0; x < board.length; x++) {
			if(board[x]<0) {
				nbValeursNegatives++;
			} else if(board[x]>0) {
				nbValeursPositives++;
			} else if(board[x]==0) {
				nbValeursEgalesAZero++;
			} else {
				throw new IllegalArgumentException();
			}
		}
	
		System.out.printf("Nombres de valeurs positives : %d\nNombres de valeurs n�gatives : %d\n", nbValeursPositives, nbValeursNegatives);
		sc.close();
	}

}
