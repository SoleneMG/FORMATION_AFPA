import java.io.Closeable;
import java.util.Scanner;

    public class MyScanner implements Closeable{
        Scanner sc;
        
        MyScanner() {
            sc = new Scanner(System.in);
        }
        
        public int returnInt(String question){
            System.out.print(question);
            try{
                return sc.nextInt();
            } catch (Exception exception){
                System.out.println("Wrong entry please retry");
                return returnInt(question);
            } finally {
                sc.nextLine();
            }
        }
        
        public String returnStringWithoutSpecialCharactersAndNumbers(String question){
            System.out.print(question);
            String answer = sc.nextLine();
            if( !(answer.matches("[a-zA-Z]+")) ){
                System.out.println("Only alphabetic characters are permitted. Please retry");
                return returnStringWithoutSpecialCharactersAndNumbers(question);
            }
            return answer;
        }

        public String returnStringWithoutSpecialCharacters(String question){
            System.out.print(question);
            String answer = sc.nextLine();
            if( !(answer.matches("[a-zA-Z0-9]+")) ){
                System.out.println("Only alphabetic characters are permitted. Please retry");
                return returnStringWithoutSpecialCharactersAndNumbers(question);
            }
            return answer;
        }
      
        public char returnChar(String question){
            System.out.print(question);
            String answer = sc.nextLine();
            if( !(answer.matches("[a-zA-Z]")) ){
                System.out.println("Wrong entry please retry");
                return returnChar(question);
            }
            return sc.next().charAt(0);
        }
        
        @Override
        public void close() {
            try {
                sc.close();
                System.out.println("Your scanner is closed !");
            } catch (Exception e) {
                System.out.println("Oopsie doopsie something is wrong with closure of your scanner !");
            }
        }
    }
    