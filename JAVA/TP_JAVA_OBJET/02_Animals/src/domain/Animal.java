package domain;

public class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name != null ? "Je suis un animal de nom " + name : "Je suis un animal";
	}
	
	public void parle() {
		System.out.println("brrrrrrrrrrrrrrr");
	}

}
