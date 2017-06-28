package pruefungsvorbereitung;

class TestOne implements Runnable {
	public void testOne() throws Exception {
		Thread t = new Thread(new TestOne());
		// this is executed by non-threaded code
		t.start();
		System.out.print("Started");
		// causes the current thread to pause execution 
		// until t1's thread terminates. 
		t.join();
		System.out.print("Complete");
	}
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.print(i);
		}
	}
}

public class VCE2014ExamCQuestion076 {

	public static void main(String[] args) {
		TestOne testOne = new TestOne();
		try {
			testOne.testOne();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
