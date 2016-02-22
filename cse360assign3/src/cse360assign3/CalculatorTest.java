package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    
    @Test
    public void testCalculator() {	//object should not be null
        Calculator testObj = new Calculator();
        assertNotNull(testObj);
    }
    
    @Test
    public void testGetTotalZero() {	//total should be set to 0
        Calculator testObj = new Calculator();
        assertEquals(0, testObj.getTotal());
    }
    
    @Test
    public void testGetTotalNonZero() {	//correct value of total should be returned
        Calculator testObj = new Calculator();
        testObj.add(10);
        assertEquals(10, testObj.getTotal());
    }
    
    @Test
    public void testAdd() {	//values are added to total 
        Calculator testObj = new Calculator();
        testObj.add(10);
        testObj.add(2);
        assertEquals(12, testObj.getTotal());
        testObj.add(2);
        assertEquals(14, testObj.getTotal());
    }
    
    @Test
    public void testSubtract() {	//values are subtracted from total
        Calculator testObj = new Calculator();
        testObj.subtract(10);
        testObj.subtract(2);
        assertEquals(-12, testObj.getTotal());
        testObj.subtract(2);
        assertEquals(-14, testObj.getTotal());
    }
    
    @Test
    public void testMultiply() {	//total is multiplied by values
        Calculator testObj = new Calculator();
        testObj.add(10);
        testObj.multiply(2);
        assertEquals(20, testObj.getTotal());
        testObj.multiply(2);
        assertEquals(40, testObj.getTotal());
    }
    
    @Test
    public void testDivideByZero() { //total is divided by zero
        Calculator testObj = new Calculator();
        testObj.add(10);
        testObj.divide(0);
        assertEquals(0, testObj.getTotal());
    }
    
    @Test
    public void testDivide() {	//total is divided by non-zero numbers
        Calculator testObj = new Calculator();
        testObj.add(10);
        testObj.divide(2);
        assertEquals(5, testObj.getTotal());
        testObj.divide(5);
        assertEquals(1, testObj.getTotal());
    }
    
    @Test
    public void testGetHistoryEmpty() {	//correct empty history is returned
        Calculator testObj = new Calculator();
        assertEquals("0", testObj.getHistory());
    }
    
    @Test
    public void testGetHistory1() {	//correct history is returned 
        Calculator testObj = new Calculator();
        testObj.add (4);
        testObj.subtract (2);
        testObj.multiply (2);
        testObj.add(5);
        assertEquals("0 + 4 - 2 * 2 + 5", testObj.getHistory());
    }
    
    @Test
    public void testGetHistory2() {	//correct history is returned 
        Calculator testObj = new Calculator();
        testObj.add (5); 
        testObj.subtract (7); 
        testObj.multiply (9); 
        testObj.divide(0);
        assertEquals("0 + 5 - 7 * 9 / 0", testObj.getHistory());
    }
}

