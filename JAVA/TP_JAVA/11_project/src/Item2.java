
public class Item2 {
	/**
	 * Notion de surcharge. Ecrire 4 versions différentes de la méthode "tracerLigne"
	 * 1. Trace une ligne de 20 tirets
	 * 2. Trace une ligne de N tirets.
	 * 3. Trace une ligne de N caractères quelconques
	 * 4. Trace une ligne de N caractères quelconques (algorithme récursif)
	 * @param args
	 */
	
	public static final int NB_TIRETS = 20;

	public static void main(String args[]) {
		int i = 0;
		Item2 i2 = new Item2();
		System.out.println("1.");
		i2.tracerLigne(NB_TIRETS);
		System.out.println("\n2.");
		i2.tracerLigne(i, NB_TIRETS);
		System.out.println("\n3.");
		i2.tracerLigne(NB_TIRETS, '*');
		System.out.println("\n4.");
		i2.tracerLigne(i, NB_TIRETS, '*');
	}

	public void tracerLigne(int nbTiret) {
		int i = 0;
		while (i < nbTiret) {
			i++;
			System.out.print("-");
		}
	}

	public void tracerLigne(int i, int nbTiret) {

		if (i < nbTiret) {
			i++;
			tracerLigne(i, nbTiret);
			System.out.print("-");
		}
	}

	public void tracerLigne(int nbTiret, char character) {
		int i = 0;
		while (i < nbTiret) {
			i++;
			System.out.print(character);
		}
	}

	public void tracerLigne(int i, int nbTiret, char character) {

		if (i < nbTiret) {
			i++;
			tracerLigne(i, nbTiret, character);
			System.out.print(character);
		}
	}

}
