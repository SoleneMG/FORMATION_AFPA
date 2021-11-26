import java.util.Scanner;

public class Version2 {
	/**
	 * Le source ci dessous correspond au code d'un logiciel qui met en valeur les mutliples de 7 de 0 à 100. Executer ce programme avec la MV Java.
	 * 
	 * public class MultiplesV1{
	 * static final int nbDiv = 7;
	 * public static void main (String [] args){
	 * 		System.out.println("\nAffichage des MULTIPLES de " + nbDiv + " entre 0 et 100 \n");
	 * 
	 * for (int x=0 x<=100;x++){
	 * 		if(x% nbDiv == 0) System.out.println("("+ x +")\t");
	 * 		else System.out.println(" "+ x +")\t");
	 * 
	 * On souhaite faire évoluer le logiciel précédent de façon à pouvoir saisir au clavier :
	 * la valeur de nbDiv
	 * les limites de l'ensemble des nombres à visualiser
	 * 
	 * La convivialité de l'application est à envisager :
	 * 
	 * alignement des chiffres
	 * mode "mode page" pour des impressions de plus de 100 nombres.
	 * traitement des réponses différentes de 0 à N à la question finale.
	 * 
	 * Coder ces modifications en pensant aussi à la lisibilité du programme source
	 */
	
	static Scanner sc = new Scanner(System.in);
	static int NB_DIV = 7, MIN_VALUE = 0, MAX_VALUE= 100;
	static final int NB_COLUMN = 3;
	static final int NB_MAX_LINE_DISPLAY = 10;
	
	public static void main(String[] args) {
		Version2 v2 = new Version2();
		System.out.println("**************************************************************");
		System.out.println("\tAffichage des MULTIPLES de N entre min et max");
		System.out.println("**************************************************************");
		
		System.out.println("\nVeuillez renseigner N ? (Saisir un entier positif)");
		NB_DIV = v2.returnInteger();
		
		System.out.println("\nVeuillez renseigner min ? (Saisir un entier positif)");
		MIN_VALUE = v2.returnInteger();
		System.out.println("\nVeuillez renseigner max ? (Saisir un entier positif)");
		MAX_VALUE = v2.returnInteger();
		
		v2.displayTableOfMultiple();
		
		sc.close();
	}
	
	public void displayTableOfMultiple() {
		for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
			if(i % NB_DIV == 0) {
				System.out.print("("+ i +")\t");
			} else {
				System.out.print(" "+ i +"\t");
			}
			if(MIN_VALUE ==0) {
				if(i % NB_MAX_LINE_DISPLAY == 0 && i % NB_COLUMN == 2) {
					System.out.println("\n\nVeuillez appuyer sur ENTREE pour continuer l'affichage");
					sc.nextLine();
				} else if( i % NB_COLUMN == 2) {
					System.out.println();
				} 
			}else {
				if(i % NB_MAX_LINE_DISPLAY == 0 && i % NB_COLUMN == 0) {
					System.out.println("\n\nVeuillez appuyer sur ENTREE pour continuer l'affichage");
					sc.nextLine();
				} else if( i % NB_COLUMN == 2) {
					System.out.println();
				} 
			}
			}
		}
	
	public int returnInteger() {
		int integer;
		try {
			integer = sc.nextInt();
			sc.nextLine();
			if(integer <0) {
				System.out.println("Veuillez saisir un entier positif :");
				return returnInteger();
			}
			
		} catch (Exception e) {
			sc.nextLine();
			System.out.println("Ce n'est pas un entier, veuillez réessayer :");
			return returnInteger();
		}
		return integer;
	}
	

	
	
	
}
	


