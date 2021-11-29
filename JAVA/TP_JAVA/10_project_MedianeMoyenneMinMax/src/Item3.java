import java.util.Arrays;
import java.util.Scanner;

public class Item3 {

	private static int NB_MAX_NOTES = 10;
	private static final Scanner sc = new Scanner(System.in);
	private int emptyValue = 0;
	private int nbDeNote = -1;

	/**
	 * Ecrire une application destinée à afficher la moyenne, la valeur minimum, la
	 * valeur maximum et la médiane d'une collection de 10 notes. L'opérateur pourra
	 * saisir moins de 10 notes en tapant une note non significative (0 par
	 * exemple).
	 */

	public static void main(String[] args) {
		Item3 item3 = new Item3();
		float[] notes = item3.saisirLesNotes();
		// item3.afficherResultatV1(notes);
		item3.afficherResultatV2(notes);

	}

	public float[] saisirLesNotes() {
		float[] notes = new float[NB_MAX_NOTES];
		byte i = 0;
		do {
			System.out.println("Entrer une note :");
			notes[i] = sc.nextFloat();
			sc.nextLine();
			if (notes[i] == 0) {
				break;
			}
			i++;
		} while (i < NB_MAX_NOTES);
		return notes;
	}

	/*
	 * private float sommeDesNotes(float[] tableau) { float somme = 0; for (float f
	 * : tableau) { somme += f; } return somme; }
	 * 
	 * public float[] trierNotesV1(float[] tableau) { // tri à bulle ordre
	 * décroissant boolean estChange = true; do { estChange = false; for (int i = 0;
	 * i < tableau.length - 1; i++) { if (tableau[i] < tableau[i + 1]) { float max =
	 * tableau[i + 1]; tableau[i + 1] = tableau[i]; tableau[i] = max; estChange =
	 * true; } } } while (estChange);
	 * 
	 * // créer un nouveau tableau pour supprimer les valeurs à 0 float[]
	 * tableauTronque = null; for (int i = 0; i < tableau.length; i++) { if
	 * (tableau[i] == 0) { tableauTronque = new float[i]; break; } } // affecte les
	 * valeurs de l'ancien tableau au nouveau for (int i = 0; i <
	 * tableauTronque.length; i++) { tableauTronque[i] = tableau[i]; }
	 * 
	 * // reverse : mettre les valeurs dans l'ordre croissant for (int i = 0; i <
	 * tableauTronque.length; i++) { float temp = tableauTronque[i];
	 * tableauTronque[i] = tableauTronque[tableauTronque.length - i - 1];
	 * tableauTronque[tableauTronque.length - i - 1] = temp; }
	 * 
	 * return tableauTronque; } // fin trierNoteV1
	 * 
	 * public float calculerMoyenneV1(float sommeDesNotes, int nbDeNotes) { return
	 * sommeDesNotes / nbDeNotes; }
	 * 
	 * public float calculerMedianeV1(float[] tableauTrie) { return
	 * tableauTrie.length % 2 == 0 ? (tableauTrie[tableauTrie.length / 2] +
	 * tableauTrie[(tableauTrie.length / 2) + 1]) / 2 :
	 * tableauTrie[tableauTrie.length / 2]; }
	 * 
	 * public void afficherResultatV1(float[] tableau) {
	 * System.out.println("********************** VERSION 1 **********************"
	 * ); System.out.println("Liste des notes :" + Arrays.toString(tableau));
	 * System.out.printf("Moyenne : %.2f\n",
	 * calculerMoyenneV1(sommeDesNotes(tableau), tableau.length)); float[]
	 * tableauTrie = trierNotesV1(tableau);
	 * System.out.println("Note la plus basse : " + tableauTrie[0]);
	 * System.out.println("Note la plus haute : " + tableauTrie[tableauTrie.length -
	 * 1]); System.out.println("Note médiane : " + calculerMedianeV1(tableauTrie));
	 * }
	 */

	public float[] trierNotesV2(float[] tableau) {
		boolean estChange = true;
		do {
			estChange = false;
			for (int i = 0; i < tableau.length - 1; i++) {
				if (tableau[i] > tableau[i + 1]) {
					float min = tableau[i + 1];
					tableau[i + 1] = tableau[i];
					tableau[i] = min;
					estChange = true;
				}
			}
		} while (estChange);

		return tableau;
	}

	public float calculerMoyenneV2(float[] tableau) {
		float sommeDesValeurs = 0;
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] == 0) {
				emptyValue++;
			} else {
				sommeDesValeurs += tableau[i];
			}
		}
		return sommeDesValeurs / (tableau.length - emptyValue);
	}

	public float calculerMedianeV2(float[] tableauTrie) {
		return (tableauTrie.length - emptyValue) % 2 == 0
				? (tableauTrie[tableauTrie.length - emptyValue / 2]	+ tableauTrie[(tableauTrie.length - emptyValue / 2) + 1]) / 2
				: tableauTrie[tableauTrie.length - emptyValue / 2];
	}

	public void afficherResultatV2(float[] tableau) {
		System.out.println("\n********************** VERSION 2 **********************");
		float moyenne = calculerMoyenneV2(tableau);
		float[] tableauTrie = trierNotesV2(tableau);
		float mediane = calculerMedianeV2(tableauTrie);
		if (emptyValue != 10) {
			System.out.println(emptyValue);
			System.out.println("Liste des notes :" + Arrays.toString(tableau));
			System.out.println("Liste des notes :" + Arrays.toString(tableauTrie));
			System.out.printf("Moyenne : %.2f\n", moyenne);
			System.out.println("Note la plus basse : " + tableauTrie[emptyValue + 1]);
			System.out.println("Note la plus haute : " + tableauTrie[tableauTrie.length - 1]);
			System.out.println("Note médiane : " + mediane);
		} else {
			System.out.println("Le tableau est vide");
		}
	}

}
