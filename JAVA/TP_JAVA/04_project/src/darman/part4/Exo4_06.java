package darman.part4;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exo4_06 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Les �lections l�gislatives, en Guignolerie Septentrionale, ob�issent � la
	 * r�gle suivante : lorsque l'un des candidats obtient plus de 50% des
	 * suffrages, il est �lu d�s le premier tour. en cas de deuxi�me tour, peuvent
	 * participer uniquement les candidats ayant obtenu au moins 12,5% des voix au
	 * premier tour. Vous devez �crire un algorithme qui permette la saisie des
	 * scores de quatre candidats au premier tour. Cet algorithme traitera ensuite
	 * le candidat num�ro 1 (et uniquement lui) : il dira s'il est �lu, battu, s'il
	 * se trouve en ballottage favorable (il participe au second tour en �tant
	 * arriv� en t�te � l'issue du premier tour) ou d�favorable (il participe au
	 * second tour sans avoir �t� en t�te au premier tour).
	 */

	public static void main(String[] args) {

		/*
		 * int scoreCandidate1 = 20; int scoreCandidate2 = 20; int scoreCandidate3 = 10;
		 * int scoreCandidate4 = 10;
		 */

		int percentageScoreCandidate1;

		System.out.println("Veuillez entrer le score candidat 1 : ");
		int scoreCandidate1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Veuillez entrer le score candidat 2 : ");
		int scoreCandidate2 = sc.nextInt();
		sc.nextLine();

		System.out.println("Veuillez entrer le score candidat 3 : ");
		int scoreCandidate3 = sc.nextInt();
		sc.nextLine();

		System.out.println("Veuillez entrer le score candidat 4 : ");
		int scoreCandidate4 = sc.nextInt();
		sc.nextLine();

		int total = scoreCandidate1 + scoreCandidate2 + scoreCandidate3 + scoreCandidate4;

		percentageScoreCandidate1 = percentage(scoreCandidate1, total);

		if (percentageScoreCandidate1 > 50) {
			System.out
					.println("Le candidat 1 est �lu au premier tour avec " + percentageScoreCandidate1 + "% des voix");
		} else if (percentageScoreCandidate1 < 12.5) {
			System.out
					.println("Avec seulement " + percentageScoreCandidate1 + "% des voix, le candidat 1 n'est pas �lu");
		} else {

			int[] scoreBoard = { percentageScoreCandidate1, percentage(scoreCandidate2, total),
					percentage(scoreCandidate3, total), percentage(scoreCandidate4, total) };

			int max = percentageScoreCandidate1;
			for (int i = 0; i < scoreBoard.length; i++) {
				if (max < scoreBoard[i]) {
					max = -1;
				}
			}

			if (max != -1) {
				System.out.println("Le candidat 1 se retrouve en ballotage favorable.");
			} else {
				System.out.println("Le candidat 1 se retrouve en ballotage d�favorable.");
			}

		}
		sc.close();
	}

	public static int percentage(int score, int total) {
		if (total != 0) {
			return (int) ((double) score / (double) total * 100);
		} else {
			throw new ArithmeticException("fun percentage doesn't work");
		}

	}

}
