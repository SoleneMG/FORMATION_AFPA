import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		System.out.println("\nInformations sur le système d'exploitation : ");
		properties.entrySet().stream().filter(it -> it.getKey().toString().contains("os")).forEach(System.out::println);
		System.out.println("\nInformations sur la machine virtuelle : ");
		properties.entrySet().stream().filter(it -> it.getKey().toString().contains("vm")).forEach(System.out::println);
		System.out.println("\nInformations sur l'utilisateur : ");
		properties.entrySet().stream().filter(it -> it.getKey().toString().contains("user")).forEach(System.out::println);
		

	}

}
