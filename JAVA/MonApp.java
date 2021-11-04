public class MonApp {

	public static void main(String args[]) { // can be write like this : String[] args
		int number1 = 0;
		int number2 = 0;

		for (int i = 0; i < args.length; i++) {
			if (!(number1 == 0)) {
				if (number2 == 0) {
					number2=parseInt(args[i]);
				}
			}
			if (number1 == 0) {
				number1=parseInt(args[i]);
			}
			System.out.println("Argument "+ i +" is : " + args[i]);
		}

		if (number1 == 0 || number2 == 0) {
			return;
		} else {
			System.out.println("The result from 2 arguments number are : " + add(number1, number2));

		}
	}

	public static int add(int number1, int number2) {
		return number1 + number2;
	}

	public static int parseInt(String string) {
		try {
			return Integer.parseInt(string);
		} catch (Exception e) {
			System.out.println(string + " can't be parsed !");
			return 0;
		}
	}

}