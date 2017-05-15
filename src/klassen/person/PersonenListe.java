package klassen.person;

import java.util.Iterator;

// Top-Level Klasse
class Filter3 {

	Person person;
	
	public Filter3(Person person) {
		this.person = person;
	}
	
    public boolean accept(Person person){
    	boolean result;
    	//result = this.person.compareTo(person) == 0;
    	result = person.getNachname().length() <= this.person.getNachname().length();
    	return result;
    	
    }

}

public class PersonenListe implements Iterable<Person> {
	
	private static final int MAX_CAPACITY = 4;
	private int nextFreePos = 0;
	private Person[] personen = new Person[MAX_CAPACITY];
	
	// Innere Klasse
	public static class Filter2 {

		Person person;
		
		public Filter2(Person person) {
			this.person = person;
		}
		
	    public boolean accept(Person person){
	    	boolean result;
	    	//result = this.person.compareTo(person) == 0;
	      	result = person.getNachname().contains(this.person.getNachname());
	    	return result;	    	
	    }

	}
		
	public boolean add(Person person){
		boolean result = false;
		if (nextFreePos < MAX_CAPACITY) {
			personen[nextFreePos] = person;
			result = true;
		}
		nextFreePos++;
		return result;
	}
	
    public Person[] filtern(Person[] personenListe, Filter filter) {
    	Person[] result = new Person[4];
    	int jj = 0;
    	for ( Person ii: personenListe) {
    		if (filter.accept(ii)) {
    			result[jj++] = ii;
    		}
    	}
    	return result;
    }
 
    public Person[] filtern2(Person[] personenListe, Filter2 filter2) {
    	Person[] result = new Person[4];
    	int jj = 0;
    	for ( Person ii: personenListe) {
    		if (filter2.accept(ii)) {
    			result[jj++] = ii;
    		}
    	}
    	return result;
    }
    
    public Person[] filtern3(Person[] personenListe, Filter3 filter3) {
    	Person[] result = new Person[4];
    	int jj = 0;
    	for ( Person ii: personenListe) {
    		if (filter3.accept(ii)) {
    			result[jj++] = ii;
    		}
    	}
    	return result;
    }
	
	public Iterator<Person> iterator() {
		return new PersonenListeIterator(personen);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = true;
		PersonenListe personenListe = new PersonenListe();
		System.out.println(personenListe.add(new Person("Peter", "Braun", 1960)));
		System.out.println(personenListe.add(new Person("Michael", "Roth", 1960)));
		System.out.println(personenListe.add(new Person("Paul", "Smith", 1962)));
		System.out.println(personenListe.add(new Person("Paul", "Smith-Brown", 1963)));

		// list must be either "array" or "iterable"
		// Solution with array
		for(Person person : personenListe.personen) {
			System.out.println("Person: "+person);
		}
		
		// Solution with Iterator
		Iterator<Person> iterator = personenListe.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println("Person: "+person);
		}
		
		System.out.println("-------------");
		
		Filter filter = new Filter(new Person("", "", 1962));
		Person[] personenGefiltert = personenListe.filtern(personenListe.personen, filter);
		for(Person person : personenGefiltert) {
			System.out.println("Gefilterte Person: "+person);
		}
		
		System.out.println("-------------");
		
		Filter2 filter2 = new Filter2(new Person("", "a", 0));
		personenGefiltert = personenListe.filtern2(personenListe.personen, filter2);
		for(Person person : personenGefiltert) {
			System.out.println("Gefilterte Person: "+person);
		}

		System.out.println("-------------");
		
		Filter3 filter3 = new Filter3(new Person("", "1234567890", 0));
		personenGefiltert = personenListe.filtern3(personenListe.personen, filter3);
		for(Person person : personenGefiltert) {
			System.out.println("Gefilterte Person: "+person);
		}

			
	}

}
