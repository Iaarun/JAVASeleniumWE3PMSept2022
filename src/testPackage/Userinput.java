package testPackage;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		userInput();
	}

	public static void add() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter first Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		double b = sc.nextDouble();
		System.out.println("Multiplication of "+a+" and "+ b +" is "+(a * b));
	}
	
	public static void userInput() {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter you name");
		String name = sc.next();
		
		System.out.println("Say true or false");
		boolean b = sc.nextBoolean();
		
		
		System.out.println("Enter any character");
		char ch = sc.next().charAt(1);
		
		System.out.println(name);
		System.out.println(b);
		System.out.println(ch);
		
		
	}
}
