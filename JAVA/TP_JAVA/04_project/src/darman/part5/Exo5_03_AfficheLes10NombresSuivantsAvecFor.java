package darman.part5;

import java.util.Scanner;

public class Exo5_03_AfficheLes10NombresSuivantsAvecFor {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche
	 * les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17,
	 * le programme affichera les nombres de 18 à 27.
	 */

	public static void main(String[] args) {

		System.out.println("Entrer un nombre : ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.printf("Vous avez saisi le nombre %d",number);
		System.out.println("\nVoici les dix nombres suivants :");
		for (int i = 1; i < 11; i++) {
			System.out.println(number + i);
		}

		sc.close();
	}

}
