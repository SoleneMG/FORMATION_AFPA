package ventou.test;

import ventou.metier.Salarie;
import ventou.metier.SalarieException;

//////////////////////////////////////
// TEST UNITAIRE DE LA CLASSE DE BASE
//////////////////////////////////////

public class TestSalarie {

	public static void main(String[] args) {

		Salarie dupond, s2, s3;

		System.out.println("\n----------------------------------------------------");
		System.out.println("CREATION D'UN SALARIE Dupond avec un salaire de 1000\n");

		dupond = new Salarie("Dupond", 1000.0);

		System.out.println(dupond);

		System.out.println("\n--------------------------------------------");
		System.out.println("CREATION D'UN SALARIE construit sans paramètre ");
		s2 = new Salarie();
		System.out.println(s2);

		System.out.println("\n-----------------");
		System.out.println("CE DERNIER DEMISSIONNE\n ");
		s2.demissionne();
		System.out.println(s2);

		System.out.println("\n------------------------------");
		System.out.println("CREATION D'UN salarie s3  à l'image de dupond\n ");

		s3 = new Salarie( dupond.getNom(), 0.0);
		s3.setEtatActivite(dupond.isEtatActivite());
		
		System.out.println(s3);
		
		System.out.println("\n------------------------------");
		System.out.println("s3 est-il égal à dupond?\n ");
		System.out.println(s3.equals(dupond));
		
		
		System.out.println("\n------------------------------");
		System.out.println("Le hashCode de s3 est-il égal à celui de dupond?\n ");
		System.out.println(s3.hashCode() == dupond.hashCode());
		
		///////////////////////////////////////////////////////
		///////////////////////////////////////////////////////
		///////////////////////////////////////////////////////
		///////////////////////////////////////////////////////
		///////////////////////////////////////////////////////
	}
}
