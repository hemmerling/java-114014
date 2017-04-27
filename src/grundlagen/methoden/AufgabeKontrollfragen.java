package grundlagen.methoden;

import java.util.LinkedList;
import java.util.Queue;

public class AufgabeKontrollfragen {

	static short foo(byte b) {
	    return 2;			// Zeile A
	    //return (short) 2;			// Zeile A
	}
	
	static void test() {
	    byte b = 2;		// Zeile B
	    //byte b = (byte) 2;		// Zeile B
	
	    foo((byte) 2);				// Zeile C
	    int c = 1_000_000;
	    long d = 12_345_678_901L;
	    char e = '\uABCD';
	    System.out.println(java.lang.Math.PI);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
