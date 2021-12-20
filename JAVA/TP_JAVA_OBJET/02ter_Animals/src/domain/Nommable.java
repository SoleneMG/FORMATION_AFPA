package domain;

/**
 * interface Nommable
 * @author solen
 *
 */
public interface Nommable {
	public String getName();
	
	/**
	 * interface fonctionnelle
	 * @param nom
	 */
	public default void setName(String nom) {
		setName(nom);
	};
}
