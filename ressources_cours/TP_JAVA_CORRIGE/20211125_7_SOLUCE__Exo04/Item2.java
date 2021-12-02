import specialIO.*;

/**
 * Objectif: Les structures conditionnelles (if...else et switch)<p>
 *
 * La calculette
 *
 * @author X. HER
 * @version 1.0 du 30/05/2001
 */ 


public class Item2 
{

	public static void main (String arg [])
	{
		double gvaleur, dvaleur;
		char signe;
		
		System.out.println("\nCALCULETTE");
		System.out.print("Donner la gvaleur : ");
		gvaleur = Console.in.readDouble();

		System.out.print("Donner le signe (+-/*x): ");
		signe = Console.in.readChar();

		System.out.print("Donner la dvaleur : ");
		dvaleur = Console.in.readDouble();

		if (Double.isNaN(dvaleur)  || Double.isNaN(gvaleur)) 
			System.out.println ("Valeurs incorrectes");
		else {
			switch (signe) {
				case '+':
					System.out.println("Le resultat vaut " + (gvaleur + dvaleur));
					break;
				case '-':
					System.out.println("Le resultat vaut " + (gvaleur - dvaleur));
					break;
				case '/':
					System.out.println("Le resultat vaut " + (gvaleur / dvaleur));
					break;
				case '*':
				case 'x':
				case 'X':
					System.out.println("Le resultat vaut " + (gvaleur * dvaleur));
					break;
				default:
					System.out.println ("Erreur de signe");
			}
		}
	}			
}