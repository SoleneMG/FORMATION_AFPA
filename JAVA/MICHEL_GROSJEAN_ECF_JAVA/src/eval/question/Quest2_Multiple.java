package eval.question;

import java.util.Scanner;

public class Quest2_Multiple {
	static Scanner sc = new Scanner(System.in);

	static final int NB_COLUMN = 3;
	static final int NB_MAX_LINE_DISPLAY = 10;

	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 2\n" +
"Ecrivez un programme  qui affiche les nombres entiers multiples\n" +
" de 5 entre 1 et 20.\n" +
"Documenter la classe de ce programme avec un commentaire javadoc et générez\n"+
"la javadoc.\n"+
"*******************************************************************\n\n\n"
		);
		
		int NB_DIV = 5, MIN_VALUE = 1, MAX_VALUE= 20;
		
		displayTableOfMultiple(MIN_VALUE, MAX_VALUE, NB_DIV);

		sc.close();
	}
	
	/**
	 * Affiche la table des multiples de 5
	 */
	public static void displayTableOfMultiple(int MIN_VALUE, int MAX_VALUE, int NB_DIV) {
		for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
			if(i % NB_DIV == 0) {
				System.out.print("("+ i +")\t");
			} else {
				System.out.print(" "+ i +"\t");
			}
			}
		}
	
	

}
