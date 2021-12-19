package test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domain.Animal;
import domain.Chien;
import domain.Homme;
import domain.Mammifere;
import domain.Nommable;

public class TestAnimals {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
//		Animal[] animaux = returnAnimalTab();
//		Nommable[] nommable = returnNommableTab();
//		testInstanceOf(animaux);
//		testLaMethodeParler(animaux);
//		Comparable[] animaux = returnComparableTab();
//		testComparable(animaux);
//		testSerializable(animaux);
//		testUpAndDownCasting();
		
	}
	
	public static void testUpAndDownCasting() {
//		Animal a = new Mammifere("unMammifere"); // passage de la classe Mammifere abstract
		Comparable<?> c = new Homme("Jean");
		Serializable s = new Chien("medor");
		
		Homme h1 = (Homme) c; //downcasting
		Homme h2 = (Homme) s; //un chien n'est pas un homme Erreur au runtime
		System.out.println(h1);
		System.out.println(h2);
	}
	
	public static void testSerializable(Animal[] animaux) {
		System.out.println(animaux[0] instanceof Serializable); // false car au dessus dans la hierarchie des classes
		System.out.println(animaux[1] instanceof Serializable); // true car en dessous dans la hierarchie des classes
	}
	
	@SuppressWarnings("unchecked")
	public static void testComparable(Comparable[] animaux) {
		System.out.println(animaux[2] instanceof Comparable);
		animaux[2] = new Chien("Robert");
		int resultCompareTo = animaux[1].compareTo(animaux[2]);
		String displayResultCompareTo = resultCompareTo<=0 ? "avant" : "après";
		System.out.println(((Animal) animaux[1]).getName() +" est "+ displayResultCompareTo+" "+((Animal) animaux[2]).getName());
		Arrays.sort(animaux);
		System.out.println(Arrays.toString(animaux));
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

	public static Animal[] returnAnimalTab() {
		Animal[] animaux = { new Animal("Truc"), new Chien("Medor"), new Homme("Robert") };

		List<Animal> animauxList = Arrays.asList(animaux);
		animauxList.stream().forEach(System.out::println);
		
		return animaux;
	}

	public static Nommable[] returnNommableTab() {
		Nommable[] animaux = { new Animal("Truc"), new Chien("Medor"), new Homme("Robert") };

		List<Nommable> animauxList = Arrays.asList(animaux);
		animauxList.stream().forEach(System.out::println);
		
		return animaux;
	}
	
	@SuppressWarnings("rawtypes")
	public static Comparable[] returnComparableTab() {
		Comparable[] animaux = { new Animal("Truc"), new Chien("Medor"), new Homme("Robert") };
//		List<Comparable<Animal>> animauxList =  Arrays.asList(animaux);
//		//List<Comparable<Animal>> animauxList = new ArrayList<Comparable<Animal>>();
//		animauxList.add(new Animal("Truc"));
//		animauxList.add(new Chien("Medor"));
//		animauxList.add(new Homme("Robert"));
//		
//		animauxList.stream().forEach(System.out::println);
//		
//		return animauxList;
		return animaux;
	}
}
