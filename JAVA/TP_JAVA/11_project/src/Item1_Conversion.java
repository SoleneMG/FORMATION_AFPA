import java.util.Scanner;

public class Item1_Conversion {

	/**
	 * Développement d'un ensemble de 4 méthodes utilisables dans une application
	 * financières. Ces méthodes devront être le plus réutilisables possible 1
	 * Conversion Euro/livre Sterling 2 Conversion Franc/livre Sterling 3 Arrondi
	 * d'une somme à N chiffres après la virgule 4 Troncature d'une somme à N
	 * chiffres après la virgule
	 * 
	 * Ces méthodes peuvent utiliser les méthodes et champs statiques des classes
	 * Math, Long, Double. Etablir un programme test (méthode main) permettant de
	 * valider le bon fonctionnement de chacune des 4 fonctions y compris dans les
	 * limites.
	 */

	static final float INDICE_DE_CONVERSION_EURO_LIVRE_STERLING = 0.846f;
	static final float INDICE_DE_CONVERSION_FRANC_LIVRE_STERLING = 0.81f;
	static final float INDICE_DE_CONVERSION_EURO_FRANC = 1.04f;
	static Scanner sc = new Scanner(System.in);
	static int[] nombreApresVirguleTableauDeCorrespondance = {1,10,100,1_000,10_000,100_000,1_000_000};
	 

	public static void main(String[] args) {
		Item1_Conversion i1 = new  Item1_Conversion();
		i1.saisir();
	}

	public double conversion(double montant, float indiceDeConversion, int i) {
		if (i > 0) {
			return montant * indiceDeConversion;
		} else {
			return montant / indiceDeConversion;
		}
	}

	public void saisir() {
		boolean continuer = false;
		int deviseDepart;
		int deviseArrivee;
		int montant;
		int methodeDArrondi;
		int nbDeChiffresApresLaVirgule;
		double montantConverti = -1;
		System.out.println("**************** CONVERTISSEUR ****************");
		do {
			System.out.println("Choississez votre devise actuelle : \n1 - euros \n2 - Livre Sterling \n3 - Franc");
			deviseDepart = sc.nextInt();
			System.out.println("Saisir le montant : ");
			montant = sc.nextInt();
			System.out.println("Convertir vers : \n1 - euros \n2 - Livre Sterling \n3 - Franc");
			deviseArrivee = sc.nextInt();
			sc.nextLine();
			if (deviseDepart == deviseArrivee) {
				System.out.println("Veuillez choisir des devises différentes");
				continuer = true;
			}
		} while (continuer);
		System.out.println("Voulez-vous tronquer ou arrondir la somme obtenue ? \n1 - tronquer \n2 - arrondir :");
		methodeDArrondi = sc.nextInt();
		System.out.println("Combien de chiffres après la virgule ? ");
		nbDeChiffresApresLaVirgule = sc.nextInt();
		nbDeChiffresApresLaVirgule++;

		if (deviseDepart == 1) {
			if (deviseArrivee == 2) {
				montantConverti = conversion(montant, INDICE_DE_CONVERSION_EURO_LIVRE_STERLING, 1);
			}
			if (deviseArrivee == 3) {
				montantConverti = conversion(montant, INDICE_DE_CONVERSION_EURO_FRANC, 1);
			}
		}
		if (deviseDepart == 2) {
			if (deviseArrivee == 1) {
				montantConverti = conversion(montant, INDICE_DE_CONVERSION_EURO_LIVRE_STERLING, -1);
			}
			if (deviseArrivee == 3) {
				montantConverti = conversion(montant, INDICE_DE_CONVERSION_FRANC_LIVRE_STERLING, -1);
			}
		}
		if (deviseDepart == 3) {
			if (deviseArrivee == 1) {
				montantConverti = conversion(montant, INDICE_DE_CONVERSION_EURO_FRANC, -1);
			}
			if (deviseArrivee == 2) {
				montantConverti = conversion(montant, INDICE_DE_CONVERSION_FRANC_LIVRE_STERLING, 1);
			}
		}
		if(montantConverti !=-1) {
			if(methodeDArrondi==1) { // tronquer 
				System.out.println(tronquerNchiffresApresVirgule(nbDeChiffresApresLaVirgule, montantConverti));
			} else if (methodeDArrondi==2) { // arrondir
				System.out.println(arrondirNchiffresApresVirgule(nbDeChiffresApresLaVirgule, montantConverti));
			} else {
				throw new IllegalArgumentException("Methode d'arrondi non supportée");
			}
		}
		

	}

	public double arrondirNchiffresApresVirgule(int nbChiffresApresVirgule, double montant) {
		double scale = Math.pow(10, nbChiffresApresVirgule);
		return Math.round(montant*nombreApresVirguleTableauDeCorrespondance[nbChiffresApresVirgule])/nombreApresVirguleTableauDeCorrespondance[nbChiffresApresVirgule];
	}
	
	public double tronquerNchiffresApresVirgule(int nbChiffresApresVirgule, double montant) {
		return Math.floor(montant *nombreApresVirguleTableauDeCorrespondance[nbChiffresApresVirgule])/nombreApresVirguleTableauDeCorrespondance[nbChiffresApresVirgule];
	}

}
