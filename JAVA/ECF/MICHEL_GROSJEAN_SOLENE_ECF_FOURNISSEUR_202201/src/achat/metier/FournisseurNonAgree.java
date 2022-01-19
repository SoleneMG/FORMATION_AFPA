package achat.metier;

public class FournisseurNonAgree extends Fournisseur {
		private float totalAchatMax;
	
	public FournisseurNonAgree(String nom, float max) {
		super(nom, 0);
		super.setNoAgr(0);
		this.totalAchatMax = max;
	}

	public float getTotalAchatMax() {
		return totalAchatMax;
	}

	public void setTotalAchatMax(float totalAchatMax) {
		this.totalAchatMax = totalAchatMax;
	}

	@Override
	public void addAchat(float montant) throws AchatException {
		if((this.getTotalAchat()+montant)<=this.totalAchatMax) {
			super.addAchat(montant);
		} else {
			throw new AchatException("Montant d'achat max atteint");
		}
		
	}

	@Override
	public String toString() {
		return "FournisseurNonAgree [totalAchatMax=" + totalAchatMax + "], Fournisseur " + super.toString();
	}
	
	@Override
	public void bonus() {
		this.totalAchatMax+=totalAchatMax*0.10f;
	}
	
	public static void main(String[] args) {
		FournisseurNonAgree fournisseurNonAgree = new FournisseurNonAgree("Sun", 10);
		System.out.println(fournisseurNonAgree);
		try {
			fournisseurNonAgree.addAchat(5.00f);
		} catch (AchatException e) {
			e.printStackTrace();
		}
		try {
			fournisseurNonAgree.addAchat(6.00f);
		} catch (AchatException e) {
			e.printStackTrace();
		}
		System.out.println(fournisseurNonAgree);
		
		System.out.println("Avant bonus : montant max achat "+fournisseurNonAgree.totalAchatMax+"€");
		fournisseurNonAgree.bonus();
		System.out.println("Après bonus : montant max achat "+fournisseurNonAgree.totalAchatMax+"€");
	}

}
