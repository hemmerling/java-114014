package threads;

public class AufgabeThreadCount {

/*
	 Bitte einen Extra-Thread starten, der die statische Variable `count` in einer 
	 for-Schleife 1 Mio. mal um eins inkrementiert. Bitte in der main den Wert 
	 der Variable ausgeben.
	 */

		static int count;
		
		static class Increment implements Runnable {
			Thread sleepingThread;
			
			public Increment(Thread sleepingThread) {
				this.sleepingThread = sleepingThread;
			}

			@Override
			public void run() {
				for (int i = 0; i < 1_000_000; i++) {
					count++;
				}
				
				sleepingThread.interrupt(); //Nachricht mit InterruptedException senden
			}

		}
		
		static class Decrement implements Runnable {
			Thread sleepingThread;
				
			public Decrement(Thread sleepingThread) {
				this.sleepingThread = sleepingThread;
			}

			@Override
			public void run() {
				for (int i = 0; i < 1_000_000; i++) {
					count--;
				}
					
				sleepingThread.interrupt(); //Nachricht mit InterruptedException senden
			}

		}
		
		
		public static void main(String[] args) {
			
			Increment target1 = new Increment( Thread.currentThread() );
			Decrement target2 = new Decrement( Thread.currentThread() );
			
			Thread th1 = new Thread(target1);
			th1.start(); // ab hier: 2 Threads

			Thread th2 = new Thread(target2);
			th2.start(); // ab hier: 3 Threads

			try {
				th1.join(); 
				th2.join(); 
				
			} catch (InterruptedException e) {
				System.out.println("main hat die Nachricht zum Weiterlaufen bekommen");
			}
			
			System.out.println("count: " + count);
			
		}

}
