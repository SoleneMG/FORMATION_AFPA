package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import domain.Animal;
import domain.Chien;
import domain.Homme;
import domain.Mammifere;

public class TestAnimals {
	public static void main(String[] args) {
		Animal[] animaux = v2();
		//testInstanceOf(animaux);
		testLaMethodeParler(animaux);

	}
	
	public static void testLaMethodeParler(Animal[] animaux) {
		animaux[2].parle(); 
		for (Animal animal : animaux) {
			System.out.print(animal.getName()+" parle :");
			animal.parle();
		}
//		List<Animal> animauxList = Arrays.asList(animaux);
//		animauxList.stream().map(animal -> animal.getName()).forEach(System.out::print);
//		animauxList.stream().forEach(Animal::parle);
	}

	
	public static void testInstanceOf(Animal[] animaux) {
		System.out.println(animaux[2] instanceof Homme);
		System.out.println(animaux[2] instanceof Chien);
		System.out.println(animaux[2] instanceof Mammifere);
		System.out.println(animaux[2] instanceof Animal);
		System.out.println(animaux[2].getClass());
	}

	public static Animal[] v1() {
		Animal[] animaux = new Animal[5];
		animaux[0] = new Animal("Truc");
		animaux[1] = new Chien("Medor");
		animaux[2] = new Homme("Robert");

		for (Animal animal : animaux) {
			System.out.println(animal);
		}
		return animaux;
		 
	}

	public static Animal[] v2() {
		Animal[] animaux = { new Animal("Truc"), new Chien("Medor"), new Homme("Robert") };

		List<Animal> animauxList = Arrays.asList(animaux);
		animauxList.stream().forEach(System.out::println);
		
		return animaux;
	}

}
