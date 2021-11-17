package darman.part4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exo4_02 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Cet algorithme est destiné à prédire l'avenir, et il doit être infaillible !
	 * Il lira au clavier l’heure et les minutes, et il affichera l’heure qu’il sera
	 * une minute plus tard. Par exemple, si l'utilisateur tape 21 puis 32,
	 * l'algorithme doit répondre : "Dans une minute, il sera 21 heure(s) 33". NB :
	 * on suppose que l'utilisateur entre une heure valide. Pas besoin donc de la
	 * vérifier.
	 */

	public static void main(String[] args) {
		String minuteFormatted;

		System.out.println("Entrer l'heure : ");
		int hour = sc.nextInt();
		sc.nextLine();

		System.out.println("Entrer les minutes : ");
		int minute = sc.nextInt();
		sc.nextLine();

		NumberFormat format = new DecimalFormat("00");
		minuteFormatted = format.format(++minute);

		System.out.printf("Dans une minute, il sera %d heure(s) %s.", hour, minuteFormatted);

		sc.close();
	}

}
