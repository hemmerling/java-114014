package klassen.person;

// Toplevel-Klasse
public class Filter {

	Person person;
	
	public Filter(Person person) {
		this.person = person;
	}
	
    public boolean accept(Person person){
    	boolean result;
    	//result = this.person.compareTo(person) == 0;
    	result = this.person.getGeburtsjahr() >= person.getGeburtsjahr();
    	return result;
    	
    }

}
