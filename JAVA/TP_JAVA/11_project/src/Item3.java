
public class Item3 {
	/**
	 * Ecrire une m�thode dont la signature est 
	 * static boolean verifieNoSS (long noSS)
	 * permettant de tester la validit� de la clef d'un num�ro de s�curit� social
	 * 2.55.06.75.113 <79> est un num�ro correct
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
