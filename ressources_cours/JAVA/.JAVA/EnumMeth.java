package ex2.chap09_enum.EnumMeth;

public class EnumMeth {
	public static void main(String args[]) {
		System.out.println("Noms des valeurs du type jour");
		for (Jour j : Jour.values())
			System.out.println(j + " : " + j.affiche());
	}
}

enum Jour {
	lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche;
	void affiche() {
		System.out.println(this.toString());
	}
}
