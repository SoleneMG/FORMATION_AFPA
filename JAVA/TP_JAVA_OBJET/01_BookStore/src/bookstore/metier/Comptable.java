package bookstore.metier;

public class Comptable {
	private static Comptable singleton;
	private double totalPrix;
	
	private Comptable() {
	}
	
	public void comptabilise(Livre ... unLivre ) {
			for (Livre livre : unLivre) {
				if(livre.getPrix()!=-1) {
					totalPrix +=  livre.getPrix();
				}
			}
	}

	public double getTotalPrix() {
		return totalPrix;
	}
	
	public static Comptable getInstance() {
		if(singleton==null) {
			singleton = new Comptable();
		}
		return singleton;
	}
	
	

	

}
