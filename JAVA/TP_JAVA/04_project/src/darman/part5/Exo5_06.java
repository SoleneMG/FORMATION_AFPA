package darman.part5;

import java.util.Scanner;

public class Exo5_06 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme
	 * des entiers jusqu’à ce nombre. Par exemple, si l’on entre 5, le programme
	 * doit calculer : 1 + 2 + 3 + 4 + 5 = 15 NB : on souhaite afficher uniquement
	 * le résultat, pas la décomposition du calcul.
	 */

	public static void main(String[] args) {
		int result=0;

		System.out.println("Entrer un nombre : ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.printf("Vous avez saisi le nombre %d", number);
		System.out.println("\nVoici la somme des entiers jusqu'à ce nombre :");
		for (int i = 1; i <= number; i++) {
			result += i;
		}
		System.out.println(result);

		sc.close();
	}
}
