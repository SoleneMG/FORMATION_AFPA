package c01_le_langage.e8_enumeration;

/** Enoncé 1.8 / Etape 1, 2 et 3 */
public enum Couleur {
	ROUGE( 255, 0, 0 ), 
	VERT( 0,255, 0), 
	BLEU( 0, 0, 255 ), 
	JAUNE( 255, 255, 0), 
	NOIRE( 0, 0, 0 ), 
	BLANC(255, 255, 255),
	GRIS( 255 / 2, 255 / 2, 255 / 2);
	 
	private int red, green, blue;

	// Etape 2
	private Couleur( int red, int green, int blue ) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	// Etape 3
	public Couleur melange( Couleur couleur ) {
		int newRed = ( red + couleur.red ) / 2;
		int newGreen = ( green + couleur.green ) / 2;
		int newBlue = ( blue + couleur.blue ) / 2;
		for ( Couleur c : Couleur.values() ) {
			if ( c.red == newRed && 
					c.green == newGreen &&
						c.blue == newBlue )
				return c;
		}
		return this;
	}

	// Etape 1
	public String toString() {
		switch( this ) {
		case ROUGE : return "rouge";
		case VERT : return "vert";
		case BLEU : return "bleu";
		case JAUNE : return "jaune";
		case NOIRE : return "noire";
		case BLANC : return "blanc";
		case GRIS : return "gris";
		}
		return super.toString();
	}
}
