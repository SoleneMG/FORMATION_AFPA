package darman.part1;

public class Exo1_06 {
	/**
	�crire un algorithme permettant d��changer les valeurs de deux variables A et B, et ce quel que soit leur contenu pr�alable.
	*/	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c = a;
		a = b;
		b = c;
		
		System.out.printf("Valeurs de d�part : a = 5 | b = 2 \nValeurs d'arriv�es : a = %d | b = %d", a,b);
	}
}
	