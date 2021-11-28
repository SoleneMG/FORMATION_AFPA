import java.util.Scanner;

public class Item2_Char {
	/**
	 * Ecrire une application qui affiche en majuscule tous les caract�res saisis au
	 * clavier. Pr�voir une condition de sortie. La conversion en majuscule doit
	 * �tre effectu�e d'une fa�on algorithmique sans utiliser la m�thode de la
	 * classe Wrapper Character.
	 */
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Entrer une phrase �crite en minuscule :");
		String sentence= sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i)>96 && sentence.charAt(i)<123){
				int j = sentence.charAt(i);
				char c = (char) (j-32);
				sb.append(c);
			} else {
				sb.append(sentence.charAt(i));
			}
		}
		
		System.out.println(sb);
	}
}
