package bookstore.test;

import java.util.ArrayList;
import java.util.List;

import bookstore.metier.BiblioException;
import bookstore.metier.Livre;
import bookstore.metier.Status;
import bookstore.metier.Utilisateur;
import bookstore.metier.Personne;

public class TestUtilisateur {

	public static void main(String[] args) {
		List<Livre> livres = new ArrayList<>();
		Livre asterix = new Livre("asterix");
		Livre tintin =new Livre("tintin");
		livres.add(asterix);
		livres.add(tintin);
		
		List<Livre> empruntU1 = new ArrayList<Livre>();
		empruntU1.add(asterix);
		List<Livre> empruntU2 = new ArrayList<Livre>();
		empruntU1.add(tintin);
		
		Utilisateur u1 = new Utilisateur("toto");
		Utilisateur u2 = new Utilisateur("zorro");
		
		emprunter(empruntU1, u1, "12/12/2021");
		emprunter(empruntU2, u2, "01/12/2021");
		System.out.println("Rendu en retard ? "+rendre(u1, "14/12/2021"));
		System.out.println("Rendu en retard ? "+rendre(u2, "16/12/2021"));
		
	}
	
	public static void emprunter(List<Livre> livres, Utilisateur utilisateur, String dateEmprunt) {
		livres.stream()		
		.forEach(livre -> {
			try {
				utilisateur.addLivre(livre);
				livre.setEmprunteur(utilisateur);
				livre.setDisponible(Status.PRETE);
			} catch (BiblioException e) {
				e.printStackTrace();
			}
		});
		utilisateur.setDateEmprunt(dateEmprunt);

	}
	
	public static boolean rendre(Utilisateur utilisateur, String dateRendu) {
		utilisateur.getEmprunts().stream().forEach(livre -> {
			livre.setDisponible(Status.DISPONIBLE);
			livre.setEmprunteur(null);
		});
		utilisateur.clearLivres();
		boolean isPretEnRetard = utilisateur.isPretEnRetard(dateRendu);		
		return isPretEnRetard;
	}

}
