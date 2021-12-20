package domain;

/**
 * classe homme. Dans la hierarchie chien dérive de la classe mammifere qui dérive de la classe animal
 * @author solen
 *
 */
public class Homme extends Mammifere{


	public Homme(String nom) throws AnimalException {
		super(nom);
		
	}

	@Override
	public String toString() {
		return name != null ? "Je suis un homme de nom " + name : "Je suis un homme";
	}
	

	@Override
	public void parle() {
		System.out.println("vive le polymorphisme !");
	}
	


}
