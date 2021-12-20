package domain;

import java.io.Serializable;

/**
 * classe mammifere, fille de la classe animal
 * implémente une interface Serializable
 * @author solen
 *
 */
public class Mammifere extends Animal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Mammifere(String nom) throws AnimalException {
		super(nom);
	}
	
	

}
