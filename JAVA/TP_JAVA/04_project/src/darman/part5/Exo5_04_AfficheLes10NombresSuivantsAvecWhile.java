package darman.part5;

import java.util.Scanner;

public class Exo5_04_AfficheLes10NombresSuivantsAvecWhile {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Réécrire l'algorithme précédent, en utilisant cette fois l'instruction While
	 */

	public static void main(String[] args) {
		int i = 1;

		System.out.println("Entrer un nombre : ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.printf("Vous avez saisi le nombre %d", number);
		System.out.println("\nVoici les dix nombres suivants :");
		while (i < 11) {
			System.out.println(number + i);
			i++;
		}

		sc.close();
	}

}
