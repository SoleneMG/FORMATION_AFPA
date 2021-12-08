import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> courses = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		
		courses = m.enterArticle((LinkedList<String>) courses, sc);
		m.displayCaddie((LinkedList<String>) courses);
		
		
		sc.close();
	}
	
	public void displayCaddie(LinkedList<String> courses) {
		Iterator<String> it = courses.iterator();
		System.out.println("CONTENU DU CADDIE");
		System.out.println("-----------------");
		while(it.hasNext()) {
			System.out.println(it.next());   
		}
	}
	
	public LinkedList<String> enterArticle(LinkedList<String> courses, Scanner sc) {
		boolean isContinue = true;
		do {
			System.out.println("Pour entrer un nouvel article : n");
			System.out.println("Pour sortir de l'application : q");
			String answer = sc.nextLine();
			if(answer.equals("q")) {
				isContinue = false;
			} else {
				System.out.println("Donnez votre choix :");
				courses.add(sc.nextLine());
			}
		
			
		} while (isContinue);
		return courses;
	}

}
