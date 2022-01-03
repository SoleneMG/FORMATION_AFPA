package domain;

public class Article {
	private String identifiant;
	private String libelle;
	private double prixUnitaire;
	
	// Constructeurs
	public Article(double prixUnitaire) {
		super();
		this.prixUnitaire = prixUnitaire;
	}

	public Article(String identifiant, String libelle, double prixUnitaire) {
		super();
		this.identifiant = identifiant;
		this.libelle = libelle;
		this.prixUnitaire = prixUnitaire;
	}
	
	
	// Setters
	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	// Getters
	public String getLibelle() {
		return libelle;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public double getPrixUnitaire() {
		return prixUnitaire;
	}


}
