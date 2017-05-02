package api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import grundlagen.arrays.Schiff;

public class AufgabeStringEinfachTest {

	AufgabeStringEinfach stringEinfach = new AufgabeStringEinfach();
	private String[] aFilenameArray = {"hello.txt", "hello.TXT", "hello.", 
									   "hello.t", "hello.bat"};
	private boolean[] aIsFilenameArray = {true, true, false, false, false};

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStringReverse() {
		String expected = "llot tsi avaJ";
		String aString = "Java ist toll";
		assertEquals("Reverse String", expected, stringEinfach.reverseString(aString));
		//fail("Not yet implemented");
	}

	@Test
	public void testStringTextfile() {
		String expectedSubstring = ".txt";
		AufgabeStringEinfachTest stringEinfachTest = new AufgabeStringEinfachTest();
		for (int ii = 0; ii< stringEinfachTest.aFilenameArray.length; ii++) {
			boolean expected = stringEinfachTest.aIsFilenameArray[ii];
			assertEquals(ii + " ist der Name einer Textdatei?", expected, 
						 stringEinfach.isTextFile(stringEinfachTest.aFilenameArray[ii]));
			//fail("Not yet implemented");
		}

	}
	
}
