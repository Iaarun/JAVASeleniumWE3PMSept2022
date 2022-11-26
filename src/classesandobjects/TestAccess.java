package classesandobjects;

public class TestAccess {

	
	public static void main(String[] args) {
		TestAccess ta = new TestAccess();
		ta.test1();
		ta.test2();
		ta.test3();
		ta.test4();
		test5();
		
	}
	
	public void test1() {
		System.out.println("Test1");
	}
	protected void test2() {
		System.out.println("Test2");
	}
	 void test3() {
		System.out.println("Test3");
	}
	private void test4() {
		System.out.println("Test4");
	}
	
	public static void test5() {
		System.out.println("Test5");
	}
	
	
}
