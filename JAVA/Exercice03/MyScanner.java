package Exercice03;
import java.io.Closeable;
import java.util.Scanner;

    public class MyScanner implements Closeable{
        Scanner sc;
        
        MyScanner() {
            sc = new Scanner(System.in);
        }
        
        public int returnInt(String question){
            int answer;
            System.out.print(question);
            try{
                answer = sc.nextInt();
                sc.nextLine();
            } catch (Exception exception){
                System.out.println("Only number are permitted. Please retry");
                sc.nextLine();
                return returnInt(question);
            } finally{
                System.out.println("Finally coucou");
            }
            return answer;
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

        public String returnAdress(String question){
            System.out.print(question);
            return sc.nextLine();
        }
      
        public char returnChar(String question){
            System.out.print(question);
            String answer = sc.nextLine();
            if( !(answer.matches("[a-zA-Z]")) ){
                System.out.println("Wrong entry please retry");
                return returnChar(question);
            }
            return sc.nextLine().charAt(0);
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

