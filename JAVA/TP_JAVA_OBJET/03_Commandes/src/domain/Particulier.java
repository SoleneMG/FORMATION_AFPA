package domain;

import java.time.LocalDate;

public class Particulier extends Client {

	public Particulier(String identifiant, String nom, String prenom, String adresse, LocalDate dateDeNaissance) {
		super(identifiant, nom, prenom, adresse, dateDeNaissance);
	}

}
