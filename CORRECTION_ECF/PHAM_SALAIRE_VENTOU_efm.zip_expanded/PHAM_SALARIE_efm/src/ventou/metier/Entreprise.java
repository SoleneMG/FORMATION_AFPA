package ventou.metier;

import java.util.ArrayList;

public class Entreprise {
	private String nom;
	private ArrayList<Salarie> salaries = new ArrayList<>();

	public ArrayList<Salarie> getSalaries() {
		return salaries;
	}

	public void setSalaries(ArrayList<Salarie> salaries) {
		this.salaries = salaries;
	}

	public Entreprise(String nom) {
		this.nom = nom;
	}

	public Entreprise() {
		this("ANONYME");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void addSalaries(Salarie salarie) throws SalarieException {
		if (!salaries.contains(salarie)) {
			salaries.add(salarie);
			if (!this.equals(salarie.getEntreprise())) {
				salarie.setEntreprise(this);
			}
		} else {
			throw new SalarieException(salarie.getNom() + " est deja dans l'entreprise");
		}

	}

	public int getNbSalaries() {
		return salaries.size();
	}

	@Override
	public String toString() {
		return "Entreprise [nom=" + nom + ", nbSalaries=" + getNbSalaries() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
