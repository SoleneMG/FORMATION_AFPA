package ventou.metier;

public class Commercial extends Salarie {
	private double chiffreAffaire = 0.0;
	private double objectif;
	
	
	public double getChiffreAffaire() {
		return chiffreAffaire;
	}


	public double getObjectif() {
		return objectif;
	}


	public void setObjectif(double objectif) {
		this.objectif = objectif;
	}


	public Commercial(String nom, double salaire, double objectif) {
		super(nom, salaire);
		this.objectif = objectif;
	}


	public Commercial() {
		this("commerc indet", 0.0, 1000.0);
	}


	@Override
	public String toString() {
		return super.toString() + " Commercial [chiffreAffaire=" + chiffreAffaire + ", objectif=" + objectif + "]";
	}

	
	public void nouvelleVente(double montant) {
		if (montant >=0) {
			chiffreAffaire += montant;
		}
	}
	
	


	@Override
	public void augmente(double delta) throws SalarieException {
		super.augmente(delta);
		
		if (chiffreAffaire < objectif) {
			this.setSalaire(this.getSalaire() - delta);
			throw new SalarieException("L'objectif commercial n'est pas atteindu");
		}
	}


	public static void main(String[] args) {
		Commercial commercial1 = new Commercial("commercial1", 2000.0, 10000.0);
		System.out.println("Commercial commercial1 = new Commercial(\"commercial1\", 2000.0, 10000.0);");
		System.out.println(commercial1);
		System.out.println();
		
		Commercial commercial2 = new Commercial();
		System.out.println("Commercial commercial2 = new Commercial();");
		System.out.println(commercial2);

	}

}
