package io.javabrains;

public class MathUtils {
	
	// Error message will show

	public int add(int a, int b) {
		return a + b;
	}
	
	// Run successfully
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int subtract(int d, int e){
		return d - e;
	}
	
	public int divide(int g, int h) {
		return g / h;
	}
	
	
	// Test driven development
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
}