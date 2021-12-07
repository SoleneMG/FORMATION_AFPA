import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) {
		Regex r = new Regex();
		String[] tab = r.testRegexWithGroups("05/03");
		int day = Integer.parseInt(tab[1]);
		int month = Integer.parseInt(tab[2]);
		
		System.out.println("day: "+day+" month: "+month);

	
	}
	/**
	 * 
	 * @param date une date sous le format dd/MM
	 * @return tableau de String dans lequel à l'index 0 nous renseignons le nombre de jours et 
	 * à l'index 1 le nombre de mois.
	 * @throws NullPointerException si la date ne correspond pas au format dd/MM retourne null plutot qu'un tableau vide.
	 */
	public String[] testRegexWithGroups(String date) throws NullPointerException {
		Pattern pattern = Pattern.compile("(<?day>\\d{1,2})>\\/(<?month>\\d{1,2})");
		// (\\d{1,2})/(\\d{1,2})
		Matcher matcher = pattern.matcher(date);
		String[] dateTab = new String[2];
		if(matcher.find()) {
			// ATTENTION matcher.group(0) = TOTALITE DU MATCH !!!
			// dateTab[0] = matcher.group(1);
			// dateTab[1] = matcher.group(2);
			
			dateTab[0] = matcher.group("day");
			dateTab[1] = matcher.group("month");
			
		}
		if(dateTab[0]!=null && dateTab[1]!=null) {
			return dateTab;
		} 
		 return null;
		}
	}

