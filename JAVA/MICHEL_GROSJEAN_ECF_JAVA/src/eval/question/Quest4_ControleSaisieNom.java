package eval.question;

import java.util.Scanner;

public class Quest4_ControleSaisieNom {
	
	static Scanner sc = new Scanner(System.in);
	/**
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 4\n" +
"On demande la saisie d’un nom de famille.\n"+
"La saisie sera redemandée tant que :\n"+
"	le nom contiendra un caractère numérique ,\n"+
"	La longueur sera inférieure à 2,\n"+
"	La longueur sera supérieure à 10 .\n"+
"*******************************************************************\n\n\n"
		);

		boolean recommencer = true;
		String name;

		do {
			recommencer = false;
			System.out.println("Saisissez votre nom de famille : ");
			name = sc.nextLine();
			if (name.length() < 2 || name.length() > 10) {
				recommencer = true;
			}
//			for (int i = 0; i < name.length(); i++) {
//				if (Character.isDigit(name.charAt(i))) {
//					recommencer = true;
//				}
//			}
			
			  if(name.matches(".*[0-9].*")) { 
				  recommencer = true;
			  }
			 
		} while (recommencer);
		System.out.println("OK c'est valide !");
		sc.close();

	}
}
