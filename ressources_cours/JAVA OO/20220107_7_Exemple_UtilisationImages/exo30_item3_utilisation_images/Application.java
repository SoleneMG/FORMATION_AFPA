/*
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */

package exo30_item3_utilisation_images;


import javax.swing.*;


/**
 * @author xavier
 *
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class Application {
	Application()
	{
		FenetrePrincipale fen= new FenetrePrincipale();
		fen.setVisible(true);
	}
	
	public static void main(String[] args) throws Exception{
		
		try {
			//d�finition du L&F
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		new Application();
		System.out.println("Je suis passe par la !");
	}
	
}
