package klassen.person;

import java.util.Comparator;

public class PersonReverseComparator implements Comparator<Person> {

	public int compare(Person person1, Person person2) {
		return person2.compareTo(person1);
	}

}