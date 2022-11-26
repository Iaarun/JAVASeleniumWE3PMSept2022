package testPackage;

public class DataTypeDemo {
	
	public static void main(String[] args) {
		
		int age=410;
		
		byte b = 10;
		
		char ch = 'C';
		
		boolean bool = true;
		
		long l = 154515485151458l;
		
		float fl = 5184515.6165461654189f;
		
		double d = 1584515485.51548451548545;
		
		String name = "Java";
		
		//type casting
		//implicit typecasting
		byte b1 = 15;
		int num = b1;
		double d1 = num;
		
		System.out.println(num);
		System.out.println(d1);
		
		
		//explicit type casting
		b1 = (byte)num;
		
		double d2 = 2646516.54545;
		byte b2 = (byte)d2;
		
		System.out.println(d2);
		System.out.println(b2);
				
	}

}
