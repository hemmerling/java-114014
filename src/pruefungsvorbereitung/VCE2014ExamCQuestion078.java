package pruefungsvorbereitung;

class TestFive0 {
	private int x;
	public void foo() {
		int current = x;
		x = current + 1;
	}
	public void go() {
		for(int i = 0; i < 5; i++) {
			new Thread() {
				public void run() {
					foo();
					System.out.print(x + ", ");
				} }.start();
		} }
}

// Richtige Lösung:
// 1. move the line 12 print statement into the foo() method
// 2. wrap the code inside the foo() method with a synchronized( this ) block
class TestFive1 {
	private int x;
	public void foo() {
		synchronized(this) {
			int current = x;
			x = current + 1;
			System.out.print(x + ", ");
		}
	}
	public void go() {
		for(int i = 0; i < 5; i++) {
			new Thread() {
				public void run() {
					foo();
					try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					//System.out.print(x + ", ");
				} }.start();
		} }
}

//Nicht die richtige Lösung: Spätestens nach Einfügen von sleep() sieht man's
// change line 7 to public synchronized void go() {
class TestFive2 {
	private int x;
	public void foo() {
		int current = x;
		x = current + 1;
	}
	public synchronized void go() {
		for(int i = 0; i < 5; i++) {
			new Thread() {
				public void run() {
					foo();
					try {
						sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.print(x + ", ");
				} }.start();
		} }
}

// Nicht die richtige Lösung:
// change the variable declaration on line 2 to private volatile int x;  
class TestFive3 {
	private volatile int x;
	public void foo() {
		int current = x;
		x = current + 1;
	}
	public void go() {
		for(int i = 0; i < 5; i++) {
			new Thread() {
				public void run() {
					foo();
					try {
						sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.print(x + ", ");
				} }.start();
		} }
}

//Nicht die richtige Lösung: Spätestens nach Einfügen von sleep() sieht man's
// wrap the for loop code inside the go() method with a synchronized block synchronized(this) { // for loop code here } 
class TestFive4 {
	private int x;
	public void foo() {
		int current = x;
		x = current + 1;
	}
	public void go() {
		synchronized(this) {
			for(int i = 0; i < 5; i++) {
				new Thread() {
					public void run() {
						foo();
						try {
							sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.print(x + ", ");
					} }.start();
			} }
	}
}

public class VCE2014ExamCQuestion078 {
	public static void main(String[] args) {
		TestFive0 testFive0 = new TestFive0();
		//testFive0.go();
		System.out.println("\n"+"*********************");
		TestFive1 testFive1 = new TestFive1();
		testFive1.go();
		System.out.println("\n"+"*********************");
		TestFive2 testFive2 = new TestFive2();
		//testFive2.go();
		System.out.println("\n"+"*********************");
		TestFive3 testFive3 = new TestFive3();
		//testFive3.go();
		System.out.println("\n"+"*********************");
		TestFive4 testFive4 = new TestFive4();
		//testFive4.go();
	}
}