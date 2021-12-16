package domain;

public class Chien extends Mammifere{

	public Chien() {
		super();
	}

	public Chien(String nom) {
		super(nom);

	}
	
	@Override
	public String toString() {
		return name != null ? "Je suis un chien de nom " + super.name : "Je suis un chien";
	}

}
