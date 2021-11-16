package darman.part3;

import java.util.Scanner;

public class Exo3_01 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * Ecrire un algorithme qui demande un nombre à l’utilisateur, et l’informe
	 * ensuite si ce nombre est positif ou négatif (on laisse de côté le cas où le
	 * nombre vaut zéro).
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println("Entrer un nombre : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		if(number >0) {
			System.out.println(number +" est un entier positif");
		}
		if(number <0) {
			System.out.println(number +" est un entier négatif");
		}
		
		sc.close();
	}

}
