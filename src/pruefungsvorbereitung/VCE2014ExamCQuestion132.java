package pruefungsvorbereitung;

abstract class C1 {
	public C1() { System.out.print(1); }
}

class C2 extends C1 {
	public C2() { System.out.print(2); }
}

class C3 extends C2 {
	public C3() { System.out.println(3); }
}

public class VCE2014ExamCQuestion132 {

	public static void main(String[] args) {
		new C2();
		System.out.println("\n************");
		new C3();
	}
}
