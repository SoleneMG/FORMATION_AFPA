package c01_le_langage.e8_enumeration;

/** Enoncé 1.8 / Etape 1 */
public enum Intensite {
	FAIBLE, MOYENNE, FORTE;

	public String toString() {
		switch( this ) {
		case FAIBLE : return "faible";
		case MOYENNE : return "moyenne";
		case FORTE : return "forte";
		}
		return super.toString();
	}
}
