package item;

import java.util.Scanner;

public class Item1_ConversionDevises {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float indiceConversionEuroToDollar = 1.13f;
		String devise = "$";
		Item1_ConversionDevises ex01 = new Item1_ConversionDevises();
		long amount = ex01.askAnAmountInEuro(sc);

		ex01.conversionDevise(indiceConversionEuroToDollar, amount, devise);
		sc.close();
	}

	public long askAnAmountInEuro(Scanner sc) {
		System.out.print("Saisissez un montant : ");
		long result =  sc.nextLong();
		sc.nextLine();
		return result;
	}

	public void conversionDevise(float indiceConversion, long amount, String devise) {
		char unitOfMeasurement = ' ';
		double result;
		double amountAfterConversion = indiceConversion * amount;

		if (amountAfterConversion > 1_000 && amountAfterConversion < 1_000_000) {
			result = amountAfterConversion / 1_000;
			unitOfMeasurement = 'K';
		} else if (amountAfterConversion > 1_000_000) {
			result = amountAfterConversion / 1_000_000;
			unitOfMeasurement = 'M';
		} else {
			result = amountAfterConversion;
			// not a unitOfMeasurement
		}
		System.out.printf("Equivaut à %.2f%s %s",  result, unitOfMeasurement, devise);
	}

}
