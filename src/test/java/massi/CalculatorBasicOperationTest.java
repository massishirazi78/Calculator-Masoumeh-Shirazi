package massi;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorBasicOperationTest {
	
	CalculatorBasicOperations c = new CalculatorBasicOperations();

	@Test
	public void additionTest() {
		TestCase.assertTrue(c.addition(4, 5) == 9);
		TestCase.assertTrue(c.addition(3.5, 4.5) == 8.0);
	}
	
}
