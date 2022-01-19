package ventou.test;

import ventou.metier.Commercial;
import ventou.metier.SalarieException;

		/////////////////////////////////////////////////////
		// TEST DE LA CLASSE DERIVEE AVEC DEUX REGLES METIERS
		/////////////////////////////////////////////////////
		
public class TestCommercial {

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

	}
}