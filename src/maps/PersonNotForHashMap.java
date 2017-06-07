package maps;

public class PersonNotForHashMap {

	String vorname;
	String nachname;

	PersonNotForHashMap(String vorname, String nachname ) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public String toString() {
		return this.vorname + " " + this.nachname;
	}
	
	@Override
	public int hashCode() {
		return vorname.hashCode() + nachname.hashCode();
	}
}
