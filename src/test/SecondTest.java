package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import p1.Calculator;

class SecondTest {

	@BeforeAll  //-first executed
	static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@AfterAll   //-last executed
	static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

	@BeforeEach  //before starting a test
	void setUp() throws Exception {
		System.out.println("before each");
	}

	@AfterEach //after starting a test
	void tearDown() throws Exception {
		System.out.println("after each");
	}

	@Test
	void test() {
		System.out.println("inside test"); //-- test
		
	}
	
	
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
