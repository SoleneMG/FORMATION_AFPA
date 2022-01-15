package loto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.data.Data;
import model.label.BlueCircle;
import model.label.BlueCircleWithRedBorder;
import model.label.RedCircle;

@SuppressWarnings("serial")
public class Loto extends JFrame {
	private List<Data> dataList;
	private String[] dateArray;
	String csvFilePath = "resources\\loto_201911.csv";
	private String title = "Française des jeux";
	String logoPath = "logo_FDJ.PNG";
	String resource = getClass().getClassLoader().getResource(logoPath).getPath();



	/**
	 * Panel
	 */
	private JPanel contentPane;
	private JPanel borderLayoutNorth;
	private JPanel gridBagLayout;
	private GridBagConstraints gbc;

	/**
	 * Components variables
	 */
	JLabel logoFDJ = new JLabel();
	private Image image;
	private JComboBox<String> cbxdate;
	private JLabel lblAmountAndWinner;
	private JLabel lblResultOfLoto;
	private JLabel[] firstDraw;
	private JLabel chanceBall;
	private JLabel[] secondDraw;
	private JLabel lblResultOfSecondDraw;
	private int indexOfComboBoxSelected = 0;
	

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
		
		setMinimumSize(new Dimension(200, 200));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle(title);
		setBounds(200, 200, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		createBorderLayoutNorth();
		contentPane.add(borderLayoutNorth, BorderLayout.NORTH);
		createGridBagLayout();
		contentPane.add(gridBagLayout, BorderLayout.CENTER);
		
		dataList = extractDataFromCsv(csvFilePath, 0);
		
		initControls();
		setIconImage(image);

	}

	private void initControls() {
		displayLogoFDJ();
		//GridBagConstraints
		displayDate(); // 1rst line
		displayAmountOfJackpotAndWinner(); //2nd line
		displayResultOfLoto(); //3rd line
		displayFirstDraw(); //4th line
		displayResultOfTheSecondDrawOfLoto(); //5th line
		displaySecondDraw(); //6th line
	}

	private ImageIcon scaledImage(ImageIcon imageIcon, int width, int height) {
		image = imageIcon.getImage();
		Image newImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(newImage);
	}
	
	private void displayLogoFDJ() {
		logoFDJ.setHorizontalAlignment(SwingConstants.CENTER);
		borderLayoutNorth.add(logoFDJ, BorderLayout.CENTER);
		ImageIcon imageIcon = new ImageIcon(resource);
		logoFDJ.setIcon(scaledImage(imageIcon, imageIcon.getIconWidth()*30/100, imageIcon.getIconHeight()*30/100));
	}
	
	private void createBorderLayoutNorth() {
		borderLayoutNorth = new JPanel();
		borderLayoutNorth.setBackground(Color.white);
		borderLayoutNorth.setLayout(new BorderLayout(10, 10));
	}
	
	private void createGridBagLayout() {
		gridBagLayout = new JPanel(new GridBagLayout());
		gridBagLayout.setBackground(Color.white);
		//gridBagLayout.setBackground(Color.red);
		gbc = new GridBagConstraints();
		gbc.ipady = 10;
		
	}
	
	private void displayDate() {
		dateArray = new String[dataList.size()];
		for(int i=0;i<dataList.size();i++) {
			dateArray[i] = dataList.get(i).date;
		}
		cbxdate = new JComboBox<>(dateArray);
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gridBagLayout.add(cbxdate, gbc);
		
		cbxdate.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JComboBox box = (JComboBox) e.getSource();
				indexOfComboBoxSelected = box.getSelectedIndex();
				lblAmountAndWinner.setText(dataList.get(indexOfComboBoxSelected).amount+" - "+dataList.get(indexOfComboBoxSelected).winner);
				for(int i=0;i<5;i++) {
					firstDraw[i].setText(dataList.get(indexOfComboBoxSelected).firstDraw[i]);
					secondDraw[i].setText(dataList.get(indexOfComboBoxSelected).secondDraw[i]);
				}
				chanceBall.setText(dataList.get(indexOfComboBoxSelected).chanceBall);
			}
		});
	}
	
	private void displayAmountOfJackpotAndWinner() {
		String content = dataList.get(indexOfComboBoxSelected).amount+" - "+dataList.get(indexOfComboBoxSelected).winner;
		lblAmountAndWinner = new JLabel(content);
		gbc.gridy = 1;
		gridBagLayout.add(lblAmountAndWinner, gbc);
	}
	
	private void displayResultOfLoto() {
		lblResultOfLoto = new JLabel("Résultat Loto");
		gbc.gridy = 2;
		gridBagLayout.add(lblResultOfLoto, gbc);
	}
	
	private void displayFirstDraw() {
		JPanel flowLayout = new JPanel(new FlowLayout());
		flowLayout.setBackground(Color.white);
		firstDraw = new JLabel[5];
		for (int i=0;i<5;i++) {
			firstDraw[i] = new BlueCircle();
			firstDraw[i].setText(dataList.get(indexOfComboBoxSelected).firstDraw[i]);
			flowLayout.add(firstDraw[i]);
		}
		JLabel chance = new JLabel("chance");
		System.out.println(chance.getFont());
		chance.setFont(new Font("Dialog", Font.BOLD, 10));
		flowLayout.add(chance);
		chanceBall = new RedCircle();
		chanceBall.setText(dataList.get(indexOfComboBoxSelected).chanceBall);
		flowLayout.add(chanceBall);
		gbc.gridy = 3;
		gridBagLayout.add(flowLayout, gbc);
	}
	
	private void displayResultOfTheSecondDrawOfLoto() {
		lblResultOfSecondDraw = new JLabel("Résultats Option 2nd tirage");
		gbc.gridy = 4;
		gridBagLayout.add(lblResultOfSecondDraw, gbc);
	}
	
	private void displaySecondDraw() {
		JPanel flowLayout = new JPanel(new FlowLayout());
		flowLayout.setBackground(Color.white);
		secondDraw = new JLabel[5];
		for (int i=0;i<5;i++) {
			secondDraw[i] = new BlueCircleWithRedBorder();
			secondDraw[i].setText(dataList.get(indexOfComboBoxSelected).secondDraw[i]);
			flowLayout.add(secondDraw[i]);
		}
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.LINE_START;
		gridBagLayout.add(flowLayout, gbc);
	}
	
	private List<Data> extractDataFromCsv(String textName, int encodageIndex){
		dataList = new ArrayList<>();
		int firstLine = 0;
		String[] lotoInformationPerDay = null;
		String[] encodageTab = { "UTF-8", "ISO-8859-1" };
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(textName),
				Charset.forName(encodageTab[encodageIndex]))) {
			
			String line = null;
			String splitSeparator = ";";
			
			while ((line = reader.readLine()) != null) {
				if (firstLine != 0) {
					lotoInformationPerDay = line.split(splitSeparator);
					String date = lotoInformationPerDay[2];
					String winner = lotoInformationPerDay[11];
					String amount = lotoInformationPerDay[12];
					String[] firstDraw = new String[5];	
					String[] secondDraw = new String[5];	
					String chanceBall = lotoInformationPerDay[9];
					for (int i = 0; i < 5; i++) {
						firstDraw[i] = lotoInformationPerDay[4 + i];
						secondDraw[i] = lotoInformationPerDay[32+i];
					}
					dataList.add(new Data(date, firstDraw, secondDraw, chanceBall, winner, amount));
				}
				firstLine++;
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return extractDataFromCsv(textName, encodageIndex);
		}
		return dataList;
	}
	
}
