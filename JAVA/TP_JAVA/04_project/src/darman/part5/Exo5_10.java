package darman.part5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.NotCompliantMBeanException;

public class Exo5_10 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Écrire un algorithme qui permette de connaître ses chances de gagner au
	 * tiercé, quarté, quinté et autres impôts volontaires. 
	 * On demande à l’utilisateur le nombre de chevaux partants, et le nombre de chevaux joués.
	 * Les deux messages affichés devront être : 
	 * Dans l’ordre : une chance sur X de gagner 
	 * Dans le désordre : une chance sur Y de gagner 
	 * X et Y nous sont donnés par la formule suivante, si n est le nombre de chevaux partants 
	 * et p le nombre de chevaux joués (on rappelle que le signe ! signifie "factorielle",
	 * comme dans l'exercice 5.7 ci-dessus) : 
	 * X = n ! / (n - p) ! 
	 * Y = n ! / (p ! * (n – p) !) 
	 * NB : cet algorithme peut être écrit d’une manière simple, mais
	 * relativement peu performante. Ses performances peuvent être singulièrement
	 * augmentées par une petite astuce. Vous commencerez par écrire la manière la
	 * plus simple, puis vous identifierez le problème, et écrirez une deuxième
	 * version permettant de le résoudre.
	 */

	public static void main(String[] args) {
		
		System.out.println("Nombre de chevaux partants :");
		int nbPartants = sc.nextInt();
		sc.nextLine();
		System.out.println("Nombre de chevaux joués :");
		int nbJoues = sc.nextInt();
		sc.nextLine();
		
		
		
		long chanceDeGagnerDansLOrdre =  calculFactorielle(nbPartants) / calculFactorielle(nbPartants - nbJoues);
		long chanceDeGagnerDansLeDesordre = calculFactorielle(nbPartants) / ( calculFactorielle(nbJoues) * (calculFactorielle(nbPartants - nbJoues)));
		
		System.out.printf("Dans l'ordre : une chance sur %d de gagner\n", chanceDeGagnerDansLOrdre);
		System.out.printf("Dans le désordre : une chance sur %d de gagner\n", chanceDeGagnerDansLeDesordre);
		
		sc.close();
	}

	public static long calculFactorielle(int number) {
		long result =1;
		for (int i =1; i<=number; i++) {
			result *=i;
		}
		return result;
	}

}
