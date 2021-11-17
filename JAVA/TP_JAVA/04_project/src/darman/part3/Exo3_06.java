package darman.part3;

import java.util.Scanner;

public class Exo3_06 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * Ecrire un algorithme qui demande l��ge d�un enfant � l�utilisateur. Ensuite,
	 * il l�informe de sa cat�gorie : "Poussin" de 6 � 7 ans "Pupille" de 8 � 9 ans
	 * "Minime" de 10 � 11 ans "Cadet" apr�s 12 ans
	 */
	public static void main(String[] args) {
		System.out.println("Bonjour quel est ton �ge ? ");
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
			System.out.println("Tu ne fais partie d'aucune cat�gorie !");
		}
		sc.close();
	}

}
