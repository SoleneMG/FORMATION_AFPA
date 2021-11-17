package darman.part3;

import java.util.Scanner;

public class Exo3_05 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * Ecrire un algorithme qui demande deux nombres � l�utilisateur et l�informe
	 * ensuite si le produit est n�gatif ou positif (on inclut cette fois le
	 * traitement du cas o� le produit peut �tre nul). Attention toutefois, on ne
	 * doit pas calculer le produit !
	 */

	public static void main(String[] args) {
		System.out.println("Entrer un premier nombre : ");
		int number1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Entrer un second nombre : ");
		int number2 = sc.nextInt();
		sc.nextLine();

		if ((number1 > 0 && number2 > 0) || (number1 < 0 && number2 < 0)) {
			System.out.println("Le produit de " + number1 + " et " + number2 + " est un entier positif");
		} else if (number1 == 0 || number2 == 0) {
			System.out.println("Le produit de " + number1 + " et " + number2 + " est �gal � 0");
		} else {
			System.out.println("Le produit de " + number1 + " et " + number2 + " est un entier n�gatif");
		}

		sc.close();
	}

}
