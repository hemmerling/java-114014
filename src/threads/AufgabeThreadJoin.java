package threads;

public class AufgabeThreadJoin {

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
		
		
		public static void main(String[] args) {
			
			Increment target = new Increment( Thread.currentThread() );
			
			Thread th = new Thread(target);
			th.start(); // ab hier: 2 Threads

			try {
				//Thread.sleep(10_000_000_000L); 
				//th.join(10_000_000_000L); 
				th.join(); 
				
			} catch (InterruptedException e) {
				System.out.println("main hat die Nachricht zum Weiterlaufen bekommen");
			}
			
			System.out.println("count: " + count);
			
		}

}
