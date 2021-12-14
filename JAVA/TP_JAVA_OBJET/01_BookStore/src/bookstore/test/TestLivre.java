package bookstore.test;
import java.util.ArrayList;
import java.util.List;

import bookstore.metier.Comptable;
import bookstore.metier.Livre;

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
		System.out.println("Nombres totales de pages : "+nbTotalPages);
		//System.out.println(livres.get(0).toString());
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
		System.out.println("Total prix des livres : "+livres.get(0).getTotalPrix());
		livres.get(3).setPrix(12.50);
		System.out.println("Total prix des livres : "+livres.get(0).getTotalPrix());
		
		
		
//		System.out.println(livres.get(0).hashCode());
//		System.out.println(livres.get(1).hashCode());
//		System.out.println(livres.get(2).hashCode());
		
		}
	
	public static String auteurPlusGrosLivre(Livre livre1, Livre livre2) {
		int result = livre1.compare(livre2);
		if(result==0) {
			return "Les deux livres ont le même nombres de pages";
		} else if(result>1) {
			return livre1.getAuteur();
		} else {
			return livre2.getAuteur();
		}
	}

}
