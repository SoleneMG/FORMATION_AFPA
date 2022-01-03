package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ClientTest {

	@ParameterizedTest
	@MethodSource("getTotalPrice")
	void testGetTotalPrice(List<Commande> commandes, double expected) {
		//Given
		Particulier p1 = getParticulier();
		p1.addCommandes(commandes);
		//When
		double result = p1.getTotalPrice();
		//Then
		assertEquals(expected, result);
	}
	
	public Particulier getParticulier() {
		return new Particulier("identifiant_P01", "DUPONT", "Michel", "24 grande rue", LocalDate.of(1952,Month.JULY, 15));
	}

	public Professionnel getProfessionnel() {
		return new Professionnel("identifiant_E01", "Noel", "Pere", "Pole Nord", LocalDate.of(1761,Month.DECEMBER, 25));
	}
	
	public static Stream<Arguments> getTotalPrice(){
		Article article1 = new Article(20.99);
		Article article2 = new Article(50.00);
		Article article3 = new Article(0.00);
		Commande commande = new Commande(article1, 1);
		Commande commande2 = new Commande(article1, 2);
		Commande commande3 = new Commande(article2, 1);
		Commande commande4 = new Commande(article3, 10);
		
		return Stream.of(
				Arguments.of(Arrays.asList(commande), 20.99),
				Arguments.of(Arrays.asList(commande, commande3), 70.99),
				Arguments.of(Arrays.asList(commande2), 41.98),
				Arguments.of(Arrays.asList(commande4), 0.)
				
				
				);
	}
}
