package eval.question;

import java.util.Scanner;

public class Quest1_age {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 1\n" +
"On veut savoir quand une mère aura le double de l'âge de son fils.\n"+
"Lecture au clavier des 2 âges et présentation du résultat.\n"+
"*******************************************************************\n\n\n"
		);
		int ageMother;
		int ageMotherStart;
		int ageChildren;
		boolean isNotDouble = false;
		
		
		System.out.println("Entrer l'âge de la mère :");
		ageMotherStart = sc.nextInt();
		System.out.println("Entrer l'âge de l'enfant :");
		ageChildren = sc.nextInt();
		ageMother = ageMotherStart;
		
		do {
			isNotDouble = true;
			
			if(ageMother == ageChildren * 2) {
				isNotDouble = false;
			}
			ageChildren++;
			ageMother++;
		} while(isNotDouble);

		String message = ageMotherStart > ageMother ? 
				"Quand elle avait "+(--ageMother)+" ans, la mère a eu le double de l'âge de son enfant qui avait alors "+(--ageChildren)+" ans" 
				: "A l'âge de "+(--ageMother)+" ans, la mère aura le double de l'âge de son enfant qui aura alors "+(--ageChildren)+" ans";
		System.out.println(message);
	}

}
