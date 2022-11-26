package testPackage;

public class OperatorsDemo {
	public static void main(String[] args) {
		maxofThree();
	}
	
	public static void arithmaticOperator() {
		// +, -, *, /, %     =
		
		int a = 10;
		int b=3;
		
		System.out.println(a+b);//13
		System.out.println(a-b);//7
		System.out.println(a*b);//30
		System.out.println(a/b);//3   //quoutient
		System.out.println(a%b);//1    // remainder
		
				
	}
	
	public static void unaryOperator() {
		// ++, --
		
		int a = 10;
		
		System.out.println(a++); //10
		System.out.println(a); //11
		
		System.out.println(++a);//12
		
		System.out.println(a--); //12
		System.out.println(--a);//10
		
		System.out.println(a++  + ++a);
	}
	
	
	public static void comparisonOperator() {
		// ==  !=  > < >=  <=
		
		int a = 50;
		int b =20;
		
		System.out.println(a==b);//false
		System.out.println(a!=b); //true
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b);//true
		System.out.println(a<=b);//false
	}
	
	public static void logicalOperator() {
		// &&    ||
		
		int a=10;
		int b =5;
		
		System.out.println((a>b) && (a!=b));//true
		System.out.println((a>b) && (a==b)); //false
		System.out.println((a>b) || (a!=b));//true
	}
	
	public static void ternaryOperator() {
	//	(condition) ? expression1 : expression2
		
		int a=10;
		int b = 15;
	int result=	(a>b)? (a+b): (a*b);
	System.out.println(result);
	
	}
	
	public static void maxofThree() {
		int a= 10;
		int b = 25;
		int c = 20;
		
		int max = (a>b)? (a>c ? a:c):(b>c? b:c);
		System.out.println(max);
	}
}
