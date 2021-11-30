import java.util.Scanner;

public class Item3 {
	/**
	 * Ecrire une méthode dont la signature est 
	 * static boolean verifieNoSS (long noSS)
	 * permettant de tester la validité de la clef d'un numéro de sécurité social
	 * 2.55.06.75.113 <79> est un numéro correct
	 * 2.55.06.75.113.052 <65> ne l'est pas
	 */
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//long noSS = 2550675113052L;
		long noSS;
		int key;
		//verifieNoSS(noSS);
		System.out.println("Renseigner votre numéro de sécurité sociale");
		String noSSString = sc.nextLine();
		for (int i = 0; i < noSSString.length(); i++) {
			sb.append(noSSString.replace("2A","19"));
			sb.append(noSSString.replace("2B","18"));
			sb.append(noSSString.replace(".",""));
			if(noSSString.charAt(i)==60) {
				noSS = Long.parseLong(noSSString.substring(0, i));
				key = Integer.parseInt(noSSString.substring(i+1, i+2));
			}
		}
		
		//if(noSSString.length())
		//verifieNoSS(noSS);
	}
	
	static boolean verifieNoSS (long noSS, int key) {
		int result = 97 - (int) (noSS % 97);
		if(result==key) {
			return true;
		}
		
		return false;
	}


}
