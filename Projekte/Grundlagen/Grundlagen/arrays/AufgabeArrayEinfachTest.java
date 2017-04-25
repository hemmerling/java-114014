package arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AufgabeArrayEinfachTest {

	AufgabeArrayEinfach arrayEinfach = new AufgabeArrayEinfach();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
	  int expected = 30; 
	  int array[] = arrayEinfach.createArray(2, 15, 30);
      assertEquals("Array(30) mit Werten von 2 bis 15", expected, array.length);
      //fail("Not yet implemented");
	}

}
