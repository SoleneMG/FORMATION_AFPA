package domain;
import fr.aragot.animal.domain2.*;

public class Chat extends Mammifere{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Chat(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Je suis un chat de nom "+this.getNom();
	}

	@Override
	public void parle() {
		System.out.println(this.getNom()+" parle: miaou miaou");
	}
	
	

}
