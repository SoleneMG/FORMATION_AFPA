import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> directory = new HashMap<>();
		directory.put("Paul", "0686427733");
		directory.put("Gunter", "0605428521");
		directory.put("Moham", "0686867765");
		System.out.println("Map non trié = HashMap"+directory);

		TreeMap<String,String> directoryTrie = sortAMap(directory);
		System.out.println("Map triée par clef = TreeMap"+directoryTrie);
		
		writeToFile(directoryTrie, "file1.txt");
		@SuppressWarnings("unchecked")
		TreeMap<String,String> deserialized = (TreeMap<String, String>) readFromFile("file1.txt");
		System.out.println("Deserialized : " +deserialized);

		
//	keySet -> Créer une collection de type Set<K> sur laquelle on itère.
		Set<String> prenoms = directoryTrie.keySet();
		Iterator<String> it = prenoms.iterator();
		System.out.println("Iteration sur la treeMap : \n");
		while (it.hasNext()) {
			String prenom = it.next();
			System.out.print(" "+prenom + " " + directory.get(prenom));

		}
	}
	
	
	/**
	 * Méthode qui trie une map en fonction de la nature de la clé
	 * 
	 * @param <K> key
	 * @param <V> value
	 * @param map Map<K,V> 
	 * @return TreeMap<K,V>
	 */
	public static <K,V> TreeMap<K,V> sortAMap(Map<K, V> map) {
//		TreeMap<String, String> directoryTrie = new TreeMap<>();
//		directoryTrie.put("Paul", "0686427733");
//		directoryTrie.put("Gunter", "0605428521");
//		directoryTrie.put("Moham", "0686867765");
		
		TreeMap<K, V> treeMap = new TreeMap<K, V>();
		treeMap.putAll(map);
		return treeMap;
	}
	
/**
 * Methode qui sérialise un objet
 * 
 * @param object object to serialize
 * @param fileName specify the name's file to write to
 * @return true if object has been serialized
 */
	public static boolean writeToFile(Object object, String fileName) {
		FileOutputStream file;
		ObjectOutputStream out = null;
		boolean isSuccess = true;
		try {
			file = new FileOutputStream(fileName);
			out = new ObjectOutputStream(file);
			out.writeObject(object);
			out.flush();
		} catch (FileNotFoundException e) {
			System.out.println("Fichier introuvable");
			isSuccess = false;
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problème sur le flux sortant");
			isSuccess = false;
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				System.out.println("Erreur lors de la fermeture");
				e.printStackTrace();
			}
		}
		return isSuccess;
	}
	
	
	/**
	 * Methode qui désérialise un objet
	 * 
	 * @param object object to deserialize
	 * @param fileName specify the name's file to read in
	 * @return true if object has been deserialized
	 */
	public static Object readFromFile(String fileName) {
		FileInputStream file = null;
		ObjectInputStream in = null;
		Object result = null;
		boolean isSuccess = true;
		try {
			file = new FileInputStream(fileName);
			in = new ObjectInputStream(file);
			result = (Object) in.readObject();
		} catch (IOException e) {
			System.out.println("Problème sur le flux sortant");
			isSuccess = false;
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Classe introuvable");
			isSuccess = false;
			e.printStackTrace();
		} finally {
			try {
				in.close();
				file.close();
			} catch (IOException e) {
				System.out.println("Erreur lors de la fermeture");
				e.printStackTrace();
			}
		}
		return result;
	}


}
