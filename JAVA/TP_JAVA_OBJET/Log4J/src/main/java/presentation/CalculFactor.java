package presentation;

import java.math.BigInteger;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import domain.MathBean;
import domain.MathException;

public class CalculFactor {
	
	//private static final Logger LOGGER = LogManager.getLogger(CalculFactor.class);
	public static void main(String[] args) {
		factorielleAvecRecursiviteBigIntegerAvecMathBean();

	}

	public static void factorielleAvecRecursiviteBigInteger() {
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
					JOptionPane.showMessageDialog(null,
							"Résultat composé de : " + factorielle.bitLength() + " chiffres", "Résultat",
							JOptionPane.PLAIN_MESSAGE);
				} catch (MathException e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
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
					BigInteger nb = returnBigInteger(nbString);
					factorielle = bean.factorielle(nb);
					JOptionPane.showMessageDialog(null,
							"Résultat composé de : " + factorielle.bitLength() + " chiffres", "Résultat",
							JOptionPane.PLAIN_MESSAGE);
				} catch (MathException e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Message d'erreur", JOptionPane.ERROR_MESSAGE);
				}
			}
		} while (isContinue);
	}

	public static BigInteger returnBigInteger(String nbString) throws MathException {
		try {
			return new BigInteger(nbString);
		} catch (NumberFormatException e) {
			throw new MathException("NumberFormat Exception");
		}
	}

}
