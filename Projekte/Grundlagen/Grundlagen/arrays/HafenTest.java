package arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HafenTest {

	private int numberOfShips = 12;
	
	private Hafen hafen = new Hafen(numberOfShips);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHafen() {
		int expected = numberOfShips; 
		assertEquals("Hafen mit 12 Schiffen", expected, hafen.getSchiffe().length);
	    //fail("Not yet implemented");
	}

	@Test
	public void testHafen2() {
		String expected = "Hafen (Schiffe: 12. Freie Plätze: 88)"; 
		assertEquals("Hafen mit 12 Schiffen", expected, hafen.getHafen());
	    //fail("Not yet implemented");
	}

}
