package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTestMultiply {

	@Test
	void test() {
		MathUtils mathUtilsMult = new MathUtils();
		int expected = 20;
		int actual = mathUtilsMult.multiply(5, 4);
		assertEquals(expected, actual, "Method should multiply two numbers to equal 20..");
	}

}
