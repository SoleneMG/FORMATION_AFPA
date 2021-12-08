package eval.question;

import java.util.Scanner;

public class Quest4_ControleSaisieNom {

	/**
	 * @param args
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
		Scanner sc = new Scanner(System.in);
		boolean  bon = true;
		char tab[] = {'0', '1', '2', '3', '4', '5', '6','7', '8', '9'};
		String s;
		do {
			if(!bon) {
				System.out.println();
				System.out.println("Attention erreur de saisie ! ! !");
				System.out.println("Nom de famille non valide");
				System.out.println();
				bon = true;
			}
			System.out.print("Saisir le nom de famille : ");
			
			
			s = sc.nextLine();
			
			char[] tabs = s.toCharArray();
			
			for (int i = 0; i < tabs.length; i++) {
				for (int j = 0; j < tab.length; j++) {
					if(tabs[i] == tab[j]) {
						bon = false;
						
					}
				}
			}
			if(s.length() < 2) {
				bon = false;
			}
			if(s.length() > 10) {
				bon = false;
			}
			
			
			
		}while(!bon);	
		sc.close();
		System.out.println();
		System.out.println("Le nom de famille est valide : "+s);
	}

}
