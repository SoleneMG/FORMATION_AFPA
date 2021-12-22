package bookstore.metier;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Personne {
	private String nom, prenom;
	
	
	public Personne(String nom) {
		this.nom = nom;
	}
	

	
	
	
	
	
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
