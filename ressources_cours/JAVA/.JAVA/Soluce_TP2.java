
import java.util.Scanner;

public class Soluce_TP2 {

	public static void main(String[] args) {

		///////////////////////////////////////////////////////////
		// CORRECTION DU TP N 2
		//////////////////////////////////////////////////////////
		System.out.print("Entrez la limite de la boucle :");
		@SuppressWarnings("resource")
		int limite = (new Scanner(System.in)).nextInt();
		for( int j=1; j<=limite ; j++ ) {
			
			//System.out.println( "\t" + j + "\t" + Math.pow(j,2) + "\t" + Math.sqrt( j));
			
			System.out.println( "\t" + j + "\t" + (int )Math.pow(j,2) + "\t" + String.format("%.7f", Math.sqrt( j)) );
			
			System.out.printf( "\t%d\t%d\t%.7f\n" , j , (int)Math.pow(j,2) ,  Math.sqrt( j) );
	
		///////////////////////////////////////////////////////////
		// POUR une documentation sur les formats du printf,
		// voir la javadoc de la classe Formatter
		//////////////////////////////////////////////////////////
			
		}
	}
}
