package darman.part5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.NotCompliantMBeanException;

public class Exo5_10 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * �crire un algorithme qui permette de conna�tre ses chances de gagner au
	 * tierc�, quart�, quint� et autres imp�ts volontaires. 
	 * On demande � l�utilisateur le nombre de chevaux partants, et le nombre de chevaux jou�s.
	 * Les deux messages affich�s devront �tre : 
	 * Dans l�ordre : une chance sur X de gagner 
	 * Dans le d�sordre : une chance sur Y de gagner 
	 * X et Y nous sont donn�s par la formule suivante, si n est le nombre de chevaux partants 
	 * et p le nombre de chevaux jou�s (on rappelle que le signe ! signifie "factorielle",
	 * comme dans l'exercice 5.7 ci-dessus) : 
	 * X = n ! / (n - p) ! 
	 * Y = n ! / (p ! * (n � p) !) 
	 * NB : cet algorithme peut �tre �crit d�une mani�re simple, mais
	 * relativement peu performante. Ses performances peuvent �tre singuli�rement
	 * augment�es par une petite astuce. Vous commencerez par �crire la mani�re la
	 * plus simple, puis vous identifierez le probl�me, et �crirez une deuxi�me
	 * version permettant de le r�soudre.
	 */

	public static void main(String[] args) {
		
		System.out.println("Nombre de chevaux partants :");
		int nbPartants = sc.nextInt();
		sc.nextLine();
		System.out.println("Nombre de chevaux jou�s :");
		int nbJoues = sc.nextInt();
		sc.nextLine();
		
		
		
		long chanceDeGagnerDansLOrdre =  calculFactorielle(nbPartants) / calculFactorielle(nbPartants - nbJoues);
		long chanceDeGagnerDansLeDesordre = calculFactorielle(nbPartants) / ( calculFactorielle(nbJoues) * (calculFactorielle(nbPartants - nbJoues)));
		
		System.out.printf("Dans l'ordre : une chance sur %d de gagner\n", chanceDeGagnerDansLOrdre);
		System.out.printf("Dans le d�sordre : une chance sur %d de gagner\n", chanceDeGagnerDansLeDesordre);
		
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
