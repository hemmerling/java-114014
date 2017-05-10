package klassen.person;

import java.util.Arrays;
import java.util.Comparator;

public class Personen {

	public Person[] liste = { new Person("Paul", "Smith", 1960), new Person("Paul", "Black", 1960), 
			new Person("John", "Smith", 1960), new Person("John", "Black", 1960), new Person("John", "Black", 1961) };

	public Person[] getListe(){
		return this.liste;
	}
	
	public String displayListe(){
		String result = "";
		for ( Person ii: liste) {
			result += ii.getVorname() + " " + ii.getNachname() + " " + ii.getGeburtsjahr() + "\n";
		}
		return result;
	}
	
	public Person[] sortListe(){
		// klassen.person.Person cannot be cast to java.lang.Comparable
		Arrays.sort(liste); 
		return liste;
	}

	public Person[] sortListeByComparator(){
		Comparator<Person> komparator = new PersonComparator();
		Arrays.sort(liste, komparator); 
		return liste;
	}
	public Person[] sortListeByReverseComparator(){
		Comparator<Person> komparator = new PersonReverseComparator();
		Arrays.sort(liste, komparator); 
		return liste;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personen personen = new Personen(); 
	    System.out.println(personen.displayListe());
	    // Natürlich aufsteigend
	    personen.sortListe();
	    System.out.println(personen.displayListe());		
	    // Absteigend;
	    personen.sortListeByReverseComparator();
	    System.out.println(personen.displayListe());
	    // Natürlich aufsteigend
	    personen.sortListeByComparator();
	    System.out.println(personen.displayListe());
	}

}
