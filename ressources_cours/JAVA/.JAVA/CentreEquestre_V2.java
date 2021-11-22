package equestre.console;

import fr.afpa.outils.*;

/**
 * Objectif: Exercice de maintenance logicielle<p>
 *
 * Gestion d'un centre equestre (Version 2)
 *
 * @author AFPA
 * @version 1.0
 */ 


class CentreEquestre_V2 
{
	
	public static void main (String arg [])
	{
		String nom, prenom, adresse;
		String cheval1, cheval2, cheval3;
		String noFNTE;
		char rep;
																		// SAISIE
		do {
			System.out.print("Nom du cavalier     : "); 
			nom = Console.in.readLine();
			System.out.print("Prenom du cavalier  : ");
			prenom = Console.in.readLine();
			System.out.print("Adresse du cavalier : ");
			adresse = Console.in.readLine();
			System.out.print("Chevaux preferes    : ");
			cheval1 = Console.in.readLine();
			System.out.print("                    : ");
			cheval2 = Console.in.readLine();
			System.out.print("                    : ");
			cheval3 = Console.in.readLine();
			System.out.print("No carte FNTE       : ");
			noFNTE = Console.in.readLine();
																		// PRESENTATION
			System.out.println ("\n\nCavalier no " + noFNTE);
			System.out.println ("\t" + prenom + " " + nom);
			System.out.println ("\t" + adresse);
			System.out.println ("\t" + "Chevaux : " + cheval1 + " " + cheval2 + " " + cheval3);
																	   // MESSAGE DE FIN
			do {
				System.out.print ("\n\nVoulez-vous continuer (tapez o ou n) : ");
				rep = Console.in.readChar();
			} while (rep != 'o' && rep != 'n');
		} while (rep == 'o');
	}
}