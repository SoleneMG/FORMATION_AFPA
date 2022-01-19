package ventou.metier;

@SuppressWarnings("serial")
public class SalarieException extends Exception {
	
	public SalarieException(String message) {
		super(message);
	}

	public SalarieException() {
		super("Probl�me g�n�rique sur l'applicatif des salaries");
	}

	public static void main(String[] args) {
		System.out.println(new SalarieException("Mauvaise salarie !"));
		System.out.println(new SalarieException());
	}

}
