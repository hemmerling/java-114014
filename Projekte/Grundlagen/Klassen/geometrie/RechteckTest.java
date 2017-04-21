package geometrie;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RechteckTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRechteck() {
		Rechteck rechteck = new Rechteck(5,3);
		String expected = "[5, 3]";
	    assertEquals("1. Rechteck (3 X 5)", expected, rechteck.getMasze().toString());
		rechteck = new Rechteck(2,4);
		expected = "[2, 4]";
	    assertEquals("1. Rechteck (2 X 4)", expected, rechteck.getMasze().toString());
	}

}
