package domain;

public interface Nommable {
	public String getName();
	
	public default void setName(String nom) {
		setName(nom);
	};
}
