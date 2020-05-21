package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertingExceptions {

	
	// AssertThrows helps pass Test if ArithmeticException is used 
	// instead of NullPointerException for example
	@Test
	void testDivide() {
		MathUtils mathUtilsAssEx = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtilsAssEx.divide(1, 0), "Divide by zero should throw exception..");
		
		}

}
