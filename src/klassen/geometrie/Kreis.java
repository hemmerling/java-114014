package geometrie;

public class Kreis {

	private int radius;
	
	public Kreis ( int radius ) {
		this.radius = radius;
	}
	
	public int getMasze(){
		return radius;
	}

	public String makeKreis() {
		return "Kreis. R = " + this.getMasze();		
	}
	
	public static void main(String[] args) {
		Kreis kreis = new Kreis(5);
		System.out.println(kreis.makeKreis());
		// TODO Auto-generated method stub

	}

}
