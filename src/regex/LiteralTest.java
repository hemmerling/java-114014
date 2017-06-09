package regex;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LiteralTest {

	private Literal literal;
	
	@Before
	public void setUp() throws Exception {
		literal = new Literal();
	}

	@Test
	public void test_10() {
		//fail("Not yet implemented");
		String lit1 = "10";
		boolean expected = true;
	    assertEquals(expected + " = true", expected, literal.isDecimalLiteral(lit1));
	}

	@Test
	public void test_10minus() {
		//fail("Not yet implemented");
		String lit1 = "-10";
		boolean expected = true;
	    assertEquals(expected + " = true", expected, literal.isDecimalLiteral(lit1));
	}

	@Test
	public void test_10plus() {
		//fail("Not yet implemented");
		String lit1 = "+10";
		boolean expected = true;
	    assertEquals(expected + " = true", expected, literal.isDecimalLiteral(lit1));
	}

	@Test
	public void test_abc10() {
		//fail("Not yet implemented");
		String lit1 = "abc10";
		boolean expected = false;
	    assertEquals(expected + " = true", expected, literal.isDecimalLiteral(lit1));
	}

	@Test
	public void test_10abc() {
		//fail("Not yet implemented");
		String lit1 = "10abc";
		boolean expected = false;
	    assertEquals(expected + " = true", expected, literal.isDecimalLiteral(lit1));
	}

}
