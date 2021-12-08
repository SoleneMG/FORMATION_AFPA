package eval.question;

import java.util.Scanner;

public class Quest5_Intervalle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("*******************************************************************\n" + "Question 5\n"
				+ "Demander les deux intervalles [a ; b] et [c ; d]\n"
				+ "Si b < c ou bien a > d, l'intersection est vide\n"
				+ "Sinon, calculer deux variables : m (maximum de a et de c) et M (minimum de b et de d)\n"
				+ " et afficher l'intervalle [m; M]\n"
				+ "*******************************************************************\n\n\n");
		int a, b, c, d;
		int m, M;
		Scanner sc = new Scanner(System.in);
		System.out.print("Intervalle [a,b], entrer le a : ");
		a = sc.nextInt();
		System.out.print("Intervalle [a,b], entrer le b : ");
		b = sc.nextInt();
		System.out.print("Intervalle [c,d], entrer le c : ");
		c = sc.nextInt();
		System.out.print("Intervalle [c,d], entrer le d : ");
		d = sc.nextInt();
		if (b < c || d < a) {
			System.out.println("ensemble vide ");
		} else {
			if (a > c) {
				m = a;
			} else {
				m = c;
			}
			if (b > d) {
				M = d;
			} else {
				M = b;
			}
			System.out.println("["+m+";"+M+"]");
		}

		sc.close();

	}

}
