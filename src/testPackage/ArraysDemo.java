package testPackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

	//WAP to create an arrays of size provided by user 
	//and store data by taking input from user
	
	//WAP to calculate the sum of element in array
	public static void main(String[] args) {
		arrayrevers();
	}
	
	public static void arrayrevers() {
		int[] arr = {501,32,1001,84,105}; //op = [105,84,1001,32,501]
		
		int start = 0;
		int last = arr.length-1;
		int temp=0;
		
		while(start<last) {
			temp = arr[start];
			arr[start]= arr[last];
			arr[last]=temp;
			start++;
			last--;
		}
		
	System.out.println(Arrays.toString(arr));
		
	}
	
	public static void twoDarray() {
		int [][]arr= new int[3][4];
		
		System.out.println(arr.length); //3 rows
		System.out.println(arr[0].length);//4 columns
		
		arr[0][0]=45;
		arr[1][0]=84;
	}
	
	public static void findMinmaxfromArrays() {
		int[] arr = {501,32,1001,84,105};
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
		}
		
		System.out.println("Maximum "+max);
		
	}
	
	public static void customeArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter "+size+" value in array");
		 
		for(int i=0; i<size; i++) {
			arr[i]= sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<size; i++) {
			sum = sum+arr[i];
			
		}
		
		System.out.println(sum);
	}

	public static void createArray() {
		int num[] = new int[5];
		char[] ch = new char[5];
		String[] st = new String[10];
		System.out.println(num);

		num[0] = 100;
		num[1] = 101;
		num[2] = 102;
		num[3] = 103;
		num[4] = 100;
		System.out.println(num[3]);

		System.out.println(num.length);
		System.out.println(num[num.length - 1]);

		int[] newarr = num.clone();
		System.out.println(newarr.equals(num));
		//iterate over array
		for(int i=0; i<=newarr.length-1; i++) {
			System.out.println(newarr[i]);
		}

	}

}
