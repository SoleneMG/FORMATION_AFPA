package domain;

/**
 * Classe m�re qui impl�mente deux interfaces Nommable et Comparable
 * @author solen
 *
 */

public class Animal implements Nommable, Comparable<Animal> {
	/** nom de l'animal	 */
	protected String name;

	
	/**
	 * constructeur qui prend le nom de l'animal en param�tre pour cr�er la classe
	 * @param name 
	 * @throws AnimalException 
	 */
	public Animal(String name) throws AnimalException {
		if(name.length()>15) {
			throw new AnimalException("nom d�passant les 15 caract�res");
		} else {
			this.name = name;
		}
		
	}

	/**
	 * red�finition de l'affichage
	 */
	@Override
	public String toString() {
		return name != null ? "Je suis un animal de nom " + name : "Je suis un animal";
	}

	/**
	 * par d�faut l'animal parle "brrrrrrrrrrrrrr"
	 */
	public void parle() {
		System.out.println("brrrrrrrrrrrrrrr");
	}

	/**
	 * m�thode qui compare deux animaux sur leurs noms dans l'ordre alphab�tique.
	 */
	@Override
	public int compareTo(Animal other) {
		byte name[] = this.name.getBytes();
		byte otherName[] = other.name.getBytes();
		int length = name.length < otherName.length ? name.length : otherName.length;
		for (int i = 0; i < length; i++) {
			if (this.name.charAt(i) == other.name.charAt(i)) {
				continue;
			} else if (this.name.charAt(i) < other.name.charAt(i)) {
				return -1;
			} else if (this.name.charAt(i) > other.name.charAt(i)) {
				return 1;
			}

		}
		System.out.println("ne doit pas passer par l�");
		return 1_000;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	


}
