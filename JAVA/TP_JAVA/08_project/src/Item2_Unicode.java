import java.util.Scanner;

public class Item2_Unicode {
	static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire une application qui affiche la repr�sentation UNICODE des caract�res
	 * qui constituent une chaine "cod�e en dur" contenant des caract�res
	 * internationaux. 
	 * Par exemple, pour la chaine "L'�l�ve" on a l'affichage
	 * suivant :
	 * \u004c \u0027 \u00e9 \u006c \u00e8 \u0076 \u0065
	 * 
	 * M�me chose avec une chaine saisie au clavier
	 */
	
	public static void main(String[] args) {
		System.out.println("Entrez une chaine : ");
		String s = sc.nextLine();
		// String s = "L'�l�ve";
		char[] charTab = s.toCharArray();

		System.out.printf("Transcrite en unicode :");
		for (int i = 0; i < charTab.length; i++) {
			System.out.printf("\\u%04x ", (int) charTab[i]);
		}

	}

}
