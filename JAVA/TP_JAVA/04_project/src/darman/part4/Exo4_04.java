package darman.part4;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exo4_04 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Un magasin de reprographie facture 0,10 E les dix premières photocopies, 0,09
	 * E les vingt suivantes et 0,08 E au-delà. Ecrivez un algorithme qui demande à
	 * l’utilisateur le nombre de photocopies effectuées et qui affiche la facture
	 * correspondante.
	 */

	public static void main(String[] args) {
		int quantity;
		double price;
		Format format = new DecimalFormat("0.00");
		
		do {
		System.out.println("Combien de photocopies désirez-vous effectuer ? ");
		quantity = sc.nextInt();
		sc.nextLine();
		} while (quantity <0 || quantity == 0);

		if(quantity <11) {
			price = 0.10;
			String priceFormatted = format.format(calculatePrice(quantity, price));
			System.out.printf("Pour %d copie(s), votre facture s'élève à %s €",quantity , priceFormatted );
		} else if(quantity<21) {
			price = 0.09;
			String priceFormatted = format.format(calculatePrice(quantity, price));
			System.out.printf("Pour %d copie(s), votre facture s'élève à %s €",quantity , priceFormatted );
		}else {
			price = 0.08;
			String priceFormatted = format.format(calculatePrice(quantity, price));
			System.out.printf("Pour %d copie(s), votre facture s'élève à %s €",quantity , priceFormatted );
		}

		sc.close();

	}

	public static double calculatePrice(int quantity, double price) {
		return quantity * price;
	}

}
