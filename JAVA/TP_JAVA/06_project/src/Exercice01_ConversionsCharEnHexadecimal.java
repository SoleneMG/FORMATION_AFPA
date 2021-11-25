
public class Exercice01_ConversionsCharEnHexadecimal {

	public static void main(String[] args) {
		char c = '0';
		String hexadecimalStringValue = Integer.toHexString(c);
		int hexadecimalValue = Integer.parseInt(hexadecimalStringValue); // convert char to hexadecimal
		int decimalValue = Integer.parseInt(hexadecimalStringValue, 16); // convert char to decimal

		System.out.println("Character\tHexadecimal\tDecimal");
		System.out.println(c +"\t \t"+hexadecimalValue+"\t\t"+decimalValue);
		
		char ch = '}';
		int ascii = ch;
		
		System.out.println("\nValeur decimal du charactère '"+ch+"' : "+ascii); // affiche la valeur decimal de la table ascii

		boolean isUpperCase = Character.isUpperCase(ch);
		System.out.println("Le charactère '"+ch+"' est il en majuscule ? "+isUpperCase);
		
		boolean isDigit = Character.isDigit(c);
		System.out.println("Le charactère '"+c+"' est il un chiffre ? "+isDigit);
		
		boolean isJavaIdentifierPartStart = Character.isJavaIdentifierStart(c);
		System.out.println("Peut on utiliser '"+c+"' pour commencer le nom d'une variable ? "+isJavaIdentifierPartStart);
		
		boolean isJavaIdentifierPart = Character.isJavaIdentifierPart(c);
		System.out.println("Peut on utiliser '"+c+"' pour nommer une variable (milieu ou fin) ? "+isJavaIdentifierPart);
		
		
		int MIN_VALUE = 0;
		int MAX_VALUE = 128;
		int[] asciiTableDecimalValue= new int[MAX_VALUE-MIN_VALUE];
		String[] asciiTableHexaDecimalValue= new String[MAX_VALUE-MIN_VALUE];
		char[] asciiTableCharValue=new char[MAX_VALUE-MIN_VALUE];
		
		//valeur décimale
		for(int i =0; i<asciiTableDecimalValue.length;i++) {
			asciiTableDecimalValue[i]=i;
			asciiTableHexaDecimalValue[i]=Integer.toHexString(asciiTableDecimalValue[i]);
			asciiTableCharValue[i]=(char) i;
			if(i%3==0) {
				System.out.println();
			}
			System.out.print("'"+asciiTableCharValue[i]+"' \t"+asciiTableHexaDecimalValue[i]+"\t"+asciiTableDecimalValue[i]+"\t"+Character.isJavaIdentifierStart(asciiTableCharValue[i])+"\t\t");
			
		}
	
		
	
	}
}
