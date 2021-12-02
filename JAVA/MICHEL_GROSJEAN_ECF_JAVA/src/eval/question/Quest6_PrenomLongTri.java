package eval.question;

import java.util.Arrays;
import java.util.Scanner;

public class Quest6_PrenomLongTri {
	static Scanner sc = new Scanner(System.in);
	

	/**
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 6\n" +
"Demander 5 prénoms et les stocker dans un tableau.\n" +
"Les réafficher « triés » de telle sorte que le prénom le plus long\n" +
"soit en premier etc.\n" +
"Par exemple avec Didier, Bernard, Christine, Ahn, Ali\n" +
"Le programme affichera\n" +
"Christine, Bernard, Didier, Ahn, Ali\n" +
"*******************************************************************\n\n\n"
		);

		int NB_MAX_DE_PRENOM = 5;

		String[] tab = new String[NB_MAX_DE_PRENOM];
		for (int i = 0; i < NB_MAX_DE_PRENOM; i++) {
			System.out.println("Entrer un prénom : ");
			tab[i] = sc.nextLine();
		}

		boolean estChange = false;
		do {
			estChange = false;
			for (int i = 1; i < tab.length; i++) {
				if (tab[i].length() > tab[i - 1].length()) {
					String tmp = tab[i - 1];
					tab[i - 1] = tab[i];
					tab[i] = tmp;
					estChange = true;
				}
			}
		} while (estChange);
		
		System.out.println("\n"+Arrays.toString(tab));
		sc.close();
	}
}
