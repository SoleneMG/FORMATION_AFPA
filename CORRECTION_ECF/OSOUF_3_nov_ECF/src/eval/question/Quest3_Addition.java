package eval.question;

import java.util.Scanner;

public class Quest3_Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("*******************************************************************\n" + "Question 3\n"
				+ "L'utilisateur saisit 5 nombres maximum.\n" + "Chaque nombre saisi est suivi de la touche [Entrée].\n"
				+ "La saisie est terminée quand les 5 nombres sont saisis ou si on entre le nombre zéro.\n"
				+ "Réafficher la liste des nombres saisis sous la forme d'une addition avec la somme de ses nombres.\n"
				+ "( exemple: 8 + 9 + 2 + 1  = 20 )\n"
				+ "*******************************************************************\n\n\n");
		Scanner sc = new Scanner(System.in);
		int[] tab = new int[5];
		

		int a = 0;
		int i;
		int somme = 0 ;
		System.out.println("Saisir 5 nombres entiers ou moins en arrêtant la saisie avec 0 : ");
		for (i = 0; i < tab.length; i++) {
			System.out.print("\t Nombre " + (i + 1) + " : ");
			a = sc.nextInt();
			if (a == 0) {
				
				break;
			} else {
				tab[i] = a;
			}
		}
		sc.close();
		
		for (int j = 0; j < tab.length; j++) {
			somme = somme + tab[j];	
		}
		
		
		for (int j = 0; j < tab.length; j++) {
			if(tab[j] == 0) {
				break;
			}
				if(j == 0) {
					System.out.print("\t"+tab[j]);
				}else if(j != 0) {
					System.out.print(" + "+tab[j]);
				}
				
			}
		System.out.println(" = "+somme);
		}
		
		

		
	

}

