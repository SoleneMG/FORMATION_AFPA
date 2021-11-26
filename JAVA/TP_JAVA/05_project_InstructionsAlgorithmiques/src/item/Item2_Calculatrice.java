package item;

import java.util.Scanner;

public class Item2_Calculatrice {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Item2_Calculatrice item2 = new Item2_Calculatrice();
		int operande;
		double number1, number2, result;

		System.out.println("Entrez votre opération :");
		System.out.print("\nchiffre 1 :");
		number1 = sc.nextDouble();
		System.out.println("Choisissez votre opérande :\n 1 : +\n 2 : -\n 3 : *\n 4 : /");
		operande = sc.nextInt();
		System.out.print("\nchiffre 2 :");
		number2 = sc.nextDouble();
		sc.nextLine();
		
		result = item2.operation(operande, number1, number2);
		
		System.out.println("Resultat de l'opération = "+result);
		
		
	

	}

	public double operation(int operande, double number1, double number2) {

		switch (operande) {
		case 1: {
			return number1 + number2;
		}
		case 2: {
			return number1 - number2;
		}
		case 3: {
			return number1 * number2;
		}
		case 4: {
			if (number2 != 0) {
				return number1 / number2;
			} else {
				throw new ArithmeticException("Division par 0 impossible");
			}
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operande);
		}
	}

}
