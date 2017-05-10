package klassen.person;

import java.util.Iterator;

public class PersonenListe implements Iterable<Person> {
	
	private static final int MAX_CAPACITY = 2;
	private int nextFreePos = 0;
	private Person[] personen = new Person[MAX_CAPACITY];
	
	public boolean add(Person person){
		boolean result = false;
		if (nextFreePos < MAX_CAPACITY) {
			personen[nextFreePos] = person;
			result = true;
		}
		nextFreePos++;
		return result;
	}
	
	public Iterator<Person> iterator() {
		return new PersonenListeIterator(personen);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = true;
		PersonenListe list = new PersonenListe();
		System.out.println(list.add(new Person("Peter", "Braun")));
		System.out.println(list.add(new Person("Michael", "Roth")));
	
		// list must be either "array" or "iterable"
		// Solution with array
		for(Person person : list.personen) {
			System.out.println("Person: "+person);
		}
		
		// Solution with Iterator
		Iterator<Person> iterator = list.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println("Person: "+person);
		}

	}

}
