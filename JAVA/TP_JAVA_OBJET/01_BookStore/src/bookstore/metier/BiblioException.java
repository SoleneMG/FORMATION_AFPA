package bookstore.metier;

public class BiblioException extends Exception {

	public BiblioException() {
		super("Exception de type g�n�rale");
	}

	public BiblioException(String message) {
		super(message);
	}
	

}
