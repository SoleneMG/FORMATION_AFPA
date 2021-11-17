package darman.part4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exo4_03 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * De même que le précédent, cet algorithme doit demander une heure et en
	 * afficher une autre. Mais cette fois, il doit gérer également les secondes, et
	 * afficher l'heure qu'il sera une seconde plus tard. Par exemple, si
	 * l'utilisateur tape 21, puis 32, puis 8, l'algorithme doit répondre : "Dans
	 * une seconde, il sera 21 heure(s), 32 minute(s) et 9 seconde(s)". NB : là
	 * encore, on suppose que l'utilisateur entre une date valide.
	 */

	public static void main(String[] args) {
		String secondsFormatted;

		System.out.println("Entrer l'heure : ");
		int hour = sc.nextInt();
		sc.nextLine();

		System.out.println("Entrer les minutes : ");
		int minute = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Entrer les secondes : ");
		int seconds = sc.nextInt();
		sc.nextLine();

		NumberFormat format = new DecimalFormat("00");
		secondsFormatted = format.format(++seconds);

		System.out.printf("Dans une seconde, il sera %d heure(s) %d minute(s) et %s seconde(s).", hour, minute, secondsFormatted);

		sc.close();
	}
}
