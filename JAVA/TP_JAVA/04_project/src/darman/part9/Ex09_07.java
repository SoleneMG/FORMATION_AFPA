package darman.part9;

import java.util.Scanner;

public class Ex09_07 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Une amélioration (relative) du principe précédent consiste à opérer avec un
	 * décalage non de 1, mais d’un nombre quelconque de lettres. Ainsi, par
	 * exemple, si l’on choisit un décalage de 12, les A deviennent des M, les B des
	 * N, etc. Réalisez un algorithme sur le même principe que le précédent, mais
	 * qui demande en plus quel est le décalage à utiliser. Votre sens proverbial de
	 * l'élégance vous interdira bien sûr une série de vingt-six "Si...Alors"
	 */

	public static void main(String[] args) {
		System.out.println("Entrer une phrase : ");
		String sentence = sc.nextLine();
		System.out.println("Choisissez le décalage : ");
		int rankOffset = sc.nextInt();
		sc.nextLine();
		char[] cBoard = sentence.toCharArray();
		char[] letter = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char[]letterEncoded = encode(rankOffset, letter);

		for (int i = 0; i < cBoard.length; i++) {

			for (int j = 0; j < letter.length; j++) {
				if (Character.toUpperCase(cBoard[i]) == letter[j]) {
					cBoard[i]=letterEncoded[i];
				}
			}

		}
		System.out.println(sentence + "\nLa nouvelle phrase est :\n");

		for (char c : cBoard) {
			System.out.print(Character.toLowerCase(c));
		}

		sc.close();
	}

	public static char[] encode(int offset, char[] letter) {
		char[]letterEncoded = new char[letter.length];
		int j =0;
		for(int i =0;i<letter.length;i++) {
			if(j==letter.length-offset) {
				j=0;
			}
			letterEncoded[i]=letter[j+offset];
			j++;
		}
return letterEncoded;
	}

}
