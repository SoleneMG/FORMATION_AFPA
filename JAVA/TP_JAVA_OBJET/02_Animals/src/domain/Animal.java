package domain;

public class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public Animal() {

	}

	@Override
	public String toString() {
		return name != null ? "Je suis un animal de nom " + name : "Je suis un animal";
	}

}
