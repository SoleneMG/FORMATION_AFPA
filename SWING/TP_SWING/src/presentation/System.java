package presentation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class System extends JFrame {

	private JPanel contentPane;
	private JPanel lblgridLayout;
	private JPanel txtgridLayout;
	private JPanel borderLayout;
	private JLabel lblIcon;
	private JLabel lblComputerName;
	private JLabel lblIpAdress;
	private JLabel lblUser;
	private JLabel lblOsName;
	private JLabel lblVirtualMachine;
	private JTextField txtComputerName;
	private JTextField txtIpAdress;
	private JTextField txtUser;
	private JTextField txtOsName;
	private JTextField txtVirtualMachine;
	
	String path = "logo_java.PNG";
	String resource = getClass().getClassLoader().getResource(path).getPath();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System frame = new System();
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
	public System() {
		setTitle("Propriétés système");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setIconImage(Toolkit.getDefaultToolkit().getImage(resource)); // change icon of frame
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10));
		
		/**
		 * Create border layout
		 */
		borderLayout = new JPanel(new BorderLayout(10,10));
		contentPane.add(borderLayout);
		
		/**
		 * Create grid layout
		 */
		lblgridLayout = new JPanel(new GridLayout(0, 1, 10, 10));
		borderLayout.add(lblgridLayout, BorderLayout.WEST);
		txtgridLayout = new JPanel(new GridLayout(0, 1, 10, 10));
		borderLayout.add(txtgridLayout, BorderLayout.CENTER);
		
		try {
			initControls();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void initControls() throws UnknownHostException {
		/**
		 * Java icon
		 */
		JLabel lblIcon = new JLabel();
		lblIcon.setIcon(new ImageIcon(resource));
		lblIcon.setPreferredSize(new Dimension(120,0));
		contentPane.add(lblIcon, BorderLayout.WEST);
		
		/**
		 * Property of computer labels
		 */
		JLabel lblComputerName = new JLabel("Nom de la machine");
		JLabel lblIpAdress = new JLabel("Adresse IP");
		JLabel lblUser = new JLabel("Utilisateur");
		JLabel lblOsName = new JLabel("Nom de l'OS");
		JLabel lblVirtualMachine = new JLabel("Machine Virtuelle");
		
		lblgridLayout.add(lblComputerName);
		lblgridLayout.add(lblIpAdress);
		lblgridLayout.add(lblUser);
		lblgridLayout.add(lblOsName);
		lblgridLayout.add(lblVirtualMachine);
		
		/**
		 * Property of computer fields not editable
		 */
		Properties propreties = java.lang.System.getProperties();
		
		JTextField txtComputerName = new JTextField();
		txtComputerName.setEditable(false);
		txtComputerName.setText(InetAddress.getLocalHost().getHostName());
		JTextField txtIpAdress = new JTextField();
		txtIpAdress.setEditable(false);
		txtIpAdress.setText(InetAddress.getLocalHost().getHostAddress());
		JTextField txtUser = new JTextField();
		txtUser.setEditable(false);
		txtUser.setText(propreties.getProperty("user.name"));
		JTextField txtOsName = new JTextField();
		txtOsName.setEditable(false);
		txtOsName.setText(propreties.getProperty("os.name"));
		JTextField txtVirtualMachine = new JTextField();
		txtVirtualMachine.setEditable(false); 
		txtVirtualMachine.setText(java.lang.System.getProperty("java.vm.specification.name"));
		
		txtgridLayout.add(txtComputerName);
		txtgridLayout.add(txtIpAdress);
		txtgridLayout.add(txtUser);
		txtgridLayout.add(txtOsName);
		txtgridLayout.add(txtVirtualMachine);
	}
	

}
