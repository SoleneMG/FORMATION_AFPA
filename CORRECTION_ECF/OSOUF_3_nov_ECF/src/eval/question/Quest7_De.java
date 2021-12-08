package eval.question;

public class Quest7_De {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 7\n" +
"Lancer un dé ( valeur aléatoire de 1 à 6 ) 15 fois.\n" + 
"Afficher les sorties et  afficher le nombre de sorties du\n" +
"chiffre 1, de 2, de 3, de 4, de 5 et de 6\n" +
"*******************************************************************\n\n\n"
		);
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int  tab [] = new int [15];
		
		System.out.println("***   Voici les 15 valeurs   ***");
		for (int i = 0; i < tab.length; i++) {
			int b = (int) ((Math.random() * 6 ) +1);
			tab[i] = b;
			if(i % 5 == 0) {
				System.out.println();
			}
			
			System.out.print("_ "+b+" _");
			
			if( tab[i] == 1 ) {a1 = a1 + 1;}
			if( tab[i] == 2 ) {a2 = a2 + 1;}
			if( tab[i] == 3 ) {a3 = a3 + 1;}
			if( tab[i] == 4 ) {a4 = a4 + 1;}
			if( tab[i] == 5 ) {a5 = a5 + 1;}
			if( tab[i] == 6 ) {a6 = a6 + 1;}
		}
		System.out.println();
		System.out.println();
		System.out.println("le 1 est sortie : "+a1+" fois");
		System.out.println("le 2 est sortie : "+a2+" fois");
		System.out.println("le 3 est sortie : "+a3+" fois");
		System.out.println("le 4 est sortie : "+a4+" fois");
		System.out.println("le 5 est sortie : "+a5+" fois");
		System.out.println("le 6 est sortie : "+a6+" fois");
		

	}

}
