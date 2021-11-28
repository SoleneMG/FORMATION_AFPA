package darman.part5;

import java.util.Scanner;

public class Exo5_08_MaxValue {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui dise ensuite quel était le plus grand parmi ces 20 nombres :
	 *Entrez le nombre numéro 1 : 12
	 *Entrez le nombre numéro 2 : 14 etc.
	 *Entrez le nombre numéro 20 : 6
	 *Le plus grand de ces nombres est  : 14
	 *Modifiez ensuite l’algorithme pour que le programme affiche de surcroît en quelle position avait été saisie ce nombre :
	 *C’était le nombre numéro 2
	 */

	public static void main(String[] args) {
		int i = 0;
		int max = -1;
		int number = -1;
		int[] numberBoard = new int[20];

		while (i < 20) {
			System.out.println("Entrer un nombre : ");
			numberBoard[i] = sc.nextInt();
			sc.nextLine();
			if (i == 0) {
				max = numberBoard[i];
				number = i + 1;
			}
			if (numberBoard[i] > max) {
				max = numberBoard[i];
				number = i + 1;
			}
			i++;
		}

		System.out.println("Le plus grand de ces nombres est : " + max + " \nC'était le nombre numéro " + number);

		sc.close();
	}
}
