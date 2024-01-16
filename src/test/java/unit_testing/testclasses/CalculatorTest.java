package unit_testing.testclasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_testing.target.Calculator;

public class CalculatorTest {

	@Test
	public void addTest() {
		
		Calculator c=new Calculator();
		int actualRes=c.add(10, 20);
		int expectedRes=30;
		assertEquals(expectedRes, actualRes);
		
	}
	@Test
	public void multiplyTest() {
		
		Calculator c=new Calculator();
		int actualRes=c.multiply(10, 20);
		int expectedRes=200;
		assertEquals(expectedRes, actualRes);
		
	}
}
