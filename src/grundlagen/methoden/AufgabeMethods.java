package grundlagen.methoden;

import java.util.Random;

public class AufgabeMethods {

	Random r = new Random(); 

	public static void printFromTo ( int from, int to ) {
		AufgabeMethods aufgabeMethods = new AufgabeMethods();
		System.out.println(aufgabeMethods.aufgabeMethods1(from, to));
	}

	public static void sum ( int aa, int bb ) {
		AufgabeMethods aufgabeMethods = new AufgabeMethods();
		System.out.println(aufgabeMethods.aufgabeMethods2(aa, bb));
	}

	public static void sumFromTo ( int from, int to  ) {
		AufgabeMethods aufgabeMethods = new AufgabeMethods();
		System.out.println(aufgabeMethods.aufgabeMethods3(from, to));
	}

	public static void zeichneRechteck ( int breite, int hoehe) {
		AufgabeMethods aufgabeMethods = new AufgabeMethods();
		System.out.println(aufgabeMethods.aufgabeMethods4(breite, hoehe));
	}

	public static void zeichneRechteck2 ( int breite, int hoehe, boolean fuellen ) {
		AufgabeMethods aufgabeMethods = new AufgabeMethods();
		System.out.println(aufgabeMethods.aufgabeMethods5(breite, hoehe, fuellen));
	}

	public static void printRandom ( int amount, int from, int to  ) {
		AufgabeMethods aufgabeMethods = new AufgabeMethods();
		System.out.println(aufgabeMethods.aufgabeMethods6(amount, from, to));
	}

	public String aufgabeMethods1( int from, int to ) {
		String result = "";
		for (int ii = from; ii<to; ii++) {
			result += ii+" ";
		}
		result += to+"";		
		return ( result );
	}

	public int aufgabeMethods2( int aa, int bb ) {
		int result = aa+bb;
		return ( result );
	}

	public int aufgabeMethods3( int from, int to ) {
		int result = 0;
		for (int ii = from; ii<=to; ii++) {
			result += ii;
		}
		return ( result );
	}

	public String aufgabeMethods4( int breite, int hoehe) {
		String result = "";
		for (int ii = 1; ii<=hoehe; ii++) {
			for (int jj = 1; jj<=breite; jj++) {
				result += "*";
			}
			result +="\n";
		}
		return ( result );
	}
	
	public String aufgabeMethods5( int breite, int hoehe, boolean fuellen ) {
		String result = "";
		for (int ii = 1; ii<=hoehe; ii++) {
			for (int jj = 1; jj<=breite; jj++) {
				if (fuellen) {
					result += "*";
				} else {
					if ((jj == 1 | jj == breite ) || 
						( ii == 1 | ii == hoehe )) {
						result += "*";
					} else {
						result += " ";					
					}										
				}
			}
			result +="\n";
		}
		return ( result );
	}

	public String aufgabeMethods6( int amount, int from, int to ) {
		String result = "";
		for (int ii = 1; ii<amount; ii++) {
		    result += (from + this.r.nextInt(to-from+1)) +" ";
		}
		result +=(from + this.r.nextInt(to-from+1)) + "";		
		return ( result );
	}

	public static void main(String[] args) {
		AufgabeMethods aufgabeMethods = new AufgabeMethods();
		int from = 1;
		int to = 10;
		printFromTo(from, to);

		int aa = 1;
		int bb = 2;
		sum(aa, bb);

		from = 1;
		to = 10;
		sumFromTo(from, to);

		System.out.println("Rechteck 1");
		int breite = 5;
		int hoehe = 4;
		zeichneRechteck(breite, hoehe);

		System.out.println("Rechteck 2a, gefuellt");
		breite = 5;
		hoehe = 4;
		boolean fuellen = true;
		zeichneRechteck2(breite, hoehe, fuellen);

		System.out.println("Rechteck 2b, ungefuellt");
		fuellen = false;
		zeichneRechteck2(breite, hoehe, fuellen);

		System.out.println("");
		from = 1;
		to = 5;
		int amount = 5;
		printRandom (amount, from, to );

		// TODO Auto-generated method stub

	}

}
