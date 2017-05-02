package api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AufgabeScannerTest {

	AufgabeScanner aufgabeScanner = new AufgabeScanner();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOperation() {
		char operator = '+';
		double operand1	 = 2.0;
		double operand2 = 3.0;
		double expected = 5.0;
		assertEquals("Scanner - Addition", String.valueOf(expected), 
 				     String.valueOf(aufgabeScanner.operation(operator, operand1, operand2)));
		//fail("Not yet implemented");
	}

	@Test
	public void testInputCommandline() {
		String operator = "+";
		String operand1	 = "2.0";
		String operand2 = "3.0";
		String[] expected = { operand1, operator, operand2 };
		assertArrayEquals(expected, aufgabeScanner.inputCommandline(expected));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testProcessOperation1() {
		String operator = "+";
		String operand1	 = "2.0";
		String operand2 = "3.0";
		String[] input = { operand1, operator, operand2 };
		String expected = "5.0";
		assertEquals("Scanner - Addition", expected, 
 				     String.valueOf(aufgabeScanner.processOperation1(input)));
		//fail("Not yet implemented");
	}

}
