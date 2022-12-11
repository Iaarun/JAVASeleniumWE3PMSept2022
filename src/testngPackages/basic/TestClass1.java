package testngPackages.basic;

import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	  public void TestClasstest1() {
		  System.out.println("TestClass Test1");
	  }
	  @Test(enabled = false)
	  public void TestClasstest2() {
		  System.out.println("TestClass Test2");
	  }

}
