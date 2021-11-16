package darman.part1;

public class Exo1_05 {
	/**
	 *Variables A, B en Entier
	Début
	A <-- 5
	B <-- 2
	A <-- B
	B <-- A
	Fin
	*/	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		a = b;
		b = a;
		
		System.out.printf("a = %d \nb = %d", a,b);
	}
}
	