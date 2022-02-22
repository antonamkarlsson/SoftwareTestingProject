package project;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Running setup!");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Running teardown!");
	}

	@Test
	public void test() {
		Calculator calculator = new Calculator();

		assertEquals(2, calculator.add(1, 1));
	}

}
