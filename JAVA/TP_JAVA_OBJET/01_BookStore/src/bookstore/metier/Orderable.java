package bookstore.metier;

public interface Orderable<T> extends Comparable<T>{

	public default boolean plusGros(T other) {
		return compareTo(other)>0;
	}
	
	public default boolean plusPetit(T other) {
		return compareTo(other)<0;
	}
	
	public default boolean egal(T other) {
		return compareTo(other)==0;
	}

	public default boolean titreApres(T other) {
		return compareTo(other)>0;
	}
	
	public default boolean titreAvant(T other) {
		return compareTo(other)<0;
	}
	
}
