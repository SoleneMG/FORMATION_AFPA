package main.java.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("serial")
public class MathException extends Exception {
	private static final Logger LOGGER = LogManager.getLogger(MathException.class);

	public MathException() {  
		super("Erreur de type g�n�rale");
		LOGGER.info("Erreur de type g�n�rale");
	}

	public MathException(String message) {
		super(message);
		LOGGER.error(message); // (value == {} , value)
	}
	
	

}
