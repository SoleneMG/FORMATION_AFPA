package darman.part6;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exo6_13_CalculMoyenneDUneClasse {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Toujours et encore sur le même principe, écrivez un algorithme permettant, à
	 * l’utilisateur de saisir les notes d'une classe. Le programme, une fois la
	 * saisie terminée, renvoie le nombre de ces notes supérieures à la moyenne de
	 * la classe.
	 */

	public static void main(String[] args) {
		int nbDeNotes;
		int i = 1; // i incrémenté à 1 pour affichage note 1, 2 etc...
		int totalDesNotes = 0;
		int moyenne = 0;
		int nbNotesAuDessusMoyenne = 0;

		System.out.println("Combien de notes souhaitez-vous rentrer ? ");
		nbDeNotes = sc.nextInt();
		sc.nextLine();
		int[] tableauDeNotes = new int[nbDeNotes];

		do {
			System.out.printf("Note %d : ", i);
			tableauDeNotes[i - 1] = sc.nextInt(); // i-1 car l'index ne démarre pas à 0 par soucis d'affichage
			sc.nextLine();

			totalDesNotes += tableauDeNotes[i - 1];
			i++;
		} while (i < tableauDeNotes.length + 1); // length+1 car l'index ne démarre pas à 0 par soucis d'affichage

		moyenne = totalDesNotes / nbDeNotes;

		for (int j = 0; j < tableauDeNotes.length; j++) {
			if (tableauDeNotes[j] > moyenne) {
				nbNotesAuDessusMoyenne++;
			}
		}

		System.out.printf("La moyenne de la classe est de %d, %d notes sont au dessus", moyenne,
				nbNotesAuDessusMoyenne);

		sc.close();
	}
}
