package domain;


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
		return "Je suis un chat de nom "+this.name;
	}

	@Override
	public void parle() {
		System.out.println(this.name+" parle: miaou miaou");
	}
	
	

}
