package klassen.person;

public class Person {

	private String vorname, nachname, postleitzahl;
	private int geburtsjahr;
	
	public Person(String vorname, String nachname, String postleitzahl, int geburtsjahr){
		this.vorname = vorname;
		this.nachname = nachname;
		this.postleitzahl = postleitzahl;
		this.geburtsjahr = geburtsjahr;		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
