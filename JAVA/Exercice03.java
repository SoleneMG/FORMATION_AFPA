public class Exercice03 {
    
    public static void main(String[] args){
        MyScanner sc = new MyScanner();
        String name;
        String firstName;
        String adress;
        int numberOfFNTECard;
        int numberOfFavoriteHorses = 3;
        Horse horse;
        char again;
        
        do{
            name =  sc.returnStringWithoutSpecialCharactersAndNumbers("What is your name ? ");
            firstName = sc.returnStringWithoutSpecialCharactersAndNumbers("What is your firstName ? ");
            adress = sc.returnStringWithoutSpecialCharacters("What is your adress ? ");
            numberOfFNTECard = sc.returnInt("What is your number of you're FNTE card ? ");

            for (int start=1; start<=numberOfFNTECard; start++){
                String extensionOfNumber;
                String numberIncrement = String.valueOf(start);
                
                    if(numberIncrement.matches("*[1]$")){
                        extensionOfNumber = "st";
                    }
                    if(numberIncrement.matches("*[2]$")){
                        extensionOfNumber = "nd";
                    }
                    if(numberIncrement.matches("*[3]$")){
                        extensionOfNumber = "rd";
                    }
                    if( !(numberIncrement.equals(0)) ){
                    extensionOfNumber="th";
                }
               
                String horseName = sc.returnStringWithoutSpecialCharactersAndNumbers(String.format("What is name of the name of the %d%s horse ?", start, numberIncrement));
                horse = new Horse(name)
            }

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