/**
* item2 du TP 191
* @author afpa
* @version 1.0
*/
public class Item2 {
public static void main(String [] args) {

  /** ma premiere variable locale*/
  int a = 1;

  /** ma deuxièmevariable locale*/
  int b = 1;

System.out.println( a + b + "=" + a + b); //NOK
//System.out.println( "\"" + String.valueOf(a) +  " + " + String.valueOf(b) + " = " + (a + b) + "\"");


System.out.println( "\"" + a +  " + " + b + " = " + (a + b) + "\"");


  // Interdit de modifier les 3 lignes suivantes !
  byte c = 70;
  //byte d = 70; //valeur pour l'item3 //On dépasse les capacités d'un byte
  byte d = 50;

  byte e;
  
//e = c + d;
// Erreur à la compil:
//... possible loss of precision
//found   : int
//required: byte
// e = c + d;
//     ^
//1 error

  //On debugge :
  //e = c + d;
  //System.out.println("e= " + e);
  
  e = (byte) (c + d);
  System.out.println("e= " + e);
  
  System.out.println(  20.1 + 16.8 );//NOK
  // affichage: 36.900000000000006  //NOK
  
  System.out.println( (float )(20.1 + 16.8) );//OK
  // Explications ?
  
  // autre possibilité
  System.out.println(20.1f + 16.8f);
}}