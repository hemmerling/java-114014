package pruefungsvorbereitung;

class A {
	void foo() throws Exception { throw new Exception(); }
}
class SubB2 extends A {
	void foo() { System.out.println("B "); }
}
public class VCE2014ExamCQuestion216 {
	public static void main(String[] args) {
		A a = new SubB2(); // Unhandled exception type Exception
		a.foo(); 
	}
}

