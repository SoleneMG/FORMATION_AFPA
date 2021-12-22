package bookstore.metier;

public class BiblioException extends Exception {

	public BiblioException() {
		super("Exception de type générale");
	}

	public BiblioException(String message) {
		super(message);
	}
	

}
