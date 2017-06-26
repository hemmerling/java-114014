package pruefungsvorbereitung;

class Final1 {
	Final1() {
		System.out.println("Konstruktor");
	}
	public void finalize() {
		System.out.println("finalize()");	
	}
}

public class VCE2014ExamCQuestion049 {
	public static void main(String[] args) {
		Final1 final1 = new Final1();
		final1.finalize();
		final1 = null;
		System.gc();
		System.out.println("Ende");	
		
	}

}
