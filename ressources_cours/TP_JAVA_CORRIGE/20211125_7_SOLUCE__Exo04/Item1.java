//import specialIO.*;
import java.util.Scanner;

/**
 * Objectif: Les structures conditionnelles (if ... else)<p>
 *
 * Conversion Euro / Franc
 *
 * @author AFPA
 * @version 1.0 du 30/05/2001
 */
public class Item1
{
	static final double valEuro = 6.55957;
	//static final double VAL_EURO = 6.55957;

	public static void main (String arg [])
	{
		double euro ;
		double franc ;
		
		System.out.println("\nConversion Euro/Franc");
		System.out.print("Donner une somme en Euro : ");

		//euro = Console.in.readDouble();
		euro = (new Scanner(System.in)).nextDouble();

		franc = euro * valEuro;
		if (euro != 1)
			System.out.print(euro + " euros valent ");
		else
			System.out.print(euro + " euro vaut ");
		if (franc < 1e3)
			System.out.println("" + franc + " F");
		else
			if (franc < 1e6)
				System.out.println("" + franc/1e3 + " kF" );
			else
				System.out.println("" + franc/1e6 + " MF" );
	}
}