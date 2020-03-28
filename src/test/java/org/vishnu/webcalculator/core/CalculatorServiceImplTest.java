package org.vishnu.webcalculator.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorServiceImplTest {

	private static CalculatorService calculatorService;
	
	@BeforeAll
	public static void setUpBeforeAll(){
		calculatorService = new CalculatorServiceImpl();
	}
	
	/**
	 * Test Addition
	 */
	@Test
	void testAddToSuccessForPositiveInput() {
		Assertions.assertEquals(7, calculatorService.add(5, 2));
	}
	
	@Test
	void testAddToSuccessForNegativeInput() {
		Assertions.assertEquals(-7, calculatorService.add(-5, -2));
	}
	
	@Test
	void testAddToSuccessForMixedInput() {
		Assertions.assertEquals(-5, calculatorService.add(-7, 2));
	}
	
	/**
	 * Test Substraction
	 */
	@Test
	void testSubstractToSuccessForPositiveInput() {
		Assertions.assertEquals(7, calculatorService.substract(17, 10));
	}
	
	@Test
	void testSubstractToSuccessForNegativeInput() {
		Assertions.assertEquals(-10, calculatorService.substract(-12, -2));
	}
	
	@Test
	void testSubstractToSuccessForMixedInput() {
		Assertions.assertEquals(-5, calculatorService.substract(-3, 2));
	}
	
	
	/**
	 * Test Multiplication
	 */
	@Test
	void testMultiplicationToSuccessForPositiveInput() {
		Assertions.assertEquals(56, calculatorService.multiply(7, 8));
	}
	
	@Test
	void testMultiplicationToSuccessForNegativeInput() {
		Assertions.assertEquals(10, calculatorService.multiply(-5, -2));
	}
	
	@Test
	void testMultiplicationToSuccessForMixedInput() {
		Assertions.assertEquals(-63, calculatorService.multiply(-7, 9));
	}
	
	
	/**
	 * Test Division
	 */
	@Test
	void testDivisionToSuccessForPositiveInput() {
		Assertions.assertEquals(8, calculatorService.divide(64, 8));
	}
	
	@Test
	void testDivisionToSuccessForNegativeInput() {
		Assertions.assertEquals(5, calculatorService.divide(-10, -2));
	}
	
	@Test
	void testDivisionToSuccessForMixedInput() {
		Assertions.assertEquals(-9, calculatorService.divide(-63, 7));
	}
	
	/**
	 * Test Modulus
	 */
	@Test
	void testModulusToSuccessForPositiveInput() {
		Assertions.assertEquals(0, calculatorService.modulus(64, 8));
	}
	
	@Test
	void testModulusToSuccessForNegativeInput() {
		Assertions.assertEquals(-1, calculatorService.modulus(-11, -2));
	}
	
	@Test
	void testModulusToSuccessForMixedInput() {
		Assertions.assertEquals(-2, calculatorService.modulus(-65, 7));
	}
}
