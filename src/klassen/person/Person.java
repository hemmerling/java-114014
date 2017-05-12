package klassen.person;

public class Person implements Comparable<Person> {
	
	private String vorname, nachname, postleitzahl;
	private int geburtsjahr;
	
	public Person(String vorname, String nachname, String postleitzahl, int geburtsjahr){
		this.vorname = vorname;
		this.nachname = nachname;
		this.postleitzahl = postleitzahl;
		this.geburtsjahr = geburtsjahr;		
	}

	public Person(String vorname, String nachname, int geburtsjahr){
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;		
	}

	public Person(String vorname, String nachname){
		this.vorname = vorname;
		this.nachname = nachname;
 	}
	
	public Person(){
		}
	
    public String getVorname(){
    	return this.vorname;
    }
    
    public void setVorname( String vorname ){
		this.vorname = vorname;    	
    }

    public String getNachname(){
    	return this.nachname;
    }
    
    public void setNachname( String nachname ){
		this.nachname = nachname;    	
    }

    public String getPostleitzahl(){
    	return this.postleitzahl;
    }
    
    public void setPostleitzahl( String postleitzahl ){
		this.postleitzahl = postleitzahl;    	
    }

    public int getGeburtsjahr(){
    	return this.geburtsjahr;
    }
    
    public void setGeburtsjahr( int geburtsjahr ){
		this.geburtsjahr = geburtsjahr;    	
    }
    
    // The type Person must implement the inherited abstract method Comparable<Person>.compareTo(Person)
	//@Override
	public int compareTo(Person person) {
		int result = nachname.compareTo(person.nachname);
		
		if(result == 0) {
			result = vorname.compareTo(person.vorname);
			if(result == 0) {
				// pre-Java 1.7
				Integer geburtsjahr1 = this.geburtsjahr;
				Integer geburtsjahr2 = person.geburtsjahr;
				result = geburtsjahr1.compareTo(geburtsjahr2); 
				// Java 1.7
				// result = Integer.compare(this.geburtsjahr, person.geburtsjahr);
			}
		}
		
		return result;
	}
	
	@Override
	public String toString(){
		return this.vorname + " " + this.nachname;    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
