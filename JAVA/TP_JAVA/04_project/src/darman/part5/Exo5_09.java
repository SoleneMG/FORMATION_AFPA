package darman.part5;

import java.util.Scanner;

public class Exo5_09 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Réécrire l’algorithme précédent, mais cette fois-ci on ne connaît pas
	 * d’avance combien l’utilisateur souhaite saisir de nombres. La saisie des
	 * nombres s’arrête lorsque l’utilisateur entre un zéro.
	 */

	public static void main(String[] args) {
		int i = 1;
		int max = -1;
		int position = 0;
		int number = -1;
		int[] positionBoard = new int[500];

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
			if (number != 0) {
				System.out.println("(Pour terminer la saisie entrer 0)");
			}
		} while (!(number == 0));

		if (position == 0) {
			System.out.println("Le plus grand de ces nombres est : " + max + " \nC'était le nombre numéro " + position);
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
