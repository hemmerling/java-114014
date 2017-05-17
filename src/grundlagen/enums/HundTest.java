package grundlagen.enums;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HundTest {

	Hund hund1, hund2, hund3;
	Hunderasse hundrasse1 = Hunderasse.DACKEL;
	Hunderasse hundrasse2 = Hunderasse.COLLIE;
	Hunderasse hundrasse3 = Hunderasse.DOGGE;
	
	@Before
	public void setUp() throws Exception {
	this.hund1 = new Hund(hundrasse1);
	this.hund2 = new Hund(hundrasse2);
	this.hund3 = new Hund(hundrasse3);
	}

	@Test
	public void test_dackel() {
		String expected = "DACKEL, max. Größe: 0.5";
        assertEquals("DACKEL", expected, this.hund1.toString());
		//fail("Not yet implemented");
	}

	@Test
	public void test_collie() {
		String expected = "COLLIE, max. Größe: 1.0";
        assertEquals("COLLIE", expected, this.hund2.toString());
		//fail("Not yet implemented");
	}

	@Test
	public void test_dogge() {
		String expected = "DOGGE, max. Größe: 1.5";
        assertEquals("DOGGE", expected, this.hund3.toString());
		//fail("Not yet implemented");
	}


}
