package ventou.metier;

public class Cv {
	private String derniereEntreprise;
	private String niveauEtude;
	private Salarie salarie;

	public Cv(String derniereEntreprise, String niveauEtude, Salarie salarie) {
		this.derniereEntreprise = derniereEntreprise;
		this.niveauEtude = niveauEtude;
		this.salarie = salarie;
	}

	public Cv(String derniereEntreprise, String niveauEtude) {
		this(derniereEntreprise, niveauEtude, null);
	}

	public Cv() {
		super();
	}

	public String getDerniereEntreprise() {
		return derniereEntreprise;
	}

	public void setDerniereEntreprise(String derniereEntreprise) {
		this.derniereEntreprise = derniereEntreprise;
	}

	public String getNiveauEtude() {
		return niveauEtude;
	}

	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}

	public Salarie getSalarie() {
		return salarie;
	}

	public void setSalarie(Salarie salarie) throws SalarieException {
		if (this.getSalarie() == null) {
			this.salarie = salarie;
			if (!this.equals(salarie.getCv()) && salarie.getCv() != null) {
				salarie.setCv(this);
			}
						
		} else {
			throw new SalarieException("C'est le cv de " + this.getSalarie().getNom());
		}

	}

	@Override
	public String toString() {
		String nomSalarie = salarie == null ? "pas de salarie" : salarie.getNom();
		return "Cv [derniereEntreprise=" + derniereEntreprise + ", niveauEtude=" + niveauEtude + ", salarie="
				+ nomSalarie + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
