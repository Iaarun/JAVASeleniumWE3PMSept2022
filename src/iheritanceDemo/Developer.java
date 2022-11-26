package iheritanceDemo;
/*
 class which extends another class
   Sub class
   Derived class
   Child class
   
 class which is extended by another class 
   Super class
   Base class
   Parent class 
 */
public class Developer extends Employee {
	
	int leaves;
	
	
public static void main(String[] args) {
	Developer d1 = new Developer();
	
	d1.salary = 500000;
	d1.leaves = 24;
	
	System.out.println(d1.salary);
	System.out.println(d1.leaves);
	
	
}

}
