package darman.part5;

import java.util.Scanner;

public class Exo5_08 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire un algorithme qui demande un nombre de départ, et qui calcule sa
	 * factorielle. 
	 * NB : la factorielle de 8, notée 8 !, vaut 1 x 2 x 3 x 4 x 5 x 6
	 * x 7 x 8
	 */

	public static void main(String[] args) {
		int i = 0;
		int max = -1;
		int number = -1;
		int[] numberBoard = new int[20];
		
		while(i<20) {
		System.out.println("Entrer un nombre : ");
		numberBoard[i] = sc.nextInt();
		sc.nextLine();
		if(i == 0) {
			max = numberBoard[i];
			number = i+1;
		}
		if(numberBoard[i] > max) {
			max = numberBoard[i];
			number = i+1;
		}
		i++;
		}
	
		System.out.println("Le plus grand de ces nombres est : "+max+" \nC'était le nombre numéro "+number );

		sc.close();
	}
}
