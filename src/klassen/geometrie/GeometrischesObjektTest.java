package klassen.geometrie;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GeometrischesObjektTest {

	private GeometrischesObjekt geometrischesObjekt = new GeometrischesObjekt();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetCoordinates() {
		int[] expected = {0, 0};
		assertArrayEquals(expected, geometrischesObjekt.getCoordinates());
		//fail("Not yet implemented");
	}

	@Test
	public void testDisplay() {
		String expected = "0 0";
		assertEquals("Display Coordinates", expected, geometrischesObjekt.display());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		String expected = "Geometrisches Objekt";
		assertEquals("Get Name", expected, geometrischesObjekt.getName());
		//fail("Not yet implemented");
	}

}
