package klasse.vererbung;

public class Hund extends Tier {

	public Hund(String name, int alter, boolean gesund){
		this.name = name;
		this.alter = alter;
		this.gesund = gesund;
	}
	
	@Override
	public String laufen() {
		return this.getClass().getSimpleName()+" "+this.name+" läuft";
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		String name = "Rex";
		int alter = 5;
		boolean gesund = true;
		Hund hund = new Hund(name, alter, gesund);
		System.out.println(hund.laufen());
		// TODO Auto-generated method stub
		System.out.println(hund.print());
	}

}
