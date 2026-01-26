package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestingCalculator {

	private Calculator calculator;
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	void testAdd() {
		assertEquals(11, calculator.add(5, 6));
	}
	
	 @Test
	    void testSubtract() {
	        assertEquals(16, calculator.subtract(20, 4));
	    }
	 
	 @Test
	    void testMultiply() {
	        assertEquals(36, calculator. multiplication(4, 9));
	    }
	 
	 @Test
	    void testDivide() {
	        assertEquals(45, calculator.division(90, 2));
	    }

	 @Test
	 void testDivideByZero() {
		 assertThrows(ArithmeticException.class, () -> {
			 calculator.division(9,0);
		 });
		 
	 }
}
