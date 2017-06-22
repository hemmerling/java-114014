package pruefungsvorbereitung;

class Atom {
	Atom() { System.out.print("atom "); }
}

class Rock extends Atom {
	Rock(String type) { System.out.print(type); }
}

public class VCE2014ExamCQuestion011 extends Rock {
	VCE2014ExamCQuestion011() {
		super("granite ");
		new Rock("granite ");
	}
	public static void main(String[] a) { new VCE2014ExamCQuestion011(); }
}

