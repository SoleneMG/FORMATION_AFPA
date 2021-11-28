package item;

import java.util.Scanner;

public class Item3_ResoudreUneEquationDuSecondDegre {
	/**
	 * Ecrire une application qui affiche la ou les valeurs de x qui sont la
	 * solution d'une équation du second degré. Au début, calculez le discriminant
	 * et tenez compte de tous les cas possibles (l'opérateur sera obligé de refaire
	 * la saisie si le discriminant < 0)
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Item3_ResoudreUneEquationDuSecondDegre item3 = new Item3_ResoudreUneEquationDuSecondDegre();
		double a, b, c, x1, x2;
		boolean isSuccess;
		do {
			do {
				a = item3.enterNumber("Entrer la valeur de a :");
				if (a == 0) {
					System.out.println("La valeur de a doit être différent de 0");
				}
			} while (a == 0);
			b = item3.enterNumber("Entrer la valeur de b :");
			c = item3.enterNumber("Entrer la valeur de c :");

			double delta = Math.pow(b, 2) - 4 * a * c;

			if (delta > 0) {
				isSuccess = true;
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.printf("Il y a deux solutions à cette équation x1 = %.2f et x2 = %.2f", x1, x2);
			} else if (delta == 0) {
				isSuccess = true;
				x1 = -b / (2 * a);
				System.out.printf("Il y a une solution à cette équation x = %.2f", x1);
			} else {
				isSuccess = false;
				System.out.println("Il n'y a pas de solutions pour cette équation");
			}

		} while (isSuccess == false);
		sc.close();
	}

	public double enterNumber(String question) {

		System.out.println(question);
		double number = sc.nextDouble();
		sc.nextLine();
		return number;
	}

}
