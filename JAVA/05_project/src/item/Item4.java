package item;

public class Item4 {

	public static void main(String[] args) {
		final int MIN_VALUE = 2;
		final int MAX_VALUE = 100;
		boolean isWholeNumber = true;

		for (int j = MIN_VALUE; j < MAX_VALUE; j++) {
			isWholeNumber = true;
			for (int i = 2; i < j; i++) {
				int rest = j % i;
				if (rest == 0) {
					isWholeNumber = false;
					break;
				}
			}
			if (isWholeNumber) {
				System.out.println("" + j);
			}
		}

	}
}