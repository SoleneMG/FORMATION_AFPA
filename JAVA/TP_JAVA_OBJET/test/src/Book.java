

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Pattern;

public class Book  {
	
	public static final double PRIX_INDETERMINE = -1;
	public static final double LIVRE_GRATUIT = 0;
	
	//private static Accounting accounting = Accounting.getInstance();
	
	private String title;
	private String author;
	private int nbrPages;
	private Date purchaseDate;
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private LocalDate lendDate;
	static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private boolean available;
	private double price;
	private boolean priceExists;
	private double totalPrice;
	
	
	
	/**
	 * CONSTRUCTORS
	 *  
	 * @param title
	 * @param author
	 * @param nbrPages
	 * @param lendDate
	 * @param available
	 * @param price
	 * @param priceExists
	 * 
	 * @author Sara LIMA BJORCK
	 */
	public Book(String title, String author, int nbrPages, LocalDate lendDate, boolean available, double price) {
		this.title = title;
		this.author = author;
		this.nbrPages = nbrPages;
		Date now = new Date();
		this.purchaseDate = now;
		this.lendDate = lendDate;
		this.available = available;
		this.price = price;
		this.priceExists = true;
		//accounting.countAllBooks(this);
	}
	
	public Book(String title, String author, int nbrPages) {
		this(title, author, nbrPages, null, true, PRIX_INDETERMINE);
	}
	
	public Book() {
		this("Titre inconnu", "Auteur inconnu", 80, null, true, PRIX_INDETERMINE);
	}
	
	
	
	// SETTERS

	public void setTitle(String title) {
		this.title = title.isEmpty()? this.title = "Titre Inconnu" : title;
	}
	
	public void setAuthor(String author) {
		this.author = author.isEmpty()? this.author = "Auteur Inconnu" : author;
	}
	
	public void setNbrPages(int nbrPages) throws IllegalArgumentException {
		if(nbrPages <= 0)
			throw new IllegalArgumentException("Le nombre de pages doit être supérieur à 0.");
		else
			this.nbrPages = nbrPages;
	}
	
	public void setLendDate(String date) throws IllegalArgumentException {
		Pattern DATE_PATTERN = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
		if (DATE_PATTERN.matcher(date).matches())
			this.lendDate = LocalDate.parse(date);
		else
			throw new IllegalArgumentException("Le format de la date est incorrect. \nEntrez à nouveau la date (aaaa-mm-jj)");
	}
	
	public void setAvailability(boolean available) {
		this.available = available;
	}
	
	public void setPrice(double price) throws IllegalArgumentException {
		if (priceExists) {
			throw new IllegalArgumentException("Le prix a déjà été déclaré.");
		} else if (price < 0) {
			throw new IllegalArgumentException("Le prix doit être posifif.");
		} else {
			this.price = price;
			//accounting.countAllBooks(this);
		}
		
		//this.price = price != null ? this.price : price == -1;
	}
	
	
	// ===== GETTERS =====
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public int getNbrPages() {
		return nbrPages;
	}
	
	public String getPurchaseDate() {
		return purchaseDate != null ? sdf.format(purchaseDate) : "Date d'achat inconnue";
	}

	public String getLendDate() {
		return lendDate != null ? lendDate.format(dateFormat) : "Date inconnue";
	}

	public boolean isAvailable() {
		return available;
	}

	public double getPrice() {
		return price;
	}
	
	


	// ===== METHODS =====
	
	public void infoBook() {
		String chaine = "Titre : " + title
				+ "\nAuteur : " + author
				+ "\nNombre de pages : "+ nbrPages
				+ "\nDate d'emprunt : " + lendDate
				+ "\nDisponible : " + (available ? "Oui" : "Non")
				+ "\nPrix : " + (price < 0 ? "Prix indéterminé" : (String.format("%,.2f", price) + " euros"));
				
		System.out.println(chaine);
	}
	
	@Override
	public String toString() {
		return "[titre :" + title + " auteur : " + author + " nbrPages : " + nbrPages + " date Emprunt : " + lendDate + "\nDisponible : " + (available ? "Oui" : "Non")
				+ "\nPrix : " + (price < 0 ? "Prix indéterminé" : (String.format("%,.2f", price) + " euros")) + "]";
		
	}
	

	
	
	// ===== COMPARATORS =====
	
	@Override
	public int hashCode() {
		return Objects.hash(nbrPages, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return nbrPages == other.nbrPages && Objects.equals(title, other.title);
	}


	//@Override
	//public void compareTo() {
		//compare(l, order);
	}
//
//	private void compare(Book l, String order) {
//		if (order.equals("ascendant")) {
//			 for
//		}
//	}
//
//}
