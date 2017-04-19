package kontrollstrukturen;

import static org.junit.Assert.*;

import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Before;
import org.junit.Test;

public class AufgabeWhileTest {

	private AufgabeWhile aufgabeWhile;
	private Queue<Integer> queue = new PriorityQueue<>();

	
	@Before
	public void setUp() throws Exception {
		aufgabeWhile = new AufgabeWhile();
	}
	
	@Test
	public void testdWhileInit1() {
		String expected = "[-17, 3, 55]";
	    assertEquals("[-17, 3, 55]", expected, 
	    		     aufgabeWhile.aufgabeWhileInit1(queue).toString());
	}
	
	@Test
	public void testWhileOutput1() {
		// assert statements
		String expected = "-17 3 55";
		aufgabeWhile.aufgabeWhileInit1(queue);
        assertEquals("-17 3 55", expected, aufgabeWhile.aufgabeWhileOutput1(queue));
		//fail("Not yet implemented");
	}

	@Test
	public void testWhile1() {
		// assert statements
		String expected = "[]";
		aufgabeWhile.aufgabeWhileInit1(queue);
		aufgabeWhile.aufgabeWhileOutput1(queue);
        assertEquals("[]", expected, queue.toString());
		//fail("Not yet implemented");
	}

}
