package test;

import java.util.ArrayList;
import java.util.List;

import domain.Animal;
import domain.Chat;
import domain.Chien;
import domain.Homme;

public class testChat {
	
	public static void main(String[] args) {
		Chat felix = new Chat("Felix");
		// question 2
		System.out.println(felix);
		
		// question 4
		felix.parle();

	}
	
	/**
	 * Question 3
	 * @author solen
	 */
	public static List<Animal> testCollectionInsteadOfBoard() {
		System.out.println("**************************************************************************");
		System.out.println("Utiliser une collection de type \"ensemble ordonné\" à la place du tableau");
		System.out.println("**************************************************************************");
		List<Animal> animauxList = new ArrayList<>();
		animauxList.add(new Animal("Truc"));
		animauxList.add(new Chien("Medor"));
		animauxList.add(new Homme("Robert"));
		animauxList.add(new Chat("Felix"));
		return animauxList;
	}
	

}
