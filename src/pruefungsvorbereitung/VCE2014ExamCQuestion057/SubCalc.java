package pruefungsvorbereitung.VCE2014ExamCQuestion057;

public class SubCalc extends SuperCalc {
	public static int multiply(int a, int b) {
	int c = 0; 
	// c= super.multiply(a, b); // Cannot use super in a static context
	c = SuperCalc.multiply(a,b);
	return c;
	}

	public static void main(String[] args) {
		SubCalc sc = new SubCalc ();
		System.out.println(sc.multiply(3,4));
		System.out.println(SubCalc.multiply(2,2));
	}

}
