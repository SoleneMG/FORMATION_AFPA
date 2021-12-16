package bookstore.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import bookstore.metier.Livre;
import bookstore.metier.TypeDonneesAnnee;

public class TestLivre {

	public static void main(String[] args) {

		List<Livre> livres = new ArrayList<>();
		livres.add(new Livre());
		livres.add(new Livre("titre3", "auteur2"));
		livres.stream().forEach(livre -> livre.setNbPages(50));
		livres.add(new Livre("titre1", "auteur1", 10, 0));
		livres.add(new Livre("titre2", "auteur2", 200, 30.99));
		livres.stream().map(Livre::getAuteur).forEach(System.out::println);

		Integer nbTotalPages = livres.stream().map(livre -> livre.getNbPages()).reduce(0, Integer::sum);
		System.out.println("Nombres totales de pages : " + nbTotalPages);
		// System.out.println(livres.get(0).toString());
		livres.stream().forEach(System.out::println);

		System.out.println("L'auteur du plus gros livre est ");
		System.out.println(auteurPlusGrosLivre(livres.get(0), livres.get(3)));

//		Comptable comptable = new Comptable();
//		comptable.comptabilise(livres.get(0));
//		comptable.comptabilise(livres.get(1));
//		comptable.comptabilise(livres.get(2));
//		
//		System.out.println("comptable 1 : "+comptable.getTotalPrix());
//		
//		Comptable comptable2 = new Comptable();
//		comptable2.comptabilise(livres.get(3));
//		comptable2.comptabilise(livres.get(1));
//		comptable2.comptabilise(livres.get(2));
//		
//		System.out.println("comptable 2 : "+comptable2.getTotalPrix());
		System.out.println("Total prix des livres : " + livres.get(0).getTotalPrix());
		livres.get(3).setPrix(12.50);
		System.out.println("Total prix des livres : " + livres.get(0).getTotalPrix());

//		System.out.println(livres.get(0).hashCode());
//		System.out.println(livres.get(1).hashCode());
//		System.out.println(livres.get(2).hashCode());

		System.out.println("--------------------------------");
		System.out.println("              SORT              ");

		Livre[] tabLivres = new Livre[5];
		Livre ghibli = new Livre("Ghibli", "Ynnis Edition", 136, 14.95);
		Livre adele = new Livre("Mortelle Adèle", "Miss Prickly", 93, 10.95);
		Livre schtroumpfs = new Livre("Les Schtroumpfs", "Culliford Thierry", 48, 10.95);
		Livre pereNoel = new Livre("Le secret du père noel", "Hibou Grincheux", 50, 8.99);
		Livre licornes = new Livre("La valée des licornes", "Hibou Grincheux", 50, 8.99);
		tabLivres[0] = ghibli;
		tabLivres[1] = adele;
		tabLivres[2] = schtroumpfs;
		tabLivres[3] = pereNoel;
		tabLivres[4] = licornes;

		Arrays.sort(tabLivres);
		System.out.println("\n-----------------------------\nTri par ordre croissant du nombres de pages :"+Arrays.toString(tabLivres));
		Arrays.sort(tabLivres, new Comparator<Livre>() {
			@Override
			public int compare(Livre livre1, Livre livre2) {
				if (livre1.getPrix() < livre2.getPrix()) {
					return -1;
				} else if(livre1.getPrix() == livre2.getPrix() ) {
					return 0;
				} else {
					return 1;
				}
				
			}
		});

		System.out.println("\n-----------------------------\nTri par ordre croissant de prix :"+Arrays.toString(tabLivres));
		
		System.out.println("\\n-----------------------------\\nDatatype");
		livres.get(0).setAnneeParution(new TypeDonneesAnnee( 1989 ));
		try {
			livres.get(1).setAnneeParution(new TypeDonneesAnnee( 19890 ));
		} catch (IllegalArgumentException e) {
		}
		livres.stream().map(livre -> livre.getAnneeParution()).forEach(System.out::println);
	}

	public static String auteurPlusGrosLivre(Livre livre1, Livre livre2) {
		int result = livre1.compare(livre2);
		if (result == 0) {
			return "Les deux livres ont le même nombres de pages";
		} else if (result > 1) {
			return livre1.getAuteur();
		} else {
			return livre2.getAuteur();
		}
	}

}
