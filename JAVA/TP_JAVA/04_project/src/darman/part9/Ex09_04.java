package darman.part9;

import java.util.Scanner;

public class Ex09_04 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez un algorithme qui demande une phrase à l’utilisateur et qui affiche à
	 * l’écran le nombre de voyelles contenues dans cette phrase. On pourra écrire
	 * deux solutions. La première déploie une condition composée bien fastidieuse.
	 * La deuxième, en utilisant la fonction Trouve, allège considérablement
	 * l'algorithme.
	 */

	public static void main(String[] args) {
		System.out.println("Entrer une phrase : ");
		String sentence = sc.nextLine();
		char[] cBoard = sentence.toCharArray();
		char[] vowel  = {'a','e','i','o','u'};
		int nbOfVowel = 0;
		
		for (Character c : cBoard) {
			for (Character v : vowel) {
				if(c.equals(v)) {
					nbOfVowel++;
				}
			}
		}
		System.out.printf("Il y a %d voyelles dans la phrase", nbOfVowel);

		sc.close();
	}

}
