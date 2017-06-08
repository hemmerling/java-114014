package generics;
import java.util.Date;
import java.util.Random;


/* 
 * Zusatzaufgabe:
 * Erstellen Sie eine universelle Methode 'getMin', 
 * die typsicher für zwei Strings, zwei Date, oder zwei Integer aufgerufen werden kann.
 */

class GenerischeKlasse <T> {
	// static void test(T param) {} //Compilerfehler
}

public class AufgabeGenerischeMethode {

	
	/*
	 * ** Ungünstige Lösung **
	 * Universell und typsicher
	 * Erstellen Sie eine universelle Methode 'getMin', 
	 * die typsicher für zwei Strings, zwei Date, oder zwei Integer aufgerufen werden kann.
	 */
	static Comparable getMin1(Comparable x, Comparable y) {
		if (x.compareTo(y) < 0) {
			return x;
		}
		return y;
	}


	/*
	 * ** Flexible Lösung **
	 * Universell und typsicher
	 * Erstellen Sie eine universelle Methode 'getMin', 
	 * die typsicher für zwei Strings, zwei Date, oder zwei Integer aufgerufen werden kann.
	 */
	static <T extends Comparable> T getMin2(T x, T y) { 
		if (x.compareTo(y) < 0) {
			return x;
		}
		
		return y;
	}
	
	/*
	 * Nachteil: Methode arbeitet nur mit Integer
	 */
	/*
	static Integer getRandom(Integer a, Integer b) {
		if( new Random().nextBoolean() ) {
			return a;
		}
		
		return b;
	}
	*/

	/*
	 * Nachteil: Rückgabe unbequem (Object)
	 * Nachteil (evtl.): gemischte Parametrtypen möglich
	 */
	/*
	static Object getRandom(Object a, Object b) {
		if( new Random().nextBoolean() ) {
			return a;
		}
		
		return b;
	}
	*/
	
	/*
	 * Generische Methode mit dem Typparameter T
	 */
	static <T> T getRandom(T a, T b) {	
		if( new Random().nextBoolean() ) {
			return a;
		}
		
		return b;
	}
	
	/*
	 * Universell und typsicher
	 */
	static <T extends Number> T getMax(T x, T y) {
		if( x.doubleValue() > y.doubleValue() ) {
			return x;
		}
		
		return y;
	}
	
	public static void main(String[] args) {
		
		Integer x = getRandom(12,  77);

		//Double y = (Double)getRandom(12.5, 55.3); //geht, aber für die generische Methode nicht nötig
		Double y = getRandom(12.5, 55.3);
		
		Number val = 33;
		Number erg = getRandom(33.3, val);
		
		Object z = getRandom("Hallo", true);
		//String s = getRandom("Hallo", true); //Compilerfheler
		
		
		Integer v1 = getMax(2, 3);
		Double v2 = getMax(2.3, 3.4);
		//Double v3 = getMax(2, 3.4);	//Compilerfehler
		Number v3 = getMax(2, 3.4);
	
		Integer res1 = (Integer) getMin1(12,55);
		Double res2 = (Double) getMin1(13.6, 77.3);
		String res3 = (String) getMin1("ggg", "aaa");
		Date res4 = (Date) getMin1(new Date(0), new Date());

		res1 = getMin2(12,55);
		res2 = getMin2(13.6, 77.3);
		res3 = getMin2("ggg", "aaa");
		res4 = getMin2(new Date(0), new Date());

		// getMin("ggg", 12);
		// getMin(new Date(), "aaa");
		
	}

}
