package demo.enumeration;

public enum EnumFeuMulticolore {
	ORANGE,VERT,ROUGE;
	
}

/* Travail à  réaliser:
 * 1-  placez le code plus bas dans l'énumération
 * 2-  Quel effet constatez-vous?
@Override
public String toString(){
	switch(this){
		case VERT:
			return "Feu Vert";
			
		case ROUGE: 
			return "Feu Rouge";

		case ORANGE:
			return "Feu orange";

		default://On peut s'en passer?
			throw new IllegalArgumentException("Cas impossible");
	}
}
*/
