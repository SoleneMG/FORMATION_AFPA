package ventou.test;
import java.util.Iterator;
import java.util.LinkedList;
import ventou.metier.*;
/* Mise en oeuvre d'une collection*/
public class TestCollection {
public static void main( String [] args ) {

LinkedList<Salarie> salaries = new LinkedList<>();


System.out.println( "\n------------------------------------------------------");
System.out.println ("AJOUT DE DEUX SALARIES  Dupond et Durand a la collection");

Salarie dupond = new Salarie("Dupond", 1000.0);
Salarie durand  = new Salarie("Durand", 1000);
salaries.add(dupond);
salaries.add(durand);


System.out.println( "\n------------------------------------------------------");
System.out.println ("AJOUT D'UN COMMERCIAL Despres avec un objectif de 10000 E");

Commercial despres = new Commercial("Despres", 780, 10000);
salaries.add(despres);

System.out.println( "\n--------------------------------------------------------");
System.out.println ("AJOUT D'UN COMMERCIAL Deschamps avec un objectif de 20000 E");

Commercial deschamps = new Commercial("Deschamps", 850, 20000);
salaries.add(deschamps);

System.out.println( "\n----------------------------------------------------");
System.out.println ("AFFICHAGE des salaries de la collection sur la console");

Iterator<Salarie> it = salaries.iterator();
while (it.hasNext()){
	System.out.println("\n=====================");
	System.out.println(it.next().toString());
}


System.out.println();

/*AUGMENTATION DU CHIFFRE D'AFFAIRE DES COMMERCIAUX*/
System.out.println ("\n-----------------------------------------------------------------------");
System.out.println ("BOUCLEZ 15 fois sur l'ajout d'une nouvelle vente de 1000E aux commerciaux");

for (int i = 0; i < 15; i++){

	for (Salarie si : salaries){
		
		if (si instanceof Commercial){
			Commercial ci = (Commercial )si;
			ci.nouvelleVente(1000.);
		}
		
	}
	
}

System.out.println( "\n----------------------------------------------------");
System.out.println ("AFFICHAGE des salaries de la collection sur la console");

it = salaries.iterator();
while (it.hasNext()){
	System.out.println("\n=====================");
	System.out.println(it.next().toString());
}




System.out.println( "\n-------------------------------------");
System.out.println ("AUGMENTEZ chacun des 4 salaries de 100E");

for (Salarie si : salaries){
	
	try {
		si.augmente(100.);
	} catch (SalarieException e) {
		//System.out.println(e.getMessage());
		System.out.println("Salarie:" + si.getNom() + " " + e);
	}
}


System.out.println( "\n----------------------------------------------------");
System.out.println ("AFFICHAGE des salaries de la collection sur la console");

it = salaries.iterator();
while (it.hasNext()){
	System.out.println("\n=====================");
	System.out.println(it.next().toString());
}

System.out.println("\n=====================");
System.out.println();

System.out.println( "\n----------------------------------------");
System.out.println ("\nSUPPRESSION DE Deschamps de la collection");

it = salaries.iterator();
while (it.hasNext()){
	System.out.println("\n=====================");
	if (it.next().getNom().equals("DESCHAMPS")){
		it.remove();
		break;
	}
}

System.out.println( "\n----------------------------------------------------");
System.out.println ("AFFICHAGE des salaries de la collection sur la console");

it = salaries.iterator();
while (it.hasNext()){
	System.out.println("\n=====================");
	System.out.println(it.next().toString());
}

System.out.println( "\n-------------------------------------------------");
System.out.println ("AFFICHER LA POSITION DE Despres dans la collection: " );

it = salaries.iterator();
while (it.hasNext()){
	System.out.println("\n=====================");
	Salarie si = it.next();
	if (si.getNom().equals("DESPRES")){
	
		System.out.println("Position de despres dans la collection (au sens classique d'une List) : " + (salaries.indexOf(si)));
		break;
	}
	
}


System.out.println( "\n----------------------------");
System.out.println( "DEMISSIONNER tous les Salariés");

it = salaries.iterator();
while (it.hasNext()){
	it.next().demissionne();
	}
	
System.out.println( "\n------------------------------------------------------");
System.out.println ("AFFICHAGE des 3 salaries de la collection sur la console");

it = salaries.iterator();
while (it.hasNext()){
	System.out.println("\n=====================");
	System.out.println(it.next().toString());
}
}}
//System.out.println("Position de despres dans la collection (au sens de la stack): " + salaries.search(si));
