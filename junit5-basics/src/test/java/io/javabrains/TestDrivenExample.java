package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestDrivenMethod{

	@Test
	void testAdd() {
		MathUtils mathUtilsTestDriven = new MathUtils();
		int expected = 2;
		int actual = mathUtilsTestDriven.add(1, 1);
		assertEquals(expected, actual, "error..");
	}
	
	@Test
	void testComputerCircleRadius() {
		
		MathUtils mathUtilsTestDriven = new MathUtils();
		assertEquals(314.1592653589793, mathUtilsTestDriven.computeCircleArea(10),"Should return circle area..");
	}

}