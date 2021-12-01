package fr.afpa.util;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Convertisseur {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String devise = choiceDevise();
		convert(devise);

	}

	public static void convert(String deviseString) {
		BigDecimal amount = null;
		BigDecimal amountConverted, amountConvertedScaled;
		try {
			amount = enterAmount(deviseString);
		} catch (NullPointerException e) {
			System.err.println("La méthode askValue renvoie une valeur nulle");
			e.printStackTrace();
		}
		if (deviseString.equals("euros")) {
			amountConverted = fr.afpa.math.Math.euroToDollar(amount);
			amountConvertedScaled = fr.afpa.math.Math.scale(amountConverted);
			System.out.println("La somme convertie vaut : $" + amountConvertedScaled);
		} else if (deviseString.equals("dollars")) {
			amountConverted = fr.afpa.math.Math.dollarToEuro(amount);
			amountConvertedScaled = fr.afpa.math.Math.scale(amountConverted);
			System.out.println("La somme convertie vaut : " + amountConvertedScaled + "€");
		} else {
			System.out.println("Devise non supportée" + deviseString);
		}
	}

	public static String choiceDevise() {
		boolean isContinue = false;
		String deviseString;
		int devise = -1;
		do {
			isContinue = false;
			System.out.println("Choisissez votre devise :\n1 - EUROS \n2 - DOLLAR");
			try {
				devise = sc.nextInt();
				if (devise != 1 && devise != 2) {
					System.out.println("Choix non conforme. Veuillez recommencer");
					isContinue = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Choix non conforme. Veuillez recommencer");
				isContinue = true;
				// e.printStackTrace();
			} finally {
				sc.nextLine();
			}
		} while (isContinue);

		switch (devise) {
		case 1: {
			deviseString = "euros";
			break;
		}
		case 2: {
			deviseString = "dollars";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + devise);
		}

		return deviseString;

	}

	public static BigDecimal enterAmount(String deviseString) throws NullPointerException {
		boolean isContinue = false;
		String amountString = null;
		BigDecimal amount = null;
		do {
			isContinue = false;
			System.out.println("Entrer une valeur en " + deviseString + ": ");
			amountString = sc.nextLine();

			if (amountString.isEmpty()) {
				System.out.println("Saisie incorrecte");
				isContinue = true;
			} else if (!(amountString.matches("^[0-9]+$"))) {
				System.out.println("Saisie incorrecte");
				isContinue = true;
			} else {
				amount = new BigDecimal(amountString);
			}

		} while (isContinue);

		return amount;
	}
}
