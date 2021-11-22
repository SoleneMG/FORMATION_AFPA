package demo_principale;

//import demo2015.demo01_CLASSE_IfElse_switch_enum_boucle.Demo05_ensemble_valeur_fini_enum.CouleurFeu;

//import demo2015.demo01_CLASSE_IfElse_switch_enum_boucle.Demo01_CLASSE_IfElse_switch_enum_boucle_AECLATER.MaClassInterne;

public class Demo01_ensemble_valeur_fini {

		/** Rappel sur ma première constante */
		public static final int MA_CONSTANTE = 9;
		
		/* Ensemble de valeur fini pour gérer les couleurs d'un feu de signalisation*/
		public final static int ROUGE = 0;
		public final static int ORANGE = 1;
		public final static int VERT = 2;
		

		
	public static void main(String[] args) {
		//////////////////////////////////////////////
		//Ensemble de valeurs fini pour gérer les couleurs
		//  d'un feu de signalisation
		//////////////////////////////////////////////
		/*		Autre piste   avec le switch sur les chaines en Java6
		 * Penser à la méthode aquals  (objet)
		String feuRouge = "ROUGE";
		String feuOrange = "ORANGE";
		String feuVert = "VERT";
		*/

		//Voir les constantes déclarées plus haut
		int feu ;//variable d'accueil
		
		feu = 2;//On value la variable
		 //feu = 7; //Pb:Il n'y a pas de contrôle de la valeur
		 
		 System.out.println("Couleur du feu :" + couleurFeu(feu));
		
		 
			//////////////////////////////////////////////
			//Ensemble de valeurs fini pour gérer les couleurs
			//d'un feu de signalisation
		 	//Utilisation d'une énumération
			//////////////////////////////////////////////
			 
			//int feu ;//variable d'accueil

			 feu = VERT;
			 System.out.println();
			 //feu = 7;  Génère une erreur
			 System.out.println("Couleur du feu :" + feu);
	 
			/* Le switch pour une variable entière ou char*/
			switch(feu)
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
					System.out.println("Cas non géré");
					throw new IllegalArgumentException("Cas non géré");
		
					//break;
			}
		 
	}
	/**
	 * Pour la valeur entière passée en paramètre, elle retourne une chaîne qui correspond à la couleur 
	 * @param f l'entier représentant la couleur
	 * @return  retourne une chaîne qui correspond à la couleur 
	 */
	public static String couleurFeu(int f){
		//String retour;
		
		switch(f)
		{
		case ROUGE:
			//retour = "ROUGE";
			return "ROUGE";
			//break;
		case ORANGE:
			return "ORANGE";
			//break;
		case VERT:
			return "VERT";
			//break;
		default:
			throw new IllegalArgumentException("Cas non géré");
			//break;
		}

		//return retour;
	}
	
}
