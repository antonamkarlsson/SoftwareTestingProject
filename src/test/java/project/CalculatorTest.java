package project;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calculator;
	Decreaseifier decreaser;

	@Before
	public void setUp() throws Exception {
		System.out.println("Running setup!");

		calculator = new Calculator();
		decreaser = new Decreaseifier(); // Shouldve chosen an easier name...
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Running teardown!");

		calculator = null;
		decreaser = null;
	}

	@Test
	public void subTest() {
		assertEquals(2, calculator.sub(4, 2));
	}

	@Test
	public void addTest() {
		assertEquals(3, calculator.add(1, 2));
	}

	@Test
	public void multTest() {
		assertEquals(9, calculator.mult(3, 3));
	}

	@Test
	public void multTestTwo() {
		assertEquals(12, calculator.mult(3, 4));
	}

	@Test
	public void divisionTest() {
		assertEquals(2, calculator.divide(4, 2));
	}

	@Test
	public void integrationTest() {
		// Here we basically do: 4 * 10 - 36 == 4?
		assertEquals(4, decreaser.decreaseify(calculator.mult(4, 10), 36));
	}
}
