package achat.tests;
import achat.metier.*;
import java.util.*;

public class TestCollection {

	public static void main(String args[]) 
	{
		LinkedList<Fournisseur> bdFourn = new LinkedList<>();
		bdFourn.add (new Fournisseur ("sun"));
		bdFourn.add (new Fournisseur ("ibm"));
		bdFourn.add (new FournisseurNonAgree ("Microsoft", 1000));
		bdFourn.add (new FournisseurNonAgree ("Symantec", 2000));
		
		for (int n=0; n<15; n++) {
			for (int i=0; i<bdFourn.size(); i++) {
				Fournisseur rf = (Fournisseur )bdFourn.get(i);
				
				try {
					if(n==0) {
						rf.addAchat(-10);
					}
					rf.addAchat(100);
				}
				catch (AchatException e) {
					System.out.println( "Exception levee :" + e );
				}
			}
		}
		
		System.out.println();
		System.out.println( "Le contenu de la collection :");
		
		for (int i=0; i<bdFourn.size(); i++)
			System.out.println((Fournisseur )bdFourn.get(i));
	}
}
