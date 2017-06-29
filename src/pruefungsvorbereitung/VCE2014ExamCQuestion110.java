package pruefungsvorbereitung;

class Foo1 {
	static int[] a;
	/*  java.lang.ExceptionInInitializerError
	 *  Caused by: java.lang.NullPointerException
	 *  https://docs.oracle.com/javase/7/docs/api/java/lang/ExceptionInInitializerError.html
     */
	static { a[0]=2; } 
}

class Foo2 {
	static int[] a = { 1 };
	static { a[0]=2; }
}

public class VCE2014ExamCQuestion110 {

	public static void main(String[] args) {
		 Foo2 foo2 = new Foo2();
		 Foo1 foo1 = new Foo1();
	}
}
