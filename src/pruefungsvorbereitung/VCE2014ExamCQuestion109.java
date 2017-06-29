package pruefungsvorbereitung;

public class VCE2014ExamCQuestion109 {

	static class A {
		void process() throws Exception { throw new Exception(); }
	}

	static class B extends A {
		void process() { System.out.println("B"); }
	}

	public static void main(String[] args) {
		try {
			new A().process();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new B().process();
	}

}
