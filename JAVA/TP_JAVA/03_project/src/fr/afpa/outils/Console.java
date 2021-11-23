package fr.afpa.outils;



import java.io.*;

/**
 * Console permet d'effectuer des entrées sorties en mode CONSOLE sans lever d'exception.<p>
 * Cette classe n'est pas standard et ne peut-être utilisée que dans un contexte pédagogique, 
 * afin de s'affranchir des difficultés d'entrées-sorties spécifiques au langage JAVA.
 * Les méthodes applicables à l'objet statique "in" sont celles définies dans la classe Console,
 * par contre sur l'objet statique "out" toutes les méthodes de la classe PrintStream sont utilisables
 *
 * @author afpa
 * @version 1.1.0 du 30/05/02 pour adaptation aux E/S Linux
 * @see java.io.PrintStream
 */

public final class Console 
{
	/**
	 * Objet statique associé au flot d'entrée standard
	 */
	
	public static final Console in = new Console();

	/**
	 * Objet statique associé au flot de sortie standard
 	 * @see java.io.PrintStream
	 */
	public static final PrintStream out = new PrintStream(System.out, true);

//	private static String separator = System.getProperty("line.separator");
	private static String separator = System.getProperty("line.separator");

			
	/**
	 * Lit une chaîne de 128 caractères maximum depuis le flot d'entrée standard. 
	 * Les caractères de fin de saisie CRLF sont supprimés
	 * @return Un objet de classe String correspondant à la chaîne de caractères tapée (excepté le terminateur de ligne)
	 * en utilisant le code de la machine sous-jacente. La valeur null est retournée en cas d'erreur d'entrée-sortie
	 * @see java.lang.String
	 */
	public String readLine ()
	{
	 	byte  bArray[] = new byte[255];
	 	//int nb;
		try {
			System.in.read (bArray, 0, bArray.length);
			System.in.skip(System.in.available());    // flush
			String buffer = new String (bArray);
			return buffer.substring(0, buffer.lastIndexOf(separator)); // Supprime le terminateur de ligne
		}
		catch (IOException e) {
			return null;
		}
	}

	/**
	 * Lit un entier de type <b>long</b> depuis le flot d'entrée standard. 
	 * @return L'entier tapé ou la valeur MIN_VALUE en cas d'erreur de format
	 * @see java.lang.Long
	 */
	public long readLong ()
	{
		try {
			String strValue = this.readLine();
			return (strValue != null && strValue.length() > 0 ) ? Long.parseLong(strValue, 10) : Long.MIN_VALUE;
		}
		catch (NumberFormatException e) {              // levé par parseLong si strValue n'est pas un entier
			return Long.MIN_VALUE;
		}
	}

	/**
	 * Lit un entier de type <b>int</b> depuis le flot d'entrée standard. 
	 * @return L'entier tapé. La valeur MAX_VALUE ou MIN_VALUE est retournée en cas de dépassement de capacité.
	 * La valeur MIN_VALUE est retournée en cas d'erreur de format.
	 * @see java.lang.Integer
	 */
	public int readInt ()
	{
		long lgValue = this.readLong();
		lgValue = Math.max (Integer.MIN_VALUE, lgValue); 
		lgValue = Math.min (Integer.MAX_VALUE, lgValue); 
		return (int) lgValue;
	}

	/**
	 * Lit un entier de type <b>short</b> depuis le flot d'entrée standard. 
	 * @return L'entier tapé. La valeur MAX_VALUE ou MIN_VALUE est retournée en cas de dépassement de capacité.
	 * La valeur MIN_VALUE est retournée en cas d'erreur de format.
	 * @see java.lang.Short
	 */
	public short readShort ()
	{
		long lgValue = this.readLong();
		lgValue = Math.max (Short.MIN_VALUE, lgValue); 
		lgValue = Math.min (Short.MAX_VALUE, lgValue); 
		return (short) lgValue;
	}

	/**
	 * Lit un entier de type <b>byte</b> depuis le flot d'entrée standard. 
	 * @return L'entier tapé. La valeur MAX_VALUE ou MIN_VALUE est retournée en cas de dépassement de capacité.
	 * La valeur MIN_VALUE est retournée en cas d'erreur de format.
	 * @see java.lang.Byte
	 */
	public byte readByte ()
	{
		long lgValue = this.readLong();
		lgValue = Math.max (Byte.MIN_VALUE, lgValue); 
		lgValue = Math.min (Byte.MAX_VALUE, lgValue); 
		return (byte) lgValue;
	}

	/**
	 * Lit un caractère de type <b>char</b> depuis le flot d'entrée standard. Tous les caractères 
	 * du tampon d'entrée sont perdus.
	 * @return Le premier caractère tapé. Le caractère MIN_VALUE est retournée en cas d'erreur de lecture.
	 * @see java.lang.Character
	 */
	public char readChar ()
	{
		String strValue = this.readLine();
		return (strValue != null && strValue.length() > 0 ) ? strValue.charAt(0) : Character.MIN_VALUE;
	}

	/**
	 * Lit un nombre flottant de type <b>double</b> depuis le flot d'entrée standard. 
	 * @return Le flottant tapé ou NaN en cas d'erreur de saisie
	 * @see java.lang.Double
	 */
	public double readDouble()
	{
		try {
			String strValue = this.readLine();
			return (strValue != null && strValue.length() > 0 ) ? Double.parseDouble(strValue) : Double.NaN;
		}
		catch (NumberFormatException e) {              // levé par parseDouble si strValue n'est pas un entier
			return Double.NaN;			
		}
	}

	/**
	 * Lit un nombre flottant de type <b>float</b> depuis le flot d'entrée standard. 
	 * @return Le flottant tapé ou NaN en cas d'erreur de saisie.
	 * La valeur MAX_VALUE ou MIN_VALUE est retournée en cas de dépassement de capacité.
	 * @see java.lang.Float
	 */
	public float readFloat()
	{
		double dbValue = this.readDouble();
		if (dbValue == Double.NaN) return Float.NaN;
		dbValue = Math.max (-Float.MAX_VALUE, dbValue); 
		dbValue = Math.min (Float.MAX_VALUE, dbValue); 
		return (float) dbValue;
	}
}
