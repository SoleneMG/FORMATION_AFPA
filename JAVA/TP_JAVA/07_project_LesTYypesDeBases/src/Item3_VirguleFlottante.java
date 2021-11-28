import java.util.Scanner;

public class Item3_VirguleFlottante {
	/**
	 * Cr�er une application qui affiche la surface d'un cercle � partir du diam�tre
	 * (float puis double) dont la valeur est saisie au clavier. La valeur PI sera
	 * d�clar�e dans la classe application sous forme d'une constante. Tester
	 * l'application avec des valeurs de diam�tres r�guli�res (0,2,10.5, ...) mais
	 * aussi avec des valeurs particuli�res (>10 puissance40, alphanum�riques, ...)
	 */

	static final double PI = Math.PI;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double diameterDouble;
		double diameterFloat;
		System.out.println("Entrer le diam�tre d'un cercle :");
		//diameterDouble = sc.nextDouble();
		//diameterFloat = sc.nextDouble();
		//diameterDouble = Math.pow(10, 40);
		//diameterFloat = Math.pow(10, 40);
		char c = 'a';
		diameterDouble = c;
		diameterFloat = c;
		
		System.out.println("Aire du cercle (double)" +calculateArea(diameterDouble));
		System.out.println("Aire du cercle (float)" +calculateArea(diameterFloat));
	}

	public static double calculateArea(float diameter) {
		return PI * diameter;
	}
	
	public static double calculateArea(double diameter) {
		return PI * diameter;
	}

}
