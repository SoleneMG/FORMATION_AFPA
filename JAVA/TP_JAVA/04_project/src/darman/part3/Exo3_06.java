package darman.part3;

import java.util.Scanner;

public class Exo3_06 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * Ecrire un algorithme qui demande l’âge d’un enfant à l’utilisateur. Ensuite,
	 * il l’informe de sa catégorie : "Poussin" de 6 à 7 ans "Pupille" de 8 à 9 ans
	 * "Minime" de 10 à 11 ans "Cadet" après 12 ans
	 */
	public static void main(String[] args) {
		System.out.println("Bonjour quel est ton âge ? ");
		int age = sc.nextInt();
		sc.nextLine();

		if (age > 12) {
			System.out.println("Tu fais partie des Cadets !");
		} else if (age > 9 && age < 12) {
			System.out.println("Tu fais partie des Minimes !");
		} else if (age > 7 && age < 10) {
			System.out.println("Tu fais partie des Pupilles !");
		} else if (age > 5 && age < 8) {
			System.out.println("Tu fais partie des Poussins !");
		} else {
			System.out.println("Tu ne fais partie d'aucune catégorie !");
		}
		sc.close();
	}

}
