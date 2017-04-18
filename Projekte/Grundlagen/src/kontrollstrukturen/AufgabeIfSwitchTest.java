package kontrollstrukturen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AufgabeIfSwitchTest {

	private AufgabeIfSwitch aufgabeIfSwitch;
	private String farbe = "";
	private String rot = "Rot", gelb = "Gelb", gruen = "Gruen", fehler = "Fehler";
	private String zustand[] = {". Bitte warten", ". Gleich geht es los", 
            ". Weg frei", "! Diese Farbe gibt es nicht"};
	
	@Before
	public void setUp() throws Exception {
		this.aufgabeIfSwitch = new AufgabeIfSwitch();
	}

	@Test
	public void testIf1() {
		String expected = rot+zustand[0];
        assertEquals(rot+ zustand[0], expected, this.aufgabeIfSwitch.aufgabeIf1(rot));
		//fail("Not yet implemented");
	}

	@Test
	public void testIf2() {
		String expected = gelb+zustand[1];
        assertEquals(gelb+zustand[1], expected, this.aufgabeIfSwitch.aufgabeIf1(gelb));
	}

	@Test
	public void testIf3() {
		String expected = gruen+zustand[2];
        assertEquals(gruen+zustand[2], expected, this.aufgabeIfSwitch.aufgabeIf1(gruen));
	}

	@Test
	public void testIf4() {
		String expected = fehler+zustand[3];
        assertEquals(fehler+zustand[3], expected, this.aufgabeIfSwitch.aufgabeIf1(fehler));
	}

	
	@Test
	public void testSwitch1() {
		String expected = rot+zustand[0];
        assertEquals(rot+ zustand[0], expected, this.aufgabeIfSwitch.aufgabeSwitch1(rot));
		//fail("Not yet implemented");
	}

	@Test
	public void testSwitch2() {
		String expected = gelb+zustand[1];
        assertEquals(gelb+zustand[1], expected, this.aufgabeIfSwitch.aufgabeSwitch1(gelb));
	}

	@Test
	public void testSwitch3() {
		String expected = gruen+zustand[2];
        assertEquals(gruen+zustand[2], expected, this.aufgabeIfSwitch.aufgabeSwitch1(gruen));
	}

	@Test
	public void testSwitch4() {
		String expected = fehler+zustand[3];
        assertEquals(fehler+zustand[3], expected, this.aufgabeIfSwitch.aufgabeSwitch1(fehler));
	}

}
