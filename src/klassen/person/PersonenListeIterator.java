package klassen.person;
import java.util.Iterator;

public class PersonenListeIterator implements Iterator<Person> {

	private int index;
	private Person[] personen;

	public PersonenListeIterator(Person[] personen) {
		this.personen = personen;
	}

	@Override
	public boolean hasNext() {
		return (index<personen.length) && (personen[index] != null);
	}

	@Override
	public Person next() {
		return personen[index++];
	}
}
