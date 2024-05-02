package testNG_demo;

import org.testng.annotations.Test;

public class Example2 {
	@Test(priority=2,enabled=true)
	public void testCase1() {
		System.out.println("Hi, TC1");
	}
	@Test(priority=1,enabled=false)
	public void testCase3() {
		System.out.println("Hi, TC3");
	}
	@Test(priority=3,enabled=true)
	public void testCase2() {
		System.out.println("Hi, TC2");
	}
	@Test(enabled=true)
	public void testCase4() {
		System.out.println("Hi, TC4");
	}
}
