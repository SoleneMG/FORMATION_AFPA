package ventou.metier;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
	private String nom;
	private List<Salarie> salaries;
	
	public Entreprise(String nom, List<Salarie> salaries) {
		this.nom = nom;
		this.salaries = salaries;
	}
	public Entreprise(String nom) {
		this(nom, new ArrayList<Salarie>());
	}
	
	public Entreprise() {
		this("ENTREPRISE INC", new ArrayList<Salarie>());
	}

	public void addSalarie(Salarie s) {
		salaries.add(s);
	}
	
	public int getNbSalarie() {
		return salaries.size();
	}
	
	
	
	@Override
	public String toString() {
		return "Entreprise [nom=" + nom + ", salaries=" + salaries + "]";
	}

	public static void main(String[] args) {
		Entreprise e = new Entreprise();
		Salarie s = new Salarie("Dupont", 1000);
		Commercial c = new Commercial("Commercial", 2000, 10_000);
		Commercial c1 = new Commercial("Commercial1", 800, 20_000);
		Salarie s1 = new Salarie("Salarie", 900);
		e.addSalarie(s1);
		e.addSalarie(s);
		e.addSalarie(c1);
		e.addSalarie(c);
		
		System.out.println(e.getNbSalarie());
		
		System.out.println(e);
		
		
		
	}
}
