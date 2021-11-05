package Exercice03;
public class Exercice03 {
    
    public static void main(String[] args){
        MyScanner sc = new MyScanner();
        String name;
        String firstName;
        String adress;
        int numberOfFNTECard;
        int numberOfFavoriteHorses = 3;
        String singularWordHorse = "horse";
        Horse horse;
        char again;
        
        do{
            name =  sc.returnStringWithoutSpecialCharactersAndNumbers("What is your name ? ");
            firstName = sc.returnStringWithoutSpecialCharactersAndNumbers("What is your firstName ? ");
            adress = sc.returnStringWithoutSpecialCharacters("What is your adress ? ");
            numberOfFNTECard = sc.returnInt("What is your number of you're FNTE card ? ");

            Horse[] horses = new Horse[numberOfFavoriteHorses];
            
            for (int start=1; start<=numberOfFNTECard; start++){
                String extensionOfNumber="st";
                String numberIncrement = String.valueOf(start);


                ////////////////////////////////////////////////////////
                // extension 1st 2nd 3rd 4th ....
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
                ///////////////////////////////////////////////////////

                ///////////////////////////////////////////////////////
                // use typo horse or horses 
                if(start>1) singularWordHorse = "horses";
                /////////////////////////////////////////////////////

                String horseName = sc.returnStringWithoutSpecialCharactersAndNumbers(String.format("What is name of the name of the %d%s horse ?", start, extensionOfNumber));
                horse = new Horse(horseName);
                horses[start-1]=horse;
            }
        
            Rider rider = new Rider(name, firstName, adress, numberOfFNTECard, horses);
            System.out.printf("Rider's name is : %s. His firstname is : %s.\n", rider.name, rider.firstName);
            System.out.printf("His adress is %s, his number of FNTE card is %d. \n", rider.adress, rider.numberOfFNTECard);
            System.out.printf("He has %d favorite %s. \n", numberOfFavoriteHorses, singularWordHorse);

            if(horses.length!=0){
                if(horses.length>1){
                    System.out.printf("Their names are : ");
                } else {
                    System.out.printf("His name is : ");
                }
                for(int i=0; i<horses.length;i++){
                    System.out.print(horses[i].name);
                    if(i==horses.length){
                        System.out.print(". \n");
                    }else {
                        System.out.print(", ");
                    }
                }
            }
           
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