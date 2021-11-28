package darman.part6;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exo6_11_LeSchtroumpf {

	/**
	 * Toujours à partir de deux tableaux précédemment saisis, écrivez un algorithme
	 * qui calcule le schtroumpf des deux tableaux. Pour calculer le schtroumpf, il
	 * faut multiplier chaque élément du tableau 1 par chaque élément du tableau 2,
	 * et additionner le tout. Par exemple si l'on a : 
	 * 
	 * Tableau 1 : 4 8 7 12
	 * 
	 * Tableau 2 : 3 6
	 * 
	 * Le Schtroumpf sera : 
	 * 3 * 4 + 3 * 8 + 3 * 7 + 3 * 12 + 6 * 4 + 6 * 8 + 6 * 7 + 6 * 12 = 279
	 */

	public static void main(String[] args) {
		int i1 = 0;
		int i2 = 0;
		int total = 0;
		int[] board1 = { 4, 8, 7, 12 };
		int[] board2 = { 3, 6 };
		
		for (i2=0;i2<board2.length;i2++) {
			for (i1=0;i1<board1.length;i1++) {
				total += board2[i2]*board1[i1];
			}
		}
		/* OU 
		 * for (i2=0;i2<board2.length;i2++) { 
		 * i1=0; 
		 * do { total += board2[i2]*board1[i1];
		 * i1++; 
		 * } while (i1<board1.length); 
		 * }
		 */
		System.out.println("Le Schtroumpf sera = "+total);

	}

}
