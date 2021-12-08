package demo;

import java.util.LinkedList;
import java.util.List;

public class Test4_transtypageDesc_transtypageImpossible {

public static void main(String[] args) {

	/////////////////////////////////////////////////////
	// Transtypage-ascendant, Transtypage-descendant, Transtypage-impossible 
	//	ave  ArrayList, LinkedList, List
	//
	/////////////////////////////////////////////////////
	System.out.println("\nTranstypage-ascendant, Transtypage-descendant, Transtypage-impossible");
	System.out.println("\tArrayLis, LinkedList, List");
	System.out.println("-----------------------------------------------");
	
	///////////////////////////////////////////////////////
	// Transtypage-ascendant  ou up-casting //Barbara LISKOV
	// Cast implicite, pas besoin de mettre le cast
	///////////////////////////////////////////////////////	
	// up-casting sur une classe mère
	//AbstractList<Integer> cl = (AbstractList<Integer>) new ArrayList<Integer>();// cast non nécessaire//Transtypage implicite
	//AbstractList<Integer> cl = new ArrayList<Integer>();

	// up-casting sur une interface implémentée
	//List<Integer> cl = (List<Integer> )new ArrayList<Integer>();// cast non nécessaire//Transtypage implicite
	//List<Integer> cl = new ArrayList<Integer>();//List interface !
		
	// up-casting sur une interface implémentée
	//List<Integer> cl = (List<Integer> )new LinkedList<Integer>();// cast non nécessaire//Transtypage implicite
	List<Integer> cl = new LinkedList<Integer>();
	
	//On ajoute les objets  5 6 7 8 9 10
	for(int i=5; i<=10; i++)
		cl.add(i);

	System.out.println("\nMa collection d'Integer :" + cl);
	
/*  cl2.push((Integer)7);
	System.out.println("Je push 7, Ma collection d'Integer :" + cl);

	cl2.addFirst(89);
	cl2.addLast(12);
	System.out.println("prem 89 dern 12 , Ma collection d'Integer :" + cl);
	
	cl2.push((Integer)7);
	
	System.out.println("Je push 7, Ma collection d'Integer :" + cl);
	
	System.out.println("J'énumère ma collection avec le foreach");
	for( Integer f : cl2)
		System.out.print( " " + f);*/
	
	//////////////////////////////
	// copie de référence (rappel)
	// On utilise une deuxième référence  cl2
	List<Integer> cl2 =  cl;
	System.out.println("Ma collection cl2  :" + cl2 +"\n");

	////////////////////////////////////////////////
	// Transtypage-descendant  ou down-casting
	// Cast explicite //point chaud du code
	////////////////////////////////////////////////

	//LinkedList<Integer> cl2 =   (LinkedList<Integer> )cl;



	///////////////////////////////////////////////
	// Transtypage-impossible 
	// Cast explicite //point chaud du code
	//--> ClassCastException
	///////////////////////////////////////////////
	//Passe bien à la compile mais il y a une anomalie au Runtime ClassCastException
	//Attention a ne pas faire un transtypage-impossible  //point chaud
	
	//ArrayList<Integer> cl2 = (ArrayList<Integer> )cl;
	
	//System.out.println("Ma collection cl2  :" + cl2 +"\n");
}}
