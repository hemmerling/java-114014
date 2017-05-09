package klassen.person;

public class Personen {

	public Person[] liste = { Person("Paul Smith"), Person("Paul Black"), 
				              Person("John Smith"), Person("John Black") };

	public Personen[] getListe(){
		return this.liste;
	}
	
	public String display(){
		String result = "";
		for ( Person ii: liste) {
			result += ii.getVorname() + " " + ii.getNachname() + "\n";
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
