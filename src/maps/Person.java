package maps;

public class Person {

	
	// Hascode und equals sinnvoll ueberschreiben, siehe Package "set" des Dozenten
	
	String vorname;
	String nachname;

	Person(String vorname, String nachname ) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public String toString() {
		return this.vorname + " " + this.nachname;
	}
	
	@Override
	public int hashCode() {
		int result;
		// Soll bessere Alternative sein?!
		result = vorname.concat(nachname).hashCode();
		// Einfacher Gestaltung, soll nicht so gut sein?!
		// result = vorname.hashCode() + nachname.hashCode();
		return result; 
	}
	
	//- korrekte equals Methode soll die Objekte nach Inhalten vergleichen
	@Override
	public boolean equals(Object obj) {
		if( !(obj instanceof Person ) ) {
			return false;
		}
		
		Person p2 = (Person) obj;
		return vorname.equals(p2.vorname) && nachname.equals(p2.nachname);
	}

}
