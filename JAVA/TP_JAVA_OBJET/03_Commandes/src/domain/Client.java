package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Client {
	private String identifiant, nom, prenom, adresse;
	private LocalDate dateDeNaissance;
	private List<Commande> commandes;
	
	
	
	public Client(String identifiant, String nom, String prenom, String adresse, LocalDate dateDeNaissance) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.dateDeNaissance = dateDeNaissance;
	}
	public double getTotalPrice() {
		double totalHT = 0.0;
		for (Commande commande : commandes) {
			totalHT += commande.getArticle().getPrixUnitaire() * commande.getQuantiteArticle();
		}
		return totalHT;
	}

	// Setter
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void addCommandes(List<Commande> commandes) {
		if(this.commandes == null) {
			this.commandes = new ArrayList<>();
		}
		this.commandes.addAll(commandes);
	}
	public void addCommande(Commande commande) {
		if(this.commandes == null) {
			this.commandes = new ArrayList<>();
		}
		this.commandes.add(commande);
	}
	
	
	// Getter
	public String getAdresse() {
		return adresse;
	}
	public String getPrenom() {
		return prenom;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public String getNom() {
		return nom;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}

}
