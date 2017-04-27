package geometrie;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import kontrollstrukturen.AufgabeWhile;

public class KreisTest {

	private Kreis kreis;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testKreis() {
		String expected = "Kreis. R = 5";
		Kreis kreis = new Kreis(5);
        assertEquals("Kreis. R = 5", expected, kreis.makeKreis());
	}

}
