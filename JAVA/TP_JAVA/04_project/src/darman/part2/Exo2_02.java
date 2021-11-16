package darman.part2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo2_02 {
	public static Scanner sc = new Scanner(System.in);
	/**
	 * 
	 * Ecrire un programme qui demande un nombre à l’utilisateur, puis qui calcule et  affiche le carré de ce nombre.
	 */
	
	
	public static void main(String[] args) {
		
		int number = askNumber();
		double numberPowed = power(number, 2);
		System.out.println("Le carré de " +number +" est " + numberPowed);
		
		sc.close();
	}
	
	public static int askNumber() {
		System.out.println("Entrer un nombre : ");
		try {
		int number = sc.nextInt();
		sc.nextLine();
		return number;
		} catch (InputMismatchException e) {
			System.out.println("Ce n'est pas un nombre.");
			sc.nextLine();
			return askNumber();
		}
	
	}
	
	public static double power(int i, int power) {
		return Math.pow(i, power);
	}

}
