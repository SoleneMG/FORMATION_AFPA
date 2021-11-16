package darman.part1;

public class Exo1_06 {
	/**
	écrire un algorithme permettant d’échanger les valeurs de deux variables A et B, et ce quel que soit leur contenu préalable.
	*/	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c = a;
		a = b;
		b = c;
		
		System.out.printf("Valeurs de départ : a = 5 | b = 2 \nValeurs d'arrivées : a = %d | b = %d", a,b);
	}
}
	