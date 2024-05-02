package testNG_demo;

import org.testng.annotations.Test;

public class Example1 {
	@Test
	public void testCase1() {
		System.out.println("Hi, TC1");
	}
	@Test
	public void testCase3() {
		System.out.println("Hi, TC3");
	}
	@Test
	public void testCase2() {
		System.out.println("Hi, TC2");
		testCase4();
	}
	
	public void testCase4() {
		System.out.println("Hi, TC4");
	}
  }

