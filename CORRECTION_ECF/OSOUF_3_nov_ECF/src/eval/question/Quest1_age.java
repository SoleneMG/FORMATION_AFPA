package eval.question;

import java.util.Scanner;

public class Quest1_age {

	public static void main(String[] args) {
		System.out.println("*******************************************************************\n" + "Question 1\n"
				+ "On veut savoir quand une mère aura le double de l'âge de son fils.\n"
				+ "Lecture au clavier des 2 âges et présentation du résultat.\n"
				+ "*******************************************************************\n\n\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisir l'age de la maman : ");
		int ageM = sc.nextInt();
		System.out.print("Saisir l'age du fils : ");
		int ageF = sc.nextInt();

		for (int i = 0; i < 1000; i++) {
			ageM = ageM + 1;
			ageF = ageF + 1;
			if (ageM == ageF * 2) {
				break;

			}
			
		}
		System.out.println("La mère aura le double de l'age de son fils à : " + ageM + " ans.");
		System.out.println("l' age du fils la même année est : "+ageF+" ans");
		sc.close();

	}
}