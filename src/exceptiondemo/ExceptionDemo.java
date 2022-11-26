package exceptiondemo;

import java.io.File;
import java.io.FileInputStream;
/*
 try{
 
 }catch(Exception ){
 
 }
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		System.out.println("Programm starts");
		int[] num = { 45, 84, 54, 64, };

		try {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally Block");
		}
		

		System.out.println("Programm Ends");
	}

	public void test2() {
		File file = new File("");
	//	FileInputStream fis = new FileInputStream(file);
	}

}
