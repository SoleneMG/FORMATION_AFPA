package ventou.metier;

@SuppressWarnings("serial")
public class SalarieException extends Exception {

	public SalarieException() {
		super("Erreur g�n�rale � la classe Salari�");
	}

	public SalarieException(String message) {
		super(message);
	}
	
	public static void main(String[] args) {
		SalarieException e = new SalarieException();
		System.out.println(e);
		SalarieException e1 = new SalarieException("error");
		System.out.println(e1
				);
	}
	
	

}
