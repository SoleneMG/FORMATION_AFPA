package domain;

/**
 * classe chien. Dans la hierarchie chien dérive de la classe mammifere qui dérive de la classe animal
 * @author solen
 *
 */
public class Chien extends Mammifere{

	public Chien(String nom) throws AnimalException {
		super(nom);

	}
	
	
	@Override
	public String toString() {
		return name != null ? "Je suis un chien de nom " + super.name : "Je suis un chien";
	}


	/**
	 * le chien fait waouf waouf
	 */
	@Override
	public void parle() {
		System.out.println("waouf waouf");
	}
	
	

}
