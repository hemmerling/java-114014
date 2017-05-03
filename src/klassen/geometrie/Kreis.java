package klassen.geometrie;

public class Kreis extends GeometrischesObjekt  {

	private int radius;
	
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

	public static void main(String[] args) {
		Kreis kreis = new Kreis(5);
		kreis.name = "Kreis";
		System.out.println(kreis.makeKreis());
		// TODO Auto-generated method stub

	}

}
