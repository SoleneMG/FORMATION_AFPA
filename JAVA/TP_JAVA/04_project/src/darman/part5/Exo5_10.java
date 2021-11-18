package darman.part5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo5_10 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Lire la suite des prix (en euros entiers et terminée par zéro) des achats
	 * d’un client. Calculer la somme qu’il doit, lire la somme qu’il paye, et
	 * simuler la remise de la monnaie en affichant les textes "10 Euros", "5 Euros"
	 * et "1 Euro" autant de fois qu’il y a de coupures de chaque sorte à rendre.
	 */

	public static void main(String[] args) {

		List<Integer> achatListe = saisieArticle();
		int total = calculPrixTotal(achatListe);
		System.out.println("Le montant total de vos articles s'élèvent à " + total + "€");
		int montantPaye;
		do {
		System.out.println("Saisir le montant remis par le client :");
		montantPaye = sc.nextInt();
		sc.nextLine();
		if(montantPaye < total) {
			System.out.println("Le montant total des achats est supérieur");
		}
		}while (montantPaye < total);
		renduMonnaie(total, montantPaye);

		sc.close();
	}

	public static List<Integer> saisieArticle() {
		int i = 1;
		int montant = -1;
		List<Integer> achatListe = new ArrayList<Integer>();
		do {
			System.out.println("Prix article " + i + " :");
			montant = sc.nextInt();
			sc.nextLine();
			achatListe.add(montant);
			i++;
			if (montant != 0) {
				System.out.println("(Pour terminer la saisie entrer 0)");
			}
		} while (!(montant == 0));
		return achatListe;
	}

	public static int calculPrixTotal(List<Integer> achatListe) {
		int total = 0;
		for (int i = 0; i < achatListe.size(); i++) {
			total += achatListe.get(i);
		}
		return total;
	}

	public static void renduMonnaie(int total, int paiement) {
		int dixEuros = 0;
		int cinqEuros = 0;
		int unEuros = 0;

		int renduMonnaie = paiement - total;
		if (renduMonnaie >= 10) {
			do {
				dixEuros++;
				renduMonnaie -= 10;
			} while (renduMonnaie > 10);
		}
		if (renduMonnaie >= 5) {
			do {
				cinqEuros++;
				renduMonnaie -= 5;
			} while (renduMonnaie > 5);
		}
		if (renduMonnaie >= 1) {
			do {
				unEuros++;
				renduMonnaie -= 1;
			} while (renduMonnaie != 0);
		}
		if (dixEuros != 0) {
			System.out.printf("Vous devez rendre au client %d x 10€\n", dixEuros);
		}
		if (cinqEuros != 0) {
			System.out.printf("Vous devez rendre au client %d x 5€\n", cinqEuros);
		}
		if (unEuros != 0) {
			System.out.printf("Vous devez rendre au client %d x 1€\n", unEuros);
		}

	}
}
