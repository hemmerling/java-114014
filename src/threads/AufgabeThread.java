package threads;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		//System.out.println("in der run von MyRunnable");
		Thread current = Thread.currentThread();
		System.out.println("Name: " + current.getName() +" ID:" + current.getId());
	}
}

public class AufgabeThread {

	private static long count = 0;
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("Name: " + getName() +" ID:" + getId());
			}
		};

		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				
				// Trick um an Thread-Methoden ranzukommen
				Thread current = Thread.currentThread(); 
				
				System.out.println("Name: " + current.getName() +" ID:" + current.getId());
			}
		};

		Thread t4 = new Thread()  {
			@Override
			public void run() {
				System.out.println("Name: " + getName() +" ID:" + getId());
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("InterruptedException abgefangen im Thread "+ getName());
						//e.printStackTrace();
						break;
					}
					System.out.println("Hello");
				}
			
			}
		};
	
		Thread t5 = new Thread()  {
			public boolean isRunning = true;
			private static final long LIMIT =  5; // 1000000L;
			
			@Override
			public void run() {
				System.out.println("Name: " + getName() +" ID:" + getId());
				for ( count = 0; count < LIMIT ; count++)
				{
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("InterruptedException abgefangen im Thread "+ getName());
						//e.printStackTrace();
						break;
					}
					System.out.println(count);
				}
			
			}
		};

		Runnable r2 = new MyRunnable();
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		//t1.start();
		//t2.start(); 
		//t3.start(); 
		//t4.start(); 
		t5.start(); 
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//t4.stop();
		//t4.interrupt();

		System.out.println("T4 beendet");

	}

}
