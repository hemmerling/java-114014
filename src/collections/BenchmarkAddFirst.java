package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkAddFirst {

	List<String> listString = new LinkedList<String>();
	ArrayList<String>  arrayListString = new ArrayList<String>();

	/*
	 *  - Definieren Sie eine Methode 'testAddFirst' in der das Hinzufügen von 
	 *  N String-Elementen zu einer Liste realisiert wird. 
	 *  Jedes neue Element wird zum Anfang der Liste hinzugefügt.
	 */
	public void testAddFirst1(String aString) {
		listString.add(0, aString);
	}
	
	public void testAddFirst2(String aString) {
		arrayListString.add(0, aString);
	}
	
	/*
	 * - Rufen Sie die entwickelte Methode für M ArrayList-Objekte nacheinander auf und 
	 *  ermitteln Sie die Zeit für jeden Methodenaufruf, Gesamtzeit aller M Aufrufe und den 
	 *  Mittelwert für einen Aufruf.
	 */
	
	/*
	 *  - Wiederholen Sie die Tests für M LinkedList-Objekte und vergleichen Sie die Ergebnisse. 
	 */
	
	
	public String toString() {
		return listString.toString();
	}	
	
	public String toString2() {
		return arrayListString.toString();
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BenchmarkAddFirst benchmarkAddFirst = new BenchmarkAddFirst();
		
		long startTime1 = System.currentTimeMillis();
		for (int ii = 0; ii<10000;ii++) {
			benchmarkAddFirst.testAddFirst1("a");			
		}
		benchmarkAddFirst.testAddFirst1("a");
		benchmarkAddFirst.testAddFirst1("b");
		benchmarkAddFirst.testAddFirst1("c");
		long estimatedTime1 = System.currentTimeMillis() - startTime1;
		System.out.println(benchmarkAddFirst.toString() + estimatedTime1);
		
		long startTime2 = System.currentTimeMillis();
		for (int ii = 0; ii<10000;ii++) {
			benchmarkAddFirst.testAddFirst2("d");			
		}
		benchmarkAddFirst.testAddFirst2("d");
		benchmarkAddFirst.testAddFirst2("e");
		benchmarkAddFirst.testAddFirst2("f");
		long estimatedTime2 = System.currentTimeMillis() - startTime2;
		System.out.println(benchmarkAddFirst.toString() + estimatedTime2);
	}
}
