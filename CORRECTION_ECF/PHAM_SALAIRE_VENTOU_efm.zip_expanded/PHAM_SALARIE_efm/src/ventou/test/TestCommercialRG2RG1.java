package ventou.test;

import ventou.metier.Commercial;
import ventou.metier.SalarieException;

		/////////////////////////////////////////////////////
		// TEST DE LA CLASSE DERIVEE AVEC DEUX REGLES METIERS
		/////////////////////////////////////////////////////
		
public class TestCommercialRG2RG1 {

	public static void main(String[] args) {
		// Créez deux commerciaux prénommés "Despres" et "Deschamps"
		System.out.println("----------------------------------------------------------");
		System.out.println("\nCREATION DE DEUX COMMERCIAUX Despres et Deschamps");
		System.out.println("\tDespres avec un salaire de 780 et objectif de 10000");
		System.out.println("\tDeschamps avec un salaire de 850 et objectif de 20000");
		
		Commercial despres = new Commercial("Despres", 780, 10000);
		Commercial deschamps = new Commercial("Deschamps", 850, 20000);
		System.out.println(despres);
		System.out.println(deschamps);

		System.out.println("\n--------------------------------------------");
		System.out.println("CREATION D'UN COMMERCIAL construit sans paramètre ");
		Commercial c3 = new Commercial();
		System.out.println(c3);

		System.out.println("\n--------------------------------------------");
		System.out.println("AJOUT D'UNE VENTE de 5000 a Despres ");
		despres.nouvelleVente(5000);

		System.out.println(despres);

///////////////////////////////////
///////////////////////////////////
///////////////////////////////////
		System.out.println("\n--------------------------------------------");
		System.out.println("ON AUGMENTE Despres de 200");
		try {
			despres.augmente(200);
				System.err.println("BUG si on affiche ce message");
		} catch (SalarieException se) {
			System.out.println("Exception :" + se);
		}
		System.out.println(despres);

		System.out.println("\n--------------------------------------------");
		System.out.println("AJOUT D'UNE VENTE de 5000 a Despres ");
		despres.nouvelleVente(5000);

		System.out.println(despres);

		System.out.println("\n--------------------------------------------");
		System.out.println("ON AUGMENTE Despres de 200");
		try {
			despres.augmente(200);
		} catch (SalarieException se) {
			System.out.println("Exception :" + se);
		}
		System.out.println(despres);
		

		System.out.println("\n------------------------------");
		System.out.println("On demissionne Deschamps\n ");
		deschamps.demissionne();
		System.out.println(deschamps);

		System.out.println("\n------------------------------");
		System.out.println("On augmente Deschamps de 100\n ");

		try {
			deschamps.augmente(100);
				System.err.println("BUG si on affiche ce message");
		} catch (SalarieException se) {
			System.out.println("Exception :" + se);
		}
		
		System.out.println("\n------------------------------");
		System.out.println("On demissionne Despres\n ");
		despres.demissionne();
		System.out.println(despres);
		
		System.out.println("\n------------------------------");
		System.out.println("On augmente Despres de 100\n ");

		try {
			despres.augmente(100);
				System.err.println("BUG si on affiche ce message");
		} catch (SalarieException se) {
			System.out.println("Exception :" + se);

		}
	}
}