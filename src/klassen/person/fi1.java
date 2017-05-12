package klassen.person;

public class fi1 {

	Person person;
	
	public fi1(Person person) {
		this.person = person;
	}
	
    public boolean accept(Person person){
    	boolean result;
    	//result = this.person.compareTo(person) == 0;
    	result = this.person.getGeburtsjahr() >= person.getGeburtsjahr();
    	return result;    	
    }

}
