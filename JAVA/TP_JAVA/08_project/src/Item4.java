import java.util.Scanner;

public class Item4 {
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Ecrire une application qui à partir d'une URL tapée au clavier extrait le nom du protocole le nom du site et le nom du fichier HTML
	 * Une URL valide est de la forme Protocole://serveur/fichier
	 * Traiter les situations anormales
	 */

	
	public static void main(String[] args) {
		String url;
		boolean isValid = false;
		do {
		System.out.println("Rentrer une URL valide : ");
		url = sc.nextLine();
		
		
			StringBuilder sb = new StringBuilder();
			String hexaDecimalValue;
			int decimalValue;
			
			/*
			 * for(int i=0;i<url.length();i++) { if(url.charAt(i)==':') {
			 * 
			 * } } return sb;
			 */
	
		// numberOfFNTECard.matches("")
		} while(isValid);
	}
}
