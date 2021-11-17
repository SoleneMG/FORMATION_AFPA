package darman.part4;

public class Exo4_07 {

	/**
	 * Une compagnie d'assurance automobile propose à ses clients quatre familles de
	 * tarifs identifiables par une couleur, du moins au plus onéreux : tarifs bleu,
	 * vert, orange et rouge. Le tarif dépend de la situation du conducteur : 
	 * - un conducteur de moins de 25 ans et titulaire du permis depuis moins de deux
	 * ans, se voit attribuer le tarif rouge, si toutefois il n'a jamais été
	 * responsable d'accident. Sinon, la compagnie refuse de l'assurer. 
	 * - un conducteur de moins de 25 ans et titulaire du permis depuis plus de deux ans,
	 * ou de plus de 25 ans mais titulaire du permis depuis moins de deux ans a le
	 * droit au tarif orange s'il n'a jamais provoqué d'accident, au tarif rouge
	 * pour un accident, sinon il est refusé. 
	 * - un conducteur de plus de 25 ans titulaire du permis depuis plus de deux ans bénéficie du tarif vert s'il
	 * n'est à l'origine d'aucun accident et du tarif orange pour un accident, du
	 * tarif rouge pour deux accidents, et refusé au-delà
	 * 
	 * De plus, pour encourager la fidélité des clients acceptés, la compagnie
	 * propose un contrat de la couleur immédiatement la plus avantageuse s'il est
	 * entré dans la maison depuis plus de cinq ans. Ainsi, s'il satisfait à cette
	 * exigence, un client normalement "vert" devient "bleu", un client normalement
	 * "orange" devient "vert", et le "rouge" devient orange. Ecrire l'algorithme
	 * permettant de saisir les données nécessaires (sans contrôle de saisie) et de
	 * traiter ce problème. Avant de se lancer à corps perdu dans cet exercice, on
	 * pourra réfléchir un peu et s'apercevoir qu'il est plus simple qu'il n'en a
	 * l'air (cela s'appelle faire une analyse !)
	 */
	public static void main(String[] args) {

		int age = 25;
		int numberYearFromLicenceDriver = 2;
		int numberOfCrash = 2;
		int yearOfFidelity = 5;
		String color = null;
		String[] colorBoard = { "BLUE", "GREEN", "ORANGE", "RED" };
		boolean isAdmissible = true;
		
		if (numberOfCrash > 2) {
			isAdmissible = false;
		}
		////////////////////////////////////////////
		// Cas du conducteur de - 25 ans
		if (age < 25) {

			if (numberYearFromLicenceDriver < 2) {
				if (numberOfCrash == 0) {
					color = "RED";
				} else {
					isAdmissible = false;
				}

			} else if (numberYearFromLicenceDriver >= 2) {
				if (numberOfCrash == 0) {
					color = "ORANGE";
				} else if (numberOfCrash == 1) {
					color = "RED";
				} else {
					isAdmissible = false;
				}

			} else {
				System.out.println("saisie incorrecte du nombre d'année depuis la titularisation du permis");
				throw new NumberFormatException();
			}

			////////////////////////////////////////////
			// Cas du conducteur de + 25 ans
		} else if (age >= 25) {

			if (numberYearFromLicenceDriver < 2) {
				if (numberOfCrash == 0) {
					color = "ORANGE";
				} else if (numberOfCrash == 1) {
					color = "RED";
				} else {
					isAdmissible = false;
				}

			} else if (numberYearFromLicenceDriver >= 2) {
				if (numberOfCrash == 0) {
					color = "GREEN";
				} else if (numberOfCrash == 1) {
					color = "ORANGE";
				} else if (numberOfCrash == 2) {
					color = "RED";
				} else {
					isAdmissible = false;
				}

			} else {
				System.out.println("saisie incorrecte du nombre d'année depuis la titularisation du permis");
				throw new NumberFormatException();
			}

		} else {
			System.out.println("saisie de l'âge incorrecte");
			throw new NumberFormatException();
		}

		if (isAdmissible && color != null) {
			if (yearOfFidelity >=5) {
				for (int i =0; i<colorBoard.length; i++) {
					if(color.equals(colorBoard[i])) {
						color = colorBoard[--i];
						continue;
					}
				}
			}
				System.out.printf(
						"Vos informations : \n%d ans \n%d nombre(s) d'année(s) depuis la titularisation du permis \n%d nombre(s) d'accident(s) \nAvec les informations suivantes vous êtes éligible au contrat %s",
						age, numberYearFromLicenceDriver, numberOfCrash, color);
		} else if (isAdmissible == false) {
			System.out.println("Malheureusement vous n'êtes éligible à aucun contrat (REFUS)");
		} else {
			throw new IllegalArgumentException();
		}

	}

}
