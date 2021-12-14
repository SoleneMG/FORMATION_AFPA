package bookstore.metier;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Utilisateur {
	private String nom, prenom;
	private int iDutilisateur;
	private Livre livre;
	private LocalDate dateEmprunt;
	private static int dureeMaxPret = 15;
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	public Utilisateur(String nom) {
		this.nom = nom;
	}
	
	public boolean isPretEnRetard(String dateRetour) {
		int day = Period.between(dateEmprunt, LocalDate.parse(dateRetour, dtf)).getDays();
		return day>=dureeMaxPret ? true : false;
	}
	
	
	
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getiDutilisateur() {
		return iDutilisateur;
	}
	public void setiDutilisateur(int iDutilisateur) {
		this.iDutilisateur = iDutilisateur;
	}
	public Livre getLivre() {
		return livre;
	}
	public void setLivre(Livre livre) {
		this.livre = livre;
	}
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(String dateEmprunt) {
		this.dateEmprunt = LocalDate.parse(dateEmprunt, dtf);
	}
	public static int getDureeMaxPret() {
		return dureeMaxPret;
	}
	

}
