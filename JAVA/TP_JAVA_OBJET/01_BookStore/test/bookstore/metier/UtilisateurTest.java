package bookstore.metier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class UtilisateurTest {
	
	public Utilisateur getUtilisateur(List<Livre> livres) {
		Utilisateur u1 = new Utilisateur("u1");
		livres.stream().forEach(livre -> {
			try {
				u1.addLivre(livre);
			} catch (BiblioException e) {
				e.printStackTrace();
			}
		});
		return u1;
	}
	
	public List<Livre> getlivres() {
		Livre asterix, obelix, idefix;
		asterix = new Livre("asterix", "auteur");
		obelix = new Livre("obelix", "auteur");
		idefix = new Livre("idefix", "auteur");
		return Arrays.asList(asterix, obelix, idefix);
		
	}
	
	@ParameterizedTest
	@MethodSource("findBooks")
	
	void testFindLivreByTitre(String titre, Livre expected) {
		//Given
		Utilisateur u1 = getUtilisateur(getlivres());
		//When
		Livre result = u1.findLivreByTitre(titre);
		//Then
		assertEquals(expected, result);
	}
	
	public static Stream<Arguments> findBooks(){
		
		return Stream.of(
				Arguments.of("asterix", new Livre("asterix", "auteur")), 
				Arguments.of("idefix", new Livre("idefix", "auteur"))

		);
	}
	@ParameterizedTest
	@MethodSource("removeBooks")
	void testRemoveLivre(Livre livre, List<Livre> expected) {
		//Given
		Utilisateur u1 = getUtilisateur(getlivres());
		//When
		u1.removeLivre(livre);
		List<Livre> result = u1.getEmprunts();
		//Then
		assertEquals(expected, result);
	}
	
	public static Stream<Arguments> removeBooks(){

			List<Livre> listAfterRemoval = new ArrayList<Livre>();
			listAfterRemoval.add(new Livre("idefix", "auteur"));
			listAfterRemoval.add(new Livre("obelix", "auteur"));
		
		return Stream.of(
				Arguments.of(new Livre("asterix", "auteur"), listAfterRemoval)
		);
	}
	
	@ParameterizedTest
	@MethodSource("containsBooks")
	void testContainsLivre(Livre livre, boolean expected) {
		//Given
		Utilisateur u1 = getUtilisateur(getlivres());
		//When
		boolean result = u1.containsLivre(livre);
	
		//Then
		assertEquals(expected, result);
	}
	
	public static Stream<Arguments> containsBooks(){
	
			return Stream.of(
					Arguments.of(new Livre("asterix", "auteur"), true),
					Arguments.of(new Livre("falballa", "auteur"), true) // true because the equality is based on the number of pages wich are 0 for all books comparated
			);
}
	@ParameterizedTest
	@MethodSource("isConditionsPretAcceptees")
	void testIsConditionsPretAcceptees(List<Livre> livres, boolean expected) {
		//Given
		Utilisateur u1 = getUtilisateur(livres);
		//When
		boolean result = u1.isConditionsPretAcceptees();
		//Then
		assertEquals(expected, result);
	}
	
	public static Stream<Arguments> isConditionsPretAcceptees(){
		Livre asterix = new Livre("asterix", "auteur");
		LocalDate dateEmprunt = LocalDate.now().minusDays(15);
		asterix.setDateEmprunt(dateEmprunt);
		Livre obelix = new Livre("obelix", "auteur");
		LocalDate dateEmprunt2 = LocalDate.now().minusDays(16);
		obelix.setDateEmprunt(dateEmprunt2);
		Livre idefix = new Livre("idefix", "auteur");
		LocalDate dateEmprunt3 = LocalDate.now().minusDays(2);
		idefix.setDateEmprunt(dateEmprunt3);
		
		List<Livre> livresEnRetard = Arrays.asList(obelix, asterix);
		List<Livre> livresMax = Arrays.asList(obelix, asterix, idefix);
		List<Livre> livres = Arrays.asList(asterix, idefix);
		
		
		return Stream.of(
				Arguments.of(livresEnRetard, false), // prêt en retard
				Arguments.of(livresMax, false),      // nombre de prêt max atteint
				Arguments.of(livres, true)			 // condition pour prêt à true
				);
}
}
