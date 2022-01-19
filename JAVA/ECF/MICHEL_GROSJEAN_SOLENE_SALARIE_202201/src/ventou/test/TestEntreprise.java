package ventou.test;
import ventou.metier.*;
/* Mise en oeuvre d'une association */
public class TestEntreprise {
public static void main( String [] args ) {

	System.out.println ("CREATION De PLUSIEURS CV ");
	System.out.println( "------------------------\n");
	
	Cv cv1 = new Cv("ARPEGE", "Bac");
	Cv cv2 = new Cv("AFPA", "Licence");
	Cv cv3 = new Cv();
	
	System.out.println ("CREATION De PLUSIEURS TYPE DE SALARIES ");
	System.out.println( "--------------------------------------\n");
	
	Commercial c1 = new Commercial("Commercial1", 800, 10_000);
	Commercial c2 = new Commercial("Commercial2", 500, 1_000);
	Commercial c3 = new Commercial();
	
	Salarie s1 = new Salarie("Salarie1", 600, -10);
	Salarie s2= new Salarie("Salarie2", 1_500);
	Salarie s3 = new Salarie();

	
	System.out.println ("CREATION D'UNE ENTREPRISE ");
	System.out.println( "-------------------------\n");
	
	Entreprise e = new Entreprise("AFPA");

	
	System.out.println ("affectez les CV à différents types de salariés");
	System.out.println( "---------------------------------------------\n");
	
	c1.setCv(cv1);
	s1.setCv(cv2);
	s2.setCv(cv3);


	System.out.println ("affectez les salariés à l'entreprise");
	System.out.println( "------------------------------------\n");
	
	e.addSalarie(s1);
	e.addSalarie(s2);
	e.addSalarie(s3);
	e.addSalarie(c1);
	e.addSalarie(c2);
	e.addSalarie(c3);

	System.out.println ("Affichez les informations sur l'entreprise");
	System.out.println( "-------------------------\n");
	
	System.out.println(e);
}}