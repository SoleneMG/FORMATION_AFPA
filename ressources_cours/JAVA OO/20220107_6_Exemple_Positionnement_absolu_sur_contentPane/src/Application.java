package exo31_0demoXH_LOGIN;
/*
 *
 * Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */


import javax.swing.*;

/**
 * @author stagiairebleu
 *
 * Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
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
