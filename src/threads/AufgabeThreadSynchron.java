package threads;

class Printer extends Thread{

	private static Object monitor = new Object();
	
	private char character;
	private int charsInRow;
	private int countRows;
	
	Printer(char character, int charsInRow) {
		this.character = character;
		this.charsInRow = charsInRow;
	}

	Printer(char character, int charsInRow, int countRows) {
		this.character = character;
		this.charsInRow = charsInRow;
		this.countRows = countRows;
	}
	
	public void printRow(){
		// existierendes Objekt
		synchronized(System.out) {
		// neues Objekt
		//synchronized(monitor) {
			for(int ii=0; ii<this.charsInRow;ii++){
					System.out.print(character);
			}
		}
		System.out.print("\n");
	}

	public void start1(){
		for(int ii=0; ii<this.countRows;ii++){
			printRow();
		}
	}

	@Override
	public void run() {
			for (int i = 0; i < countRows; i++) {
				printRow();
			}	

	}
}


public class AufgabeThreadSynchron {

	private void printer1() {
		int charsInRow = 20;
		Printer p1 = new Printer('a', charsInRow);
		p1.printRow();
		p1.printRow();
	}

	private void printer2() {
		int charsInRow = 20;
		int countRows1 = 4;
		int countRows2 = 3;
		Printer p1 = new Printer('a', charsInRow, countRows1);
		Printer p2 = new Printer('b', charsInRow, countRows2);
		p1.start();
		p2.start();
	}

	public static void main(String[] args) {
		AufgabeThreadSynchron aufgabe = new AufgabeThreadSynchron();
		// TODO Auto-generated method stub
		//aufgabe.printer1();
		aufgabe.printer2();
	}

}
