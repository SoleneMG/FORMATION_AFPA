package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import domain.Animal;
import domain.Chien;
import domain.Homme;

public class TestAnimals {
	public static void main(String[] args) {
		v2();

	}

	public static void v1() {
		Animal[] animaux = new Animal[5];
		animaux[0] = new Animal("Truc");
		animaux[1] = new Animal();
		animaux[2] = new Chien("Medor");
		animaux[3] = new Homme();
		animaux[4] = new Homme("Robert");

		for (Animal animal : animaux) {
			System.out.println(animal);
		}
	}

	public static void v2() {
		Animal[] animaux = { new Animal("Truc"), new Animal(), new Chien("Medor"), new Homme(), new Homme("Robert") };

		List<Animal> animauxList = Arrays.asList(animaux);
		animauxList.stream().forEach(System.out::println);
	}

}
