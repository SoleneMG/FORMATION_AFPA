
public class Item3 {
	/**
	 * Ecrire une méthode dont la signature est 
	 * static boolean verifieNoSS (long noSS)
	 * permettant de tester la validité de la clef d'un numéro de sécurité social
	 * 2.55.06.75.113 <79> est un numéro correct
	 * 2.55.06.75.113.052 <65> ne l'est pas
	 */

	public static void main(String[] args) {
		long noSS = 2550675113052L;
		verifieNoSS(noSS);
		
	}
	
	static boolean verifieNoSS (long noSS) {
		int result = 97 - (int) (noSS % 97);
		System.out.println(result);
		
		return true;
	}

}
