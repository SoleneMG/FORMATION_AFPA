package bookstore.test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import bookstore.metier.Livre;
import bookstore.metier.Utilisateur;

public class TestUtilisateur {

	public static void main(String[] args) {
		List<Livre> livres = new ArrayList<>();
		Livre asterix = new Livre("asterix");
		Livre tintin =new Livre("tintin");
		livres.add(asterix);
		livres.add(tintin);
		
		Utilisateur u1 = new Utilisateur("toto");
		Utilisateur u2 = new Utilisateur("zorro");
		
		emprunter(asterix, u1, "12/12/2021");
		emprunter(tintin, u2, "01/12/2021");
		System.out.println("Rendu en retard ? "+rendre(u1, "14/12/2021"));
		System.out.println("Rendu en retard ? "+rendre(u2, "16/12/2021"));
		
	}
	
	public static void emprunter(Livre livre, Utilisateur utilisateur, String dateEmprunt) {
		utilisateur.setLivre(livre);
		utilisateur.setDateEmprunt(dateEmprunt);
		livre.setDisponible(false);
	}
	
	public static boolean rendre(Utilisateur utilisateur, String dateRendu) {
		utilisateur.getLivre().setDisponible(true);
		boolean isPretEnRetard = utilisateur.isPretEnRetard(dateRendu);
		utilisateur.setLivre(null);
		return isPretEnRetard;
	}

}
