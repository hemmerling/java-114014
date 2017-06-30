package pruefungsvorbereitung;
interface A { public void aMethod(); }
interface B { public void bMethod(); }

interface C extends A,B { public void cMethod(); }

class D implements B {
	public void bMethod(){ System.out.println(this.getClass()+ " bMethod()"); };
}

class E extends D implements C {
	public void aMethod(){};
	public void bMethod(){ System.out.println(this.getClass()+ " bMethod()"); };
	public void cMethod(){};
}

public class VCE2014ExamCQuestion122 {

	public static void main(String[] args) {
		D e1 = new E();
		e1.bMethod();
		D e2 = (D)(new E());
		e2.bMethod();
	}

}
