package darman.part3;

import java.util.Scanner;

public class Exo3_03 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire un algorithme qui demande trois noms � l�utilisateur et l�informe
	 * ensuite s�ils sont rang�s ou non dans l�ordre alphab�tique.
	 */

	public static void main(String[] args) {
		System.out.println("Entrer un premier nom : ");
		String name1 = sc.nextLine();
		System.out.println("Entrer un deuxi�me nom : ");
		String name2 = sc.nextLine();
		System.out.println("Entrer un troisi�me nom : ");
		String name3 = sc.nextLine();
		
		if (name1.charAt(0) < name2.charAt(0) && name2.charAt(0) < name3.charAt(0)) {
			System.out.println("Les noms sont rang�s par ordre alphab�tique");
		} else {
			System.out.println("Les noms ne sont pas rang�s par ordre alphab�tique");
		}
	}
}
