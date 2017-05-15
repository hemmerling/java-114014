package klasse.person2;

public class Person {
	
	private String vorname, nachname;
	private int geburtsjahr;

	public Person(String vorname, String nachname, int geburtsjahr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	@Override
	public String toString() {
		return vorname + " " + nachname + ", " + geburtsjahr;
	}
	
}
