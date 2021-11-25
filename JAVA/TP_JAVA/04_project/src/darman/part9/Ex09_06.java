package darman.part9;

import java.util.Scanner;

public class Ex09_06 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Un des plus anciens systèmes de cryptographie (aisément déchiffrable)
	 * consiste à décaler les lettres d’un message pour le rendre illisible. Ainsi,
	 * les A deviennent des B, les B des C, etc. Ecrivez un algorithme qui demande
	 * une phrase à l’utilisateur et qui la code selon ce principe. Comme dans le
	 * cas précédent, le codage doit s’effectuer au niveau de la variable stockant
	 * la phrase, et pas seulement à l’écran.
	 */

	public static void main(String[] args) {
		System.out.println("Entrer une phrase : ");
		String sentence = sc.nextLine();
		char[] cBoard = sentence.toCharArray();
		char[] letter = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		for (int i = 0; i < cBoard.length; i++) {

			for (int j = 0; j < letter.length; j++) {
				if (Character.toUpperCase(cBoard[i]) == letter[j]) {
					if(j<letter.length-1) {
						cBoard[i] = letter[j+1];
						break;
					} else {
						cBoard[i] = letter[0];
						break;
					}
					
				}
			}

		}
		System.out.println(sentence + "\nLa nouvelle phrase est :\n");
		
		for (char c : cBoard) {
			System.out.print(Character.toLowerCase(c));
		}

		sc.close();
	}

}
