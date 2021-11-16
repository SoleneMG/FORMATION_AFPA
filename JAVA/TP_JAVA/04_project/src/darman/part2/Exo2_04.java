package darman.part2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exo2_04 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire un programme qui lit le prix HT d’un article, le nombre d’articles et
	 * le taux de TVA, et qui fournit le prix total TTC correspondant. Faire en
	 * sorte que des libellés apparaissent clairement.
	 */

	public static void main(String[] args) {

		String priceHTString = returnString("Veuillez renseigner le prix HT :");
		String numberOfArticlesString = returnString("Veuillez renseigner le nombre d'articles :");
		String amountTVAString = returnString("Veuillez renseigner le montant de la TVA :");

		try {
			double priceHT = Double.valueOf(priceHTString);
			int numberOfArticles = Integer.valueOf(numberOfArticlesString);
			double amountTVA = Double.valueOf(amountTVAString);

			double amount = calculPriceTVA(priceHT, numberOfArticles, amountTVA);
			NumberFormat format = new DecimalFormat(".##");
			String amountString = format.format(amount);

			System.out.printf("prix HT = %s \nnombre d'articles = %s \nmontant TVA = %s \nLe montant total est de : %s €",
					priceHTString, numberOfArticlesString, amountTVAString, amountString);

		} catch (NumberFormatException e) {
			System.out.println("Saisie incorrecte");
			e.printStackTrace();
		}

	}

	public static String returnString(String question) {
		System.out.println(question);
		return sc.nextLine();
	}

	public static double calculPriceTVA(double price, int numberOfArticle, double amountTVA) {
		return (price * amountTVA) * numberOfArticle;
	}

}
