package eval.question;

import java.util.Scanner;

public class Quest3_Addition {
	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 3\n" +
"L'utilisateur saisit 5 nombres maximum.\n"+
"Chaque nombre saisi est suivi de la touche [Entrée].\n"+
"La saisie est terminée quand les 5 nombres sont saisis ou si on entre le nombre zéro.\n"+
"Réafficher la liste des nombres saisis sous la forme d'une addition avec la somme de ses nombres.\n"+ 
"( exemple: 8 + 9 + 2 + 1  = 20 )\n"+
"*******************************************************************\n\n\n"
		);
		int i =0, somme=0, nb;
		int[] tab = new int[5];
		
		do {
			System.out.println("Entrer un nombre :");
			nb = sc.nextInt();
			tab[i] = nb;
			sc.nextLine();
			i++;
		} while(i < 5 && nb != 0 || nb != 0);
		
		
		for (int j = 0; j < tab.length; j++) {
			//String affichage;
			somme += tab[j];
			if(tab[j]!=0) {
				System.out.print(tab[j]);
			}
			
			if(j == tab.length-1) {
				System.out.print(" = ");
			} else if (tab[j+1]!=0 && j != tab.length-1) {
				System.out.print(" + ");
			}
			
			/* Utilisation de l'operateur ternaire pour gérer l'affichage
			 * if(tab[j]!=0) { affichage = j == tab.length-1 ? ""+tab[j]+" = " :
			 * ""+tab[j]+" + "; System.out.print(affichage); } else { affichage =
			 * " = "+somme; }
			 */
		}
		System.out.print(somme);
		sc.close();
	}

}
