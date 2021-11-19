package darman.part6;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exo6_13 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez un algorithme permettant, toujours sur le même principe, à
	 * l’utilisateur de saisir un nombre déterminé de valeurs. Le programme, une
	 * fois la saisie terminée, renvoie la plus grande valeur en précisant quelle
	 * position elle occupe dans le tableau. On prendra soin d’effectuer la saisie
	 * dans un premier temps, et la recherche de la plus grande valeur du tableau
	 * dans un second temps.
	 */

	public static void main(String[] args) {
		int lengthBoard;
		int i = 1;
		int max = -1;
		int position = 0;
		int number = -1;
		int[] positionBoard = new int[500];

		System.out.println("Entrer un nombre max de valeurs : ");
		lengthBoard = sc.nextInt();
		sc.nextLine();
		int[] numberBoard = new int[lengthBoard];

			do {
			System.out.println("Entrer un nombre :");
			number = sc.nextInt();
			sc.nextLine();
			
			if (i == 1) {
				max = number;
				positionBoard[position] = i;
			}
			if (number >= max && i !=1) {
				if (number == max) {
					position++;
				}
				max = number;
				positionBoard[position] = i;
			}
			i++;
		} while (i < numberBoard.length+1);

		if (position == 0) {
			System.out.println("Le plus grand de ces nombres est : " + max + " \nC'était le nombre numéro " + positionBoard[position]);
		} else {
			System.out.println(
					"Le plus grand de ces nombres est : " + max + " \nIl a été saisi plusieurs fois aux positions :");
			for (int x = 0; x <= position; x++) {
				if (!(x == position)) {
					System.out.print(positionBoard[x]+ ", ");
				} else {
				System.out.print(positionBoard[x] );
				}
			}
		}
		sc.close();
	}
}
