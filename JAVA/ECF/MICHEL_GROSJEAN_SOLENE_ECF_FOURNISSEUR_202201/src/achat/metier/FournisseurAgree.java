package achat.metier;

public class FournisseurAgree extends Fournisseur {
	
	public FournisseurAgree() {
		super();
	}
	public FournisseurAgree(String nom) {
		super(nom);
	}
	
	public static void main(String[] args) {
		Fournisseur fa = new FournisseurAgree();
		System.out.println(fa);
		
	}

}
