package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator testObj = new Calculator();
		assertNotNull(testObj);
	}

	@Test
	public void testGetTotalZero() {
		Calculator testObj = new Calculator();
		assertEquals(0, testObj.getTotal());
	}
	
	@Test
	public void testGetTotalNonZero() {
		Calculator testObj = new Calculator();
		testObj.add(10);
		assertEquals(10, testObj.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator testObj = new Calculator();
		testObj.add(10);
		testObj.add(2);
		assertEquals(12, testObj.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator testObj = new Calculator();
		testObj.subtract(10);
		testObj.subtract(2);
		assertEquals(-12, testObj.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator testObj = new Calculator();
		testObj.add(10);
		testObj.multiply(2);
		assertEquals(20, testObj.getTotal());
	}

	@Test
	public void testDivideByZero() {
		Calculator testObj = new Calculator();
		testObj.add(10);
		testObj.divide(0);
		assertEquals(0, testObj.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator testObj = new Calculator();
		testObj.add(10);
		testObj.divide(2);
		assertEquals(5, testObj.getTotal());
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
