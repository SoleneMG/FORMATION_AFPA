package demo_principale;
//PLUS COMPLET
//VOIR 477_DEMO__ENUMERATION_ENSEMBLE-FINI_Java

public class Demo02_ensemble_valeur_fini_enum {
	
	
	 class MaClassInterne{
	 }
	 MaClassInterne ref = new MaClassInterne();//association-composition!!
	 
	//VOIR aussi le projet: 477_DEMO__ENUMERATION_ENSEMBLE-FINI_Java
	 
	 /**Les couleurs d'un feu de signalisation tricolor*/
	enum CouleurFeu{
		 ROUGE,
		 ORANGE,
		 VERT
	 }
	
	
	
	public static void main(String[] args) {
		//////////////////////////////////////////////
		//Ensemble de valeurs fini pour gérer les couleurs
		//d'un feu de signalisation
	 	//Utilisation d'une énumération
		//////////////////////////////////////////////
		 
		CouleurFeu feu2 ;//variable d'accueil

		 feu2 = CouleurFeu.VERT;
		 //feu2 = CouleurFeu.bleu;
		 System.out.println();
		 
		 //Les valeurs sont contrôlées
		 //feu2 = 7;  //Génère une erreur
		 //feu2 = CouleurFeu.VERTS; // Génère une erreur

		 //System.out.println("Couleur du feu2 :" + feu2.toString());
		 System.out.println("Couleur du feu2 :" + feu2);

		/* Le switch pour une variable énumérée (depuis Java 5)*/
		switch(feu2)
		{
			case ROUGE:
				System.out.println("Arrêtez vous !");
	
				break;
			case ORANGE:
				System.out.println("Arrêtez vous !");
	
				break;	
			case VERT:
				System.out.println("Vous pouvez avancer !");
	
				break;
			default:
				System.out.println("NE PEUX JAMAIS ARRIVE");
				//throw new RuntimeException("cas impossible");
	
				break;
		}
		
		
		// Par exemple: un input d'un formulaire
		feu2 = CouleurFeu.valueOf("ORANGE");
		
		System.out.println("couleur du feu :" + feu2);
		
		
		// Pour d'autres tests sur les énumérations
		//Voir E:\16_ETUDE_JAVA__BASE\477_DEMO__ENUMERATION_ENSEMBLE-FINI_Java\src\demo\enumeration
		//voir 477_DEMO__ENUMERATION_ENSEMBLE-FINI_Java

	}
	
}
