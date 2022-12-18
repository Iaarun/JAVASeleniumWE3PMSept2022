package testngParamterandgroups;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testngLinstenersdemo.MyListeners;

@Listeners(MyListeners.class)
public class TestClass2 {

	@Test (groups = "smoke")
	public void test1() {
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
	}

	@Test(groups = "regression")
	public void test2() {
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
	}

	@Test(groups = "language")
	public void test3() {
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
	}

}
