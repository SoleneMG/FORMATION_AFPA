package darman.part1;

public class Exo1_01 {
	/**
	 * Variables A, B en Entier
	Début
	A <-- 1
	B <-- A + 3
	A <-- 3
	Fin 
	*/
	
	public static void main(String[] args) {
		byte a = 1;
		byte b = (byte) (a + 3);
		a = 3;
		System.out.printf("a = %d \nb = %d", a,b);
	}

}
