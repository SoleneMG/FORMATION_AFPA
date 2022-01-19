package achat.metier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Catalogue {
	private int noCatalogue;
	List<Produit> produits;
	Fournisseur fournisseur;
	
	
	public Catalogue(int noCatalogue, Fournisseur fournisseur) {
		this.noCatalogue = noCatalogue;
		this.fournisseur=fournisseur;
		if(!this.equals(fournisseur.getFournisseur())) {
			fournisseur.setCatalogue(this);
		}
		
	}
	public Catalogue(int noCatalogue, List<Produit> produits) {
		this.noCatalogue = noCatalogue;
		this.produits = produits;
	}
	public Catalogue(int noCatalogue) {
		this(noCatalogue, new ArrayList<>());
	}
	public Catalogue() {
		this(0, new ArrayList<>());
	}

	//Getters
	public int getNoCatalogue() {
		return noCatalogue;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public Catalogue getCatalogue() {
		return this;
	}
	
	//Setters
	public void setNoCatalogue(int noCatalogue) {
		this.noCatalogue = noCatalogue;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	public void addProduit(Produit produit) {
		produits.add(produit);
	}
	
	public float getPrixProduitTotal() {
		float prixProduitTotal=0;
		for (Produit produit : produits) {
			prixProduitTotal+=produit.getPrixUnitaire();
		}
		return prixProduitTotal;
	}
	
	@Override
	public String toString() {
		String noCatalogueString = this.noCatalogue==0 ? "pas de numéro de catalogue" : ""+this.noCatalogue;
		String nbProduits = this.produits.size()==0 ? "aucun produits référencés" : ""+ this.produits.size();
		return "Catalogue [noCatalogue=" + noCatalogueString + ", produits=" + nbProduits + "]";
	}
	
	public static void main(String[] args) {
		System.out.println(new Catalogue());
		System.out.println(new Catalogue(105));
		System.out.println(new Catalogue(105, Arrays.asList(new Produit("id1","produit1", 10), new Produit("id2","produit2", 40))));
		
		System.out.println("---------------------------------------------");
		Catalogue catalogue = new Catalogue(105, Arrays.asList(new Produit("id1","produit1", 10), new Produit("id2","produit2", 40)));
		System.out.println(catalogue.getPrixProduitTotal());
	}
	
	
	

}
