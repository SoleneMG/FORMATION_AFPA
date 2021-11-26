import java.util.Scanner;

public class Item2_Unicode {
	static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire une application qui affiche la représentation UNICODE des caractères
	 * qui constituent une chaine "codée en dur" contenant des caractères
	 * internationaux. 
	 * Par exemple, pour la chaine "L'élève" on a l'affichage
	 * suivant :
	 * \u004c \u0027 \u00e9 \u006c \u00e8 \u0076 \u0065
	 * 
	 * Même chose avec une chaine saisie au clavier
	 */
	
	public static void main(String[] args) {
		System.out.println("Entrez une chaine : ");
		String s = sc.nextLine();
		// String s = "L'élève";
		char[] charTab = s.toCharArray();

		System.out.printf("Transcrite en unicode :");
		for (int i = 0; i < charTab.length; i++) {
			System.out.printf("\\u%04x ", (int) charTab[i]);
		}

	}

}
