package grundlagen.kontrollstrukturen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AufgabeSwitchTest {

	private AufgabeSwitch aufgabeSwitch;
	private final static String antwort1 = "Das ist "; 
	private final static String vokal = "ein Vokal";
	private final static String konsonant = "ein Konsonant";
	private final static String fehler = "kein englischer Kleinbuchstabe";

	@Before
	public void setUp() throws Exception {
		this.aufgabeSwitch = new AufgabeSwitch();
	}

	@Test
	public void testVokal() {
		char character = 'a';
		String expected = antwort1 + vokal;
        assertEquals(antwort1 + vokal, expected, this.aufgabeSwitch.aufgabeSwitch1(character));
		//fail("Not yet implemented");
	}

	@Test
	public void testKonsonant() {
		char character = 'b';
		String expected = antwort1 + konsonant;
        assertEquals(antwort1 + konsonant, expected, this.aufgabeSwitch.aufgabeSwitch1(character));
	}

	@Test
	public void testFehler() {
		char character = 'A';
		String expected = antwort1 + fehler;
        assertEquals(antwort1 + fehler, expected, this.aufgabeSwitch.aufgabeSwitch1(character));
	}

}
