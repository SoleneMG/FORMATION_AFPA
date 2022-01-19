package achat.metier;

import java.util.Arrays;
import java.util.Objects;

public class Fournisseur implements Comparable<Fournisseur> {
	private String nom;
	private float totalAchat;// Montant total des Achats
	private int noAgr; // numéro d'agrément
	private Catalogue catalogue;

	private static int idxAgr = 1001;

	// Constructeurs
	public Fournisseur(String nom, int noAgr) {
		this.nom = nom;
		this.totalAchat = 0;
		this.noAgr = noAgr;
	}

	public Fournisseur(String nom) {
		this(nom, idxAgr++);
		this.totalAchat = 0;
	}

	public Fournisseur() {
		this("ANONYME", idxAgr++);
		this.totalAchat = 0;
	}

	// Getters
	public String getNom() {
		return nom;
	}

	public int getNoAgr() {
		return noAgr;
	}

	public float getTotalAchat() {
		return totalAchat;
	}
	public Catalogue getCatalogue() {
		return catalogue;
	}
	public Fournisseur getFournisseur() {
		return this;
	}


	// Setters
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNoAgr(int noAgr) {
		this.noAgr = noAgr;
	}

	public void setTotalAchat(float totalAchat) throws AchatException {
		if(totalAchat <0) {
			throw new AchatException("Le montant total des achats ne peut pas être négatif");
		}
		this.totalAchat = totalAchat;
	}
	
	public void setCatalogue(Catalogue catalogue) {
		if(!this.equals(catalogue.getCatalogue())) {
			this.catalogue = catalogue;
		}
		
	}

	public void addAchat(float montant) throws AchatException {
		if (montant > 0) {
			totalAchat += montant;
		} else {
			throw new AchatException("Le montant de l'achat ne peut pas être négatif");
		}

	}
	
	public float getPrixCatalogue() {
		return catalogue.getPrixProduitTotal();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fournisseur other = (Fournisseur) obj;
		return Objects.equals(nom, other.nom);
	}

	@Override
	public String toString() {
		String catalogueString = catalogue==null ? "pas de catalogue" : catalogue.toString();
		return "[Numéro d'agrément : " + this.noAgr + " | Nom : " + this.nom + " | Total des achats : "
				+ this.totalAchat + "€"+" | " +catalogueString +"]";
	}

	@Override
	public Fournisseur clone() {
		return new Fournisseur(this.getNom(), this.getNoAgr());
	}
	@Override
	public int compareTo(Fournisseur other) {
		if (this.totalAchat > other.totalAchat) {
			return 1;
		} else if (this.totalAchat < other.totalAchat) {
			return -1;
		} else if (this.totalAchat == other.totalAchat) {
			return 0;
		} else {
			System.err.println("BUG dans le compareTo de la classe " + this.getClass().getName());
			return -10; // Ne doit pas passer par là 
		}
	}
	
	public void bonus() {}

	public static void main(String[] args) {
		Fournisseur fournisseur1 = new Fournisseur("Microsoft");
		Fournisseur fournisseur2 = new Fournisseur();
		Catalogue catalogue = new Catalogue(105, Arrays.asList(new Produit("id1","produit1", 10), new Produit("id2","produit2", 40)));
		fournisseur1.setCatalogue(catalogue);
		System.out.println("***************************1.1 METHODE TOSTRING*************************\n");
		System.out.println(fournisseur1);

		System.out.println("\n***************************1.3_METHODES EQUALS ET HASHCODE*************************\n");
		boolean isEqual = fournisseur1.equals(fournisseur2);
		System.out.println("Nom du fournisseur1 : " + fournisseur1.getNom() + ", Nom du fournisseur2 : "
				+ fournisseur2.getNom() + " sont il égaux ? " + isEqual);

		System.out.println("\n***************************2_METHODES CLONE*************************\n");
		Fournisseur fournisseur3 = null;
		fournisseur3 = fournisseur1.clone();
		System.out.println(fournisseur1 + "|" + fournisseur3);
		System.out.println("\n***************************14 GET PRIX CATALOGUE*************************\n");
		System.out.println("Prix catalogue : "+fournisseur1.getPrixCatalogue()+"€");

	}


	
}
