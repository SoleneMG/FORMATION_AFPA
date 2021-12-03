package fr.afpa.util;

import java.math.BigInteger;

import javax.swing.JOptionPane;

import fr.afpa.math.MathBean;

import static fr.afpa.math.Math.factorielle;

public class CalculFactor {

	public static void main(String[] args) {
		// factorielleAvecBoubleFor();
		// factorielleAvecRecursiviteLong();
		factorielleAvecRecursiviteBigInteger();

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
					JOptionPane.showMessageDialog(null, "Résultat impossible pour ce nombre", "Nombre négatif",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				} else if (factorielle == -2) {
					JOptionPane.showMessageDialog(null, "Résultat impossible pour ce nombre",
							"Capacité du long dépassée", JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				} else {
					JOptionPane.showMessageDialog(null, "" + factorielle, "Résultat", JOptionPane.PLAIN_MESSAGE);
				}
			}
		} while (isContinue);
	}

	public static void factorielleAvecRecursiviteLong() {
		Long factorielle = null;
		boolean isContinue;
		do {
			isContinue = false;
			String nbString = JOptionPane.showInputDialog("Entrer un nombre : ");
			if (nbString != null) {
				try {
					Long nb = Long.parseLong(nbString);
					factorielle = factorielle(nb);
					JOptionPane.showMessageDialog(null, "" + factorielle, "Résultat", JOptionPane.PLAIN_MESSAGE);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "La saisie est incorrecte", "Paramètres invalides",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				} catch (IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, "Résultat impossible pour ce nombre", "Nombre négatif",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				}
			}
		} while (isContinue);
	}

	public static void factorielleAvecRecursiviteBigInteger() {
//		  JOptionPane optionPane = new NarrowJOptionPane();
//		    optionPane.setMessage(msg);
//		    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
//		    JDialog dialog = optionPane.createDialog(null, "Width 100");
//		    dialog.setVisible(true);

		BigInteger factorielle = null;
		boolean isContinue;
		do {
			isContinue = false;
			String nbString = JOptionPane.showInputDialog("Entrer un nombre : ");
			if (nbString != null) {
				try {
					BigInteger nb = new BigInteger(nbString);
					factorielle = factorielle(nb);
					JOptionPane.showMessageDialog(null, "Résultat composé de : " + factorielle.bitLength()+" chiffres", "Résultat",
							JOptionPane.PLAIN_MESSAGE);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "La saisie est incorrecte", "Paramètres invalides",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				} catch (IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, "Résultat impossible pour ce nombre", "Nombre négatif",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				} catch (StackOverflowError e) {
					JOptionPane.showMessageDialog(null, "Dépassement de capacité", "Out of border",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				}
			}
		} while (isContinue);
	}
	
	public static void factorielleAvecRecursiviteBigIntegerAvecMathBean() {
		MathBean bean = new MathBean();

		BigInteger factorielle = null;
		boolean isContinue;
		do {
			isContinue = false;
			String nbString = JOptionPane.showInputDialog("Entrer un nombre : ");
			if (nbString != null) {
				try {
					BigInteger nb = new BigInteger(nbString);
					factorielle = bean.factorielle(nb);
					JOptionPane.showMessageDialog(null, "Résultat composé de : " + factorielle.bitLength()+" chiffres", "Résultat",
							JOptionPane.PLAIN_MESSAGE);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "La saisie est incorrecte", "Paramètres invalides",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				} catch (IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, "Résultat impossible pour ce nombre", "Nombre négatif",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				} catch (StackOverflowError e) {
					JOptionPane.showMessageDialog(null, "Dépassement de capacité", "Out of border",
							JOptionPane.ERROR_MESSAGE);
					isContinue = true;
				}
			}
		} while (isContinue);
	}

}
