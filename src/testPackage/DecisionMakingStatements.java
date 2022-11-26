package testPackage;
/*
 if(condition){
 code
 }
 */

import java.util.Scanner;

public class DecisionMakingStatements {
static	Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	daysinmonths();
	}
    
	
	public static void ifdemo() {
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("user is allowed to vote");
		}else {
			System.out.println("Not allowed to vote");
		}
	}
	
	public static void nestedif() {
		System.out.println("enter your age");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("Do you have voter card");
			String ans = sc.next();
			if(ans.toLowerCase().equals("yes")) {
				System.out.println("User allowed to vote");
			}else {
				System.out.println("no vote without votercard");
			}
			
		}else {
			System.out.println("User not allowed to vote");
		}
	}
	
	
	public static void ladderIf() {
		System.out.println("Check Traffic Signal");
		String signal = sc.next();
		
		if(signal.toLowerCase().equals("red")) {
			System.out.println("STOP");
		}else if(signal.toLowerCase().equals("yellow")) {
			System.out.println("READY TO");
		}else if(signal.toLowerCase().equals("green")) {
			System.out.println("GO");
		}else {
			System.out.println("take right decision");
		}
		
	}
	public static void daysinmonths() {
		System.out.println("Enter month name in three character");
		String month = sc.next();
		switch (month.toLowerCase()) {
		case "jan":
		case "mar":
		case "may":
		case "jul":
			System.out.println("31 days");
			break;
		case "feb":
			System.out.println("28 days");
			break;
		case "apr":
			System.out.println("30 days");
			break;
		case "jun":
			System.out.println("30 days");
			break;
		case "aug":
			System.out.println("31 days");
			break;
		case "sep":
			System.out.println("30 days");
			break;
		case "oct":
			System.out.println("31 days");
			break;	
		case "nov":
			System.out.println("30 days");
			break;
		case "dec":
			System.out.println("31 days");
			break;	
			default:
				System.out.println("Invalid input");
				break;
		}
		
	}
	
	public static void swtichCase() {
		/*
		  switch(expression){
		  
		 */
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter operation of choice + / * - % ");
		char ch = sc.next().charAt(0);
		
		int result=0;
		switch (ch) {
		case '+':
			result= a+b;
			break;
		case '*':
			result= a*b;
			break;	
		case '-':
			result= a-b;
			break;
		case '/':
			result= a/b;
			break;
		case '%':
			result= a%b;
			break;	
		default:
			System.out.println("Invalid input");
			break;
			
			
		}
		
		System.out.println(result);
		
		
		
	}
}
