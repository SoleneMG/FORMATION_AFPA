package darman.part5;

import java.util.Scanner;

public class Exo5_07_Factorielle {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire un algorithme qui demande un nombre de départ, et qui calcule sa
	 * factorielle. 
	 * NB : la factorielle de 8, notée 8 !, vaut 1 x 2 x 3 x 4 x 5 x 6
	 * x 7 x 8
	 */

	public static void main(String[] args) {
		int result = 0;

		System.out.println("Entrer un nombre : ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.println("Voici la factorielle du chiffre "+number+" :");
		for (int i = 1; i <= number; i++) {
			if(i == 1) {
				result =i;
			}
			result = result*i;
		}
		System.out.println(result);

		sc.close();
	}
}
