package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MathUtilsTest{

	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(5, 1);
		assertEquals(expected, actual, "Method should add two numbers to equal 2..");
	}

}
