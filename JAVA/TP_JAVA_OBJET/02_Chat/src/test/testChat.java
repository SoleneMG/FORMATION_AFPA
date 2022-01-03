package test;

import java.util.ArrayList;
import java.util.List;

import domain.Chat;
import fr.aragot.animal.domain2.Animal;
import fr.aragot.animal.domain2.Chien;
import fr.aragot.animal.domain2.Homme;

public class testChat {
	
	public static void main(String[] args) {
		List<Animal> animaux = initAnimalList();
		displayAnimalTalking(animaux);
		
		

	}
	
	/** fait parler la liste d'animaux passé en paramètre
	 * @param animaux
	 */
	public static void displayAnimalTalking(List<Animal> animaux) {
		for (Animal animal : animaux) {
			System.out.print(animal.getNom() + " parle :");
			animal.parle();
		}
	}
	
	/**
	 * créer une liste d'animaux
	 * @author solen
	 */
	public static List<Animal> initAnimalList() {
		List<Animal> animauxList = new ArrayList<>();
		animauxList.add(new Animal("Truc"));
		animauxList.add(new Chien("Medor"));
		animauxList.add(new Homme("Robert"));
		animauxList.add(new Chat("Felix"));
		return animauxList;
	}
	

}
