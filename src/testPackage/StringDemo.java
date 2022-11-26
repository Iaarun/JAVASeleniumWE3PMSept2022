package testPackage;

import java.util.Arrays;

public class StringDemo {
	
	
	public static void main(String[] args) {
		createString();
	}
	
	public static void createString() {
		//using String literals
		String name = "Java";
		String name1 ="Java";
		
		//using new keyword
		String str = new String("Java");
		String str1 = new String("Java");
		
		if(str==name) {
			System.out.println("same add");
		}else {
			System.out.println("different add");
		}
		
		 name = name.concat(" Test");
		System.out.println(name);
		
	  System.out.println(name.length());
	  System.out.println(name.toUpperCase());
	  System.out.println(name.toLowerCase());
//	  System.out.println(name.equals(str));
	  
	   str = new String("Java Test");
	str1 = new String("JAVA");
	
	System.out.println(str.equals(str1));
	System.out.println(str.equalsIgnoreCase(str1));
	System.out.println(str.compareTo(str1));
	System.out.println(str.compareToIgnoreCase(str1));
	System.out.println(str.charAt(2));
	
	System.out.println(str.contains("av"));	 
	System.out.println(str.endsWith("Jav"));
	
	 char[]arr= str.toCharArray();
	 System.out.println(Arrays.toString(arr));
	 
	 System.out.println(str.indexOf("a"));
	 System.out.println(str.lastIndexOf("a"));
	 
	 System.out.println(str.replace("Java", "Python"));
	 
	 String[] starr= str.split("a");
	 
	 for(int i=0; i<starr.length; i++) {
		 System.out.println(starr[i]);
	 }
	 str = new String("Java Test");
	System.out.println(str.substring(2,6));
	
	 String email="xyzemail@gmail.com" ; //xyzemail
	 System.out.println(email.substring(0, email.indexOf("@")));
	}
	
	

}
