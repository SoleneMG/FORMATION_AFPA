package domain;

/**
 * classe qui gère les exceptions liées à la classe mère Animal et à ses filles.
 * @author solen
 *
 */
public class AnimalException extends Exception {

	private static final long serialVersionUID = 4980914764823237914L;

	
	public AnimalException() {
		super("Animal exception");
	}
	
	public AnimalException(String message) {
		super(message);
	}
}
