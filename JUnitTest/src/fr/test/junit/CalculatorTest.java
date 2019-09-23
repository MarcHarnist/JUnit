package fr.test.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.main.junit.Calculator;

public class CalculatorTest {
	
	// my first test with the framework JUnit! 
	@Test
	  public void evaluatesExpression() {
	    Calculator calculator = new Calculator();
	    int sum = calculator.evaluate("1+2+3");
	    assertEquals(6, sum); // 6 = 1+2+3
	  }
	
	@Test
	public void evaluatesAnOtherExpression() {
		Calculator calc = new Calculator();
		int sum = calc.evaluate("4+5+6");
		assertEquals(15, sum); // 15 = 4+5+6
	
	}
}
