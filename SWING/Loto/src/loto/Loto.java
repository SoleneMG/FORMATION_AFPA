package loto;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Loto extends JFrame {
	private String title = "Française des jeux";
	
	/**
	 * Components variables
	 */
	JLabel lblDayOfDraw;
	JLabel lblAmountOfJackpot;
	JLabel lblWinner;
	JLabel lblResult;
	JLabel lblLifeball;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loto frame = new Loto();
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
	public Loto() {
		setMinimumSize(new Dimension(100, 100));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle(title);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JLabel blueCircle1 = new CirclePane();

		JPanel gridLayout = new JPanel(new BorderLayout());
		gridLayout.add(blueCircle1);

		contentPane.add(gridLayout, BorderLayout.CENTER);
		initControls();
		
	}
	
	//4e ; 1er numero
	
	private void initControls() {
		//label.setFont(new Font("Serif", Font.BOLD, 36));
		 lblDayOfDraw = new JLabel("Tirage du %d %s %d, 10, janvier, 2022");
		 lblAmountOfJackpot = new JLabel("Jackpot de %d millions d'euros", 4);
		 lblWinner = new JLabel("Non remporté");
		 lblResult = new JLabel("Résultats Loto");
		 lblLifeball = new JLabel("numéro chance");
		
	}

}
