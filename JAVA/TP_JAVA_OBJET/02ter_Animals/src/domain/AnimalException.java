package domain;

/**
 * classe qui g�re les exceptions li�es � la classe m�re Animal et � ses filles.
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
