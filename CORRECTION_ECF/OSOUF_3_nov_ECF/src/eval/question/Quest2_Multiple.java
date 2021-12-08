package eval.question;

public class Quest2_Multiple {

	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 2\n" +
"Ecrivez un programme  qui affiche les nombres entiers multiples\n" +
" de 5 entre 1 et 20.\n" +
"Documenter la classe de ce programme avec un commentaire javadoc et générez\n"+
"la javadoc.\n"+
"*******************************************************************\n\n\n"
		);
		
		
		/**Cette méthode calcule les multiples de 5 entre 1 et 20
		 * @author 77011-05-08 Osouf
		 * @param i , est l'iterateur qui regarde si sa division par 5 donne un reste null.
		 * 
		 * @return il n'y a pas de return la sortie s'effectue à l'ecran.
		 */
		System.out.println("***   Liste des multiples de 5 entre 1 et 20   ***");
		System.out.println();
		for (int i = 1; i <=20; i++) {
			if(i % 5 == 0) {
				System.out.println("\t"+i+"\t multiple de 5");
			}
			
		}
		
		
		// TODO

	}

}
