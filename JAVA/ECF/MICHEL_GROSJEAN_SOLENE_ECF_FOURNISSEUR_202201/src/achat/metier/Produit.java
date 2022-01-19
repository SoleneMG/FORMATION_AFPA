package achat.metier;

public class Produit {
	private String idProduit;
	private String designation;
	private float prixUnitaire;
	
	
	
	public Produit(String idProduit, String designation, float prixUnitaire) {
		this.idProduit = idProduit;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
	}
//	public Produit() {
//		this("0", "INCONNU", 0f);
//	}
	
	//Getters
	public String getIdProduit() {
		return idProduit;
	}
	public String getDesignation() {
		return designation;
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	
	
	//Setters
	public void setIdProduit(String idProduit) {
		this.idProduit = idProduit;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire
				+ "]";
	}
	
	
	public static void main(String[] args) {
		System.out.println(new Produit("id1","produit1", 10));
	}
	

}
