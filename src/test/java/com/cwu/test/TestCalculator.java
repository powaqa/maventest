package com.cwu.test;

import com.cwu.app.Calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCalculator extends TestCase {
	
	public TestCalculator(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(TestCalculator.class);
	}

	public void testAdd() {
		assertEquals(2, Calculator.add(1, 1));
	}
	
	public void testSubstract() {
		assertEquals(0, Calculator.subtract(1, 1));
	}

}
