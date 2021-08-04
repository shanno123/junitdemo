package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import business.Calculator;

public class CalculatorTest {
	
	//Create object(instance) of a class to be tested
	private Calculator calc;

	@Before
	public void setUp() throws Exception {//it will execute before all the test cases
		calc=new Calculator();// instantiating
	}

	@After
	public void tearDown() throws Exception {//it will execute after all the test cases
		calc=null;
	}

	@Test
	public void testAdd() {
		double result=calc.add(10.50,10.32);
		assertEquals(20.82, result,0);
	}

	@Test
	public void testSubtract() {
		double result=calc.subtract(100.5,95);
		assertEquals(5.5, result,0);
	}

	@Test
	public void testMultiply() {
		double result=calc.multiply(100,2.5);
		assertEquals(250, result,0);
	}

	@Test
	public void testDivide() {
		double result=calc.divide(100,10);
		assertEquals(10, result,0);
	}
	
	@Test(expected=ArithmeticException.class)// in case of any exception
	public void testDivideByZero()
	{
		calc.divide(200, 0);
	}

}
