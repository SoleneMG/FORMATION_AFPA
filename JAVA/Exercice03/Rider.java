package Exercice03;
public class Rider {
    public final String name;
    public final String firstName;
    public final String adress;
    public final String numberOfFNTECard;
    public final Horse[] horses;

    public Rider(String name, String firstName, String adress, String numberOfFNTECard, Horse[] horses){
        this.name = name;
        this.firstName = firstName;
        this.adress = adress;
        this.numberOfFNTECard = numberOfFNTECard;
        this.horses = horses;
    }
    
}
