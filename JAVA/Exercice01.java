import java.lang.*;
import java.util.*;

public class Exercice01{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entrer la limite de la boucle :");
	int max = sc.nextInt();
	sc.nextLine();
	
	for(int i =0 ; i < max ; i++){
	double nombreALaPuissanceDeux = Math.pow(i, 2);
	double racineCarre = Math.sqrt(i);
	System.out.printf(" %d élevé à la puissance 2 vaut : %f et sa racine carré est : %f", i, nombreALaPuissanceDeux, racineCarre);	
	}
	
	String chaine = "Bonjour";
	System.out.println("les 3 premiers caractères d'une chaine :" + chaine.substring(0,3).toUpperCase()); // 0 là où démarre la selection et 3 là où ça se finit mais 4e char non compris.
	// B = 0 o = 1 n = 2 j = 3 <- non pris !
	}
}