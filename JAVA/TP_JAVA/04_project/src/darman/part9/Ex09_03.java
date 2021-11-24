package darman.part9;

import java.util.Scanner;

public class Ex09_03 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez un algorithme qui demande une phrase � l�utilisateur et qui affiche �
	 * l��cran le nombre de mots de cette phrase. On suppose que les mots ne sont
	 * s�par�s que par des espaces (et c'est d�j� un petit peu moins b�te).
	 */

	public static void main(String[] args) {
		System.out.println("Entrer une phrase : ");
		String sentence = sc.nextLine();
		char[] cBoard = sentence.toCharArray();
		int nbOfWord = 0;
		int nbOfWordv2 = 0;
		
		
		///v1
		for (Character c : cBoard) {
			if (sentence.length() == 0) {
				return;
			}
			if (c.equals(' ')) {
				nbOfWord++;
			}
		}
		if ((sentence.length() > 0 && nbOfWord == 0) || nbOfWord != 0) {
			nbOfWord++;
		}
		System.out.println(sentence + " est compos� de " + nbOfWord + " mot(s)");
		///fin v1
		
		/// v2
		for(int i =0; i<cBoard.length; i++) {
			if(Character.isWhitespace(cBoard[i])) {
				nbOfWordv2++;
			}
		}
		System.out.println(sentence + " est compos� de " + nbOfWord + " mot(s)");
		/// fin v2
		
		sc.close();
	}

}
