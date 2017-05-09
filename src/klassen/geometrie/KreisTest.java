package klassen.geometrie;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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

	@Test
	public void testKreisFlaeche() {
		int radius = 5;
		int expected = (int)(radius*radius*Math.PI);
		Kreis kreis = new Kreis(radius);
        assertEquals("Kreisfläche", expected, kreis.getFlaeche());
	}

}
