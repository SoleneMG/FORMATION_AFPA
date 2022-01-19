package ventou.test;

import ventou.metier.Cv;
import ventou.metier.Salarie;
import ventou.metier.SalarieException;

/* Mise en oeuvre d'une association 1-1 bi-directionnelle*/
public class TestCv {

	public static void main(String[] args) {

		System.out.println("CREATION De PLUSIEURS CV ");
		System.out.println("------------------------\n");

		Cv cv1 = new Cv("derniereEntreprise1", "niveauEtude1");
		Cv cv2 = new Cv("derniereEntreprise2", "niveauEtude2");
		Cv cv3 = new Cv("derniereEntreprise3", "niveauEtude3");

		System.out.println("CREATION De PLUSIEURS TYPE DE SALARIES ");
		System.out.println("--------------------------------------\n");

		Salarie salarie1 = new Salarie("salarie1", 1000.0);
		Salarie salarie2 = new Salarie("salarie2", 2000.0);
		Salarie salarie3 = new Salarie("salarie3", 3000.0);

		System.out.println("affectez les CV à différents types de salariés");
		System.out.println("---------------------------------------------\n");

		try {
			cv1.setSalarie(salarie1);
			cv2.setSalarie(salarie2);
			cv3.setSalarie(salarie3);
			cv1.setSalarie(salarie3);
			System.err.println("Probleme de la methode cv.setSalarie");
		} catch (SalarieException e) {
			System.out.println(e);
		}
		System.out.println();

		try {
			salarie1.setCv(cv3);
			System.err.println("Probleme de la methode salarie.setCv");
		} catch (SalarieException e) {
			System.out.println(e);
		}
		System.out.println();

		System.out.println("Affichez tous les salariés");
		System.out.println("-------------------------\n");

		System.out.println(salarie1);
		System.out.println(salarie2);
		System.out.println(salarie3);
		System.out.println();

		System.out.println(cv1);
		System.out.println(cv2);
		System.out.println(cv3);
		System.out.println();

	}
}