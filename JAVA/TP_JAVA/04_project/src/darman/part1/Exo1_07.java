package darman.part1;

public class Exo1_07 {
	/**
	on dispose de trois variables A, B et C. Ecrivez un algorithme transf�rant � B la valeur de A, � C la valeur de B et � A la valeur de C
	*/	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c = 10;
		int d = c;
		c = b;
		b = a;
		a = d;
		
		System.out.printf("Valeurs de d�part : a = 5 | b = 2 | c = 10 \nValeurs d'arriv�es : a = %d | b = %d | c = %d", a,b,c);
	}
}
	