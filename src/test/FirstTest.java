package test;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import p1.Calculator;

class FirstTest {

	@Test
	public void testIntegerSum() {
		Calculator calc = new Calculator();
		int value=calc.devide(5, 5);
		assertEquals(10, value);
	}
	
	@Test
	public void testFloatSum() {
		Calculator calc = new Calculator();
		int value=calc.devide(0, 0);
		assertEquals(0, value);
	}
	
	@Test
	public void testNegativeSum() {
		Calculator calc = new Calculator();
		int value=calc.devide(-5, -5);
		assertEquals(-10, value);
	}

}
