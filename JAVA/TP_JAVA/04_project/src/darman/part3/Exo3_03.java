package darman.part3;

import java.util.Scanner;

public class Exo3_03 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire un algorithme qui demande trois noms à l’utilisateur et l’informe
	 * ensuite s’ils sont rangés ou non dans l’ordre alphabétique.
	 */

	public static void main(String[] args) {
		System.out.println("Entrer un premier nom : ");
		String name1 = sc.nextLine();
		System.out.println("Entrer un deuxième nom : ");
		String name2 = sc.nextLine();
		System.out.println("Entrer un troisième nom : ");
		String name3 = sc.nextLine();
		
		if (name1.charAt(0) < name2.charAt(0) && name2.charAt(0) < name3.charAt(0)) {
			System.out.println("Les noms sont rangés par ordre alphabétique");
		} else {
			System.out.println("Les noms ne sont pas rangés par ordre alphabétique");
		}
	}
}
