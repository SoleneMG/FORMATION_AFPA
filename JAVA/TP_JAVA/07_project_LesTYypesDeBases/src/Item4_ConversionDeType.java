
public class Item4_ConversionDeType {
	
	public static void main(String[] args) {
		char c;
		double d = 456_789.789_012_345_678_9;
		byte b;
		short s;
		int i;
		long l;
		float f;
		
		c = (char) d;
		b = (byte) d;
		s = (short) d;
		i = (int) d;
		l = (long) d;
		f = (float) d;
		
		System.out.printf("Valeur de double : %f\n"
				+ "Valeur de char : %s\n"
				+ "Valeur de byte : %d\n "
				+ "Valeur de short : %d\n "
				+ "Valeur de int : %d\n "
				+ "Valeur de long : %d\n "
				+ "Valeur de float : %f\n ",
				d,c,b,s,i,l,f);
				
	}

}
