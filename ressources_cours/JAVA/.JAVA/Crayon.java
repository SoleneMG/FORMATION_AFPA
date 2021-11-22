package c01_le_langage.e8_enumeration;

/** Enoncé 1.8 / Etape 1 et 3 */
public class Crayon {
	private Couleur couleur;
	private Intensite intensite;

	public Crayon( Couleur couleur, Intensite intensite ) {
		this.couleur = couleur;
		this.intensite = intensite;
	}
	public void dessiner() {
		System.out.printf(
				"Dessiner avec la couleur %s et l'intensite %s\n",
				couleur,
				intensite );
	}
	
	public static void main( String[] args ) {
		Crayon cr = new Crayon( Couleur.BLEU, Intensite.FORTE );
		cr.dessiner();		
		cr = new Crayon( Couleur.ROUGE, Intensite.MOYENNE );
		cr.dessiner();
		// Etape 3
		System.out.println( Couleur.NOIRE.melange( Couleur.BLANC) );
	}
}
