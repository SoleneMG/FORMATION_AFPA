package darman.part9;

import java.util.Scanner;

public class Ex09_02 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrivez un algorithme qui demande un mot � l�utilisateur et qui affiche �
	 * l��cran le nombre de lettres de ce mot (c'est vraiment tout b�te).
	 */

	public static void main(String[] args) {
		System.out.println("Entrer un mot : ");
		String word = sc.nextLine();
		int lengthOfWord = word.length();
		System.out.println(word + " est compos� de " + lengthOfWord + " lettre(s)");

		sc.close();
	}

}
