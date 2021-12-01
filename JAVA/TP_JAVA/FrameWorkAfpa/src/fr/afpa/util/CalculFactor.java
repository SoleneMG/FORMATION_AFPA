package fr.afpa.util;

import javax.swing.JOptionPane;

public class CalculFactor {

	public static void main(String[] args) {
		// factorielleAvecBoubleFor();
		factorielleAvecRecursivite();

	}

	public static long factortielleFor(long nb) {
		long factorielle = 1L;
		if (nb == 0 || nb == 1) {
			return factorielle;
		} else if (nb < 0) {
			return -1L;
		} else if (nb > 20) {
			return -2L;
		}
		for (int i = 1; i < nb; i++) {
			factorielle *= i + 1;
		}
		return factorielle;
	}

	public static void factorielleAvecBoubleFor() {
		Long factorielle;
		boolean isContinue;
		do {
			isContinue = false;

			String nbString = JOptionPane.showInputDialog("Entrer un nombre : ");
			if (nbString != null) {
				Long nb = Long.parseLong(nbString);
				factorielle = factortielleFor(nb);
				if (factorielle == -1) {
					JOptionPane.showMessageDialog(null, "R�sultat impossible pour ce nombre", "Nombre n�gatif",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				} else if (factorielle == -2) {
					JOptionPane.showMessageDialog(null, "R�sultat impossible pour ce nombre",
							"Capacit� du long d�pass�e", JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				} else {
					JOptionPane.showMessageDialog(null, "" + factorielle, "R�sultat", JOptionPane.PLAIN_MESSAGE);
				}
			}
		} while (isContinue);
	}

	public static void factorielleAvecRecursivite() {
		Long factorielle = null;
		boolean isContinue;
		do {
			isContinue = false;
			String nbString = JOptionPane.showInputDialog("Entrer un nombre : ");
			if (nbString != null) {
				try {
					Long nb = Long.parseLong(nbString);
					factorielle = fr.afpa.math.Math.factorielle(nb);
					JOptionPane.showMessageDialog(null, "" + factorielle, "R�sultat", JOptionPane.PLAIN_MESSAGE);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "La saisie est incorrecte", "Param�tres invalides",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				} catch (IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, "R�sultat impossible pour ce nombre", "Nombre n�gatif",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				}
			}
		} while (isContinue);
	}

}
