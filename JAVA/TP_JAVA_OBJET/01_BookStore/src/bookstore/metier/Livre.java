package bookstore.metier;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Objects;

public class Livre implements Comparable<Livre> {
	private String titre, auteur;
	private int nbPages;
	private double prix = -1;
	// private boolean prixFixe=false;
	private static Comptable comptable = Comptable.getInstance();
	//private boolean disponible;
	private LocalDateTime dateAchat;
	private SimpleDateFormat sdf;
	private Status status = Status.DISPONIBLE;
	private TypeDonneesAnnee anneeParution;

	public TypeDonneesAnnee getAnneeParution() {
		return anneeParution;
	}

	public void setAnneeParution(TypeDonneesAnnee anneeParution) {
		this.anneeParution = anneeParution;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Status isDisponible() {
		return status;
	}

	public void setDisponible(Status disponibilite) {
		this.status = disponibilite;
	}

	public LocalDateTime getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(LocalDateTime dateAchat) {
		this.dateAchat = dateAchat;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public double getTotalPrix() {
		return comptable.getTotalPrix();

	}

//	public boolean isPrixFixe() {
//		return prixFixe;
//	}

	public double getPrix() {
		return prix;
	}

	public int compare(Livre livre) {
		if (this.nbPages == livre.nbPages) {
			return 0;
		} else if (this.nbPages > livre.nbPages) {
			return 1;
		} else {
			return -1;
		}
	}
	

	@Override
	public int hashCode() {
		return nbPages;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		return nbPages == other.nbPages;
	}

	public int compare(Livre livre1, Livre livre2) {
		if (livre1.nbPages == livre2.nbPages) {
			return 0;
		} else if (livre1.nbPages > livre2.nbPages) {
			return 1;
		} else {
			return -1;
		}
	}

	public void setPrix(double prix) {
		if (this.prix != -1) {
			this.prix = -this.prix;
			comptable.comptabilise(this);
		}
		if (prix >= 0) {
			this.prix = prix;
			// prixFixe=true;
			comptable.comptabilise(this);
		}

	}

	public Livre(String titre, String auteur, int nbPages, double prix) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		if (nbPages > 0) {
			this.nbPages = nbPages;
		}
		if (prix >= 0) {
			this.prix = prix;
			// prixFixe=true;
			comptable.comptabilise(this);
		}

	}

	public Livre() {
		super();
	}

	public Livre(String titre, String auteur) {
		super();
		this.titre = titre;
		this.auteur = auteur;
	}

	public Livre(String titre) {
		super();
		this.titre = titre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		if (nbPages > 0) {
			this.nbPages = nbPages;
		} else {
			System.out.println("Erreur nombre négatif non supporté pour ce champs");
		}
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("##0.00");
		String prixAffichage = "Prix indéterminé";
		if (prix != -1) {
			prixAffichage = df.format(prix) + "€";
		}
		return "\n titre : " + titre + "\t auteur : " + auteur + "\t nombres de pages : " + nbPages + "\t prix : "
				+ prixAffichage;
	}

	@Override
	public int compareTo(Livre other) {
		if (this.nbPages > other.nbPages) {
			return 1;
		} else if (this.nbPages == other.nbPages) {
			return 0;
		} else {
			return -1;
		}

	}

}
