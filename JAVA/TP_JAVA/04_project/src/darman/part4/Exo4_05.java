package darman.part4;

import java.util.Scanner;

public class Exo4_05 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Les habitants de Zorglub paient l�imp�t selon les r�gles suivantes : les
	 * hommes de plus de 20 ans paient l�imp�t les femmes paient l�imp�t si elles
	 * ont entre 18 et 35 ans les autres ne paient pas d�imp�t Le programme
	 * demandera donc l��ge et le sexe du Zorglubien, et se prononcera donc ensuite
	 * sur le fait que l�habitant est imposable.
	 */

	public static void main(String[] args) {
		int age;
		int sexe;
		
		do {
		System.out.println("Quel est votre �ge ? ");
		age = sc.nextInt();
		sc.nextLine();
		} while (age <0);

		do {
		System.out.println("�tes vous \nun homme (1) \nune femme (2) ");
		sexe = sc.nextInt();
		sc.nextLine();
		} while (sexe < 0 || sexe > 2);
		
		if(sexe == 2) {
			if(age >=18 && age <36) {
				System.out.println("Vous �tes imposable");
			} else {
				System.out.println("Vous n'�tes pas imposable");
			}
		} else if(sexe ==1) {
			if(age>=20) {
				System.out.println("Vous �tes imposable");
			} else {
				System.out.println("Vous n'�tes pas imposable");
			}
		} else {
			/**
			 * Les hermaphrodites ne sont pas trait�s par ce cas. Sorry boy or female hum both
			 */
			System.out.println("Et si on recommen�ait pour voir ?");
		}

		sc.close();

	}
}
