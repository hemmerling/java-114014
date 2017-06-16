package threads;

public class AufgabeThreadCount {

/*
	 Bitte einen Extra-Thread starten, der die statische Variable `count` in einer 
	 for-Schleife 1 Mio. mal um eins inkrementiert. Bitte in der main den Wert 
	 der Variable ausgeben.

	 Bitte einen Extra-Thread starten, der die statische Variable `count` in einer 
	 for-Schleife 1 Mio. mal um eins dekrementiert. Bitte in der main den Wert 
	 der Variable ausgeben.
*/

		static int count;
		
		static class Increment implements Runnable {

			@Override
			public void run() {
				for (int i = 0; i < 1_000_000; i++) {
					count++;
				}
				
			}

		}
		
		static class Decrement implements Runnable {

			@Override
			public void run() {
				for (int i = 0; i < 1_000_000; i++) {
					count--;
				}
					
			}

		}
		
		
		public static void main(String[] args) throws InterruptedException {
			
			Increment target1 = new Increment( );
			Decrement target2 = new Decrement();
			
			Thread th1 = new Thread(target1);
			th1.start(); // ab hier: 2 Threads

			Thread th2 = new Thread(target2);
			th2.start(); // ab hier: 3 Threads

				th1.join(); 
				th2.join(); 
							
			System.out.println("count: " + count);
			
		}

}
