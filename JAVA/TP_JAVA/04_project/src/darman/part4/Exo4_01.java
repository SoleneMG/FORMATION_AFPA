package darman.part4;

import java.util.Scanner;

public class Exo4_01 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Si Tutu > Toto + 4 OU Tata = "OK" Alors Tutu <-- Tutu + 1 Sinon Tutu <-- Tutu
	 * – 1 Finsi
	 */

	public static void main(String[] args) {
		System.out.println("Entrer un premier nombre : ");
		int tutu = sc.nextInt();
		sc.nextLine();

		System.out.println("Entrer un second nombre : ");
		int toto = sc.nextInt();
		sc.nextLine();
		String tata = "OK";

		System.out.printf("premier nombre : %d \ndeuxième nombre : %d \n", toto, tutu);

		if ((tutu > (toto + 4)) || (tata.equals("OK"))) {
			tutu = tutu + 1;
		} else {
			tutu = tutu - 1;
		}

		System.out.printf("valeur de tutu après condition : %d", tutu);

		sc.close();

	}

}
