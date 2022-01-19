package achat.tests;

import java.util.Arrays;
import java.util.LinkedList;

import achat.metier.AchatException;
import achat.metier.Catalogue;
import achat.metier.Fournisseur;
import achat.metier.FournisseurAgree;
import achat.metier.FournisseurNonAgree;
import achat.metier.Produit;

public class TestCollection2 {

	public static void main(String[] args) {
		Catalogue c = new Catalogue(100, Arrays.asList(new Produit("id3", "produit3", 100)));
		Catalogue c2 = new Catalogue(105,
				Arrays.asList(new Produit("id1", "produit1", 50), new Produit("id2", "produit2", 8_000)));

		LinkedList<Fournisseur> bdFourn = new LinkedList<>();
		bdFourn.add(new FournisseurAgree("sun"));
		bdFourn.add(new FournisseurAgree("ibm"));
		bdFourn.add(new FournisseurNonAgree("Microsoft", 1000));
		bdFourn.add(new FournisseurNonAgree("Symantec", 2000));

		bdFourn.get(0).setCatalogue(c);
		bdFourn.get(1).setCatalogue(c2);
		bdFourn.get(2).setCatalogue(c2);
		bdFourn.get(3).setCatalogue(c);

		for (int n = 0; n < 15; n++) {
			for (int i = 0; i < bdFourn.size(); i++) {
				Fournisseur rf = (Fournisseur) bdFourn.get(i);

				try {
					if (n == 0) {
						rf.addAchat(-10);
					}
					rf.addAchat(100);
				} catch (AchatException e) {
					System.out.println("Exception levee :" + e);
				}
			}
		}

		System.out.println();
		System.out.println("Le contenu de la collection :");

		for (int i = 0; i < bdFourn.size(); i++)

			System.out.println((Fournisseur) bdFourn.get(i));
	}

}
