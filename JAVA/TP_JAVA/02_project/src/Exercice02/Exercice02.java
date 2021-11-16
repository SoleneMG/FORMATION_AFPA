package Exercice02;

public class Exercice02 {

    public static void main(String args[]) {
        item1();
        System.out.println();
        item2();
        System.out.println();
        item3();
        System.out.println();
        item4();
        System.out.println();
        item5();
    }

    public static void item1() {
        System.out.println("///////////////////////////////////// /nDébut Item1 : ");
        int x, y;
        x = 3;
        y = 2;

        double a = (double) x / (double) y;
        double f = a * y;

        System.out.println(a);
        System.out.println(f);
    }

    public static void item2() {
        System.out.println("///////////////////////////////////// /nDébut Item2 : ");
        int a = 1;
        int b = 1;
        System.out.println(a +"+"+ b + " = " + (a + b));
    }

    public static void item3() {
        System.out.println("///////////////////////////////////// /nDébut Item3 : ");
        byte c = 50;
        byte c2=70;
        byte d = 70;
        byte e;
        e = (byte) (c + d);
        byte f = (byte) (c2+d);
        System.out.println("Value de e : "+ e); 
        System.out.println("Value de f : "+ f); 
        // When max value of byte is reach -> the sign is inverted. Ex : byte >128 -> byte=-128 -127 -126 -125 etc...
        System.out.println("Max of byte : "+ Byte.MAX_VALUE+"\n Min of byte : "+Byte.MIN_VALUE); // byte max 128 signés
    }

    public static void item4() {
        System.out.println("///////////////////////////////////// /nDébut Item4 : ");
        System.out.printf("résultat du calcul : %.1f ", (20.1 + 16.8));
    }

    public static void item5() {
        System.out.println("///////////////////////////////////// /nDébut Item4 : ");
        System.out.println("Racine carré de 4 :" +Math.sqrt(4));
        System.out.println("Valeur cos(PI/2) :" +Math.cos(Math.PI/2));
        System.out.printf("Nombre aléatoire entre 1 et 10 : %.0f" , Math.random()*10+1);
    }
}
