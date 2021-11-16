package darman.part1;

public class Exo1_09 {
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
		String a = "423";
		String b = "12";
		try {
		String c = (String) (a + b);
		System.out.println("c = "+c);
		} catch (Exception e) {
			System.out.println("Erreur on ne peut pas additionner des chars");
		}
	}
}
	