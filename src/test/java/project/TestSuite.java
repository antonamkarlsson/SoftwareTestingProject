package project;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSuite {

	// Naming convention for test cases is:
	// tcNameOfFunction

	Adder adder;

	@Before
	public void setUp() throws Exception {
		System.out.println("Running setUp()");

		adder = new Adder();
	}

	@After
	public void teardown() throws Exception {
		System.out.println("Running teardown()");

		adder = null;
	}

	@Test
	public void tcAdd() {
		assertEquals(10, adder.add(5, 5));
	}
}
