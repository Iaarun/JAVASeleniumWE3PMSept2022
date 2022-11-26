package polymorphismdemo;

import java.util.Scanner;

/*
 method overloading
 */
public class Calculator {
	
	public  void add(int a, int b) {
		
		System.out.println(a+b);
	}
	//different number of parameter
	public  void add(int a, int b, int c) {
		System.out.println(a+b);
	}
	
	//by changing the type of parameter
	public void add(int a, double b) {
		System.out.println(a+b);
	}
	
	//by changing the sequence of parameter
	public void add(double a, int b) {
		System.out.println(a+b);
	}
	
	protected void test(String name) {
		System.out.println("Name: "+name);
	}

	
	public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.add(12, 54);
	
	}
	
	public static void main(int[] args) {
		Calculator cal = new Calculator();
		
		}
}
