package io.javabrains;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestDisabledDisplayNameAnotation {
	
	
	// Will declare inheritance of a class once here
	
	MathUtils mathUtils;
	
	// BeforeAll and AfterAll must be 'static void' to run
	
	@BeforeAll
	static void beforeAllInIt() {
		System.out.println("This needs to run before all...");
	}
	
	// Will create hook to create another new inheritance of a class
	// Will perform before in each test scenario
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}
	
	// Will perform in after each test scenario
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up ...");
	}
	
	@Test
	@DisplayName("Testing Add Method.. ")
	void testAdd() {
		
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "Method should add two numbers to equal 2..");

	}
	
	@Test
	void testSubtract() {
		
		int expected = 10;
		int actual = mathUtils.subtract(20, 10);
		assertEquals(expected, actual, "Method should subtract two numbers to equal 10..");

	}
	
	@Test
	void testDivide() {
		
		int expected = 9;
		int actual = mathUtils.divide(81, 9);
		assertEquals(expected, actual, "Method should divide two numbers to equal 9..");

	}
	
	@Test
	void testMultiply() {
		
		int expected = 8;
		int actual = mathUtils.multiply(4, 2);
		assertEquals(expected, actual, "Method should multiply two numbers to equal 8..");
	}
	
	
	// Here we're skipping TDD test with @Disabled
	@Test
	@Disabled
	@DisplayName("Test Driven Development.. Should not run..")
	void testDisabled() {
		
		fail("This test should be disabled..");
	}
}
