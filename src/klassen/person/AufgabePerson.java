package klassen.person;

public class AufgabePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.setVorname( "Hans" );
	    person1.setNachname( "Meyer" );
	    person1.setPostleitzahl("12345");
	    person1.setGeburtsjahr( 1950 );
	   
	    // Hans Meyer, Geburtsjahr: 1950, Plz: 12345
	    System.out.println ( person1.getVorname() + " " + person1.getNachname() + 
	    					 ", Geburtsjahr:" + person1.getGeburtsjahr() + 
	    					 ", Plz: " + person1.getPostleitzahl());

		Personen personen1 = new Personen();

	}

}
