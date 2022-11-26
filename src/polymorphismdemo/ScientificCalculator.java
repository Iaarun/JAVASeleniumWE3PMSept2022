package polymorphismdemo;

public class ScientificCalculator extends Calculator {

	
	public void test(String name) {
		System.out.println("My name is "+name);
	}
	
	
	public static void main(String[] args) {
		ScientificCalculator sc = new ScientificCalculator();
		sc.test("Arun");
	
		
		Calculator cal = new Calculator();
		cal.test("Amit");
		
		Calculator cal1 = new ScientificCalculator();
		cal1.test("Amit");
		
		
		
		
	}
}
