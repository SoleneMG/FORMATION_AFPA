package demo.enumeration;

public class Test1_enum {
public static void main(String[] args) throws RuntimeException{

//enum FeuMulticolore{VERT,ORANGE,ROUGE;}//enumeration interne
	
//////////////////////////////////////////////////////////////////////////////
// Pr�sentation de l'�num�ration en Java
// Le Feu tricolor d'un passage � niveau - gestion de la barri�re et afficheur
//////////////////////////////////////////////////////////////////////////////
//DECLARATION
EnumFeuMulticolore feu;

//AFFECTATION
feu = EnumFeuMulticolore.VERT;//affectation
//feu = EnumFeuMulticolore.BLEU;//affectation
//feu = FeuMulticolore.BLEU;// Impossible à la compile!! car contrôle de la valeur 
//feu = "ORANGE";// Impossible � la compile!!  car contr�le de la valeur 
//feu = 6;// Impossible � la compile!!  car contr�le de la valeur 

//UTILISATION :AFFICHAGE et toString()
System.out.println("�tat du feu :" + feu );//un toString() par d�faut

/////////////////////////////////////////////////
//	if else-if else
//	TRAITEMENTS suivant la valeur de la variable
/////////////////////////////////////////////////
//UTILISATION :  == pour la comparaison (comme ... les primitifs )
System.out.println("test");
if (feu == EnumFeuMulticolore.VERT)
	//traitement
	System.out.println("\tOn l�ve la barri�re du passage à niveau");
else if( feu == EnumFeuMulticolore.ORANGE)
	System.out.println("\tSonnerie + n'avancez plus!");
else if( feu == EnumFeuMulticolore.ROUGE)
	System.out.println("\tOn baisse la barri�re");
else
	//Question: peut-on s'en passer?
	throw new RuntimeException("Cas non pr�vu");


System.out.println();

/////////////////////////////////////////////////
// Le switch et les �num�rations
// TRAITEMENTS
/////////////////////////////////////////////////
feu = EnumFeuMulticolore.ORANGE;//affectation
System.out.println("�tat du feu :" + feu );//un toString() par défaut
//UTILISATION:  le switch fonctionne !! 
System.out.println("le switch");
switch( feu ){
	case VERT:
		//traitement
		System.out.println("\tOn l�ve la barri�re du passage � niveau");
		break;
	case ORANGE:
		System.out.println("\tSonnerie + n'avancez plus!");
		break;
/*	case ROUGE:
		System.out.println("\tOn baisse la barri�re");
		break;*/
	default://Question: peut-on s'en passer?
		throw new RuntimeException("Cas non pr�vu");
}
System.out.println();

/////////////////////////////////////////////////
//Enum�rer les �tiquettes : foreach
/////////////////////////////////////////////////
System.out.println("Enum�ration des valeurs possibles avec foreach et values()");
System.out.print("\t");
//EnumFeuMulticolore.

for( EnumFeuMulticolore var : EnumFeuMulticolore.values() ){
	System.out.print("  " + var);
}
System.out.println();
System.out.println("Quel est l'ordre par d�faut?");


// EnumFeuMulticolore.values().iterator() ne fonctionne pas
//un StringBuffer
StringBuffer chaineAffichage = new StringBuffer();
for( EnumFeuMulticolore var: EnumFeuMulticolore.values() ){
	chaineAffichage.append("  " + var) ;
}
System.out.println("Enum�ration des valeurs possible avecs foreach et values()\n\t" + chaineAffichage + "<");
System.out.println();

/////////////////////////////////////////////////
//Avec de Java 8  ???
/////////////////////////////////////////////////
//EnumFeuMulticolore.values().
//EnumFeuMulticolore.forEach(.............
//java.util.stream.IntStream.of(t1).forEach( (e) -> System.out.print("  " + e) );// Internal iteration
//EnumFeuMulticolore.values().forEach((e) -> System.out.print("  " + e)  ); // Internal iteration
//EnumFeuMulticolore.values().forEach(System::print("  " + var) ); // Internal iteration

//EnumFeuMulticolore.forEach((e) -> System.out.print("  " + e) ); // Internal iteration
//EnumFeuMulticolore.forEach(System::print("  " + var) ); // Internal iteration


/////////////////////////////////////////////////
//Le parsing d'une saisie utilisateur
/////////////////////////////////////////////////
/*	String saisie = javax.swing.JOptionPane.showInputDialog(null, 
			"Entrez une de des valeurs  " + chaineAffichage + " :");
*/	
String saisie = "ROUGE";
feu = EnumFeuMulticolore.valueOf(saisie);
System.out.println("Votre choix :"+ feu);


/////////////////////////////////////////////////
//Utilisation d'une m�thode traitementFeu 
/////////////////////////////////////////////////
//traitementFeu(feu);

//public static void traitementFeu( EnumFeuMulticolore feu);

System.out.println();

//Le parsing d'une cha�ne
feu = EnumFeuMulticolore.valueOf("ROUGE");
System.out.println("valueOf() :" + feu);
System.out.println();
//traitementFeu(feu);
System.out.println();

}//main

private static void traitementFeu(EnumFeuMulticolore leFeu) {
	System.out.println("je suis dans la m�thode traitementFeu");
	
	switch( leFeu ){
		case VERT:
			//traitement
			System.out.println("\tOn l�ve la barri�re du passage � niveau");
			break;
		case ORANGE:
			System.out.println("\tSonnerie + n'avancez plus!");
			break;
		case ROUGE:
			System.out.println("\tOn baisse la barri�re");
			break;
		default://Question: peut-on s'en passer?
			throw new IllegalArgumentException("Cas non pr�vu");
	}
}//m. traitementFeu

}//class Test1_enum 




