package Exercice03;
public class Exercice03 {
    
    public static void main(String[] args){
        MyScanner sc = new MyScanner();
        String name;
        String firstName;
        String adress;
        String numberOfFNTECard="null";
        int numberOfFavoriteHorses = 3;
        String singularWordHorse = "horse";
        Horse horse;
        char again;
        
        do{
            name =  sc.returnStringWithoutSpecialCharactersAndNumbers("What is your name ? ");
            firstName = sc.returnStringWithoutSpecialCharactersAndNumbers("What is your firstName ? ");
            adress = sc.returnString("What is your adress ? ");
            do{
                numberOfFNTECard = sc.returnString("What is your number of you're FNTE card ? ");
                if(! (numberOfFNTECard.matches("^[0-9]{4}-[a-zA-Z]{1}[0-9]{1}$")) ){
                    System.out.println("Incorrect format of number of FNTE card");
                    numberOfFNTECard = "null";
                } 
            }while(numberOfFNTECard.equals("null"));
            
            
            Horse[] horses = new Horse[numberOfFavoriteHorses];
            
            for (int start=1; start<=numberOfFavoriteHorses; start++){
                String extensionOfNumber="st";
                String numberIncrement = String.valueOf(start);
                
                
                ////////////////////////////////////////////////////////
                // extension 1st 2nd 3rd 4th ....
                if( !(numberIncrement.equals("0")) ){
                    
                    if(numberIncrement.matches("^*1$")){
                        extensionOfNumber = "st";
                    }
                    if(numberIncrement.matches("^*2$")){
                        extensionOfNumber = "nd";
                    }
                    if(numberIncrement.matches("^*3$")){
                        extensionOfNumber = "rd";
                    }
                } else {
                    extensionOfNumber="th";  
                }
                ///////////////////////////////////////////////////////
                
                ///////////////////////////////////////////////////////
                // use typo horse or horses 
                singularWordHorse = horses.length>1 ? "horses" : "horse";
                /////////////////////////////////////////////////////
                
                String horseName = sc.returnStringWithoutSpecialCharactersAndNumbers(String.format("What is name of the %d%s horse ? ", start, extensionOfNumber));
                horse = new Horse(horseName);
                horses[start-1]=horse;
            }
            
            Rider rider = new Rider(name, firstName, adress, numberOfFNTECard, horses);
            System.out.printf("Rider no %d \n\t %s %s \n\t %s \n", rider.numberOfFNTECard , rider.firstName, rider.name, rider.adress);
            
            if(horses.length!=0){
                System.out.print("\t"+singularWordHorse.replaceFirst(".", (singularWordHorse.charAt(0)+"").toUpperCase()) +" : ");
                for(int i=0; i<horses.length;i++){
                    System.out.print(horses[i].name+" ");
                }
            }
            
            again = sc.returnChar("\n Do you want continue ? Please enter y (yes) or n (no) : ");
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