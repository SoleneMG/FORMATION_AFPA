package ventou.metier;

public class Salarie {
	private static int prochainMatricule = 2000; // Evolue au fur et à mesure
													// de la création des objets
	private static final boolean DEMISSIONNAIRE = false; // Pour etatActivite
	private static final boolean ACTIF = true; // Pour etatActivite

	private String nom;
	private int matricule;
	private double salaire;
	private boolean etatActivite; // état de l'activité du salarié
	private Cv cv;
	private Entreprise entreprise;

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) throws SalarieException {
		if (cv.getSalarie()==null) {
			this.cv = cv;
			if (!this.equals(cv.getSalarie()) && cv.getSalarie() != null) {
				cv.setSalarie(this);
			}
			
		} else {
			throw new SalarieException("Le cv entree est de " + cv.getSalarie().getNom());
		}

	}

	public Salarie(String nom, double salaire, int matricule) {
		this.nom = nom.toUpperCase();
		this.matricule = matricule;
		this.salaire = salaire;
		etatActivite = ACTIF;
	}

	public Salarie(String nom, double sal) {
		this(nom, sal, prochainMatricule++);
	}

	public Salarie() {
		this("INDETERMINE", Double.NaN);
	}

//	public Salarie(String nom, double sal) {
//		this.nom = nom.toUpperCase();
//		salaire = sal;
//		matricule = prochainMatricule++;
//		etatActivite = ACTIF;
//	}

	public void demissionne() {
		etatActivite = DEMISSIONNAIRE;
	}

	public void augmente(double delta) throws SalarieException {
		if (etatActivite == ACTIF) {
			salaire += delta;
		} else {
			throw new SalarieException("Ce salarie est demissionne");
		}
	}

	@Override
	public String toString() {
		String nomEntreprise = entreprise == null ? "ANONYME" : entreprise.getNom();
		String cvInfo = cv == null ? "pas de cv" : cv.toString();

		return "Salarie [nom=" + nom + ", matricule=" + matricule + ", salaire=" + salaire + ", etatActivite="
				+ etatActivite + ", cv=" + cvInfo + ", nomEntreprise=" + nomEntreprise + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (etatActivite ? 1231 : 1237);
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salarie other = (Salarie) obj;
		if (etatActivite != other.etatActivite)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public boolean isEtatActivite() {
		return etatActivite;
	}

	public void setEtatActivite(boolean etatActivite) {
		this.etatActivite = etatActivite;
	}

	public static void main(String[] args) {

		Salarie salarie1 = new Salarie("salarie1", 2000.0);
		System.out.println("Salarie salarie1 = new Salarie(\"salarie1\", 2000.0);");
		System.out.println(salarie1);
		System.out.println();

		Salarie salarie2 = new Salarie("salarie2", 1000.0, 1000);
		System.out.println("Salarie salarie2 = new Salarie(\"salarie1\", 2000.0, 1000);");
		System.out.println(salarie2);
		System.out.println();

		Salarie salarie3 = new Salarie();
		System.out.println("Salarie salarie3 = new Salarie();");
		System.out.println(salarie3);
		System.out.println();

		Salarie salarie4 = new Salarie("salarie1", 3000.0);
		System.out.println("Salarie salarie4 = new Salarie(\"salarie1\", 2000.0);");
		System.out.println(salarie4);
		System.out.println();

		System.out.println("salarie1.equals(salarie4): " + salarie1.equals(salarie4));
		System.out.println();

		System.out.println("salarie2.equals(salarie4): " + salarie2.equals(salarie4));
		System.out.println();

	}
}
