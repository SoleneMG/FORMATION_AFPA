package achat.metier;

@SuppressWarnings("serial")
public class AchatException extends Exception {
	
	public AchatException() {
		super("Exception générale");
	}
	
	public AchatException(String message) {
		super(message);
	}
	

	public static void main(String[] args) {
		AchatException e = new AchatException("error");
		System.out.println("Exception non contrôlée :"+e);
	}
}
