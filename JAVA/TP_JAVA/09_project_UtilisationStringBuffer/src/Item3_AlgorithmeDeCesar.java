import java.util.Scanner;

public class Item3_AlgorithmeDeCesar {
	static Scanner sc = new Scanner(System.in);

	/**
	 * Ecrire l'application suivante :
	 * Soit 2 chaines, l'une �tant une copie de l'autre.
	 * Crypter une des chaines (algorithme de Cesar)
	 * Afficher les 2 chaines
	 * Decrypter la chaine crypt�e
	 * Afficher les chaines
	 * 
	 * Utiliser les chaines mutables si n�cessaire
	 * 
	 */
	
	public static void main(String[] args) {
		int OFFSET = 2;
		int j = OFFSET;
		String s, encrypted, decrypted; 
		
		
		System.out.println("Entrez une chaine : ");
		s = sc.nextLine();
	
		encrypted = encode(s,OFFSET).toString();
		decrypted = decode(encrypted, OFFSET).toString();
				
		System.out.println("Chaine non crypt�e : \n"+s);
		System.out.println("Chaine crypt�e : \n"+encrypted);
		System.out.println("Chaine d�crypt�e : \n"+decrypted);
		
	}
	
	public static StringBuilder encode(String s, int OFFSET) {
		StringBuilder sb = new StringBuilder();
		String hexaDecimalValue;
		int decimalValue;
		
		for(int i=0;i<s.length();i++) {
			hexaDecimalValue = Integer.toHexString(s.charAt(i));
			decimalValue = Integer.parseInt(hexaDecimalValue,16);
			sb.append((char)(decimalValue+OFFSET));
		}
		return sb;
	}
	
	public static StringBuilder decode(String s, int OFFSET) {
		StringBuilder sb = new StringBuilder();
		String hexaDecimalValue;
		int decimalValue;
		
		for(int i=0; i<s.length();i++) {
			hexaDecimalValue = Integer.toHexString(s.charAt(i));
			decimalValue = Integer.parseInt(hexaDecimalValue,16);
			sb.append((char)(decimalValue-OFFSET));
		}
		return sb;
	}
}
