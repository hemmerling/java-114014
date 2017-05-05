package klasse.vererbung;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import klassen.geometrie.GeometrischesObjekt;

public class TierTest {

	private Hund hund;
	private Katze katze;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHundLaufen() {
		String name = "Rex";
		int alter = 5;
		boolean gesund = true;
		this.hund = new Hund(name, alter, gesund);
		String expected = "Hund "+name+" läuft";
		assertEquals(expected, hund.laufen());
		//fail("Not yet implemented");
	}

	@Test
	public void testHundPrint() {
		String name = "Rex";
		int alter = 5;
		boolean gesund = true;
		this.hund = new Hund(name, alter, gesund);
		String expected = "Hund. Name: "+name;
		assertEquals(expected, hund.print());
		//fail("Not yet implemented");
	}

	@Test
	public void testKatzeLaufen() {
		String name = "Tom";
		int alter = 2;
		boolean gesund = true;
		this.katze = new Katze(name, alter, gesund);
		String expected = "Katze "+name+" läuft";
		assertEquals(expected, katze.laufen());
		//fail("Not yet implemented");
	}

	@Test
	public void testKatzePrint() {
		String name = "Tom";
		int alter = 2;
		boolean gesund = true;
		this.katze = new Katze(name, alter, gesund);
		String expected = "Katze. Name: "+name;
		assertEquals(expected, katze.print());

		//fail("Not yet implemented");
	}

	
	
}
