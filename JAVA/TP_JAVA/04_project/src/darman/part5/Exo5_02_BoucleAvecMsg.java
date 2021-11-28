package darman.part5;

import java.util.Scanner;

public class Exo5_02_BoucleAvecMsg {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu�� ce
	 * que la r�ponse convienne. En cas de r�ponse sup�rieure � 20, on fera
	 * appara�tre un message : � Plus petit ! �, et inversement, � Plus grand ! � si
	 * le nombre est inf�rieur � 10.
	 */

	public static void main(String[] args) {
		int number = 0;
		do {
			System.out.println("Entrer un nombre entre 10 et 20 : ");
			number = sc.nextInt();
			sc.nextLine();
			if (number < 10) {
				System.out.println("Il faut entrer un nombre plus grand !");
			} else if (number > 20) {
				System.out.println("Il faut entrer un nombre plus petit !");
			}

		} while ((number < 10 || number > 20));
		System.out.printf("Super ! Vous avez choisi le chiffre %d", number);
		sc.close();
	}

}
