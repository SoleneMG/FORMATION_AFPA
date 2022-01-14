/*
 *
 * TODO Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */

package exo30_item3_utilisation_images;


import javax.swing.*;


/**
 * @author xavier
 *
 * TODO Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
public class Application {
	Application()
	{
		FenetrePrincipale fen= new FenetrePrincipale();
		fen.setVisible(true);
	}
	
	public static void main(String[] args) throws Exception{
		
		try {
			//définition du L&F
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		new Application();
		System.out.println("Je suis passe par la !");
	}
	
}
