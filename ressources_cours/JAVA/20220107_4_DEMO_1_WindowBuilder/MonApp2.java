package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MonApp2 {

	private JFrame frmConnectionAvecVotre;
	private JTextField txtPseudo;
	private JTextField txtAffichagePseudo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonApp2 window = new MonApp2();
					window.frmConnectionAvecVotre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MonApp2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConnectionAvecVotre = new JFrame();
		frmConnectionAvecVotre.setTitle("Connection avec votre pseudo");
		frmConnectionAvecVotre.setBounds(100, 100, 509, 328);
		frmConnectionAvecVotre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConnectionAvecVotre.getContentPane().setLayout(null);
		

		
		JLabel lblEnterPseudo = new JLabel("Entrez votre pseudo");
		lblEnterPseudo.setBounds(28, 25, 211, 14);
		frmConnectionAvecVotre.getContentPane().add(lblEnterPseudo);
		
		txtPseudo = new JTextField();
		txtPseudo.setBounds(180, 22, 147, 20);
		frmConnectionAvecVotre.getContentPane().add(txtPseudo);
		txtPseudo.setColumns(10);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnAnnuler.setBounds(28, 126, 104, 53);
		frmConnectionAvecVotre.getContentPane().add(btnAnnuler);
		
		JButton btnEffacer = new JButton("Effacer");
		btnEffacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPseudo.setText(null);
				txtAffichagePseudo.setText(null);
			}
		});
		btnEffacer.setBounds(159, 126, 116, 53);
		frmConnectionAvecVotre.getContentPane().add(btnEffacer);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAffichagePseudo.setText(txtPseudo.getText());
			}
		});
		btnOK.setBounds(313, 91, 104, 88);
		frmConnectionAvecVotre.getContentPane().add(btnOK);
		
		JLabel lblVoici = new JLabel("voici votre pseudo :");
		lblVoici.setBounds(55, 213, 116, 20);
		frmConnectionAvecVotre.getContentPane().add(lblVoici);
		
		txtAffichagePseudo = new JTextField();
		txtAffichagePseudo.setBounds(213, 213, 170, 28);
		frmConnectionAvecVotre.getContentPane().add(txtAffichagePseudo);
		txtAffichagePseudo.setColumns(10);
	}
}
