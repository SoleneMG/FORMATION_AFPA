package domain;

public class Animal implements Nommable, Comparable<Animal> {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;

	}

	@Override
	public String toString() {
		return name != null ? "Je suis un animal de nom " + name : "Je suis un animal";
	}

	public void parle() {
		System.out.println("brrrrrrrrrrrrrrr");
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Animal other) {
		byte name[] = this.name.getBytes();
		byte otherName[] = other.name.getBytes();
		int length = name.length < otherName.length ? name.length : otherName.length;
		for (int i = 0; i < otherName.length; i++) {
			if (this.name.charAt(i) == other.name.charAt(i)) {
				continue;
			} else if (this.name.charAt(i) < other.name.charAt(i)) {
				return -1;
			} else if (this.name.charAt(i) > other.name.charAt(i)) {
				return 1;
			}

		}
		return 1_000;
		//ne dois pas passer par là
	}
	


}
