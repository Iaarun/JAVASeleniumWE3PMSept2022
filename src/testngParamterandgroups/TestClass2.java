package testngParamterandgroups;

import org.testng.annotations.Test;

public class TestClass2 {

	@Test
	public void test1() {
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
	}

	@Test
	public void test2() {
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
	}

	@Test
	public void test3() {
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
	}

}
