package domain;

public class Homme extends Mammifere{

	public Homme() {
		super();

	}

	public Homme(String nom) {
		super(nom);
		
	}

	@Override
	public String toString() {
		return name != null ? "Je suis un homme de nom " + name : "Je suis un homme";
	}


}
