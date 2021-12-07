import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) {
		Regex r = new Regex();
		String[] tab = r.testRegexWithGroups("05/03");
		//int day = Integer.parseInt(tab[0]);
		//int month = Integer.parseInt(tab[1]);
		
		//System.out.println("day: "+day+" month: "+month);
		System.out.println(tab[0]+" "+tab[1]);
	
	}
	
	public String[] testRegexWithGroups(String date) throws NullPointerException {
		Pattern pattern = Pattern.compile("(\\d{1,2})/(\\d{1,2})");
		// (?<day>)(\\d{1,2})/(?<month>)(\\d{1,2})
		Matcher matcher = pattern.matcher(date);
		String[] dateTab = new String[2];
		if(matcher.find()) {
			dateTab[0] = matcher.group(1);
			dateTab[1] = matcher.group(2);
		}
		if(dateTab[0]!=null && dateTab[1]!=null) {
			return dateTab;
		} 
		 return null;
		}
	}

