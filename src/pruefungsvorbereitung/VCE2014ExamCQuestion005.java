package pruefungsvorbereitung;

public class VCE2014ExamCQuestion005 {
	public static void main (String[] args) {
		new VCE2014ExamCQuestion005().go();
	}
	public void go() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.print("foo");
			}
		};
		Thread t = new Thread(r);
		t.start();
		t.start(); // 2nd start of the same task causes 
		           // java.lang.IllegalThreadStateException
	}
}

