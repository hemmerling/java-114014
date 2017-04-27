package grundlagen.kontrollstrukturen;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AufgabeForTest {

	/*
	 *   If you are using the Maven build system, 
	 *   you should use the "Test" suffix for test classes. 
	 *   The Maven build system (via its surfire plug-in) 
	 *   automatically includes such classes in its test scope.
	 */
	private AufgabeFor aufgabeFor;
	
	@Before
	public void setUp() throws Exception {
		this.aufgabeFor = new AufgabeFor();
	}

	@Test
	public void testFor1() {
		// assert statements
		String expected = "0 2 3 4 5 6 7 8 9";
        assertEquals("0 2 3 4 5 6 7 8 9", expected, this.aufgabeFor.aufgabeFor1());
		//fail("Not yet implemented");
	}

	@Test
	public void testFor2() {
		// assert statements
		String expected = "-4 -2 0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50";
		int start = -4;
		int stop = 50;
		int increase = 2;
        assertEquals("-4 -2 0 2 4 ... 50", expected, this.aufgabeFor.aufgabeFor2(start, stop, increase));
	}

	@Test
	public void testFor3() {
		// assert statements
		String expected = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		char start2 = 'a';
		char stop2 = 'z';
		int increase = 1;
        assertEquals("a b c ... z", expected, this.aufgabeFor.aufgabeFor3(start2, stop2, increase));
	}

	@Test
	public void testFor4() {
		// assert statements
		String expected = "Z Y X W V U T S R Q P O N M L K J I H G F E D C B A";
		char start2 = 'Z';
		char stop2 = 'A';
		int increase = -1;
        assertEquals("Z Y X ... A", expected, this.aufgabeFor.aufgabeFor4(start2, stop2, increase));
	}

}
