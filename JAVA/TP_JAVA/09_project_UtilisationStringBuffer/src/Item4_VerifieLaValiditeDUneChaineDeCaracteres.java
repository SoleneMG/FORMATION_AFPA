import java.util.Scanner;

public class Item4_VerifieLaValiditeDUneChaineDeCaracteres {
	static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire une application qui à partir d'une URL tapée au clavier extrait le nom
	 * du protocole le nom du site et le nom du fichier HTML Une URL valide est de
	 * la forme Protocole://serveur/fichier Traiter les situations anormales
	 */

	public static void main(String[] args) {
		String url;
		boolean isValid = false;
		do {
			System.out.println("Rentrer une URL valide : ");
			url = sc.nextLine();
			//isValid = checkValidityCharacterSentence(url);
			isValid = checkWithRegex(url);
			System.out.println(isValid ? "Le protocole est valide" : "Le protocole est invalide veuillez recommencer");
			
		} while (!isValid);
		sc.close();
	}

	public static boolean checkValidityCharacterSentence(String s) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(0) == ':') {
				return false;
			} else if (s.charAt(i) == ':') {
				if (!(s.charAt(i + 1) == '/' && s.charAt(i + 2) == '/')) {
					return false;
				} else if (s.charAt(i + 3) == '/') {
					return false;
				} else if (s.charAt(s.length() - 1) == '/') {
					return false;
				} else {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkWithRegex(String s) {
		String regex = "(?<Protocole>[a-zA-Z]+):\\/\\/(?<serveur>\\S+)\\/(?<filesPath>\\S+)";
		return s.matches(regex) ? true : false;
	}
}
