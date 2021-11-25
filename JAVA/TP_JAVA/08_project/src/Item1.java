import java.util.Scanner;

public class Item1 {
	static Scanner sc = new Scanner(System.in);
	/** Ecrire une application correspondatn � l'algorithme ci-dessous :
	 * DEBUT
	 * 		FAIRE
	 * 			saisir 2 chaines
	 * 			SI les chaines sont �gales ALORS afficher "IDENTIQUE"
	 * 			JUSQU'A ce que l'une des chaines soit "FIN"
	 * FIN
	 * @param args
	 */
	
	public static void main(String[] args) {
		String sentence1, sentence2;
		boolean isStop = false;
		do {
			System.out.println("Premi�re chaine de caract�res : ");
			sentence1 = sc.nextLine();
			System.out.println("Seconde chaine de caract�res : ");
			sentence2 = sc.nextLine();
			
			System.out.println(sentence1.equals(sentence2) ? "IDENTIQUE" : "PAS IDENTIQUE");
			
			isStop = sentence1.toUpperCase().equals("FIN") || sentence2.toUpperCase().equals("FIN"); 
			
		} while(!(isStop));

	}

}
