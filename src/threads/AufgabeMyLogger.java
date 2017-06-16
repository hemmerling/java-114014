package threads;


/*
 *  Bitte gestalten Sie die Klasse `MyLogger` threadsicher (nach Oracle).
 *  Achten Sie darauf keine unnötige Synchronisation einzuführen
 *  Wird das Ersetzen vom `StringBuilder`durch einen `StringBuffer` 
 *  die Klasse threadsicher gestalten?
 */

class MyLogger {
//	private StringBuffer sb = new StringBuffer();
	private StringBuilder sb = new StringBuilder();

	public synchronized void addMessage(String caller, String message) {
		sb.append(caller);
		sb.append(" - ");
		sb.append(message);
		sb.append("\n");
	}

	public synchronized String getLog() {
		return sb.toString();
	}
}


class MyTask implements Runnable {
	private MyLogger logger;
	
	public MyTask(MyLogger logger) {
		this.logger = logger;
	}
	
	public void run() {
		String currentThreadName = Thread.currentThread().getName();
		String message = "Nachricht von " + currentThreadName; 
		for (int i = 0; i < 100; i++) {
			logger.addMessage(currentThreadName, message);
		}
	}
}

public class AufgabeMyLogger {

	public static void main(String[] args) throws InterruptedException {
		MyLogger logger = new MyLogger();
		Runnable target = new MyTask(logger);
		
		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);
		
		t1.start();
		t2.start();
		
		new Thread(new MyTask(new MyLogger())).start();;
		
		t1.join();
		t2.join();
		
		System.out.println( logger.getLog() );
	}

}
