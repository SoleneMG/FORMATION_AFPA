package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.regex.Matcher;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

public class EditeurDeTexte extends JFrame {
	private String title = "Editeur de texte";
	private String path = "resources//shadock.txt";
	private StringBuilder txtContent;
	private HashSet<String> wordsSet;
	private String currentWord;

	/**
	 * Components variables
	 */
	private JLabel lblSearchWord;
	private JButton cmdSearch;
	private JTextArea txtFiles;
	private JList<String> listWord;
	/**
	 * Layout variables
	 */
	private JPanel flowLayout;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditeurDeTexte frame = new EditeurDeTexte();
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
	public EditeurDeTexte() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle(title);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		/**
		 * Create FlowLayout
		 */
		flowLayout = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
		contentPane.add(flowLayout, BorderLayout.NORTH);

		initControls();
	}

	private void initControls() {
		/**
		 * Search function
		 */
		lblSearchWord = new JLabel("Recherche du mot");
		cmdSearch = new JButton("Chercher");
		cmdSearch.setEnabled(false);
		flowLayout.add(lblSearchWord);
		flowLayout.add(cmdSearch);
		cmdSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					highlighter(currentWord);
				} catch (BadLocationException e1) {
					e1.printStackTrace();
				}
			}
		});

		/**
		 * TxtArea with scrollPane
		 */
		txtFiles = new JTextArea();
		txtContent = readFile(path, 0);
		txtFiles.setText(txtContent.toString());
		// focus on the top of area
		txtFiles.setSelectionStart(0);
		txtFiles.setSelectionEnd(0); // we need two setSelectionSart and End to have focus on the top of area
		txtFiles.setLineWrap(true); // line feed
		txtFiles.setWrapStyleWord(true); // separate between two words
		JScrollPane panArea = new JScrollPane(txtFiles);
		contentPane.add(panArea, BorderLayout.CENTER);

		/**
		 * display JList
		 */
		listWord = new JList<String>();
		wordsSet = returnListOfWordFromText(path, 0);
		for (String string : wordsSet) {
			java.lang.System.out.println(string);
		}
		// convert Set to Array
		String[] wordsTab = new String[wordsSet.size()];
		wordsTab = wordsSet.toArray(wordsTab);
		// sort Array by alphabetic order
		for (int i = 0; i < wordsTab.length; i++) {
			wordsTab[i] = wordsTab[i].toLowerCase();
		}
		bubbleSort(wordsTab);
		// add Data to JList
		listWord.setListData(wordsTab);
		// add JList to scrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(listWord);
		listWord.setLayoutOrientation(JList.VERTICAL);
		// add scrollPane to contentPane
		contentPane.add(scrollPane, BorderLayout.WEST);

		/**
		 * add Listener on JList
		 */
		listWord.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				JList<String> list = (JList<String>) e.getSource();
				if (cmdSearch.isEnabled() == false) {
					cmdSearch.setEnabled(true);
				}
				if (currentWord != null && currentWord != (String) list.getSelectedValue()) {
					txtFiles.getHighlighter().removeAllHighlights();
				}
				
				currentWord = (String) list.getSelectedValue();
				java.lang.System.out.println(currentWord);
			}
		});
		
		listWord.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getClickCount()==2) {
					try {
						highlighter(currentWord);
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}				
				}
			
				super.mousePressed(e);
			}
			
		});
	}

	/**
	 * read textFile
	 * 
	 * @param textName      path of the file
	 * @param encodageIndex init value = 0. Try to read file with different encodage
	 *                      referenced into encodageTab
	 */
	private StringBuilder readFile(String textName, int encodageIndex) {
		StringBuilder sb = new StringBuilder();
		String[] encodageTab = { "UTF-8", "ISO-8859-1" };
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(textName),
				Charset.forName(encodageTab[encodageIndex]))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line+"\n");
			}
		} catch (MalformedInputException mie) {
			return readFile(textName, ++encodageIndex);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return sb;
	}

	/**
	 * Read file using Scanner to collect all the words from text
	 * 
	 * @param textName
	 * @return
	 */
	public HashSet<String> returnListOfWordFromText(String textName, int encodageIndex) {
		HashSet<String> wordsList = new HashSet<>();
		String[] encodageTab = { "UTF-8", "ISO-8859-1" };
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(textName),
				Charset.forName(encodageTab[encodageIndex]))) {
			String line = null;
			String splitSeparator = "[\s\n\"?,!:.]";

			while ((line = reader.readLine()) != null) {
				String[] infos = line.split(splitSeparator);
				for (int i = 0; i < infos.length; i++) {
					wordsList.add(infos[i]);
				}
			}
		} catch (MalformedInputException mie) {
			return returnListOfWordFromText(textName, ++encodageIndex);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return wordsList;

	}

	/**
	 * Sort board by naturalSort
	 * 
	 * @param board
	 * @return
	 */
	private String[] bubbleSort(String[] board) {
		boolean isChanged = true;
		do {
			isChanged = false;
			for (int i = 0; i < board.length - 1; i++) {
				if (board[i].compareTo(board[i + 1]) > 0) {
					String temp = board[i];
					board[i] = board[i + 1];
					board[i + 1] = temp;
					isChanged = true;
				}
			}
		} while (isChanged);
		return board;
	}

	/**
	 * Highlighter words in textArea
	 * 
	 * @throws BadLocationException
	 */
	private void highlighter(String word) throws BadLocationException {
		HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
		Highlighter highlighter = txtFiles.getHighlighter();

		int fromIndex = 0;
		while (fromIndex != -1) {
			int positionStart = txtContent.indexOf(word, fromIndex);
			if (positionStart == -1) {
				return;
			}
			int positionEnd = positionStart + word.length();
			highlighter.addHighlight(positionStart, positionEnd, painter);
			fromIndex = positionEnd;
		}
	}
}
