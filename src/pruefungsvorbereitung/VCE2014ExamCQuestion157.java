package pruefungsvorbereitung;
class X { public void foo() { System.out.print("X "); } } 

class SubB extends X {
	public void foo() throws RuntimeException {
		super.foo();
		if (true) throw new RuntimeException();
		System.out.print("B ");
	}
	public static void main() {
		new SubB().foo();
	}
}
public class VCE2014ExamCQuestion157 {
	X.main();
}
