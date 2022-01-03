package bookstore.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import bookstore.metier.BiblioException;
import bookstore.metier.Livre;
import bookstore.metier.Status;
import bookstore.metier.Utilisateur;

public class TestUtilisateur {

	public static void main(String[] args) {
		List<Livre> livres = new ArrayList<>();
		Livre asterix = new Livre("asterix");
		Livre tintin = new Livre("tintin");
		livres.add(asterix);
		livres.add(tintin);

		List<Livre> empruntU1 = new ArrayList<Livre>();
		empruntU1.add(asterix);
		List<Livre> empruntU2 = new ArrayList<Livre>();
		empruntU1.add(tintin);

		Utilisateur u1 = new Utilisateur("toto");
		Utilisateur u2 = new Utilisateur("zorro");

		emprunter(empruntU1, u1, LocalDate.of(2021, Month.DECEMBER, 12));
		emprunter(empruntU2, u2, LocalDate.of(2021, Month.DECEMBER, 01));
//		System.out.println("Rendu en retard ? "+rendre(u1, "14/12/2021"));
//		System.out.println("Rendu en retard ? "+rendre(u2, "16/12/2021"));
		rendre(u1);
		rendre(u2);
	}

	public static void emprunter(List<Livre> livres, Utilisateur utilisateur, LocalDate dateEmprunt) {
		livres.stream().forEach(livre -> {
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
// ancienne version de la méthode rendre

//	public static boolean rendre(Utilisateur utilisateur, String dateRendu) {
//		utilisateur.getEmprunts().stream().forEach(livre -> {
//			livre.setDisponible(Status.DISPONIBLE);
//			livre.setEmprunteur(null);
//		});
//		utilisateur.clearLivres();
//		boolean isPretEnRetard = utilisateur.isPretEnRetard(dateRendu);		
//		return isPretEnRetard;
//	}
	public static void rendre(Utilisateur utilisateur) {
		utilisateur.getEmprunts().stream().forEach(livre -> {
			livre.setDisponible(Status.DISPONIBLE);
			livre.setEmprunteur(null);
		});

	}

}
