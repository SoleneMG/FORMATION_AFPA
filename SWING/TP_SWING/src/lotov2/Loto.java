package lotov2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import lotov2.model.Data;
import lotov2.model.DataCsv;

public class Loto extends JFrame {
	String path = "resources\\loto_201911.csv";
	//String resource = getClass().getClassLoader().getResource(path).getPath();
	List<Data> dataList = convertCsvToDataModel(extractDataFromCsv(path, 0));

	private JPanel contentPane; // BorderLayout
	private JPanel amountPanel; // FlowLayout
	private JPanel resultPanelFirstDraw; // FlowLayout
	private JPanel gridBagLayout; // GridLayout
	private JLabel lblDate;
	private JLabel[] ballsFirstDraw = new JLabel[6];
	private JLabel[] ballsSecondDraw = new JLabel[5];
	private JLabel amount;
	private JLabel winner;
	private JPanel resultPanelSecondDraw;

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
		setTitle("Résultat du Loto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
		initControls();
	}

	private void initControls() {
		/**
		 * Create gridLayout
		 */
		gridBagLayout = new JPanel(new GridBagLayout());
		GridBagConstraints gridConstraints = new GridBagConstraints();
		contentPane.add(gridBagLayout, BorderLayout.CENTER);
		/**
		 * Create 2 Panels(FlowLayout disposition) : resultPanel to display the number
		 * drawed amountPanel to display the amount and winner of jackpot
		 */
		resultPanelFirstDraw = new JPanel(new FlowLayout());
		resultPanelSecondDraw = new JPanel(new FlowLayout());
//		gridBagLayout.add(amountPanel);
		//contentPane.add(amountPanel, BorderLayout.NORTH);

		/**
		 * Display date
		 */
		lblDate = new JLabel();	
		lblDate.setText("Tirage du "+dataList.get(0).date.format(DateTimeFormatter.ofPattern("eeee dd MMMM yyyy")));
		lblDate.setHorizontalTextPosition(JLabel.CENTER);
		gridConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 0;
		gridConstraints.gridwidth = 2;
		gridBagLayout.add(lblDate, gridConstraints);
		
		/**
		 * Display amount
		 */
		amount = new JLabel();
		amount.setText(dataList.get(0).amount+"    - ");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		gridConstraints.ipady = 20;
		gridBagLayout.add(amount, gridConstraints);
//		amountPanel.add(amount);
		
		/**
		 * Display Winner
		 */
		winner = new JLabel();
		winner.setText(dataList.get(0).winner);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 1;
		gridBagLayout.add(winner, gridConstraints);
//		amountPanel.add(winner);
		
		/**
		 * Display JLabel Résultats Loto (en dur)
		 */
		JLabel lblResult = new JLabel("Résultats du Loto");
		gridConstraints.ipady = 5;
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 2;
		gridConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridConstraints.gridwidth = 2;
		gridBagLayout.add(lblResult, gridConstraints);
		
		/**
		 * Display numberOfLoto FirstDraw
		 */
		for(int i = 0; i<dataList.get(0).ballsDrawedFirstDraw.length;i++) {
			if(i==dataList.get(0).ballsDrawedFirstDraw.length-1) {
				ballsFirstDraw[i] = new RedCircleLabel(String.valueOf(dataList.get(0).ballsDrawedFirstDraw[i]));
			} else {
				ballsFirstDraw[i] = new BlueCircleLabel(String.valueOf(dataList.get(0).ballsDrawedFirstDraw[i]));
			}
			resultPanelFirstDraw.add(ballsFirstDraw[i]);
		}
		gridConstraints.ipady = 5;
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 3;
		gridConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridConstraints.gridwidth = 6;
		gridBagLayout.add(resultPanelFirstDraw, gridConstraints);
		
		
		/**
		 * Display numberOfLoto SecondDraw
		 */
		for(int i = 0; i<dataList.get(0).ballsDrawedSecondDraw.length;i++) {
				ballsSecondDraw[i] = new BlueCircleWithRedBorderLabel(String.valueOf(dataList.get(0).ballsDrawedSecondDraw[i]));
		
			resultPanelSecondDraw.add(ballsSecondDraw[i]);
		}
		gridConstraints.ipady = 5;
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 4;
		gridConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridConstraints.gridwidth = 4;
		gridBagLayout.add(resultPanelSecondDraw, gridConstraints);
		
		
		
	}

	private List<DataCsv> extractDataFromCsv(String textName, int encodageIndex) {
		List<DataCsv> dataList = new ArrayList<>();
		int winner;
		String date;
		int[] numberDrawedFirstDraw = new int[6];
		int[] numberDrawedSecondDraw = new int[5];
		int amount;
		String[] encodageTab = { "UTF-8", "ISO-8859-1" };
		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(textName),
				Charset.forName(encodageTab[encodageIndex]))) {
			String line = null;
			String splitSeparator = ";";
			int firstLine = 0;
			while ((line = reader.readLine()) != null) {

				String[] infos = line.split(splitSeparator);
				for (int columns = 0; columns < infos.length; columns++) {
					if (firstLine != 0) {
						date = infos[2];
						for (int i = 0; i < 6; i++) {
							numberDrawedFirstDraw[i] = Integer.parseInt(infos[4 + i]);
							if(i<5) {
							numberDrawedSecondDraw[i] = Integer.parseInt(infos[32 + i]);
							}
						}
						winner = Integer.parseInt(infos[11]);
						amount = Integer.parseInt(infos[12]);
						dataList.add(new DataCsv(date, amount, winner, numberDrawedFirstDraw, numberDrawedSecondDraw));
					}
				}
				firstLine++;
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return dataList;
	}
	
	private List<Data> convertCsvToDataModel(List<DataCsv> dataCsv){
		List<Data> dataList = new ArrayList<>();
		
		for (DataCsv dataFromCsv : dataCsv) {
			LocalDate date = LocalDate.parse(dataFromCsv.date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			String amount = String.valueOf(dataFromCsv.amount);
			String winner = String.valueOf(dataFromCsv.winner);	
			int[] ballsDrawedFirstDraw = dataFromCsv.ballsDrawedFirstDraw;
			int[] ballsDrawedSecondDraw = dataFromCsv.ballsDrawedSecondDraw;
			dataList.add(new Data(date, amount, winner,ballsDrawedFirstDraw , ballsDrawedSecondDraw));
		}
		return dataList;
	}
}
