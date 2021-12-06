package fr.afpa.util;

import java.time.LocalDate;
import java.time.Period;

public class UtilitaireBookstore {
	
	
	static public boolean isPretEnRetard (LocalDate dateEmpruntEffective, LocalDate maintenant, int dureeMaxPret) {
		int day = Period.between(dateEmpruntEffective, maintenant).getDays();
		return day >= dureeMaxPret ? true : false ;
	}
	
	static public boolean isPretEnRetard2 (LocalDate dateEmpruntEffective, LocalDate maintenant, int dureeMaxPret) {
		LocalDate dateButoirPourRendreLeLivre = dateEmpruntEffective.plusDays(dureeMaxPret);
		return dateButoirPourRendreLeLivre.isBefore(maintenant) || dateButoirPourRendreLeLivre.equals(maintenant)  ? true : false ;
	}
	

	static public int getAge (LocalDate birthday, LocalDate now) {
		//final DateTimeFormatter sf = DateTimeFormatter.ofPattern("dd/MM/YYYY") ;
		Period period = Period.between(birthday, now);
		return period.getYears();
		
	
		
		
	}

}
