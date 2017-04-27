package grundlagen.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SchiffTest {
	
	Schiff schiff = new Schiff();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSchiff1() {
		String expected = "Rickmer-Rickmers"; 
		schiff.setName(expected);
		assertEquals("Schiffsnamen", expected, this.schiff.getName());
	    //fail("Not yet implemented");
	}

	@Test
	public void testSchiff2() {
		String expected = "Passat"; 
		Schiff schiff2 = new Schiff(expected);
		assertEquals("Schiffsnamen", expected, schiff2.getName());
	    //fail("Not yet implemented");
	}

}
