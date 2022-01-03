package domain;

public class Commande {
	private Article article;
	private int numero;
	private int quantiteArticle;
	
	
	// Constructeurs
	public Commande(Article article, int quantiteArticle) {
		super();
		this.article = article;
		this.quantiteArticle = quantiteArticle;
	}
	public Commande(Article article, int numero, int quantiteArticle) {
		super();
		this.article = article;
		this.numero = numero;
		this.quantiteArticle = quantiteArticle;
	}
	// Getters
	public Article getArticle() {
		return article;
	}
	public int getQuantiteArticle() {
		return quantiteArticle;
	}
	public int getNumero() {
		return numero;
	}
	
	// Setters
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public void setQuantiteArticle(int quantiteArticle) {
		this.quantiteArticle = quantiteArticle;
	}
	

}
