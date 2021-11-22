/**
 * Item1 TP 191
 * @author afpa
 */
public class Item1_Division {
  public static void main(String [] args) {
    int x, y;
    x = 3;
    y = 2;
	
    //double a = x / y; //NOK
    double a = (double)x / y;
	System.out.printf("Valeur de a :%f\n" , a);
	
    double f = a * y;
    System.out.printf("Valeur de a*y: %.0f\n" , f);
  }
}
