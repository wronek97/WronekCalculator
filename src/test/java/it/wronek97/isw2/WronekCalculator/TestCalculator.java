package it.wronek97.isw2.WronekCalculator;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestCalculator {
	
	Calculator calculator = new Calculator();
	
	@Test
	public void testSum() {
		Integer result = 20;
		assertEquals(result, calculator.sum(17, 3));
	}
	
	@Test
	public void testDiff() {
		Integer result = 14;
		assertEquals(result, calculator.diff(17, 3));
	}
	
}