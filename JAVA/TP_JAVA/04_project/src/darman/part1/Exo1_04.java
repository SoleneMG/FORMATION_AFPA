package darman.part1;

public class Exo1_04 {
	/**
	 *Variables A, B, C en Entier
	Début
	A <-- 3
	B <-- 10
	C <-- A + B
	B <-- A + B
	A <-- C
	
	Fin
	*/	
	
	public static void main(String[] args) {
		int a = 3;
		int b = 10;
		int c = a + b;
		b = a + b;
		a = c;
		
		System.out.printf("a = %d \nb = %d \nc = %d", a,b,c);
	}
}
	