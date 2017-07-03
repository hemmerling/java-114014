package pruefungsvorbereitung;

interface A { public void m1(); }

class B implements A {
}

class C implements A { 
	public void m1() { } 
}

class D implements A { 
	public void m1(int x) { } 
}

abstract class E implements A { 
}

abstract class F implements A { 
	public void m1() { } 
}

abstract class G implements A { 
	public void m1(int x) { } 
}

class H extends G { 
	public void m1() { } 
	public void m1(int x) { } 
}

public class VCE2014ExamCQuestion135 {
	public static void main(String[] args) {
	}
}
