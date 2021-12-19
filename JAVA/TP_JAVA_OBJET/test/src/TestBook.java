

import java.time.LocalDate;
import java.util.Arrays;

import bookstore.metier.Accounting;
import bookstore.metier.Book;
import bookstore.metier.User;

/**
 * 
 * @author Sara LIMA BJORCK
 *
 */
public class TestBook {


	public static void main(String[] args) {
		Book bookTintin = new Book("Tintin", "Aut", 40, LocalDate.parse("2000-10-11"), true, 12.00);
		Book bookAsterix = new Book("Asterix", "Userus", 40);
		System.out.println(bookTintin);
		//book.infoBook();
		
		// Deux manières de comparer les hashCodes
		System.out.println("hashcode de book 1 : " + (bookTintin.hashCode()));
		System.out.println("hashcode de book 2 : " + Integer.toHexString(bookAsterix.hashCode()));
		
		if (bookTintin.equals(bookAsterix)) {
			System.out.println("Livres identiques.");
		} else {
			System.out.println("Livres non identiques.");
			//System.out.print(book.toString());
		}
				
//		User userToto = new User("Dupont", "Toto", 1, bookAsterix, "20/11/2021");
//		User userZorro = new User("Dupont", "Zorro", 1, bookTintin, "03/12/2021");
		
//		System.out.println(userToto.toString());
//
//		userToto.setBook(bookTintin);
//		System.out.println(userToto.toString());
//		System.out.println(userToto.isLoanLate());
//		System.out.println("Prix Total des livres existants : " + Accounting.getInstance().getTotalPrice());
		
		Book[] books = {bookTintin, bookAsterix};
		System.out.println("\nBefore natural sort :");
		System.out.println(Arrays.toString(books));
		Arrays.sort(books);
		//System.out.println(Arrays.toString(books));
		
		
	}
	
	

}
