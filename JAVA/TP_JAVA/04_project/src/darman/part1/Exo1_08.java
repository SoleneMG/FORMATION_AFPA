package darman.part1;

public class Exo1_08 {
	/**
		Que produit l’algorithme suivant ?
		Variables A, B, C en Caractères
		Début
		A <-- "423"
		B <-- "12"
		C <-- A & B
		Fin
		*/	
	
	public static void main(String[] args) {
		char a = (char)('\u0423');
		char b = '\u0012';
		try {
		char c = (char) (a + b);
		System.out.println("c = "+c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("-------------------------------------------------------------");
		
		String a1 = "423";
		String b1 = "12";
		try {
			int c = Integer.parseInt(a1) + Integer.parseInt(b1);
			System.out.println("c = "+c);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
		
	}
}
	