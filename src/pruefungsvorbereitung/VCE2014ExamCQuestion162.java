package pruefungsvorbereitung;

class Tahiti {
	Tahiti t;
	public static void tahiti() {
		Tahiti t = new Tahiti();
		Tahiti t2 = t.go(t);
		t2 = null;
		// more code here
	}

	Tahiti go(Tahiti t) {
		Tahiti t1 = new Tahiti(); Tahiti t2 = new Tahiti();
		t1.t = t2; t2.t = t1; t.t = t2;
		return t1;
	}
}

public class VCE2014ExamCQuestion162 {
	public static void main(String[] args) {
		Tahiti.tahiti();
	}
}
