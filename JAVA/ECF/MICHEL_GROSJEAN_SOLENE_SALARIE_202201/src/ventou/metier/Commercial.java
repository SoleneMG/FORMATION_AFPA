package ventou.metier;

public class Commercial extends Salarie {
	private double chiffreAffaire;
	private double objectif;

	public Commercial(String nom, double sal, double objectif) {
		super(nom, sal);
		this.objectif = objectif;
	}

	public Commercial() {
		super("commerc indet", 0);
		this.objectif=10_000;
	}
	
	public void nouvelleVente(double montant) {
		chiffreAffaire+=montant;
	}
	
	

	@Override
	public void augmente(double delta) throws SalarieException {
		if(chiffreAffaire>=objectif) {
			super.augmente(delta);
		} else {
			throw new SalarieException("L'objectif n'est pas atteint, augmentation impossible !");
		}
		
	}

	@Override
	public String toString() {
		return super.toString() + " Commercial [chiffreAffaire=" + chiffreAffaire + ", objectif=" + objectif + "]";
	}

	public static void main(String[] args) {
		Commercial c = new Commercial();
		c.nouvelleVente(500);
		c.nouvelleVente(500);
		try {
			c.augmente(50);
			System.out.println("augmentation réussie");
		} catch (SalarieException e) {
			e.printStackTrace();
		}
		System.out.println(c);
		
		
		Commercial c2 = new Commercial("dupont", 5000, 20_000);
		c2.nouvelleVente(20_000);
		try {
			c2.augmente(50);
			System.out.println("augmentation réussie");
		} catch (SalarieException e) {
			e.printStackTrace();
		}
		System.out.println(c2);
	}

}
