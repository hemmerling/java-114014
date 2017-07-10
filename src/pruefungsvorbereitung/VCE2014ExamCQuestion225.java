package pruefungsvorbereitung;

import java.io.IOException;

class A98 {
	void process() throws IOException { System.out.print("A,"); } }

class B98 extends A98 {
	public void process() throws IOException {
		super.process();
		System.out.print("B,");
		throw new IOException();
	}
	public void main() {
		try { new B98().process(); }
		catch (IOException e) { System.out.println("Exception"); }
	} 
}

public class VCE2014ExamCQuestion225 {

	public static void main(String[] args) {
		B98 b = new B98();
		b.main();
	}
}
