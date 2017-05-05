package klasse.vererbung;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class LottoSpielTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testZiehen() {
	    int anzahlKugel = 7;
	    int anzahlKugelGesamt = 49;
	    LottoSpiel lottoSpiel = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);
	    int [] expected = { 47, 44, 25, 2, 46, 14, 2 };
		assertArrayEquals(expected, lottoSpiel.ziehen());
		//fail("Not yet implemented");
	}

	@Test
	public void testZiehenPrint() {
	    int anzahlKugel = 7;
	    int anzahlKugelGesamt = 49;
	    LottoSpiel lottoSpiel = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);
	    lottoSpiel.ziehen();
	    int [] expected = { 47, 44, 25, 2, 46, 14, 2 };
		assertArrayEquals(expected, lottoSpiel.print());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testZiehenPrintVerbose() {
	    int anzahlKugel = 7;
	    int anzahlKugelGesamt = 49;
	    LottoSpiel lottoSpiel = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);
	    lottoSpiel.ziehen();
	    String expected = "Spiel "+anzahlKugel+" aus "+anzahlKugelGesamt+". "+Arrays.toString(lottoSpiel.print());
		assertEquals("Spielergebnis ", expected, lottoSpiel.printVerbose());
		//fail("Not yet implemented");
	}

	@Test
	public void testZiehenSort() {
	    int anzahlKugel = 7;
	    int anzahlKugelGesamt = 49;
	    LottoSpiel lottoSpiel = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);
	    lottoSpiel.ziehen();
	    lottoSpiel.sort();
	    int [] expected = { 2, 2, 14, 25, 44, 46, 47 };
		assertArrayEquals(expected, lottoSpiel.print());
		//fail("Not yet implemented");
	}

	@Test
	public void testTippen() {
	    int anzahlKugel = 7;
	    int anzahlKugelGesamt = 49;
	    LottoTipp lottoTipp = new LottoTipp(anzahlKugel, anzahlKugelGesamt);
	    lottoTipp.abgeben(false);
	    lottoTipp.sort();
	    int [] expected1 = { 2, 2, 14, 25, 44, 46, 47 };
		assertArrayEquals(expected1, lottoTipp.print());

		// still wrong behaviour: 
		// I can´t generate another sequence, but just the same random sequence :-(
		lottoTipp = new LottoTipp(anzahlKugel, anzahlKugelGesamt);
	    lottoTipp.abgeben(false);
	    lottoTipp.sort();
	    int [] expected2 = { 2, 2, 14, 25, 44, 46, 47 };
		assertArrayEquals(expected2, lottoTipp.print());
		//fail("Not yet implemented");
	}

	@Test
	public void testComparison() {
	    int anzahlKugel = 7;
	    int anzahlKugelGesamt = 49;
	    int expected = anzahlKugel; 
	    LottoTipp lottoTipp = new LottoTipp(anzahlKugel, anzahlKugelGesamt);
	    int[] tippErgebnis = lottoTipp.abgeben(false);
        int numberOfHits = lottoTipp.compare(tippErgebnis,  tippErgebnis);
		assertEquals("Vergleichsergebnis ",expected, numberOfHits);
        //fail("Not yet implemented");
	}

	@Test
	public void testComparisonVerbose() {
	    int anzahlKugel = 7;
	    int anzahlKugelGesamt = 49;
	    int numberOfHits = anzahlKugel;
	    String expected = "7 richtige: 1000 EUR"; 
	    LottoTipp lottoTipp = new LottoTipp(anzahlKugel, anzahlKugelGesamt);
		assertEquals("Vergleichsergebnis ",expected, lottoTipp.compareVerbose(numberOfHits));
        //fail("Not yet implemented");
	}
	
}
