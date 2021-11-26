import java.io.PrintStream;
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
			isValid = checkValidityCharacterSentence(url);
			
			System.out.println(isValid ? "Le protocole est valide" : "Le protocole est invalide veuillez recommencer");
//			StringBuilder sb = new StringBuilder();
//			String hexaDecimalValue;
//			int decimalValue;

			// numberOfFNTECard.matches("")
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
}
