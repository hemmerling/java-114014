package pruefungsvorbereitung;

class A {
	void foo() throws Exception { throw new Exception(); }
}

class SubB2 extends A {
	void foo() { System.out.println("B2 "); }
}

class SubB3 extends A {
	void foo() { 
		try {
			System.out.println("B3 ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class SubB4 extends A {
	void foo() throws Exception { System.out.println("B4 "); }
}
		

class Tester {
	public static void main(String[] args) {
		A a1 = new SubB2();
		// a1.foo();
		try {
			a1.foo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		SubB2 ab2 = new SubB2();
		ab2.foo();
		
		A a3 = new SubB3();
		// a3.foo();
		SubB3 ab3 = new SubB3();
		ab3.foo();

		A a4 = new SubB4();
		// a4.foo();
		try {
			a4.foo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class VCE2014ExamCQuestion151 {
	public static void main(String[] args) {
	}
}
