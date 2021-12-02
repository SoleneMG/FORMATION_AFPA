package eval.question;

import java.util.Arrays;
import java.util.Iterator;

public class Quest7_De {

	private static final int NB_DE_LANCE_DE_DES = 15;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 7\n" +
"Lancer un dé ( valeur aléatoire de 1 à 6 ) 15 fois.\n" + 
"Afficher les sorties et  afficher le nombre de sorties du\n" +
"chiffre 1, de 2, de 3, de 4, de 5 et de 6\n" +
"*******************************************************************\n\n\n"
		);
		int nb, un = 0, deux = 0, trois = 0, quatre = 0, cinq = 0, six = 0;
		int[] tab = new int[NB_DE_LANCE_DE_DES];
		for (int i = 0; i < NB_DE_LANCE_DE_DES; i++) {
			nb = (int) ((Math.random() * 6) + 1);
			tab[i] = nb;

			switch (tab[i]) {
			case 1:
				un++;
				break;
			case 2:
				deux++;
				break;
			case 3:
				trois++;
				break;
			case 4:
				quatre++;
				break;
			case 5:
				cinq++;
				break;
			case 6:
				six++;
				break;

			default:
				break;
			}
		}

		System.out.println(Arrays.toString(tab) + "\n");

		System.out.println("Le chiffre 1 a été tiré " + un + " fois");
		System.out.println("Le chiffre 2 a été tiré " + deux + " fois");
		System.out.println("Le chiffre 3 a été tiré " + trois + " fois");
		System.out.println("Le chiffre 4 a été tiré " + quatre + " fois");
		System.out.println("Le chiffre 5 a été tiré " + cinq + " fois");
		System.out.println("Le chiffre 6 a été tiré " + six + " fois");
	}
}

