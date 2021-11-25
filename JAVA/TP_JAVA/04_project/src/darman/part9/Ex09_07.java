package darman.part9;

import java.util.Scanner;

public class Ex09_07 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Une am�lioration (relative) du principe pr�c�dent consiste � op�rer avec un
	 * d�calage non de 1, mais d�un nombre quelconque de lettres. Ainsi, par
	 * exemple, si l�on choisit un d�calage de 12, les A deviennent des M, les B des
	 * N, etc. R�alisez un algorithme sur le m�me principe que le pr�c�dent, mais
	 * qui demande en plus quel est le d�calage � utiliser. Votre sens proverbial de
	 * l'�l�gance vous interdira bien s�r une s�rie de vingt-six "Si...Alors"
	 */

	public static void main(String[] args) {
		int OFFSET;
		String sentence, encrypted;

		System.out.println("Entrer une phrase : ");
		sentence = sc.nextLine();
		do {
			System.out.println("Choisissez le d�calage : ");
			OFFSET = sc.nextInt();
			sc.nextLine();
			if(OFFSET == 26) {
				System.out.println("26 ? Vraiment ? No way...try again");
			}
		} while (OFFSET == 26);

		encrypted = encode(sentence, OFFSET).toString().toLowerCase();
	
		System.out.println("Phrase non crypt�e : \n" + sentence);
		System.out.println("Phrase crypt�e : \n" + encrypted);

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
