package pruefungsvorbereitung;

class PingPong2 {
	synchronized void hit(long n) {
		for(int i = 1; i < 3; i++)
			System.out.print(n + "-" + i + " ");
	}
}

public class VCE2014ExamCQuestion004 implements Runnable {
	static PingPong2 pp2 = new PingPong2();
	public static void main(String[] args) {
		new Thread(new VCE2014ExamCQuestion004()).start();
		new Thread(new VCE2014ExamCQuestion004()).start();
	}
	public void run() { pp2.hit(Thread.currentThread().getId()); }
}
