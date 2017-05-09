package klassen.geometrie;

public class Kreis extends GeometrischesObjekt implements FlaechenObjekt {

	public int radius;
	
	public Kreis ( int radius ) {
		this.radius = radius;
		this.name = "Kreis";
	}
	
	public int getMasze(){
		return radius;
	}

	public String makeKreis() {
		return "Kreis. R = " + this.getMasze();		
	}

	public String getName() {
		return this.name + " " + radius;
	}

	public int getFlaeche(){
		return (int)(this.radius * this.radius * Math.PI);
	}
	
	public int compareTo(Kreis aKreis)
	{
	    if(this.radius == aKreis.radius)
	        return 0;
	    else 
	        return -1;
	}
	
	public static void main(String[] args) {
		Kreis kreis = new Kreis(5);
		kreis.name = "Kreis";
		System.out.println(kreis.makeKreis());
		// TODO Auto-generated method stub

	}

}
