package io;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileCounterTest {

	FileCounter fileCounter;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSearchWindowsForExe() {
		fileCounter = new FileCounter("C:\\Windows");
		int expected = 12;
		assertEquals(expected, fileCounter.count("exe"));
		//fail("Not yet implemented");
	}

	@Test
	public void testPathDoesntExist() {
		fileCounter = new FileCounter("C:/System Volume Information");
		int expected = 0;
		assertEquals(expected, fileCounter.count("exe"));
		//fail("Not yet implemented");
	}

	@Test
	public void testPathDoesntExist2() {
		fileCounter = new FileCounter("C:/System Volume Information");
		int expected = 0;
		int result;
		try {
			result = fileCounter.count2("exe");
		} catch ( Exception e ) {
			System.err.println("Illegal Path - Path doesnt´exist ( thrown Exception )");
			result = 0;
		}
		assertEquals(expected, result);
		//fail("Not yet implemented");
	}
   
   @Rule
   public final ExpectedException exception = ExpectedException.none();
   
   @Test
   //Expected test to throw an instance of java.lang.Exception
   public void testPathDoesntExist3() throws Exception {
	   fileCounter = new FileCounter("C:/System Volume Information");
	   exception.expect(Exception.class);   
	   exception.reportMissingExceptionWithMessage("Error - No exception thrown"); 
	   fileCounter.count2("exe");
  }

}
