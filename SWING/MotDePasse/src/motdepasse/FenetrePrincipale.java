package motdepasse;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FenetrePrincipale extends JFrame {

	private String title = "Mot de passe";

	private JPanel contentPane;
	private GridBagConstraints constraints;

	private JTextField txtPasswordDest;
	private JPasswordField txtPassword;
	JButton cmdClear;
	JButton cmdVisualize;

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
		setContentPane(contentPane);
		contentPane.setLayout(new GridBagLayout());
		constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 0, 5, 10); // top, left, bottom, right

		init();
		setControls();
	}

	public void init() {
		displaylblEnterPassword();
		displaytxtPassword();
		displayCmdVisualize();
		displaytxtPasswordDest();
		displayCmdClear();
	}

	private void displaylblEnterPassword() {
		JLabel lblEnterPassword = new JLabel("Tapez votre mot de passe");
		constraints.gridy = 0;
		constraints.ipady = 10;
		constraints.anchor = GridBagConstraints.LINE_START;
		constraints.fill = GridBagConstraints.EAST;
		contentPane.add(lblEnterPassword, constraints);
	}

	private void displaytxtPassword() {
		txtPassword = new JPasswordField(20);
		constraints.gridy = 1;
		constraints.gridx = 0;
		contentPane.add(txtPassword, constraints);
	}

	private void displayCmdVisualize() {
		cmdVisualize = new JButton("Visualiser");
		cmdVisualize.setMnemonic('V');
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.ipadx = 20;
		constraints.ipady = 3;
		contentPane.add(cmdVisualize, constraints);
	}

	private void displaytxtPasswordDest() {
		txtPasswordDest = new JTextField(20);
		txtPasswordDest.setEditable(false);
		txtPasswordDest.setFocusable(false);
		constraints.gridy = 2;
		constraints.gridx = 0;
		constraints.ipady = 10;
		constraints.ipadx = 2;
		contentPane.add(txtPasswordDest, constraints);
	}

	private void displayCmdClear() {
		cmdClear = new JButton("Effacer");
		cmdClear.setMnemonic('E');
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.ipadx = 35;
		constraints.ipady = 3;
		contentPane.add(cmdClear, constraints);
	}

	private void setControls() {
		cmdClearListener();
		cmdVisualizeListener();
		contentPaneListener();
		txtPasswordListener();
	}
	
	private class CmdKeyListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
		
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				if(e.getSource()== cmdVisualize) {
				String password = new String(txtPassword.getPassword());
				txtPasswordDest.setText(password);
				txtPassword.setFocusable(true);
				txtPassword.requestFocus();
				} else if(e.getSource()==cmdClear) {
					txtPassword.setText("");
					txtPasswordDest.setText("");
					txtPassword.setFocusable(true);
					txtPassword.requestFocus();
				}
			}
			
		}
		
	}
	private void cmdClearListener() {
		cmdClear.addKeyListener(new CmdKeyListener());
		cmdClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtPassword.setText("");
				txtPasswordDest.setText("");
				txtPassword.requestFocus();

			}
		});
	}
	
	private void contentPaneListener() {
		contentPane.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()=='E') {
					cmdClear.requestFocus();
				} else if ((e.getKeyCode()=='V') ) {
					cmdVisualize.requestFocus();
				}
				
			}
		});
		contentPane.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				txtPassword.setFocusable(false);

			}
		});
	}
	
	private void cmdVisualizeListener() {
		cmdVisualize.addKeyListener(new CmdKeyListener());
		cmdVisualize.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String password = new String(txtPassword.getPassword());
				txtPasswordDest.setText(password);

			}
		});
	}
	
	private void txtPasswordListener() {
		txtPassword.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				txtPassword.setFocusable(true);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				txtPassword.setFocusable(true);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				txtPassword.setFocusable(true);

			}
		});

		txtPassword.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String password = new String(txtPassword.getPassword());
					txtPasswordDest.setText(password);
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}
}
