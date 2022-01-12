package exo31_0demoXH_LOGIN;
/*
 *
 * Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */


import javax.swing.*;

/**
 * @author stagiairebleu
 *
 * Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
public class Application {
	
	public Application ()
	{
		FenetrePrincipale fp = new FenetrePrincipale();
		System.out.println("appli");
		fp.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			JFrame.setDefaultLookAndFeelDecorated(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Application();
	}
}
