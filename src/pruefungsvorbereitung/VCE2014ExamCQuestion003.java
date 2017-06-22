package pruefungsvorbereitung;

public class VCE2014ExamCQuestion003 {

	void waitForSignal ()  {
		Object obj = new Object();
		try {
			
			synchronized ( Thread.currentThread()) {
			obj.wait(); // causes "java.lang.IllegalMonitorStateException"
			obj.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		VCE2014ExamCQuestion003 testWait = new VCE2014ExamCQuestion003();
		testWait.waitForSignal();
	}
}
