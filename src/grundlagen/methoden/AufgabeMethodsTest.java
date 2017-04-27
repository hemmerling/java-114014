package grundlagen.methoden;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AufgabeMethodsTest {

	private AufgabeMethods aufgabeMethods;

	@Before
	public void setUp() throws Exception {
		this.aufgabeMethods = new AufgabeMethods();
	}

	@Test
	public void testMethods1() {
		// assert statements
		String expected = "1 2 3 4 5 6 7 8 9 10";
		int from = 1;
		int to = 10;
        assertEquals("1..10", expected, this.aufgabeMethods.aufgabeMethods1(from, to));
		//fail("Not yet implemented");
	}

	@Test
	public void testMethods2() {
		int expected = 3;
		int aa = 1;
		int bb = 2;
        assertEquals("1+3 = 3", expected, this.aufgabeMethods.aufgabeMethods2(aa, bb));

	}

	@Test
	public void testMethods3() {
		// assert statements
		int expected = 1+2+3+4+5+6+7+8+9+10;
		int from = 1;
		int to = 10;
        assertEquals("1+2..+10", expected, this.aufgabeMethods.aufgabeMethods3(from, to));

	}

	@Test
	public void testMethods4() {
		// assert statements
		String expected = "*****\n";
		int breite = 5;
		int hoehe = 1;
        assertEquals("Rechteck aus *", expected, this.aufgabeMethods.aufgabeMethods4(breite, hoehe));
	}

	@Test
	public void testMethods5a() {
		// assert statements
		String expected = "*****\n";
		int breite = 5;
		int hoehe = 1;
		boolean fuellen = true;
        assertEquals("gefuelltes Rechteck aus *", expected, this.aufgabeMethods.aufgabeMethods5(breite, hoehe, fuellen));
	}

	@Test
	public void testMethods5b() {
		// assert statements
		String expected = "*****\n";
		int breite = 5;
		int hoehe = 1;
		boolean fuellen = false;
        assertEquals("ungefuelltes Rechteck aus *", expected, this.aufgabeMethods.aufgabeMethods5(breite, hoehe, fuellen));
	}

	@Test
	public void testMethods6() {
		// assert statements
		String expected = "1 1 1 1 1";
		int amount = 5;
		int from = 1;
		int to = 1;
        assertEquals("5 random numbers of range 1..1", expected, this.aufgabeMethods.aufgabeMethods6(amount, from, to));
	}

}
