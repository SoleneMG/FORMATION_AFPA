package ventou.metier;

import java.util.Objects;

public class Salarie {
	private static int prochainMatricule = 2000; // Evolue au fur et Ã  mesure
													// de la crÃ©ation des objets
	private static final boolean DEMISSIONNAIRE = false; // Pour etatActivite
	private static final boolean ACTIF = true; // Pour etatActivite

	private String nom;
	private int matricule;
	private double salaire;
	private boolean etatActivite; // Ã©tat de l'activitÃ© du salariÃ©
	private Cv cv;

	public Salarie(String nom, double sal, int noMatricule) {
		this.nom = nom.toUpperCase();
		salaire = sal;
		matricule = noMatricule;
		etatActivite = ACTIF;
	}

	public Salarie(String nom, double sal) {
		this(nom, sal, prochainMatricule++);
	}

	public Salarie() {
		this("INDETERMINE", 0, prochainMatricule++);
	}

	public void demissionne() {
		etatActivite = DEMISSIONNAIRE;
	}

	public void augmente(double delta) throws SalarieException {
		if(etatActivite==true) {
			salaire += delta;
		} else {
			throw new SalarieException("Augmentation impossible pour un salarié démissionnaire");
		}
		
	}
	
	public String getNom() {
		return nom;
	}

	public int getMatricule() {
		return matricule;
	}

	public double getSalaire() {
		return salaire;
	}

	public boolean isEtatActivite() {
		return etatActivite;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public void setEtatActivite(boolean etatActivite) {
		this.etatActivite = etatActivite;
	}
	
	public void setCv(Cv cv) {
		if(this.cv != cv) {
			this.cv = cv;
			cv.setSalarie(this);
		}
	}

	@Override
	public String toString() {
		String etatActiviteString = etatActivite == true ? "ACTIF" : "DEMISSIONNAIRE";
		return "Salarie [nom=" + nom + ", matricule=" + matricule + ", salaire=" + salaire + "€, etatActivite="
				+ etatActiviteString + ", cv="+cv+"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(etatActivite, nom);
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
		return etatActivite == other.etatActivite && Objects.equals(nom, other.nom);
	}

	public static void main(String[] args) {
		Salarie s = new Salarie("martin", 5000);
		try {
			s.augmente(50);
		} catch (SalarieException e) {
			e.printStackTrace();
		}
		System.out.println(s);
		s.demissionne();
		try {
			s.augmente(50);
		} catch (SalarieException e) {
			e.printStackTrace();
		}
		System.out.println(s);

		Salarie s2 = new Salarie("martin", 4000, 0);
		System.out.println(s2);

		Salarie s3 = new Salarie();
		System.out.println(s3);
		
		Salarie s4 = new Salarie("martin", 1000);
		System.out.println(s3);
		
		System.out.println("egaux ? "+s.equals(s2));
		System.out.println("egaux ? "+s4.equals(s2));
		
		Cv cv = new Cv();
		Cv cv1 = new Cv("AFPA", "Licence");
		Cv cv2 = new Cv("ARPEGE", "Bac");
		
		s.setCv(cv);
		System.out.println(s);
		System.out.println(cv.getSalarie());
		s.setCv(cv1);
		System.out.println(s);
		System.out.println(cv1.getSalarie());
		
		Commercial c = new Commercial("dupont", 8000, 10_000);
		cv2.setSalarie(c);
		System.out.println(c);
		System.out.println(cv2.getSalarie());
		
		

	}
}
