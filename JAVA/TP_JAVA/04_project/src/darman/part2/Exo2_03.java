package darman.part2;

import java.util.Scanner;

public class Exo2_03 {
	public static Scanner sc = new Scanner(System.in);
	
	/**
		Ecrire un programme qui demande son prénom à l'utilisateur, et qui lui réponde par un charmant « Bonjour » suivi du prénom. 
		On aura ainsi le dialogue suivant :
		machine : Quel est votre prénom ?
		utilisateur : Marie-Cunégonde
		machine : Bonjour, Marie Cunégonde !
	 * 
	 */
	
public static void main(String[] args) {
	
		System.out.println("Quel est votre prénom ?");
		String firstName = sc.nextLine();
		System.out.println("Bonjour, "+firstName+" !");
	
		
	}

}
