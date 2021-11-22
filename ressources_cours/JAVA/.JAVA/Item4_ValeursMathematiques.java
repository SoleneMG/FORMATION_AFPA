/**
* item4 du TP 191
* @author afpa
* @version 1.0
*/
class Item4_ValeursMathematiques
{
  public static void main (String[] args)
  {
    // Le caractere Unicode de la lettre grec pi est \u03c0
String texte = "\u03c0 = " + Math.PI + "\n";

texte = texte + "e = " + Math.E + "\n";

//texte += "A = " + 65 + "\n";
//texte += "A = " + (char)65 + "\n";


double sinPiSur2 = Math.cos (Math.PI / 2.);
texte += "cos (\u03c0 / 2) = " + sinPiSur2 + "\n";

double sinPiSur4 = Math.sin (Math.PI / 4.);
texte += "sin (\u03c0 / 4) = " + sinPiSur4 + "\n";

double racineDe4 = Math.sqrt (4.);
// Le caractere Unicode du symbole de la racine carree est \u221a
texte += "\u221a 4 = " + racineDe4 + "\n";


double racineCarreeDe2Sur2 = Math.sqrt (2.) / 2.;
// Le caractere Unicode du symbole de la racine carree est \u221a
texte += "\u221a 2 / 2 = " + racineCarreeDe2Sur2 + "\n";


double logNeperienDeE = Math.log (Math.E);
texte += "ln (e) = " + logNeperienDeE + "\n";

texte += "5 nombres aléatoires entre 1 et 10 = " 
             + ((int )(Math.random() * 10 ) + 1) + "  "
             + ((int )(Math.random() * 10 ) + 1) + "  "
             + ((int )(Math.random() * 10 ) + 1) + "  "
             + ((int )(Math.random() * 10 ) + 1) + "  "
             + ((int )(Math.random() * 10 ) + 1)
             + "\n";

    javax.swing.JOptionPane.showMessageDialog (null, texte);
    System.exit(0);
  }
}
