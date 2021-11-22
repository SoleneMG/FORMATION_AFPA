package ex2.chap09_enum.Enumcomp;
import java.io.* ;

public class EnumLire
{ public static void main (String args[])
  { String chJour ;
    System.out.print("Donnez un jour de la semaine : ");
    chJour = Clavier.lireString () ;
    {
      // première démarche : provoque une exception si la valeur de chJour
      //                     ne représente pas une valeur de type Jour
      Jour courant = Jour.valueOf (chJour) ;  // ou :   Jour courant = Enum.valueOf (chJour) ;
      int numJour = courant.ordinal();
      System.out.println("Methode 1 : " + courant + " est le jour de rang  " + numJour);


      // deuxième démarche
      for (Jour j : Jour.values())
      { if (chJour.equals(j.toString() ) )
        { numJour = j.ordinal() ;
          System.out.println("Methode 2 : " + courant + " est le jour de rang  " + numJour);
        }
      }

    }

  }

}
/*
 Donnez un jour de la semaine : mercredi
 Methode 1 : mercredi est le jour de rang  2
 Methode 2 : mercredi est le jour de rang  2
*/
