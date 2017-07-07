package pruefungsvorbereitung;

abstract class A7 {
	abstract void a1();
	void a2() { }
}

class B7 extends A7 {
	void a1() { }
	void a2() { }
}

class C7 extends B7 { void c1() { } } 

public class VCE2014ExamCQuestion204 {
	public static void main(String[] args) {
		A7 x = new B7(); 
		C7 y = new C7(); 
		A7 z = new C7();
		
		x.a2();
		z.a2();
		//z.c1(); // The method c1() is undefined for the type A7
		z.a1();
		y.c1();  // No polymorphic method call ( aber compiliert + läuft )
		x.a1();
	}
}
