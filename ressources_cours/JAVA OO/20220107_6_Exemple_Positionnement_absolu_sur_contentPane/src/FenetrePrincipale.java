package exo31_0demoXH_LOGIN;

import javax.swing.*;

/*
 *
 * Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */

/**
 * @author afpa
 *
 * Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
public class FenetrePrincipale extends JFrame {
	
	JLabel lblLogin = new JLabel("Le login");
	JLabel lblPwd = new JLabel("Le Mot de Passe");
	JTextField txtLogin = new JTextField();
	JTextField txtPwd = new JTextField();
	JButton cmdOk = new JButton("OK");
	JButton cmdAnnuler = new JButton("ANNULER");
	
	public FenetrePrincipale()
	{
		super("Saisie du login");
		System.out.println("Constructeur");
		// Methodes qui initialisent la fenetre
		//this.setSize(500,300);
		this.setSize(450,200);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		initControles ();
		
	}
	
	private void initControles() {
		JPanel zc = (JPanel) this.getContentPane();

		zc.setLayout(null);
		
		//lblLogin.setSize(100,20);
		lblLogin.setSize(80,20);
		lblLogin.setLocation(5,50);
		//lblLogin.setFont()
		
		lblPwd.setSize(80,20);
		lblPwd.setLocation(5,100);
		
		txtLogin.setBounds(100,50,200,20);
		
		txtPwd.setBounds(100,100,200,20);

		cmdOk.setBounds(350,50,80,40);
		
		cmdAnnuler.setBounds(350,100,80,40);
		
		//zc.add(new JLabel("Le login"));
		zc.add(lblLogin);
		zc.add(lblPwd);
		zc.add(txtLogin);
		zc.add(txtPwd);
		zc.add(cmdOk);
		zc.add(cmdAnnuler);
	
		//zc.setBorder( BorderFactory.createEmptyBorder(10,10,10,10));
	}
}
