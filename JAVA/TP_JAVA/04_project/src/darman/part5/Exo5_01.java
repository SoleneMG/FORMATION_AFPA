package darman.part5;

import java.util.Scanner;

public class Exo5_01 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number = 0;
		do {
			System.out.println("Entrer un nombre entre 1 et 3 : ");
			number = sc.nextInt();
			sc.nextLine();
			
		} while ((number < 1 || number > 3));
		System.out.printf("Super ! Vous avez choisi le %d", number);
		sc.close();
	}

}
