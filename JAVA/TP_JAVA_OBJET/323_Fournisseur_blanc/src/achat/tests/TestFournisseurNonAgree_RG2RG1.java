package achat.tests;

import achat.metier.AchatException;
import achat.metier.FournisseurNonAgree;

public class TestFournisseurNonAgree_RG2RG1 {

	public static void main(String[] args) {
		FournisseurNonAgree fna1;
		fna1 = new FournisseurNonAgree( "F1" , 10000 );

		/////////////////////////////////////////
		//Test de toString
		System.out.println( fna1 );
		
		/////////////////////////////////////////
		//Test de la règle de gestion RG2: on ne dépasse pas le plafond des achats
		try {
			System.out.println( " On réalise un achat de 5000");
			fna1.addAchat( 5000 );
			System.out.println( fna1 );
			System.out.println( " On réalise un achat de 5000");
			fna1.addAchat( 5000 );
			System.out.println( fna1 );

			System.out.println( " On réalise un achat de 1 ");
			fna1.addAchat( 1 );

			System.err.println( "Bug si je passe ici !" );
		}
		catch ( AchatException ae)
		{
			System.out.println( "Exception levee:  " + ae );
		}

		//////////////////////////////////////////////////////
		/////////////////////////////////////////
		//Test de la règle de gestion RG1: pas d'achat négatif
		System.out.println();
		System.out.println( " On teste pour voir si le filtre du paramètre"
				+ " est toujours actif");
		try {
			fna1.addAchat( -1.0f );
		
			System.err.println( "BUG si je passe  ici !" );
		}
		catch ( AchatException ae)
		{
			System.out.println( "Exception levee: " + ae );
		}

		System.out.println();
		System.out.println( "Fin des tests");
	}

}
