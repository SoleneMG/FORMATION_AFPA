package darman.part1;

public class Exo1_02 {
	/**
	 Variables A, B, C en Entier
		Début
		A <-- 5
		B <-- 3
		C <-- A + B
		A <-- 2
		C <-- B - A
		Fin
	Fin
	*/	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = a + b;
		a = 2;
		c = b - a;
		
		
		System.out.printf("a = %d \nb = %d \nc = %d", a,b,c);
	}
}
	