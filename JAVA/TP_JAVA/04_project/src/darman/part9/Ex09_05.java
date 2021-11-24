package darman.part9;

import java.util.Scanner;

public class Ex09_05 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez un algorithme qui demande une phrase à l’utilisateur. Celui-ci
	 * entrera ensuite le rang d’un caractère à supprimer, et la nouvelle phrase
	 * doit être affichée (on doit réellement supprimer le caractère dans la
	 * variable qui stocke la phrase, et pas uniquement à l’écran).
	 */

	public static void main(String[] args) {
		System.out.println("Entrer une phrase : ");
		String sentence = sc.nextLine();
		System.out.println("Entrer le rang du caractère à supprimer : ");
		int rank = sc.nextInt();
		char[] cBoard = sentence.toCharArray();
		int j = 0;
		char[] cBoardMinusCRanked = new char[cBoard.length-1];


		for (int i =0; i<cBoard.length; i++) {
			if(i!=rank) {
				cBoardMinusCRanked[j] = cBoard[i];
				j++;
			}
		}
		System.out.printf(sentence+ "\nvous voulez supprimer le caractère n° "+rank+"\nLa nouvelle phrase est :\n");
		for (char c : cBoardMinusCRanked) {
			System.out.print(c);
		}
		

		sc.close();
	}

}
