package darman.part5;

import java.util.Scanner;

public class Exo5_05_TableDeMultiplication {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire un algorithme qui demande un nombre de départ, et qui ensuite écrit la
	 * table de multiplication de ce nombre, présentée comme suit (cas où
	 * l'utilisateur entre le nombre 7) :
	 */

	public static void main(String[] args) {

		System.out.println("Entrer un nombre : ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.printf("Vous avez saisi le nombre %d", number);
		System.out.println("\nVoici sa table de multiplication :");
		for (int i = 0; i < 11; i++) {
			System.out.println(number + " * " + i + " = " + number * i);
		}

		sc.close();
	}

}
