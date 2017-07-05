package pruefungsvorbereitung;

class Atom5 {
	Atom5() { 
		System.out.print("atom "); 
	}

	Atom5(String type) { 
		System.out.print(type); 
	}
}

class Rock5 extends Atom5 {
	Rock5(String type) { 
		super(); // implizit
		//super(type);
		System.out.print(type); 
	}
}

class Mountain5 extends Rock5 {
	Mountain5() {
		super("granite ");
		new Rock5("granite ");
	}
}

public class VCE2014ExamCQuestion182 {
	public static void main(String[] args) { 
		new Mountain5(); 
	}
}
