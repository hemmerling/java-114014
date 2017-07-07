package pruefungsvorbereitung;

// (A) WRONG:
// A final method in class X can be abstract if and only if X is abstract.
class X1 {
	final void method(){}
}

// (B) TRUE: A protected method in class X can be overridden by any subclass of X.
class X2 {
	protected void method(){}
}
class S21 extends X2 {
	protected void method(){}
}
class S22 extends X2 {
	public void method(){}
}

// (C) FALSE: A private static method can be called only 
// within other static methods in class X.
class X3 {
	public static void method1(){}
	public static void method2(){method1();}
	public void method3(){method1();}
}

public class VCE2014ExamCQuestion208 {
	public static void main(String[] args) {
	}

}

// (D) FALSE: A non-static public final method in class X can be overridden 
// in any subclass of X.
//
// Fehlermeldung:
//  Cannot override the final method from X4
// - overrides X4.method
class X4 {
	public final void method(){}
}
class S4 extends X4 {
	public void method(){}
}

// (E) TRUE: A public static method in class X can be called 
// by a subclass of X without explicitly referencing the class X.
class X5 {
	public static void method1(){}
}
class S5 extends X5 {
	public void method2(){method1();}
}

// (F) TRUE: A method with the same signature as a private final method 
// in class X can be implemented in a subclass of X.
class X6 {
	private final void method(){}
}
class S6 extends X6 {
	private final void method(){}
}


// (G) FALSE: A protected method in class X can be overridden 
// by a subclass of X only if the subclass is in the same package as X.
// 
// Richtige Antwort: Nein, egal wo die Subclass ist, auch in fremden Packages 
class X7 {
	protected void method(){}
}
class S7 extends X7 {
	protected void method(){}
}
