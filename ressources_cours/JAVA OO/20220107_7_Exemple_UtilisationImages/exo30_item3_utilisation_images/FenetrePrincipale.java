
package exo30_item3_utilisation_images;

//import java.awt.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

/**
 * @author xavier
 *
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class FenetrePrincipale extends JFrame {
	private static final long serialVersionUID = 4458092230362450375L;
	
	private ImageIcon imgFond;
	private ImageIcon imgIcone;

	private int m_nb = 0;

	public FenetrePrincipale ()
	{
		super("Application de dessin");
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE );
		
		//File fichierUtilise = new File("..//shadock.txt");
		imgIcone = new ImageIcon("logo.gif");
		
		//On remplace la tasse de café  dans la barre des titres
		this.setIconImage( imgIcone.getImage());
		
		imgFond = new ImageIcon("amoi.gif");		
		
	}
	/* (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		//On appelle la m�thode de la classe m�re
		super.paint(g);
		
		//On ajoute notre touche personnelle

		int x = ( this.getWidth() - imgFond.getIconWidth() ) / 2;
		int y = ( this.getHeight() - imgFond.getIconHeight() ) / 2;

		//g.drawImage(
		
		g.drawImage( imgFond.getImage() , x , y , this );
		g.drawString( "La m�thode paint a �t� appel� :", 10 , this.getHeight() - 10 );
		g.setFont(  new Font( null, Font.BOLD, 14 ));
		g.setColor(Color.RED);
		g.drawString( m_nb++ + "fois", 200, this.getHeight() - 10);
	}

}
