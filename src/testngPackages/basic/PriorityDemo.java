package testngPackages.basic;

import org.testng.annotations.Test;

import graphql.Assert;

public class PriorityDemo {
	
	@Test(priority = 4)
	public void ptest1() {
		System.out.println("ptest1");
	}
	@Test(priority = 1)
	public void ptest4() {
		System.out.println("ptest4");
	}
	@Test (priority = 0)
	public void ptest2() {
		System.out.println("ptest2");
		Assert.assertTrue(false);
	}
	@Test (priority = -1, invocationCount = 0)
	public void ptest3() {
		System.out.println("ptest3");
	}
	@Test(timeOut = 10000)
	public void testTimeout() {
		System.out.println("time out test");
	}
	
	
	@Test(dependsOnMethods = "ptest2")
	public void testDepedency() {
		System.out.println("Dependent method");
	}
	
	
	
	

}
