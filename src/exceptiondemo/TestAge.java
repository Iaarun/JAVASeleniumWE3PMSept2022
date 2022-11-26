package exceptiondemo;

public class TestAge {
	
	public void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("InvalidAgeException");
		}else {
			System.out.println("Valid age");
		}
	}

	
	public static void main(String[] args) throws InvalidAgeException {
		TestAge age = new TestAge();
		
		age.validateAge(17);
	}
}
