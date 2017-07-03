package pruefungsvorbereitung;

class PingPong implements Runnable {
	synchronized void hit(long n) {
		for(int i = 1; i < 3; i++)
			System.out.print(n + "-" + i + " ");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pingPong1() {
		new Thread(new PingPong()).start();
		new Thread(new PingPong()).start();
	}

	public void pingPong2() {
		PingPong p  = new PingPong();
		new Thread(p).start();
		new Thread(p).start();
	}

	public void run() {
		hit(Thread.currentThread().getId());
	}
}

public class VCE2014ExamCQuestion142 {
	public static void main(String[] args) {

		PingPong pingPong = new PingPong();
		//pingPong.pingPong1();
		pingPong.pingPong2();
	}

}
