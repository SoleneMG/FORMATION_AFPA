import java.io.Closeable;
import java.io.IOException;

public class Exercice03 {
    
    public static void main(String[] args){
        MyScanner sc = new MyScanner();
        String name;
        String firstName;
        char again;
        
        do{
            name =  sc.returnStringWithoutSpecialCharactersAndNumbers("What is your name ? ");
            firstName = sc.returnStringWithoutSpecialCharactersAndNumbers("What is your firstName ? ");

            Rider rider = new Rider(name, firstName);
            System.out.printf("Rider's name is : %s and his firstname is : %s.", rider.name, rider.firstName +".\n");
            
            again = sc.returnChar("Do you want continue ? Please enter y (yes) or n (no) : ");
        } while(again=='y');

        sc.close();
        
    }
    /*
    public static void close(Closeable closeable){
        try {
            closeable.close();
        } catch (IOException e) {
            System.out.println("Can not close : "+ closeable + "IOException raised");
        }
    }
    */
}