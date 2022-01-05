package achat.tests;

import achat.metier.AchatException;
import achat.metier.Fournisseur;

public class TestFournisseurRG1 {

	public static void main(String[] args) {
		Fournisseur f1,f2;
		
		f1 = new Fournisseur( "F1" );
		
		/////////////////////////////////////////////////
		// Test de toString
		System.out.println( " fournisseur f1: " + f1 );
		
		
		/////////////////////////////////////////////////
		// Test de equals
		System.out.println();
		f2 = new Fournisseur( "F1" );
		System.out.println( " fournisseur f2: " + f2 );
		
		if( f2.equals( f1 ) )
			System.out.println( "Fournisseurs identiques" );
		else
			System.err.println( "Fournisseurs différents" );
		
		/////////////////////////////////////////////////
		// Test de clone
		System.out.println();

		f2 = (Fournisseur )f1.clone();
		System.out.println( "fournisseur f1 :" + f1 );
		System.out.println( "     Son clone :" + f2 );
		
		
		if( f1 == f2)//Attention: Le clone et l'objet original ne font qu'un
			System.err.println("Ce n'est pas un vrai clone!");
		else {
			if( f1.equals(f2))
				System.out.println("Le clone est égal à l'original");
			else
				System.err.println("Le clone n'est pas égal à l'original");
		}

		/////////////////////////////////////////
		//Test du constructeur sans paramètre
		System.out.println();
		f1 = new Fournisseur();
		System.out.println( "Constructeur sans paramètre: " + f1 );
		
		/////////////////////////////////////////
		//Test du constructeur imposant no d'agrément
		System.out.println();
		f1 = new Fournisseur( "F1" , 77 );
		System.out.println( "Constructeur imposant noagr: " + f1 );
		
		/////////////////////////////////////////
		/////////////////////////////////////////
		/////////////////////////////////////////
		/////////////////////////////////////////
		/////////////////////////////////////////
		/////////////////////////////////////////
		//Test de la règle de gestion RG1: pas d'achat négatif
		System.out.println();
		try {
			System.out.println( " Achat de 4000" );
			f1.addAchat( 4000 );
			System.out.println( f1 );

			
			System.out.println( " Achat de 5000");
			f1.addAchat( 5000 );
			System.out.println( f1 );


			System.out.println( " Achat de -1 " );
			f1.addAchat(-1.0f);
			
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
