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
		long noSS = 0;
		int key = 0;
	
		System.out.println("Renseigner votre numéro de sécurité sociale");
		//String noSSString = sc.nextLine();
		String noSSString = "2.55.06.75.113.052<79>";
		
			noSSString = noSSString.replace("2A","19");
			noSSString = noSSString.replace("2B","18");
			noSSString = noSSString.replace(".","");
			noSSString = noSSString.replace("<","");
			noSSString = noSSString.replace(">","");
			
			noSS = Long.parseLong(noSSString.substring(0, noSSString.length()-2));
			key = Integer.parseInt(noSSString.substring(noSSString.length()-2, noSSString.length()));
			
			if(verifieNoSS(noSS, key)) {
				System.out.println("OK");
			} else {
				System.out.println("NOK");
			}
		}
	
	static boolean verifieNoSS (long noSS, int key) {
		int result = 97 - (int) (noSS % 97);
		if(result==key) {
			return true;
		}
		return false;
	}


}
