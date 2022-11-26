package testPackage;

import java.util.Scanner;

/*
  for 
  
  while
 
 */
public class LoopDemo {
  public static void main(String[] args) {
	  starPattern4();
}
  public static void starPattern4() {
	  for(int i=1 ; i<=5; i++) {
		  
		  for(int k=1; k<i; k++) {
			  System.out.print(" ");
		  }
		  
		  for(int j=i; j<=5; j++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
  }
	  
  public static void starPattern3() {
	  for(int i=1 ; i<=5; i++) {
		  
		  for(int k=i; k<5; k++) {
			  System.out.print(" ");
		  }
		  
		  for(int j=1; j<=i; j++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  
  }
  public static void starPattern2() {
	  for(int i=1 ; i<=5; i++) {
		  for(int j=1; j<=i; j++) {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
	  
  }
  
  
  public static void starPattern1() {
	  for(int i=1 ; i<=5; i++) {
		  for(int j=1; j<=5; j++) {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
	  
  }
  
  public static void nestedforloop() {
	  //outer for loop is for rows
	  for(int i=1; i<=5; i++) {
		  //inner for loop is for columns
		  for(int j=1; j<=4; j++) {
			  System.out.print(i+" ");
		  }
		  
		  System.out.println();
	  }
  }
  
  public static void whileloop() {
	  /*
	    initialzation;
	    
	    while(condition){
	       code
	       increment/decrement;
	    }
	   */
	  
	  Scanner sc  = new Scanner(System.in);
	  int n = sc.nextInt();
	  int fact=1;
	  
	  int i=1;
	  
	  while(i<=n) {
		  fact=fact*i;
		  i++;
	  }
  }
  
  //program to calculate digit in a number 123456 o/p 6
  
  //program to calculate factorial of 5
  public static void facotrialofanum() {
	  Scanner sc  = new Scanner(System.in);
	  int n = sc.nextInt();
	  int fact=1;
	  for(int i=1; i<=n; i++) {
		  fact=fact*i;
	  }
	  System.out.println(fact);
  }
  
  //print the sum of numbers from 1  to n
  public static void sumofNum() {
	  Scanner sc  = new Scanner(System.in);
	  int n = sc.nextInt();
	  int sum =0;
	  for(int i=1; i<=n; i++) {
		   sum=sum+i;
	  }
	  
	  System.out.println(sum);
  }
  
  public static void foremo() {
	  /*
	    for(intialization; condition; increment/decrement){
	           code
	    }
	   */
	  for(int i=5; i>=1; i--) {
		  System.out.println("Hello Java!!");
	  }
  }
  
}
