package bookstore.metier;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur extends Personne {
	private int iDutilisateur;
	private List<Livre> emprunts = new ArrayList<Livre>();
	private LocalDate dateEmprunt;
	private static int DUREE_MAX_PRET = 15;
	private static int NB_MAX_PRETS = 3;
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

//Constructeur
	public Utilisateur(String nom) {
		super(nom);
	}

	public boolean isPretEnRetard(String dateRetour) {
		int day = Period.between(dateEmprunt, LocalDate.parse(dateRetour, dtf)).getDays();
		return day >= DUREE_MAX_PRET ? true : false;
	}

//Getters
	public int getiDutilisateur() {
		return iDutilisateur;
	}
public List<Livre> getEmprunts(){
	return emprunts;
}
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public static int getDureeMaxPret() {
		return DUREE_MAX_PRET;
	}

//Setters
	public void setiDutilisateur(int iDutilisateur) {
		this.iDutilisateur = iDutilisateur;
	}

	public void setDateEmprunt(String dateEmprunt) {
		this.dateEmprunt = LocalDate.parse(dateEmprunt, dtf);
	}

	public void addLivre(Livre livre) throws BiblioException {
		if (emprunts.size() < NB_MAX_PRETS) {
			this.emprunts.add(livre);
			livre.setDisponible(Status.PRETE);
		} else {
			throw new BiblioException("Nombre max de livres empruntés atteints");
		}
	}
	
	public void clearLivres() {
		for (Livre livre : emprunts) {
			livre.setDisponible(Status.DISPONIBLE);
		}
		emprunts.clear();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String listeDesEmprunts = "pas de livres empruntés";
		if(!emprunts.isEmpty()) {
			for (Livre livre : emprunts) {
				sb.append(livre.getTitre()+" ");
			};
		}
		return " Liste des emprunts de : "
				+super.getNom() + super.getPrenom()
				+ listeDesEmprunts
				;
	}
	
	

}
