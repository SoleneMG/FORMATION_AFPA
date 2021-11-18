package darman.part4;

import java.util.Scanner;

public class Exo4_08 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez un algorithme qui a près avoir demandé un numéro de jour, de mois et
	 * d'année à l'utilisateur, renvoie s'il s'agit ou non d'une date valide. Cet
	 * exercice est certes d’un manque d’originalité affligeant, mais après tout, en
	 * algorithmique comme ailleurs, il faut connaître ses classiques ! Et quand on
	 * a fait cela une fois dans sa vie, on apprécie pleinement l’existence d’un
	 * type numérique « date » dans certains langages…). Il n'est sans doute pas
	 * inutile de rappeler rapidement que le mois de février compte 28 jours, sauf
	 * si l’année est bissextile, auquel cas il en compte 29. L’année est bissextile
	 * si elle est divisible par quatre. Toutefois, les années divisibles par 100 ne
	 * sont pas bissextiles, mais les années divisibles par 400 le sont. Ouf ! Un
	 * dernier petit détail : vous ne savez pas, pour l’instant, exprimer
	 * correctement en pseudo-code l’idée qu’un nombre A est divisible par un nombre
	 * B. Aussi, vous vous contenterez d’écrire en bons télégraphistes que A
	 * divisible par B se dit « A dp B ».
	 */

	public static void main(String[] args) {
		boolean isValid = true;
		String validDate = "valide";

		System.out.println("Veuillez entrer un numéro de jour : ");
		int day = sc.nextInt();
		sc.nextLine();

		System.out.println("Veuillez entrer un numéro de mois : ");
		int month = sc.nextInt();
		sc.nextLine();

		System.out.println("Veuillez entrer une année : ");
		int year = sc.nextInt();
		sc.nextLine();

		if (day > 31 || day < 1 || month > 12 || month < 1) {
			isValid = false;
		}

		switch (month) {
		case 4 | 6 | 9 | 11:
			if (day > 30) {
				isValid = false;
				break;
			}
		case 2:
			if (isBissextile(year)) {
				if (day > 29) {
					isValid = false;
				}
			}
			if (day > 28 && !(isBissextile(year))) {
				isValid = false;
			}
		}

		if (isValid == false) {
			validDate = "invalide";
		}
		System.out.printf("La date est %s", validDate);
	}
	
	public static boolean isBissextile(int year) {
		if ((year % 4 == 0 && !(year % 100 == 0)) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
