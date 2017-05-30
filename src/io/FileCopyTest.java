package io;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FileCopyTest {

	private String sourceFilePath = "C:/Users/Public/comcave_javacourse/source.txt";
	private String copyFilePath = "C:/Users/Public/comcave_javacourse/copy.txt";
	FileCopy fileCopy;
	
	@Before
	public void setUp() throws Exception {
		fileCopy = new FileCopy ();
	}

	@Test
	public void test() {
		boolean expected = true;
		assertEquals(expected, fileCopy.copyTextFile(sourceFilePath, copyFilePath));
		//fail("Not yet implemented");
	}

}
