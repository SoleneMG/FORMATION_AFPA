package demo;
import java.util.Arrays;
import java.util.List;
/**
 * RAPPEL sur le TABLEAU D'OBJETS Integer (WRAPPER)
 * @author AFPA
 */
public class Test0_tableauObjet {

	public static void main(String[] args) {

		//Integer[] tab5  = { new Integer(67), new Integer(33) }; 
		Integer[] tab5  = { 67, 33 }; // auto-boxing Java 5

		System.out.println(" On souhaite énumèrer les objets du tableau :");
		System.out.println(" --------------------------------------------- :");
		//Visite de tous les éléments grâce à une boucle

		//JAVA1
		//Visite de tous les éléments par l'indice
		System.out.println("itération avec indice (JAVA2), Mon tableau d'Integer:");
		for(int i=0; i<tab5.length; i++) {
			System.out.print("\t indice :"+ i + "  valeur :" + (tab5[i] + 2)); //auto-unboxing !!
			System.out.println();
		}
		System.out.println();

		//JAVA5 foreach C#
		System.out.println("foreach C# (JAVA5), Mon tableau d'Integer :");
		//suivant l'ordre des indices des tableaux
		for( Integer var : tab5)
			System.out.print("\t" + (var + 2)); //auto-unboxing
		System.out.println();

		//On remplie une collection List avec le contenu du tableau
		List<Integer> listes = Arrays.asList(tab5);
		
		//JAVA8  programmation fonctionnelle
		// API Stream  appliquée aux collections
		// forEach + lambda expression
		System.out.println("programmation fonctionnelle JAVA8, Mon tableau d'Integer  :");
		listes.stream().forEach( x->System.out.println(x));
		listes.forEach( x->System.out.println(x));
		listes.forEach( System.out::println );//avec référence de méthode !

		System.out.println("\n");

	}

}
