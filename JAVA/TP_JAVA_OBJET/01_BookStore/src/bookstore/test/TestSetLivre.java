package bookstore.test;

import java.util.HashSet;

import bookstore.metier.Livre;
import bookstore.metier.TypeDonneesAnnee;

public class TestSetLivre {
	public static void main(String[] args) {
		HashSet<Livre> livres = initialiseUneBibliotheque();
		livres.stream().map(livre -> livre.hashCode()).forEach(System.out::println);
		
	}
	
	public static HashSet<Livre> initialiseUneBibliotheque() {
		HashSet<Livre> livres = new HashSet<>();
		Livre ghibli = new Livre("Ghibli", "Ynnis Edition", 136, 14.95);
		Livre adele = new Livre("Mortelle Adèle", "Miss Prickly", 93, 10.95);
		Livre schtroumpfs = new Livre("Les Schtroumpfs", "Culliford Thierry", 48, 10.95);
		Livre pereNoel = new Livre("Le secret du père noel", "Hibou Grincheux", 50, 8.99);
		Livre licornes = new Livre("La valée des licornes", "Hibou Grincheux", 50, 8.99);
		livres.add(ghibli);
		livres.add(adele);
		livres.add(schtroumpfs);
		livres.add(pereNoel);
		livres.add(licornes);
	
		ghibli.setAnneeParution(new TypeDonneesAnnee(1989));
		adele.setAnneeParution(new TypeDonneesAnnee(2000));
		schtroumpfs.setAnneeParution(new TypeDonneesAnnee(1989));
		pereNoel.setAnneeParution(new TypeDonneesAnnee(2000));
		
		return livres;	
	}
	
	public static void testAnnee() {
		HashSet<TypeDonneesAnnee> annees = new HashSet<>();
		TypeDonneesAnnee annee1 = new TypeDonneesAnnee(1989);
		TypeDonneesAnnee annee2 = new TypeDonneesAnnee(2000);
		TypeDonneesAnnee annee3 = new TypeDonneesAnnee(2000);
		TypeDonneesAnnee annee4 = new TypeDonneesAnnee(1989);
		annees.add(annee1);
		annees.add(annee2);
		annees.add(annee3);
		annees.add(annee4);
		
		annees.stream().map(annee -> annee.hashCode()).forEach(System.out::println);
	}
}
