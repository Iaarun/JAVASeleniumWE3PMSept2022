package testngLinstenersdemo;

import org.testng.annotations.Test;

import graphql.Assert;


public class TestClass {

	@Test(groups = "smoke")
	public void test1() {
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
	  Assert.assertFalse(true);
	}

	@Test(groups = "regression")
	public void test2() {
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
	}

	@Test(groups = "regression")
	public void test3() {
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
	}

}
