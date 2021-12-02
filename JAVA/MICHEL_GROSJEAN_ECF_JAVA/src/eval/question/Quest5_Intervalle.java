package eval.question;

import java.util.Scanner;

public class Quest5_Intervalle {
	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 5\n" +
"Demander les deux intervalles [a ; b] et [c ; d]\n"+
"Si b < c ou bien a > d, l'intersection est vide\n"+
"Sinon, calculer deux variables : m (maximum de a et de c) et M (minimum de b et de d)\n"+
" et afficher l'intervalle [m; M]\n"+
"*******************************************************************\n\n\n"
		);

		char[] variableTab = { 'a', 'b', 'c', 'd' };
		int[] valeurVariable = demandeLesValeurs(variableTab);
		calculInterval(valeurVariable);

		sc.close();
	}

	public static int[] demandeLesValeurs(char[] c) {
		int[] valeurVariables = new int[4];
		for (int i = 0; i < c.length; i++) {
			System.out.printf("Entrer %c : \n", c[i]);
			valeurVariables[i] = sc.nextInt();
			sc.nextLine();
		}
		return valeurVariables;
	}

	public static void calculInterval(int[] valeurVariable) {
		int a = valeurVariable[0];
		int b = valeurVariable[1];
		int c = valeurVariable[2];
		int d = valeurVariable[3];
		int m = 0, M = 0;

		if (b < c || d < a || b == c || d == a) {
			System.out.println("Interval vide");
			// On considère l'égalité comme interval vide

		} else {
			if (a > c) {
				m = a;
			} else {
				m = c;
			}

			if (b > d) {
				M = b;
			} else {
				M = d;
			}
		}
		if(m!=0 && M!=0) {
		System.out.println("[" + m + ";" + M + "]");
		}
	}

}
