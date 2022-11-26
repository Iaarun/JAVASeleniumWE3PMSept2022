package testPackage;

/*
 local 
 instance
 class
 */
public class VariablesDemo {

	//instance variable
	String stdId;

	//class variable
	static String subject;

	public static void main(String[] args) {

		long phoneNumber = 9856235459l;

		int age = 45;
		int num = 110;

		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		
		VariablesDemo vd1 = new VariablesDemo();
		
		VariablesDemo vd2 = new VariablesDemo();
		
		
		
		vd1.stdId ="101";
		subject="Python";
		vd2.stdId="205";
		subject="Java";
		
		System.out.println(vd1.stdId);//101
		System.out.println(vd2.stdId);//205
		System.out.println(subject); //Python 
		System.out.println(subject); //java

	}

	public static void test() {
		String name="Java";
		System.out.println(name);
	}
}
