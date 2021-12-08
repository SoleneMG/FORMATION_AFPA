package eval.question;

import java.util.Scanner;

public class Quest6_PrenomLongTri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 6\n" +
"Demander 5 prénoms et les stocker dans un tableau.\n" +
"Les réafficher « triés » de telle sorte que le prénom le plus long\n" +
"soit en premier etc.\n" +
"Par exemple avec Didier, Bernard, Christine, Ahn, Ali\n" +
"Le programme affichera\n" +
"Christine, Bernard, Didier, Ahn, Ali\n" +
"*******************************************************************\n\n\n"
		);
		Scanner sc = new Scanner(System.in);
		String [] tab = new String [5];
		boolean yapermute = true;
		
		System.out.println("*** Saisir 5 prenoms ***");
		for (int i = 0; i < tab.length; i++) {
			System.out.print("Saisir le prenom  "+(i+1)+" : ");
			tab[i]=sc.nextLine();
		}
		
		while(yapermute) {
			yapermute = false;
			for (int i = 0; i < tab.length -1; i++) {
				
				String s1 = tab[i];
				String s2 = tab[i+1];
				if(s1.length() < s2.length()) {
					String temp = tab[i];
					tab[i] = tab[i +1];
					tab[i +1] = temp;
					yapermute = true;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < tab.length; i++) {
			String s = tab[i];
			if(i == (tab.length - 1)){
				System.out.print(s);
			}else {
				System.out.print(s+", ");
			}
			
			
		}
		sc.close();
		
		// TODO

	}

}
