package darman.part1;

public class Exo1_03 {
	/**
	 *Variables A, B, C en Entier
	Début
	A <-- 5
	B <-- A + 4
	A <-- A + 1
	B <-- A - 4
	Fin
	*/	
	
	public static void main(String[] args) {
		int a = 5;
		int b = a + 4;
		a = a + 1;
		b = a - 4;
		
		System.out.printf("a = %d \nb = %d", a,b);
	}
}
	