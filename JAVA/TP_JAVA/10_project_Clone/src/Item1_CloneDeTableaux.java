import java.util.Arrays;

public class Item1_CloneDeTableaux {
	/**
	 * Ecrire une application qui initialise un tableau tab1 avec 10 entiers
	 * différents puis sauvegarde ces 10 entiers dans 10 cases d'un tableau tab2.
	 * Ajouter la valeur 10 dans chaque case du premier tableau tab1. Afficher le
	 * contenu des tableaux avant et après l'ajout. La sauvegarde se fera de 3 façon
	 * différentes.
	 * Par :
	 * une copie de référence
	 * utilisation de la méthode clone()
	 * une copie case à case
	 * 
	 * Trier le tableau tab1 et afficher le.
	 */

	static Integer[] tab1 = new Integer[10];
	static Integer[] tab2ByRef;
	static Integer[] tab2ByClone;
	static Integer[] tab2ByCopy = new Integer[10];
	
	static StringBuffer[] sbTab1 = new StringBuffer[10];
	static StringBuffer[] sbTab2ByRef;
	static StringBuffer[] sbTab2ByClone;
	static StringBuffer[] sbTab2ByCopy = new StringBuffer[10];
	

	public static void main(String[] args) {
		String afterChange = "**********************************************************"
				+ "	\n\t\tAPRES CHANGEMENT"
				+ "	\n**********************************************************";
		String beforeChange = "**********************************************************"
				+ "	\n\t\tAVANT CHANGEMENT"
				+ "	\n**********************************************************";
		
		copyPrimitiveBoard();
		
		copyMutableValueBoard();
		
		display(beforeChange, tab1, tab2ByRef, tab2ByClone, tab2ByCopy);
		display(afterChange, tab1, tab2ByRef, tab2ByClone, tab2ByCopy);
		display(beforeChange, sbTab1, sbTab2ByRef, sbTab2ByClone, sbTab2ByCopy);
		display(afterChange, sbTab1, sbTab2ByRef, sbTab2ByClone, sbTab2ByCopy);
		
	}
	
	private static void copyPrimitiveBoard() {
		
		for (int i = 0; i < tab1.length; i++) {
			tab1[i] = i;
		}
				
		tab2ByRef = tab1;
		tab2ByClone = tab1.clone();
		for (int i = 0; i < tab1.length; i++) {
			tab2ByCopy[i] = tab1[i];
		}
		System.out.println("**********************************************************");
		System.out.println("\t\tAVANT CHANGEMENT");
		System.out.println("**********************************************************");
		System.out.println("TAB 1 :" +Arrays.toString(tab1));
		System.out.println("TAB 2 par copie de référence :" +Arrays.toString(tab2ByRef));
		System.out.println("TAB 2 par clonage :" +Arrays.toString(tab2ByClone));	
		System.out.println("TAB 2 par copie de valeurs :" +Arrays.toString(tab2ByCopy));
		
		for (int i = 0; i < tab1.length; i++) {
			tab1[i] = 10;
		}
		System.out.println("**********************************************************");
		System.out.println("\t\tAPRES CHANGEMENT");
		System.out.println("**********************************************************");
		System.out.println("TAB 1 :" +Arrays.toString(tab1));
		System.out.println("TAB 2 par copie de référence :" +Arrays.toString(tab2ByRef));
		System.out.println("TAB 2 par clonage :" +Arrays.toString(tab2ByClone));	
		System.out.println("TAB 2 par copie de valeurs :" +Arrays.toString(tab2ByCopy));
	} //copyPrimitiveBoard
	
	private static void copyMutableValueBoard() {
		// init tab1
		int j = 65; // ref A table ascii
		for (int i = 0; i < sbTab1.length; i++) {
			StringBuffer sb = new StringBuffer();
			char c = (char) j;
			sbTab1[i] = sb.append(c);
			j++;
		}
		// init tab2 byRef, byClone byCopy		
		sbTab2ByRef = sbTab1;
		sbTab2ByClone = sbTab1.clone();
		for (int i = 0; i < tab1.length; i++) {
			sbTab2ByCopy[i] = sbTab1[i];
		}
		
		int k = 97; //ref a table ascii
		for (int i = 0; i < sbTab1.length; i++) {
			StringBuffer sb = new StringBuffer();
			char c = (char) k;
			sbTab1[i] = sb.replace(0, 0, ""+c);
			k++;
		}
		
	}
	
	public static <T>void display (String sentence, T[] board1, T[] board2ByRef, T[] board2ByClone, T[] board2ByCopy) {
		System.out.println(sentence);
		System.out.println("TAB 1 :" +Arrays.toString(board1));
		System.out.println("TAB 2 par copie de référence :" +Arrays.toString(board2ByRef));
		System.out.println("TAB 2 par clonage :" +Arrays.toString(board2ByClone));	
		System.out.println("TAB 2 par copie de valeurs :" +Arrays.toString(board2ByCopy));
		
		
	
	}
	
	
	
	

}
