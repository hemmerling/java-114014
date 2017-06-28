package pruefungsvorbereitung;

public class VCE2014ExamCQuestion075 {
	void waitForSignal() throws InterruptedException {
		Object obj = new Object();
		synchronized (Thread.currentThread()) {
			//((Thread) obj).wait();
			obj.wait();
			obj.notify();
		}
	}
	
	public static void main(String[] args) {
		VCE2014ExamCQuestion075 wait2 = new VCE2014ExamCQuestion075();
		try {
			wait2.waitForSignal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
