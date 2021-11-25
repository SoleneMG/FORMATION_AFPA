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
		int OFFSET;
		String sentence, encrypted;

		System.out.println("Entrer une phrase : ");
		sentence = sc.nextLine();
		do {
			System.out.println("Choisissez le décalage : ");
			OFFSET = sc.nextInt();
			sc.nextLine();
			if(OFFSET == 26) {
				System.out.println("26 ? Vraiment ? No way...try again");
			}
		} while (OFFSET == 26);

		encrypted = encode(sentence, OFFSET).toString().toLowerCase();
	
		System.out.println("Phrase non cryptée : \n" + sentence);
		System.out.println("Phrase cryptée : \n" + encrypted);

		sc.close();
	}

	public static StringBuilder encode(String s, int OFFSET) {
		StringBuilder sb = new StringBuilder();
		String hexaDecimalValue;
		int decimalValue;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				sb.append(s.charAt(i));
			} else {
				hexaDecimalValue = Integer.toHexString(s.toUpperCase().charAt(i));
				decimalValue = Integer.parseInt(hexaDecimalValue, 16);
				sb.append((char) (decimalValue + OFFSET));
			}
		}
		return sb;
	}

}
