package klassen.innere;

// Innere Klassen werden im SCJP Buch auf Seite SCJP 692-700 behandelt :-)

public class Rennwagen {

	private String name;
	private Fahrer fahrer;
	private static Motor motor;
	
	public Rennwagen(String name){
		this.name = name;
	}
	
	public static class Motor {
		private String name = "Motor";

		@Override
		public String toString(){
			return this.name;    	
	    }

	}
	
	/*
	 *   This class MUST be static, else there is the error message
	 *   "No enclosing instance of type Rennwagen is accessible. 
	 *   Must qualify the allocation with an enclosing instance of type Rennwagen"
	 */
	
	public static class Fahrer {
		private String vorname = ""; 
		private String nachname = "";
		
		public Fahrer(String vorname, String nachname) {
			this.vorname = vorname;
			this.nachname = nachname;
			motor = new Motor();
		}
		
		//@Override
		//public String toString(){
		//	return this.vorname + " " + this.nachname;    	
	    //}

	}
	
	public void setFahrer(Fahrer fahrer){
		this.fahrer = fahrer;
	}

	public Motor getMotor(){
		return this.motor;
	}

	@Override
	public String toString(){
		return this.name;    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rennwagen rw = new Rennwagen("Mercedes");
		
	    Rennwagen .Fahrer f = new Rennwagen.Fahrer("M.", "Schuhmacher");
	    rw.setFahrer(f);
	
	    Rennwagen.Motor m = rw.getMotor();
	
	    System.out.println(rw);		//Zeile A
	    System.out.println(m);		//Zeile B
	}

}
