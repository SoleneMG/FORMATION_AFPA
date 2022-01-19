package achat.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import achat.metier.AchatException;
import achat.metier.Fournisseur;

public class TestCollectionTri {
	public static void main(String[] args) {
		
		/*les fournisseurs triés  par la valeur du  « montant total des achats »
		  (ordre de tri ascendant (croissant))*/
		
		Fournisseur f1 = new Fournisseur("F1");
		Fournisseur f2 = new Fournisseur("F2");
		Fournisseur f3 = new Fournisseur("F3");
		Fournisseur f4 = new Fournisseur("F4");
		
		@SuppressWarnings("serial")
		List<Fournisseur> fournisseurs = new ArrayList<>() {{
			add(f1);
			add(f2);
			add(f3);
			add(f4);
		}};
		
		try {
			f1.setTotalAchat(10);
			f2.setTotalAchat(50);
			f3.setTotalAchat(40);
			f4.setTotalAchat(-40);
		} catch (AchatException e) {
			e.printStackTrace();
		}
		
		fournisseurs.sort(null);
		System.out.println("Tri croissant : "+fournisseurs);
		fournisseurs.sort(new Comparator<Fournisseur>() {
			@Override
			public int compare(Fournisseur o1, Fournisseur o2) {
				if (o1.getTotalAchat() < o2.getTotalAchat()) {
					return 1;
				} else if (o1.getTotalAchat() > o2.getTotalAchat()) {
					return -1;
				} else if (o1.getTotalAchat() == o2.getTotalAchat()) {
					return 0;
				} else {
					System.err.println("BUG dans le compareTo de la classe " + this.getClass().getName());
					return -10; // Ne doit pas passer par là 
				}
			}
		});
		System.out.println("Tri décroissant : "+fournisseurs);
	}
	
	

}
