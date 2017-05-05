package klasse.vererbung;

public class Katze extends Tier {

	public Katze(String name, int alter, boolean gesund){
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
		String name = "Tom";
		int alter = 2;
		boolean gesund = true;
		Katze katze = new Katze(name, alter, gesund);
		System.out.println(katze.laufen());
		System.out.println(katze.print());
		// TODO Auto-generated method stub
	}

}

