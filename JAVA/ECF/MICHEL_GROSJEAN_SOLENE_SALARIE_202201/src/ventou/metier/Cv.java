package ventou.metier;

public class Cv {
	private String derniereEntreprise;
	private String niveauEtude;
	private Salarie salarie;
	
	
	
	public Cv(String derniereEntreprise, String niveauEtude) {
		this.derniereEntreprise = derniereEntreprise;
		this.niveauEtude = niveauEtude;
	}
	public Cv() {
		this("INCONNUE", "INCONNU");
	}

	public String getDerniereEntreprise() {
		return derniereEntreprise;
	}
	public String getNiveauEtude() {
		return niveauEtude;
	}
	public Salarie getSalarie() {
		return salarie;
	}
	public void setDerniereEntreprise(String derniereEntreprise) {
		this.derniereEntreprise = derniereEntreprise;
	}
	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}
	public void setSalarie(Salarie s) {
		if(this.salarie != s) {
			this.salarie=s;
			s.setCv(this);
		}
	}
	@Override
	public String toString() {
		return "Cv [derniereEntreprise=" + derniereEntreprise + ", niveauEtude=" + niveauEtude+"]";
	}
	
	public static void main(String[] args) {
		Salarie s = new Salarie("martin", 5000);
		Cv cv = new Cv();
		Cv cv1 = new Cv("AFPA", "Licence");
		Cv cv2 = new Cv();
		
		s.setCv(cv);
		System.out.println(s);
		s.setCv(cv1);
		System.out.println(s);
	}

}
