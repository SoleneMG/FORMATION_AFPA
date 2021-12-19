package domain;

import java.io.Serializable;

public abstract class Mammifere extends Animal implements Serializable{

	private static final long serialVersionUID = 1L;

	public Mammifere(String nom) {
		super(nom);
	}
	
	

}
