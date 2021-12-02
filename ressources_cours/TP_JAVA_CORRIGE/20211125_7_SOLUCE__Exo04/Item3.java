/**
 * Objectif: Mise en oeuvre de boucles imbriquées.<p>
 *
 * Détermination des 100 premiers nombres premiers
 *
 * @author AFPA
 * @version 1.0 du 30/05/2001
 */ 


public class Premier{

	public static final int debut = 2;
	public static final int fin   = 100;

	public static void main (String arg [])
	{
		System.out.println ("Nombre premier de " + debut + " a " + fin);
		for (int nb = debut; nb <= fin; nb++) {
			int i = nb - 1;
			while ((i >= 2) && (nb % i != 0)) i--;
			if (i == 1) System.out.print (" " + nb);
		}			
		System.out.println (" ");
	}
}