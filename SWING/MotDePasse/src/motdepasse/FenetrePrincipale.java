package motdepasse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class FenetrePrincipale extends JFrame {
	
	private String title = "Mot de passe";

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale frame = new FenetrePrincipale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FenetrePrincipale() {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton cmdVisualize = new JButton("Visualiser");
		cmdVisualize.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(cmdVisualize, BorderLayout.CENTER);
		
		JPanel borderLayoutRight = new JPanel();
		borderLayoutRight.setForeground(Color.LIGHT_GRAY);
		contentPane.add(borderLayoutRight, BorderLayout.EAST);
		borderLayoutRight.setLayout(new BorderLayout(10, 10));
	}

}
