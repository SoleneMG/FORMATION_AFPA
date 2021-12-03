package fr.afpa.util;

import javax.swing.JOptionPane;

public class NarrowJOptionPane extends JOptionPane {

	@Override
	public int getMaxCharactersPerLineCount() {

		return 100;
	}

	public NarrowJOptionPane() {

	}

}
